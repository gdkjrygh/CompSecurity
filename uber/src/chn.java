// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.network.AnalyticsApi;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

public final class chn
{

    static final Map a = new LinkedHashMap();
    static final Method b = null;
    private static boolean c = false;
    private chp d;

    private chn()
    {
    }

    chn(byte byte0)
    {
        this();
    }

    public static chn a()
    {
        return cho.a();
    }

    public static void a(cht cht, chu chu, chv chv, AnalyticsApi analyticsapi, cik cik, hoi hoi)
    {
        a().d = new chp(analyticsapi, cht, chu, chv, new gju(), hoi, cik);
        d();
    }

    public static boolean c()
    {
        return c;
    }

    private static void d()
    {
        try
        {
            Class.forName("rz");
            c = true;
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return;
        }
    }

    public final chp b()
    {
        if (d == null)
        {
            throw new RuntimeException("Analytics singleton not initialized.");
        } else
        {
            return d;
        }
    }

}
