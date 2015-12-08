// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;

public final class pa
{

    public static final pf a;
    public final Object b;

    public pa(Object obj)
    {
        b = obj;
    }

    public static pa a()
    {
        return b(a.a());
    }

    public static pa a(View view)
    {
        return b(a.a(view));
    }

    public static pa a(pa pa1)
    {
        return b(a.a(pa1.b));
    }

    private static pa b(Object obj)
    {
        if (obj != null)
        {
            return new pa(obj);
        } else
        {
            return null;
        }
    }

    public static pf m()
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
        a.c(b, ((pl)obj).a);
    }

    public final void a(boolean flag)
    {
        a.c(b, flag);
    }

    public final boolean a(pb pb1)
    {
        return a.a(b, pb.a(pb1));
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
        obj = (pa)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((pa) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((pa) (obj)).b)) goto _L1; else goto _L4
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
        JVM INSTR lookupswitch 18: default 520
    //                   1: 545
    //                   2: 552
    //                   4: 559
    //                   8: 566
    //                   16: 573
    //                   32: 580
    //                   64: 587
    //                   128: 594
    //                   256: 601
    //                   512: 608
    //                   1024: 615
    //                   2048: 622
    //                   4096: 629
    //                   8192: 636
    //                   16384: 650
    //                   32768: 657
    //                   65536: 643
    //                   131072: 664;
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
            a = new pd();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new pc();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new pj();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new pi();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new ph();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new pg();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new pe();
        } else
        {
            a = new pf();
        }
    }
}
