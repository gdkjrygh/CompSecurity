// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, jv, kk, ol, 
//            pd, gj, jd, gm, 
//            ow, ji

public final class jg extends kg
{

    private final gj a;
    private byte c[];
    private final boolean d;
    private final ol e;

    public jg(gj gj1, boolean flag, ol ol1)
    {
        super(1, -1);
        if (gj1 == null)
        {
            throw new NullPointerException("code == null");
        } else
        {
            a = gj1;
            d = flag;
            e = ol1;
            return;
        }
    }

    public final jv a()
    {
        return jv.o;
    }

    public final void a(ji ji)
    {
    }

    protected final void a(kk kk1, int i)
    {
        try
        {
            c = a(kk1.a, null, null, false);
            a(c.length);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kk kk1)
        {
            throw pd.a(kk1, (new StringBuilder("...while placing debug info for ")).append(e.h_()).toString());
        }
    }

    final byte[] a(ji ji, String s, ow ow1, boolean flag)
    {
        Object obj = a;
        ((gj) (obj)).a();
        obj = ((gj) (obj)).e;
        Object obj1 = a;
        ((gj) (obj1)).a();
        obj1 = ((gj) (obj1)).f;
        gm gm1 = a.b();
        ji = new jd(((hd) (obj)), ((gv) (obj1)), ji, gm1.b(), gm1.a, d, e);
        if (ow1 == null)
        {
            return ji.a();
        } else
        {
            ji.c = s;
            ji.b = null;
            ji.a = ow1;
            ji.d = flag;
            return ji.a();
        }
    }

    protected final void a_(ji ji, ow ow1)
    {
        if (ow1.a())
        {
            ow1.a((new StringBuilder()).append(f()).append(" debug info").toString());
            a(ji, null, ow1, true);
        }
        ow1.a(c);
    }
}
