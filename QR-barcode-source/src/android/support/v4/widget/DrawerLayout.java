// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            ViewDragHelper

public class DrawerLayout extends ViewGroup
{
    class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        private final Rect mTmpRect = new Rect();
        final DrawerLayout this$0;

        private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
            Rect rect = mTmpRect;
            accessibilitynodeinfocompat1.getBoundsInParent(rect);
            accessibilitynodeinfocompat.setBoundsInParent(rect);
            accessibilitynodeinfocompat1.getBoundsInScreen(rect);
            accessibilitynodeinfocompat.setBoundsInScreen(rect);
            accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
            accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
            accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
            accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
            accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
            accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
            accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
            accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
            accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
            accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
            accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
            accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
        }

        public boolean filter(View view)
        {
            View view1 = findOpenDrawer();
            return view1 != null && view1 != view;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat.setSource(view);
            view = ViewCompat.getParentForAccessibility(view);
            if (view instanceof View)
            {
                accessibilitynodeinfocompat.setParent((View)view);
            }
            copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
            accessibilitynodeinfocompat1.recycle();
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                view = getChildAt(i);
                if (!filter(view))
                {
                    accessibilitynodeinfocompat.addChild(view);
                }
            }

        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (!filter(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        AccessibilityDelegate()
        {
            this$0 = DrawerLayout.this;
            super();
        }
    }

    public static interface DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f);

        public abstract void onDrawerStateChanged(int i);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int gravity;
        boolean isPeeking;
        boolean knownOpen;
        float onScreen;

        public LayoutParams(int i, int j)
        {
            super(i, j);
            gravity = 0;
        }

        public LayoutParams(int i, int j, int k)
        {
            this(i, j);
            gravity = k;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gravity = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS);
            gravity = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
            gravity = layoutparams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            gravity = 0;
        }
    }

    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int lockModeLeft;
        int lockModeRight;
        int openDrawerGravity;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(openDrawerGravity);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            openDrawerGravity = 0;
            lockModeLeft = 0;
            lockModeRight = 0;
            openDrawerGravity = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            openDrawerGravity = 0;
            lockModeLeft = 0;
            lockModeRight = 0;
        }
    }

    public static abstract class SimpleDrawerListener
        implements DrawerListener
    {

        public void onDrawerClosed(View view)
        {
        }

        public void onDrawerOpened(View view)
        {
        }

        public void onDrawerSlide(View view, float f)
        {
        }

        public void onDrawerStateChanged(int i)
        {
        }

        public SimpleDrawerListener()
        {
        }
    }

    private class ViewDragCallback extends ViewDragHelper.Callback
    {

        private ViewDragHelper mDragger;
        private final int mGravity;
        private final Runnable mPeekRunnable = new _cls1();
        final DrawerLayout this$0;

        private void closeOtherDrawer()
        {
            byte byte0 = 3;
            if (mGravity == 3)
            {
                byte0 = 5;
            }
            View view = findDrawerWithGravity(byte0);
            if (view != null)
            {
                closeDrawer(view);
            }
        }

        private void peekDrawer()
        {
            int i = 0;
            int j = mDragger.getEdgeSize();
            View view;
            boolean flag;
            if (mGravity == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = findDrawerWithGravity(3);
                if (view != null)
                {
                    i = -view.getWidth();
                }
                i += j;
            } else
            {
                view = findDrawerWithGravity(5);
                i = getWidth() - j;
            }
            if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                mDragger.smoothSlideViewTo(view, i, view.getTop());
                layoutparams.isPeeking = true;
                invalidate();
                closeOtherDrawer();
                cancelChildViewTouch();
            }
        }

        public int clampViewPositionHorizontal(View view, int i, int j)
        {
            if (checkDrawerViewGravity(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            } else
            {
                j = getWidth();
                return Math.max(j - view.getWidth(), Math.min(i, j));
            }
        }

        public int clampViewPositionVertical(View view, int i, int j)
        {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view)
        {
            return view.getWidth();
        }

        public void onEdgeDragStarted(int i, int j)
        {
            View view;
            if ((i & 1) == 1)
            {
                view = findDrawerWithGravity(3);
            } else
            {
                view = findDrawerWithGravity(5);
            }
            if (view != null && getDrawerLockMode(view) == 0)
            {
                mDragger.captureChildView(view, j);
            }
        }

        public boolean onEdgeLock(int i)
        {
            return false;
        }

        public void onEdgeTouched(int i, int j)
        {
            postDelayed(mPeekRunnable, 160L);
        }

        public void onViewCaptured(View view, int i)
        {
            ((LayoutParams)view.getLayoutParams()).isPeeking = false;
            closeOtherDrawer();
        }

        public void onViewDragStateChanged(int i)
        {
            updateDrawerState(mGravity, i, mDragger.getCapturedView());
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            j = view.getWidth();
            float f;
            if (checkDrawerViewGravity(view, 3))
            {
                f = (float)(j + i) / (float)j;
            } else
            {
                f = (float)(getWidth() - i) / (float)j;
            }
            setDrawerViewOffset(view, f);
            if (f == 0.0F)
            {
                i = 4;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
            invalidate();
        }

        public void onViewReleased(View view, float f, float f1)
        {
            int j;
            f1 = getDrawerViewOffset(view);
            j = view.getWidth();
            if (!checkDrawerViewGravity(view, 3)) goto _L2; else goto _L1
_L1:
            int i;
            if (f > 0.0F || f == 0.0F && f1 > 0.5F)
            {
                i = 0;
            } else
            {
                i = -j;
            }
_L4:
            mDragger.settleCapturedViewAt(i, view.getTop());
            invalidate();
            return;
_L2:
            i = getWidth();
            if (f < 0.0F || f == 0.0F && f1 < 0.5F)
            {
                i -= j;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void removeCallbacks()
        {
            DrawerLayout.this.removeCallbacks(mPeekRunnable);
        }

        public void setDragger(ViewDragHelper viewdraghelper)
        {
            mDragger = viewdraghelper;
        }

        public boolean tryCaptureView(View view, int i)
        {
            return isDrawerView(view) && checkDrawerViewGravity(view, mGravity) && getDrawerLockMode(view) == 0;
        }


        public ViewDragCallback(int i)
        {
            this$0 = DrawerLayout.this;
            super();
            mGravity = i;
        }
    }


    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
    private static final int LAYOUT_ATTRS[] = {
        0x10100b3
    };
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1F;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private final ViewDragCallback mLeftCallback;
    private final ViewDragHelper mLeftDragger;
    private DrawerListener mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowLeft;
    private Drawable mShadowRight;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mScrimColor = 0x99000000;
        mScrimPaint = new Paint();
        mFirstLayout = true;
        float f = getResources().getDisplayMetrics().density;
        mMinDrawerMargin = (int)(64F * f + 0.5F);
        f = 400F * f;
        mLeftCallback = new ViewDragCallback(3);
        mRightCallback = new ViewDragCallback(5);
        mLeftDragger = ViewDragHelper.create(this, 1.0F, mLeftCallback);
        mLeftDragger.setEdgeTrackingEnabled(1);
        mLeftDragger.setMinVelocity(f);
        mLeftCallback.setDragger(mLeftDragger);
        mRightDragger = ViewDragHelper.create(this, 1.0F, mRightCallback);
        mRightDragger.setEdgeTrackingEnabled(2);
        mRightDragger.setMinVelocity(f);
        mRightCallback.setDragger(mRightDragger);
        setFocusableInTouchMode(true);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
    }

    private View findVisibleDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (isDrawerView(view) && isDrawerVisible(view))
            {
                return view;
            }
        }

        return null;
    }

    static String gravityToString(int i)
    {
        if ((i & 3) == 3)
        {
            return "LEFT";
        }
        if ((i & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i);
        }
    }

    private static boolean hasOpaqueBackground(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean hasPeekingDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            if (((LayoutParams)getChildAt(i).getLayoutParams()).isPeeking)
            {
                return true;
            }
        }

        return false;
    }

    private boolean hasVisibleDrawer()
    {
        return findVisibleDrawer() != null;
    }

    void cancelChildViewTouch()
    {
        if (!mChildrenCanceledTouch)
        {
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            int j = getChildCount();
            for (int i = 0; i < j; i++)
            {
                getChildAt(i).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            mChildrenCanceledTouch = true;
        }
    }

    boolean checkDrawerViewGravity(View view, int i)
    {
        return (getDrawerViewGravity(view) & i) == i;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void closeDrawer(int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with absolute gravity ").append(gravityToString(i)).toString());
        } else
        {
            closeDrawer(view);
            return;
        }
    }

    public void closeDrawer(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.onScreen = 0.0F;
            view.knownOpen = false;
        } else
        if (checkDrawerViewGravity(view, 3))
        {
            mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
        } else
        {
            mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public void closeDrawers()
    {
        closeDrawers(false);
    }

    void closeDrawers(boolean flag)
    {
        boolean flag1 = false;
        int k = getChildCount();
        int i = 0;
        while (i < k) 
        {
            View view = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int j = ((flag1) ? 1 : 0);
            if (isDrawerView(view))
            {
                if (flag && !layoutparams.isPeeking)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = view.getWidth();
                    if (checkDrawerViewGravity(view, 3))
                    {
                        flag1 |= mLeftDragger.smoothSlideViewTo(view, -j, view.getTop());
                    } else
                    {
                        flag1 |= mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
                    }
                    layoutparams.isPeeking = false;
                    j = ((flag1) ? 1 : 0);
                }
            }
            i++;
            flag1 = j;
        }
        mLeftCallback.removeCallbacks();
        mRightCallback.removeCallbacks();
        if (flag1)
        {
            invalidate();
        }
    }

    public void computeScroll()
    {
        int j = getChildCount();
        float f = 0.0F;
        for (int i = 0; i < j; i++)
        {
            f = Math.max(f, ((LayoutParams)getChildAt(i).getLayoutParams()).onScreen);
        }

        mScrimOpacity = f;
        if (mLeftDragger.continueSettling(true) | mRightDragger.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    void dispatchOnDrawerClosed(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.knownOpen)
        {
            layoutparams.knownOpen = false;
            if (mListener != null)
            {
                mListener.onDrawerClosed(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    void dispatchOnDrawerOpened(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.knownOpen)
        {
            layoutparams.knownOpen = true;
            if (mListener != null)
            {
                mListener.onDrawerOpened(view);
            }
            view.sendAccessibilityEvent(32);
        }
    }

    void dispatchOnDrawerSlide(View view, float f)
    {
        if (mListener != null)
        {
            mListener.onDrawerSlide(view, f);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        int j4 = getHeight();
        boolean flag1 = isContentView(view);
        int i = 0;
        boolean flag = false;
        int i1 = getWidth();
        int k4 = canvas.save();
        int i2 = i1;
        if (flag1)
        {
            int l4 = getChildCount();
            i2 = 0;
            i = ((flag) ? 1 : 0);
            while (i2 < l4) 
            {
                View view1 = getChildAt(i2);
                int l2 = i;
                int k3 = i1;
                if (view1 != view)
                {
                    l2 = i;
                    k3 = i1;
                    if (view1.getVisibility() == 0)
                    {
                        l2 = i;
                        k3 = i1;
                        if (hasOpaqueBackground(view1))
                        {
                            l2 = i;
                            k3 = i1;
                            if (isDrawerView(view1))
                            {
                                if (view1.getHeight() < j4)
                                {
                                    k3 = i1;
                                    l2 = i;
                                } else
                                if (checkDrawerViewGravity(view1, 3))
                                {
                                    int l3 = view1.getRight();
                                    l2 = i;
                                    k3 = i1;
                                    if (l3 > i)
                                    {
                                        l2 = l3;
                                        k3 = i1;
                                    }
                                } else
                                {
                                    int i4 = view1.getLeft();
                                    l2 = i;
                                    k3 = i1;
                                    if (i4 < i1)
                                    {
                                        k3 = i4;
                                        l2 = i;
                                    }
                                }
                            }
                        }
                    }
                }
                i2++;
                i = l2;
                i1 = k3;
            }
            canvas.clipRect(i, 0, i1, getHeight());
            i2 = i1;
        }
        boolean flag2 = super.drawChild(canvas, view, l);
        canvas.restoreToCount(k4);
        if (mScrimOpacity > 0.0F && flag1)
        {
            int j1 = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
            int i3 = mScrimColor;
            mScrimPaint.setColor(j1 << 24 | i3 & 0xffffff);
            canvas.drawRect(i, 0.0F, i2, getHeight(), mScrimPaint);
        } else
        {
            if (mShadowLeft != null && checkDrawerViewGravity(view, 3))
            {
                int j = mShadowLeft.getIntrinsicWidth();
                int k1 = view.getRight();
                int j2 = mLeftDragger.getEdgeSize();
                float f = Math.max(0.0F, Math.min((float)k1 / (float)j2, 1.0F));
                mShadowLeft.setBounds(k1, view.getTop(), k1 + j, view.getBottom());
                mShadowLeft.setAlpha((int)(255F * f));
                mShadowLeft.draw(canvas);
                return flag2;
            }
            if (mShadowRight != null && checkDrawerViewGravity(view, 5))
            {
                int k = mShadowRight.getIntrinsicWidth();
                int l1 = view.getLeft();
                int k2 = getWidth();
                int j3 = mRightDragger.getEdgeSize();
                float f1 = Math.max(0.0F, Math.min((float)(k2 - l1) / (float)j3, 1.0F));
                mShadowRight.setBounds(l1 - k, view.getTop(), l1, view.getBottom());
                mShadowRight.setAlpha((int)(255F * f1));
                mShadowRight.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    View findDrawerWithGravity(int i)
    {
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            View view = getChildAt(j);
            if ((getDrawerViewGravity(view) & 7) == (i & 7))
            {
                return view;
            }
        }

        return null;
    }

    View findOpenDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (((LayoutParams)view.getLayoutParams()).knownOpen)
            {
                return view;
            }
        }

        return null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getDrawerLockMode(int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (i == 3)
        {
            return mLockModeLeft;
        }
        if (i == 5)
        {
            return mLockModeRight;
        } else
        {
            return 0;
        }
    }

    public int getDrawerLockMode(View view)
    {
        int i = getDrawerViewGravity(view);
        if (i == 3)
        {
            return mLockModeLeft;
        }
        if (i == 5)
        {
            return mLockModeRight;
        } else
        {
            return 0;
        }
    }

    int getDrawerViewGravity(View view)
    {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
    }

    float getDrawerViewOffset(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).onScreen;
    }

    boolean isContentView(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).gravity == 0;
    }

    public boolean isDrawerOpen(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view != null)
        {
            return isDrawerOpen(view);
        } else
        {
            return false;
        }
    }

    public boolean isDrawerOpen(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).knownOpen;
        }
    }

    boolean isDrawerView(View view)
    {
        return (GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view)) & 7) != 0;
    }

    public boolean isDrawerVisible(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view != null)
        {
            return isDrawerVisible(view);
        } else
        {
            return false;
        }
    }

    public boolean isDrawerVisible(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
    }

    void moveDrawerToOffset(View view, float f)
    {
        float f1 = getDrawerViewOffset(view);
        int i = view.getWidth();
        int j = (int)((float)i * f1);
        i = (int)((float)i * f) - j;
        if (!checkDrawerViewGravity(view, 3))
        {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mFirstLayout = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag3 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        flag4 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
        flag5 = mRightDragger.shouldInterceptTouchEvent(motionevent);
        flag2 = false;
        flag1 = false;
        i;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 105
    //                   1 212
    //                   2 176
    //                   3 212;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = flag1;
_L6:
        if (flag4 | flag5 || flag || hasPeekingDrawer() || mChildrenCanceledTouch)
        {
            flag3 = true;
        }
        return flag3;
_L2:
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f1;
        flag = flag2;
        if (mScrimOpacity > 0.0F)
        {
            flag = flag2;
            if (isContentView(mLeftDragger.findTopChildUnder((int)f, (int)f1)))
            {
                flag = true;
            }
        }
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = flag1;
        if (mLeftDragger.checkTouchSlop(3))
        {
            mLeftCallback.removeCallbacks();
            mRightCallback.removeCallbacks();
            flag = flag1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && hasVisibleDrawer())
        {
            KeyEventCompat.startTracking(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            keyevent = findVisibleDrawer();
            if (keyevent != null && getDrawerLockMode(keyevent) == 0)
            {
                closeDrawers();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int k1;
        int l1;
        mInLayout = true;
        k1 = k - i;
        l1 = getChildCount();
        k = 0;
_L2:
        View view;
        if (k >= l1)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        view = getChildAt(k);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        LayoutParams layoutparams;
label0:
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!isContentView(view))
            {
                break label0;
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
          goto _L3
        int i1;
        int i2;
        int j2;
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        float f;
        boolean flag1;
        if (checkDrawerViewGravity(view, 3))
        {
            i1 = -i2 + (int)((float)i2 * layoutparams.onScreen);
            f = (float)(i2 + i1) / (float)i2;
        } else
        {
            i1 = k1 - (int)((float)i2 * layoutparams.onScreen);
            f = (float)(k1 - i1) / (float)i2;
        }
        if (f != layoutparams.onScreen)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.gravity & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 350
    //                   80: 310;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_350;
_L4:
        view.layout(i1, layoutparams.topMargin, i1 + i2, j2);
_L7:
        if (flag1)
        {
            setDrawerViewOffset(view, f);
        }
        int j1;
        int k2;
        if (layoutparams.onScreen > 0.0F)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        if (view.getVisibility() != i)
        {
            view.setVisibility(i);
        }
          goto _L3
_L6:
        i = l - j;
        view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i1 + i2, i - layoutparams.bottomMargin);
          goto _L7
        k2 = l - j;
        j1 = (k2 - j2) / 2;
        if (j1 < layoutparams.topMargin)
        {
            i = layoutparams.topMargin;
        } else
        {
            i = j1;
            if (j1 + j2 > k2 - layoutparams.bottomMargin)
            {
                i = k2 - layoutparams.bottomMargin - j2;
            }
        }
        view.layout(i1, i, i1 + i2, i + j2);
          goto _L7
        mInLayout = false;
        mFirstLayout = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int j1;
        int k1;
        int i2;
        i2 = android.view.View.MeasureSpec.getMode(i);
        k1 = android.view.View.MeasureSpec.getMode(j);
        k = android.view.View.MeasureSpec.getSize(i);
        j1 = android.view.View.MeasureSpec.getSize(j);
        if (i2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        l = j1;
        i1 = k;
        if (k1 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (i2 != 0x80000000 && i2 == 0)
        {
            k = 300;
        }
        if (k1 == 0x80000000)
        {
            i1 = k;
            l = j1;
        } else
        {
            l = j1;
            i1 = k;
            if (k1 == 0)
            {
                l = 300;
                i1 = k;
            }
        }
_L3:
        setMeasuredDimension(i1, l);
        j1 = getChildCount();
        k = 0;
        while (k < j1) 
        {
            View view = getChildAt(k);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (isContentView(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (isDrawerView(view))
                {
                    int l1 = getDrawerViewGravity(view) & 7;
                    if ((0 & l1) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(gravityToString(l1)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(k).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            k++;
        }
        break MISSING_BLOCK_LABEL_424;
_L5:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        return;
        if (true) goto _L3; else goto _L6
_L6:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).openDrawerGravity != 0)
        {
            View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
            if (view != null)
            {
                openDrawer(view);
            }
        }
        setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
        setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate;
        int i;
        int j;
        savedstate = new SavedState(super.onSaveInstanceState());
        j = getChildCount();
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = getChildAt(i);
        if (isDrawerView(((View) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!((LayoutParams) (obj = (LayoutParams)((View) (obj)).getLayoutParams())).knownOpen) goto _L4; else goto _L3
_L3:
        savedstate.openDrawerGravity = ((LayoutParams) (obj)).gravity;
        savedstate.lockModeLeft = mLockModeLeft;
        savedstate.lockModeRight = mLockModeRight;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mLeftDragger.processTouchEvent(motionevent);
        mRightDragger.processTouchEvent(motionevent);
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            return true;

        case 0: // '\0'
            float f = motionevent.getX();
            float f2 = motionevent.getY();
            mInitialMotionX = f;
            mInitialMotionY = f2;
            mDisallowInterceptRequested = false;
            mChildrenCanceledTouch = false;
            return true;

        case 1: // '\001'
            float f3 = motionevent.getX();
            float f1 = motionevent.getY();
            boolean flag1 = true;
            motionevent = mLeftDragger.findTopChildUnder((int)f3, (int)f1);
            boolean flag = flag1;
            if (motionevent != null)
            {
                flag = flag1;
                if (isContentView(motionevent))
                {
                    f3 -= mInitialMotionX;
                    f1 -= mInitialMotionY;
                    int i = mLeftDragger.getTouchSlop();
                    flag = flag1;
                    if (f3 * f3 + f1 * f1 < (float)(i * i))
                    {
                        motionevent = findOpenDrawer();
                        flag = flag1;
                        if (motionevent != null)
                        {
                            if (getDrawerLockMode(motionevent) == 2)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
            }
            closeDrawers(flag);
            mDisallowInterceptRequested = false;
            return true;

        case 3: // '\003'
            closeDrawers(true);
            mDisallowInterceptRequested = false;
            mChildrenCanceledTouch = false;
            return true;
        }
    }

    public void openDrawer(int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with absolute gravity ").append(gravityToString(i)).toString());
        } else
        {
            openDrawer(view);
            return;
        }
    }

    public void openDrawer(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.onScreen = 1.0F;
            view.knownOpen = true;
        } else
        if (checkDrawerViewGravity(view, 3))
        {
            mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
        } else
        {
            mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        mDisallowInterceptRequested = flag;
        if (flag)
        {
            closeDrawers(true);
        }
    }

    public void requestLayout()
    {
        if (!mInLayout)
        {
            super.requestLayout();
        }
    }

    public void setDrawerListener(DrawerListener drawerlistener)
    {
        mListener = drawerlistener;
    }

    public void setDrawerLockMode(int i)
    {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int j)
    {
        j = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(this));
        if (j == 3)
        {
            mLockModeLeft = i;
        } else
        if (j == 5)
        {
            mLockModeRight = i;
        }
        if (i != 0)
        {
            ViewDragHelper viewdraghelper;
            if (j == 3)
            {
                viewdraghelper = mLeftDragger;
            } else
            {
                viewdraghelper = mRightDragger;
            }
            viewdraghelper.cancel();
        }
        i;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = findDrawerWithGravity(j)) != null)
        {
            openDrawer(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = findDrawerWithGravity(j)) != null)
        {
            closeDrawer(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setDrawerLockMode(int i, View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a ").append("drawer with appropriate layout_gravity").toString());
        } else
        {
            setDrawerLockMode(i, getDrawerViewGravity(view));
            return;
        }
    }

    public void setDrawerShadow(int i, int j)
    {
        setDrawerShadow(getResources().getDrawable(i), j);
    }

    public void setDrawerShadow(Drawable drawable, int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if ((i & 3) == 3)
        {
            mShadowLeft = drawable;
            invalidate();
        }
        if ((i & 5) == 5)
        {
            mShadowRight = drawable;
            invalidate();
        }
    }

    void setDrawerViewOffset(View view, float f)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f == layoutparams.onScreen)
        {
            return;
        } else
        {
            layoutparams.onScreen = f;
            dispatchOnDrawerSlide(view, f);
            return;
        }
    }

    public void setScrimColor(int i)
    {
        mScrimColor = i;
        invalidate();
    }

    void updateDrawerState(int i, int j, View view)
    {
        LayoutParams layoutparams;
        i = mLeftDragger.getViewDragState();
        int k = mRightDragger.getViewDragState();
        if (i == 1 || k == 1)
        {
            i = 1;
        } else
        if (i == 2 || k == 2)
        {
            i = 2;
        } else
        {
            i = 0;
        }
        if (view == null || j != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.onScreen != 0.0F) goto _L4; else goto _L3
_L3:
        dispatchOnDrawerClosed(view);
_L2:
        if (i != mDrawerState)
        {
            mDrawerState = i;
            if (mListener != null)
            {
                mListener.onDrawerStateChanged(i);
            }
        }
        return;
_L4:
        if (layoutparams.onScreen == 1.0F)
        {
            dispatchOnDrawerOpened(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }



    // Unreferenced inner class android/support/v4/widget/DrawerLayout$ViewDragCallback$1

/* anonymous class */
    class ViewDragCallback._cls1
        implements Runnable
    {

        final ViewDragCallback this$1;

        public void run()
        {
            peekDrawer();
        }

            
            {
                this$1 = ViewDragCallback.this;
                super();
            }
    }

}
