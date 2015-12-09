// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gr, gl, gi, pe, 
//            nj, nh, ol, op, 
//            ow

public final class il extends gr
{

    public static final gr b = new il();

    private il()
    {
    }

    public final int a()
    {
        return 3;
    }

    public final String a(gl gl1)
    {
        return (new StringBuilder()).append(b(gl1.f)).append(", ").append(f(gl1)).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        int j = ((gi)gl1).b();
        int i;
        if (((pe) (nj1)).K.length == 0)
        {
            i = 0;
        } else
        {
            i = nj1.b(0).e();
        }
        a(ow, a(gl1, nj1.b()), (short)j, (short)i);
    }

    public final String b(gl gl1, boolean flag)
    {
        if (flag)
        {
            return g(gl1);
        } else
        {
            return "";
        }
    }

    public final boolean b(gl gl1)
    {
        if (gl1 instanceof gi)
        {
            gl1 = (gi)gl1;
            int i = gl1.b();
            nr nr = ((gi) (gl1)).a;
            if (e(i) && ((nr instanceof ol) || (nr instanceof op)))
            {
                gl1 = gl1.f;
                Object aobj[] = ((pe) (gl1)).K;
                if (((pe) (gl1)).K.length == 0 || c(gl1) && e(gl1.b(0).e()) && c(gl1.b()))
                {
                    return true;
                }
            }
        }
        return false;
    }

}
