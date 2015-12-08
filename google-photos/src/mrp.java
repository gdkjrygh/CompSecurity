// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mrp
    implements Runnable
{

    boolean a;
    private mro b;

    mrp(mro mro1)
    {
        b = mro1;
        super();
        a = false;
    }

    public final void run()
    {
        a = true;
        b.a();
    }
}
