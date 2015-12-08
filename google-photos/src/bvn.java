// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvn
    implements Runnable
{

    private boolean a;
    private bvm b;

    bvn(bvm bvm1, boolean flag)
    {
        b = bvm1;
        a = flag;
        super();
    }

    public final void run()
    {
        if (bvm.c(b))
        {
            bvp bvp1 = bvm.e(b);
            bvm.d(b);
            bvp1.c();
            return;
        }
        if (a)
        {
            bvm.e(b).a();
            return;
        } else
        {
            bvm.e(b).b();
            return;
        }
    }
}
