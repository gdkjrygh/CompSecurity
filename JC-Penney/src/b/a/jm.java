// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jl, jb, ol, ji, 
//            kb, kg, ow, pm, 
//            pf, ms, kc, gj, 
//            ov

public final class jm extends jl
    implements Comparable
{

    private final ol a;
    private final jb c;

    public jm(ol ol1, int i, gj gj, ov ov)
    {
        super(i);
        if (ol1 == null)
        {
            throw new NullPointerException("method == null");
        }
        a = ol1;
        if (gj == null)
        {
            c = null;
            return;
        }
        boolean flag;
        if ((i & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = new jb(ol1, gj, flag, ov);
    }

    private int a(jm jm1)
    {
        return a.a(jm1.a);
    }

    public final int a(ji ji1, ow ow1, int i, int j)
    {
        int l = ji1.j.b(a);
        int i1 = l - i;
        int j1 = super.b;
        int k1 = kg.b(c);
        int k;
        if (k1 != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if ((j1 & 0x500) == 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (i != k)
        {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (ow1.a())
        {
            ow1.a(0, String.format("  [%x] %s", new Object[] {
                Integer.valueOf(j), a.h_()
            }));
            ow1.a(pm.a(i1), (new StringBuilder("    method_idx:   ")).append(pf.a(l)).toString());
            ow1.a(pm.a(j1), (new StringBuilder("    access_flags: ")).append(ms.a(j1, 0x31dff, 3)).toString());
            ow1.a(pm.a(k1), (new StringBuilder("    code_off:     ")).append(pf.a(k1)).toString());
        }
        ow1.e(i1);
        ow1.e(j1);
        ow1.e(k1);
        return l;
    }

    public final void a(ji ji1)
    {
        kb kb1 = ji1.j;
        ji1 = ji1.b;
        kb1.a(a);
        if (c != null)
        {
            ji1.a(c);
        }
    }

    public final int compareTo(Object obj)
    {
        return a((jm)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof jm) || a((jm)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final String h_()
    {
        return a.h_();
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append('{');
        stringbuffer.append(pf.b(super.b));
        stringbuffer.append(' ');
        stringbuffer.append(a);
        if (c != null)
        {
            stringbuffer.append(' ');
            stringbuffer.append(c);
        }
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
