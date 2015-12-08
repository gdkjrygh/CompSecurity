// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bmo
    implements mti
{

    private bmn a;

    bmo(bmn bmn1)
    {
        a = bmn1;
        super();
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!a.b.e().equals(s))
        {
            return;
        }
        s = a;
        boolean flag;
        if (!mue1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            s.b();
            return;
        } else
        {
            ((bmn) (s)).c.b.V = false;
            ((bmn) (s)).a.u();
            ((bmn) (s)).f.a(true);
            return;
        }
    }
}
