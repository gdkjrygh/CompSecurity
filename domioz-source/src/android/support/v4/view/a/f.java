// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view.a:
//            h, g, m, l, 
//            k, i, n, j, 
//            o, p

public final class f
{

    private static final j a;
    private final Object b;

    public f(Object obj)
    {
        b = obj;
    }

    static j d()
    {
        return a;
    }

    public final Object a()
    {
        return b;
    }

    public final void a(int i1)
    {
        a.a(b, i1);
    }

    public final void a(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public final void a(Object obj)
    {
        a.a(b, ((o)obj).a);
    }

    public final void b()
    {
        a.p(b);
    }

    public final void b(Object obj)
    {
        a.b(b, p.a((p)obj));
    }

    public final void c()
    {
        a.q(b);
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

    public final String toString()
    {
        StringBuilder stringbuilder;
        int i1;
        stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        a.a(b, rect);
        stringbuilder.append((new StringBuilder("; boundsInParent: ")).append(rect).toString());
        a.b(b, rect);
        stringbuilder.append((new StringBuilder("; boundsInScreen: ")).append(rect).toString());
        stringbuilder.append("; packageName: ").append(a.d(b));
        stringbuilder.append("; className: ").append(a.b(b));
        stringbuilder.append("; text: ").append(a.e(b));
        stringbuilder.append("; contentDescription: ").append(a.c(b));
        stringbuilder.append("; viewId: ").append(a.r(b));
        stringbuilder.append("; checkable: ").append(a.f(b));
        stringbuilder.append("; checked: ").append(a.g(b));
        stringbuilder.append("; focusable: ").append(a.j(b));
        stringbuilder.append("; focused: ").append(a.k(b));
        stringbuilder.append("; selected: ").append(a.o(b));
        stringbuilder.append("; clickable: ").append(a.h(b));
        stringbuilder.append("; longClickable: ").append(a.l(b));
        stringbuilder.append("; enabled: ").append(a.i(b));
        stringbuilder.append("; password: ").append(a.m(b));
        stringbuilder.append((new StringBuilder("; scrollable: ")).append(a.n(b)).toString());
        stringbuilder.append("; [");
        i1 = a.a(b);
_L24:
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        int j1;
        j1 = 1 << Integer.numberOfTrailingZeros(i1);
        i1 = ~j1 & i1;
        j1;
        JVM INSTR lookupswitch 18: default 628
    //                   1: 651
    //                   2: 657
    //                   4: 663
    //                   8: 669
    //                   16: 675
    //                   32: 681
    //                   64: 687
    //                   128: 693
    //                   256: 699
    //                   512: 705
    //                   1024: 711
    //                   2048: 717
    //                   4096: 723
    //                   8192: 729
    //                   16384: 741
    //                   32768: 747
    //                   65536: 735
    //                   131072: 753;
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
            a = new h();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new g();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new m();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new l();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new k();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new i();
        } else
        {
            a = new n();
        }
    }
}
