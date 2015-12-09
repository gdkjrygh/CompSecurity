// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class elm
    implements Runnable
{

    private final eli._cls1 a;
    private final elb b;

    private elm(eli._cls1 _pcls1, elb elb)
    {
        a = _pcls1;
        b = elb;
    }

    public static Runnable a(eli._cls1 _pcls1, elb elb)
    {
        return new elm(_pcls1, elb);
    }

    public final void run()
    {
        eli._cls1.a(a, b);
    }
}
