// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.content.a;
import android.support.v4.view.am;
import android.support.v4.view.e;
import android.support.v4.view.m;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.r;
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
//            f, e, s

public class CoordinatorLayout extends ViewGroup
    implements p
{
    public static interface DefaultBehavior
        extends Annotation
    {

        public abstract Class value();
    }

    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        SparseArray a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            int ai[];
            Parcelable aparcelable[];
            int j1;
            if (a != null)
            {
                j1 = a.size();
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            ai = new int[j1];
            aparcelable = new Parcelable[j1];
            for (int k1 = 0; k1 < j1; k1++)
            {
                ai[k1] = a.keyAt(k1);
                aparcelable[k1] = (Parcelable)a.valueAt(k1);
            }

            parcel.writeIntArray(ai);
            parcel.writeParcelableArray(aparcelable, i1);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            int j1 = parcel.readInt();
            int ai[] = new int[j1];
            parcel.readIntArray(ai);
            parcel = parcel.readParcelableArray(android/support/design/widget/CoordinatorLayout.getClassLoader());
            a = new SparseArray(j1);
            for (int i1 = 0; i1 < j1; i1++)
            {
                a.append(ai[i1], parcel[i1]);
            }

        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    final class a
        implements r
    {

        final CoordinatorLayout a;

        public final am a(View view, am am1)
        {
            android.support.design.widget.CoordinatorLayout.a(a, am1);
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

        public void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
        {
        }

        public void a(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
        }

        public void a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1, int j1, int ai[])
        {
        }

        public void a(View view, View view1)
        {
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, float f1, boolean flag)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, int i1, int j1, int k1)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, int i1)
        {
            return false;
        }

        public boolean a(View view)
        {
            return false;
        }

        public void b(CoordinatorLayout coordinatorlayout, View view, int i1)
        {
        }

        public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
        {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return false;
        }

        public b()
        {
        }

        public b(Context context, AttributeSet attributeset)
        {
        }
    }

    final class c
        implements android.view.ViewGroup.OnHierarchyChangeListener
    {

        final CoordinatorLayout a;

        public final void onChildViewAdded(View view, View view1)
        {
            if (android.support.design.widget.CoordinatorLayout.a(a) != null)
            {
                android.support.design.widget.CoordinatorLayout.a(a).onChildViewAdded(view, view1);
            }
        }

        public final void onChildViewRemoved(View view, View view1)
        {
            CoordinatorLayout coordinatorlayout = a;
            int j1 = coordinatorlayout.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view2 = coordinatorlayout.getChildAt(i1);
                b b1 = ((d)view2.getLayoutParams()).a;
                if (b1 != null && b1.a(view1))
                {
                    b1.a(view2, view1);
                }
            }

            if (android.support.design.widget.CoordinatorLayout.a(a) != null)
            {
                android.support.design.widget.CoordinatorLayout.a(a).onChildViewRemoved(view, view1);
            }
        }

        c()
        {
            a = CoordinatorLayout.this;
            super();
        }
    }

    public static final class d extends android.view.ViewGroup.MarginLayoutParams
    {

        b a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        View g;
        View h;
        final Rect i;
        Object j;
        private boolean k;
        private boolean l;
        private boolean m;

        public final void a()
        {
            h = null;
            g = null;
            f = 0x7f1002ce;
        }

        public final void a(b b1)
        {
            if (a != b1)
            {
                a = b1;
                j = null;
                b = true;
            }
        }

        final void a(boolean flag)
        {
            l = flag;
        }

        final boolean a(View view)
        {
            return view == h || a != null && a.a(view);
        }

        final boolean b()
        {
            if (a == null)
            {
                k = false;
            }
            return k;
        }

        final boolean c()
        {
            if (k)
            {
                return true;
            } else
            {
                boolean flag = k | false;
                k = flag;
                return flag;
            }
        }

        final void d()
        {
            k = false;
        }

        final void e()
        {
            l = false;
        }

        final boolean f()
        {
            return l;
        }

        final boolean g()
        {
            return m;
        }

        final void h()
        {
            m = false;
        }

        final void i()
        {
            m = false;
        }

        public d()
        {
            super(-2, -2);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            i = new Rect();
        }

        d(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            i = new Rect();
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.a.i.CoordinatorLayout_LayoutParams);
            c = typedarray.getInteger(android.support.design.a.i.CoordinatorLayout_LayoutParams_android_layout_gravity, 0);
            f = typedarray.getResourceId(android.support.design.a.i.CoordinatorLayout_LayoutParams_layout_anchor, -1);
            d = typedarray.getInteger(android.support.design.a.i.CoordinatorLayout_LayoutParams_layout_anchorGravity, 0);
            e = typedarray.getInteger(android.support.design.a.i.CoordinatorLayout_LayoutParams_layout_keyline, -1);
            b = typedarray.hasValue(android.support.design.a.i.CoordinatorLayout_LayoutParams_layout_behavior);
            if (b)
            {
                a = android.support.design.widget.CoordinatorLayout.a(context, attributeset, typedarray.getString(android.support.design.a.i.CoordinatorLayout_LayoutParams_layout_behavior));
            }
            typedarray.recycle();
        }

        public d(d d1)
        {
            super(d1);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            i = new Rect();
        }

        public d(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            i = new Rect();
        }

        public d(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = false;
            c = 0;
            d = 0;
            e = -1;
            f = -1;
            i = new Rect();
        }
    }

    final class e
        implements android.view.ViewTreeObserver.OnPreDrawListener
    {

        final CoordinatorLayout a;

        public final boolean onPreDraw()
        {
            a.a(false);
            return true;
        }

        e()
        {
            a = CoordinatorLayout.this;
            super();
        }
    }

    static final class f
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (View)obj;
            obj1 = (View)obj1;
            float f1 = android.support.v4.view.x.F(((View) (obj)));
            float f2 = android.support.v4.view.x.F(((View) (obj1)));
            if (f1 > f2)
            {
                return -1;
            }
            return f1 >= f2 ? 0 : 1;
        }

        f()
        {
        }
    }


    static final String a = android/support/design/widget/CoordinatorLayout.getPackage().getName();
    static final Class b[] = {
        android/content/Context, android/util/AttributeSet
    };
    static final ThreadLocal c = new ThreadLocal();
    static final Comparator e;
    static final android.support.design.widget.e f;
    final Comparator d;
    private final List g;
    private final List h;
    private final List i;
    private final Rect j;
    private final Rect k;
    private final Rect l;
    private final int m[];
    private boolean n;
    private int o[];
    private View p;
    private View q;
    private View r;
    private e s;
    private boolean t;
    private am u;
    private boolean v;
    private Drawable w;
    private android.view.ViewGroup.OnHierarchyChangeListener x;
    private final q y;

    public CoordinatorLayout(Context context)
    {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new Comparator() {

            final CoordinatorLayout a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (View)obj;
                obj1 = (View)obj1;
                if (obj != obj1)
                {
                    if (((d)((View) (obj)).getLayoutParams()).a(((View) (obj1))))
                    {
                        return 1;
                    }
                    if (((d)((View) (obj1)).getLayoutParams()).a(((View) (obj))))
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
        g = new ArrayList();
        h = new ArrayList();
        i = new ArrayList();
        j = new Rect();
        k = new Rect();
        l = new Rect();
        m = new int[2];
        y = new q(this);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.a.i.CoordinatorLayout, i1, android.support.design.a.h.Widget_Design_CoordinatorLayout);
        i1 = attributeset.getResourceId(android.support.design.a.i.CoordinatorLayout_keylines, 0);
        if (i1 != 0)
        {
            context = context.getResources();
            o = context.getIntArray(i1);
            float f1 = context.getDisplayMetrics().density;
            int j1 = o.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                context = o;
                context[i1] = (int)((float)context[i1] * f1);
            }

        }
        w = attributeset.getDrawable(android.support.design.a.i.CoordinatorLayout_statusBarBackground);
        attributeset.recycle();
        if (f != null)
        {
            f.a(this, new a());
        }
        super.setOnHierarchyChangeListener(new c());
    }

    private int a(int i1)
    {
        if (o == null)
        {
            Log.e("CoordinatorLayout", (new StringBuilder("No keylines defined for ")).append(this).append(" - attempted index lookup ").append(i1).toString());
            return 0;
        }
        if (i1 < 0 || i1 >= o.length)
        {
            Log.e("CoordinatorLayout", (new StringBuilder("Keyline index ")).append(i1).append(" out of range for ").append(this).toString());
            return 0;
        } else
        {
            return o[i1];
        }
    }

    static b a(Context context, AttributeSet attributeset, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        Object obj;
        Object obj1;
        Constructor constructor;
        if (s1.startsWith("."))
        {
            s1 = (new StringBuilder()).append(context.getPackageName()).append(s1).toString();
        } else
        if (s1.indexOf('.') < 0)
        {
            s1 = (new StringBuilder()).append(a).append('.').append(s1).toString();
        }
        try
        {
            obj1 = (Map)c.get();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Could not inflate Behavior subclass ")).append(s1).toString(), context);
        }
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        obj = new HashMap();
        c.set(obj);
        constructor = (Constructor)((Map) (obj)).get(s1);
        obj1 = constructor;
        if (constructor != null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj1 = Class.forName(s1, true, context.getClassLoader()).getConstructor(b);
        ((Constructor) (obj1)).setAccessible(true);
        ((Map) (obj)).put(s1, obj1);
        context = (b)((Constructor) (obj1)).newInstance(new Object[] {
            context, attributeset
        });
        return context;
    }

    static android.view.ViewGroup.OnHierarchyChangeListener a(CoordinatorLayout coordinatorlayout)
    {
        return coordinatorlayout.x;
    }

    private void a()
    {
        if (p != null)
        {
            b b1 = ((d)p.getLayoutParams()).a;
            if (b1 != null)
            {
                long l1 = SystemClock.uptimeMillis();
                MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
                b1.a(this, p, motionevent);
                motionevent.recycle();
            }
            p = null;
        }
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            ((d)getChildAt(i1).getLayoutParams()).d();
        }

    }

    static void a(CoordinatorLayout coordinatorlayout, am am1)
    {
        boolean flag1 = true;
        int i1 = 0;
        if (coordinatorlayout.u != am1)
        {
            coordinatorlayout.u = am1;
            boolean flag;
            if (am1 != null && am1.b() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            coordinatorlayout.v = flag;
            if (!coordinatorlayout.v && coordinatorlayout.getBackground() == null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            coordinatorlayout.setWillNotDraw(flag);
            if (!am1.e())
            {
                for (int j1 = coordinatorlayout.getChildCount(); i1 < j1;)
                {
                    View view = coordinatorlayout.getChildAt(i1);
                    am am2 = am1;
                    if (android.support.v4.view.x.x(view))
                    {
                        if (((d)view.getLayoutParams()).a != null && am1.e())
                        {
                            break;
                        }
                        am2 = android.support.v4.view.x.b(view, am1);
                        if (am2.e())
                        {
                            break;
                        }
                    }
                    i1++;
                    am1 = am2;
                }

            }
            coordinatorlayout.requestLayout();
        }
    }

    private void a(View view, int i1, Rect rect, Rect rect1)
    {
        d d1;
        int j1;
        int i2;
        int j2;
        int k2;
        d1 = (d)view.getLayoutParams();
        int k1 = d1.c;
        j1 = k1;
        if (k1 == 0)
        {
            j1 = 17;
        }
        k2 = android.support.v4.view.e.a(j1, i1);
        j1 = android.support.v4.view.e.a(b(d1.d), i1);
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        j1 & 7;
        JVM INSTR lookupswitch 2: default 96
    //                   1: 326
    //                   5: 318;
           goto _L1 _L2 _L3
_L1:
        i1 = rect.left;
_L13:
        j1 & 0x70;
        JVM INSTR lookupswitch 2: default 132
    //                   16: 350
    //                   80: 341;
           goto _L4 _L5 _L6
_L4:
        j1 = rect.top;
_L14:
        int l1 = i1;
        k2 & 7;
        JVM INSTR lookupswitch 2: default 172
    //                   1: 366
    //                   5: 178;
           goto _L7 _L8 _L9
_L9:
        break; /* Loop/switch isn't completed */
_L7:
        l1 = i1 - i2;
_L15:
        i1 = j1;
        k2 & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 377
    //                   80: 218;
           goto _L10 _L11 _L12
_L12:
        break; /* Loop/switch isn't completed */
_L10:
        i1 = j1 - j2;
_L16:
        int l2 = getWidth();
        j1 = getHeight();
        l1 = Math.max(getPaddingLeft() + d1.leftMargin, Math.min(l1, l2 - getPaddingRight() - i2 - d1.rightMargin));
        i1 = Math.max(getPaddingTop() + d1.topMargin, Math.min(i1, j1 - getPaddingBottom() - j2 - d1.bottomMargin));
        rect1.set(l1, i1, l1 + i2, i1 + j2);
        return;
_L3:
        i1 = rect.right;
          goto _L13
_L2:
        i1 = rect.left + rect.width() / 2;
          goto _L13
_L6:
        j1 = rect.bottom;
          goto _L14
_L5:
        j1 = rect.top + rect.height() / 2;
          goto _L14
_L8:
        l1 = i1 - i2 / 2;
          goto _L15
_L11:
        i1 = j1 - j2 / 2;
          goto _L16
    }

    private void a(View view, boolean flag, Rect rect)
    {
        if (view.isLayoutRequested() || view.getVisibility() == 8)
        {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (flag)
        {
            android.support.design.widget.s.a(this, view, rect);
            return;
        } else
        {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            return;
        }
    }

    private boolean a(MotionEvent motionevent, int i1)
    {
        List list;
        int j1;
        int l1;
        int i2;
        int j2;
        boolean flag3;
        flag3 = false;
        boolean flag1 = false;
        i2 = android.support.v4.view.m.a(motionevent);
        list = h;
        list.clear();
        boolean flag4 = isChildrenDrawingOrderEnabled();
        j2 = getChildCount();
        j1 = j2 - 1;
        while (j1 >= 0) 
        {
            int k1;
            if (flag4)
            {
                k1 = getChildDrawingOrder(j2, j1);
            } else
            {
                k1 = j1;
            }
            list.add(getChildAt(k1));
            j1--;
        }
        if (e != null)
        {
            Collections.sort(list, e);
        }
        j2 = list.size();
        l1 = 0;
        j1 = ((flag1) ? 1 : 0);
_L10:
        boolean flag5 = flag3;
        if (l1 >= j2) goto _L2; else goto _L1
_L1:
        View view;
        d d1;
        b b1;
        view = (View)list.get(l1);
        d1 = (d)view.getLayoutParams();
        b1 = d1.a;
        if (!flag3 && !j1 || i2 == 0) goto _L4; else goto _L3
_L3:
        boolean flag2;
        boolean flag6;
        flag6 = flag3;
        flag2 = j1;
        if (b1 == null) goto _L6; else goto _L5
_L5:
        i1;
        JVM INSTR tableswitch 0 1: default 212
    //                   0 237
    //                   1 258;
           goto _L7 _L8 _L9
_L7:
        flag2 = j1;
        flag6 = flag3;
_L6:
        l1++;
        flag3 = flag6;
        j1 = ((flag2) ? 1 : 0);
          goto _L10
_L8:
        b1.b(this, view, null);
        flag6 = flag3;
        flag2 = j1;
          goto _L6
_L9:
        b1.a(this, view, null);
        flag6 = flag3;
        flag2 = j1;
          goto _L6
_L4:
        flag5 = flag3;
        if (flag3) goto _L12; else goto _L11
_L11:
        flag5 = flag3;
        if (b1 == null) goto _L12; else goto _L13
_L13:
        i1;
        JVM INSTR tableswitch 0 1: default 320
    //                   0 401
    //                   1 415;
           goto _L14 _L15 _L16
_L14:
        break; /* Loop/switch isn't completed */
_L16:
        break MISSING_BLOCK_LABEL_415;
_L18:
        flag5 = flag3;
        if (flag3)
        {
            p = view;
            flag5 = flag3;
        }
_L12:
        flag6 = d1.b();
        flag3 = d1.c();
        boolean flag;
        if (flag3 && !flag6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag6 = flag5;
        flag2 = flag;
        if (!flag3) goto _L6; else goto _L17
_L17:
        flag6 = flag5;
        flag2 = flag;
        if (flag) goto _L6; else goto _L2
_L2:
        list.clear();
        return flag5;
_L15:
        flag3 = b1.b(this, view, motionevent);
          goto _L18
        flag3 = b1.a(this, view, motionevent);
          goto _L18
    }

    private static int b(int i1)
    {
        int j1 = i1;
        if (i1 == 0)
        {
            j1 = 0x800033;
        }
        return j1;
    }

    private static int c(int i1)
    {
        int j1 = i1;
        if (i1 == 0)
        {
            j1 = 0x800035;
        }
        return j1;
    }

    private static d c(View view)
    {
        d d1 = (d)view.getLayoutParams();
        if (!d1.b)
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
                    d1.a((b)view1.value().newInstance());
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    Log.e("CoordinatorLayout", (new StringBuilder("Default behavior class ")).append(view1.value().getName()).append(" could not be instantiated. Did you forget a default constructor?").toString(), view);
                }
            }
            d1.b = true;
        }
        return d1;
    }

    public final void a(View view)
    {
        int j1 = g.size();
        boolean flag = false;
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = (View)g.get(i1);
            boolean flag1;
            if (view1 == view)
            {
                flag1 = true;
            } else
            {
                flag1 = flag;
                if (flag)
                {
                    d d1 = (d)view1.getLayoutParams();
                    b b1 = d1.a;
                    flag1 = flag;
                    if (b1 != null)
                    {
                        flag1 = flag;
                        if (d1.a(view))
                        {
                            b1.b(this, view1, view);
                            flag1 = flag;
                        }
                    }
                }
            }
            i1++;
            flag = flag1;
        }
    }

    public final void a(View view, int i1)
    {
        Object obj;
        obj = (d)view.getLayoutParams();
        boolean flag;
        if (((d) (obj)).g == null && ((d) (obj)).f != -1)
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
        if (((d) (obj)).g != null)
        {
            obj = ((d) (obj)).g;
            view.getLayoutParams();
            Rect rect = j;
            Rect rect2 = k;
            android.support.design.widget.s.a(this, ((View) (obj)), rect);
            a(view, i1, rect, rect2);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            return;
        }
        if (((d) (obj)).e < 0) goto _L2; else goto _L1
_L1:
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int l1 = ((d) (obj)).e;
        obj = (d)view.getLayoutParams();
        i3 = android.support.v4.view.e.a(c(((d) (obj)).c), i1);
        l2 = getWidth();
        k2 = getHeight();
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        int j1 = l1;
        if (i1 == 1)
        {
            j1 = l2 - l1;
        }
        i1 = a(j1) - i2;
        i3 & 7;
        JVM INSTR lookupswitch 2: default 236
    //                   1: 362
    //                   5: 354;
           goto _L3 _L4 _L5
_L3:
        i3 & 0x70;
        JVM INSTR lookupswitch 2: default 268
    //                   16: 381
    //                   80: 372;
           goto _L6 _L7 _L8
_L6:
        int k1 = 0;
_L9:
        i1 = Math.max(getPaddingLeft() + ((d) (obj)).leftMargin, Math.min(i1, l2 - getPaddingRight() - i2 - ((d) (obj)).rightMargin));
        k1 = Math.max(getPaddingTop() + ((d) (obj)).topMargin, Math.min(k1, k2 - getPaddingBottom() - j2 - ((d) (obj)).bottomMargin));
        view.layout(i1, k1, i1 + i2, k1 + j2);
        return;
_L5:
        i1 += i2;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 += i2 / 2;
        continue; /* Loop/switch isn't completed */
_L8:
        k1 = j2 + 0;
        continue; /* Loop/switch isn't completed */
_L7:
        k1 = j2 / 2 + 0;
        if (true) goto _L9; else goto _L2
_L2:
        d d1 = (d)view.getLayoutParams();
        Rect rect1 = j;
        rect1.set(getPaddingLeft() + d1.leftMargin, getPaddingTop() + d1.topMargin, getWidth() - getPaddingRight() - d1.rightMargin, getHeight() - getPaddingBottom() - d1.bottomMargin);
        if (u != null && android.support.v4.view.x.x(this) && !android.support.v4.view.x.x(view))
        {
            rect1.left = rect1.left + u.a();
            rect1.top = rect1.top + u.b();
            rect1.right = rect1.right - u.c();
            rect1.bottom = rect1.bottom - u.d();
        }
        Rect rect3 = k;
        android.support.v4.view.e.a(b(d1.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect1, rect3, i1);
        view.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        return;
        if (true) goto _L3; else goto _L10
_L10:
    }

    public final void a(View view, int i1, int j1, int k1)
    {
        measureChildWithMargins(view, i1, j1, k1, 0);
    }

    final void a(boolean flag)
    {
        int i1;
        int l1;
        int i2;
        l1 = android.support.v4.view.x.h(this);
        i2 = g.size();
        i1 = 0;
_L7:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        View view;
        int k1;
        view = (View)g.get(i1);
        Object obj = (d)view.getLayoutParams();
        for (int j1 = 0; j1 < i1; j1++)
        {
            Object obj1 = (View)g.get(j1);
            if (((d) (obj)).h != obj1)
            {
                continue;
            }
            obj1 = (d)view.getLayoutParams();
            if (((d) (obj1)).g == null)
            {
                continue;
            }
            Object obj2 = j;
            Rect rect1 = k;
            Rect rect2 = l;
            android.support.design.widget.s.a(this, ((d) (obj1)).g, ((Rect) (obj2)));
            a(view, false, rect1);
            a(view, l1, ((Rect) (obj2)), rect2);
            int j2 = rect2.left - rect1.left;
            int k2 = rect2.top - rect1.top;
            if (j2 != 0)
            {
                view.offsetLeftAndRight(j2);
            }
            if (k2 != 0)
            {
                view.offsetTopAndBottom(k2);
            }
            if (j2 == 0 && k2 == 0)
            {
                continue;
            }
            obj2 = ((d) (obj1)).a;
            if (obj2 != null)
            {
                ((b) (obj2)).b(this, view, ((d) (obj1)).g);
            }
        }

        obj = j;
        Rect rect = k;
        ((Rect) (obj)).set(((d)view.getLayoutParams()).i);
        a(view, true, rect);
        if (((Rect) (obj)).equals(rect))
        {
            continue; /* Loop/switch isn't completed */
        }
        ((d)view.getLayoutParams()).i.set(rect);
        k1 = i1 + 1;
_L4:
        View view1;
        d d1;
        b b1;
        if (k1 >= i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        view1 = (View)g.get(k1);
        d1 = (d)view1.getLayoutParams();
        b1 = d1.a;
        if (b1 != null && b1.a(view))
        {
            if (flag || !d1.g())
            {
                break; /* Loop/switch isn't completed */
            }
            d1.i();
        }
_L5:
        k1++;
        if (true) goto _L4; else goto _L3
_L3:
        b1.b(this, view1, view);
        if (flag)
        {
            d1.h();
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
        i1++;
          goto _L7
_L2:
    }

    public final boolean a(View view, int i1, int j1)
    {
        Rect rect = j;
        android.support.design.widget.s.a(this, view, rect);
        return rect.contains(i1, j1);
    }

    public final boolean a(View view, View view1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (view.getVisibility() == 0)
        {
            flag = flag1;
            if (view1.getVisibility() == 0)
            {
                Rect rect = j;
                if (view.getParent() != this)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(view, flag, rect);
                view = k;
                if (view1.getParent() != this)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(view1, flag, ((Rect) (view)));
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

    public final List b(View view)
    {
        d d1 = (d)view.getLayoutParams();
        List list = i;
        list.clear();
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view1 = getChildAt(i1);
            if (view1 != view && d1.a(view1))
            {
                list.add(view1);
            }
        }

        return list;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof d) && super.checkLayoutParams(layoutparams);
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        view.getLayoutParams();
        return super.drawChild(canvas, view, l1);
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new d();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new d(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof d)
        {
            return new d((d)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new d((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new d(layoutparams);
        }
    }

    public int getNestedScrollAxes()
    {
        return y.a();
    }

    protected int getSuggestedMinimumHeight()
    {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth()
    {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a();
        if (t)
        {
            if (s == null)
            {
                s = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(s);
        }
        if (u == null && android.support.v4.view.x.x(this))
        {
            android.support.v4.view.x.w(this);
        }
        n = true;
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a();
        if (t && s != null)
        {
            getViewTreeObserver().removeOnPreDrawListener(s);
        }
        if (r != null)
        {
            onStopNestedScroll(r);
        }
        n = false;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (v && w != null)
        {
            int i1;
            if (u != null)
            {
                i1 = u.b();
            } else
            {
                i1 = 0;
            }
            if (i1 > 0)
            {
                w.setBounds(0, 0, getWidth(), i1);
                w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = android.support.v4.view.m.a(motionevent);
        if (i1 == 0)
        {
            a();
        }
        boolean flag = a(motionevent, 0);
        if (i1 == 1 || i1 == 3)
        {
            a();
        }
        return flag;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = android.support.v4.view.x.h(this);
        k1 = g.size();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = (View)g.get(i1);
            b b1 = ((d)view.getLayoutParams()).a;
            if (b1 == null || !b1.a(this, view, j1))
            {
                a(view, j1);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        View view2;
        d d2;
        boolean flag1;
        int l2;
        l2 = getChildCount();
        int j2;
        if (g.size() != l2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j2 = 0;
        if (j2 >= l2)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        view2 = getChildAt(j2);
        d2 = c(view2);
        if (d2.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        d2.h = null;
        d2.g = null;
_L11:
        j2++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_26;
_L1:
        if (d2.g == null) goto _L4; else goto _L3
_L3:
        if (d2.g.getId() == d2.f) goto _L6; else goto _L5
_L5:
        boolean flag = false;
_L8:
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
_L6:
        view1 = d2.g;
        viewparent = d2.g.getParent();
_L9:
        if (viewparent != this)
        {
label0:
            {
                if (viewparent != null && viewparent != view2)
                {
                    break label0;
                }
                d2.h = null;
                d2.g = null;
                flag = false;
            }
        } else
        {
            d2.h = view1;
            flag = true;
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (viewparent instanceof View)
        {
            view1 = (View)viewparent;
        }
        viewparent = viewparent.getParent();
          goto _L9
_L4:
        d2.g = findViewById(d2.f);
        if (d2.g == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        View view1 = d2.g;
        for (ViewParent viewparent = d2.g.getParent(); viewparent != this && viewparent != null; viewparent = viewparent.getParent())
        {
            if (viewparent == view2)
            {
                if (isInEditMode())
                {
                    d2.h = null;
                    d2.g = null;
                } else
                {
                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                }
                continue; /* Loop/switch isn't completed */
            }
            if (viewparent instanceof View)
            {
                view1 = (View)viewparent;
            }
        }

        d2.h = view1;
        continue; /* Loop/switch isn't completed */
        if (isInEditMode())
        {
            d2.h = null;
            d2.g = null;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Could not find CoordinatorLayout descendant view with id ")).append(getResources().getResourceName(d2.f)).append(" to anchor view ").append(view2).toString());
        }
        if (true) goto _L11; else goto _L10
_L10:
        int i2;
        int k2;
        if (flag1)
        {
            g.clear();
            for (int k1 = 0; k1 < l2; k1++)
            {
                g.add(getChildAt(k1));
            }

            Collections.sort(g, d);
        }
        k2 = getChildCount();
        i2 = 0;
_L26:
        View view;
        d d1;
        if (i2 >= k2)
        {
            break MISSING_BLOCK_LABEL_1189;
        }
        view = getChildAt(i2);
        d1 = (d)view.getLayoutParams();
        if (d1.g == null) goto _L13; else goto _L12
_L12:
        int l1 = 1;
_L24:
        if (l1 == 0) goto _L15; else goto _L14
_L14:
        boolean flag3 = true;
_L30:
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int i5;
        Object obj;
        boolean flag2;
        int i3;
        int l4;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        if (flag3 != t)
        {
            if (flag3)
            {
                if (n)
                {
                    if (s == null)
                    {
                        s = new e();
                    }
                    getViewTreeObserver().addOnPreDrawListener(s);
                }
                t = true;
            } else
            {
                if (n && s != null)
                {
                    getViewTreeObserver().removeOnPreDrawListener(s);
                }
                t = false;
            }
        }
        i5 = getPaddingLeft();
        j5 = getPaddingTop();
        k5 = getPaddingRight();
        l5 = getPaddingBottom();
        i6 = android.support.v4.view.x.h(this);
        if (i6 == 1)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        j6 = android.view.View.MeasureSpec.getMode(i1);
        k6 = android.view.View.MeasureSpec.getSize(i1);
        l6 = android.view.View.MeasureSpec.getMode(j1);
        i7 = android.view.View.MeasureSpec.getSize(j1);
        l3 = getSuggestedMinimumWidth();
        k3 = getSuggestedMinimumHeight();
        j3 = 0;
        if (u != null && android.support.v4.view.x.x(this))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j7 = g.size();
        i3 = 0;
_L23:
        if (i3 >= j7) goto _L17; else goto _L16
_L16:
        view = (View)g.get(i3);
        d1 = (d)view.getLayoutParams();
        i4 = 0;
        l1 = i4;
        if (d1.e < 0) goto _L19; else goto _L18
_L18:
        l1 = i4;
        if (j6 == 0) goto _L19; else goto _L20
_L20:
        j4 = a(d1.e);
        k4 = android.support.v4.view.e.a(c(d1.c), i6) & 7;
        if ((k4 != 3 || i2 != 0) && (k4 != 5 || i2 == 0)) goto _L22; else goto _L21
_L21:
        l1 = Math.max(0, k6 - k5 - j4);
_L19:
        j4 = i1;
        k4 = j1;
        l4 = j4;
        i4 = k4;
        if (flag2)
        {
            l4 = j4;
            i4 = k4;
            if (!android.support.v4.view.x.x(view))
            {
                k4 = u.a();
                l4 = u.c();
                i4 = u.b();
                j4 = u.d();
                l4 = android.view.View.MeasureSpec.makeMeasureSpec(k6 - (k4 + l4), j6);
                i4 = android.view.View.MeasureSpec.makeMeasureSpec(i7 - (i4 + j4), l6);
            }
        }
        obj = d1.a;
        if (obj == null || !((b) (obj)).a(this, view, l4, l1, i4))
        {
            a(view, l4, l1, i4);
        }
        l3 = Math.max(l3, view.getMeasuredWidth() + (i5 + k5) + d1.leftMargin + d1.rightMargin);
        k3 = Math.max(k3, view.getMeasuredHeight() + (j5 + l5) + d1.topMargin + d1.bottomMargin);
        j3 = android.support.v4.view.x.a(j3, android.support.v4.view.x.l(view));
        i3++;
          goto _L23
_L13:
        i3 = getChildCount();
        l1 = 0;
_L25:
label1:
        {
            if (l1 >= i3)
            {
                break MISSING_BLOCK_LABEL_1057;
            }
            obj = getChildAt(l1);
            if (obj == view || !d1.a(((View) (obj))))
            {
                break label1;
            }
            l1 = 1;
        }
          goto _L24
        l1++;
          goto _L25
        l1 = 0;
          goto _L24
_L15:
        i2++;
          goto _L26
_L22:
        if (k4 == 5 && i2 == 0) goto _L28; else goto _L27
_L27:
        l1 = i4;
        if (k4 != 3) goto _L19; else goto _L29
_L29:
        l1 = i4;
        if (i2 == 0) goto _L19; else goto _L28
_L28:
        l1 = Math.max(0, j4 - i5);
          goto _L19
_L17:
        setMeasuredDimension(android.support.v4.view.x.a(l3, i1, 0xff000000 & j3), android.support.v4.view.x.a(k3, j1, j3 << 16));
        return;
        flag3 = false;
          goto _L30
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1;)
        {
            view = getChildAt(i1);
            Object obj = (d)view.getLayoutParams();
            boolean flag2 = flag1;
            if (((d) (obj)).f())
            {
                obj = ((d) (obj)).a;
                flag2 = flag1;
                if (obj != null)
                {
                    flag2 = flag1 | ((b) (obj)).a(this, view, f2, flag);
                }
            }
            i1++;
            flag1 = flag2;
        }

        if (flag1)
        {
            a(true);
        }
        return flag1;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            getChildAt(i1).getLayoutParams();
        }

        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
        int k1 = 0;
        int l1 = 0;
        boolean flag = false;
        int l2 = getChildCount();
        int i2 = 0;
        while (i2 < l2) 
        {
            View view1 = getChildAt(i2);
            Object obj = (d)view1.getLayoutParams();
            boolean flag1 = flag;
            int k2 = k1;
            int j2 = l1;
            if (((d) (obj)).f())
            {
                obj = ((d) (obj)).a;
                flag1 = flag;
                k2 = k1;
                j2 = l1;
                if (obj != null)
                {
                    int ai1[] = m;
                    m[1] = 0;
                    ai1[0] = 0;
                    ((b) (obj)).a(this, view1, view, i1, j1, m);
                    if (i1 > 0)
                    {
                        k1 = Math.max(k1, m[0]);
                    } else
                    {
                        k1 = Math.min(k1, m[0]);
                    }
                    if (j1 > 0)
                    {
                        l1 = Math.max(l1, m[1]);
                    } else
                    {
                        l1 = Math.min(l1, m[1]);
                    }
                    flag1 = true;
                    j2 = l1;
                    k2 = k1;
                }
            }
            i2++;
            flag = flag1;
            k1 = k2;
            l1 = j2;
        }
        ai[0] = k1;
        ai[1] = l1;
        if (flag)
        {
            a(true);
        }
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        int i2 = getChildCount();
        j1 = 0;
        for (i1 = 0; i1 < i2;)
        {
            view = getChildAt(i1);
            Object obj = (d)view.getLayoutParams();
            k1 = j1;
            if (((d) (obj)).f())
            {
                obj = ((d) (obj)).a;
                k1 = j1;
                if (obj != null)
                {
                    ((b) (obj)).b(this, view, l1);
                    k1 = 1;
                }
            }
            i1++;
            j1 = k1;
        }

        if (j1 != 0)
        {
            a(true);
        }
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        y.a(i1);
        q = view;
        r = view1;
        int j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            getChildAt(i1).getLayoutParams();
        }

    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        parcelable = ((SavedState) (parcelable)).a;
        int i1 = 0;
        for (int j1 = getChildCount(); i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            int k1 = view.getId();
            b b1 = c(view).a;
            if (k1 == -1 || b1 == null)
            {
                continue;
            }
            Parcelable parcelable1 = (Parcelable)parcelable.get(k1);
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
        int i1 = 0;
        for (int j1 = getChildCount(); i1 < j1; i1++)
        {
            Object obj = getChildAt(i1);
            int k1 = ((View) (obj)).getId();
            b b1 = ((d)((View) (obj)).getLayoutParams()).a;
            if (k1 == -1 || b1 == null)
            {
                continue;
            }
            obj = b1.a(this, ((View) (obj)));
            if (obj != null)
            {
                sparsearray.append(k1, obj);
            }
        }

        savedstate.a = sparsearray;
        return savedstate;
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        boolean flag = false;
        int k1 = getChildCount();
        int j1 = 0;
        while (j1 < k1) 
        {
            view1 = getChildAt(j1);
            d d1 = (d)view1.getLayoutParams();
            b b1 = d1.a;
            if (b1 != null)
            {
                boolean flag1 = b1.a(this, view1, view, i1);
                flag |= flag1;
                d1.a(flag1);
            } else
            {
                d1.a(false);
            }
            j1++;
        }
        return flag;
    }

    public void onStopNestedScroll(View view)
    {
        y.b();
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view1 = getChildAt(i1);
            d d1 = (d)view1.getLayoutParams();
            if (!d1.f())
            {
                continue;
            }
            b b1 = d1.a;
            if (b1 != null)
            {
                b1.a(this, view1, view);
            }
            d1.e();
            d1.i();
        }

        q = null;
        r = null;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag3;
label0:
        {
            boolean flag4 = false;
            boolean flag1 = false;
            i1 = android.support.v4.view.m.a(motionevent);
            if (p == null)
            {
                flag1 = a(motionevent, 1);
                flag3 = flag1;
                flag = flag4;
                if (!flag1)
                {
                    break label0;
                }
            }
            b b1 = ((d)p.getLayoutParams()).a;
            flag3 = flag1;
            flag = flag4;
            if (b1 != null)
            {
                flag = b1.a(this, p, motionevent);
                flag3 = flag1;
            }
        }
        if (p != null) goto _L2; else goto _L1
_L1:
        boolean flag2 = flag | super.onTouchEvent(motionevent);
_L4:
        if (i1 == 1 || i1 == 3)
        {
            a();
        }
        return flag2;
_L2:
        flag2 = flag;
        if (flag3)
        {
            super.onTouchEvent(null);
            flag2 = flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        if (flag)
        {
            a();
        }
    }

    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
    {
        x = onhierarchychangelistener;
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        setStatusBarBackground(new ColorDrawable(i1));
    }

    public void setStatusBarBackgroundResource(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = android.support.v4.content.a.a(getContext(), i1);
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
            e = new f();
            f = new android.support.design.widget.f();
        } else
        {
            e = null;
            f = null;
        }
    }
}
