// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bgx
    implements Runnable
{

    private int a;
    private bgv b;

    bgx(bgv bgv1, int i)
    {
        b = bgv1;
        a = i;
        super();
    }

    public final void run()
    {
        if (bgv.b(b) != null && a == 4 && bgv.c(b) != -1L)
        {
            bgv.b(b).a(bgv.c(b));
            bgv.a(b, -1L);
        }
    }
}
