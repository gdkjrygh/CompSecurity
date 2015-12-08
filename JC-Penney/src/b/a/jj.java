// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, nt, jv, ku, 
//            oz, kk, ow, ji

public final class jj extends kg
{

    private final nt a;
    private byte c[];

    public jj(nt nt1)
    {
        super(1, -1);
        if (nt1 == null)
        {
            throw new NullPointerException("array == null");
        } else
        {
            a = nt1;
            c = null;
            return;
        }
    }

    protected final int a(kg kg1)
    {
        kg1 = (jj)kg1;
        return a.a(((jj) (kg1)).a);
    }

    public final jv a()
    {
        return jv.q;
    }

    public final void a(ji ji)
    {
        ku.a(ji, a);
    }

    protected final void a(kk kk1, int i)
    {
        oz oz1 = new oz();
        (new ku(kk1.a, oz1)).a(a, false);
        c = oz1.e();
        a(c.length);
    }

    protected final void a_(ji ji, ow ow1)
    {
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" encoded array").toString());
            (new ku(ji, ow1)).a(a, true);
            return;
        } else
        {
            ow1.a(c);
            return;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
