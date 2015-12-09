// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jl, ob, ji, jp, 
//            ow, pm, pf, ms

public final class jk extends jl
    implements Comparable
{

    final ob a;

    public jk(ob ob1, int i)
    {
        super(i);
        if (ob1 == null)
        {
            throw new NullPointerException("field == null");
        } else
        {
            a = ob1;
            return;
        }
    }

    private int a(jk jk1)
    {
        return a.a(jk1.a);
    }

    public final int a(ji ji1, ow ow1, int i, int j)
    {
        int k = ji1.i.b(a);
        i = k - i;
        int l = super.b;
        if (ow1.a())
        {
            ow1.a(0, String.format("  [%x] %s", new Object[] {
                Integer.valueOf(j), a.h_()
            }));
            ow1.a(pm.a(i), (new StringBuilder("    field_idx:    ")).append(pf.a(k)).toString());
            ow1.a(pm.a(l), (new StringBuilder("    access_flags: ")).append(ms.a(l, 20703, 2)).toString());
        }
        ow1.e(i);
        ow1.e(l);
        return k;
    }

    public final void a(ji ji1)
    {
        ji1.i.a(a);
    }

    public final int compareTo(Object obj)
    {
        return a((jk)obj);
    }

    public final boolean equals(Object obj)
    {
        while (!(obj instanceof jk) || a((jk)obj) != 0) 
        {
            return false;
        }
        return true;
    }

    public final String h_()
    {
        return a.h_();
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(100);
        stringbuffer.append(getClass().getName());
        stringbuffer.append('{');
        stringbuffer.append(pf.b(super.b));
        stringbuffer.append(' ');
        stringbuffer.append(a);
        stringbuffer.append('}');
        return stringbuffer.toString();
    }
}
