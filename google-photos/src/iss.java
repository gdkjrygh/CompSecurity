// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iss
    implements Runnable
{

    private isr a;

    iss(isr isr1)
    {
        a = isr1;
        super();
    }

    public final void run()
    {
        a.c();
    }
}
