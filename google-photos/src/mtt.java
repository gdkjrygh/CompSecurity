// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mtt
    implements Runnable
{

    private mts a;

    mtt(mts mts1)
    {
        a = mts1;
        super();
    }

    public final void run()
    {
        if (!mts.a(a).a())
        {
            mts.a(a).a(mts.b(a), null);
        }
    }
}
