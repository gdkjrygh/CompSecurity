// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayoutImpl, ViewDragHelper

public class DrawerLayout extends ViewGroup
    implements DrawerLayoutImpl
{

    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
    private static final int DRAWER_ELEVATION = 10;
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
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1F;
    private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
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
    private final ArrayList mNonDrawerViews;
    private final ViewDragCallback mRightCallback;
    private final ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
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
        mShadowStart = null;
        mShadowEnd = null;
        mShadowLeft = null;
        mShadowRight = null;
        setDescendantFocusability(0x40000);
        float f = getResources().getDisplayMetrics().density;
        mMinDrawerMargin = (int)(64F * f + 0.5F);
        float f1 = 400F * f;
        mLeftCallback = new ViewDragCallback(3);
        mRightCallback = new ViewDragCallback(5);
        mLeftDragger = ViewDragHelper.create(this, 1.0F, mLeftCallback);
        mLeftDragger.setEdgeTrackingEnabled(1);
        mLeftDragger.setMinVelocity(f1);
        mLeftCallback.setDragger(mLeftDragger);
        mRightDragger = ViewDragHelper.create(this, 1.0F, mRightCallback);
        mRightDragger.setEdgeTrackingEnabled(2);
        mRightDragger.setMinVelocity(f1);
        mRightCallback.setDragger(mRightDragger);
        setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
        ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
        if (ViewCompat.getFitsSystemWindows(this))
        {
            IMPL.configureApplyInsets(this);
            mStatusBarBackground = IMPL.getDefaultStatusBarBackground(context);
        }
        mDrawerElevation = f * 10F;
        mNonDrawerViews = new ArrayList();
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

    private boolean mirror(Drawable drawable, int i)
    {
        if (drawable == null || !DrawableCompat.isAutoMirrored(drawable))
        {
            return false;
        } else
        {
            DrawableCompat.setLayoutDirection(drawable, i);
            return true;
        }
    }

    private Drawable resolveLeftShadow()
    {
        int i = ViewCompat.getLayoutDirection(this);
        if (i == 0)
        {
            if (mShadowStart != null)
            {
                mirror(mShadowStart, i);
                return mShadowStart;
            }
        } else
        if (mShadowEnd != null)
        {
            mirror(mShadowEnd, i);
            return mShadowEnd;
        }
        return mShadowLeft;
    }

    private Drawable resolveRightShadow()
    {
        int i = ViewCompat.getLayoutDirection(this);
        if (i == 0)
        {
            if (mShadowEnd != null)
            {
                mirror(mShadowEnd, i);
                return mShadowEnd;
            }
        } else
        if (mShadowStart != null)
        {
            mirror(mShadowStart, i);
            return mShadowStart;
        }
        return mShadowRight;
    }

    private void resolveShadowDrawables()
    {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION)
        {
            return;
        } else
        {
            mShadowLeftResolved = resolveLeftShadow();
            mShadowRightResolved = resolveRightShadow();
            return;
        }
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

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        boolean flag1 = false;
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j1 = getChildCount();
        int k = 0;
        boolean flag = false;
        while (k < j1) 
        {
            View view = getChildAt(k);
            if (isDrawerView(view))
            {
                if (isDrawerOpen(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i, j);
                }
            } else
            {
                mNonDrawerViews.add(view);
            }
            k++;
        }
        if (!flag)
        {
            int i1 = mNonDrawerViews.size();
            for (int l = ((flag1) ? 1 : 0); l < i1; l++)
            {
                View view1 = (View)mNonDrawerViews.get(l);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i, j);
                }
            }

        }
        mNonDrawerViews.clear();
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
        int i = 0;
        if (!mChildrenCanceledTouch)
        {
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            for (int j = getChildCount(); i < j; i++)
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
        int l = getChildCount();
        int j = 0;
        int i = 0;
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
            if (hasWindowFocus())
            {
                sendAccessibilityEvent(32);
            }
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
        int i;
        int j1;
        int i2;
        int l2;
        int i4;
        int j4;
        int k4;
        boolean flag1;
        i4 = getHeight();
        flag1 = isContentView(view);
        j1 = 0;
        boolean flag = false;
        i = getWidth();
        j4 = canvas.save();
        i2 = i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        k4 = getChildCount();
        l2 = 0;
        j1 = ((flag) ? 1 : 0);
_L5:
        View view1;
        if (l2 >= k4)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        view1 = getChildAt(l2);
        if (view1 == view || view1.getVisibility() != 0 || !hasOpaqueBackground(view1) || !isDrawerView(view1) || view1.getHeight() < i4) goto _L2; else goto _L1
_L1:
        if (!checkDrawerViewAbsoluteGravity(view1, 3)) goto _L4; else goto _L3
_L3:
        int k3;
        i2 = view1.getRight();
        if (i2 > j1)
        {
            j1 = i2;
        }
        k3 = j1;
        i2 = i;
_L6:
        l2++;
        i = i2;
        j1 = k3;
          goto _L5
_L4:
        int l3;
        l3 = view1.getLeft();
        i2 = l3;
        k3 = j1;
        if (l3 < i) goto _L6; else goto _L2
_L2:
        i2 = i;
        k3 = j1;
          goto _L6
        canvas.clipRect(j1, 0, i, getHeight());
        i2 = i;
        boolean flag2 = super.drawChild(canvas, view, l);
        canvas.restoreToCount(j4);
        if (mScrimOpacity > 0.0F && flag1)
        {
            int j = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
            int i3 = mScrimColor;
            mScrimPaint.setColor(j << 24 | i3 & 0xffffff);
            canvas.drawRect(j1, 0.0F, i2, getHeight(), mScrimPaint);
        } else
        {
            if (mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
            {
                int k = mShadowLeftResolved.getIntrinsicWidth();
                int k1 = view.getRight();
                int j2 = mLeftDragger.getEdgeSize();
                float f = Math.max(0.0F, Math.min((float)k1 / (float)j2, 1.0F));
                mShadowLeftResolved.setBounds(k1, view.getTop(), k + k1, view.getBottom());
                mShadowLeftResolved.setAlpha((int)(255F * f));
                mShadowLeftResolved.draw(canvas);
                return flag2;
            }
            if (mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
            {
                int i1 = mShadowRightResolved.getIntrinsicWidth();
                int l1 = view.getLeft();
                int k2 = getWidth();
                int j3 = mRightDragger.getEdgeSize();
                float f1 = Math.max(0.0F, Math.min((float)(k2 - l1) / (float)j3, 1.0F));
                mShadowRightResolved.setBounds(l1 - i1, view.getTop(), l1, view.getBottom());
                mShadowRightResolved.setAlpha((int)(255F * f1));
                mShadowRightResolved.draw(canvas);
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

    public float getDrawerElevation()
    {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION)
        {
            return mDrawerElevation;
        } else
        {
            return 0.0F;
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

    public Drawable getStatusBarBackgroundDrawable()
    {
        return mStatusBarBackground;
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
        int j = (int)(f1 * (float)i);
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
        flag1 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        flag2 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
        flag3 = mRightDragger.shouldInterceptTouchEvent(motionevent);
        i;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 196
    //                   2 165
    //                   3 196;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L8:
        if (flag2 | flag3 || flag || hasPeekingDrawer() || mChildrenCanceledTouch)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f;
        float f1;
        f = motionevent.getX();
        f1 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f1;
        if (mScrimOpacity <= 0.0F) goto _L6; else goto _L5
_L5:
        motionevent = mLeftDragger.findTopChildUnder((int)f, (int)f1);
        if (motionevent == null || !isContentView(motionevent)) goto _L6; else goto _L7
_L7:
        flag = true;
_L10:
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
          goto _L8
_L4:
        if (!mLeftDragger.checkTouchSlop(3)) goto _L1; else goto _L9
_L9:
        mLeftCallback.removeCallbacks();
        mRightCallback.removeCallbacks();
        flag = false;
          goto _L8
_L3:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
          goto _L1
_L6:
        flag = false;
          goto _L10
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
            i = -i2;
            i1 = (int)((float)i2 * layoutparams.onScreen) + i;
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
        view.layout(i1, layoutparams.topMargin, i2 + i1, j2 + layoutparams.topMargin);
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
        view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i2 + i1, i - layoutparams.bottomMargin);
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
        view.layout(i1, i, i2 + i1, j2 + i);
          goto _L7
        mInLayout = false;
        mFirstLayout = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        k1 = 300;
        j1 = 0;
        l2 = android.view.View.MeasureSpec.getMode(i);
        i2 = android.view.View.MeasureSpec.getMode(j);
        i1 = android.view.View.MeasureSpec.getSize(i);
        l1 = android.view.View.MeasureSpec.getSize(j);
        if (l2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l = i1;
        if (i2 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k;
        boolean flag;
        if (isInEditMode())
        {
            k = i1;
            if (l2 != 0x80000000)
            {
                k = i1;
                if (l2 == 0)
                {
                    k = 300;
                }
            }
            l = k;
            if (i2 != 0x80000000)
            {
label0:
                {
                    l = k;
                    if (i2 == 0)
                    {
                        l = k;
                        k = k1;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l, k);
        if (mLastInsets != null && ViewCompat.getFitsSystemWindows(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = ViewCompat.getLayoutDirection(this);
        l1 = getChildCount();
        while (j1 < l1) 
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (flag)
                {
                    int j2 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, k1);
                    if (ViewCompat.getFitsSystemWindows(view))
                    {
                        IMPL.dispatchChildInsets(view, mLastInsets, j2);
                    } else
                    {
                        IMPL.applyMarginInsets(layoutparams, mLastInsets, j2);
                    }
                }
                if (isContentView(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (isDrawerView(view))
                {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION && ViewCompat.getElevation(view) != mDrawerElevation)
                    {
                        ViewCompat.setElevation(view, mDrawerElevation);
                    }
                    int k2 = getDrawerViewAbsoluteGravity(view) & 7;
                    if ((k2 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(gravityToString(k2)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j1++;
        }
        return;
_L3:
        k = l1;
        if (true) goto _L5; else goto _L4
_L4:
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

    public void onRtlPropertiesChanged(int i)
    {
        resolveShadowDrawables();
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
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 204;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f = motionevent.getX();
        float f2 = motionevent.getY();
        mInitialMotionX = f;
        mInitialMotionY = f2;
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        return true;
_L3:
        float f1;
        float f3;
        f3 = motionevent.getX();
        f1 = motionevent.getY();
        motionevent = mLeftDragger.findTopChildUnder((int)f3, (int)f1);
        if (motionevent == null || !isContentView(motionevent)) goto _L6; else goto _L5
_L5:
        int i;
        f3 -= mInitialMotionX;
        f1 -= mInitialMotionY;
        i = mLeftDragger.getTouchSlop();
        if (f3 * f3 + f1 * f1 >= (float)(i * i)) goto _L6; else goto _L7
_L7:
        motionevent = findOpenDrawer();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (getDrawerLockMode(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        closeDrawers(flag);
        mDisallowInterceptRequested = false;
        return true;
_L4:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
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

    public void setDrawerElevation(float f)
    {
        mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (isDrawerView(view))
            {
                ViewCompat.setElevation(view, mDrawerElevation);
            }
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
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i & 0x800003) == 0x800003)
        {
            mShadowStart = drawable;
        } else
        if ((i & 0x800005) == 0x800005)
        {
            mShadowEnd = drawable;
        } else
        {
            if ((i & 3) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            mShadowLeft = drawable;
        }
_L4:
        resolveShadowDrawables();
        invalidate();
        return;
        if ((i & 5) != 5) goto _L1; else goto _L3
_L3:
        mShadowRight = drawable;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
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
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i)
    {
        mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    void updateDrawerState(int i, int j, View view)
    {
        LayoutParams layoutparams;
        boolean flag = true;
        int k = mLeftDragger.getViewDragState();
        int l = mRightDragger.getViewDragState();
        i = ((flag) ? 1 : 0);
        if (k != 1)
        {
            if (l == 1)
            {
                i = ((flag) ? 1 : 0);
            } else
            if (k == 2 || l == 2)
            {
                i = 2;
            } else
            {
                i = 0;
            }
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

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CAN_HIDE_DESCENDANTS = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new DrawerLayoutCompatImplApi21();
        } else
        {
            IMPL = new DrawerLayoutCompatImplBase();
        }
    }





    /* member class not found */
    class ChildAccessibilityDelegate {}


    /* member class not found */
    class ViewDragCallback {}


    /* member class not found */
    class AccessibilityDelegate {}


    /* member class not found */
    class DrawerLayoutCompatImpl {}


    /* member class not found */
    class LayoutParams {}


    private class DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f);

        public abstract void onDrawerStateChanged(int i);
    }


    /* member class not found */
    class SavedState {}


    /* member class not found */
    class DrawerLayoutCompatImplApi21 {}


    /* member class not found */
    class DrawerLayoutCompatImplBase {}

}
