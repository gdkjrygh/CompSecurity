// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view.a:
//            i, h, o, n, 
//            m, l, j, p, 
//            k, g

public final class f
{

    public static final k a;
    public final Object b;

    public f(Object obj)
    {
        b = obj;
    }

    public static f a(f f1)
    {
        f1 = ((f) (a.a(f1.b)));
        if (f1 != null)
        {
            return new f(f1);
        } else
        {
            return null;
        }
    }

    static k n()
    {
        return a;
    }

    public final int a()
    {
        return a.b(b);
    }

    public final void a(int i1)
    {
        a.a(b, i1);
    }

    public final void a(Rect rect)
    {
        a.a(b, rect);
    }

    public final void a(View view)
    {
        a.c(b, view);
    }

    public final void a(CharSequence charsequence)
    {
        a.c(b, charsequence);
    }

    public final void a(boolean flag)
    {
        a.c(b, flag);
    }

    public final boolean a(g g1)
    {
        return a.a(b, android.support.v4.view.a.g.a(g1));
    }

    public final void b(Rect rect)
    {
        a.c(b, rect);
    }

    public final void b(View view)
    {
        a.a(b, view);
    }

    public final void b(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public final void b(boolean flag)
    {
        a.d(b, flag);
    }

    public final boolean b()
    {
        return a.k(b);
    }

    public final void c(Rect rect)
    {
        a.b(b, rect);
    }

    public final void c(View view)
    {
        a.b(b, view);
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
        return a.l(b);
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
        return a.s(b);
    }

    public final void e(boolean flag)
    {
        a.g(b, flag);
    }

    public final boolean e()
    {
        return a.t(b);
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
        obj = (f)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((f) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((f) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final void f(boolean flag)
    {
        a.a(b, flag);
    }

    public final boolean f()
    {
        return a.p(b);
    }

    public final void g(boolean flag)
    {
        a.e(b, flag);
    }

    public final boolean g()
    {
        return a.i(b);
    }

    public final void h(boolean flag)
    {
        a.b(b, flag);
    }

    public final boolean h()
    {
        return a.m(b);
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

    public final void i(boolean flag)
    {
        a.f(b, flag);
    }

    public final boolean i()
    {
        return a.j(b);
    }

    public final CharSequence j()
    {
        return a.e(b);
    }

    public final CharSequence k()
    {
        return a.c(b);
    }

    public final CharSequence l()
    {
        return a.d(b);
    }

    public final void m()
    {
        a.q(b);
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
        stringbuilder.append("; packageName: ").append(j());
        stringbuilder.append("; className: ").append(k());
        stringbuilder.append("; text: ").append(a.f(b));
        stringbuilder.append("; contentDescription: ").append(l());
        stringbuilder.append("; viewId: ").append(a.u(b));
        stringbuilder.append("; checkable: ").append(a.g(b));
        stringbuilder.append("; checked: ").append(a.h(b));
        stringbuilder.append("; focusable: ").append(b());
        stringbuilder.append("; focused: ").append(c());
        stringbuilder.append("; selected: ").append(f());
        stringbuilder.append("; clickable: ").append(g());
        stringbuilder.append("; longClickable: ").append(h());
        stringbuilder.append("; enabled: ").append(i());
        stringbuilder.append("; password: ").append(a.n(b));
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(a.o(b)).toString());
        stringbuilder.append("; [");
        i1 = a();
_L24:
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = 1 << Integer.numberOfTrailingZeros(i1);
        i1 = ~j1 & i1;
        j1;
        JVM INSTR lookupswitch 18: default 536
    //                   1: 561
    //                   2: 568
    //                   4: 575
    //                   8: 582
    //                   16: 589
    //                   32: 596
    //                   64: 603
    //                   128: 610
    //                   256: 617
    //                   512: 624
    //                   1024: 631
    //                   2048: 638
    //                   4096: 645
    //                   8192: 652
    //                   16384: 666
    //                   32768: 673
    //                   65536: 659
    //                   131072: 680;
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
            a = new i();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new h();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new o();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new n();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new m();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new l();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new j();
        } else
        {
            a = new p();
        }
    }
}
