// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mxb
    implements Runnable
{

    private mxa a;

    mxb(mxa mxa1)
    {
        a = mxa1;
        super();
    }

    public final void run()
    {
        a.a.run();
        mwx.a(a.b, a);
    }
}
