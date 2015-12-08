// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jqi
    implements Runnable
{

    private jqh a;

    jqi(jqh jqh1)
    {
        a = jqh1;
        super();
    }

    public final void run()
    {
label0:
        {
            if (a.d.stopSelfResult(a.a))
            {
                if (!kbe.a)
                {
                    break label0;
                }
                a.c.b("Device AnalyticsService processed last dispatch request");
            }
            return;
        }
        a.c.b("Local AnalyticsService processed last dispatch request");
    }
}
