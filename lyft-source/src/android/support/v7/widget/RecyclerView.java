// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator, RecyclerViewAccessibilityDelegate, ChildHelper, AdapterHelper

public class RecyclerView extends ViewGroup
    implements NestedScrollingChild, ScrollingView
{

    private static final boolean DEBUG = false;
    private static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE[];
    private static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1L;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    private static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    private static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    private static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int VERTICAL = 1;
    private static final Interpolator sQuinticInterpolator = new Interpolator() {

        public float getInterpolation(float f)
        {
            f--;
            return f * (f * f * f * f) + 1.0F;
        }

    };
    private RecyclerViewAccessibilityDelegate mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    private OnItemTouchListener mActiveOnItemTouchListener;
    private Adapter mAdapter;
    AdapterHelper mAdapterHelper;
    private boolean mAdapterUpdateDuringMeasure;
    private EdgeEffectCompat mBottomGlow;
    private ChildDrawingOrderCallback mChildDrawingOrderCallback;
    ChildHelper mChildHelper;
    private boolean mClipToPadding;
    private boolean mDataSetHasChangedAfterLayout;
    private boolean mEatRequestLayout;
    private int mEatenAccessibilityChangeFlags;
    private boolean mFirstLayoutComplete;
    private boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private boolean mIsAttached;
    ItemAnimator mItemAnimator;
    private ItemAnimator.ItemAnimatorListener mItemAnimatorListener;
    private Runnable mItemAnimatorRunner = new Runnable() {

        final RecyclerView a;

        public void run()
        {
            if (a.mItemAnimator != null)
            {
                a.mItemAnimator.a();
            }
            a.mPostedAnimatorRunner = false;
        }

            
            {
                a = RecyclerView.this;
                super();
            }
    };
    private final ArrayList mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    private LayoutManager mLayout;
    private boolean mLayoutFrozen;
    private int mLayoutOrScrollCounter;
    private boolean mLayoutRequestEaten;
    private EdgeEffectCompat mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int mMinMaxLayoutPositions[];
    private final int mNestedOffsets[];
    private final RecyclerViewDataObserver mObserver;
    private List mOnChildAttachStateListeners;
    private final ArrayList mOnItemTouchListeners;
    private SavedState mPendingSavedState;
    private final boolean mPostUpdatesOnAnimation;
    private boolean mPostedAnimatorRunner;
    final Recycler mRecycler;
    private RecyclerListener mRecyclerListener;
    private EdgeEffectCompat mRightGlow;
    private final int mScrollConsumed[];
    private float mScrollFactor;
    private OnScrollListener mScrollListener;
    private List mScrollListeners;
    private final int mScrollOffset[];
    private int mScrollPointerId;
    private int mScrollState;
    private final NestedScrollingChildHelper mScrollingChildHelper;
    final State mState;
    private final Rect mTempRect;
    private EdgeEffectCompat mTopGlow;
    private int mTouchSlop;
    private final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    private final ViewFlinger mViewFlinger;

    public RecyclerView(Context context)
    {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mObserver = new RecyclerViewDataObserver();
        mRecycler = new Recycler();
        mUpdateChildViewsRunnable = new Runnable() {

            final RecyclerView a;

            public void run()
            {
                if (a.mFirstLayoutComplete)
                {
                    if (a.mDataSetHasChangedAfterLayout)
                    {
                        TraceCompat.a("RV FullInvalidate");
                        a.dispatchLayout();
                        TraceCompat.a();
                        return;
                    }
                    if (a.mAdapterHelper.d())
                    {
                        TraceCompat.a("RV PartialInvalidate");
                        a.eatRequestLayout();
                        a.mAdapterHelper.b();
                        if (!a.mLayoutRequestEaten)
                        {
                            a.rebindUpdatedViewHolders();
                        }
                        a.resumeRequestLayout(true);
                        TraceCompat.a();
                        return;
                    }
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
        mTempRect = new Rect();
        mItemDecorations = new ArrayList();
        mOnItemTouchListeners = new ArrayList();
        mDataSetHasChangedAfterLayout = false;
        mLayoutOrScrollCounter = 0;
        mItemAnimator = new DefaultItemAnimator();
        mScrollState = 0;
        mScrollPointerId = -1;
        mScrollFactor = 1.401298E-45F;
        mViewFlinger = new ViewFlinger();
        mState = new State();
        mItemsAddedOrRemoved = false;
        mItemsChanged = false;
        mItemAnimatorListener = new ItemAnimatorRestoreListener();
        mPostedAnimatorRunner = false;
        mMinMaxLayoutPositions = new int[2];
        mScrollOffset = new int[2];
        mScrollConsumed = new int[2];
        mNestedOffsets = new int[2];
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewconfiguration;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mPostUpdatesOnAnimation = flag;
        viewconfiguration = ViewConfiguration.get(context);
        mTouchSlop = viewconfiguration.getScaledTouchSlop();
        mMinFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
        mMaxFlingVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        if (ViewCompat.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        mItemAnimator.a(mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        if (ViewCompat.e(this) == 0)
        {
            ViewCompat.c(this, 1);
        }
        mAccessibilityManager = (AccessibilityManager)getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new RecyclerViewAccessibilityDelegate(this));
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.v7.recyclerview.R.styleable.RecyclerView, i, 0);
            String s = typedarray.getString(android.support.v7.recyclerview.R.styleable.RecyclerView_layoutManager);
            typedarray.recycle();
            createLayoutManager(context, s, attributeset, i, 0);
        }
        mScrollingChildHelper = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    private void addAnimatingView(ViewHolder viewholder)
    {
        View view = viewholder.itemView;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRecycler.d(getChildViewHolder(view));
        if (viewholder.isTmpDetached())
        {
            mChildHelper.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            mChildHelper.a(view, true);
            return;
        } else
        {
            mChildHelper.d(view);
            return;
        }
    }

    private void animateAppearance(ViewHolder viewholder, Rect rect, int i, int j)
    {
        View view = viewholder.itemView;
        if (rect != null && (rect.left != i || rect.top != j))
        {
            viewholder.setIsRecyclable(false);
            if (mItemAnimator.a(viewholder, rect.left, rect.top, i, j))
            {
                postAnimationRunner();
            }
        } else
        {
            viewholder.setIsRecyclable(false);
            if (mItemAnimator.b(viewholder))
            {
                postAnimationRunner();
                return;
            }
        }
    }

    private void animateChange(ViewHolder viewholder, ViewHolder viewholder1)
    {
        viewholder.setIsRecyclable(false);
        addAnimatingView(viewholder);
        viewholder.mShadowedHolder = viewholder1;
        mRecycler.d(viewholder);
        int k = viewholder.itemView.getLeft();
        int l = viewholder.itemView.getTop();
        int i;
        int j;
        if (viewholder1 == null || viewholder1.shouldIgnore())
        {
            j = l;
            i = k;
        } else
        {
            i = viewholder1.itemView.getLeft();
            j = viewholder1.itemView.getTop();
            viewholder1.setIsRecyclable(false);
            viewholder1.mShadowingHolder = viewholder;
        }
        if (mItemAnimator.a(viewholder, viewholder1, k, l, i, j))
        {
            postAnimationRunner();
        }
    }

    private void animateDisappearance(ItemHolderInfo itemholderinfo)
    {
        View view = itemholderinfo.a.itemView;
        addAnimatingView(itemholderinfo.a);
        int i = itemholderinfo.b;
        int j = itemholderinfo.c;
        int k = view.getLeft();
        int l = view.getTop();
        if (!itemholderinfo.a.isRemoved() && (i != k || j != l))
        {
            itemholderinfo.a.setIsRecyclable(false);
            view.layout(k, l, view.getWidth() + k, view.getHeight() + l);
            if (mItemAnimator.a(itemholderinfo.a, i, j, k, l))
            {
                postAnimationRunner();
            }
        } else
        {
            itemholderinfo.a.setIsRecyclable(false);
            if (mItemAnimator.a(itemholderinfo.a))
            {
                postAnimationRunner();
                return;
            }
        }
    }

    private void cancelTouch()
    {
        resetTouch();
        setScrollState(0);
    }

    private void considerReleasingGlowsOnScroll(int i, int j)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (mLeftGlow != null)
        {
            flag = flag1;
            if (!mLeftGlow.a())
            {
                flag = flag1;
                if (i > 0)
                {
                    flag = mLeftGlow.c();
                }
            }
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag;
            if (!mRightGlow.a())
            {
                flag1 = flag;
                if (i < 0)
                {
                    flag1 = flag | mRightGlow.c();
                }
            }
        }
        flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1;
            if (!mTopGlow.a())
            {
                flag = flag1;
                if (j > 0)
                {
                    flag = flag1 | mTopGlow.c();
                }
            }
        }
        flag1 = flag;
        if (mBottomGlow != null)
        {
            flag1 = flag;
            if (!mBottomGlow.a())
            {
                flag1 = flag;
                if (j < 0)
                {
                    flag1 = flag | mBottomGlow.c();
                }
            }
        }
        if (flag1)
        {
            ViewCompat.d(this);
        }
    }

    private void consumePendingUpdateOperations()
    {
        mUpdateChildViewsRunnable.run();
    }

    private void createLayoutManager(Context context, String s, AttributeSet attributeset, int i, int j)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        s = s.trim();
        if (s.length() == 0) goto _L2; else goto _L3
_L3:
        String s1 = getFullClassName(context, s);
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        s = getClass().getClassLoader();
_L8:
        Class class1 = s.loadClass(s1).asSubclass(android/support/v7/widget/RecyclerView$LayoutManager);
        Object aobj[];
        s = class1.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
        aobj = new Object[4];
        aobj[0] = context;
        aobj[1] = attributeset;
        aobj[2] = Integer.valueOf(i);
        aobj[3] = Integer.valueOf(j);
        context = ((Context) (aobj));
_L6:
        try
        {
            s.setAccessible(true);
            setLayoutManager((LayoutManager)s.newInstance(context));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(s1).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s1).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(s1).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(s1).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(s1).toString(), context);
        }
