// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class asb extends arz
{

    asb(String s, int i)
    {
        super(s, 2, (byte)0);
    }

    protected final void a(Throwable throwable)
    {
        super.a(throwable);
        if (throwable != null)
        {
            throw new RuntimeException("Request threw uncaught throwable", throwable);
        } else
        {
            return;
        }
    }
}
