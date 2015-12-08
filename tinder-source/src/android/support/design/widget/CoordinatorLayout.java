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
import android.support.v4.b.a;
import android.support.v4.view.am;
import android.support.v4.view.f;
import android.support.v4.view.n;
import android.support.v4.view.q;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.x;
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
//            c, b, j

public class CoordinatorLayout extends ViewGroup
    implements q
{
    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        SparseArray a;

        public void writeToParcel(Parcel parcel, int i)
        {
            int l = 0;
            super.writeToParcel(parcel, i);
            int ai[];
            Parcelable aparcelable[];
            int k;
            if (a != null)
            {
                k = a.size();
            } else
            {
                k = 0;
            }
            parcel.writeInt(k);
            ai = new int[k];
            aparcelable = new Parcelable[k];
            for (; l < k; l++)
            {
                ai[l] = a.keyAt(l);
                aparcelable[l] = (Parcelable)a.valueAt(l);
            }

            parcel.writeIntArray(ai);
            parcel.writeParcelableArray(aparcelable, i);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            int k = parcel.readInt();
            int ai[] = new int[k];
            parcel.readIntArray(ai);
            parcel = parcel.readParcelableArray(android/support/design/widget/CoordinatorLayout.getClassLoader());
            a = new SparseArray(k);
            for (int i = 0; i < k; i++)
            {
                a.append(ai[i], parcel[i]);
            }

        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    final class a
        implements s
    {

        final CoordinatorLayout a;

        public final am onApplyWindowInsets(View view, am am1)
        {
            a.setWindowInsets(am1);
            return am1.f();
        }

        a()
        {
            a = CoordinatorLayout.this;
            super();
        }
    }

    public static abstract class b
    {

        public Parcelable a(CoordinatorLayout coordinatorlayout, View view)
        {
            return android.view.View.BaseSavedState.EMPTY_STATE;
        }

        public void a(CoordinatorLayout coordinatorlayout, View view, int i, int ai[])
        {
        }

        public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
        {
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, float f1, boolean flag)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
        {
            return false;
        }

        public boolean a(MotionEvent motionevent)
        {
            return false;
        }

        public void b()
        {
        }

        public void b(CoordinatorLayout coordinatorlayout, View view, int i)
        {
        }

        public b()
        {
        }
    }

    public static interface c
        extends Annotation
    {

        public abstract Class a();
    }

    final class d
        implements android.view.ViewGroup.OnHierarchyChangeListener
    {

        final CoordinatorLayout a;

        public final void onChildViewAdded(View view, View view1)
        {
            if (a.mOnHierarchyChangeListener != null)
            {
                a.mOnHierarchyChangeListener.onChildViewAdded(view, view1);
            }
        }

        public final void onChildViewRemoved(View view, View view1)
        {
            a.dispatchDependentViewRemoved(view1);
            if (a.mOnHierarchyChangeListener != null)
            {
                a.mOnHierarchyChangeListener.onChildViewRemoved(view, view1);
            }
        }

        d()
        {
            a = CoordinatorLayout.this;
            super();
        }
    }

    public static final class e extends android.view.ViewGroup.MarginLayoutParams
    {

        b a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        View g;
        View h;
        boolean i;
        boolean j;
        boolean k;
        final Rect l;
        Object m;

        public final void a(b b1)
        {
            if (a != b1)
            {
                a = b1;
                m = null;
                b = true;
            }
        }

        final boolean a(View view)
        {
            if (view != h)
            {
                if (a == null);
                return false;
            } else
            {
                return true;
            }
        }

        public e()
        {
            super(-2, -2);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            l = new Rect();
        }

        e(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            l = new Rect();
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.g.CoordinatorLayout_LayoutParams);
            c = typedarray.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
            f = typedarray.getResourceId(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_anchor, -1);
            d = typedarray.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
            e = typedarray.getInteger(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_keyline, -1);
            b = typedarray.hasValue(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_behavior);
            if (b)
            {
                a = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.a.g.CoordinatorLayout_LayoutParams_layout_behavior));
            }
            typedarray.recycle();
        }

        public e(e e1)
        {
            super(e1);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            l = new Rect();
        }

        public e(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            l = new Rect();
        }

        public e(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            l = new Rect();
        }
    }

    final class f
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final CoordinatorLayout a;

        public final boolean onPreDraw()
        {
            a.dispatchOnDependentViewChanged(false);
            return true;
        }

        f()
        {
            a = CoordinatorLayout.this;
            super();
        }
    }

    static final class g
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (View)obj1;
            float f1 = x.F(((View) (obj)));
            float f2 = x.F(((View) (obj1)));
            if (f1 > f2)
            {
                return -1;
            }
            return f1 >= f2 ? 0 : 1;
        }

        g()
        {
        }
    }


    static final Class CONSTRUCTOR_PARAMS[] = {
        android/content/Context, android/util/AttributeSet
    };
    static final android.support.design.widget.b INSETS_HELPER;
    static final String TAG = "CoordinatorLayout";
    static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
    static final String WIDGET_PACKAGE_NAME = android/support/design/widget/CoordinatorLayout.getPackage().getName();
    static final ThreadLocal sConstructors = new ThreadLocal();
    private View mBehaviorTouchView;
    private final List mDependencySortedChildren;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int mKeylines[];
    private am mLastInsets;
    final Comparator mLayoutDependencyComparator;
    private boolean mNeedsPreDrawListener;
    private View mNestedScrollingDirectChild;
    private final r mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private f mOnPreDrawListener;
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
        mLayoutDependencyComparator = new Comparator() {

            final CoordinatorLayout a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (View)obj;
                obj1 = (View)obj1;
                if (obj != obj1)
                {
                    if (((e)((View) (obj)).getLayoutParams()).a(((View) (obj1))))
                    {
                        return 1;
                    }
                    if (((e)((View) (obj1)).getLayoutParams()).a(((View) (obj))))
                    {
                        return -1;
                    }
                }
                return 0;
            }

            
            {
                a = CoordinatorLayout.this;
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
        mNestedScrollingParentHelper = new r(this);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.g.CoordinatorLayout, i, android.support.design.a.f.Widget_Design_CoordinatorLayout);
        i = attributeset.getResourceId(android.support.design.a.g.CoordinatorLayout_keylines, 0);
        if (i != 0)
        {
            context = context.getResources();
            mKeylines = context.getIntArray(i);
            float f1 = context.getDisplayMetrics().density;
            int k = mKeylines.length;
            for (i = ((flag) ? 1 : 0); i < k; i++)
            {
                context = mKeylines;
                context[i] = (int)((float)context[i] * f1);
            }

        }
        mStatusBarBackground = attributeset.getDrawable(android.support.design.a.g.CoordinatorLayout_statusBarBackground);
        attributeset.recycle();
        if (INSETS_HELPER != null)
        {
            INSETS_HELPER.a(this, new a());
        }
        super.setOnHierarchyChangeListener(new d());
    }

    private void dispatchChildApplyWindowInsets(am am1)
    {
        if (!am1.e()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int k;
        k = getChildCount();
        i = 0;
_L6:
        if (i >= k) goto _L1; else goto _L3
_L3:
        am am2;
        View view;
        view = getChildAt(i);
        am2 = am1;
        if (!x.x(view))
        {
            break; /* Loop/switch isn't completed */
        }
        if (((e)view.getLayoutParams()).a != null && am1.e()) goto _L1; else goto _L4
_L4:
        am2 = x.b(view, am1);
        if (am2.e()) goto _L1; else goto _L5
_L5:
        i++;
        am1 = am2;
          goto _L6
    }

    private int getKeyline(int i)
    {
        if (mKeylines == null)
        {
            Log.e("CoordinatorLayout", (new StringBuilder("No keylines defined for ")).append(this).append(" - attempted index lookup ").append(i).toString());
            return 0;
        }
        if (i < 0 || i >= mKeylines.length)
        {
            Log.e("CoordinatorLayout", (new StringBuilder("Keyline index ")).append(i).append(" out of range for ").append(this).toString());
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
        int l = getChildCount();
        int i = l - 1;
        while (i >= 0) 
        {
            int k;
            if (flag)
            {
                k = getChildDrawingOrder(l, i);
            } else
            {
                k = i;
            }
            list.add(getChildAt(k));
            i--;
        }
        if (TOP_SORTED_CHILDREN_COMPARATOR != null)
        {
            Collections.sort(list, TOP_SORTED_CHILDREN_COMPARATOR);
        }
    }

    private void layoutChild(View view, int i)
    {
        e e1 = (e)view.getLayoutParams();
        Rect rect = mTempRect1;
        rect.set(getPaddingLeft() + e1.leftMargin, getPaddingTop() + e1.topMargin, getWidth() - getPaddingRight() - e1.rightMargin, getHeight() - getPaddingBottom() - e1.bottomMargin);
        if (mLastInsets != null && x.x(this) && !x.x(view))
        {
            rect.left = rect.left + mLastInsets.a();
            rect.top = rect.top + mLastInsets.b();
            rect.right = rect.right - mLastInsets.c();
            rect.bottom = rect.bottom - mLastInsets.d();
        }
        Rect rect1 = mTempRect2;
        android.support.v4.view.f.a(resolveGravity(e1.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i);
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

    private void layoutChildWithKeyline(View view, int i, int k)
    {
        e e1;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        e1 = (e)view.getLayoutParams();
        i2 = android.support.v4.view.f.a(resolveKeylineGravity(e1.c), k);
        l1 = getWidth();
        k1 = getHeight();
        i1 = view.getMeasuredWidth();
        j1 = view.getMeasuredHeight();
        int l = i;
        if (k == 1)
        {
            l = l1 - i;
        }
        i = getKeyline(l) - i1;
        k = 0;
        i2 & 7;
        JVM INSTR lookupswitch 2: default 104
    //                   1: 227
    //                   5: 219;
           goto _L1 _L2 _L3
_L1:
        i2 & 0x70;
        JVM INSTR lookupswitch 2: default 136
    //                   16: 245
    //                   80: 237;
           goto _L4 _L5 _L6
_L4:
        i = Math.max(getPaddingLeft() + e1.leftMargin, Math.min(i, l1 - getPaddingRight() - i1 - e1.rightMargin));
        k = Math.max(getPaddingTop() + e1.topMargin, Math.min(k, k1 - getPaddingBottom() - j1 - e1.bottomMargin));
        view.layout(i, k, i + i1, k + j1);
        return;
_L3:
        i += i1;
          goto _L1
_L2:
        i += i1 / 2;
          goto _L1
_L6:
        k = j1 + 0;
          goto _L4
_L5:
        k = j1 / 2 + 0;
          goto _L4
    }

    static b parseBehavior(Context context, AttributeSet attributeset, String s)
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
        context = (b)constructor.newInstance(new Object[] {
            context, attributeset
        });
        return context;
    }

    private boolean performIntercept(MotionEvent motionevent)
    {
        List list;
        boolean flag;
        int i;
        int k;
        int l;
        boolean flag1;
        k = n.a(motionevent);
        list = mTempList1;
        getTopSortedChildren(list);
        l = list.size();
        i = 0;
        flag = false;
        flag1 = false;
_L2:
        View view;
        e e1;
        b b1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        view = (View)list.get(i);
        e1 = (e)view.getLayoutParams();
        b1 = e1.a;
        if (!flag1 && !flag || k == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b1 != null)
        {
            b1.a(this, view, null);
        }
_L4:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag2;
        if (!flag1 && b1 != null)
        {
            flag1 = b1.a(this, view, motionevent);
            if (flag1)
            {
                mBehaviorTouchView = view;
            }
        }
        if (e1.a == null)
        {
            e1.i = false;
        }
        boolean flag3 = e1.i;
        if (e1.i)
        {
            flag2 = true;
        } else
        {
            flag2 = e1.i | false;
            e1.i = flag2;
        }
        if (flag2 && !flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag2) goto _L4; else goto _L3
_L3:
        flag2 = flag1;
        if (!flag) goto _L5; else goto _L4
_L5:
        break MISSING_BLOCK_LABEL_227;
        flag2 = flag1;
        list.clear();
        return flag2;
    }

    private void prepareChildren()
    {
        View view1;
        e e1;
        boolean flag1;
        boolean flag2;
        int l;
        flag2 = false;
        l = getChildCount();
        int k;
        if (mDependencySortedChildren.size() != l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = 0;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        view1 = getChildAt(k);
        e1 = getResolvedLayoutParams(view1);
        if (e1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        e1.h = null;
        e1.g = null;
_L11:
        k++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_29;
_L1:
        if (e1.g == null) goto _L4; else goto _L3
_L3:
        if (e1.g.getId() == e1.f) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L8:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L6:
        view = e1.g;
        viewparent = e1.g.getParent();
_L9:
        if (viewparent != this)
        {
label0:
            {
                if (viewparent != null && viewparent != view1)
                {
                    break label0;
                }
                e1.h = null;
                e1.g = null;
                flag = false;
            }
        } else
        {
            e1.h = view;
            flag = true;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (viewparent instanceof View)
        {
            view = (View)viewparent;
        }
        viewparent = viewparent.getParent();
          goto _L9
_L4:
        e1.g = findViewById(e1.f);
        if (e1.g == null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        View view = e1.g;
        for (ViewParent viewparent = e1.g.getParent(); viewparent != this && viewparent != null; viewparent = viewparent.getParent())
        {
            if (viewparent == view1)
            {
                if (isInEditMode())
                {
                    e1.h = null;
                    e1.g = null;
                } else
                {
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                }
                continue; /* Loop/switch isn't completed */
            }
            if (viewparent instanceof View)
            {
                view = (View)viewparent;
            }
        }

        e1.h = view;
        continue; /* Loop/switch isn't completed */
        if (isInEditMode())
        {
            e1.h = null;
            e1.g = null;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Could not find CoordinatorLayout descendant view with id ")).append(getResources().getResourceName(e1.f)).append(" to anchor view ").append(view1).toString());
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (flag1)
        {
            mDependencySortedChildren.clear();
            for (int i = ((flag2) ? 1 : 0); i < l; i++)
            {
                mDependencySortedChildren.add(getChildAt(i));
            }

            Collections.sort(mDependencySortedChildren, mLayoutDependencyComparator);
        }
        return;
    }

    private void resetTouchBehaviors()
    {
        if (mBehaviorTouchView != null)
        {
            b b1 = ((e)mBehaviorTouchView.getLayoutParams()).a;
            if (b1 != null)
            {
                long l = SystemClock.uptimeMillis();
                MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
                b1.a(motionevent);
                motionevent.recycle();
            }
            mBehaviorTouchView = null;
        }
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            ((e)getChildAt(i).getLayoutParams()).i = false;
        }

    }

    private static int resolveAnchoredChildGravity(int i)
    {
        int k = i;
        if (i == 0)
        {
            k = 17;
        }
        return k;
    }

    private static int resolveGravity(int i)
    {
        int k = i;
        if (i == 0)
        {
            k = 0x800033;
        }
        return k;
    }

    private static int resolveKeylineGravity(int i)
    {
        int k = i;
        if (i == 0)
        {
            k = 0x800035;
        }
        return k;
    }

    private void setWindowInsets(am am1)
    {
        boolean flag1 = true;
        if (mLastInsets != am1)
        {
            mLastInsets = am1;
            boolean flag;
            if (am1 != null && am1.b() > 0)
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
            dispatchChildApplyWindowInsets(am1);
            requestLayout();
        }
    }

    void addPreDrawListener()
    {
        if (mIsAttachedToWindow)
        {
            if (mOnPreDrawListener == null)
            {
                mOnPreDrawListener = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
        }
        mNeedsPreDrawListener = true;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof e) && super.checkLayoutParams(layoutparams);
    }

    void dispatchDependentViewRemoved(View view)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            getChildAt(i).getLayoutParams();
        }

    }

    public void dispatchDependentViewsChanged(View view)
    {
        int k = mDependencySortedChildren.size();
        int i = 0;
        boolean flag = false;
        while (i < k) 
        {
            View view1 = (View)mDependencySortedChildren.get(i);
            if (view1 == view)
            {
                flag = true;
            } else
            if (flag)
            {
                view1.getLayoutParams();
            }
            i++;
        }
    }

    void dispatchOnDependentViewChanged(boolean flag)
    {
        int i1 = x.h(this);
        int j1 = mDependencySortedChildren.size();
        for (int i = 0; i < j1; i++)
        {
            View view = (View)mDependencySortedChildren.get(i);
            Object obj = (e)view.getLayoutParams();
            for (int k = 0; k < i; k++)
            {
                View view1 = (View)mDependencySortedChildren.get(k);
                if (((e) (obj)).h == view1)
                {
                    offsetChildToAnchor(view, i1);
                }
            }

            obj = mTempRect1;
            Rect rect = mTempRect2;
            getLastChildRect(view, ((Rect) (obj)));
            getChildRect(view, true, rect);
            if (((Rect) (obj)).equals(rect))
            {
                continue;
            }
            recordLastChildRect(view, rect);
            for (int l = i + 1; l < j1; l++)
            {
                ((View)mDependencySortedChildren.get(l)).getLayoutParams();
            }

        }

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
        view.getLayoutParams();
        return super.drawChild(canvas, view, l);
    }

    void ensurePreDrawListener()
    {
        boolean flag1 = false;
        int k = getChildCount();
        int i = 0;
label0:
        do
        {
label1:
            {
                boolean flag = flag1;
                if (i < k)
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

    protected e generateDefaultLayoutParams()
    {
        return new e();
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public e generateLayoutParams(AttributeSet attributeset)
    {
        return new e(getContext(), attributeset);
    }

    protected e generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof e)
        {
            return new e((e)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new e((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new e(layoutparams);
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
        e e1 = (e)view.getLayoutParams();
        List list = mTempDependenciesList;
        list.clear();
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view1 = getChildAt(i);
            if (view1 != view && e1.a(view1))
            {
                list.add(view1);
            }
        }

        return list;
    }

    void getDescendantRect(View view, Rect rect)
    {
        android.support.design.widget.j.a(this, view, rect);
    }

    void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect1)
    {
        e e1;
        int k;
        int i1;
        int j1;
        int k1;
        e1 = (e)view.getLayoutParams();
        k1 = android.support.v4.view.f.a(resolveAnchoredChildGravity(e1.c), i);
        k = android.support.v4.view.f.a(resolveGravity(e1.d), i);
        i1 = view.getMeasuredWidth();
        j1 = view.getMeasuredHeight();
        k & 7;
        JVM INSTR lookupswitch 2: default 80
    //                   1: 310
    //                   5: 302;
           goto _L1 _L2 _L3
_L1:
        i = rect.left;
_L13:
        k & 0x70;
        JVM INSTR lookupswitch 2: default 116
    //                   16: 336
    //                   80: 327;
           goto _L4 _L5 _L6
_L4:
        k = rect.top;
_L14:
        int l = i;
        k1 & 7;
        JVM INSTR lookupswitch 2: default 156
    //                   1: 352
    //                   5: 162;
           goto _L7 _L8 _L9
_L9:
        break; /* Loop/switch isn't completed */
_L7:
        l = i - i1;
_L15:
        i = k;
        k1 & 0x70;
        JVM INSTR lookupswitch 2: default 196
    //                   16: 363
    //                   80: 202;
           goto _L10 _L11 _L12
_L12:
        break; /* Loop/switch isn't completed */
_L10:
        i = k - j1;
_L16:
        int l1 = getWidth();
        k = getHeight();
        l = Math.max(getPaddingLeft() + e1.leftMargin, Math.min(l, l1 - getPaddingRight() - i1 - e1.rightMargin));
        i = Math.max(getPaddingTop() + e1.topMargin, Math.min(i, k - getPaddingBottom() - j1 - e1.bottomMargin));
        rect1.set(l, i, l + i1, i + j1);
        return;
_L3:
        i = rect.right;
          goto _L13
_L2:
        i = rect.left;
        i = rect.width() / 2 + i;
          goto _L13
_L6:
        k = rect.bottom;
          goto _L14
_L5:
        k = rect.top + rect.height() / 2;
          goto _L14
_L8:
        l = i - i1 / 2;
          goto _L15
_L11:
        i = k - j1 / 2;
          goto _L16
    }

    void getLastChildRect(View view, Rect rect)
    {
        rect.set(((e)view.getLayoutParams()).l);
    }

    public int getNestedScrollAxes()
    {
        return mNestedScrollingParentHelper.a;
    }

    e getResolvedLayoutParams(View view)
    {
        e e1 = (e)view.getLayoutParams();
        if (!e1.b)
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
                view = (c)class1.getAnnotation(android/support/design/widget/CoordinatorLayout$c);
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
                    e1.a((b)view1.a().newInstance());
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Log.e("CoordinatorLayout", (new StringBuilder("Default behavior class ")).append(view1.a().getName()).append(" could not be instantiated. Did you forget a default constructor?").toString(), view);
                }
            }
            e1.b = true;
        }
        return e1;
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
        e e1 = (e)view.getLayoutParams();
        if (e1.g != null)
        {
            return true;
        }
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view1 = getChildAt(i);
            if (view1 != view && e1.a(view1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isPointInChildBounds(View view, int i, int k)
    {
        Rect rect = mTempRect1;
        getDescendantRect(view, rect);
        return rect.contains(i, k);
    }

    void offsetChildToAnchor(View view, int i)
    {
        e e1 = (e)view.getLayoutParams();
        if (e1.g != null)
        {
            Rect rect = mTempRect1;
            Rect rect1 = mTempRect2;
            Rect rect2 = mTempRect3;
            getDescendantRect(e1.g, rect);
            getChildRect(view, false, rect1);
            getDesiredAnchoredChildRect(view, i, rect, rect2);
            i = rect2.left - rect1.left;
            int k = rect2.top - rect1.top;
            if (i != 0)
            {
                view.offsetLeftAndRight(i);
            }
            if (k != 0)
            {
                view.offsetTopAndBottom(k);
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
                mOnPreDrawListener = new f();
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
                i = mLastInsets.b();
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
        int i = n.a(motionevent);
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

    protected void onLayout(boolean flag, int i, int k, int l, int i1)
    {
        k = x.h(this);
        l = mDependencySortedChildren.size();
        for (i = 0; i < l; i++)
        {
            View view = (View)mDependencySortedChildren.get(i);
            b b1 = ((e)view.getLayoutParams()).a;
            if (b1 == null || !b1.a(this, view, k))
            {
                onLayoutChild(view, k);
            }
        }

    }

    public void onLayoutChild(View view, int i)
    {
        e e1 = (e)view.getLayoutParams();
        boolean flag;
        if (e1.g == null && e1.f != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (e1.g != null)
        {
            layoutChildWithAnchor(view, e1.g, i);
            return;
        }
        if (e1.e >= 0)
        {
            layoutChildWithKeyline(view, e1.e, i);
            return;
        } else
        {
            layoutChild(view, i);
            return;
        }
    }

    protected void onMeasure(int i, int k)
    {
        int l;
        boolean flag;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int i5;
        prepareChildren();
        ensurePreDrawListener();
        k2 = getPaddingLeft();
        int l2 = getPaddingTop();
        int i3 = getPaddingRight();
        int j3 = getPaddingBottom();
        int k3 = x.h(this);
        View view;
        e e1;
        boolean flag1;
        int i1;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        int j5;
        if (k3 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l3 = android.view.View.MeasureSpec.getMode(i);
        i4 = android.view.View.MeasureSpec.getSize(i);
        j4 = android.view.View.MeasureSpec.getMode(k);
        k4 = android.view.View.MeasureSpec.getSize(k);
        l1 = getSuggestedMinimumWidth();
        k1 = getSuggestedMinimumHeight();
        if (mLastInsets != null && x.x(this))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l4 = mDependencySortedChildren.size();
        i1 = 0;
        j1 = 0;
_L6:
        if (i1 >= l4)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        view = (View)mDependencySortedChildren.get(i1);
        e1 = (e)view.getLayoutParams();
        i2 = 0;
        l = i2;
        if (e1.e < 0) goto _L2; else goto _L1
_L1:
        l = i2;
        if (l3 == 0) goto _L2; else goto _L3
_L3:
        j2 = getKeyline(e1.e);
        i5 = android.support.v4.view.f.a(resolveKeylineGravity(e1.c), k3) & 7;
        if ((i5 != 3 || flag) && (i5 != 5 || !flag)) goto _L5; else goto _L4
_L4:
        l = Math.max(0, i4 - i3 - j2);
_L2:
        if (flag1 && !x.x(view))
        {
            i2 = mLastInsets.a();
            j5 = mLastInsets.c();
            j2 = mLastInsets.b();
            i5 = mLastInsets.d();
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(i4 - (i2 + j5), l3);
            j2 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - (i5 + j2), j4);
        } else
        {
            j2 = k;
            i2 = i;
        }
        onMeasureChild(view, i2, l, j2, 0);
        l1 = Math.max(l1, view.getMeasuredWidth() + (k2 + i3) + e1.leftMargin + e1.rightMargin);
        k1 = Math.max(k1, view.getMeasuredHeight() + (l2 + j3) + e1.topMargin + e1.bottomMargin);
        j1 = x.a(j1, x.l(view));
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        if (i5 == 5 && !flag) goto _L8; else goto _L7
_L7:
        l = i2;
        if (i5 != 3) goto _L2; else goto _L9
_L9:
        l = i2;
        if (!flag) goto _L2; else goto _L8
_L8:
        l = Math.max(0, j2 - k2);
          goto _L2
        setMeasuredDimension(x.a(l1, i, 0xff000000 & j1), x.a(k1, k, j1 << 16));
        return;
    }

    public void onMeasureChild(View view, int i, int k, int l, int i1)
    {
        measureChildWithMargins(view, i, k, l, i1);
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        int k = getChildCount();
        int i = 0;
        boolean flag1 = false;
        for (; i < k; i++)
        {
            view = getChildAt(i);
            Object obj = (e)view.getLayoutParams();
            if (!((e) (obj)).j)
            {
                continue;
            }
            obj = ((e) (obj)).a;
            if (obj != null)
            {
                flag1 = ((b) (obj)).a(this, view, f2, flag) | flag1;
            }
        }

        if (flag1)
        {
            dispatchOnDependentViewChanged(true);
        }
        return flag1;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            getChildAt(i).getLayoutParams();
        }

        return false;
    }

    public void onNestedPreScroll(View view, int i, int k, int ai[])
    {
        int l;
        int i1;
        int j1;
        int k1;
        int k2;
        k2 = getChildCount();
        k1 = 0;
        j1 = 0;
        l = 0;
        i1 = 0;
_L2:
        if (k1 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(k1);
        Object obj = (e)view.getLayoutParams();
        if (!((e) (obj)).j)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj = ((e) (obj)).a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        int ai1[] = mTempIntPair;
        mTempIntPair[1] = 0;
        ai1[0] = 0;
        ((b) (obj)).a(this, view, k, mTempIntPair);
        int l1;
        if (i > 0)
        {
            i1 = Math.max(i1, mTempIntPair[0]);
        } else
        {
            i1 = Math.min(i1, mTempIntPair[0]);
        }
        if (k > 0)
        {
            l = Math.max(l, mTempIntPair[1]);
        } else
        {
            l = Math.min(l, mTempIntPair[1]);
        }
        l1 = 1;
        j1 = i1;
        i1 = l;
        l = l1;
_L3:
        l1 = k1 + 1;
        k1 = j1;
        j1 = l;
        l = i1;
        i1 = k1;
        k1 = l1;
        if (true) goto _L2; else goto _L1
_L1:
        ai[0] = i1;
        ai[1] = l;
        if (j1 != 0)
        {
            dispatchOnDependentViewChanged(true);
        }
        return;
        int i2 = l;
        int j2 = i1;
        l = j1;
        i1 = i2;
        j1 = j2;
          goto _L3
    }

    public void onNestedScroll(View view, int i, int k, int l, int i1)
    {
        l = getChildCount();
        k = 0;
        i = 0;
        for (; k < l; k++)
        {
            view = getChildAt(k);
            Object obj = (e)view.getLayoutParams();
            if (!((e) (obj)).j)
            {
                continue;
            }
            obj = ((e) (obj)).a;
            if (obj != null)
            {
                ((b) (obj)).b(this, view, i1);
                i = 1;
            }
        }

        if (i != 0)
        {
            dispatchOnDependentViewChanged(true);
        }
    }

    public void onNestedScrollAccepted(View view, View view1, int i)
    {
        mNestedScrollingParentHelper.a = i;
        mNestedScrollingDirectChild = view;
        mNestedScrollingTarget = view1;
        int k = getChildCount();
        for (i = 0; i < k; i++)
        {
            getChildAt(i).getLayoutParams();
        }

    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        parcelable = ((SavedState) (parcelable)).a;
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            int l = view.getId();
            b b1 = getResolvedLayoutParams(view).a;
            if (l == -1 || b1 == null)
            {
                continue;
            }
            Parcelable parcelable1 = (Parcelable)parcelable.get(l);
            if (parcelable1 != null)
            {
                b1.a(this, view, parcelable1);
            }
        }

    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        SparseArray sparsearray = new SparseArray();
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            Object obj = getChildAt(i);
            int l = ((View) (obj)).getId();
            b b1 = ((e)((View) (obj)).getLayoutParams()).a;
            if (l == -1 || b1 == null)
            {
                continue;
            }
            obj = b1.a(this, ((View) (obj)));
            if (obj != null)
            {
                sparsearray.append(l, obj);
            }
        }

        savedstate.a = sparsearray;
        return savedstate;
    }

    public boolean onStartNestedScroll(View view, View view1, int i)
    {
        int l = getChildCount();
        int k = 0;
        boolean flag = false;
        while (k < l) 
        {
            view = getChildAt(k);
            e e1 = (e)view.getLayoutParams();
            b b1 = e1.a;
            if (b1 != null)
            {
                boolean flag1 = b1.a(this, view, view1, i);
                e1.j = flag1;
                flag |= flag1;
            } else
            {
                e1.j = false;
            }
            k++;
        }
        return flag;
    }

    public void onStopNestedScroll(View view)
    {
        mNestedScrollingParentHelper.a = 0;
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            view = (e)getChildAt(i).getLayoutParams();
            if (!((e) (view)).j)
            {
                continue;
            }
            b b1 = ((e) (view)).a;
            if (b1 != null)
            {
                b1.b();
            }
            view.j = false;
            view.k = false;
        }

        mNestedScrollingDirectChild = null;
        mNestedScrollingTarget = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag2;
        flag2 = false;
        i = n.a(motionevent);
        if (mBehaviorTouchView != null) goto _L2; else goto _L1
_L1:
        boolean flag = performIntercept(motionevent);
        if (!flag) goto _L4; else goto _L3
_L3:
        boolean flag1;
        b b1 = ((e)mBehaviorTouchView.getLayoutParams()).a;
        flag1 = flag;
        if (b1 != null)
        {
            b1.a(motionevent);
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
        ((e)view.getLayoutParams()).l.set(rect);
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
            drawable = android.support.v4.b.a.a(getContext(), i);
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
            TOP_SORTED_CHILDREN_COMPARATOR = new g();
            INSETS_HELPER = new android.support.design.widget.c();
        } else
        {
            TOP_SORTED_CHILDREN_COMPARATOR = null;
            INSETS_HELPER = null;
        }
    }


}
