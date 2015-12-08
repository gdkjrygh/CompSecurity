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
import android.util.Log;
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

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
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

        public void onChildViewAdded(View view, View view1)
        {
            if (mOnHierarchyChangeListener != null)
            {
                mOnHierarchyChangeListener.onChildViewAdded(view, view1);
            }
        }

        public void onChildViewRemoved(View view, View view1)
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
                throw new IllegalStateException((new StringBuilder()).append("Could not find CoordinatorLayout descendant view with id ").append(coordinatorlayout.getResources().getResourceName(mAnchorId)).append(" to anchor view ").append(view).toString());
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
        SparseArray behaviorStates;

        public void writeToParcel(Parcel parcel, int i)
        {
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
            for (int k = 0; k < j; k++)
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
        super(context, attributeset, i);
        mLayoutDependencyComparator = new Comparator() {

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

            
            {
                this$0 = CoordinatorLayout.this;
                super();
            }
        };
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
            for (i = 0; i < j; i++)
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
        i = 0;
        j = getChildCount();
_L6:
        if (i >= j) goto _L1; else goto _L3
_L3:
        WindowInsetsCompat windowinsetscompat1;
        View view;
        view = getChildAt(i);
        windowinsetscompat1 = windowinsetscompat;
        if (!ViewCompat.getFitsSystemWindows(view))
        {
            break; /* Loop/switch isn't completed */
        }
        Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
        windowinsetscompat1 = windowinsetscompat;
        if (behavior == null)
        {
            break; /* Loop/switch isn't completed */
        }
        windowinsetscompat1 = behavior.onApplyWindowInsets(this, view, windowinsetscompat);
        if (windowinsetscompat1.isConsumed()) goto _L1; else goto _L4
_L4:
        windowinsetscompat1 = ViewCompat.dispatchApplyWindowInsets(view, windowinsetscompat1);
        if (windowinsetscompat1.isConsumed()) goto _L1; else goto _L5
_L5:
        i++;
        windowinsetscompat = windowinsetscompat1;
          goto _L6
    }

    private int getKeyline(int i)
    {
        if (mKeylines == null)
        {
            Log.e("CoordinatorLayout", (new StringBuilder()).append("No keylines defined for ").append(this).append(" - attempted index lookup ").append(i).toString());
            return 0;
        }
        if (i < 0 || i >= mKeylines.length)
        {
            Log.e("CoordinatorLayout", (new StringBuilder()).append("Keyline index ").append(i).append(" out of range for ").append(this).toString());
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
        Object obj = (LayoutParams)view.getLayoutParams();
        obj = mTempRect1;
        Rect rect = mTempRect2;
        getDescendantRect(view1, ((Rect) (obj)));
        getDesiredAnchoredChildRect(view, i, ((Rect) (obj)), rect);
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
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
        j = 0 + i1;
          goto _L4
_L5:
        j = 0 + i1 / 2;
          goto _L4
    }

    static Behavior parseBehavior(Context context, AttributeSet attributeset, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        Object obj;
        Object obj1;
        Constructor constructor;
        if (s.startsWith("."))
        {
            s = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
        } else
        if (s.indexOf('.') < 0)
        {
            s = (new StringBuilder()).append(WIDGET_PACKAGE_NAME).append('.').append(s).toString();
        }
        try
        {
            obj1 = (Map)sConstructors.get();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not inflate Behavior subclass ").append(s).toString(), context);
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = new HashMap();
        sConstructors.set(obj);
        constructor = (Constructor)((Map) (obj)).get(s);
        obj1 = constructor;
        if (constructor != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj1 = Class.forName(s, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
        ((Map) (obj)).put(s, obj1);
        context = (Behavior)((Constructor) (obj1)).newInstance(new Object[] {
            context, attributeset
        });
        return context;
    }

    private boolean performIntercept(MotionEvent motionevent)
    {
        Object obj;
        List list;
        boolean flag;
        int i;
        int j;
        int k;
        boolean flag4;
        flag4 = false;
        flag = false;
        obj = null;
        j = MotionEventCompat.getActionMasked(motionevent);
        list = mTempList1;
        getTopSortedChildren(list);
        k = list.size();
        i = 0;
_L5:
        boolean flag3 = flag4;
        if (i >= k) goto _L2; else goto _L1
_L1:
        Object obj1;
        View view;
        Behavior behavior;
        view = (View)list.get(i);
        obj1 = (LayoutParams)view.getLayoutParams();
        behavior = ((LayoutParams) (obj1)).getBehavior();
        if (!flag4 && !flag || j == 0) goto _L4; else goto _L3
_L3:
        boolean flag2;
        boolean flag5;
        obj1 = obj;
        flag5 = flag4;
        flag2 = flag;
        if (behavior != null)
        {
            obj1 = obj;
            if (obj != null)
            {
                long l = SystemClock.uptimeMillis();
                obj1 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            }
            behavior.onInterceptTouchEvent(this, view, ((MotionEvent) (obj1)));
            flag2 = flag;
            flag5 = flag4;
        }
_L7:
        i++;
        obj = obj1;
        flag4 = flag5;
        flag = flag2;
          goto _L5
_L4:
        flag3 = flag4;
        if (!flag4)
        {
            flag3 = flag4;
            if (behavior != null)
            {
                flag4 = behavior.onInterceptTouchEvent(this, view, motionevent);
                flag3 = flag4;
                if (flag4)
                {
                    mBehaviorTouchView = view;
                    flag3 = flag4;
                }
            }
        }
        flag5 = ((LayoutParams) (obj1)).didBlockInteraction();
        flag4 = ((LayoutParams) (obj1)).isBlockingInteractionBelow(this, view);
        boolean flag1;
        if (flag4 && !flag5)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj1 = obj;
        flag5 = flag3;
        flag2 = flag1;
        if (!flag4) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        flag5 = flag3;
        flag2 = flag1;
        if (flag1) goto _L7; else goto _L2
_L2:
        list.clear();
        return flag3;
    }

    private void prepareChildren()
    {
        int k = getChildCount();
        int i;
        boolean flag;
        boolean flag1;
        if (mDependencySortedChildren.size() != k)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        flag1 = false;
        flag = i;
        for (i = ((flag1) ? 1 : 0); i < k;)
        {
            View view = getChildAt(i);
            LayoutParams layoutparams = getResolvedLayoutParams(view);
            boolean flag2 = flag;
            if (!flag)
            {
                flag2 = flag;
                if (layoutparams.isDirty(this, view))
                {
                    flag2 = true;
                }
            }
            layoutparams.findAnchorView(this, view);
            i++;
            flag = flag2;
        }

        if (flag)
        {
            mDependencySortedChildren.clear();
            for (int j = 0; j < k; j++)
            {
                mDependencySortedChildren.add(getChildAt(j));
            }

            Collections.sort(mDependencySortedChildren, mLayoutDependencyComparator);
        }
    }

    private void resetTouchBehaviors()
    {
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
        int j = getChildCount();
        for (int i = 0; i < j; i++)
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
        boolean flag = false;
        int i = 0;
        while (i < j) 
        {
            View view1 = (View)mDependencySortedChildren.get(i);
            boolean flag1;
            if (view1 == view)
            {
                flag1 = true;
            } else
            {
                flag1 = flag;
                if (flag)
                {
                    LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
                    Behavior behavior = layoutparams.getBehavior();
                    flag1 = flag;
                    if (behavior != null)
                    {
                        flag1 = flag;
                        if (layoutparams.dependsOn(this, view1, view))
                        {
                            behavior.onDependentViewChanged(this, view1, view);
                            flag1 = flag;
                        }
                    }
                }
            }
            i++;
            flag = flag1;
        }
    }

    void dispatchOnDependentViewChanged(boolean flag)
    {
        int l = ViewCompat.getLayoutDirection(this);
        int i1 = mDependencySortedChildren.size();
        int i = 0;
        while (i < i1) 
        {
            View view = (View)mDependencySortedChildren.get(i);
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
            if (!((Rect) (obj)).equals(rect))
            {
                recordLastChildRect(view, rect);
                int k = i + 1;
                while (k < i1) 
                {
                    View view1 = (View)mDependencySortedChildren.get(k);
                    LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
                    Behavior behavior = layoutparams.getBehavior();
                    if (behavior != null && behavior.layoutDependsOn(this, view1, view))
                    {
                        if (!flag && layoutparams.getChangedAfterNestedScroll())
                        {
                            layoutparams.resetChangedAfterNestedScroll();
                        } else
                        {
                            boolean flag1 = behavior.onDependentViewChanged(this, view1, view);
                            if (flag)
                            {
                                layoutparams.setChangedAfterNestedScroll(flag1);
                            }
                        }
                    }
                    k++;
                }
            }
            i++;
        }
    }

    public boolean doViewsOverlap(View view, View view1)
    {
        if (view.getVisibility() == 0 && view1.getVisibility() == 0)
        {
            Rect rect = mTempRect1;
            boolean flag;
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
            return rect.left <= ((Rect) (view)).right && rect.top <= ((Rect) (view)).bottom && rect.right >= ((Rect) (view)).left && rect.bottom >= ((Rect) (view)).top;
        } else
        {
            return false;
        }
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
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            View view1 = getChildAt(i);
            if (view1 != view && layoutparams.dependsOn(this, view, view1))
            {
                list.add(view1);
            }
            i++;
        } while (true);
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
    //                   16: 334
    //                   80: 325;
           goto _L4 _L5 _L6
_L4:
        j = rect.top;
_L14:
        int k = i;
        j1 & 7;
        JVM INSTR lookupswitch 2: default 156
    //                   1: 350
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
    //                   16: 361
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
        i = rect.left + rect.width() / 2;
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
                    Log.e("CoordinatorLayout", (new StringBuilder()).append("Default behavior class ").append(view1.value().getName()).append(" could not be instantiated. Did you forget a default constructor?").toString(), view);
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
        LayoutParams layoutparams;
        int i;
        int j;
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.mAnchorView != null)
        {
            return true;
        }
        j = getChildCount();
        i = 0;
_L3:
        View view1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(i);
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (view1 == view || !layoutparams.dependsOn(this, view, view1)) goto _L5; else goto _L4
_L4:
        return true;
_L2:
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
        if (false)
        {
            throw new NullPointerException();
        }
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
        int l2;
        prepareChildren();
        ensurePreDrawListener();
        l2 = getPaddingLeft();
        int i3 = getPaddingTop();
        int j3 = getPaddingRight();
        int k3 = getPaddingBottom();
        int l3 = ViewCompat.getLayoutDirection(this);
        View view;
        LayoutParams layoutparams;
        Behavior behavior;
        boolean flag1;
        int l;
        int k2;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        if (l3 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i4 = android.view.View.MeasureSpec.getMode(i);
        j4 = android.view.View.MeasureSpec.getSize(i);
        k4 = android.view.View.MeasureSpec.getMode(j);
        l4 = android.view.View.MeasureSpec.getSize(j);
        k1 = getSuggestedMinimumWidth();
        j1 = getSuggestedMinimumHeight();
        i1 = 0;
        if (mLastInsets != null && ViewCompat.getFitsSystemWindows(this))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i5 = mDependencySortedChildren.size();
        l = 0;
        if (l >= i5)
        {
            break MISSING_BLOCK_LABEL_512;
        }
        view = (View)mDependencySortedChildren.get(l);
        layoutparams = (LayoutParams)view.getLayoutParams();
        l1 = 0;
        k = l1;
        if (layoutparams.keyline >= 0)
        {
            k = l1;
            if (i4 != 0)
            {
                i2 = getKeyline(layoutparams.keyline);
                j2 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), l3) & 7;
                if ((j2 != 3 || flag) && (j2 != 5 || !flag))
                {
                    break; /* Loop/switch isn't completed */
                }
                k = Math.max(0, j4 - j3 - i2);
            }
        }
_L4:
        i2 = i;
        j2 = j;
        k2 = i2;
        l1 = j2;
        if (flag1)
        {
            k2 = i2;
            l1 = j2;
            if (!ViewCompat.getFitsSystemWindows(view))
            {
                j2 = mLastInsets.getSystemWindowInsetLeft();
                k2 = mLastInsets.getSystemWindowInsetRight();
                l1 = mLastInsets.getSystemWindowInsetTop();
                i2 = mLastInsets.getSystemWindowInsetBottom();
                k2 = android.view.View.MeasureSpec.makeMeasureSpec(j4 - (j2 + k2), i4);
                l1 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - (l1 + i2), k4);
            }
        }
        behavior = layoutparams.getBehavior();
        if (behavior == null || !behavior.onMeasureChild(this, view, k2, k, l1, 0))
        {
            onMeasureChild(view, k2, k, l1, 0);
        }
        k1 = Math.max(k1, view.getMeasuredWidth() + (l2 + j3) + layoutparams.leftMargin + layoutparams.rightMargin);
        j1 = Math.max(j1, view.getMeasuredHeight() + (i3 + k3) + layoutparams.topMargin + layoutparams.bottomMargin);
        i1 = ViewCompat.combineMeasuredStates(i1, ViewCompat.getMeasuredState(view));
        l++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_117;
_L1:
        if (j2 != 5 || flag)
        {
            k = l1;
            if (j2 != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            k = l1;
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        k = Math.max(0, i2 - l2);
        if (true) goto _L4; else goto _L3
_L3:
        setMeasuredDimension(ViewCompat.resolveSizeAndState(k1, i, 0xff000000 & i1), ViewCompat.resolveSizeAndState(j1, j, i1 << 16));
        return;
    }

    public void onMeasureChild(View view, int i, int j, int k, int l)
    {
        measureChildWithMargins(view, i, j, k, l);
    }

    public boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        boolean flag1 = false;
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = getChildAt(i);
            Object obj = (LayoutParams)view1.getLayoutParams();
            boolean flag2;
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                flag2 = flag1;
            } else
            {
                obj = ((LayoutParams) (obj)).getBehavior();
                flag2 = flag1;
                if (obj != null)
                {
                    flag2 = flag1 | ((Behavior) (obj)).onNestedFling(this, view1, view, f, f1, flag);
                }
            }
            i++;
            flag1 = flag2;
        }
        if (flag1)
        {
            dispatchOnDependentViewChanged(true);
        }
        return flag1;
    }

    public boolean onNestedPreFling(View view, float f, float f1)
    {
        boolean flag = false;
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = getChildAt(i);
            Object obj = (LayoutParams)view1.getLayoutParams();
            boolean flag1;
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                flag1 = flag;
            } else
            {
                obj = ((LayoutParams) (obj)).getBehavior();
                flag1 = flag;
                if (obj != null)
                {
                    flag1 = flag | ((Behavior) (obj)).onNestedPreFling(this, view1, view, f, f1);
                }
            }
            i++;
            flag = flag1;
        }
        return flag;
    }

    public void onNestedPreScroll(View view, int i, int j, int ai[])
    {
        int k = 0;
        int l = 0;
        boolean flag = false;
        int l1 = getChildCount();
        int i1 = 0;
        while (i1 < l1) 
        {
            View view1 = getChildAt(i1);
            Object obj = (LayoutParams)view1.getLayoutParams();
            int j1;
            int k1;
            if (!((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                k1 = l;
                j1 = k;
            } else
            {
                obj = ((LayoutParams) (obj)).getBehavior();
                j1 = k;
                k1 = l;
                if (obj != null)
                {
                    int ai1[] = mTempIntPair;
                    mTempIntPair[1] = 0;
                    ai1[0] = 0;
                    ((Behavior) (obj)).onNestedPreScroll(this, view1, view, i, j, mTempIntPair);
                    if (i > 0)
                    {
                        k = Math.max(k, mTempIntPair[0]);
                    } else
                    {
                        k = Math.min(k, mTempIntPair[0]);
                    }
                    if (j > 0)
                    {
                        l = Math.max(l, mTempIntPair[1]);
                    } else
                    {
                        l = Math.min(l, mTempIntPair[1]);
                    }
                    flag = true;
                    j1 = k;
                    k1 = l;
                }
            }
            i1++;
            k = j1;
            l = k1;
        }
        ai[0] = k;
        ai[1] = l;
        if (flag)
        {
            dispatchOnDependentViewChanged(true);
        }
    }

    public void onNestedScroll(View view, int i, int j, int k, int l)
    {
        int j1 = getChildCount();
        boolean flag = false;
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            Object obj = (LayoutParams)view1.getLayoutParams();
            if (((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                obj = ((LayoutParams) (obj)).getBehavior();
                if (obj != null)
                {
                    ((Behavior) (obj)).onNestedScroll(this, view1, view, i, j, k, l);
                    flag = true;
                }
            }
            i1++;
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
        int j = 0;
        while (j < k) 
        {
            View view2 = getChildAt(j);
            Object obj = (LayoutParams)view2.getLayoutParams();
            if (((LayoutParams) (obj)).isNestedScrollAccepted())
            {
                obj = ((LayoutParams) (obj)).getBehavior();
                if (obj != null)
                {
                    ((Behavior) (obj)).onNestedScrollAccepted(this, view2, view, view1, i);
                }
            }
            j++;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        parcelable = ((SavedState) (parcelable)).behaviorStates;
        int i = 0;
        for (int j = getChildCount(); i < j; i++)
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
        int i = 0;
        for (int j = getChildCount(); i < j; i++)
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
        boolean flag = false;
        int k = getChildCount();
        int j = 0;
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
        int i = 0;
        while (i < j) 
        {
            View view1 = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
            if (layoutparams.isNestedScrollAccepted())
            {
                Behavior behavior = layoutparams.getBehavior();
                if (behavior != null)
                {
                    behavior.onStopNestedScroll(this, view1, view);
                }
                layoutparams.resetNestedScroll();
                layoutparams.resetChangedAfterNestedScroll();
            }
            i++;
        }
        mNestedScrollingDirectChild = null;
        mNestedScrollingTarget = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Object obj;
        Object obj1;
        int i;
        boolean flag2;
        boolean flag3;
label0:
        {
            flag3 = false;
            boolean flag = false;
            obj = null;
            obj1 = null;
            i = MotionEventCompat.getActionMasked(motionevent);
            if (mBehaviorTouchView == null)
            {
                flag = performIntercept(motionevent);
                flag2 = flag;
                if (!flag)
                {
                    break label0;
                }
            }
            Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
            flag2 = flag;
            if (behavior != null)
            {
                behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
                flag2 = flag;
            }
        }
        if (mBehaviorTouchView != null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        flag1 = false | super.onTouchEvent(motionevent);
        motionevent = obj1;
_L4:
        if (!flag1)
        {
            if (i != 0);
        }
        if (motionevent != null)
        {
            motionevent.recycle();
        }
        if (i == 1 || i == 3)
        {
            resetTouchBehaviors();
        }
        return flag1;
_L2:
        motionevent = obj1;
        flag1 = flag3;
        if (flag2)
        {
            motionevent = obj;
            if (false)
            {
                long l = SystemClock.uptimeMillis();
                motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            }
            super.onTouchEvent(motionevent);
            flag1 = flag3;
        }
        if (true) goto _L4; else goto _L3
_L3:
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


}
