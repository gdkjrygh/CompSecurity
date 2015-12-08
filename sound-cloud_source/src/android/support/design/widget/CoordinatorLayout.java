// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

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
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayoutInsetsHelperLollipop, CoordinatorLayoutInsetsHelper, ViewGroupUtils

public class CoordinatorLayout extends ViewGroup
    implements NestedScrollingParent
{
    final class ApplyInsetsListener
        implements OnApplyWindowInsetsListener
    {

        final CoordinatorLayout this$0;

        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
        {
            setWindowInsets(windowinsetscompat);
            return windowinsetscompat.consumeSystemWindowInsets();
        }

        ApplyInsetsListener()
        {
            this$0 = CoordinatorLayout.this;
            super();
        }
    }

    public static abstract class Behavior
    {

        public static Object getTag(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).mBehaviorTag;
        }

        public static void setTag(View view, Object obj)
        {
            ((LayoutParams)view.getLayoutParams()).mBehaviorTag = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
        {
            return getScrimOpacity(coordinatorlayout, view) > 0.0F;
        }

        public final int getScrimColor(CoordinatorLayout coordinatorlayout, View view)
        {
            return 0xff000000;
        }

        public final float getScrimOpacity(CoordinatorLayout coordinatorlayout, View view)
        {
            return 0.0F;
        }

        public boolean isDirty(CoordinatorLayout coordinatorlayout, View view)
        {
            return false;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return false;
        }

        public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorlayout, View view, WindowInsetsCompat windowinsetscompat)
        {
            return windowinsetscompat;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
        {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
        {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
        {
            return false;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
        {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
        {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
        {
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
        {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
        {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
        {
            return false;
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return false;
        }

        public Behavior()
        {
        }

        public Behavior(Context context, AttributeSet attributeset)
        {
        }
    }

    public static interface DefaultBehavior
        extends Annotation
    {

        public abstract Class value();
    }

    final class HierarchyChangeListener
        implements android.view.ViewGroup.OnHierarchyChangeListener
    {

        final CoordinatorLayout this$0;

        public final void onChildViewAdded(View view, View view1)
        {
            if (mOnHierarchyChangeListener != null)
            {
                mOnHierarchyChangeListener.onChildViewAdded(view, view1);
            }
        }

        public final void onChildViewRemoved(View view, View view1)
        {
            dispatchDependentViewRemoved(view1);
            if (mOnHierarchyChangeListener != null)
            {
                mOnHierarchyChangeListener.onChildViewRemoved(view, view1);
            }
        }

        HierarchyChangeListener()
        {
            this$0 = CoordinatorLayout.this;
            super();
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int anchorGravity;
        public int gravity;
        public int keyline;
        View mAnchorDirectChild;
        int mAnchorId;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScroll;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        final Rect mLastChildRect;

        private void resolveAnchorView(View view, CoordinatorLayout coordinatorlayout)
        {
            mAnchorView = coordinatorlayout.findViewById(mAnchorId);
            if (mAnchorView != null)
            {
                View view1 = mAnchorView;
                for (ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
                {
                    if (viewparent == view)
                    {
                        if (coordinatorlayout.isInEditMode())
                        {
                            mAnchorDirectChild = null;
                            mAnchorView = null;
                            return;
                        } else
                        {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    if (viewparent instanceof View)
                    {
                        view1 = (View)viewparent;
                    }
                }

                mAnchorDirectChild = view1;
                return;
            }
            if (coordinatorlayout.isInEditMode())
            {
                mAnchorDirectChild = null;
                mAnchorView = null;
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder("Could not find CoordinatorLayout descendant view with id ")).append(coordinatorlayout.getResources().getResourceName(mAnchorId)).append(" to anchor view ").append(view).toString());
            }
        }

        private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorlayout)
        {
            if (mAnchorView.getId() != mAnchorId)
            {
                return false;
            }
            View view1 = mAnchorView;
            for (ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout; viewparent = viewparent.getParent())
            {
                if (viewparent == null || viewparent == view)
                {
                    mAnchorDirectChild = null;
                    mAnchorView = null;
                    return false;
                }
                if (viewparent instanceof View)
                {
                    view1 = (View)viewparent;
                }
            }

            mAnchorDirectChild = view1;
            return true;
        }

        void acceptNestedScroll(boolean flag)
        {
            mDidAcceptNestedScroll = flag;
        }

        boolean checkAnchorChanged()
        {
            return mAnchorView == null && mAnchorId != -1;
        }

        boolean dependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return view1 == mAnchorDirectChild || mBehavior != null && mBehavior.layoutDependsOn(coordinatorlayout, view, view1);
        }

        boolean didBlockInteraction()
        {
            if (mBehavior == null)
            {
                mDidBlockInteraction = false;
            }
            return mDidBlockInteraction;
        }

        View findAnchorView(CoordinatorLayout coordinatorlayout, View view)
        {
            if (mAnchorId == -1)
            {
                mAnchorDirectChild = null;
                mAnchorView = null;
                return null;
            }
            if (mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
            {
                resolveAnchorView(view, coordinatorlayout);
            }
            return mAnchorView;
        }

        public int getAnchorId()
        {
            return mAnchorId;
        }

        public Behavior getBehavior()
        {
            return mBehavior;
        }

        boolean getChangedAfterNestedScroll()
        {
            return mDidChangeAfterNestedScroll;
        }

        Rect getLastChildRect()
        {
            return mLastChildRect;
        }

        void invalidateAnchor()
        {
            mAnchorDirectChild = null;
            mAnchorView = null;
        }

        boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
        {
            if (mDidBlockInteraction)
            {
                return true;
            }
            boolean flag1 = mDidBlockInteraction;
            boolean flag;
            if (mBehavior != null)
            {
                flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
            } else
            {
                flag = false;
            }
            flag |= flag1;
            mDidBlockInteraction = flag;
            return flag;
        }

        boolean isDirty(CoordinatorLayout coordinatorlayout, View view)
        {
            return mBehavior != null && mBehavior.isDirty(coordinatorlayout, view);
        }

        boolean isNestedScrollAccepted()
        {
            return mDidAcceptNestedScroll;
        }

        void resetChangedAfterNestedScroll()
        {
            mDidChangeAfterNestedScroll = false;
        }

        void resetNestedScroll()
        {
            mDidAcceptNestedScroll = false;
        }

        void resetTouchBehaviorTracking()
        {
            mDidBlockInteraction = false;
        }

        public void setAnchorId(int i)
        {
            invalidateAnchor();
            mAnchorId = i;
        }

        public void setBehavior(Behavior behavior)
        {
            if (mBehavior != behavior)
            {
                mBehavior = behavior;
                mBehaviorTag = null;
                mBehaviorResolved = true;
            }
        }

        void setChangedAfterNestedScroll(boolean flag)
        {
            mDidChangeAfterNestedScroll = flag;
        }

        void setLastChildRect(Rect rect)
        {
            mLastChildRect.set(rect);
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mBehaviorResolved = false;
            gravity = 0;
            anchorGravity = 0;
            keyline = -1;
            mAnchorId = -1;
            mLastChildRect = new Rect();
        }

        LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mBehaviorResolved = false;
            gravity = 0;
            anchorGravity = 0;
            keyline = -1;
            mAnchorId = -1;
            mLastChildRect = new Rect();
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout_LayoutParams);
            gravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
            mAnchorId = typedarray.getResourceId(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_layout_anchor, -1);
            anchorGravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
            keyline = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_layout_keyline, -1);
            mBehaviorResolved = typedarray.hasValue(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_layout_behavior);
            if (mBehaviorResolved)
            {
                mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.R.styleable.CoordinatorLayout_LayoutParams_layout_behavior));
            }
            typedarray.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            mBehaviorResolved = false;
            gravity = 0;
            anchorGravity = 0;
            keyline = -1;
            mAnchorId = -1;
            mLastChildRect = new Rect();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mBehaviorResolved = false;
            gravity = 0;
            anchorGravity = 0;
            keyline = -1;
            mAnchorId = -1;
            mLastChildRect = new Rect();
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mBehaviorResolved = false;
            gravity = 0;
            anchorGravity = 0;
            keyline = -1;
            mAnchorId = -1;
            mLastChildRect = new Rect();
        }
    }

    class OnPreDrawListener
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final CoordinatorLayout this$0;

        public boolean onPreDraw()
        {
            dispatchOnDependentViewChanged(false);
            return true;
        }

        OnPreDrawListener()
        {
            this$0 = CoordinatorLayout.this;
            super();
        }
    }

    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        SparseArray behaviorStates;

        public void writeToParcel(Parcel parcel, int i)
        {
            int k = 0;
            super.writeToParcel(parcel, i);
            int ai[];
            Parcelable aparcelable[];
            int j;
            if (behaviorStates != null)
            {
                j = behaviorStates.size();
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            ai = new int[j];
            aparcelable = new Parcelable[j];
            for (; k < j; k++)
            {
                ai[k] = behaviorStates.keyAt(k);
                aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
            }

            parcel.writeIntArray(ai);
            parcel.writeParcelableArray(aparcelable, i);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            int j = parcel.readInt();
            int ai[] = new int[j];
            parcel.readIntArray(ai);
            parcel = parcel.readParcelableArray(android/support/design/widget/CoordinatorLayout.getClassLoader());
            behaviorStates = new SparseArray(j);
            for (int i = 0; i < j; i++)
            {
                behaviorStates.append(ai[i], parcel[i]);
            }

        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public final volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }

    static class ViewElevationComparator
        implements Comparator
    {

        public int compare(View view, View view1)
        {
            float f = ViewCompat.getZ(view);
            float f1 = ViewCompat.getZ(view1);
            if (f > f1)
            {
                return -1;
            }
            return f >= f1 ? 0 : 1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((View)obj, (View)obj1);
        }

        ViewElevationComparator()
        {
        }
    }


    static final Class CONSTRUCTOR_PARAMS[] = {
        android/content/Context, android/util/AttributeSet
    };
    static final CoordinatorLayoutInsetsHelper INSETS_HELPER;
    static final String TAG = "CoordinatorLayout";
    static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME = android/support/design/widget/CoordinatorLayout.getPackage().getName();
    static final ThreadLocal sConstructors = new ThreadLocal();
    private View mBehaviorTouchView;
    private final List mDependencySortedChildren;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int mKeylines[];
    private WindowInsetsCompat mLastInsets;
    final Comparator mLayoutDependencyComparator;
    private boolean mNeedsPreDrawListener;
    private View mNestedScrollingDirectChild;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List mTempDependenciesList;
    private final int mTempIntPair[];
    private final List mTempList1;
    private final Rect mTempRect1;
    private final Rect mTempRect2;
    private final Rect mTempRect3;

    public CoordinatorLayout(Context context)
    {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeset, int i)
    {
        boolean flag = false;
        super(context, attributeset, i);
        mLayoutDependencyComparator = new _cls1();
        mDependencySortedChildren = new ArrayList();
        mTempList1 = new ArrayList();
        mTempDependenciesList = new ArrayList();
        mTempRect1 = new Rect();
        mTempRect2 = new Rect();
        mTempRect3 = new Rect();
        mTempIntPair = new int[2];
        mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout, i, android.support.design.R.style.Widget_Design_CoordinatorLayout);
        i = attributeset.getResourceId(android.support.design.R.styleable.CoordinatorLayout_keylines, 0);
        if (i != 0)
        {
            context = context.getResources();
            mKeylines = context.getIntArray(i);
            float f = context.getDisplayMetrics().density;
            int j = mKeylines.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                context = mKeylines;
                context[i] = (int)((float)context[i] * f);
            }

        }
        mStatusBarBackground = attributeset.getDrawable(android.support.design.R.styleable.CoordinatorLayout_statusBarBackground);
        attributeset.recycle();
        if (INSETS_HELPER != null)
        {
            INSETS_HELPER.setupForWindowInsets(this, new ApplyInsetsListener());
        }
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
    }

    private void dispatchChildApplyWindowInsets(WindowInsetsCompat windowinsetscompat)
    {
        if (!windowinsetscompat.isConsumed()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        j = getChildCount();
        i = 0;
_L6:
        if (i >= j) goto _L1; else goto _L3
_L3:
        Object obj;
        View view;
        view = getChildAt(i);
        obj = windowinsetscompat;
        if (!ViewCompat.getFitsSystemWindows(view))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((LayoutParams)view.getLayoutParams()).getBehavior();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        windowinsetscompat = ((Behavior) (obj)).onApplyWindowInsets(this, view, windowinsetscompat);
        if (windowinsetscompat.isConsumed()) goto _L1; else goto _L4
_L4:
        obj = ViewCompat.dispatchApplyWindowInsets(view, windowinsetscompat);
        if (((WindowInsetsCompat) (obj)).isConsumed()) goto _L1; else goto _L5
_L5:
        i++;
        windowinsetscompat = ((WindowInsetsCompat) (obj));
          goto _L6
    }

    private int getKeyline(int i)
    {
        if (mKeylines == null)
        {
            (new StringBuilder("No keylines defined for ")).append(this).append(" - attempted index lookup ").append(i);
            return 0;
        }
        if (i < 0 || i >= mKeylines.length)
        {
            (new StringBuilder("Keyline index ")).append(i).append(" out of range for ").append(this);
            return 0;
        } else
        {
            return mKeylines[i];
        }
    }

    private void getTopSortedChildren(List list)
    {
        list.clear();
        boolean flag = isChildrenDrawingOrderEnabled();
        int k = getChildCount();
        int i = k - 1;
        while (i >= 0) 
        {
            int j;
            if (flag)
            {
                j = getChildDrawingOrder(k, i);
            } else
            {
                j = i;
            }
            list.add(getChildAt(j));
            i--;
        }
        if (TOP_SORTED_CHILDREN_COMPARATOR != null)
        {
            Collections.sort(list, TOP_SORTED_CHILDREN_COMPARATOR);
        }
    }

    private void layoutChild(View view, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        Rect rect = mTempRect1;
        rect.set(getPaddingLeft() + layoutparams.leftMargin, getPaddingTop() + layoutparams.topMargin, getWidth() - getPaddingRight() - layoutparams.rightMargin, getHeight() - getPaddingBottom() - layoutparams.bottomMargin);
        if (mLastInsets != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view))
        {
            rect.left = rect.left + mLastInsets.getSystemWindowInsetLeft();
            rect.top = rect.top + mLastInsets.getSystemWindowInsetTop();
            rect.right = rect.right - mLastInsets.getSystemWindowInsetRight();
            rect.bottom = rect.bottom - mLastInsets.getSystemWindowInsetBottom();
        }
        Rect rect1 = mTempRect2;
        GravityCompat.apply(resolveGravity(layoutparams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i);
        view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
    }

    private void layoutChildWithAnchor(View view, View view1, int i)
    {
        view.getLayoutParams();
        Rect rect = mTempRect1;
        Rect rect1 = mTempRect2;
        getDescendantRect(view1, rect);
        getDesiredAnchoredChildRect(view, i, rect, rect1);
        view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
    }

    private void layoutChildWithKeyline(View view, int i, int j)
    {
        LayoutParams layoutparams;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        l1 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), j);
        k1 = getWidth();
        j1 = getHeight();
        l = view.getMeasuredWidth();
        i1 = view.getMeasuredHeight();
        int k = i;
        if (j == 1)
        {
            k = k1 - i;
        }
        i = getKeyline(k) - l;
        j = 0;
        l1 & 7;
        JVM INSTR lookupswitch 2: default 104
    //                   1: 227
    //                   5: 219;
           goto _L1 _L2 _L3
_L1:
        l1 & 0x70;
        JVM INSTR lookupswitch 2: default 136
    //                   16: 245
    //                   80: 237;
           goto _L4 _L5 _L6
_L4:
        i = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(i, k1 - getPaddingRight() - l - layoutparams.rightMargin));
        j = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(j, j1 - getPaddingBottom() - i1 - layoutparams.bottomMargin));
        view.layout(i, j, i + l, j + i1);
        return;
_L3:
        i += l;
          goto _L1
_L2:
        i += l / 2;
          goto _L1
_L6:
        j = i1 + 0;
          goto _L4
_L5:
        j = i1 / 2 + 0;
          goto _L4
    }

    static Behavior parseBehavior(Context context, AttributeSet attributeset, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        String s1;
        Constructor constructor;
        Constructor constructor1;
        if (s.startsWith("."))
        {
            s1 = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
        } else
        {
            s1 = s;
            if (s.indexOf('.') < 0)
            {
                s1 = (new StringBuilder()).append(WIDGET_PACKAGE_NAME).append('.').append(s).toString();
            }
        }
        try
        {
            s = (Map)sConstructors.get();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Could not inflate Behavior subclass ")).append(s1).toString(), context);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        s = new HashMap();
        sConstructors.set(s);
        constructor1 = (Constructor)s.get(s1);
        constructor = constructor1;
        if (constructor1 != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        constructor = Class.forName(s1, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
        s.put(s1, constructor);
        context = (Behavior)constructor.newInstance(new Object[] {
            context, attributeset
        });
        return context;
    }

    private boolean performIntercept(MotionEvent motionevent)
    {
        List list;
        boolean flag;
        int i;
        int j;
        int k;
        boolean flag3;
        j = MotionEventCompat.getActionMasked(motionevent);
        list = mTempList1;
        getTopSortedChildren(list);
        k = list.size();
        i = 0;
        flag = false;
        flag3 = false;
_L5:
        boolean flag2 = flag3;
        if (i >= k) goto _L2; else goto _L1
_L1:
        View view;
        LayoutParams layoutparams;
        Behavior behavior;
        view = (View)list.get(i);
        layoutparams = (LayoutParams)view.getLayoutParams();
        behavior = layoutparams.getBehavior();
        if (!flag3 && !flag || j == 0) goto _L4; else goto _L3
_L3:
        if (behavior != null)
        {
            behavior.onInterceptTouchEvent(this, view, null);
        }
_L7:
        i++;
          goto _L5
_L4:
        flag2 = flag3;
        if (!flag3)
        {
            flag2 = flag3;
            if (behavior != null)
            {
                flag3 = behavior.onInterceptTouchEvent(this, view, motionevent);
                flag2 = flag3;
                if (flag3)
                {
                    mBehaviorTouchView = view;
                    flag2 = flag3;
                }
            }
        }
        flag3 = layoutparams.didBlockInteraction();
        boolean flag4 = layoutparams.isBlockingInteractionBelow(this, view);
        boolean flag1;
        if (flag4 && !flag3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        flag3 = flag2;
        if (!flag4) goto _L7; else goto _L6
_L6:
        flag = flag1;
        flag3 = flag2;
        if (flag1) goto _L7; else goto _L2
_L2:
        list.clear();
        return flag2;
    }

    private void prepareChildren()
    {
        boolean flag2 = false;
        int k = getChildCount();
        boolean flag;
        int j;
        if (mDependencySortedChildren.size() != k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        for (j = 0; j < k;)
        {
            View view = getChildAt(j);
            LayoutParams layoutparams = getResolvedLayoutParams(view);
            boolean flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (layoutparams.isDirty(this, view))
                {
                    flag1 = true;
                }
            }
            layoutparams.findAnchorView(this, view);
            j++;
            flag = flag1;
        }

        if (flag)
        {
            mDependencySortedChildren.clear();
            for (int i = ((flag2) ? 1 : 0); i < k; i++)
            {
                mDependencySortedChildren.add(getChildAt(i));
            }

            Collections.sort(mDependencySortedChildren, mLayoutDependencyComparator);
        }
    }

    private void resetTouchBehaviors()
    {
        int i = 0;
        if (mBehaviorTouchView != null)
        {
            Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
            if (behavior != null)
            {
                long l = SystemClock.uptimeMillis();
                MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
                motionevent.recycle();
            }
            mBehaviorTouchView = null;
        }
        for (int j = getChildCount(); i < j; i++)
        {
            ((LayoutParams)getChildAt(i).getLayoutParams()).resetTouchBehaviorTracking();
        }

    }

    private static int resolveAnchoredChildGravity(int i)
    {
        int j = i;
        if (i == 0)
        {
            j = 17;
        }
        return j;
    }

    private static int resolveGravity(int i)
    {
        int j = i;
        if (i == 0)
        {
            j = 0x800033;
        }
        return j;
    }

    private static int resolveKeylineGravity(int i)
    {
        int j = i;
        if (i == 0)
        {
            j = 0x800035;
        }
        return j;
    }

    private void setWindowInsets(WindowInsetsCompat windowinsetscompat)
    {
        boolean flag1 = true;
        if (mLastInsets != windowinsetscompat)
        {
            mLastInsets = windowinsetscompat;
            boolean flag;
            if (windowinsetscompat != null && windowinsetscompat.getSystemWindowInsetTop() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mDrawStatusBarBackground = flag;
            if (!mDrawStatusBarBackground && getBackground() == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            setWillNotDraw(flag);
            dispatchChildApplyWindowInsets(windowinsetscompat);
            requestLayout();
        }
    }

    void addPreDrawListener()
    {
        if (mIsAttachedToWindow)
        {
            if (mOnPreDrawListener == null)
            {
                mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
        }
        mNeedsPreDrawListener = true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    void dispatchDependentViewRemoved(View view)
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = getChildAt(i);
            Behavior behavior = ((LayoutParams)view1.getLayoutParams()).getBehavior();
            if (behavior != null && behavior.layoutDependsOn(this, view1, view))
            {
                behavior.onDependentViewRemoved(this, view1, view);
            }
        }

    }

    public void dispatchDependentViewsChanged(View view)
    {
        int j = mDependencySortedChildren.size();
        int i = 0;
        boolean flag = false;
        while (i < j) 
        {
            View view1 = (View)mDependencySortedChildren.get(i);
            if (view1 == view)
            {
                flag = true;
            } else
            if (flag)
            {
                LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
                Behavior behavior = layoutparams.getBehavior();
                if (behavior != null && layoutparams.dependsOn(this, view1, view))
                {
                    behavior.onDependentViewChanged(this, view1, view);
                }
            }
            i++;
        }
    }

    void dispatchOnDependentViewChanged(boolean flag)
    {
        int i;
        int l;
        int i1;
        l = ViewCompat.getLayoutDirection(this);
        i1 = mDependencySortedChildren.size();
        i = 0;
_L7:
        if (i >= i1) goto _L2; else goto _L1
_L1:
        View view;
        int k;
        view = (View)mDependencySortedChildren.get(i);
        Object obj = (LayoutParams)view.getLayoutParams();
        for (int j = 0; j < i; j++)
        {
            View view2 = (View)mDependencySortedChildren.get(j);
            if (((LayoutParams) (obj)).mAnchorDirectChild == view2)
            {
                offsetChildToAnchor(view, l);
            }
        }

        obj = mTempRect1;
        Rect rect = mTempRect2;
        getLastChildRect(view, ((Rect) (obj)));
        getChildRect(view, true, rect);
        if (((Rect) (obj)).equals(rect))
        {
            continue; /* Loop/switch isn't completed */
        }
        recordLastChildRect(view, rect);
        k = i + 1;
_L4:
        View view1;
        LayoutParams layoutparams;
        Behavior behavior;
        if (k >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        view1 = (View)mDependencySortedChildren.get(k);
        layoutparams = (LayoutParams)view1.getLayoutParams();
        behavior = layoutparams.getBehavior();
        if (behavior != null && behavior.layoutDependsOn(this, view1, view))
        {
            if (flag || !layoutparams.getChangedAfterNestedScroll())
            {
                break; /* Loop/switch isn't completed */
            }
            layoutparams.resetChangedAfterNestedScroll();
        }
_L5:
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        boolean flag1 = behavior.onDependentViewChanged(this, view1, view);
        if (flag)
        {
            layoutparams.setChangedAfterNestedScroll(flag1);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        i++;
          goto _L7
_L2:
    }

    public boolean doViewsOverlap(View view, View view1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (view.getVisibility() == 0)
        {
            flag = flag1;
            if (view1.getVisibility() == 0)
            {
                Rect rect = mTempRect1;
                if (view.getParent() != this)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                getChildRect(view, flag, rect);
                view = mTempRect2;
                if (view1.getParent() != this)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                getChildRect(view1, flag, view);
                flag = flag1;
                if (rect.left <= ((Rect) (view)).right)
                {
                    flag = flag1;
                    if (rect.top <= ((Rect) (view)).bottom)
                    {
                        flag = flag1;
                        if (rect.right >= ((Rect) (view)).left)
                        {
                            flag = flag1;
                            if (rect.bottom >= ((Rect) (view)).top)
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.mBehavior != null && layoutparams.mBehavior.getScrimOpacity(this, view) > 0.0F)
        {
            if (mScrimPaint == null)
            {
                mScrimPaint = new Paint();
            }
            mScrimPaint.setColor(layoutparams.mBehavior.getScrimColor(this, view));
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), mScrimPaint);
        }
        return super.drawChild(canvas, view, l);
    }

    void ensurePreDrawListener()
    {
        boolean flag1 = false;
        int j = getChildCount();
        int i = 0;
label0:
        do
        {
label1:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!hasDependencies(getChildAt(i)))
                    {
                        break label1;
                    }
                    flag = true;
                }
                if (flag != mNeedsPreDrawListener)
                {
                    if (!flag)
                    {
                        break label0;
                    }
                    addPreDrawListener();
                }
                return;
            }
            i++;
        } while (true);
        removePreDrawListener();
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    void getChildRect(View view, boolean flag, Rect rect)
    {
        if (view.isLayoutRequested() || view.getVisibility() == 8)
        {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (flag)
        {
            getDescendantRect(view, rect);
            return;
        } else
        {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            return;
        }
    }

    public List getDependencies(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        List list = mTempDependenciesList;
        list.clear();
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = getChildAt(i);
            if (view1 != view && layoutparams.dependsOn(this, view, view1))
            {
                list.add(view1);
            }
        }

        return list;
    }

    void getDescendantRect(View view, Rect rect)
    {
        ViewGroupUtils.getDescendantRect(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect1)
    {
        LayoutParams layoutparams;
        int j;
        int l;
        int i1;
        int j1;
        layoutparams = (LayoutParams)view.getLayoutParams();
        j1 = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutparams.gravity), i);
        j = GravityCompat.getAbsoluteGravity(resolveGravity(layoutparams.anchorGravity), i);
        l = view.getMeasuredWidth();
        i1 = view.getMeasuredHeight();
        j & 7;
        JVM INSTR lookupswitch 2: default 80
    //                   1: 310
    //                   5: 302;
           goto _L1 _L2 _L3
_L1:
        i = rect.left;
_L13:
        j & 0x70;
        JVM INSTR lookupswitch 2: default 116
    //                   16: 336
    //                   80: 327;
           goto _L4 _L5 _L6
_L4:
        j = rect.top;
_L14:
        int k = i;
        j1 & 7;
        JVM INSTR lookupswitch 2: default 156
    //                   1: 352
    //                   5: 162;
           goto _L7 _L8 _L9
_L9:
        break; /* Loop/switch isn't completed */
_L7:
        k = i - l;
_L15:
        i = j;
        j1 & 0x70;
        JVM INSTR lookupswitch 2: default 196
    //                   16: 363
    //                   80: 202;
           goto _L10 _L11 _L12
_L12:
        break; /* Loop/switch isn't completed */
_L10:
        i = j - i1;
_L16:
        int k1 = getWidth();
        j = getHeight();
        k = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(k, k1 - getPaddingRight() - l - layoutparams.rightMargin));
        i = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(i, j - getPaddingBottom() - i1 - layoutparams.bottomMargin));
        rect1.set(k, i, k + l, i + i1);
        return;
_L3:
        i = rect.right;
          goto _L13
_L2:
        i = rect.left;
        i = rect.width() / 2 + i;
          goto _L13
_L6:
        j = rect.bottom;
          goto _L14
_L5:
        j = rect.top + rect.height() / 2;
          goto _L14
_L8:
        k = i - l / 2;
          goto _L15
_L11:
        i = j - i1 / 2;
          goto _L16
    }

    void getLastChildRect(View view, Rect rect)
    {
        rect.set(((LayoutParams)view.getLayoutParams()).getLastChildRect());
    }

    public int getNestedScrollAxes()
    {
        return mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    LayoutParams getResolvedLayoutParams(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mBehaviorResolved)
        {
            Class class1 = view.getClass();
            view = null;
            View view1;
            do
            {
                view1 = view;
                if (class1 == null)
                {
                    break;
                }
                view = (DefaultBehavior)class1.getAnnotation(android/support/design/widget/CoordinatorLayout$DefaultBehavior);
                view1 = view;
                if (view != null)
                {
                    break;
                }
                class1 = class1.getSuperclass();
            } while (true);
            if (view1 != null)
            {
                try
                {
                    layoutparams.setBehavior((Behavior)view1.value().newInstance());
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    (new StringBuilder("Default behavior class ")).append(view1.value().getName()).append(" could not be instantiated. Did you forget a default constructor?");
                }
            }
            layoutparams.mBehaviorResolved = true;
        }
        return layoutparams;
    }

    public Drawable getStatusBarBackground()
    {
        return mStatusBarBackground;
    }

    protected int getSuggestedMinimumHeight()
    {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth()
    {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    boolean hasDependencies(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.mAnchorView != null)
        {
            return true;
        }
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = getChildAt(i);
            if (view1 != view && layoutparams.dependsOn(this, view, view1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isPointInChildBounds(View view, int i, int j)
    {
        Rect rect = mTempRect1;
        getDescendantRect(view, rect);
        return rect.contains(i, j);
    }

    void offsetChildToAnchor(View view, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.mAnchorView != null)
        {
            Rect rect = mTempRect1;
            Rect rect1 = mTempRect2;
            Rect rect2 = mTempRect3;
            getDescendantRect(layoutparams.mAnchorView, rect);
            getChildRect(view, false, rect1);
            getDesiredAnchoredChildRect(view, i, rect, rect2);
            i = rect2.left - rect1.left;
            int j = rect2.top - rect1.top;
            if (i != 0)
            {
                view.offsetLeftAndRight(i);
            }
            if (j != 0)
            {
                view.offsetTopAndBottom(j);
            }
            if (i != 0 || j != 0)
            {
                Behavior behavior = layoutparams.getBehavior();
                if (behavior != null)
                {
                    behavior.onDependentViewChanged(this, view, layoutparams.mAnchorView);
                }
            }
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        resetTouchBehaviors();
        if (mNeedsPreDrawListener)
        {
            if (mOnPreDrawListener == null)
            {
                mOnPreDrawListener = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
        }
        mIsAttachedToWindow = true;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        resetTouchBehaviors();
        if (mNeedsPreDrawListener && mOnPreDrawListener != null)
        {
            getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
        }
        if (mNestedScrollingTarget != null)
        {
            onStopNestedScroll(mNestedScrollingTarget);
        }
        mIsAttachedToWindow = false;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mDrawStatusBarBackground && mStatusBarBackground != null)
        {
            int i;
            if (mLastInsets != null)
            {
                i = mLastInsets.getSystemWindowInsetTop();
            } else
            {
                i = 0;
            }
            if (i > 0)
            {
                mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                mStatusBarBackground.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (i == 0)
        {
            resetTouchBehaviors();
        }
        boolean flag = performIntercept(motionevent);
        if (i == 1 || i == 3)
        {
            resetTouchBehaviors();
        }
        return flag;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        j = ViewCompat.getLayoutDirection(this);
        k = mDependencySortedChildren.size();
        for (i = 0; i < k; i++)
        {
            View view = (View)mDependencySortedChildren.get(i);
            Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
            if (behavior == null || !behavior.onLayoutChild(this, view, j))
            {
                onLayoutChild(view, j);
            }
        }

    }

    public void onLayoutChild(View view, int i)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.checkAnchorChanged())
        {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (layoutparams.mAnchorView != null)
        {
            layoutChildWithAnchor(view, layoutparams.mAnchorView, i);
            return;
        }
        if (layoutparams.keyline >= 0)
        {
            layoutChildWithKeyline(view, layoutparams.keyline, i);
            return;
        } else
        {
            layoutChild(view, i);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        boolean flag;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int l4;
        prepareChildren();
        ensurePreDrawListener();
        j2 = getPaddingLeft();
        int k2 = getPaddingTop();
        int l2 = getPaddingRight();
        int i3 = getPaddingBottom();
        int j3 = ViewCompat.getLayoutDirection(this);
        View view;
        LayoutParams layoutparams;
        Behavior behavior;
        boolean flag1;
        int l;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int i5;
        if (j3 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k3 = android.view.View.MeasureSpec.getMode(i);
        l3 = android.view.View.MeasureSpec.getSize(i);
        i4 = android.view.View.MeasureSpec.getMode(j);
        j4 = android.view.View.MeasureSpec.getSize(j);
        k1 = getSuggestedMinimumWidth();
        j1 = getSuggestedMinimumHeight();
        if (mLastInsets != null && ViewCompat.getFitsSystemWindows(this))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k4 = mDependencySortedChildren.size();
        l = 0;
        i1 = 0;
_L6:
        if (l >= k4)
        {
            break MISSING_BLOCK_LABEL_490;
        }
        view = (View)mDependencySortedChildren.get(l);
        layoutparams = (LayoutParams)view.getLayoutParams();
        l1 = 0;
        k = l1;
        if (layoutparams.keyline < 0) goto _L2; else goto _L1
_L1:
        k = l1;
        if (k3 == 0) goto _L2; else goto _L3
_L3:
        i2 = getKeyline(layoutparams.keyline);
        l4 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), j3) & 7;
        if ((l4 != 3 || flag) && (l4 != 5 || !flag)) goto _L5; else goto _L4
_L4:
        k = Math.max(0, l3 - l2 - i2);
_L2:
        if (flag1 && !ViewCompat.getFitsSystemWindows(view))
        {
            l1 = mLastInsets.getSystemWindowInsetLeft();
            i5 = mLastInsets.getSystemWindowInsetRight();
            i2 = mLastInsets.getSystemWindowInsetTop();
            l4 = mLastInsets.getSystemWindowInsetBottom();
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(l3 - (l1 + i5), k3);
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(j4 - (i2 + l4), i4);
        } else
        {
            i2 = j;
            l1 = i;
        }
        behavior = layoutparams.getBehavior();
        if (behavior == null || !behavior.onMeasureChild(this, view, l1, k, i2, 0))
        {
            onMeasureChild(view, l1, k, i2, 0);
        }
        k1 = Math.max(k1, view.getMeasuredWidth() + (j2 + l2) + layoutparams.leftMargin + layoutparams.rightMargin);
        j1 = Math.max(j1, view.getMeasuredHeight() + (k2 + i3) + layoutparams.topMargin + layoutparams.bottomMargin);
        i1 = ViewCompat.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view));
        l++;
        if (true) goto _L6; else goto _L5
_L5:
        if (l4 == 5 && !flag) goto _L8; else goto _L7
_L7:
        k = l1;
        if (l4 != 3) goto _L2; else goto _L9
_L9:
        k = l1;
        if (!flag) goto _L2; else goto _L8
_L8:
        k = Math.max(0, i2 - j2);
          goto _L2
        setMeasuredDimension(ViewCompat.resolveSizeAndState(k1, i, 0xff000000 & i1), ViewCompat.resolveSizeAndState(j1, j, i1 << 16));
        return;
    }

    public void onMeasureChild(View view, int i, int j, int k, int l)
    {
        measureChildWithMargins(view, i, j, k, l);
    }

    public boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        int j = getChildCount();
        int i = 0;
        boolean flag1 = false;
        for (; i < j; i++)
        {
            View view1 = getChildAt(i);
            Object obj = (LayoutParams)view1.getLayoutParams();
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                continue;
            }
            obj = ((LayoutParams) (obj)).getBehavior();
            if (obj != null)
            {
                flag1 = ((Behavior) (obj)).onNestedFling(this, view1, view, f, f1, flag) | flag1;
            }
        }

        if (flag1)
        {
            dispatchOnDependentViewChanged(true);
        }
        return flag1;
    }

    public boolean onNestedPreFling(View view, float f, float f1)
    {
        int j = getChildCount();
        int i = 0;
        boolean flag = false;
        for (; i < j; i++)
        {
            View view1 = getChildAt(i);
            Object obj = (LayoutParams)view1.getLayoutParams();
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                continue;
            }
            obj = ((LayoutParams) (obj)).getBehavior();
            if (obj != null)
            {
                flag = ((Behavior) (obj)).onNestedPreFling(this, view1, view, f, f1) | flag;
            }
        }

        return flag;
    }

    public void onNestedPreScroll(View view, int i, int j, int ai[])
    {
        int k;
        int l;
        int i1;
        int j1;
        int i2;
        l = 0;
        k = 0;
        i1 = 0;
        i2 = getChildCount();
        j1 = 0;
_L2:
        if (j1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        View view1 = getChildAt(j1);
        Object obj = (LayoutParams)view1.getLayoutParams();
        if (!((LayoutParams) (obj)).isNestedScrollAccepted())
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = ((LayoutParams) (obj)).getBehavior();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        int ai1[] = mTempIntPair;
        mTempIntPair[1] = 0;
        ai1[0] = 0;
        ((Behavior) (obj)).onNestedPreScroll(this, view1, view, i, j, mTempIntPair);
        int k1;
        if (i > 0)
        {
            l = Math.max(l, mTempIntPair[0]);
        } else
        {
            l = Math.min(l, mTempIntPair[0]);
        }
        if (j > 0)
        {
            k = Math.max(k, mTempIntPair[1]);
        } else
        {
            k = Math.min(k, mTempIntPair[1]);
        }
        k1 = 1;
        i1 = k;
        k = k1;
_L3:
        k1 = j1 + 1;
        j1 = i1;
        i1 = k;
        k = j1;
        j1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        ai[0] = l;
        ai[1] = k;
        if (i1 != 0)
        {
            dispatchOnDependentViewChanged(true);
        }
        return;
        int l1 = k;
        k = i1;
        i1 = l1;
          goto _L3
    }

    public void onNestedScroll(View view, int i, int j, int k, int l)
    {
        int j1 = getChildCount();
        boolean flag = false;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view1 = getChildAt(i1);
            Object obj = (LayoutParams)view1.getLayoutParams();
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                continue;
            }
            obj = ((LayoutParams) (obj)).getBehavior();
            if (obj != null)
            {
                ((Behavior) (obj)).onNestedScroll(this, view1, view, i, j, k, l);
                flag = true;
            }
        }

        if (flag)
        {
            dispatchOnDependentViewChanged(true);
        }
    }

    public void onNestedScrollAccepted(View view, View view1, int i)
    {
        mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i);
        mNestedScrollingDirectChild = view;
        mNestedScrollingTarget = view1;
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            View view2 = getChildAt(j);
            Object obj = (LayoutParams)view2.getLayoutParams();
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                continue;
            }
            obj = ((LayoutParams) (obj)).getBehavior();
            if (obj != null)
            {
                ((Behavior) (obj)).onNestedScrollAccepted(this, view2, view, view1, i);
            }
        }

    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        parcelable = ((SavedState) (parcelable)).behaviorStates;
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            int k = view.getId();
            Behavior behavior = getResolvedLayoutParams(view).getBehavior();
            if (k == -1 || behavior == null)
            {
                continue;
            }
            Parcelable parcelable1 = (Parcelable)parcelable.get(k);
            if (parcelable1 != null)
            {
                behavior.onRestoreInstanceState(this, view, parcelable1);
            }
        }

    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        SparseArray sparsearray = new SparseArray();
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            Object obj = getChildAt(i);
            int k = ((View) (obj)).getId();
            Behavior behavior = ((LayoutParams)((View) (obj)).getLayoutParams()).getBehavior();
            if (k == -1 || behavior == null)
            {
                continue;
            }
            obj = behavior.onSaveInstanceState(this, ((View) (obj)));
            if (obj != null)
            {
                sparsearray.append(k, obj);
            }
        }

        savedstate.behaviorStates = sparsearray;
        return savedstate;
    }

    public boolean onStartNestedScroll(View view, View view1, int i)
    {
        int k = getChildCount();
        int j = 0;
        boolean flag = false;
        while (j < k) 
        {
            View view2 = getChildAt(j);
            LayoutParams layoutparams = (LayoutParams)view2.getLayoutParams();
            Behavior behavior = layoutparams.getBehavior();
            if (behavior != null)
            {
                boolean flag1 = behavior.onStartNestedScroll(this, view2, view, view1, i);
                flag |= flag1;
                layoutparams.acceptNestedScroll(flag1);
            } else
            {
                layoutparams.acceptNestedScroll(false);
            }
            j++;
        }
        return flag;
    }

    public void onStopNestedScroll(View view)
    {
        mNestedScrollingParentHelper.onStopNestedScroll(view);
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view1 = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
            if (!layoutparams.isNestedScrollAccepted())
            {
                continue;
            }
            Behavior behavior = layoutparams.getBehavior();
            if (behavior != null)
            {
                behavior.onStopNestedScroll(this, view1, view);
            }
            layoutparams.resetNestedScroll();
            layoutparams.resetChangedAfterNestedScroll();
        }

        mNestedScrollingDirectChild = null;
        mNestedScrollingTarget = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = MotionEventCompat.getActionMasked(motionevent);
        if (mBehaviorTouchView != null) goto _L2; else goto _L1
