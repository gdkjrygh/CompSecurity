// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kyc
    implements Runnable
{

    private kyb a;

    kyc(kyb kyb1)
    {
        a = kyb1;
        super();
    }

    public final void run()
    {
        kyb.a(a);
    }
}
