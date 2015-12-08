// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view.a:
//            d, c, j, i, 
//            h, g, e, k, 
//            f, b

public class a
{

    private static final f a;
    private final Object b;

    public a(Object obj)
    {
        b = obj;
    }

    public static a a(a a1)
    {
        return a(a.a(a1.b));
    }

    static a a(Object obj)
    {
        if (obj != null)
        {
            return new a(obj);
        } else
        {
            return null;
        }
    }

    private static String b(int i1)
    {
        switch (i1)
        {
        default:
            return "ACTION_UNKNOWN";

        case 1: // '\001'
            return "ACTION_FOCUS";

        case 2: // '\002'
            return "ACTION_CLEAR_FOCUS";

        case 4: // '\004'
            return "ACTION_SELECT";

        case 8: // '\b'
            return "ACTION_CLEAR_SELECTION";

        case 16: // '\020'
            return "ACTION_CLICK";

        case 32: // ' '
            return "ACTION_LONG_CLICK";

        case 64: // '@'
            return "ACTION_ACCESSIBILITY_FOCUS";

        case 128: 
            return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";

        case 256: 
            return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";

        case 512: 
            return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";

        case 1024: 
            return "ACTION_NEXT_HTML_ELEMENT";

        case 2048: 
            return "ACTION_PREVIOUS_HTML_ELEMENT";

        case 4096: 
            return "ACTION_SCROLL_FORWARD";

        case 8192: 
            return "ACTION_SCROLL_BACKWARD";

        case 65536: 
            return "ACTION_CUT";

        case 16384: 
            return "ACTION_COPY";

        case 32768: 
            return "ACTION_PASTE";

        case 131072: 
            return "ACTION_SET_SELECTION";
        }
    }

    static f u()
    {
        return a;
    }

    public Object a()
    {
        return b;
    }

    public void a(int i1)
    {
        a.a(b, i1);
    }

    public void a(Rect rect)
    {
        a.a(b, rect);
    }

    public void a(View view)
    {
        a.c(b, view);
    }

    public void a(CharSequence charsequence)
    {
        a.c(b, charsequence);
    }

    public void a(boolean flag)
    {
        a.c(b, flag);
    }

    public boolean a(b b1)
    {
        return a.a(b, android.support.v4.view.a.b.a(b1));
    }

    public int b()
    {
        return a.b(b);
    }

    public void b(Rect rect)
    {
        a.c(b, rect);
    }

    public void b(View view)
    {
        a.a(b, view);
    }

    public void b(CharSequence charsequence)
    {
        a.a(b, charsequence);
    }

    public void b(boolean flag)
    {
        a.d(b, flag);
    }

    public void c(Rect rect)
    {
        a.b(b, rect);
    }

    public void c(View view)
    {
        a.b(b, view);
    }

    public void c(CharSequence charsequence)
    {
        a.b(b, charsequence);
    }

    public void c(boolean flag)
    {
        a.h(b, flag);
    }

    public boolean c()
    {
        return a.g(b);
    }

    public void d(Rect rect)
    {
        a.d(b, rect);
    }

    public void d(boolean flag)
    {
        a.i(b, flag);
    }

    public boolean d()
    {
        return a.h(b);
    }

    public void e(boolean flag)
    {
        a.g(b, flag);
    }

    public boolean e()
    {
        return a.k(b);
    }

    public boolean equals(Object obj)
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
        obj = (a)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((a) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((a) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public void f(boolean flag)
    {
        a.a(b, flag);
    }

    public boolean f()
    {
        return a.l(b);
    }

    public void g(boolean flag)
    {
        a.e(b, flag);
    }

    public boolean g()
    {
        return a.r(b);
    }

    public void h(boolean flag)
    {
        a.b(b, flag);
    }

    public boolean h()
    {
        return a.s(b);
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    public void i(boolean flag)
    {
        a.f(b, flag);
    }

    public boolean i()
    {
        return a.p(b);
    }

    public boolean j()
    {
        return a.i(b);
    }

    public boolean k()
    {
        return a.m(b);
    }

    public boolean l()
    {
        return a.j(b);
    }

    public boolean m()
    {
        return a.n(b);
    }

    public boolean n()
    {
        return a.o(b);
    }

    public CharSequence o()
    {
        return a.e(b);
    }

    public CharSequence p()
    {
        return a.c(b);
    }

    public CharSequence q()
    {
        return a.f(b);
    }

    public CharSequence r()
    {
        return a.d(b);
    }

    public void s()
    {
        a.q(b);
    }

    public String t()
    {
        return a.t(b);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInParent: ").append(rect).toString());
        c(rect);
        stringbuilder.append((new StringBuilder()).append("; boundsInScreen: ").append(rect).toString());
        stringbuilder.append("; packageName: ").append(o());
        stringbuilder.append("; className: ").append(p());
        stringbuilder.append("; text: ").append(q());
        stringbuilder.append("; contentDescription: ").append(r());
        stringbuilder.append("; viewId: ").append(t());
        stringbuilder.append("; checkable: ").append(c());
        stringbuilder.append("; checked: ").append(d());
        stringbuilder.append("; focusable: ").append(e());
        stringbuilder.append("; focused: ").append(f());
        stringbuilder.append("; selected: ").append(i());
        stringbuilder.append("; clickable: ").append(j());
        stringbuilder.append("; longClickable: ").append(k());
        stringbuilder.append("; enabled: ").append(l());
        stringbuilder.append("; password: ").append(m());
        stringbuilder.append((new StringBuilder()).append("; scrollable: ").append(n()).toString());
        stringbuilder.append("; [");
        int i1 = b();
        do
        {
            if (i1 == 0)
            {
                break;
            }
            int k1 = 1 << Integer.numberOfTrailingZeros(i1);
            int j1 = i1 & ~k1;
            stringbuilder.append(b(k1));
            i1 = j1;
            if (j1 != 0)
            {
                stringbuilder.append(", ");
                i1 = j1;
            }
        } while (true);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            a = new d();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new c();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new j();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            a = new i();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            a = new h();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new g();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new e();
        } else
        {
            a = new k();
        }
    }
}
