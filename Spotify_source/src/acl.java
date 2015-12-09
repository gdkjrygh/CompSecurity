// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.adjust.sdk.ActivityPackage;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public final class acl
{

    private static act a = null;
    private static long b = -1L;
    private static long c = -1L;
    private static long d = -1L;
    private static long e = -1L;

    public static acs a(acr acr, ActivityPackage activitypackage, boolean flag)
    {
        return new aco(acr, activitypackage, flag);
    }

    public static act a()
    {
        if (a == null)
        {
            a = new acw();
        }
        return a;
    }

    public static acu a(ace ace, Context context, boolean flag)
    {
        return new acy(ace, context, flag);
    }

    public static acv a(acu acu)
    {
        return new adb(acu);
    }

    public static HttpsURLConnection a(URL url)
    {
        return (HttpsURLConnection)url.openConnection();
    }

    public static long b()
    {
        if (b == -1L)
        {
            return 60000L;
        } else
        {
            return b;
        }
    }

    public static long c()
    {
        if (c == -1L)
        {
            return 0L;
        } else
        {
            return c;
        }
    }

    public static long d()
    {
        if (d == -1L)
        {
            return 0x1b7740L;
        } else
        {
            return d;
        }
    }

    public static long e()
    {
        if (e == -1L)
        {
            return 1000L;
        } else
        {
            return e;
        }
    }

}