_L5:
        s = context.getClassLoader();
        continue; /* Loop/switch isn't completed */
        context;
        s = class1.getConstructor(new Class[0]);
        context = null;
          goto _L6
        s;
        s.initCause(context);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(s1).toString(), s);
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void defaultOnMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (l)
        {
        default:
            i = ViewCompat.m(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k)
            {
            default:
                j = ViewCompat.n(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i, j);
                break;
            }
            break;
        }
    }

    private boolean didChildRangeChange(int i, int j)
    {
        int l;
        boolean flag1;
        flag1 = false;
        l = mChildHelper.b();
        if (l != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (i == 0)
            {
                flag = flag1;
                if (j == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        int k = 0;
        do
        {
            flag = flag1;
            if (k >= l)
            {
                continue; /* Loop/switch isn't completed */
            }
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.b(k));
            int i1;
            if (!viewholder.shouldIgnore())
            {
                if ((i1 = viewholder.getLayoutPosition()) < i || i1 > j)
                {
                    return true;
                }
            }
            k++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void dispatchChildAttached(View view)
    {
        ViewHolder viewholder = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        if (mAdapter != null && viewholder != null)
        {
            mAdapter.onViewAttachedToWindow(viewholder);
        }
        if (mOnChildAttachStateListeners != null)
        {
            for (int i = mOnChildAttachStateListeners.size() - 1; i >= 0; i--)
            {
                ((OnChildAttachStateChangeListener)mOnChildAttachStateListeners.get(i)).a(view);
            }

        }
    }

    private void dispatchChildDetached(View view)
    {
        ViewHolder viewholder = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        if (mAdapter != null && viewholder != null)
        {
            mAdapter.onViewDetachedFromWindow(viewholder);
        }
        if (mOnChildAttachStateListeners != null)
        {
            for (int i = mOnChildAttachStateListeners.size() - 1; i >= 0; i--)
            {
                ((OnChildAttachStateChangeListener)mOnChildAttachStateListeners.get(i)).b(view);
            }

        }
    }

    private void dispatchContentChangedIfNecessary()
    {
        int i = mEatenAccessibilityChangeFlags;
        mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled())
        {
            AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
            accessibilityevent.setEventType(2048);
            AccessibilityEventCompat.a(accessibilityevent, i);
            sendAccessibilityEventUnchecked(accessibilityevent);
        }
    }

    private boolean dispatchOnItemTouch(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        if (mActiveOnItemTouchListener == null) goto _L2; else goto _L1
_L1:
        if (i != 0) goto _L4; else goto _L3
_L3:
        mActiveOnItemTouchListener = null;
_L2:
        if (i == 0) goto _L6; else goto _L5
_L5:
        int j;
        j = mOnItemTouchListeners.size();
        i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        OnItemTouchListener onitemtouchlistener = (OnItemTouchListener)mOnItemTouchListeners.get(i);
        if (onitemtouchlistener.a(this, motionevent))
        {
            mActiveOnItemTouchListener = onitemtouchlistener;
            return true;
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        mActiveOnItemTouchListener.b(this, motionevent);
        if (i == 3 || i == 1)
        {
            mActiveOnItemTouchListener = null;
        }
        return true;
        if (true) goto _L7; else goto _L6
_L6:
        return false;
    }

    private boolean dispatchOnItemTouchIntercept(MotionEvent motionevent)
    {
        int j = motionevent.getAction();
        if (j == 3 || j == 0)
        {
            mActiveOnItemTouchListener = null;
        }
        int k = mOnItemTouchListeners.size();
        for (int i = 0; i < k; i++)
        {
            OnItemTouchListener onitemtouchlistener = (OnItemTouchListener)mOnItemTouchListeners.get(i);
            if (onitemtouchlistener.a(this, motionevent) && j != 3)
            {
                mActiveOnItemTouchListener = onitemtouchlistener;
                return true;
            }
        }

        return false;
    }

    private void findMinMaxChildLayoutPositions(int ai[])
    {
        int j1 = mChildHelper.b();
        if (j1 == 0)
        {
            ai[0] = 0;
            ai[1] = 0;
            return;
        }
        int i = 0x7fffffff;
        int l = 0x80000000;
        int k = 0;
        while (k < j1) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.b(k));
            if (!viewholder.shouldIgnore())
            {
                int i1 = viewholder.getLayoutPosition();
                int j = i;
                if (i1 < i)
                {
                    j = i1;
                }
                if (i1 > l)
                {
                    l = i1;
                    i = j;
                } else
                {
                    i = j;
                }
            }
            k++;
        }
        ai[0] = i;
        ai[1] = l;
    }

    private int getAdapterPositionFor(ViewHolder viewholder)
    {
        if (viewholder.hasAnyOfTheFlags(524) || !viewholder.isBound())
        {
            return -1;
        } else
        {
            return mAdapterHelper.b(viewholder.mPosition);
        }
    }

    static ViewHolder getChildViewHolderInt(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).a;
        }
    }

    private String getFullClassName(Context context, String s)
    {
        if (s.charAt(0) == '.')
        {
            context = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
        } else
        {
            context = s;
            if (!s.contains("."))
            {
                return (new StringBuilder()).append(android/support/v7/widget/RecyclerView.getPackage().getName()).append('.').append(s).toString();
            }
        }
        return context;
    }

    private float getScrollFactor()
    {
label0:
        {
            if (mScrollFactor == 1.401298E-45F)
            {
                TypedValue typedvalue = new TypedValue();
                if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                {
                    break label0;
                }
                mScrollFactor = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
            }
            return mScrollFactor;
        }
        return 0.0F;
    }

    private void initChildrenHelper()
    {
        mChildHelper = new ChildHelper(new ChildHelper.Callback() {

            final RecyclerView a;

            public int a()
            {
                return a.getChildCount();
            }

            public int a(View view)
            {
                return a.indexOfChild(view);
            }

            public void a(int i)
            {
                View view = a.getChildAt(i);
                if (view != null)
                {
                    a.dispatchChildDetached(view);
                }
                a.removeViewAt(i);
            }

            public void a(View view, int i)
            {
                a.addView(view, i);
                a.dispatchChildAttached(view);
            }

            public void a(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
            {
                ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
                if (viewholder != null)
                {
                    if (!viewholder.isTmpDetached() && !viewholder.shouldIgnore())
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("Called attach on a child which is not detached: ").append(viewholder).toString());
                    }
                    viewholder.clearTmpDetachFlag();
                }
                a.attachViewToParent(view, i, layoutparams);
            }

            public ViewHolder b(View view)
            {
                return RecyclerView.getChildViewHolderInt(view);
            }

            public View b(int i)
            {
                return a.getChildAt(i);
            }

            public void b()
            {
                int j = a();
                for (int i = 0; i < j; i++)
                {
                    a.dispatchChildDetached(b(i));
                }

                a.removeAllViews();
            }

            public void c(int i)
            {
                Object obj = b(i);
                if (obj != null)
                {
                    obj = RecyclerView.getChildViewHolderInt(((View) (obj)));
                    if (obj != null)
                    {
                        if (((ViewHolder) (obj)).isTmpDetached() && !((ViewHolder) (obj)).shouldIgnore())
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("called detach on an already detached child ").append(obj).toString());
                        }
                        ((ViewHolder) (obj)).addFlags(256);
                    }
                }
                a.detachViewFromParent(i);
            }

            public void c(View view)
            {
                view = RecyclerView.getChildViewHolderInt(view);
                if (view != null)
                {
                    view.onEnteredHiddenState();
                }
            }

            public void d(View view)
            {
                view = RecyclerView.getChildViewHolderInt(view);
                if (view != null)
                {
                    view.onLeftHiddenState();
                }
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
    }

    private void jumpToPositionForSmoothScroller(int i)
    {
        if (mLayout == null)
        {
            return;
        } else
        {
            mLayout.d(i);
            awakenScrollBars();
            return;
        }
    }

    private void onEnterLayoutOrScroll()
    {
        mLayoutOrScrollCounter = mLayoutOrScrollCounter + 1;
    }

    private void onExitLayoutOrScroll()
    {
        mLayoutOrScrollCounter = mLayoutOrScrollCounter - 1;
        if (mLayoutOrScrollCounter < 1)
        {
            mLayoutOrScrollCounter = 0;
            dispatchContentChangedIfNecessary();
        }
    }

    private void onPointerUp(MotionEvent motionevent)
    {
        int i = MotionEventCompat.b(motionevent);
        if (MotionEventCompat.b(motionevent, i) == mScrollPointerId)
        {
            int j;
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            mScrollPointerId = MotionEventCompat.b(motionevent, i);
            j = (int)(MotionEventCompat.c(motionevent, i) + 0.5F);
            mLastTouchX = j;
            mInitialTouchX = j;
            i = (int)(MotionEventCompat.d(motionevent, i) + 0.5F);
            mLastTouchY = i;
            mInitialTouchY = i;
        }
    }

    private void postAnimationRunner()
    {
        if (!mPostedAnimatorRunner && mIsAttached)
        {
            ViewCompat.a(this, mItemAnimatorRunner);
            mPostedAnimatorRunner = true;
        }
    }

    private boolean predictiveItemAnimationsEnabled()
    {
        return mItemAnimator != null && mLayout.j();
    }

    private void processAdapterUpdatesAndSetAnimationFlags()
    {
        boolean flag2 = true;
        if (mDataSetHasChangedAfterLayout)
        {
            mAdapterHelper.a();
            markKnownViewsInvalid();
            mLayout.e(this);
        }
        State state;
        boolean flag;
        boolean flag1;
        if (mItemAnimator != null && mLayout.j())
        {
            mAdapterHelper.b();
        } else
        {
            mAdapterHelper.e();
        }
        if (mItemsAddedOrRemoved && !mItemsChanged || mItemsAddedOrRemoved || mItemsChanged && supportsChangeAnimations())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        state = mState;
        if (mFirstLayoutComplete && mItemAnimator != null && (mDataSetHasChangedAfterLayout || flag || LayoutManager.a(mLayout)) && (!mDataSetHasChangedAfterLayout || mAdapter.hasStableIds()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        State.c(state, flag1);
        state = mState;
        if (State.b(mState) && flag && !mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        State.d(state, flag1);
    }

    private void processDisappearingList(ArrayMap arraymap)
    {
        List list = mState.d;
        int i = list.size() - 1;
        while (i >= 0) 
        {
            View view = (View)list.get(i);
            ViewHolder viewholder = getChildViewHolderInt(view);
            ItemHolderInfo itemholderinfo = (ItemHolderInfo)mState.a.remove(viewholder);
            if (!mState.a())
            {
                mState.b.remove(viewholder);
            }
            if (arraymap.remove(view) != null)
            {
                mLayout.a(view, mRecycler);
            } else
            if (itemholderinfo != null)
            {
                animateDisappearance(itemholderinfo);
            } else
            {
                animateDisappearance(new ItemHolderInfo(viewholder, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i--;
        }
        list.clear();
    }

    private void pullGlows(float f, float f1, float f2, float f3)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        boolean flag2 = false;
        if (f1 < 0.0F)
        {
            ensureLeftGlow();
            flag = flag2;
            if (mLeftGlow.a(-f1 / (float)getWidth(), 1.0F - f2 / (float)getHeight()))
            {
                flag = true;
            }
        } else
        {
            flag = flag2;
            if (f1 > 0.0F)
            {
                ensureRightGlow();
                flag = flag2;
                if (mRightGlow.a(f1 / (float)getWidth(), f2 / (float)getHeight()))
                {
                    flag = true;
                }
            }
        }
        if (f3 >= 0.0F) goto _L2; else goto _L1
_L1:
        ensureTopGlow();
        if (!mTopGlow.a(-f3 / (float)getHeight(), f / (float)getWidth())) goto _L4; else goto _L3
_L3:
        if (flag1 || f1 != 0.0F || f3 != 0.0F)
        {
            ViewCompat.d(this);
        }
        return;
_L2:
        if (f3 > 0.0F)
        {
            ensureBottomGlow();
            if (mBottomGlow.a(f3 / (float)getHeight(), 1.0F - f / (float)getWidth()))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
_L4:
        flag1 = flag;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void releaseGlows()
    {
        boolean flag1 = false;
        if (mLeftGlow != null)
        {
            flag1 = mLeftGlow.c();
        }
        boolean flag = flag1;
        if (mTopGlow != null)
        {
            flag = flag1 | mTopGlow.c();
        }
        flag1 = flag;
        if (mRightGlow != null)
        {
            flag1 = flag | mRightGlow.c();
        }
        flag = flag1;
        if (mBottomGlow != null)
        {
            flag = flag1 | mBottomGlow.c();
        }
        if (flag)
        {
            ViewCompat.d(this);
        }
    }

    private boolean removeAnimatingView(View view)
    {
        eatRequestLayout();
        boolean flag = mChildHelper.e(view);
        if (flag)
        {
            view = getChildViewHolderInt(view);
            mRecycler.d(view);
            mRecycler.b(view);
        }
        resumeRequestLayout(false);
        return flag;
    }

    private void resetTouch()
    {
        if (mVelocityTracker != null)
        {
            mVelocityTracker.clear();
        }
        stopNestedScroll();
        releaseGlows();
    }

    private void setAdapterInternal(Adapter adapter, boolean flag, boolean flag1)
    {
        if (mAdapter != null)
        {
            mAdapter.unregisterAdapterDataObserver(mObserver);
            mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!flag || flag1)
        {
            if (mItemAnimator != null)
            {
                mItemAnimator.c();
            }
            if (mLayout != null)
            {
                mLayout.c(mRecycler);
                mLayout.b(mRecycler);
            }
            mRecycler.a();
        }
        mAdapterHelper.a();
        Adapter adapter1 = mAdapter;
        mAdapter = adapter;
        if (adapter != null)
        {
            adapter.registerAdapterDataObserver(mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        if (mLayout != null)
        {
            mLayout.a(adapter1, mAdapter);
        }
        mRecycler.a(adapter1, mAdapter, flag);
        State.a(mState, true);
        markKnownViewsInvalid();
    }

    private void setDataSetChangedAfterLayout()
    {
        if (mDataSetHasChangedAfterLayout)
        {
            return;
        }
        mDataSetHasChangedAfterLayout = true;
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                viewholder.addFlags(512);
            }
        }

        mRecycler.g();
    }

    private void setScrollState(int i)
    {
        if (i == mScrollState)
        {
            return;
        }
        mScrollState = i;
        if (i != 2)
        {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    private void stopScrollersInternal()
    {
        mViewFlinger.b();
        if (mLayout != null)
        {
            mLayout.z();
        }
    }

    private boolean supportsChangeAnimations()
    {
        return mItemAnimator != null && mItemAnimator.h();
    }

    void absorbGlows(int i, int j)
    {
        if (i < 0)
        {
            ensureLeftGlow();
            mLeftGlow.a(-i);
        } else
        if (i > 0)
        {
            ensureRightGlow();
            mRightGlow.a(i);
        }
        if (j < 0)
        {
            ensureTopGlow();
            mTopGlow.a(-j);
        } else
        if (j > 0)
        {
            ensureBottomGlow();
            mBottomGlow.a(j);
        }
        if (i != 0 || j != 0)
        {
            ViewCompat.d(this);
        }
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        if (mLayout == null || !mLayout.a(this, arraylist, i, j))
        {
            super.addFocusables(arraylist, i, j);
        }
    }

    public void addItemDecoration(ItemDecoration itemdecoration)
    {
        addItemDecoration(itemdecoration, -1);
    }

    public void addItemDecoration(ItemDecoration itemdecoration, int i)
    {
        if (mLayout != null)
        {
            mLayout.a("Cannot add item decoration during a scroll  or layout");
        }
        if (mItemDecorations.isEmpty())
        {
            setWillNotDraw(false);
        }
        if (i < 0)
        {
            mItemDecorations.add(itemdecoration);
        } else
        {
            mItemDecorations.add(i, itemdecoration);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onchildattachstatechangelistener)
    {
        if (mOnChildAttachStateListeners == null)
        {
            mOnChildAttachStateListeners = new ArrayList();
        }
        mOnChildAttachStateListeners.add(onchildattachstatechangelistener);
    }

    public void addOnItemTouchListener(OnItemTouchListener onitemtouchlistener)
    {
        mOnItemTouchListeners.add(onitemtouchlistener);
    }

    public void addOnScrollListener(OnScrollListener onscrolllistener)
    {
        if (mScrollListeners == null)
        {
            mScrollListeners = new ArrayList();
        }
        mScrollListeners.add(onscrolllistener);
    }

    void assertInLayoutOrScroll(String s)
    {
        if (!isComputingLayout())
        {
            if (s == null)
            {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s);
            }
        } else
        {
            return;
        }
    }

    void assertNotInLayoutOrScroll(String s)
    {
        if (isComputingLayout())
        {
            if (s == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s);
            }
        } else
        {
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && mLayout.a((LayoutParams)layoutparams);
    }

    void clearOldPositions()
    {
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i));
            if (!viewholder.shouldIgnore())
            {
                viewholder.clearOldPosition();
            }
        }

        mRecycler.i();
    }

    public void clearOnChildAttachStateChangeListeners()
    {
        if (mOnChildAttachStateListeners != null)
        {
            mOnChildAttachStateListeners.clear();
        }
    }

    public void clearOnScrollListeners()
    {
        if (mScrollListeners != null)
        {
            mScrollListeners.clear();
        }
    }

    public int computeHorizontalScrollExtent()
    {
        if (mLayout.c())
        {
            return mLayout.d(mState);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (mLayout.c())
        {
            return mLayout.b(mState);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (mLayout.c())
        {
            return mLayout.f(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (mLayout.d())
        {
            return mLayout.e(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (mLayout.d())
        {
            return mLayout.c(mState);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (mLayout.d())
        {
            return mLayout.g(mState);
        } else
        {
            return 0;
        }
    }

    void dispatchLayout()
    {
        if (mAdapter != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L16:
        return;
_L2:
        if (mLayout == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        mState.d.clear();
        eatRequestLayout();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        State state1 = mState;
        Object obj;
        if (State.b(mState) && mItemsChanged && supportsChangeAnimations())
        {
            obj = new ArrayMap();
        } else
        {
            obj = null;
        }
        state1.c = ((ArrayMap) (obj));
        mItemsChanged = false;
        mItemsAddedOrRemoved = false;
        State.b(mState, State.a(mState));
        mState.e = mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(mMinMaxLayoutPositions);
        if (State.b(mState))
        {
            mState.a.clear();
            mState.b.clear();
            int k1 = mChildHelper.b();
            int i = 0;
            while (i < k1) 
            {
                obj = getChildViewHolderInt(mChildHelper.b(i));
                if (!((ViewHolder) (obj)).shouldIgnore() && (!((ViewHolder) (obj)).isInvalid() || mAdapter.hasStableIds()))
                {
                    View view1 = ((ViewHolder) (obj)).itemView;
                    mState.a.put(obj, new ItemHolderInfo(((ViewHolder) (obj)), view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom()));
                }
                i++;
            }
        }
        if (!State.a(mState)) goto _L4; else goto _L3
_L3:
        Object obj2;
        int k;
        saveOldPositions();
        if (mState.c != null)
        {
            int l1 = mChildHelper.b();
            for (int j = 0; j < l1; j++)
            {
                ViewHolder viewholder = getChildViewHolderInt(mChildHelper.b(j));
                if (viewholder.isChanged() && !viewholder.isRemoved() && !viewholder.shouldIgnore())
                {
                    long l2 = getChangedHolderKey(viewholder);
                    mState.c.put(Long.valueOf(l2), viewholder);
                    mState.a.remove(viewholder);
                }
            }

        }
        boolean flag = State.c(mState);
        State.a(mState, false);
        mLayout.a(mRecycler, mState);
        State.a(mState, flag);
        obj2 = new ArrayMap();
        k = 0;
_L9:
        if (k >= mChildHelper.b()) goto _L6; else goto _L5
_L5:
        View view = mChildHelper.b(k);
        if (!getChildViewHolderInt(view).shouldIgnore()) goto _L8; else goto _L7
_L7:
        k++;
          goto _L9
_L8:
        int i2 = 0;
_L12:
        if (i2 >= mState.a.size())
        {
            break MISSING_BLOCK_LABEL_1686;
        }
        if (((ViewHolder)mState.a.b(i2)).itemView != view) goto _L11; else goto _L10
_L10:
        i2 = 1;
_L18:
        if (i2 == 0)
        {
            ((ArrayMap) (obj2)).put(view, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
          goto _L7
_L11:
        i2++;
          goto _L12
_L6:
        clearOldPositions();
        mAdapterHelper.c();
_L17:
        mState.e = mAdapter.getItemCount();
        State.b(mState, 0);
        State.b(mState, false);
        mLayout.a(mRecycler, mState);
        State.a(mState, false);
        mPendingSavedState = null;
        State state = mState;
        int l;
        long l3;
        boolean flag1;
        if (State.b(mState) && mItemAnimator != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        State.c(state, flag1);
        if (!State.b(mState)) goto _L14; else goto _L13
_L13:
        Object obj1;
        long l5;
        {
            if (mState.c != null)
            {
                obj1 = new ArrayMap();
            } else
            {
                obj1 = null;
            }
            i2 = mChildHelper.b();
            l = 0;
            while (l < i2) 
            {
                ViewHolder viewholder1 = getChildViewHolderInt(mChildHelper.b(l));
                if (!viewholder1.shouldIgnore())
                {
                    View view3 = viewholder1.itemView;
                    long l4 = getChangedHolderKey(viewholder1);
                    if (obj1 != null && mState.c.get(Long.valueOf(l4)) != null)
                    {
                        ((ArrayMap) (obj1)).put(Long.valueOf(l4), viewholder1);
                    } else
                    {
                        mState.b.put(viewholder1, new ItemHolderInfo(viewholder1, view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom()));
                    }
                }
                l++;
            }
            processDisappearingList(((ArrayMap) (obj2)));
            for (int i1 = mState.a.size() - 1; i1 >= 0; i1--)
            {
                ViewHolder viewholder2 = (ViewHolder)mState.a.b(i1);
                if (!mState.b.containsKey(viewholder2))
                {
                    ItemHolderInfo itemholderinfo = (ItemHolderInfo)mState.a.c(i1);
                    mState.a.d(i1);
                    View view4 = itemholderinfo.a.itemView;
                    mRecycler.d(itemholderinfo.a);
                    animateDisappearance(itemholderinfo);
                }
            }

            int j1 = mState.b.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    ViewHolder viewholder3 = (ViewHolder)mState.b.b(j1);
                    ItemHolderInfo itemholderinfo3 = (ItemHolderInfo)mState.b.c(j1);
                    if (mState.a.isEmpty() || !mState.a.containsKey(viewholder3))
                    {
                        mState.b.d(j1);
                        Rect rect;
                        if (obj2 != null)
                        {
                            rect = (Rect)((ArrayMap) (obj2)).get(viewholder3.itemView);
                        } else
                        {
                            rect = null;
                        }
                        animateAppearance(viewholder3, rect, itemholderinfo3.b, itemholderinfo3.c);
                    }
                    j1--;
                }
            }
            i2 = mState.b.size();
            for (j1 = 0; j1 < i2; j1++)
            {
                obj2 = (ViewHolder)mState.b.b(j1);
                ItemHolderInfo itemholderinfo1 = (ItemHolderInfo)mState.b.c(j1);
                ItemHolderInfo itemholderinfo2 = (ItemHolderInfo)mState.a.get(obj2);
                if (itemholderinfo2 == null || itemholderinfo1 == null || itemholderinfo2.b == itemholderinfo1.b && itemholderinfo2.c == itemholderinfo1.c)
                {
                    continue;
                }
                ((ViewHolder) (obj2)).setIsRecyclable(false);
                if (mItemAnimator.a(((ViewHolder) (obj2)), itemholderinfo2.b, itemholderinfo2.c, itemholderinfo1.b, itemholderinfo1.c))
                {
                    postAnimationRunner();
                }
            }

            View view2;
            if (mState.c != null)
            {
                j1 = mState.c.size();
            } else
            {
                j1 = 0;
            }
            j1--;
        }
        if (j1 < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l5 = ((Long)mState.c.b(j1)).longValue();
        obj2 = (ViewHolder)mState.c.get(Long.valueOf(l5));
        view2 = ((ViewHolder) (obj2)).itemView;
        if (!((ViewHolder) (obj2)).shouldIgnore() && Recycler.a(mRecycler) != null && Recycler.a(mRecycler).contains(obj2))
        {
            animateChange(((ViewHolder) (obj2)), (ViewHolder)((ArrayMap) (obj1)).get(Long.valueOf(l5)));
        }
        j1--;
        if (true) goto _L15; else goto _L14
_L15:
        break MISSING_BLOCK_LABEL_1445;
_L14:
        resumeRequestLayout(false);
        mLayout.b(mRecycler);
        State.c(mState, mState.e);
        mDataSetHasChangedAfterLayout = false;
        State.c(mState, false);
        State.d(mState, false);
        onExitLayoutOrScroll();
        LayoutManager.a(mLayout, false);
        if (Recycler.a(mRecycler) != null)
        {
            Recycler.a(mRecycler).clear();
        }
        mState.c = null;
        if (didChildRangeChange(mMinMaxLayoutPositions[0], mMinMaxLayoutPositions[1]))
        {
            dispatchOnScrolled(0, 0);
            return;
        }
          goto _L16
_L4:
        clearOldPositions();
        mAdapterHelper.e();
        if (mState.c != null)
        {
            i2 = mChildHelper.b();
            for (l = 0; l < i2; l++)
            {
                obj1 = getChildViewHolderInt(mChildHelper.b(l));
                if (((ViewHolder) (obj1)).isChanged() && !((ViewHolder) (obj1)).isRemoved() && !((ViewHolder) (obj1)).shouldIgnore())
                {
                    l3 = getChangedHolderKey(((ViewHolder) (obj1)));
                    mState.c.put(Long.valueOf(l3), obj1);
                    mState.a.remove(obj1);
                }
            }

        }
        obj2 = null;
          goto _L17
        i2 = 0;
          goto _L18
    }

    public boolean dispatchNestedFling(float f, float f1, boolean flag)
    {
        return mScrollingChildHelper.a(f, f1, flag);
    }

    public boolean dispatchNestedPreFling(float f, float f1)
    {
        return mScrollingChildHelper.a(f, f1);
    }

    public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
    {
        return mScrollingChildHelper.a(i, j, ai, ai1);
    }

    public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
    {
        return mScrollingChildHelper.a(i, j, k, l, ai);
    }

    void dispatchOnScrollStateChanged(int i)
    {
        if (mLayout != null)
        {
            mLayout.j(i);
        }
        onScrollStateChanged(i);
        if (mScrollListener != null)
        {
            mScrollListener.onScrollStateChanged(this, i);
        }
        if (mScrollListeners != null)
        {
            for (int j = mScrollListeners.size() - 1; j >= 0; j--)
            {
                ((OnScrollListener)mScrollListeners.get(j)).onScrollStateChanged(this, i);
            }

        }
    }

    void dispatchOnScrolled(int i, int j)
    {
        int k = getScrollX();
        int i1 = getScrollY();
        onScrollChanged(k, i1, k, i1);
        onScrolled(i, j);
        if (mScrollListener != null)
        {
            mScrollListener.onScrolled(this, i, j);
        }
        if (mScrollListeners != null)
        {
            for (int l = mScrollListeners.size() - 1; l >= 0; l--)
            {
                ((OnScrollListener)mScrollListeners.get(l)).onScrolled(this, i, j);
            }

        }
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        boolean flag1 = false;
        super.draw(canvas);
        int k = mItemDecorations.size();
        for (int i = 0; i < k; i++)
        {
            ((ItemDecoration)mItemDecorations.get(i)).onDrawOver(canvas, this, mState);
        }

        int j;
        if (mLeftGlow != null && !mLeftGlow.a())
        {
            int l = canvas.save();
            int i1;
            if (mClipToPadding)
            {
                j = getPaddingBottom();
            } else
            {
                j = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j + -getHeight(), 0.0F);
            if (mLeftGlow != null && mLeftGlow.a(canvas))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            canvas.restoreToCount(l);
        } else
        {
            k = 0;
        }
        j = k;
        if (mTopGlow != null)
        {
            j = k;
            if (!mTopGlow.a())
            {
                l = canvas.save();
                if (mClipToPadding)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (mTopGlow != null && mTopGlow.a(canvas))
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                j = k | j;
                canvas.restoreToCount(l);
            }
        }
        k = j;
        if (mRightGlow != null)
        {
            k = j;
            if (!mRightGlow.a())
            {
                l = canvas.save();
                i1 = getWidth();
                if (mClipToPadding)
                {
                    k = getPaddingTop();
                } else
                {
                    k = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k, -i1);
                if (mRightGlow != null && mRightGlow.a(canvas))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                k = j | k;
                canvas.restoreToCount(l);
            }
        }
        j = k;
        if (mBottomGlow != null)
        {
            j = k;
            if (!mBottomGlow.a())
            {
                l = canvas.save();
                canvas.rotate(180F);
                if (mClipToPadding)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j = ((flag1) ? 1 : 0);
                if (mBottomGlow != null)
                {
                    j = ((flag1) ? 1 : 0);
                    if (mBottomGlow.a(canvas))
                    {
                        j = 1;
                    }
                }
                j = k | j;
                canvas.restoreToCount(l);
            }
        }
        if (j == 0 && mItemAnimator != null && mItemDecorations.size() > 0 && mItemAnimator.b())
        {
            j = ((flag) ? 1 : 0);
        }
        if (j != 0)
        {
            ViewCompat.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l)
    {
        return super.drawChild(canvas, view, l);
    }

    void eatRequestLayout()
    {
        if (!mEatRequestLayout)
        {
            mEatRequestLayout = true;
            if (!mLayoutFrozen)
            {
                mLayoutRequestEaten = false;
            }
        }
    }

    void ensureBottomGlow()
    {
        if (mBottomGlow != null)
        {
            return;
        }
        mBottomGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mBottomGlow.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mBottomGlow.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    void ensureLeftGlow()
    {
        if (mLeftGlow != null)
        {
            return;
        }
        mLeftGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mLeftGlow.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mLeftGlow.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureRightGlow()
    {
        if (mRightGlow != null)
        {
            return;
        }
        mRightGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mRightGlow.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            mRightGlow.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    void ensureTopGlow()
    {
        if (mTopGlow != null)
        {
            return;
        }
        mTopGlow = new EdgeEffectCompat(getContext());
        if (mClipToPadding)
        {
            mTopGlow.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            mTopGlow.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public View findChildViewUnder(float f, float f1)
    {
        for (int i = mChildHelper.b() - 1; i >= 0; i--)
        {
            View view = mChildHelper.b(i);
            float f2 = ViewCompat.k(view);
            float f3 = ViewCompat.l(view);
            if (f >= (float)view.getLeft() + f2 && f <= f2 + (float)view.getRight() && f1 >= (float)view.getTop() + f3 && f1 <= (float)view.getBottom() + f3)
            {
                return view;
            }
        }

        return null;
    }

    public ViewHolder findViewHolderForAdapterPosition(int i)
    {
        if (!mDataSetHasChangedAfterLayout)
        {
            int k = mChildHelper.c();
            int j = 0;
            while (j < k) 
            {
                ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(j));
                if (viewholder != null && !viewholder.isRemoved() && getAdapterPositionFor(viewholder) == i)
                {
                    return viewholder;
                }
                j++;
            }
        }
        return null;
    }

    public ViewHolder findViewHolderForItemId(long l)
    {
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i));
            if (viewholder != null && viewholder.getItemId() == l)
            {
                return viewholder;
            }
        }

        return null;
    }

    public ViewHolder findViewHolderForLayoutPosition(int i)
    {
        return findViewHolderForPosition(i, false);
    }

    public ViewHolder findViewHolderForPosition(int i)
    {
        return findViewHolderForPosition(i, false);
    }

    ViewHolder findViewHolderForPosition(int i, boolean flag)
    {
        int k = mChildHelper.c();
        for (int j = 0; j < k; j++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(j));
            if (viewholder != null && !viewholder.isRemoved() && (flag ? viewholder.mPosition == i : viewholder.getLayoutPosition() == i))
            {
                return viewholder;
            }
        }

        return null;
    }

    public boolean fling(int i, int j)
    {
        if (mLayout != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L4:
        return false;
_L2:
        int k;
        boolean flag;
        boolean flag1;
label0:
        {
            if (mLayoutFrozen)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = mLayout.c();
            flag1 = mLayout.d();
            if (flag)
            {
                k = i;
                if (Math.abs(i) >= mMinFlingVelocity)
                {
                    break label0;
                }
            }
            k = 0;
        }
        if (flag1)
        {
            i = j;
            if (Math.abs(j) >= mMinFlingVelocity)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = 0;
        if (k == 0 && i == 0 || dispatchNestedPreFling(k, i)) goto _L4; else goto _L3
_L3:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(k, i, flag);
        if (flag)
        {
            j = Math.max(-mMaxFlingVelocity, Math.min(k, mMaxFlingVelocity));
            i = Math.max(-mMaxFlingVelocity, Math.min(i, mMaxFlingVelocity));
            mViewFlinger.a(j, i);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public View focusSearch(View view, int i)
    {
        View view2 = mLayout.d(view, i);
        if (view2 == null)
        {
            view2 = FocusFinder.getInstance().findNextFocus(this, view, i);
            View view1 = view2;
            if (view2 == null)
            {
                view1 = view2;
                if (mAdapter != null)
                {
                    view1 = view2;
                    if (mLayout != null)
                    {
                        view1 = view2;
                        if (!isComputingLayout())
                        {
                            view1 = view2;
                            if (!mLayoutFrozen)
                            {
                                eatRequestLayout();
                                view1 = mLayout.a(view, i, mRecycler, mState);
                                resumeRequestLayout(false);
                            }
                        }
                    }
                }
            }
            view2 = view1;
            if (view1 == null)
            {
                return super.focusSearch(view, i);
            }
        }
        return view2;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.a();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.a(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (mLayout == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return mLayout.a(layoutparams);
        }
    }

    public Adapter getAdapter()
    {
        return mAdapter;
    }

    public int getBaseline()
    {
        if (mLayout != null)
        {
            return mLayout.p();
        } else
        {
            return super.getBaseline();
        }
    }

    long getChangedHolderKey(ViewHolder viewholder)
    {
        if (mAdapter.hasStableIds())
        {
            return viewholder.getItemId();
        } else
        {
            return (long)viewholder.mPosition;
        }
    }

    public int getChildAdapterPosition(View view)
    {
        view = getChildViewHolderInt(view);
        if (view != null)
        {
            return view.getAdapterPosition();
        } else
        {
            return -1;
        }
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        if (mChildDrawingOrderCallback == null)
        {
            return super.getChildDrawingOrder(i, j);
        } else
        {
            return mChildDrawingOrderCallback.a(i, j);
        }
    }

    public long getChildItemId(View view)
    {
        if (mAdapter != null && mAdapter.hasStableIds())
        {
            if ((view = getChildViewHolderInt(view)) != null)
            {
                return view.getItemId();
            }
        }
        return -1L;
    }

    public int getChildLayoutPosition(View view)
    {
        view = getChildViewHolderInt(view);
        if (view != null)
        {
            return view.getLayoutPosition();
        } else
        {
            return -1;
        }
    }

    public int getChildPosition(View view)
    {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return getChildViewHolderInt(view);
        }
    }

    public RecyclerViewAccessibilityDelegate getCompatAccessibilityDelegate()
    {
        return mAccessibilityDelegate;
    }

    public ItemAnimator getItemAnimator()
    {
        return mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.c)
        {
            return layoutparams.b;
        }
        Rect rect = layoutparams.b;
        rect.set(0, 0, 0, 0);
        int j = mItemDecorations.size();
        for (int i = 0; i < j; i++)
        {
            mTempRect.set(0, 0, 0, 0);
            ((ItemDecoration)mItemDecorations.get(i)).getItemOffsets(mTempRect, view, this, mState);
            rect.left = rect.left + mTempRect.left;
            rect.top = rect.top + mTempRect.top;
            rect.right = rect.right + mTempRect.right;
            rect.bottom = rect.bottom + mTempRect.bottom;
        }

        layoutparams.c = false;
        return rect;
    }

    public LayoutManager getLayoutManager()
    {
        return mLayout;
    }

    public int getMaxFlingVelocity()
    {
        return mMaxFlingVelocity;
    }

    public int getMinFlingVelocity()
    {
        return mMinFlingVelocity;
    }

    public RecycledViewPool getRecycledViewPool()
    {
        return mRecycler.f();
    }

    public int getScrollState()
    {
        return mScrollState;
    }

    public boolean hasFixedSize()
    {
        return mHasFixedSize;
    }

    public boolean hasNestedScrollingParent()
    {
        return mScrollingChildHelper.b();
    }

    public boolean hasPendingAdapterUpdates()
    {
        return !mFirstLayoutComplete || mDataSetHasChangedAfterLayout || mAdapterHelper.d();
    }

    void initAdapterManager()
    {
        mAdapterHelper = new AdapterHelper(new AdapterHelper.Callback() {

            final RecyclerView a;

            public ViewHolder a(int i)
            {
                ViewHolder viewholder;
                for (viewholder = a.findViewHolderForPosition(i, true); viewholder == null || a.mChildHelper.c(viewholder.itemView);)
                {
                    return null;
                }

                return viewholder;
            }

            public void a(int i, int j)
            {
                a.offsetPositionRecordsForRemove(i, j, true);
                a.mItemsAddedOrRemoved = true;
                State.a(a.mState, j);
            }

            public void a(int i, int j, Object obj)
            {
                a.viewRangeUpdate(i, j, obj);
                a.mItemsChanged = true;
            }

            public void a(AdapterHelper.UpdateOp updateop)
            {
                c(updateop);
            }

            public void b(int i, int j)
            {
                a.offsetPositionRecordsForRemove(i, j, false);
                a.mItemsAddedOrRemoved = true;
            }

            public void b(AdapterHelper.UpdateOp updateop)
            {
                c(updateop);
            }

            public void c(int i, int j)
            {
                a.offsetPositionRecordsForInsert(i, j);
                a.mItemsAddedOrRemoved = true;
            }

            void c(AdapterHelper.UpdateOp updateop)
            {
                switch (updateop.a)
                {
                default:
                    return;

                case 0: // '\0'
                    a.mLayout.a(a, updateop.b, updateop.d);
                    return;

                case 1: // '\001'
                    a.mLayout.b(a, updateop.b, updateop.d);
                    return;

                case 2: // '\002'
                    a.mLayout.a(a, updateop.b, updateop.d, updateop.c);
                    return;

                case 3: // '\003'
                    a.mLayout.a(a, updateop.b, updateop.d, 1);
                    break;
                }
            }

            public void d(int i, int j)
            {
                a.offsetPositionRecordsForMove(i, j);
                a.mItemsAddedOrRemoved = true;
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
    }

    void invalidateGlows()
    {
        mBottomGlow = null;
        mTopGlow = null;
        mRightGlow = null;
        mLeftGlow = null;
    }

    public void invalidateItemDecorations()
    {
        if (mItemDecorations.size() == 0)
        {
            return;
        }
        if (mLayout != null)
        {
            mLayout.a("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled()
    {
        return mAccessibilityManager != null && mAccessibilityManager.isEnabled();
    }

    public boolean isAnimating()
    {
        return mItemAnimator != null && mItemAnimator.b();
    }

    public boolean isAttachedToWindow()
    {
        return mIsAttached;
    }

    public boolean isComputingLayout()
    {
        return mLayoutOrScrollCounter > 0;
    }

    public boolean isLayoutFrozen()
    {
        return mLayoutFrozen;
    }

    public boolean isNestedScrollingEnabled()
    {
        return mScrollingChildHelper.a();
    }

    void markItemDecorInsetsDirty()
    {
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ((LayoutParams)mChildHelper.c(i).getLayoutParams()).c = true;
        }

        mRecycler.j();
    }

    void markKnownViewsInvalid()
    {
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                viewholder.addFlags(6);
            }
        }

        markItemDecorInsetsDirty();
        mRecycler.h();
    }

    public void offsetChildrenHorizontal(int i)
    {
        int k = mChildHelper.b();
        for (int j = 0; j < k; j++)
        {
            mChildHelper.b(j).offsetLeftAndRight(i);
        }

    }

    public void offsetChildrenVertical(int i)
    {
        int k = mChildHelper.b();
        for (int j = 0; j < k; j++)
        {
            mChildHelper.b(j).offsetTopAndBottom(i);
        }

    }

    void offsetPositionRecordsForInsert(int i, int j)
    {
        int l = mChildHelper.c();
        for (int k = 0; k < l; k++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(k));
            if (viewholder != null && !viewholder.shouldIgnore() && viewholder.mPosition >= i)
            {
                viewholder.offsetPosition(j, false);
                State.a(mState, true);
            }
        }

        mRecycler.b(i, j);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i, int j)
    {
        int j1 = mChildHelper.c();
        byte byte0;
        int k;
        int l;
        int i1;
        if (i < j)
        {
            byte0 = -1;
            k = j;
            l = i;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        i1 = 0;
        while (i1 < j1) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i1));
            if (viewholder != null && viewholder.mPosition >= l && viewholder.mPosition <= k)
            {
                if (viewholder.mPosition == i)
                {
                    viewholder.offsetPosition(j - i, false);
                } else
                {
                    viewholder.offsetPosition(byte0, false);
                }
                State.a(mState, true);
            }
            i1++;
        }
        mRecycler.a(i, j);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i, int j, boolean flag)
    {
        int l = mChildHelper.c();
        int k = 0;
        while (k < l) 
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(k));
            if (viewholder != null && !viewholder.shouldIgnore())
            {
                if (viewholder.mPosition >= i + j)
                {
                    viewholder.offsetPosition(-j, flag);
                    State.a(mState, true);
                } else
                if (viewholder.mPosition >= i)
                {
                    viewholder.flagRemovedAndOffsetPosition(i - 1, -j, flag);
                    State.a(mState, true);
                }
            }
            k++;
        }
        mRecycler.b(i, j, flag);
        requestLayout();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mLayoutOrScrollCounter = 0;
        mIsAttached = true;
        mFirstLayoutComplete = false;
        if (mLayout != null)
        {
            mLayout.b(this);
        }
        mPostedAnimatorRunner = false;
    }

    public void onChildAttachedToWindow(View view)
    {
    }

    public void onChildDetachedFromWindow(View view)
    {
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mItemAnimator != null)
        {
            mItemAnimator.c();
        }
        mFirstLayoutComplete = false;
        stopScroll();
        mIsAttached = false;
        if (mLayout != null)
        {
            mLayout.b(this, mRecycler);
        }
        removeCallbacks(mItemAnimatorRunner);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j = mItemDecorations.size();
        for (int i = 0; i < j; i++)
        {
            ((ItemDecoration)mItemDecorations.get(i)).onDraw(canvas, this, mState);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        if (mLayout != null && !mLayoutFrozen && (MotionEventCompat.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f;
            float f1;
            if (mLayout.d())
            {
                f = -MotionEventCompat.e(motionevent, 9);
            } else
            {
                f = 0.0F;
            }
            if (mLayout.c())
            {
                f1 = MotionEventCompat.e(motionevent, 10);
            } else
            {
                f1 = 0.0F;
            }
            if (f != 0.0F || f1 != 0.0F)
            {
                float f2 = getScrollFactor();
                scrollByInternal((int)(f1 * f2), (int)(f * f2), motionevent);
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        byte byte0;
        boolean flag;
        byte0 = -1;
        flag = true;
        if (!mLayoutFrozen) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (dispatchOnItemTouchIntercept(motionevent))
        {
            cancelTouch();
            return true;
        }
        if (mLayout == null) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        boolean flag1;
        boolean flag2;
        flag1 = mLayout.c();
        flag2 = mLayout.d();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        mVelocityTracker.addMovement(motionevent);
        j = MotionEventCompat.a(motionevent);
        i = MotionEventCompat.b(motionevent);
        j;
        JVM INSTR tableswitch 0 6: default 128
    //                   0 139
    //                   1 542
    //                   2 304
    //                   3 556
    //                   4 128
    //                   5 250
    //                   6 534;
           goto _L4 _L5 _L6 _L7 _L8 _L4 _L9 _L10
_L4:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_556;
_L11:
        int k;
        int l;
        int i1;
        if (mScrollState != 1)
        {
            flag = false;
        }
        return flag;
_L5:
        if (mIgnoreMotionEventTillDown)
        {
            mIgnoreMotionEventTillDown = false;
        }
        mScrollPointerId = MotionEventCompat.b(motionevent, 0);
        i = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i;
        mInitialTouchX = i;
        i = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        if (mScrollState == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            setScrollState(1);
        }
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = i;
        if (flag2)
        {
            k = i | 2;
        }
        startNestedScroll(k);
          goto _L11
_L9:
        mScrollPointerId = MotionEventCompat.b(motionevent, i);
        k = (int)(MotionEventCompat.c(motionevent, i) + 0.5F);
        mLastTouchX = k;
        mInitialTouchX = k;
        i = (int)(MotionEventCompat.d(motionevent, i) + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
          goto _L11
_L7:
        k = MotionEventCompat.a(motionevent, mScrollPointerId);
        if (k < 0)
        {
            Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i = (int)(MotionEventCompat.c(motionevent, k) + 0.5F);
        k = (int)(MotionEventCompat.d(motionevent, k) + 0.5F);
        if (mScrollState != 1)
        {
            i -= mInitialTouchX;
            l = k - mInitialTouchY;
            if (flag1 && Math.abs(i) > mTouchSlop)
            {
                k = mInitialTouchX;
                i1 = mTouchSlop;
                if (i < 0)
                {
                    i = -1;
                } else
                {
                    i = 1;
                }
                mLastTouchX = i * i1 + k;
                i = 1;
            } else
            {
                i = 0;
            }
            k = i;
            if (flag2)
            {
                k = i;
                if (Math.abs(l) > mTouchSlop)
                {
                    k = mInitialTouchY;
                    i1 = mTouchSlop;
                    if (l < 0)
                    {
                        i = byte0;
                    } else
                    {
                        i = 1;
                    }
                    mLastTouchY = k + i * i1;
                    k = 1;
                }
            }
            if (k != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        }
          goto _L11
_L10:
        onPointerUp(motionevent);
          goto _L11
_L6:
        mVelocityTracker.clear();
        stopNestedScroll();
          goto _L11
        cancelTouch();
          goto _L11
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        eatRequestLayout();
        TraceCompat.a("RV OnLayout");
        dispatchLayout();
        TraceCompat.a();
        resumeRequestLayout(false);
        mFirstLayoutComplete = true;
    }

    protected void onMeasure(int i, int j)
    {
        if (mAdapterUpdateDuringMeasure)
        {
            eatRequestLayout();
            processAdapterUpdatesAndSetAnimationFlags();
            if (State.a(mState))
            {
                State.b(mState, true);
            } else
            {
                mAdapterHelper.e();
                State.b(mState, false);
            }
            mAdapterUpdateDuringMeasure = false;
            resumeRequestLayout(false);
        }
        if (mAdapter != null)
        {
            mState.e = mAdapter.getItemCount();
        } else
        {
            mState.e = 0;
        }
        if (mLayout == null)
        {
            defaultOnMeasure(i, j);
        } else
        {
            mLayout.a(mRecycler, mState, i, j);
        }
        State.b(mState, false);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        mPendingSavedState = (SavedState)parcelable;
        super.onRestoreInstanceState(mPendingSavedState.getSuperState());
        if (mLayout != null && mPendingSavedState.a != null)
        {
            mLayout.a(mPendingSavedState.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (mPendingSavedState != null)
        {
            SavedState.a(savedstate, mPendingSavedState);
            return savedstate;
        }
        if (mLayout != null)
        {
            savedstate.a = mLayout.b();
            return savedstate;
        } else
        {
            savedstate.a = null;
            return savedstate;
        }
    }

    public void onScrollStateChanged(int i)
    {
    }

    public void onScrolled(int i, int j)
    {
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i != k || j != l)
        {
            invalidateGlows();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = false;
        if (!mLayoutFrozen && !mIgnoreMotionEventTillDown) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (dispatchOnItemTouch(motionevent))
        {
            cancelTouch();
            return true;
        }
        if (mLayout == null) goto _L1; else goto _L3
_L3:
        MotionEvent motionevent1;
        int i;
        int j;
        int k;
        boolean flag1;
        boolean flag2;
        flag1 = mLayout.c();
        flag2 = mLayout.d();
        if (mVelocityTracker == null)
        {
            mVelocityTracker = VelocityTracker.obtain();
        }
        motionevent1 = MotionEvent.obtain(motionevent);
        k = MotionEventCompat.a(motionevent);
        j = MotionEventCompat.b(motionevent);
        if (k == 0)
        {
            int ai[] = mNestedOffsets;
            mNestedOffsets[1] = 0;
            ai[0] = 0;
        }
        motionevent1.offsetLocation(mNestedOffsets[0], mNestedOffsets[1]);
        i = ((flag) ? 1 : 0);
        k;
        JVM INSTR tableswitch 0 6: default 180
    //                   0 205
    //                   1 836
    //                   2 364
    //                   3 944
    //                   4 184
    //                   5 297
    //                   6 824;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L9:
        break; /* Loop/switch isn't completed */
_L4:
        i = ((flag) ? 1 : 0);
_L13:
        if (i == 0)
        {
            mVelocityTracker.addMovement(motionevent1);
        }
        motionevent1.recycle();
        return true;
_L5:
        mScrollPointerId = MotionEventCompat.b(motionevent, 0);
        i = (int)(motionevent.getX() + 0.5F);
        mLastTouchX = i;
        mInitialTouchX = i;
        i = (int)(motionevent.getY() + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        float f;
        float f1;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (flag1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = i;
        if (flag2)
        {
            j = i | 2;
        }
        startNestedScroll(j);
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L10:
        mScrollPointerId = MotionEventCompat.b(motionevent, j);
        i = (int)(MotionEventCompat.c(motionevent, j) + 0.5F);
        mLastTouchX = i;
        mInitialTouchX = i;
        i = (int)(MotionEventCompat.d(motionevent, j) + 0.5F);
        mLastTouchY = i;
        mInitialTouchY = i;
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L7:
        i = MotionEventCompat.a(motionevent, mScrollPointerId);
        if (i < 0)
        {
            Log.e("RecyclerView", (new StringBuilder()).append("Error processing scroll; pointer index for id ").append(mScrollPointerId).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l1 = (int)(MotionEventCompat.c(motionevent, i) + 0.5F);
        i2 = (int)(MotionEventCompat.d(motionevent, i) + 0.5F);
        i1 = mLastTouchX - l1;
        l = mLastTouchY - i2;
        i = l;
        j = i1;
        if (dispatchNestedPreScroll(i1, l, mScrollConsumed, mScrollOffset))
        {
            j = i1 - mScrollConsumed[0];
            i = l - mScrollConsumed[1];
            motionevent1.offsetLocation(mScrollOffset[0], mScrollOffset[1]);
            motionevent = mNestedOffsets;
            motionevent[0] = motionevent[0] + mScrollOffset[0];
            motionevent = mNestedOffsets;
            motionevent[1] = motionevent[1] + mScrollOffset[1];
        }
        l = i;
        i1 = j;
        if (mScrollState != 1)
        {
            if (flag1 && Math.abs(j) > mTouchSlop)
            {
                if (j > 0)
                {
                    j -= mTouchSlop;
                } else
                {
                    j += mTouchSlop;
                }
                l = 1;
            } else
            {
                l = 0;
            }
            j1 = i;
            k1 = l;
            if (flag2)
            {
                j1 = i;
                k1 = l;
                if (Math.abs(i) > mTouchSlop)
                {
                    if (i > 0)
                    {
                        j1 = i - mTouchSlop;
                    } else
                    {
                        j1 = i + mTouchSlop;
                    }
                    k1 = 1;
                }
            }
            l = j1;
            i1 = j;
            if (k1 != 0)
            {
                motionevent = getParent();
                if (motionevent != null)
                {
                    motionevent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
                i1 = j;
                l = j1;
            }
        }
        i = ((flag) ? 1 : 0);
        if (mScrollState == 1)
        {
            mLastTouchX = l1 - mScrollOffset[0];
            mLastTouchY = i2 - mScrollOffset[1];
            if (!flag1)
            {
                i1 = 0;
            }
            if (!flag2)
            {
                l = 0;
            }
            i = ((flag) ? 1 : 0);
            if (scrollByInternal(i1, l, motionevent1))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
                i = ((flag) ? 1 : 0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L11:
        onPointerUp(motionevent);
        i = ((flag) ? 1 : 0);
        continue; /* Loop/switch isn't completed */
_L6:
        mVelocityTracker.addMovement(motionevent1);
        mVelocityTracker.computeCurrentVelocity(1000, mMaxFlingVelocity);
        if (flag1)
        {
            f = -VelocityTrackerCompat.a(mVelocityTracker, mScrollPointerId);
        } else
        {
            f = 0.0F;
        }
        if (flag2)
        {
            f1 = -VelocityTrackerCompat.b(mVelocityTracker, mScrollPointerId);
        } else
        {
            f1 = 0.0F;
        }
        if (f == 0.0F && f1 == 0.0F || !fling((int)f, (int)f1))
        {
            setScrollState(0);
        }
        resetTouch();
        i = 1;
        continue; /* Loop/switch isn't completed */
_L8:
        cancelTouch();
        i = ((flag) ? 1 : 0);
        if (true) goto _L13; else goto _L12
_L12:
    }

    void rebindUpdatedViewHolders()
    {
        int i;
        int j;
        j = mChildHelper.b();
        i = 0;
_L2:
        ViewHolder viewholder;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        viewholder = getChildViewHolderInt(mChildHelper.b(i));
        if (viewholder != null && !viewholder.shouldIgnore())
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (viewholder.isRemoved() || viewholder.isInvalid())
        {
            requestLayout();
        } else
        if (viewholder.needsUpdate())
        {
label0:
            {
                int k = mAdapter.getItemViewType(viewholder.mPosition);
                if (viewholder.getItemViewType() != k)
                {
                    break label0;
                }
                if (!viewholder.isChanged() || !supportsChangeAnimations())
                {
                    mAdapter.bindViewHolder(viewholder, viewholder.mPosition);
                } else
                {
                    requestLayout();
                }
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        requestLayout();
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        ViewHolder viewholder = getChildViewHolderInt(view);
        if (viewholder != null)
        {
            if (viewholder.isTmpDetached())
            {
                viewholder.clearTmpDetachFlag();
            } else
            if (!viewholder.shouldIgnore())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Called removeDetachedView with a view which is not flagged as tmp detached.").append(viewholder).toString());
            }
        }
        dispatchChildDetached(view);
        super.removeDetachedView(view, flag);
    }

    public void removeItemDecoration(ItemDecoration itemdecoration)
    {
        if (mLayout != null)
        {
            mLayout.a("Cannot remove item decoration during a scroll  or layout");
        }
        mItemDecorations.remove(itemdecoration);
        if (mItemDecorations.isEmpty())
        {
            boolean flag;
            if (ViewCompat.a(this) == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setWillNotDraw(flag);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(OnChildAttachStateChangeListener onchildattachstatechangelistener)
    {
        if (mOnChildAttachStateListeners == null)
        {
            return;
        } else
        {
            mOnChildAttachStateListeners.remove(onchildattachstatechangelistener);
            return;
        }
    }

    public void removeOnItemTouchListener(OnItemTouchListener onitemtouchlistener)
    {
        mOnItemTouchListeners.remove(onitemtouchlistener);
        if (mActiveOnItemTouchListener == onitemtouchlistener)
        {
            mActiveOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(OnScrollListener onscrolllistener)
    {
        if (mScrollListeners != null)
        {
            mScrollListeners.remove(onscrolllistener);
        }
    }

    public void requestChildFocus(View view, View view1)
    {
        if (!mLayout.a(this, mState, view, view1) && view1 != null)
        {
            mTempRect.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).c)
                {
                    obj = ((LayoutParams) (obj)).b;
                    Rect rect = mTempRect;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = mTempRect;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = mTempRect;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = mTempRect;
                    int i = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i;
                }
            }
            offsetDescendantRectToMyCoords(view1, mTempRect);
            offsetRectIntoDescendantCoords(view, mTempRect);
            obj = mTempRect;
            boolean flag;
            if (!mFirstLayoutComplete)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            requestChildRectangleOnScreen(view, ((Rect) (obj)), flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        return mLayout.a(this, view, rect, flag);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j = mOnItemTouchListeners.size();
        for (int i = 0; i < j; i++)
        {
            ((OnItemTouchListener)mOnItemTouchListeners.get(i)).a(flag);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!mEatRequestLayout && !mLayoutFrozen)
        {
            super.requestLayout();
            return;
        } else
        {
            mLayoutRequestEaten = true;
            return;
        }
    }

    void resumeRequestLayout(boolean flag)
    {
        if (mEatRequestLayout)
        {
            if (flag && mLayoutRequestEaten && !mLayoutFrozen && mLayout != null && mAdapter != null)
            {
                dispatchLayout();
            }
            mEatRequestLayout = false;
            if (!mLayoutFrozen)
            {
                mLayoutRequestEaten = false;
            }
        }
    }

    void saveOldPositions()
    {
        int j = mChildHelper.c();
        for (int i = 0; i < j; i++)
        {
            ViewHolder viewholder = getChildViewHolderInt(mChildHelper.c(i));
            if (!viewholder.shouldIgnore())
            {
                viewholder.saveOldPosition();
            }
        }

    }

    public void scrollBy(int i, int j)
    {
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!mLayoutFrozen)
        {
            boolean flag = mLayout.c();
            boolean flag1 = mLayout.d();
            if (flag || flag1)
            {
                if (!flag)
                {
                    i = 0;
                }
                if (!flag1)
                {
                    j = 0;
                }
                scrollByInternal(i, j, null);
                return;
            }
        }
    }

    boolean scrollByInternal(int i, int j, MotionEvent motionevent)
    {
        int l = 0;
        boolean flag2 = false;
        int j1 = 0;
        boolean flag = false;
        int k = 0;
        boolean flag3 = false;
        int i1 = 0;
        boolean flag1 = false;
        consumePendingUpdateOperations();
        if (mAdapter != null)
        {
            eatRequestLayout();
            onEnterLayoutOrScroll();
            TraceCompat.a("RV Scroll");
            k = ((flag3) ? 1 : 0);
            l = ((flag2) ? 1 : 0);
            if (i != 0)
            {
                k = mLayout.a(i, mRecycler, mState);
                l = i - k;
            }
            i1 = ((flag1) ? 1 : 0);
            j1 = ((flag) ? 1 : 0);
            if (j != 0)
            {
                i1 = mLayout.b(j, mRecycler, mState);
                j1 = j - i1;
            }
            TraceCompat.a();
            if (supportsChangeAnimations())
            {
                int l1 = mChildHelper.b();
                int k1 = 0;
                while (k1 < l1) 
                {
                    View view = mChildHelper.b(k1);
                    Object obj = getChildViewHolder(view);
                    if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((ViewHolder) (obj)).mShadowingHolder;
                    int i2;
                    int j2;
                    if (obj != null)
                    {
                        obj = ((ViewHolder) (obj)).itemView;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i2 = view.getLeft();
                    j2 = view.getTop();
                    if (i2 != ((View) (obj)).getLeft() || j2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i2, j2, ((View) (obj)).getWidth() + i2, ((View) (obj)).getHeight() + j2);
                    }
                    k1++;
                }
            }
            onExitLayoutOrScroll();
            resumeRequestLayout(false);
        }
        if (!mItemDecorations.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k, i1, l, j1, mScrollOffset))
        {
            mLastTouchX = mLastTouchX - mScrollOffset[0];
            mLastTouchY = mLastTouchY - mScrollOffset[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(mScrollOffset[0], mScrollOffset[1]);
            }
            motionevent = mNestedOffsets;
            motionevent[0] = motionevent[0] + mScrollOffset[0];
            motionevent = mNestedOffsets;
            motionevent[1] = motionevent[1] + mScrollOffset[1];
        } else
        if (ViewCompat.a(this) != 2)
        {
            if (motionevent != null)
            {
                pullGlows(motionevent.getX(), l, motionevent.getY(), j1);
            }
            considerReleasingGlowsOnScroll(i, j);
        }
        if (k != 0 || i1 != 0)
        {
            dispatchOnScrolled(k, i1);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k != 0 || i1 != 0;
    }

    public void scrollTo(int i, int j)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void scrollToPosition(int i)
    {
        if (mLayoutFrozen)
        {
            return;
        }
        stopScroll();
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            mLayout.d(i);
            awakenScrollBars();
            return;
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        if (shouldDeferAccessibilityEvent(accessibilityevent))
        {
            return;
        } else
        {
            super.sendAccessibilityEventUnchecked(accessibilityevent);
            return;
        }
    }

    public void setAccessibilityDelegateCompat(RecyclerViewAccessibilityDelegate recyclerviewaccessibilitydelegate)
    {
        mAccessibilityDelegate = recyclerviewaccessibilitydelegate;
        ViewCompat.a(this, mAccessibilityDelegate);
    }

    public void setAdapter(Adapter adapter)
    {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ChildDrawingOrderCallback childdrawingordercallback)
    {
        if (childdrawingordercallback == mChildDrawingOrderCallback)
        {
            return;
        }
        mChildDrawingOrderCallback = childdrawingordercallback;
        boolean flag;
        if (mChildDrawingOrderCallback != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChildrenDrawingOrderEnabled(flag);
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != mClipToPadding)
        {
            invalidateGlows();
        }
        mClipToPadding = flag;
        super.setClipToPadding(flag);
        if (mFirstLayoutComplete)
        {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean flag)
    {
        mHasFixedSize = flag;
    }

    public void setItemAnimator(ItemAnimator itemanimator)
    {
        if (mItemAnimator != null)
        {
            mItemAnimator.c();
            mItemAnimator.a(null);
        }
        mItemAnimator = itemanimator;
        if (mItemAnimator != null)
        {
            mItemAnimator.a(mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i)
    {
        mRecycler.a(i);
    }

    public void setLayoutFrozen(boolean flag)
    {
label0:
        {
            if (flag != mLayoutFrozen)
            {
                assertNotInLayoutOrScroll("Do not setLayoutFrozen in layout or scroll");
                if (flag)
                {
                    break label0;
                }
                mLayoutFrozen = flag;
                if (mLayoutRequestEaten && mLayout != null && mAdapter != null)
                {
                    requestLayout();
                }
                mLayoutRequestEaten = false;
            }
            return;
        }
        long l = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0));
        mLayoutFrozen = flag;
        mIgnoreMotionEventTillDown = true;
        stopScroll();
    }

    public void setLayoutManager(LayoutManager layoutmanager)
    {
        if (layoutmanager == mLayout)
        {
            return;
        }
        if (mLayout != null)
        {
            if (mIsAttached)
            {
                mLayout.b(this, mRecycler);
            }
            mLayout.a(null);
        }
        mRecycler.a();
        mChildHelper.a();
        mLayout = layoutmanager;
        if (layoutmanager != null)
        {
            if (layoutmanager.i != null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("LayoutManager ").append(layoutmanager).append(" is already attached to a RecyclerView: ").append(layoutmanager.i).toString());
            }
            mLayout.a(this);
            if (mIsAttached)
            {
                mLayout.b(this);
            }
        }
        requestLayout();
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        mScrollingChildHelper.a(flag);
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        mScrollListener = onscrolllistener;
    }

    public void setRecycledViewPool(RecycledViewPool recycledviewpool)
    {
        mRecycler.a(recycledviewpool);
    }

    public void setRecyclerListener(RecyclerListener recyclerlistener)
    {
        mRecyclerListener = recyclerlistener;
    }

    public void setScrollingTouchSlop(int i)
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        switch (i)
        {
        default:
            Log.w("RecyclerView", (new StringBuilder()).append("setScrollingTouchSlop(): bad argument constant ").append(i).append("; using default value").toString());
            // fall through

        case 0: // '\0'
            mTouchSlop = viewconfiguration.getScaledTouchSlop();
            return;

        case 1: // '\001'
            mTouchSlop = ViewConfigurationCompat.a(viewconfiguration);
            break;
        }
    }

    public void setViewCacheExtension(ViewCacheExtension viewcacheextension)
    {
        mRecycler.a(viewcacheextension);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = false;
        boolean flag = false;
        if (isComputingLayout())
        {
            int i;
            if (accessibilityevent != null)
            {
                i = AccessibilityEventCompat.b(accessibilityevent);
            } else
            {
                i = 0;
            }
            if (i == 0)
            {
                i = ((flag) ? 1 : 0);
            }
            mEatenAccessibilityChangeFlags = i | mEatenAccessibilityChangeFlags;
            flag1 = true;
        }
        return flag1;
    }

    public void smoothScrollBy(int i, int j)
    {
        boolean flag = false;
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        if (!mLayoutFrozen)
        {
            if (!mLayout.c())
            {
                i = 0;
            }
            if (!mLayout.d())
            {
                j = ((flag) ? 1 : 0);
            }
            if (i != 0 || j != 0)
            {
                mViewFlinger.b(i, j);
                return;
            }
        }
    }

    public void smoothScrollToPosition(int i)
    {
        if (mLayoutFrozen)
        {
            return;
        }
        if (mLayout == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            mLayout.a(this, mState, i);
            return;
        }
    }

    public boolean startNestedScroll(int i)
    {
        return mScrollingChildHelper.a(i);
    }

    public void stopNestedScroll()
    {
        mScrollingChildHelper.c();
    }

    public void stopScroll()
    {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(Adapter adapter, boolean flag)
    {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, flag);
        setDataSetChangedAfterLayout();
        requestLayout();
    }

    void viewRangeUpdate(int i, int j, Object obj)
    {
        int l = mChildHelper.c();
        int k = 0;
        do
        {
            if (k >= l)
            {
                break;
            }
            View view = mChildHelper.c(k);
            ViewHolder viewholder = getChildViewHolderInt(view);
            if (viewholder != null && !viewholder.shouldIgnore() && viewholder.mPosition >= i && viewholder.mPosition < i + j)
            {
                viewholder.addFlags(2);
                viewholder.addChangePayload(obj);
                if (supportsChangeAnimations())
                {
                    viewholder.addFlags(64);
                }
                ((LayoutParams)view.getLayoutParams()).c = true;
            }
            k++;
        } while (true);
        mRecycler.c(i, j);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        FORCE_INVALIDATE_DISPLAY_LIST = flag;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }





















/*
    static boolean access$3802(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mAdapterUpdateDuringMeasure = flag;
        return flag;
    }

*/










/*
    static boolean access$502(RecyclerView recyclerview, boolean flag)
    {
        recyclerview.mPostedAnimatorRunner = flag;
        return flag;
    }

*/







    private class RecyclerViewDataObserver extends AdapterDataObserver
    {
        private class AdapterDataObserver
        {

            public void a()
            {
            }

            public void a(int i, int j)
            {
            }

            public void a(int i, int j, int k)
            {
            }

            public void a(int i, int j, Object obj)
            {
                a(i, j);
            }

            public void b(int i, int j)
            {
            }

            public void c(int i, int j)
            {
            }

            public AdapterDataObserver()
            {
            }
        }


        final RecyclerView a;

        public void a()
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapter.hasStableIds())
            {
                State.a(a.mState, true);
                a.setDataSetChangedAfterLayout();
            } else
            {
                State.a(a.mState, true);
                a.setDataSetChangedAfterLayout();
            }
            if (!a.mAdapterHelper.d())
            {
                a.requestLayout();
            }
        }

        public void a(int i, int j, int k)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.a(i, j, k))
            {
                b();
            }
        }

        public void a(int i, int j, Object obj)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.a(i, j, obj))
            {
                b();
            }
        }

        void b()
        {
            if (a.mPostUpdatesOnAnimation && a.mHasFixedSize && a.mIsAttached)
            {
                ViewCompat.a(a, a.mUpdateChildViewsRunnable);
                return;
            } else
            {
                a.mAdapterUpdateDuringMeasure = true;
                a.requestLayout();
                return;
            }
        }

        public void b(int i, int j)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.b(i, j))
            {
                b();
            }
        }

        public void c(int i, int j)
        {
            a.assertNotInLayoutOrScroll(null);
            if (a.mAdapterHelper.c(i, j))
            {
                b();
            }
        }

        private RecyclerViewDataObserver()
        {
            a = RecyclerView.this;
            super();
        }

    }


    private class Recycler
    {

        final ArrayList a = new ArrayList();
        final ArrayList b = new ArrayList();
        final RecyclerView c;
        private ArrayList d;
        private final List e;
        private int f;
        private RecycledViewPool g;
        private ViewCacheExtension h;

        static ArrayList a(Recycler recycler)
        {
            return recycler.d;
        }

        private void a(ViewGroup viewgroup, boolean flag)
        {
            for (int k = viewgroup.getChildCount() - 1; k >= 0; k--)
            {
                View view = viewgroup.getChildAt(k);
                if (view instanceof ViewGroup)
                {
                    a((ViewGroup)view, true);
                }
            }

            if (!flag)
            {
                return;
            }
            if (viewgroup.getVisibility() == 4)
            {
                viewgroup.setVisibility(0);
                viewgroup.setVisibility(4);
                return;
            } else
            {
                int l = viewgroup.getVisibility();
                viewgroup.setVisibility(4);
                viewgroup.setVisibility(l);
                return;
            }
        }

        private void d(View view)
        {
            if (c.isAccessibilityEnabled())
            {
                if (ViewCompat.e(view) == 0)
                {
                    ViewCompat.c(view, 1);
                }
                if (!ViewCompat.b(view))
                {
                    ViewCompat.a(view, c.mAccessibilityDelegate.b());
                }
            }
        }

        private void f(ViewHolder viewholder)
        {
            if (viewholder.itemView instanceof ViewGroup)
            {
                a((ViewGroup)viewholder.itemView, false);
            }
        }

        ViewHolder a(int k, int l, boolean flag)
        {
            int i1;
            boolean flag1;
            int j1;
            flag1 = false;
            j1 = a.size();
            i1 = 0;
_L10:
            if (i1 >= j1) goto _L2; else goto _L1
_L1:
            Object obj = (ViewHolder)a.get(i1);
            if (((ViewHolder) (obj)).wasReturnedFromScrap() || ((ViewHolder) (obj)).getLayoutPosition() != k || ((ViewHolder) (obj)).isInvalid() || !State.d(c.mState) && ((ViewHolder) (obj)).isRemoved()) goto _L4; else goto _L3
_L3:
            if (l == -1 || ((ViewHolder) (obj)).getItemViewType() == l) goto _L6; else goto _L5
_L5:
            Log.e("RecyclerView", (new StringBuilder()).append("Scrap view for position ").append(k).append(" isn't dirty but has").append(" wrong view type! (found ").append(((ViewHolder) (obj)).getItemViewType()).append(" but expected ").append(l).append(")").toString());
_L2:
            if (!flag)
            {
                obj = c.mChildHelper.a(k, l);
                if (obj != null)
                {
                    c.mItemAnimator.c(c.getChildViewHolder(((View) (obj))));
                }
            }
            i1 = b.size();
            l = ((flag1) ? 1 : 0);
_L8:
            if (l >= i1)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = (ViewHolder)b.get(l);
            if (!((ViewHolder) (obj)).isInvalid() && ((ViewHolder) (obj)).getLayoutPosition() == k)
            {
                if (!flag)
                {
                    b.remove(l);
                }
                return ((ViewHolder) (obj));
            }
            l++;
            continue; /* Loop/switch isn't completed */
_L6:
            ((ViewHolder) (obj)).addFlags(32);
            return ((ViewHolder) (obj));
_L4:
            i1++;
            continue; /* Loop/switch isn't completed */
            if (true) goto _L8; else goto _L7
_L7:
            return null;
            if (true) goto _L10; else goto _L9
_L9:
        }

        ViewHolder a(long l, int k, boolean flag)
        {
            int i1 = a.size() - 1;
_L5:
            if (i1 < 0) goto _L2; else goto _L1
_L1:
            ViewHolder viewholder1;
            viewholder1 = (ViewHolder)a.get(i1);
            if (viewholder1.getItemId() != l || viewholder1.wasReturnedFromScrap())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (k != viewholder1.getItemViewType()) goto _L4; else goto _L3
_L3:
            ViewHolder viewholder;
            viewholder1.addFlags(32);
            viewholder = viewholder1;
            if (viewholder1.isRemoved())
            {
                viewholder = viewholder1;
                if (!c.mState.a())
                {
                    viewholder1.setFlags(2, 14);
                    viewholder = viewholder1;
                }
            }
_L8:
            return viewholder;
_L4:
            if (!flag)
            {
                a.remove(i1);
                c.removeDetachedView(viewholder1.itemView, false);
                b(viewholder1.itemView);
            }
            i1--;
              goto _L5
_L2:
            i1 = b.size() - 1;
_L9:
            if (i1 < 0) goto _L7; else goto _L6
_L6:
label0:
            {
                ViewHolder viewholder2 = (ViewHolder)b.get(i1);
                if (viewholder2.getItemId() != l)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (k != viewholder2.getItemViewType())
                {
                    break label0;
                }
                viewholder = viewholder2;
                if (!flag)
                {
                    b.remove(i1);
                    return viewholder2;
                }
            }
              goto _L8
            if (!flag)
            {
                c(i1);
            }
            i1--;
              goto _L9
_L7:
            return null;
              goto _L8
        }

        View a(int k, boolean flag)
        {
            boolean flag1 = true;
            if (k < 0 || k >= c.mState.e())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Invalid item position ").append(k).append("(").append(k).append("). Item count:").append(c.mState.e()).toString());
            }
            Object obj;
            Object obj1;
            Object obj2;
            int l;
            int i1;
            int j1;
            int k1;
            if (c.mState.a())
            {
                obj1 = e(k);
                if (obj1 != null)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
            } else
            {
                obj1 = null;
                l = 0;
            }
            obj = obj1;
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            obj1 = a(k, -1, flag);
            obj = obj1;
            if (obj1 == null) goto _L2; else goto _L3
_L3:
            if (a(((ViewHolder) (obj1)))) goto _L5; else goto _L4
_L4:
            if (flag) goto _L7; else goto _L6
_L6:
            ((ViewHolder) (obj1)).addFlags(4);
            if (!((ViewHolder) (obj1)).isScrap()) goto _L9; else goto _L8
_L8:
            c.removeDetachedView(((ViewHolder) (obj1)).itemView, false);
            ((ViewHolder) (obj1)).unScrap();
_L17:
            b(((ViewHolder) (obj1)));
_L7:
            obj = null;
_L2:
            obj2 = obj;
            j1 = l;
            if (obj != null) goto _L11; else goto _L10
_L10:
            j1 = c.mAdapterHelper.a(k);
            if (j1 < 0 || j1 >= c.mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid item position ").append(k).append("(offset:").append(j1).append(").").append("state:").append(c.mState.e()).toString());
            }
            k1 = c.mAdapter.getItemViewType(j1);
            obj1 = obj;
            i1 = l;
            if (c.mAdapter.hasStableIds())
            {
                obj = a(c.mAdapter.getItemId(j1), k1, flag);
                obj1 = obj;
                i1 = l;
                if (obj != null)
                {
                    obj.mPosition = j1;
                    i1 = 1;
                    obj1 = obj;
                }
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = obj1;
                if (h != null)
                {
                    obj2 = h.a(this, k, k1);
                    obj = obj1;
                    if (obj2 != null)
                    {
                        obj1 = c.getChildViewHolder(((View) (obj2)));
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                        }
                        obj = obj1;
                        if (((ViewHolder) (obj1)).shouldIgnore())
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj = f().a(k1);
                obj1 = obj;
                if (obj != null)
                {
                    ((ViewHolder) (obj)).resetInternal();
                    obj1 = obj;
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST)
                    {
                        f(((ViewHolder) (obj)));
                        obj1 = obj;
                    }
                }
            }
            obj2 = obj1;
            j1 = i1;
              goto _L12
_L9:
            if (((ViewHolder) (obj1)).wasReturnedFromScrap())
            {
                ((ViewHolder) (obj1)).clearReturnedFromScrapFlag();
            }
            continue; /* Loop/switch isn't completed */
_L5:
            l = 1;
            obj = obj1;
              goto _L2
_L12:
            if (obj1 != null) goto _L11; else goto _L13
_L13:
            obj1 = c.mAdapter.createViewHolder(c, k1);
            l = i1;
_L15:
            if (c.mState.a() && ((ViewHolder) (obj1)).isBound())
            {
                obj1.mPreLayoutPosition = k;
                k = 0;
            } else
            if (!((ViewHolder) (obj1)).isBound() || ((ViewHolder) (obj1)).needsUpdate() || ((ViewHolder) (obj1)).isInvalid())
            {
                i1 = c.mAdapterHelper.a(k);
                obj1.mOwnerRecyclerView = c;
                c.mAdapter.bindViewHolder(((ViewHolder) (obj1)), i1);
                d(((ViewHolder) (obj1)).itemView);
                if (c.mState.a())
                {
                    obj1.mPreLayoutPosition = k;
                }
                k = 1;
            } else
            {
                k = 0;
            }
            obj = ((ViewHolder) (obj1)).itemView.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)c.generateDefaultLayoutParams();
                ((ViewHolder) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!c.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)c.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                ((ViewHolder) (obj1)).itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.a = ((ViewHolder) (obj1));
            if (l != 0 && k != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            obj.d = flag;
            return ((ViewHolder) (obj1)).itemView;
_L11:
            l = j1;
            obj1 = obj2;
            if (true) goto _L15; else goto _L14
_L14:
            if (true) goto _L17; else goto _L16
_L16:
        }

        public void a()
        {
            a.clear();
            c();
        }

        public void a(int k)
        {
            f = k;
            for (int l = b.size() - 1; l >= 0 && b.size() > k; l--)
            {
                c(l);
            }

        }

        void a(int k, int l)
        {
            byte byte0;
            int i1;
            int j1;
            int k1;
            int l1;
            if (k < l)
            {
                byte0 = -1;
                i1 = l;
                j1 = k;
            } else
            {
                byte0 = 1;
                i1 = k;
                j1 = l;
            }
            l1 = b.size();
            k1 = 0;
            while (k1 < l1) 
            {
                ViewHolder viewholder = (ViewHolder)b.get(k1);
                if (viewholder != null && viewholder.mPosition >= j1 && viewholder.mPosition <= i1)
                {
                    if (viewholder.mPosition == k)
                    {
                        viewholder.offsetPosition(l - k, false);
                    } else
                    {
                        viewholder.offsetPosition(byte0, false);
                    }
                }
                k1++;
            }
        }

        void a(Adapter adapter, Adapter adapter1, boolean flag)
        {
            a();
            f().a(adapter, adapter1, flag);
        }

        void a(RecycledViewPool recycledviewpool)
        {
            if (g != null)
            {
                g.b();
            }
            g = recycledviewpool;
            if (recycledviewpool != null)
            {
                g.a(c.getAdapter());
            }
        }

        void a(ViewCacheExtension viewcacheextension)
        {
            h = viewcacheextension;
        }

        public void a(View view)
        {
            ViewHolder viewholder;
            viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.isTmpDetached())
            {
                c.removeDetachedView(view, false);
            }
            if (!viewholder.isScrap()) goto _L2; else goto _L1
_L1:
            viewholder.unScrap();
_L4:
            b(viewholder);
            return;
_L2:
            if (viewholder.wasReturnedFromScrap())
            {
                viewholder.clearReturnedFromScrapFlag();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        boolean a(ViewHolder viewholder)
        {
            if (!viewholder.isRemoved())
            {
                if (viewholder.mPosition < 0 || viewholder.mPosition >= c.mAdapter.getItemCount())
                {
                    throw new IndexOutOfBoundsException((new StringBuilder()).append("Inconsistency detected. Invalid view holder adapter position").append(viewholder).toString());
                }
                if (!c.mState.a() && c.mAdapter.getItemViewType(viewholder.mPosition) != viewholder.getItemViewType())
                {
                    return false;
                }
                if (c.mAdapter.hasStableIds() && viewholder.getItemId() != c.mAdapter.getItemId(viewholder.mPosition))
                {
                    return false;
                }
            }
            return true;
        }

        public View b(int k)
        {
            return a(k, false);
        }

        public List b()
        {
            return e;
        }

        void b(int k, int l)
        {
            int j1 = b.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ViewHolder viewholder = (ViewHolder)b.get(i1);
                if (viewholder != null && viewholder.getLayoutPosition() >= k)
                {
                    viewholder.offsetPosition(l, true);
                }
            }

        }

        void b(int k, int l, boolean flag)
        {
            int i1 = b.size() - 1;
            while (i1 >= 0) 
            {
                ViewHolder viewholder = (ViewHolder)b.get(i1);
                if (viewholder != null)
                {
                    if (viewholder.getLayoutPosition() >= k + l)
                    {
                        viewholder.offsetPosition(-l, flag);
                    } else
                    if (viewholder.getLayoutPosition() >= k)
                    {
                        viewholder.addFlags(8);
                        c(i1);
                    }
                }
                i1--;
            }
        }

        void b(ViewHolder viewholder)
        {
            int k;
            boolean flag1 = true;
            boolean flag = false;
            if (viewholder.isScrap() || viewholder.itemView.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("Scrapped or attached views may not be recycled. isScrap:").append(viewholder.isScrap()).append(" isAttached:");
                if (viewholder.itemView.getParent() == null)
                {
                    flag1 = false;
                }
                throw new IllegalArgumentException(stringbuilder.append(flag1).toString());
            }
            if (viewholder.isTmpDetached())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Tmp detached view should be removed from RecyclerView before it can be recycled: ").append(viewholder).toString());
            }
            if (viewholder.shouldIgnore())
            {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            }
            flag1 = viewholder.doesTransientStatePreventRecycling();
            if (c.mAdapter != null && flag1 && c.mAdapter.onFailedToRecycleView(viewholder))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (k == 0 && !viewholder.isRecyclable())
            {
                break MISSING_BLOCK_LABEL_293;
            }
            if (viewholder.hasAnyOfTheFlags(78)) goto _L2; else goto _L1
_L1:
            k = b.size();
            if (k == f && k > 0)
            {
                c(0);
            }
            if (k >= f) goto _L2; else goto _L3
_L3:
            b.add(viewholder);
            k = 1;
_L4:
            if (k == 0)
            {
                c(viewholder);
                flag = true;
            }
_L5:
            c.mState.a(viewholder);
            if (k == 0 && !flag && flag1)
            {
                viewholder.mOwnerRecyclerView = null;
            }
            return;
_L2:
            k = 0;
              goto _L4
            k = 0;
              goto _L5
        }

        void b(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.mScrapContainer = null;
            view.clearReturnedFromScrapFlag();
            b(((ViewHolder) (view)));
        }

        void c()
        {
            for (int k = b.size() - 1; k >= 0; k--)
            {
                c(k);
            }

            b.clear();
        }

        void c(int k)
        {
            c((ViewHolder)b.get(k));
            b.remove(k);
        }

        void c(int k, int l)
        {
            int i1 = b.size() - 1;
            while (i1 >= 0) 
            {
                ViewHolder viewholder = (ViewHolder)b.get(i1);
                if (viewholder != null)
                {
                    int j1 = viewholder.getLayoutPosition();
                    if (j1 >= k && j1 < k + l)
                    {
                        viewholder.addFlags(2);
                        c(i1);
                    }
                }
                i1--;
            }
        }

        void c(ViewHolder viewholder)
        {
            ViewCompat.a(viewholder.itemView, null);
            e(viewholder);
            viewholder.mOwnerRecyclerView = null;
            f().a(viewholder);
        }

        void c(View view)
        {
            view = RecyclerView.getChildViewHolderInt(view);
            view.setScrapContainer(this);
            if (!view.isChanged() || !c.supportsChangeAnimations())
            {
                if (view.isInvalid() && !view.isRemoved() && !c.mAdapter.hasStableIds())
                {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                } else
                {
                    a.add(view);
                    return;
                }
            }
            if (d == null)
            {
                d = new ArrayList();
            }
            d.add(view);
        }

        int d()
        {
            return a.size();
        }

        View d(int k)
        {
            return ((ViewHolder)a.get(k)).itemView;
        }

        void d(ViewHolder viewholder)
        {
            if (!viewholder.isChanged() || !c.supportsChangeAnimations() || d == null)
            {
                a.remove(viewholder);
            } else
            {
                d.remove(viewholder);
            }
            viewholder.mScrapContainer = null;
            viewholder.clearReturnedFromScrapFlag();
        }

        ViewHolder e(int k)
        {
            boolean flag;
            int i1;
label0:
            {
                flag = false;
                if (d != null)
                {
                    i1 = d.size();
                    if (i1 != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int l = 0; l < i1; l++)
            {
                ViewHolder viewholder = (ViewHolder)d.get(l);
                if (!viewholder.wasReturnedFromScrap() && viewholder.getLayoutPosition() == k)
                {
                    viewholder.addFlags(32);
                    return viewholder;
                }
            }

            if (c.mAdapter.hasStableIds())
            {
                k = c.mAdapterHelper.a(k);
                if (k > 0 && k < c.mAdapter.getItemCount())
                {
                    long l1 = c.mAdapter.getItemId(k);
                    for (k = ((flag) ? 1 : 0); k < i1; k++)
                    {
                        ViewHolder viewholder1 = (ViewHolder)d.get(k);
                        if (!viewholder1.wasReturnedFromScrap() && viewholder1.getItemId() == l1)
                        {
                            viewholder1.addFlags(32);
                            return viewholder1;
                        }
                    }

                }
            }
            return null;
        }

        void e()
        {
            a.clear();
        }

        void e(ViewHolder viewholder)
        {
            if (c.mRecyclerListener != null)
            {
                c.mRecyclerListener.a(viewholder);
            }
            if (c.mAdapter != null)
            {
                c.mAdapter.onViewRecycled(viewholder);
            }
            if (c.mState != null)
            {
                c.mState.a(viewholder);
            }
        }

        RecycledViewPool f()
        {
            if (g == null)
            {
                g = new RecycledViewPool();
            }
            return g;
        }

        void g()
        {
            int l = b.size();
            for (int k = 0; k < l; k++)
            {
                ViewHolder viewholder = (ViewHolder)b.get(k);
                if (viewholder != null)
                {
                    viewholder.addFlags(512);
                }
            }

        }

        void h()
        {
            if (c.mAdapter != null && c.mAdapter.hasStableIds())
            {
                int l = b.size();
                for (int k = 0; k < l; k++)
                {
                    ViewHolder viewholder = (ViewHolder)b.get(k);
                    if (viewholder != null)
                    {
                        viewholder.addFlags(6);
                        viewholder.addChangePayload(null);
                    }
                }

            } else
            {
                c();
            }
        }

        void i()
        {
            boolean flag = false;
            int j1 = b.size();
            for (int k = 0; k < j1; k++)
            {
                ((ViewHolder)b.get(k)).clearOldPosition();
            }

            j1 = a.size();
            for (int l = 0; l < j1; l++)
            {
                ((ViewHolder)a.get(l)).clearOldPosition();
            }

            if (d != null)
            {
                int k1 = d.size();
                for (int i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
                {
                    ((ViewHolder)d.get(i1)).clearOldPosition();
                }

            }
        }

        void j()
        {
            int l = b.size();
            for (int k = 0; k < l; k++)
            {
                LayoutParams layoutparams = (LayoutParams)((ViewHolder)b.get(k)).itemView.getLayoutParams();
                if (layoutparams != null)
                {
                    layoutparams.c = true;
                }
            }

        }

        public Recycler()
        {
            c = RecyclerView.this;
            super();
            d = null;
            e = Collections.unmodifiableList(a);
            f = 2;
        }

        private class ViewCacheExtension
        {

            public abstract View a(Recycler recycler, int k, int l);
        }


        private class RecycledViewPool
        {

            private SparseArray a;
            private SparseIntArray b;
            private int c;

            private ArrayList b(int k)
            {
                ArrayList arraylist1 = (ArrayList)a.get(k);
                ArrayList arraylist = arraylist1;
                if (arraylist1 == null)
                {
                    ArrayList arraylist2 = new ArrayList();
                    a.put(k, arraylist2);
                    arraylist = arraylist2;
                    if (b.indexOfKey(k) < 0)
                    {
                        b.put(k, 5);
                        arraylist = arraylist2;
                    }
                }
                return arraylist;
            }

            public ViewHolder a(int k)
            {
                ArrayList arraylist = (ArrayList)a.get(k);
                if (arraylist != null && !arraylist.isEmpty())
                {
                    k = arraylist.size() - 1;
                    ViewHolder viewholder = (ViewHolder)arraylist.get(k);
                    arraylist.remove(k);
                    return viewholder;
                } else
                {
                    return null;
                }
            }

            public void a()
            {
                a.clear();
            }

            void a(Adapter adapter)
            {
                c = c + 1;
            }

            void a(Adapter adapter, Adapter adapter1, boolean flag)
            {
                if (adapter != null)
                {
                    b();
                }
                if (!flag && c == 0)
                {
                    a();
                }
                if (adapter1 != null)
                {
                    a(adapter1);
                }
            }

            public void a(ViewHolder viewholder)
            {
                int k = viewholder.getItemViewType();
                ArrayList arraylist = b(k);
                if (b.get(k) <= arraylist.size())
                {
                    return;
                } else
                {
                    viewholder.resetInternal();
                    arraylist.add(viewholder);
                    return;
                }
            }

            void b()
            {
                c = c - 1;
            }

            public RecycledViewPool()
            {
                a = new SparseArray();
                b = new SparseIntArray();
                c = 0;
            }
        }


        private class RecyclerListener
        {

            public abstract void a(ViewHolder viewholder);
        }

    }


    private class ViewFlinger
        implements Runnable
    {

        final RecyclerView a;
        private int b;
        private int c;
        private ScrollerCompat d;
        private Interpolator e;
        private boolean f;
        private boolean g;

        private float a(float f1)
        {
            return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
        }

        private int b(int i, int j, int k, int l)
        {
            int i1 = Math.abs(i);
            int j1 = Math.abs(j);
            float f1;
            float f2;
            float f3;
            boolean flag;
            if (i1 > j1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = (int)Math.sqrt(k * k + l * l);
            j = (int)Math.sqrt(i * i + j * j);
            if (flag)
            {
                i = a.getWidth();
            } else
            {
                i = a.getHeight();
            }
            l = i / 2;
            f3 = Math.min(1.0F, ((float)j * 1.0F) / (float)i);
            f1 = l;
            f2 = l;
            f3 = a(f3);
            if (k > 0)
            {
                i = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k)) * 4;
            } else
            {
                if (flag)
                {
                    j = i1;
                } else
                {
                    j = j1;
                }
                i = (int)(((float)j / (float)i + 1.0F) * 300F);
            }
            return Math.min(i, 2000);
        }

        private void c()
        {
            g = false;
            f = true;
        }

        private void d()
        {
            f = false;
            if (g)
            {
                a();
            }
        }

        void a()
        {
            if (f)
            {
                g = true;
                return;
            } else
            {
                a.removeCallbacks(this);
                ViewCompat.a(a, this);
                return;
            }
        }

        public void a(int i, int j)
        {
            a.setScrollState(2);
            c = 0;
            b = 0;
            d.a(0, 0, i, j, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
            a();
        }

        public void a(int i, int j, int k)
        {
            a(i, j, k, RecyclerView.sQuinticInterpolator);
        }

        public void a(int i, int j, int k, int l)
        {
            a(i, j, b(i, j, k, l));
        }

        public void a(int i, int j, int k, Interpolator interpolator)
        {
            if (e != interpolator)
            {
                e = interpolator;
                d = ScrollerCompat.a(a.getContext(), interpolator);
            }
            a.setScrollState(2);
            c = 0;
            b = 0;
            d.a(0, 0, i, j, k);
            a();
        }

        public void b()
        {
            a.removeCallbacks(this);
            d.h();
        }

        public void b(int i, int j)
        {
            a(i, j, 0, 0);
        }

        public void run()
        {
            ScrollerCompat scrollercompat;
            SmoothScroller smoothscroller;
            c();
            a.consumePendingUpdateOperations();
            scrollercompat = d;
            smoothscroller = a.mLayout.j;
            if (!scrollercompat.g()) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2 = scrollercompat.b();
            int l2 = scrollercompat.c();
            i2 = k2 - b;
            j2 = l2 - c;
            j1 = 0;
            k = 0;
            k1 = 0;
            j = 0;
            b = k2;
            c = l2;
            l1 = 0;
            i = 0;
            i1 = 0;
            l = 0;
            if (a.mAdapter == null)
            {
                break MISSING_BLOCK_LABEL_869;
            }
            a.eatRequestLayout();
            a.onEnterLayoutOrScroll();
            TraceCompat.a("RV Scroll");
            if (i2 != 0)
            {
                k = a.mLayout.a(i2, a.mRecycler, a.mState);
                i = i2 - k;
            }
            if (j2 != 0)
            {
                j = a.mLayout.b(j2, a.mRecycler, a.mState);
                l = j2 - j;
            }
            TraceCompat.a();
            if (a.supportsChangeAnimations())
            {
                j1 = a.mChildHelper.b();
                for (i1 = 0; i1 < j1; i1++)
                {
                    View view = a.mChildHelper.b(i1);
                    Object obj = a.getChildViewHolder(view);
                    if (obj == null || ((ViewHolder) (obj)).mShadowingHolder == null)
                    {
                        continue;
                    }
                    obj = ((ViewHolder) (obj)).mShadowingHolder.itemView;
                    k1 = view.getLeft();
                    l1 = view.getTop();
                    if (k1 != ((View) (obj)).getLeft() || l1 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(k1, l1, ((View) (obj)).getWidth() + k1, ((View) (obj)).getHeight() + l1);
                    }
                }

            }
            a.onExitLayoutOrScroll();
            a.resumeRequestLayout(false);
            i1 = l;
            k1 = j;
            l1 = i;
            j1 = k;
            if (smoothscroller == null)
            {
                break MISSING_BLOCK_LABEL_869;
            }
            i1 = l;
            k1 = j;
            l1 = i;
            j1 = k;
            if (smoothscroller.g())
            {
                break MISSING_BLOCK_LABEL_869;
            }
            i1 = l;
            k1 = j;
            l1 = i;
            j1 = k;
            if (!smoothscroller.h())
            {
                break MISSING_BLOCK_LABEL_869;
            }
            i1 = a.mState.e();
            if (i1 == 0)
            {
                smoothscroller.f();
                i1 = j;
                j = i;
            } else
            {
label0:
                {
                    if (smoothscroller.i() < i1)
                    {
                        break label0;
                    }
                    smoothscroller.d(i1 - 1);
                    SmoothScroller.a(smoothscroller, i2 - i, j2 - l);
                    i1 = j;
                    j = i;
                }
            }
_L3:
            if (!a.mItemDecorations.isEmpty())
            {
                a.invalidate();
            }
            if (ViewCompat.a(a) != 2)
            {
                a.considerReleasingGlowsOnScroll(i2, j2);
            }
            if (j != 0 || l != 0)
            {
                j1 = (int)scrollercompat.f();
                if (j != k2)
                {
                    if (j < 0)
                    {
                        i = -j1;
                    } else
                    if (j > 0)
                    {
                        i = j1;
                    } else
                    {
                        i = 0;
                    }
                    k1 = i;
                } else
                {
                    k1 = 0;
                }
                if (l != l2)
                {
                    if (l < 0)
                    {
                        i = -j1;
                    } else
                    {
                        i = j1;
                        if (l <= 0)
                        {
                            i = 0;
                        }
                    }
                } else
                {
                    i = 0;
                }
                if (ViewCompat.a(a) != 2)
                {
                    a.absorbGlows(k1, i);
                }
                if ((k1 != 0 || j == k2 || scrollercompat.d() == 0) && (i != 0 || l == l2 || scrollercompat.e() == 0))
                {
                    scrollercompat.h();
                }
            }
            if (k != 0 || i1 != 0)
            {
                a.dispatchOnScrolled(k, i1);
            }
            if (!a.awakenScrollBars())
            {
                a.invalidate();
            }
            if (j2 != 0 && a.mLayout.d() && i1 == j2)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i2 != 0 && a.mLayout.c() && k == i2)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (i2 == 0 && j2 == 0 || j != 0 || i != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (scrollercompat.a() || i == 0)
            {
                a.setScrollState(0);
            } else
            {
                a();
            }
_L2:
            if (smoothscroller != null)
            {
                if (smoothscroller.g())
                {
                    SmoothScroller.a(smoothscroller, 0, 0);
                }
                if (!g)
                {
                    smoothscroller.f();
                }
            }
            d();
            return;
            SmoothScroller.a(smoothscroller, i2 - i, j2 - l);
            j1 = k;
            l1 = i;
            k1 = j;
            i1 = l;
            j = l1;
            l = i1;
            i1 = k1;
            k = j1;
              goto _L3
        }

        public ViewFlinger()
        {
            a = RecyclerView.this;
            super();
            e = RecyclerView.sQuinticInterpolator;
            f = false;
            g = false;
            d = ScrollerCompat.a(getContext(), RecyclerView.sQuinticInterpolator);
        }

        private class SmoothScroller
        {

            private int a;
            private RecyclerView b;
            private LayoutManager c;
            private boolean d;
            private boolean e;
            private View f;
            private final Action g = new Action(0, 0);

            private void a(int k, int l)
            {
label0:
                {
                    RecyclerView recyclerview = b;
                    if (!e || a == -1 || recyclerview == null)
                    {
                        f();
                    }
                    d = false;
                    if (f != null)
                    {
                        if (a(f) == a)
                        {
                            a(f, recyclerview.mState, g);
                            Action.a(g, recyclerview);
                            f();
                        } else
                        {
                            Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                            f = null;
                        }
                    }
                    if (e)
                    {
                        a(k, l, recyclerview.mState, g);
                        boolean flag = g.a();
                        Action.a(g, recyclerview);
                        if (flag)
                        {
                            if (!e)
                            {
                                break label0;
                            }
                            d = true;
                            recyclerview.mViewFlinger.a();
                        }
                    }
                    return;
                }
                f();
            }

            static void a(SmoothScroller smoothscroller, int k, int l)
            {
                smoothscroller.a(k, l);
            }

            public int a(View view)
            {
                return b.getChildLayoutPosition(view);
            }

            protected abstract void a();

            protected abstract void a(int k, int l, State state, Action action);

            protected void a(PointF pointf)
            {
                double d1 = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
                pointf.x = (float)((double)pointf.x / d1);
                pointf.y = (float)((double)pointf.y / d1);
            }

            void a(RecyclerView recyclerview, LayoutManager layoutmanager)
            {
                b = recyclerview;
                c = layoutmanager;
                if (a == -1)
                {
                    throw new IllegalArgumentException("Invalid target position");
                } else
                {
                    State.d(b.mState, a);
                    e = true;
                    d = true;
                    f = e(i());
                    a();
                    b.mViewFlinger.a();
                    return;
                }
            }

            protected abstract void a(View view, State state, Action action);

            protected abstract void b();

            protected void b(View view)
            {
                if (a(view) == i())
                {
                    f = view;
                }
            }

            public void d(int k)
            {
                a = k;
            }

            public LayoutManager e()
            {
                return c;
            }

            public View e(int k)
            {
                return b.mLayout.b(k);
            }

            protected final void f()
            {
                if (!e)
                {
                    return;
                } else
                {
                    b();
                    State.d(b.mState, -1);
                    f = null;
                    a = -1;
                    d = false;
                    e = false;
                    LayoutManager.a(c, this);
                    c = null;
                    b = null;
                    return;
                }
            }

            public boolean g()
            {
                return d;
            }

            public boolean h()
            {
                return e;
            }

            public int i()
            {
                return a;
            }

            public int j()
            {
                return b.mLayout.q();
            }

            public SmoothScroller()
            {
                a = -1;
                class Action
                {

                    private int a;
                    private int b;
                    private int c;
                    private int d;
                    private Interpolator e;
                    private boolean f;
                    private int g;

                    static void a(Action action, RecyclerView recyclerview)
                    {
                        action.a(recyclerview);
                    }

                    private void a(RecyclerView recyclerview)
                    {
                        if (d >= 0)
                        {
                            int k = d;
                            d = -1;
                            recyclerview.jumpToPositionForSmoothScroller(k);
                            f = false;
                            return;
                        }
                        if (f)
                        {
                            b();
                            if (e == null)
                            {
                                if (c == 0x80000000)
                                {
                                    recyclerview.mViewFlinger.b(a, b);
                                } else
                                {
                                    recyclerview.mViewFlinger.a(a, b, c);
                                }
                            } else
                            {
                                recyclerview.mViewFlinger.a(a, b, c, e);
                            }
                            g = g + 1;
                            if (g > 10)
                            {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            f = false;
                            return;
                        } else
                        {
                            g = 0;
                            return;
                        }
                    }

                    private void b()
                    {
                        if (e != null && c < 1)
                        {
                            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                        }
                        if (c < 1)
                        {
                            throw new IllegalStateException("Scroll duration must be a positive number");
                        } else
                        {
                            return;
                        }
                    }

                    public void a(int k)
                    {
                        d = k;
                    }

                    public void a(int k, int l, int i1, Interpolator interpolator)
                    {
                        a = k;
                        b = l;
                        c = i1;
                        e = interpolator;
                        f = true;
                    }

                    boolean a()
                    {
                        return d >= 0;
                    }

                    public Action(int k, int l)
                    {
                        this(k, l, 0x80000000, null);
                    }

                    public Action(int k, int l, int i1, Interpolator interpolator)
                    {
                        d = -1;
                        f = false;
                        g = 0;
                        a = k;
                        b = l;
                        c = i1;
                        e = interpolator;
                    }
                }

            }
        }

    }


    private class State
    {

        ArrayMap a;
        ArrayMap b;
        ArrayMap c;
        final List d = new ArrayList();
        int e;
        private int f;
        private SparseArray g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        static int a(State state, int i1)
        {
            i1 = state.i + i1;
            state.i = i1;
            return i1;
        }

        private void a(ArrayMap arraymap, ViewHolder viewholder)
        {
            int i1 = arraymap.size() - 1;
            do
            {
label0:
                {
                    if (i1 >= 0)
                    {
                        if (viewholder != arraymap.c(i1))
                        {
                            break label0;
                        }
                        arraymap.d(i1);
                    }
                    return;
                }
                i1--;
            } while (true);
        }

        static boolean a(State state)
        {
            return state.m;
        }

        static boolean a(State state, boolean flag)
        {
            state.j = flag;
            return flag;
        }

        static int b(State state, int i1)
        {
            state.i = i1;
            return i1;
        }

        static boolean b(State state)
        {
            return state.l;
        }

        static boolean b(State state, boolean flag)
        {
            state.k = flag;
            return flag;
        }

        static int c(State state, int i1)
        {
            state.h = i1;
            return i1;
        }

        static boolean c(State state)
        {
            return state.j;
        }

        static boolean c(State state, boolean flag)
        {
            state.l = flag;
            return flag;
        }

        static int d(State state, int i1)
        {
            state.f = i1;
            return i1;
        }

        static boolean d(State state)
        {
            return state.k;
        }

        static boolean d(State state, boolean flag)
        {
            state.m = flag;
            return flag;
        }

        void a(ViewHolder viewholder)
        {
            a.remove(viewholder);
            b.remove(viewholder);
            if (c != null)
            {
                a(c, viewholder);
            }
            d.remove(viewholder.itemView);
        }

        void a(View view)
        {
            d.remove(view);
        }

        public boolean a()
        {
            return k;
        }

        void b(View view)
        {
            if (!d.contains(view))
            {
                d.add(view);
            }
        }

        public boolean b()
        {
            return m;
        }

        public int c()
        {
            return f;
        }

        public boolean d()
        {
            return f != -1;
        }

        public int e()
        {
            if (k)
            {
                return h - i;
            } else
            {
                return e;
            }
        }

        public String toString()
        {
            return (new StringBuilder()).append("State{mTargetPosition=").append(f).append(", mPreLayoutHolderMap=").append(a).append(", mPostLayoutHolderMap=").append(b).append(", mData=").append(g).append(", mItemCount=").append(e).append(", mPreviousLayoutItemCount=").append(h).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(i).append(", mStructureChanged=").append(j).append(", mInPreLayout=").append(k).append(", mRunSimpleAnimations=").append(l).append(", mRunPredictiveAnimations=").append(m).append('}').toString();
        }

        public State()
        {
            f = -1;
            a = new ArrayMap();
            b = new ArrayMap();
            c = new ArrayMap();
            e = 0;
            h = 0;
            i = 0;
            j = false;
            k = false;
            l = false;
            m = false;
        }
    }


    private class ItemAnimatorRestoreListener
        implements ItemAnimator.ItemAnimatorListener
    {

        final RecyclerView a;

        public void a(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (!a.removeAnimatingView(viewholder.itemView) && viewholder.isTmpDetached())
            {
                a.removeDetachedView(viewholder.itemView, false);
            }
        }

        public void b(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (!viewholder.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(viewholder.itemView);
            }
        }

        public void c(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (!viewholder.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(viewholder.itemView);
            }
        }

        public void d(ViewHolder viewholder)
        {
            viewholder.setIsRecyclable(true);
            if (viewholder.mShadowedHolder != null && viewholder.mShadowingHolder == null)
            {
                viewholder.mShadowedHolder = null;
                viewholder.setFlags(-65, viewholder.mFlags);
            }
            viewholder.mShadowingHolder = null;
            if (!viewholder.shouldBeKeptAsChild())
            {
                a.removeAnimatingView(viewholder.itemView);
            }
        }

        private ItemAnimatorRestoreListener()
        {
            a = RecyclerView.this;
            super();
        }

    }


    private class ItemAnimator
    {

        private ItemAnimatorListener a;
        private ArrayList b;
        private long c;
        private long d;
        private long e;
        private long f;
        private boolean g;

        public abstract void a();

        void a(ItemAnimatorListener itemanimatorlistener)
        {
            a = itemanimatorlistener;
        }

        public final void a(ViewHolder viewholder, boolean flag)
        {
            d(viewholder, flag);
            class ItemAnimatorListener
            {

                public abstract void a(ViewHolder viewholder1);

                public abstract void b(ViewHolder viewholder1);

                public abstract void c(ViewHolder viewholder1);

                public abstract void d(ViewHolder viewholder1);
            }

            if (a != null)
            {
                a.d(viewholder);
            }
        }

        public abstract boolean a(ViewHolder viewholder);

        public abstract boolean a(ViewHolder viewholder, int i1, int j1, int k1, int l1);

        public abstract boolean a(ViewHolder viewholder, ViewHolder viewholder1, int i1, int j1, int k1, int l1);

        public final void b(ViewHolder viewholder, boolean flag)
        {
            c(viewholder, flag);
        }

        public abstract boolean b();

        public abstract boolean b(ViewHolder viewholder);

        public abstract void c();

        public abstract void c(ViewHolder viewholder);

        public void c(ViewHolder viewholder, boolean flag)
        {
        }

        public long d()
        {
            return e;
        }

        public final void d(ViewHolder viewholder)
        {
            k(viewholder);
            if (a != null)
            {
                a.a(viewholder);
            }
        }

        public void d(ViewHolder viewholder, boolean flag)
        {
        }

        public long e()
        {
            return c;
        }

        public final void e(ViewHolder viewholder)
        {
            o(viewholder);
            if (a != null)
            {
                a.c(viewholder);
            }
        }

        public long f()
        {
            return d;
        }

        public final void f(ViewHolder viewholder)
        {
            m(viewholder);
            if (a != null)
            {
                a.b(viewholder);
            }
        }

        public long g()
        {
            return f;
        }

        public final void g(ViewHolder viewholder)
        {
            j(viewholder);
        }

        public final void h(ViewHolder viewholder)
        {
            n(viewholder);
        }

        public boolean h()
        {
            return g;
        }

        public final void i()
        {
            int j1 = b.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                class ItemAnimatorFinishedListener
                {

                    public abstract void a();
                }

                ((ItemAnimatorFinishedListener)b.get(i1)).a();
            }

            b.clear();
        }

        public final void i(ViewHolder viewholder)
        {
            l(viewholder);
        }

        public void j(ViewHolder viewholder)
        {
        }

        public void k(ViewHolder viewholder)
        {
        }

        public void l(ViewHolder viewholder)
        {
        }

        public void m(ViewHolder viewholder)
        {
        }

        public void n(ViewHolder viewholder)
        {
        }

        public void o(ViewHolder viewholder)
        {
        }

        public ItemAnimator()
        {
            a = null;
            b = new ArrayList();
            c = 120L;
            d = 120L;
            e = 250L;
            f = 250L;
            g = true;
        }
    }


    private class ViewHolder
    {

        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_BOUND = 1;
        static final int FLAG_CHANGED = 64;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List FULLUPDATE_PAYLOADS;
        public final View itemView;
        private int mFlags;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List mPayloads;
        int mPosition;
        int mPreLayoutPosition;
        private Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        private void createPayloadsIfNeeded()
        {
            if (mPayloads == null)
            {
                mPayloads = new ArrayList();
                mUnmodifiedPayloads = Collections.unmodifiableList(mPayloads);
            }
        }

        private boolean doesTransientStatePreventRecycling()
        {
            return (mFlags & 0x10) == 0 && ViewCompat.c(itemView);
        }

        private void onEnteredHiddenState()
        {
            mWasImportantForAccessibilityBeforeHidden = ViewCompat.e(itemView);
            ViewCompat.c(itemView, 4);
        }

        private void onLeftHiddenState()
        {
            ViewCompat.c(itemView, mWasImportantForAccessibilityBeforeHidden);
            mWasImportantForAccessibilityBeforeHidden = 0;
        }

        private boolean shouldBeKeptAsChild()
        {
            return (mFlags & 0x10) != 0;
        }

        void addChangePayload(Object obj)
        {
            if (obj == null)
            {
                addFlags(1024);
            } else
            if ((mFlags & 0x400) == 0)
            {
                createPayloadsIfNeeded();
                mPayloads.add(obj);
                return;
            }
        }

        void addFlags(int i)
        {
            mFlags = mFlags | i;
        }

        void clearOldPosition()
        {
            mOldPosition = -1;
            mPreLayoutPosition = -1;
        }

        void clearPayload()
        {
            if (mPayloads != null)
            {
                mPayloads.clear();
            }
            mFlags = mFlags & 0xfffffbff;
        }

        void clearReturnedFromScrapFlag()
        {
            mFlags = mFlags & 0xffffffdf;
        }

        void clearTmpDetachFlag()
        {
            mFlags = mFlags & 0xfffffeff;
        }

        void flagRemovedAndOffsetPosition(int i, int j, boolean flag)
        {
            addFlags(8);
            offsetPosition(j, flag);
            mPosition = i;
        }

        public final int getAdapterPosition()
        {
            if (mOwnerRecyclerView == null)
            {
                return -1;
            } else
            {
                return mOwnerRecyclerView.getAdapterPositionFor(this);
            }
        }

        public final long getItemId()
        {
            return mItemId;
        }

        public final int getItemViewType()
        {
            return mItemViewType;
        }

        public final int getLayoutPosition()
        {
            if (mPreLayoutPosition == -1)
            {
                return mPosition;
            } else
            {
                return mPreLayoutPosition;
            }
        }

        public final int getOldPosition()
        {
            return mOldPosition;
        }

        public final int getPosition()
        {
            if (mPreLayoutPosition == -1)
            {
                return mPosition;
            } else
            {
                return mPreLayoutPosition;
            }
        }

        List getUnmodifiedPayloads()
        {
            if ((mFlags & 0x400) == 0)
            {
                if (mPayloads == null || mPayloads.size() == 0)
                {
                    return FULLUPDATE_PAYLOADS;
                } else
                {
                    return mUnmodifiedPayloads;
                }
            } else
            {
                return FULLUPDATE_PAYLOADS;
            }
        }

        boolean hasAnyOfTheFlags(int i)
        {
            return (mFlags & i) != 0;
        }

        boolean isAdapterPositionUnknown()
        {
            return (mFlags & 0x200) != 0 || isInvalid();
        }

        boolean isBound()
        {
            return (mFlags & 1) != 0;
        }

        boolean isChanged()
        {
            return (mFlags & 0x40) != 0;
        }

        boolean isInvalid()
        {
            return (mFlags & 4) != 0;
        }

        public final boolean isRecyclable()
        {
            return (mFlags & 0x10) == 0 && !ViewCompat.c(itemView);
        }

        boolean isRemoved()
        {
            return (mFlags & 8) != 0;
        }

        boolean isScrap()
        {
            return mScrapContainer != null;
        }

        boolean isTmpDetached()
        {
            return (mFlags & 0x100) != 0;
        }

        boolean needsUpdate()
        {
            return (mFlags & 2) != 0;
        }

        void offsetPosition(int i, boolean flag)
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
            if (mPreLayoutPosition == -1)
            {
                mPreLayoutPosition = mPosition;
            }
            if (flag)
            {
                mPreLayoutPosition = mPreLayoutPosition + i;
            }
            mPosition = mPosition + i;
            if (itemView.getLayoutParams() != null)
            {
                ((LayoutParams)itemView.getLayoutParams()).c = true;
            }
        }

        void resetInternal()
        {
            mFlags = 0;
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mPreLayoutPosition = -1;
            mIsRecyclableCount = 0;
            mShadowedHolder = null;
            mShadowingHolder = null;
            clearPayload();
            mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void saveOldPosition()
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
        }

        void setFlags(int i, int j)
        {
            mFlags = mFlags & ~j | i & j;
        }

        public final void setIsRecyclable(boolean flag)
        {
            int i;
            if (flag)
            {
                i = mIsRecyclableCount - 1;
            } else
            {
                i = mIsRecyclableCount + 1;
            }
            mIsRecyclableCount = i;
            if (mIsRecyclableCount < 0)
            {
                mIsRecyclableCount = 0;
                Log.e("View", (new StringBuilder()).append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString());
            } else
            {
                if (!flag && mIsRecyclableCount == 1)
                {
                    mFlags = mFlags | 0x10;
                    return;
                }
                if (flag && mIsRecyclableCount == 0)
                {
                    mFlags = mFlags & 0xffffffef;
                    return;
                }
            }
        }

        void setScrapContainer(Recycler recycler)
        {
            mScrapContainer = recycler;
        }

        boolean shouldIgnore()
        {
            return (mFlags & 0x80) != 0;
        }

        void stopIgnoring()
        {
            mFlags = mFlags & 0xffffff7f;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder()).append("ViewHolder{").append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
            if (isScrap())
            {
                stringbuilder.append(" scrap");
            }
            if (isInvalid())
            {
                stringbuilder.append(" invalid");
            }
            if (!isBound())
            {
                stringbuilder.append(" unbound");
            }
            if (needsUpdate())
            {
                stringbuilder.append(" update");
            }
            if (isRemoved())
            {
                stringbuilder.append(" removed");
            }
            if (shouldIgnore())
            {
                stringbuilder.append(" ignored");
            }
            if (isChanged())
            {
                stringbuilder.append(" changed");
            }
            if (isTmpDetached())
            {
                stringbuilder.append(" tmpDetached");
            }
            if (!isRecyclable())
            {
                stringbuilder.append((new StringBuilder()).append(" not recyclable(").append(mIsRecyclableCount).append(")").toString());
            }
            if (isAdapterPositionUnknown())
            {
                stringbuilder.append("undefined adapter position");
            }
            if (itemView.getParent() == null)
            {
                stringbuilder.append(" no parent");
            }
            stringbuilder.append("}");
            return stringbuilder.toString();
        }

        void unScrap()
        {
            mScrapContainer.d(this);
        }

        boolean wasReturnedFromScrap()
        {
            return (mFlags & 0x20) != 0;
        }

        static 
        {
            FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        }





/*
        static Recycler access$4202(ViewHolder viewholder, Recycler recycler)
        {
            viewholder.mScrapContainer = recycler;
            return recycler;
        }

*/



        public ViewHolder(View view)
        {
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mItemViewType = -1;
            mPreLayoutPosition = -1;
            mShadowedHolder = null;
            mShadowingHolder = null;
            mPayloads = null;
            mUnmodifiedPayloads = null;
            mIsRecyclableCount = 0;
            mScrapContainer = null;
            mWasImportantForAccessibilityBeforeHidden = 0;
            if (view == null)
            {
                throw new IllegalArgumentException("itemView may not be null");
            } else
            {
                itemView = view;
                return;
            }
        }
    }


    private class ItemHolderInfo
    {

        ViewHolder a;
        int b;
        int c;
        int d;
        int e;

        ItemHolderInfo(ViewHolder viewholder, int i, int j, int k, int l)
        {
            a = viewholder;
            b = i;
            c = j;
            d = k;
            e = l;
        }
    }


    private class LayoutManager
    {

        private boolean a;
        private boolean b;
        ChildHelper h;
        RecyclerView i;
        SmoothScroller j;

        public static int a(int i1, int j1, int k1, boolean flag)
        {
            int l1;
            int i2;
            i2 = 0x40000000;
            l1 = Math.max(0, i1 - j1);
            if (!flag) goto _L2; else goto _L1
_L1:
            if (k1 >= 0)
            {
                i1 = k1;
                j1 = i2;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
_L4:
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, j1);
_L2:
            j1 = i2;
            i1 = k1;
            if (k1 < 0)
            {
                if (k1 == -1)
                {
                    i1 = l1;
                    j1 = i2;
                } else
                if (k1 == -2)
                {
                    j1 = 0x80000000;
                    i1 = l1;
                } else
                {
                    j1 = 0;
                    i1 = 0;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void a(int i1, View view)
        {
            h.d(i1);
        }

        static void a(LayoutManager layoutmanager, SmoothScroller smoothscroller)
        {
            layoutmanager.b(smoothscroller);
        }

        private void a(Recycler recycler, int i1, View view)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.shouldIgnore())
            {
                return;
            }
            if (viewholder.isInvalid() && !viewholder.isRemoved() && !viewholder.isChanged() && !i.mAdapter.hasStableIds())
            {
                e(i1);
                recycler.b(viewholder);
                return;
            } else
            {
                f(i1);
                recycler.c(view);
                return;
            }
        }

        private void a(View view, int i1, boolean flag)
        {
            ViewHolder viewholder;
            LayoutParams layoutparams;
            viewholder = RecyclerView.getChildViewHolderInt(view);
            if (flag || viewholder.isRemoved())
            {
                i.mState.b(view);
            } else
            {
                i.mState.a(view);
            }
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!viewholder.wasReturnedFromScrap() && !viewholder.isScrap()) goto _L2; else goto _L1
_L1:
            if (viewholder.isScrap())
            {
                viewholder.unScrap();
            } else
            {
                viewholder.clearReturnedFromScrapFlag();
            }
            h.a(view, i1, view.getLayoutParams(), false);
_L4:
            if (layoutparams.d)
            {
                viewholder.itemView.invalidate();
                layoutparams.d = false;
            }
            return;
_L2:
            if (view.getParent() == i)
            {
                int k1 = h.b(view);
                int j1 = i1;
                if (i1 == -1)
                {
                    j1 = h.b();
                }
                if (k1 == -1)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:").append(i.indexOfChild(view)).toString());
                }
                if (k1 != j1)
                {
                    i.mLayout.a(k1, j1);
                }
            } else
            {
                h.a(view, i1, false);
                layoutparams.c = true;
                if (j != null && j.h())
                {
                    j.b(view);
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        static boolean a(LayoutManager layoutmanager)
        {
            return layoutmanager.a;
        }

        static boolean a(LayoutManager layoutmanager, boolean flag)
        {
            layoutmanager.a = flag;
            return flag;
        }

        private void b(SmoothScroller smoothscroller)
        {
            if (j == smoothscroller)
            {
                j = null;
            }
        }

        public void A()
        {
            a = true;
        }

        public int a(int i1, Recycler recycler, State state)
        {
            return 0;
        }

        public abstract LayoutParams a();

        public LayoutParams a(Context context, AttributeSet attributeset)
        {
            return new LayoutParams(context, attributeset);
        }

        public LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
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

        public View a(View view, int i1, Recycler recycler, State state)
        {
            return null;
        }

        public void a(int i1, int j1)
        {
            View view = g(i1);
            if (view == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot move a child from non-existing index:").append(i1).toString());
            } else
            {
                f(i1);
                c(view, j1);
                return;
            }
        }

        public void a(int i1, Recycler recycler)
        {
            View view = g(i1);
            e(i1);
            recycler.a(view);
        }

        public void a(Parcelable parcelable)
        {
        }

        void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            a(i.mRecycler, i.mState, accessibilitynodeinfocompat);
        }

        public void a(Adapter adapter, Adapter adapter1)
        {
        }

        public void a(Recycler recycler)
        {
            for (int i1 = q() - 1; i1 >= 0; i1--)
            {
                a(recycler, i1, g(i1));
            }

        }

        public void a(Recycler recycler, State state)
        {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void a(Recycler recycler, State state, int i1, int j1)
        {
            i.defaultOnMeasure(i1, j1);
        }

        public void a(Recycler recycler, State state, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            if (ViewCompat.b(i, -1) || ViewCompat.a(i, -1))
            {
                accessibilitynodeinfocompat.a(8192);
                accessibilitynodeinfocompat.i(true);
            }
            if (ViewCompat.b(i, 1) || ViewCompat.a(i, 1))
            {
                accessibilitynodeinfocompat.a(4096);
                accessibilitynodeinfocompat.i(true);
            }
            accessibilitynodeinfocompat.b(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.a(c(recycler, state), d(recycler, state), e(recycler, state), b(recycler, state)));
        }

        public void a(Recycler recycler, State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            int i1;
            int j1;
            if (d())
            {
                i1 = d(view);
            } else
            {
                i1 = 0;
            }
            if (c())
            {
                j1 = d(view);
            } else
            {
                j1 = 0;
            }
            accessibilitynodeinfocompat.c(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(i1, 1, j1, 1, false, false));
        }

        public void a(Recycler recycler, State state, AccessibilityEvent accessibilityevent)
        {
            boolean flag1 = true;
            recycler = AccessibilityEventCompat.a(accessibilityevent);
            if (i != null && recycler != null)
            {
                boolean flag = flag1;
                if (!ViewCompat.b(i, 1))
                {
                    flag = flag1;
                    if (!ViewCompat.b(i, -1))
                    {
                        flag = flag1;
                        if (!ViewCompat.a(i, -1))
                        {
                            if (ViewCompat.a(i, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                recycler.a(flag);
                if (i.mAdapter != null)
                {
                    recycler.a(i.mAdapter.getItemCount());
                    return;
                }
            }
        }

        public void a(SmoothScroller smoothscroller)
        {
            if (j != null && smoothscroller != j && j.h())
            {
                j.f();
            }
            j = smoothscroller;
            j.a(i, this);
        }

        void a(RecyclerView recyclerview)
        {
            if (recyclerview == null)
            {
                i = null;
                h = null;
                return;
            } else
            {
                i = recyclerview;
                h = recyclerview.mChildHelper;
                return;
            }
        }

        public void a(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public void a(RecyclerView recyclerview, int i1, int j1, int k1)
        {
        }

        public void a(RecyclerView recyclerview, int i1, int j1, Object obj)
        {
            c(recyclerview, i1, j1);
        }

        public void a(RecyclerView recyclerview, Recycler recycler)
        {
            d(recyclerview);
        }

        public void a(RecyclerView recyclerview, State state, int i1)
        {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(View view)
        {
            a(view, -1);
        }

        public void a(View view, int i1)
        {
            a(view, i1, true);
        }

        public void a(View view, int i1, int j1)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            Rect rect = i.getItemDecorInsetsForChild(view);
            int k1 = rect.left;
            int l1 = rect.right;
            int i2 = rect.top;
            int j2 = rect.bottom;
            view.measure(a(r(), k1 + l1 + i1 + (t() + v() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, c()), a(s(), j2 + i2 + j1 + (u() + w() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, d()));
        }

        public void a(View view, int i1, int j1, int k1, int l1)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
        }

        public void a(View view, int i1, LayoutParams layoutparams)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.isRemoved())
            {
                i.mState.b(view);
            } else
            {
                i.mState.a(view);
            }
            h.a(view, i1, layoutparams, viewholder.isRemoved());
        }

        public void a(View view, Rect rect)
        {
            if (i == null)
            {
                rect.set(0, 0, 0, 0);
                return;
            } else
            {
                rect.set(i.getItemDecorInsetsForChild(view));
                return;
            }
        }

        void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder != null && !viewholder.isRemoved() && !h.c(viewholder.itemView))
            {
                a(i.mRecycler, i.mState, view, accessibilitynodeinfocompat);
            }
        }

        public void a(View view, Recycler recycler)
        {
            c(view);
            recycler.a(view);
        }

        public void a(AccessibilityEvent accessibilityevent)
        {
            a(i.mRecycler, i.mState, accessibilityevent);
        }

        public void a(Runnable runnable)
        {
            if (i != null)
            {
                ViewCompat.a(i, runnable);
            }
        }

        public void a(String s1)
        {
            if (i != null)
            {
                i.assertNotInLayoutOrScroll(s1);
            }
        }

        boolean a(int i1, Bundle bundle)
        {
            return a(i.mRecycler, i.mState, i1, bundle);
        }

        public boolean a(LayoutParams layoutparams)
        {
            return layoutparams != null;
        }

        public boolean a(Recycler recycler, State state, int i1, Bundle bundle)
        {
            if (i != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            i1;
            JVM INSTR lookupswitch 2: default 36
        //                       4096: 129
        //                       8192: 62;
               goto _L3 _L4 _L5
_L3:
            int j1;
            i1 = 0;
            j1 = 0;
_L8:
            if (j1 != 0 || i1 != 0)
            {
                i.scrollBy(i1, j1);
                return true;
            }
              goto _L1
_L5:
            int k1;
            int l1;
            int i2;
            if (ViewCompat.b(i, -1))
            {
                i1 = -(s() - u() - w());
            } else
            {
                i1 = 0;
            }
            j1 = i1;
            if (!ViewCompat.a(i, -1)) goto _L7; else goto _L6
_L6:
            k1 = -(r() - t() - v());
            j1 = i1;
            i1 = k1;
              goto _L8
_L4:
            if (ViewCompat.b(i, 1))
            {
                i1 = s() - u() - w();
            } else
            {
                i1 = 0;
            }
            j1 = i1;
            if (!ViewCompat.a(i, 1)) goto _L7; else goto _L9
_L9:
            k1 = r();
            l1 = t();
            i2 = v();
            j1 = i1;
            i1 = k1 - l1 - i2;
              goto _L8
_L7:
            i1 = 0;
              goto _L8
        }

        public boolean a(Recycler recycler, State state, View view, int i1, Bundle bundle)
        {
            return false;
        }

        public boolean a(RecyclerView recyclerview, State state, View view, View view1)
        {
            return a(recyclerview, view, view1);
        }

        public boolean a(RecyclerView recyclerview, View view, Rect rect, boolean flag)
        {
            int k2 = t();
            int l1 = u();
            int l2 = r() - v();
            int j2 = s();
            int k3 = w();
            int i3 = view.getLeft() + rect.left;
            int i2 = view.getTop() + rect.top;
            int j3 = i3 + rect.width();
            int l3 = rect.height();
            int i1 = Math.min(0, i3 - k2);
            int j1 = Math.min(0, i2 - l1);
            int k1 = Math.max(0, j3 - l2);
            j2 = Math.max(0, (i2 + l3) - (j2 - k3));
            if (o() == 1)
            {
                if (k1 != 0)
                {
                    i1 = k1;
                } else
                {
                    i1 = Math.max(i1, j3 - l2);
                }
            } else
            if (i1 == 0)
            {
                i1 = Math.min(i3 - k2, k1);
            }
            if (j1 == 0)
            {
                j1 = Math.min(i2 - l1, j2);
            }
            if (i1 != 0 || j1 != 0)
            {
                if (flag)
                {
                    recyclerview.scrollBy(i1, j1);
                } else
                {
                    recyclerview.smoothScrollBy(i1, j1);
                }
                return true;
            } else
            {
                return false;
            }
        }

        public boolean a(RecyclerView recyclerview, View view, View view1)
        {
            return n() || recyclerview.isComputingLayout();
        }

        public boolean a(RecyclerView recyclerview, ArrayList arraylist, int i1, int j1)
        {
            return false;
        }

        boolean a(View view, int i1, Bundle bundle)
        {
            return a(i.mRecycler, i.mState, view, i1, bundle);
        }

        public int b(int i1, Recycler recycler, State state)
        {
            return 0;
        }

        public int b(Recycler recycler, State state)
        {
            return 0;
        }

        public int b(State state)
        {
            return 0;
        }

        public Parcelable b()
        {
            return null;
        }

        public View b(int i1)
        {
            int j1;
            int k1;
            k1 = q();
            j1 = 0;
_L3:
            View view;
            ViewHolder viewholder;
            if (j1 >= k1)
            {
                break; /* Loop/switch isn't completed */
            }
            view = g(j1);
            viewholder = RecyclerView.getChildViewHolderInt(view);
              goto _L1
_L5:
            j1++;
            if (true) goto _L3; else goto _L2
_L1:
            if (viewholder == null || viewholder.getLayoutPosition() != i1 || viewholder.shouldIgnore() || !i.mState.a() && viewholder.isRemoved()) goto _L5; else goto _L4
_L4:
            return view;
_L2:
            return null;
        }

        void b(Recycler recycler)
        {
            int j1 = recycler.d();
            int i1 = j1 - 1;
            while (i1 >= 0) 
            {
                View view = recycler.d(i1);
                ViewHolder viewholder = RecyclerView.getChildViewHolderInt(view);
                if (!viewholder.shouldIgnore())
                {
                    viewholder.setIsRecyclable(false);
                    if (viewholder.isTmpDetached())
                    {
                        i.removeDetachedView(view, false);
                    }
                    if (i.mItemAnimator != null)
                    {
                        i.mItemAnimator.c(viewholder);
                    }
                    viewholder.setIsRecyclable(true);
                    recycler.b(view);
                }
                i1--;
            }
            recycler.e();
            if (j1 > 0)
            {
                i.invalidate();
            }
        }

        void b(RecyclerView recyclerview)
        {
            b = true;
            c(recyclerview);
        }

        public void b(RecyclerView recyclerview, int i1, int j1)
        {
        }

        void b(RecyclerView recyclerview, Recycler recycler)
        {
            b = false;
            a(recyclerview, recycler);
        }

        public void b(View view)
        {
            b(view, -1);
        }

        public void b(View view, int i1)
        {
            a(view, i1, false);
        }

        public boolean b(Runnable runnable)
        {
            if (i != null)
            {
                return i.removeCallbacks(runnable);
            } else
            {
                return false;
            }
        }

        public int c(Recycler recycler, State state)
        {
            while (i == null || i.mAdapter == null || !d()) 
            {
                return 1;
            }
            return i.mAdapter.getItemCount();
        }

        public int c(State state)
        {
            return 0;
        }

        public void c(Recycler recycler)
        {
            for (int i1 = q() - 1; i1 >= 0; i1--)
            {
                if (!RecyclerView.getChildViewHolderInt(g(i1)).shouldIgnore())
                {
                    a(i1, recycler);
                }
            }

        }

        public void c(RecyclerView recyclerview)
        {
        }

        public void c(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public void c(View view)
        {
            h.a(view);
        }

        public void c(View view, int i1)
        {
            a(view, i1, (LayoutParams)view.getLayoutParams());
        }

        public boolean c()
        {
            return false;
        }

        public int d(Recycler recycler, State state)
        {
            while (i == null || i.mAdapter == null || !c()) 
            {
                return 1;
            }
            return i.mAdapter.getItemCount();
        }

        public int d(State state)
        {
            return 0;
        }

        public int d(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).c();
        }

        public View d(View view, int i1)
        {
            return null;
        }

        public void d(int i1)
        {
        }

        public void d(RecyclerView recyclerview)
        {
        }

        public boolean d()
        {
            return false;
        }

        public int e(State state)
        {
            return 0;
        }

        public int e(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            int i1 = view.getMeasuredWidth();
            int j1 = rect.left;
            return rect.right + (i1 + j1);
        }

        public void e(int i1)
        {
            if (g(i1) != null)
            {
                h.a(i1);
            }
        }

        public void e(RecyclerView recyclerview)
        {
        }

        public boolean e(Recycler recycler, State state)
        {
            return false;
        }

        public int f(State state)
        {
            return 0;
        }

        public int f(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            int i1 = view.getMeasuredHeight();
            int j1 = rect.top;
            return rect.bottom + (i1 + j1);
        }

        public void f(int i1)
        {
            a(i1, g(i1));
        }

        public int g(State state)
        {
            return 0;
        }

        public int g(View view)
        {
            return view.getLeft() - m(view);
        }

        public View g(int i1)
        {
            if (h != null)
            {
                return h.b(i1);
            } else
            {
                return null;
            }
        }

        public int h(View view)
        {
            return view.getTop() - k(view);
        }

        public void h(int i1)
        {
            if (i != null)
            {
                i.offsetChildrenHorizontal(i1);
            }
        }

        public int i(View view)
        {
            return view.getRight() + n(view);
        }

        public void i(int i1)
        {
            if (i != null)
            {
                i.offsetChildrenVertical(i1);
            }
        }

        public int j(View view)
        {
            return view.getBottom() + l(view);
        }

        public void j(int i1)
        {
        }

        public boolean j()
        {
            return false;
        }

        public int k(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).b.top;
        }

        public void k()
        {
            if (i != null)
            {
                i.requestLayout();
            }
        }

        public int l(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).b.bottom;
        }

        public boolean l()
        {
            return b;
        }

        public int m(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).b.left;
        }

        public boolean m()
        {
            return i != null && i.mClipToPadding;
        }

        public int n(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).b.right;
        }

        public boolean n()
        {
            return j != null && j.h();
        }

        public int o()
        {
            return ViewCompat.h(i);
        }

        public int p()
        {
            return -1;
        }

        public int q()
        {
            if (h != null)
            {
                return h.b();
            } else
            {
                return 0;
            }
        }

        public int r()
        {
            if (i != null)
            {
                return i.getWidth();
            } else
            {
                return 0;
            }
        }

        public int s()
        {
            if (i != null)
            {
                return i.getHeight();
            } else
            {
                return 0;
            }
        }

        public int t()
        {
            if (i != null)
            {
                return i.getPaddingLeft();
            } else
            {
                return 0;
            }
        }

        public int u()
        {
            if (i != null)
            {
                return i.getPaddingTop();
            } else
            {
                return 0;
            }
        }

        public int v()
        {
            if (i != null)
            {
                return i.getPaddingRight();
            } else
            {
                return 0;
            }
        }

        public int w()
        {
            if (i != null)
            {
                return i.getPaddingBottom();
            } else
            {
                return 0;
            }
        }

        public View x()
        {
            View view;
            if (i != null)
            {
                if ((view = i.getFocusedChild()) != null && !h.c(view))
                {
                    return view;
                }
            }
            return null;
        }

        public int y()
        {
            Adapter adapter;
            if (i != null)
            {
                adapter = i.getAdapter();
            } else
            {
                adapter = null;
            }
            if (adapter != null)
            {
                return adapter.getItemCount();
            } else
            {
                return 0;
            }
        }

        void z()
        {
            if (j != null)
            {
                j.f();
            }
        }

        public LayoutManager()
        {
            a = false;
            b = false;
        }
    }


    private class Adapter
    {
        private class AdapterDataObservable extends Observable
        {

            public void a(int i, int j)
            {
                a(i, j, null);
            }

            public void a(int i, int j, Object obj)
            {
                for (int k = mObservers.size() - 1; k >= 0; k--)
                {
                    ((AdapterDataObserver)mObservers.get(k)).a(i, j, obj);
                }

            }

            public boolean a()
            {
                return !mObservers.isEmpty();
            }

            public void b()
            {
                for (int i = mObservers.size() - 1; i >= 0; i--)
                {
                    ((AdapterDataObserver)mObservers.get(i)).a();
                }

            }

            public void b(int i, int j)
            {
                for (int k = mObservers.size() - 1; k >= 0; k--)
                {
                    ((AdapterDataObserver)mObservers.get(k)).b(i, j);
                }

            }

            public void c(int i, int j)
            {
                for (int k = mObservers.size() - 1; k >= 0; k--)
                {
                    ((AdapterDataObserver)mObservers.get(k)).c(i, j);
                }

            }

            public void d(int i, int j)
            {
                for (int k = mObservers.size() - 1; k >= 0; k--)
                {
                    ((AdapterDataObserver)mObservers.get(k)).a(i, j, 1);
                }

            }

            AdapterDataObservable()
            {
            }
        }


        private boolean mHasStableIds;
        private final AdapterDataObservable mObservable = new AdapterDataObservable();

        public final void bindViewHolder(ViewHolder viewholder, int i)
        {
            viewholder.mPosition = i;
            if (hasStableIds())
            {
                viewholder.mItemId = getItemId(i);
            }
            viewholder.setFlags(1, 519);
            TraceCompat.a("RV OnBindView");
            onBindViewHolder(viewholder, i, viewholder.getUnmodifiedPayloads());
            viewholder.clearPayload();
            TraceCompat.a();
        }

        public final ViewHolder createViewHolder(ViewGroup viewgroup, int i)
        {
            TraceCompat.a("RV CreateView");
            viewgroup = onCreateViewHolder(viewgroup, i);
            viewgroup.mItemViewType = i;
            TraceCompat.a();
            return viewgroup;
        }

        public abstract int getItemCount();

        public long getItemId(int i)
        {
            return -1L;
        }

        public int getItemViewType(int i)
        {
            return 0;
        }

        public final boolean hasObservers()
        {
            return mObservable.a();
        }

        public final boolean hasStableIds()
        {
            return mHasStableIds;
        }

        public final void notifyDataSetChanged()
        {
            mObservable.b();
        }

        public final void notifyItemChanged(int i)
        {
            mObservable.a(i, 1);
        }

        public final void notifyItemChanged(int i, Object obj)
        {
            mObservable.a(i, 1, obj);
        }

        public final void notifyItemInserted(int i)
        {
            mObservable.b(i, 1);
        }

        public final void notifyItemMoved(int i, int j)
        {
            mObservable.d(i, j);
        }

        public final void notifyItemRangeChanged(int i, int j)
        {
            mObservable.a(i, j);
        }

        public final void notifyItemRangeChanged(int i, int j, Object obj)
        {
            mObservable.a(i, j, obj);
        }

        public final void notifyItemRangeInserted(int i, int j)
        {
            mObservable.b(i, j);
        }

        public final void notifyItemRangeRemoved(int i, int j)
        {
            mObservable.c(i, j);
        }

        public final void notifyItemRemoved(int i)
        {
            mObservable.c(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerview)
        {
        }

        public abstract void onBindViewHolder(ViewHolder viewholder, int i);

        public void onBindViewHolder(ViewHolder viewholder, int i, List list)
        {
            onBindViewHolder(viewholder, i);
        }

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerview)
        {
        }

        public boolean onFailedToRecycleView(ViewHolder viewholder)
        {
            return false;
        }

        public void onViewAttachedToWindow(ViewHolder viewholder)
        {
        }

        public void onViewDetachedFromWindow(ViewHolder viewholder)
        {
        }

        public void onViewRecycled(ViewHolder viewholder)
        {
        }

        public void registerAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.registerObserver(adapterdataobserver);
        }

        public void setHasStableIds(boolean flag)
        {
            if (hasObservers())
            {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else
            {
                mHasStableIds = flag;
                return;
            }
        }

        public void unregisterAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.unregisterObserver(adapterdataobserver);
        }

        public Adapter()
        {
            mHasStableIds = false;
        }
    }


    private class OnChildAttachStateChangeListener
    {

        public abstract void a(View view);

        public abstract void b(View view);
    }


    private class OnItemTouchListener
    {

        public abstract void a(boolean flag);

        public abstract boolean a(RecyclerView recyclerview, MotionEvent motionevent);

        public abstract void b(RecyclerView recyclerview, MotionEvent motionevent);
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        ViewHolder a;
        final Rect b;
        boolean c;
        boolean d;

        public boolean a()
        {
            return a.isRemoved();
        }

        public boolean b()
        {
            return a.isChanged();
        }

        public int c()
        {
            return a.getLayoutPosition();
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = new Rect();
            c = true;
            d = false;
        }
    }


    private class OnScrollListener
    {

        public void onScrollStateChanged(RecyclerView recyclerview, int i)
        {
        }

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
        }

        public OnScrollListener()
        {
        }
    }


    private class ItemDecoration
    {

        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerview)
        {
            rect.set(0, 0, 0, 0);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, State state)
        {
            getItemOffsets(rect, ((LayoutParams)view.getLayoutParams()).c(), recyclerview);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerview, State state)
        {
            onDraw(canvas, recyclerview);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview)
        {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerview, State state)
        {
            onDrawOver(canvas, recyclerview);
        }

        public ItemDecoration()
        {
        }
    }


    private class ChildDrawingOrderCallback
    {

        public abstract int a(int i, int j);
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i)
            {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        Parcelable a;

        private void a(SavedState savedstate)
        {
            a = savedstate.a;
        }

        static void a(SavedState savedstate, SavedState savedstate1)
        {
            savedstate.a(savedstate1);
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(a, 0);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readParcelable(android/support/v7/widget/RecyclerView$LayoutManager.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
