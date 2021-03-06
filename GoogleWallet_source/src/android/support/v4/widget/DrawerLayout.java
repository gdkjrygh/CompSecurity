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
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
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
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayoutImpl, ViewDragHelper, DrawerLayoutCompatApi21

public class DrawerLayout extends ViewGroup
    implements DrawerLayoutImpl
{
    final class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        private final Rect mTmpRect = new Rect();
        final DrawerLayout this$0;

        private static void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
        {
            int j = viewgroup.getChildCount();
            for (int i = 0; i < j; i++)
            {
                View view = viewgroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(view))
                {
                    accessibilitynodeinfocompat.addChild(view);
                }
            }

        }

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

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = findVisibleDrawer();
                if (accessibilityevent != null)
                {
                    int i = getDrawerViewAbsoluteGravity(accessibilityevent);
                    accessibilityevent = getDrawerTitle(i);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
            }
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS)
            {
                super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            } else
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
                super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat.setSource(view);
                android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
                if (viewparent instanceof View)
                {
                    accessibilitynodeinfocompat.setParent((View)viewparent);
                }
                copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat1.recycle();
                addChildrenForAccessibility(accessibilitynodeinfocompat, (ViewGroup)view);
            }
            accessibilitynodeinfocompat.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view))
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

    final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final DrawerLayout this$0;

        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
            if (!DrawerLayout.includeChildForAccessibility(view))
            {
                accessibilitynodeinfocompat.setParent(null);
            }
        }

        ChildAccessibilityDelegate()
        {
            this$0 = DrawerLayout.this;
            super();
        }
    }

    static interface DrawerLayoutCompatImpl
    {

        public abstract void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i);

        public abstract void configureApplyInsets(View view);

        public abstract void dispatchChildInsets(View view, Object obj, int i);

        public abstract int getTopInset(Object obj);
    }

    static final class DrawerLayoutCompatImplApi21
        implements DrawerLayoutCompatImpl
    {

        public final void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
            DrawerLayoutCompatApi21.applyMarginInsets(marginlayoutparams, obj, i);
        }

        public final void configureApplyInsets(View view)
        {
            DrawerLayoutCompatApi21.configureApplyInsets(view);
        }

        public final void dispatchChildInsets(View view, Object obj, int i)
        {
            DrawerLayoutCompatApi21.dispatchChildInsets(view, obj, i);
        }

        public final int getTopInset(Object obj)
        {
            return DrawerLayoutCompatApi21.getTopInset(obj);
        }

        DrawerLayoutCompatImplApi21()
        {
        }
    }

    static final class DrawerLayoutCompatImplBase
        implements DrawerLayoutCompatImpl
    {

        public final void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
        }

        public final void configureApplyInsets(View view)
        {
        }

        public final void dispatchChildInsets(View view, Object obj, int i)
        {
        }

        public final int getTopInset(Object obj)
        {
            return 0;
        }

        DrawerLayoutCompatImplBase()
        {
        }
    }

    public static interface DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f);
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

    public static final class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            private static SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            private static SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int lockModeLeft;
        int lockModeRight;
        int openDrawerGravity;

        public final void writeToParcel(Parcel parcel, int i)
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

    final class ViewDragCallback extends ViewDragHelper.Callback
    {

        private final int mAbsGravity;
        private ViewDragHelper mDragger;
        private final Runnable mPeekRunnable = new _cls1();
        final DrawerLayout this$0;

        private void closeOtherDrawer()
        {
            byte byte0 = 3;
            if (mAbsGravity == 3)
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
            if (mAbsGravity == 3)
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

        public final int clampViewPositionHorizontal(View view, int i, int j)
        {
            if (checkDrawerViewAbsoluteGravity(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            } else
            {
                j = getWidth();
                return Math.max(j - view.getWidth(), Math.min(i, j));
            }
        }

        public final int clampViewPositionVertical(View view, int i, int j)
        {
            return view.getTop();
        }

        public final int getViewHorizontalDragRange(View view)
        {
            if (isDrawerView(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public final void onEdgeDragStarted(int i, int j)
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

        public final boolean onEdgeLock(int i)
        {
            return false;
        }

        public final void onEdgeTouched(int i, int j)
        {
            postDelayed(mPeekRunnable, 160L);
        }

        public final void onViewCaptured(View view, int i)
        {
            ((LayoutParams)view.getLayoutParams()).isPeeking = false;
            closeOtherDrawer();
        }

        public final void onViewDragStateChanged(int i)
        {
            updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
        }

        public final void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            j = view.getWidth();
            float f;
            if (checkDrawerViewAbsoluteGravity(view, 3))
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

        public final void onViewReleased(View view, float f, float f1)
        {
            int j;
            f1 = getDrawerViewOffset(view);
            j = view.getWidth();
            if (!checkDrawerViewAbsoluteGravity(view, 3)) goto _L2; else goto _L1
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
            if (f < 0.0F || f == 0.0F && f1 > 0.5F)
            {
                i -= j;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void removeCallbacks()
        {
            DrawerLayout.this.removeCallbacks(mPeekRunnable);
        }

        public final void setDragger(ViewDragHelper viewdraghelper)
        {
            mDragger = viewdraghelper;
        }

        public final boolean tryCaptureView(View view, int i)
        {
            return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
        }


        public ViewDragCallback(int i)
        {
            this$0 = DrawerLayout.this;
            super();
            mAbsGravity = i;
        }
    }


    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
    static final DrawerLayoutCompatImpl IMPL;
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
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
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
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

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
        mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
        mScrimColor = 0x99000000;
        mScrimPaint = new Paint();
        mFirstLayout = true;
        setDescendantFocusability(0x40000);
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
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
        if (ViewCompat.getFitsSystemWindows(this))
        {
            IMPL.configureApplyInsets(this);
        }
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

    private static boolean includeChildForAccessibility(View view)
    {
        return ViewCompat.getImportantForAccessibility(view) != 4 && ViewCompat.getImportantForAccessibility(view) != 2;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean flag)
    {
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = getChildAt(i);
            if (!flag && !isDrawerView(view1) || flag && view1 == view)
            {
                ViewCompat.setImportantForAccessibility(view1, 1);
            } else
            {
                ViewCompat.setImportantForAccessibility(view1, 4);
            }
            i++;
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        if (findOpenDrawer() != null || isDrawerView(view))
        {
            ViewCompat.setImportantForAccessibility(view, 4);
        } else
        {
            ViewCompat.setImportantForAccessibility(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS)
        {
            ViewCompat.setAccessibilityDelegate(view, mChildAccessibilityDelegate);
        }
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

    boolean checkDrawerViewAbsoluteGravity(View view, int i)
    {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void closeDrawer(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(gravityToString(i)).toString());
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
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.onScreen = 0.0F;
            view.knownOpen = false;
        } else
        if (checkDrawerViewAbsoluteGravity(view, 3))
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
        int i = 0;
        int l = getChildCount();
        int j = 0;
        while (j < l) 
        {
label0:
            {
                View view = getChildAt(j);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k = i;
                if (!isDrawerView(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k = i;
                    if (!layoutparams.isPeeking)
                    {
                        break label0;
                    }
                }
                k = view.getWidth();
                if (checkDrawerViewAbsoluteGravity(view, 3))
                {
                    i |= mLeftDragger.smoothSlideViewTo(view, -k, view.getTop());
                } else
                {
                    i |= mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
                }
                layoutparams.isPeeking = false;
                k = i;
            }
            j++;
            i = k;
        }
        mLeftCallback.removeCallbacks();
        mRightCallback.removeCallbacks();
        if (i != 0)
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
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
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
            updateChildrenImportantForAccessibility(view, true);
            view.requestFocus();
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
                                l2 = i;
                                k3 = i1;
                                if (view1.getHeight() >= j4)
                                {
                                    if (checkDrawerViewAbsoluteGravity(view1, 3))
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
            if (mShadowLeft != null && checkDrawerViewAbsoluteGravity(view, 3))
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
            if (mShadowRight != null && checkDrawerViewAbsoluteGravity(view, 5))
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
        int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        int k = getChildCount();
        for (i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if ((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
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
        int i = getDrawerViewAbsoluteGravity(view);
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

    public CharSequence getDrawerTitle(int i)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (i == 3)
        {
            return mTitleLeft;
        }
        if (i == 5)
        {
            return mTitleRight;
        } else
        {
            return null;
        }
    }

    int getDrawerViewAbsoluteGravity(View view)
    {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(this));
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
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
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
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
    }

    void moveDrawerToOffset(View view, float f)
    {
        float f1 = getDrawerViewOffset(view);
        int i = view.getWidth();
        int j = (int)((float)i * f1);
        i = (int)((float)i * f) - j;
        if (!checkDrawerViewAbsoluteGravity(view, 3))
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

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mDrawStatusBarBackground && mStatusBarBackground != null)
        {
            int i = IMPL.getTopInset(mLastInsets);
            if (i > 0)
            {
                mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                mStatusBarBackground.draw(canvas);
            }
        }
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
    //                   1 222
    //                   2 186
    //                   3 222;
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
            motionevent = mLeftDragger.findTopChildUnder((int)f, (int)f1);
            flag = flag2;
            if (motionevent != null)
            {
                flag = flag2;
                if (isContentView(motionevent))
                {
                    flag = true;
                }
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
        LayoutParams layoutparams;
        if (k >= l1)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k);
        if (view.getVisibility() != 8)
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!isContentView(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
_L6:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        int i1;
        int i2;
        int j2;
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        float f;
        boolean flag1;
        if (checkDrawerViewAbsoluteGravity(view, 3))
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
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i1, layoutparams.topMargin, i1 + i2, layoutparams.topMargin + j2);
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
          goto _L6
_L5:
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
          goto _L6
    }

    protected void onMeasure(int i, int j)
    {
label0:
        {
label1:
            {
                int l;
                int i1;
label2:
                {
                    int l2 = android.view.View.MeasureSpec.getMode(i);
                    int j2 = android.view.View.MeasureSpec.getMode(j);
                    int j1 = android.view.View.MeasureSpec.getSize(i);
                    int l1 = android.view.View.MeasureSpec.getSize(j);
                    if (l2 == 0x40000000)
                    {
                        i1 = l1;
                        l = j1;
                        if (j2 == 0x40000000)
                        {
                            break label2;
                        }
                    }
                    if (!isInEditMode())
                    {
                        break label1;
                    }
                    int k = j1;
                    if (l2 != 0x80000000)
                    {
                        k = j1;
                        if (l2 == 0)
                        {
                            k = 300;
                        }
                    }
                    i1 = l1;
                    l = k;
                    if (j2 != 0x80000000)
                    {
                        i1 = l1;
                        l = k;
                        if (j2 == 0)
                        {
                            i1 = 300;
                            l = k;
                        }
                    }
                }
                setMeasuredDimension(l, i1);
                boolean flag;
                int k1;
                int i2;
                int k2;
                if (mLastInsets != null && ViewCompat.getFitsSystemWindows(this))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i2 = ViewCompat.getLayoutDirection(this);
                k2 = getChildCount();
                k1 = 0;
                while (k1 < k2) 
                {
                    View view = getChildAt(k1);
                    if (view.getVisibility() != 8)
                    {
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        if (flag)
                        {
                            int i3 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, i2);
                            if (ViewCompat.getFitsSystemWindows(view))
                            {
                                IMPL.dispatchChildInsets(view, mLastInsets, i3);
                            } else
                            {
                                IMPL.applyMarginInsets(layoutparams, mLastInsets, i3);
                            }
                        }
                        if (isContentView(view))
                        {
                            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(i1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                        } else
                        if (isDrawerView(view))
                        {
                            int j3 = getDrawerViewAbsoluteGravity(view) & 7;
                            if ((j3 & 0) != 0)
                            {
                                throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(gravityToString(j3)).append(" but this DrawerLayout").append(" already has a drawer view along that edge").toString());
                            }
                            view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                        } else
                        {
                            throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(k1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                        }
                    }
                    k1++;
                }
                break label0;
            }
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
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
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = findOpenDrawer();
        if (view != null)
        {
            savedstate.openDrawerGravity = ((LayoutParams)view.getLayoutParams()).gravity;
        }
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
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(gravityToString(i)).toString());
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
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.onScreen = 1.0F;
            layoutparams.knownOpen = true;
            updateChildrenImportantForAccessibility(view, true);
        } else
        if (checkDrawerViewAbsoluteGravity(view, 3))
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

    public void setChildInsets(Object obj, boolean flag)
    {
        mLastInsets = obj;
        mDrawStatusBarBackground = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
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
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer with appropriate layout_gravity").toString());
        } else
        {
            setDrawerLockMode(i, ((LayoutParams)view.getLayoutParams()).gravity);
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

    public void setDrawerTitle(int i, CharSequence charsequence)
    {
        i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        if (i == 3)
        {
            mTitleLeft = charsequence;
        } else
        if (i == 5)
        {
            mTitleRight = charsequence;
            return;
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

    public void setStatusBarBackground(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else
        {
            drawable = null;
        }
        mStatusBarBackground = drawable;
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        mStatusBarBackground = drawable;
    }

    public void setStatusBarBackgroundColor(int i)
    {
        mStatusBarBackground = new ColorDrawable(i);
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
                view = mListener;
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

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        CAN_HIDE_DESCENDANTS = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new DrawerLayoutCompatImplApi21();
        } else
        {
            IMPL = new DrawerLayoutCompatImplBase();
        }
    }





    // Unreferenced inner class android/support/v4/widget/DrawerLayout$ViewDragCallback$1

/* anonymous class */
    final class ViewDragCallback._cls1
        implements Runnable
    {

        final ViewDragCallback this$1;

        public final void run()
        {
            peekDrawer();
        }

            
            {
                this$1 = ViewDragCallback.this;
                super();
            }
    }

}
