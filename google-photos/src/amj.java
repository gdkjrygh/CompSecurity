// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amj
    implements Runnable
{

    private azh a;
    private amh b;

    amj(amh amh1, azh azh)
    {
        b = amh1;
        a = azh;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