_L1:
        boolean flag = performIntercept(motionevent);
        if (!flag) goto _L4; else goto _L3
_L3:
        boolean flag1;
        Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
        flag1 = flag;
        if (behavior != null)
        {
            behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
            flag1 = flag;
        }
_L8:
        if (mBehaviorTouchView != null) goto _L6; else goto _L5
_L5:
        flag = super.onTouchEvent(motionevent) | false;
_L7:
        if (i == 1 || i == 3)
        {
            resetTouchBehaviors();
        }
        return flag;
_L6:
        flag = flag2;
        if (flag1)
        {
            super.onTouchEvent(null);
            flag = flag2;
        }
        if (true) goto _L7; else goto _L4
_L4:
        flag1 = flag;
        if (true) goto _L8; else goto _L2
_L2:
        flag = false;
        if (true) goto _L3; else goto _L9
_L9:
    }

    void recordLastChildRect(View view, Rect rect)
    {
        ((LayoutParams)view.getLayoutParams()).setLastChildRect(rect);
    }

    void removePreDrawListener()
    {
        if (mIsAttachedToWindow && mOnPreDrawListener != null)
        {
            getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
        }
        mNeedsPreDrawListener = false;
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        if (flag)
        {
            resetTouchBehaviors();
        }
    }

    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
    {
        mOnHierarchyChangeListener = onhierarchychangelistener;
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i)
    {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else
        {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            TOP_SORTED_CHILDREN_COMPARATOR = new ViewElevationComparator();
            INSETS_HELPER = new CoordinatorLayoutInsetsHelperLollipop();
        } else
        {
            TOP_SORTED_CHILDREN_COMPARATOR = null;
            INSETS_HELPER = null;
        }
    }



    private class _cls1
        implements Comparator
    {

        final CoordinatorLayout this$0;

        public int compare(View view, View view1)
        {
            if (view == view1)
            {
                return 0;
            }
            if (((LayoutParams)view.getLayoutParams()).dependsOn(CoordinatorLayout.this, view, view1))
            {
                return 1;
            }
            return !((LayoutParams)view1.getLayoutParams()).dependsOn(CoordinatorLayout.this, view1, view) ? 0 : -1;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((View)obj, (View)obj1);
        }

        _cls1()
        {
            this$0 = CoordinatorLayout.this;
            super();
        }
    }

}
