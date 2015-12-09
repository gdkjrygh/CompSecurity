// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class gfr
    implements dmx
{

    private final gcq a;
    private final gcz b;

    public gfr(gcq gcq1, gcz gcz1)
    {
        a = gcq1;
        b = gcz1;
    }

    private String b()
    {
        String s;
        try
        {
            s = b.f();
        }
        catch (Exception exception)
        {
            return (new StringBuilder("Error getting installation ID, ")).append(exception.getMessage()).toString();
        }
        return s;
    }

    public final void a()
    {
        if (gmm.a())
        {
            akk.d().a.b(b());
            a.a();
        }
    }

    static 
    {
        TimeUnit.SECONDS.toMillis(5L);
    }
}
