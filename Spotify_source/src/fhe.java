// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fhe
    implements Runnable
{

    private fhd a;

    private fhe(fhd fhd1)
    {
        a = fhd1;
        super();
    }

    fhe(fhd fhd1, byte byte0)
    {
        this(fhd1);
    }

    public final void run()
    {
        if (a.i != null && a.e.b() && epd.a(a.i.c.l(), 2, a.i.c.w()))
        {
            a.e.c();
        }
    }
}
