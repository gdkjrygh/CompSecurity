// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amf
    implements Runnable
{

    private ayq a;
    private ame b;

    amf(ame ame1, ayq ayq1)
    {
        b = ame1;
        a = ayq1;
        super();
    }

    public final void run()
    {
        if (!a.isCancelled())
        {
            b.a(a);
        }
    }
}
