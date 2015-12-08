// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jt, jv, ji, km, 
//            kc, ow, oo, pf

public final class kn extends jt
    implements Comparable
{

    private final oo a;
    private km b;

    public kn(oo oo1)
    {
        if (oo1 == null)
        {
            throw new NullPointerException("value == null");
        } else
        {
            a = oo1;
            b = null;
            return;
        }
    }

    public final jv a()
    {
        return jv.b;
    }

    public final void a(ji ji1)
    {
        if (b == null)
        {
            ji1 = ji1.e;
            b = new km(a);
            ji1.a(b);
        }
    }

    public final void a(ji ji1, ow ow1)
    {
        int i = b.d();
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(e()).append(' ').append(a.g()).toString());
            ow1.a(4, (new StringBuilder("  string_data_off: ")).append(pf.a(i)).toString());
        }
        ow1.d(i);
    }

    public final oo c()
    {
        return a;
    }

    public final int compareTo(Object obj)
    {
        obj = (kn)obj;
        return a.a(((kn) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof kn))
        {
            return false;
        } else
        {
            obj = (kn)obj;
            return a.equals(((kn) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final int i_()
    {
        return 4;
    }
}
