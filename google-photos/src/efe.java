// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class efe
    implements Runnable
{

    private efd a;

    efe(efd efd1)
    {
        a = efd1;
        super();
    }

    public final void run()
    {
        if (efd.a(a) != null && !efd.b(a))
        {
            efd.a(a, noy.a());
            lzv lzv1 = efd.a(a).a(efd.c(a));
            efd.a(a, true);
            lzv1.a(efd.d(a));
        }
    }
}
