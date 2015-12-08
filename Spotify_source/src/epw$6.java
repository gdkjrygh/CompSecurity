// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends fyi
{

    private Runnable a;

    public final boolean c()
    {
        a.run();
        return true;
    }

    (Runnable runnable)
    {
        a = runnable;
        super();
    }
}
