// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class android.support.v4.view.a.c
{
    public static final class a
    {

        public static final a a = new a(1);
        public static final a b = new a(2);
        public static final a c = new a(4);
        public static final a d = new a(8);
        public static final a e = new a(16);
        public static final a f = new a(32);
        public static final a g = new a(64);
        public static final a h = new a(128);
        public static final a i = new a(256);
        public static final a j = new a(512);
        public static final a k = new a(1024);
        public static final a l = new a(2048);
        public static final a m = new a(4096);
        public static final a n = new a(8192);
        public static final a o = new a(16384);
        public static final a p = new a(32768);
        public static final a q = new a(0x10000);
        public static final a r = new a(0x20000);
        public static final a s = new a(0x40000);
        public static final a t = new a(0x80000);
        public static final a u = new a(0x100000);
        public static final a v = new a(0x200000);
        private final Object w;

        static Object a(a a1)
        {
            return a1.w;
        }


        private a(int i1)
        {
            this(android.support.v4.view.a.c.m().a(i1));
        }

        private a(Object obj)
        {
            w = obj;
        }
    }

    static class b extends i
    {

        public final Object a(int i1)
        {
            return new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i1, null);
        }

        public final Object a(int i1, int j1, int k1, int l1, boolean flag)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, j1, k1, l1, flag, false);
        }

        public final Object a(int i1, int j1, boolean flag, int k1)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i1, j1, flag, k1);
        }

        public final boolean a(Object obj, Object obj1)
        {
            return ((AccessibilityNodeInfo)obj).removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
        }

        b()
        {
        }
    }

    static final class c extends b
    {

        c()
        {
        }
    }

    static class d extends j
    {

        public final Object a()
        {
            return AccessibilityNodeInfo.obtain();
        }

        public final Object a(View view)
        {
            return AccessibilityNodeInfo.obtain(view);
        }

        public final Object a(Object obj)
        {
            return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)obj);
        }

        public final void a(Object obj, int i1)
        {
            ((AccessibilityNodeInfo)obj).addAction(i1);
        }

        public final void a(Object obj, Rect rect)
        {
            ((AccessibilityNodeInfo)obj).getBoundsInParent(rect);
        }

        public final void a(Object obj, View view)
        {
            ((AccessibilityNodeInfo)obj).addChild(view);
        }

        public final void a(Object obj, CharSequence charsequence)
        {
            ((AccessibilityNodeInfo)obj).setClassName(charsequence);
        }

        public final void a(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setClickable(flag);
        }

        public final int b(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getActions();
        }

        public final void b(Object obj, Rect rect)
        {
            ((AccessibilityNodeInfo)obj).getBoundsInScreen(rect);
        }

        public final void b(Object obj, View view)
        {
            ((AccessibilityNodeInfo)obj).setParent(view);
        }

        public final void b(Object obj, CharSequence charsequence)
        {
            ((AccessibilityNodeInfo)obj).setContentDescription(charsequence);
        }

        public final void b(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setEnabled(flag);
        }

        public final CharSequence c(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getClassName();
        }

        public final void c(Object obj, Rect rect)
        {
            ((AccessibilityNodeInfo)obj).setBoundsInParent(rect);
        }

        public final void c(Object obj, View view)
        {
            ((AccessibilityNodeInfo)obj).setSource(view);
        }

        public final void c(Object obj, CharSequence charsequence)
        {
            ((AccessibilityNodeInfo)obj).setPackageName(charsequence);
        }

        public final void c(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setFocusable(flag);
        }

        public final CharSequence d(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getContentDescription();
        }

        public final void d(Object obj, Rect rect)
        {
            ((AccessibilityNodeInfo)obj).setBoundsInScreen(rect);
        }

        public final void d(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setFocused(flag);
        }

        public final CharSequence e(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getPackageName();
        }

        public final void e(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setLongClickable(flag);
        }

        public final CharSequence f(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getText();
        }

        public final void f(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setScrollable(flag);
        }

        public final void g(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setSelected(flag);
        }

        public final boolean g(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isCheckable();
        }

        public final boolean h(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isChecked();
        }

        public final boolean i(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isClickable();
        }

        public final boolean j(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isEnabled();
        }

        public final boolean k(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isFocusable();
        }

        public final boolean l(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isFocused();
        }

        public final boolean m(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isLongClickable();
        }

        public final boolean n(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isPassword();
        }

        public final boolean o(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isScrollable();
        }

        public final boolean p(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isSelected();
        }

        public final void q(Object obj)
        {
            ((AccessibilityNodeInfo)obj).recycle();
        }

        d()
        {
        }
    }

    public static interface e
    {

        public abstract Object a();

        public abstract Object a(int i1);

        public abstract Object a(int i1, int j1, int k1, int l1, boolean flag);

        public abstract Object a(int i1, int j1, boolean flag, int k1);

        public abstract Object a(View view);

        public abstract Object a(Object obj);

        public abstract void a(Object obj, int i1);

        public abstract void a(Object obj, Rect rect);

        public abstract void a(Object obj, View view);

        public abstract void a(Object obj, View view, int i1);

        public abstract void a(Object obj, CharSequence charsequence);

        public abstract void a(Object obj, boolean flag);

        public abstract boolean a(Object obj, Object obj1);

        public abstract int b(Object obj);

        public abstract void b(Object obj, Rect rect);

        public abstract void b(Object obj, View view);

        public abstract void b(Object obj, View view, int i1);

        public abstract void b(Object obj, CharSequence charsequence);

        public abstract void b(Object obj, Object obj1);

        public abstract void b(Object obj, boolean flag);

        public abstract CharSequence c(Object obj);

        public abstract void c(Object obj, Rect rect);

        public abstract void c(Object obj, View view);

        public abstract void c(Object obj, CharSequence charsequence);

        public abstract void c(Object obj, Object obj1);

        public abstract void c(Object obj, boolean flag);

        public abstract CharSequence d(Object obj);

        public abstract void d(Object obj, Rect rect);

        public abstract void d(Object obj, boolean flag);

        public abstract CharSequence e(Object obj);

        public abstract void e(Object obj, boolean flag);

        public abstract CharSequence f(Object obj);

        public abstract void f(Object obj, boolean flag);

        public abstract void g(Object obj, boolean flag);

        public abstract boolean g(Object obj);

        public abstract void h(Object obj, boolean flag);

        public abstract boolean h(Object obj);

        public abstract void i(Object obj, boolean flag);

        public abstract boolean i(Object obj);

        public abstract boolean j(Object obj);

        public abstract boolean k(Object obj);

        public abstract boolean l(Object obj);

        public abstract boolean m(Object obj);

        public abstract boolean n(Object obj);

        public abstract boolean o(Object obj);

        public abstract boolean p(Object obj);

        public abstract void q(Object obj);

        public abstract boolean r(Object obj);

        public abstract boolean s(Object obj);

        public abstract String t(Object obj);
    }

    static class f extends d
    {

        public final void a(Object obj, View view, int i1)
        {
            ((AccessibilityNodeInfo)obj).setSource(view, i1);
        }

        public final void b(Object obj, View view, int i1)
        {
            ((AccessibilityNodeInfo)obj).addChild(view, i1);
        }

        public final void h(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setVisibleToUser(flag);
        }

        public final void i(Object obj, boolean flag)
        {
            ((AccessibilityNodeInfo)obj).setAccessibilityFocused(flag);
        }

        public final boolean r(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isVisibleToUser();
        }

        public final boolean s(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).isAccessibilityFocused();
        }

        f()
        {
        }
    }

    static class g extends f
    {

        g()
        {
        }
    }

    static class h extends g
    {

        public final String t(Object obj)
        {
            return ((AccessibilityNodeInfo)obj).getViewIdResourceName();
        }

        h()
        {
        }
    }

    static class i extends h
    {

        public Object a(int i1, int j1, int k1, int l1, boolean flag)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i1, j1, k1, l1, flag);
        }

        public Object a(int i1, int j1, boolean flag, int k1)
        {
            return android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i1, j1, flag);
        }

        public final void b(Object obj, Object obj1)
        {
            ((AccessibilityNodeInfo)obj).setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj1);
        }

        public final void c(Object obj, Object obj1)
        {
            ((AccessibilityNodeInfo)obj).setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj1);
        }

        i()
        {
        }
    }

    static class j
        implements e
    {

        public Object a()
        {
            return null;
        }

        public Object a(int i1)
        {
            return null;
        }

        public Object a(int i1, int j1, int k1, int l1, boolean flag)
        {
            return null;
        }

        public Object a(int i1, int j1, boolean flag, int k1)
        {
            return null;
        }

        public Object a(View view)
        {
            return null;
        }

        public Object a(Object obj)
        {
            return null;
        }

        public void a(Object obj, int i1)
        {
        }

        public void a(Object obj, Rect rect)
        {
        }

        public void a(Object obj, View view)
        {
        }

        public void a(Object obj, View view, int i1)
        {
        }

        public void a(Object obj, CharSequence charsequence)
        {
        }

        public void a(Object obj, boolean flag)
        {
        }

        public boolean a(Object obj, Object obj1)
        {
            return false;
        }

        public int b(Object obj)
        {
            return 0;
        }

        public void b(Object obj, Rect rect)
        {
        }

        public void b(Object obj, View view)
        {
        }

        public void b(Object obj, View view, int i1)
        {
        }

        public void b(Object obj, CharSequence charsequence)
        {
        }

        public void b(Object obj, Object obj1)
        {
        }

        public void b(Object obj, boolean flag)
        {
        }

        public CharSequence c(Object obj)
        {
            return null;
        }

        public void c(Object obj, Rect rect)
        {
        }

        public void c(Object obj, View view)
        {
        }

        public void c(Object obj, CharSequence charsequence)
        {
        }

        public void c(Object obj, Object obj1)
        {
        }

        public void c(Object obj, boolean flag)
        {
        }

        public CharSequence d(Object obj)
        {
            return null;
        }

        public void d(Object obj, Rect rect)
        {
        }

        public void d(Object obj, boolean flag)
        {
        }

        public CharSequence e(Object obj)
        {
            return null;
        }

        public void e(Object obj, boolean flag)
        {
        }

        public CharSequence f(Object obj)
        {
            return null;
        }

        public void f(Object obj, boolean flag)
        {
        }

        public void g(Object obj, boolean flag)
        {
        }

        public boolean g(Object obj)
        {
            return false;
        }

        public void h(Object obj, boolean flag)
        {
        }

        public boolean h(Object obj)
        {
            return false;
        }

        public void i(Object obj, boolean flag)
        {
        }

        public boolean i(Object obj)
        {
            return false;
        }

        public boolean j(Object obj)
        {
            return false;
        }

        public boolean k(Object obj)
        {
            return false;
        }

        public boolean l(Object obj)
        {
            return false;
        }

        public boolean m(Object obj)
        {
            return false;
        }

        public boolean n(Object obj)
        {
            return false;
        }

        public boolean o(Object obj)
        {
            return false;
        }

        public boolean p(Object obj)
        {
            return false;
        }

        public void q(Object obj)
        {
        }

        public boolean r(Object obj)
        {
            return false;
        }

        public boolean s(Object obj)
        {
            return false;
        }

        public String t(Object obj)
        {
            return null;
        }

        j()
        {
        }
    }

    public static final class k
    {

        public final Object a;

        public k(Object obj)
        {
            a = obj;
        }
    }

    public static final class l
    {

        final Object a;

        public static l a(int i1, int j1, int k1, int l1, boolean flag)
        {
            return new l(android.support.v4.view.a.c.m().a(i1, j1, k1, l1, flag));
        }

        private l(Object obj)
        {
            a = obj;
        }
    }


    public static final e a;
    public final Object b;

    public android.support.v4.view.a.c(Object obj)
    {
        b = obj;
    }

    public static android.support.v4.view.a.c a()
    {
        return b(a.a());
    }

    public static android.support.v4.view.a.c a(android.support.v4.view.a.c c1)
    {
        return b(a.a(c1.b));
    }

    public static android.support.v4.view.a.c a(View view)
    {
        return b(a.a(view));
    }

    private static android.support.v4.view.a.c b(Object obj)
    {
        if (obj != null)
        {
            return new android.support.v4.view.a.c(obj);
        } else
        {
            return null;
        }
    }

    public static e m()
    {
        return a;
    }

    public final void a(int i1)
    {
        a.a(b, i1);
    }

    public final void a(Rect rect)
    {
        a.a(b, rect);
    }

    public final void a(CharSequence charsequence)
    {
        a.c(b, charsequence);
    }

    public final void a(Object obj)
    {
        a.c(b, ((l)obj).a);
    }

    public final void a(boolean flag)
    {
        a.c(b, flag);
    }

    public final boolean a(a a1)
    {
        return a.a(b, a.a(a1));
    }

    public final int b()
    {
        return a.b(b);
    }

    public final void b(Rect rect)
    {
        a.c(b, rect);
    }

    public final void b(View view)
    {
        a.b(b, view);
    }

    public final void b(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public final void b(boolean flag)
    {
        a.d(b, flag);
    }

    public final void c(Rect rect)
    {
        a.b(b, rect);
    }

    public final void c(CharSequence charsequence)
    {
        a.b(b, charsequence);
    }

    public final void c(boolean flag)
    {
        a.h(b, flag);
    }

    public final boolean c()
    {
        return a.k(b);
    }

    public final void d(Rect rect)
    {
        a.d(b, rect);
    }

    public final void d(boolean flag)
    {
        a.i(b, flag);
    }

    public final boolean d()
    {
        return a.l(b);
    }

    public final void e(boolean flag)
    {
        a.b(b, flag);
    }

    public final boolean e()
    {
        return a.p(b);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (android.support.v4.view.a.c)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((android.support.v4.view.a.c) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((android.support.v4.view.a.c) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final void f(boolean flag)
    {
        a.f(b, flag);
    }

    public final boolean f()
    {
        return a.i(b);
    }

    public final boolean g()
    {
        return a.m(b);
    }

    public final boolean h()
    {
        return a.j(b);
    }

    public final int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    public final CharSequence i()
    {
        return a.e(b);
    }

    public final CharSequence j()
    {
        return a.c(b);
    }

    public final CharSequence k()
    {
        return a.f(b);
    }

    public final CharSequence l()
    {
        return a.d(b);
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        int i1;
        stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringbuilder.append((new StringBuilder("; boundsInParent: ")).append(rect).toString());
        c(rect);
        stringbuilder.append((new StringBuilder("; boundsInScreen: ")).append(rect).toString());
        stringbuilder.append("; packageName: ").append(i());
        stringbuilder.append("; className: ").append(j());
        stringbuilder.append("; text: ").append(k());
        stringbuilder.append("; contentDescription: ").append(l());
        stringbuilder.append("; viewId: ").append(a.t(b));
        stringbuilder.append("; checkable: ").append(a.g(b));
        stringbuilder.append("; checked: ").append(a.h(b));
        stringbuilder.append("; focusable: ").append(c());
        stringbuilder.append("; focused: ").append(d());
        stringbuilder.append("; selected: ").append(e());
        stringbuilder.append("; clickable: ").append(f());
        stringbuilder.append("; longClickable: ").append(g());
        stringbuilder.append("; enabled: ").append(h());
        stringbuilder.append("; password: ").append(a.n(b));
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(a.o(b)).toString());
        stringbuilder.append("; [");
        i1 = b();
_L24:
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = 1 << Integer.numberOfTrailingZeros(i1);
        i1 = ~j1 & i1;
        j1;
        JVM INSTR lookupswitch 18: default 532
    //                   1: 557
    //                   2: 564
    //                   4: 571
    //                   8: 578
    //                   16: 585
    //                   32: 592
    //                   64: 599
    //                   128: 606
    //                   256: 613
    //                   512: 620
    //                   1024: 627
    //                   2048: 634
    //                   4096: 641
    //                   8192: 648
    //                   16384: 662
    //                   32768: 669
    //                   65536: 655
    //                   131072: 676;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L3:
        String s = "ACTION_UNKNOWN";
_L22:
        stringbuilder.append(s);
        if (i1 != 0)
        {
            stringbuilder.append(", ");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s = "ACTION_FOCUS";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "ACTION_CLEAR_FOCUS";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "ACTION_SELECT";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "ACTION_CLEAR_SELECTION";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "ACTION_CLICK";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "ACTION_LONG_CLICK";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "ACTION_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "ACTION_NEXT_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "ACTION_PREVIOUS_HTML_ELEMENT";
        continue; /* Loop/switch isn't completed */
_L16:
        s = "ACTION_SCROLL_FORWARD";
        continue; /* Loop/switch isn't completed */
_L17:
        s = "ACTION_SCROLL_BACKWARD";
        continue; /* Loop/switch isn't completed */
_L20:
        s = "ACTION_CUT";
        continue; /* Loop/switch isn't completed */
_L18:
        s = "ACTION_COPY";
        continue; /* Loop/switch isn't completed */
_L19:
        s = "ACTION_PASTE";
        continue; /* Loop/switch isn't completed */
_L21:
        s = "ACTION_SET_SELECTION";
        if (true) goto _L22; else goto _L2
_L2:
        stringbuilder.append("]");
        return stringbuilder.toString();
        if (true) goto _L24; else goto _L23
_L23:
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new b();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new i();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new h();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new g();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new f();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new d();
        } else
        {
            a = new j();
        }
    }
}
