// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import android.content.Context;

// Referenced classes of package com.adjust.sdk:
//            AdjustFactory, ILogger, Util, LogLevel, 
//            OnAttributionChangedListener

public class AdjustConfig
{

    Context a;
    String b;
    String c;
    String d;
    LogLevel e;
    String f;
    Boolean g;
    String h;
    OnAttributionChangedListener i;
    String j;
    long k;
    Boolean l;

    public AdjustConfig(Context context, String s, String s1)
    {
        boolean flag2 = true;
        super();
        ILogger ilogger = AdjustFactory.a();
        boolean flag;
        if (s.length() != 12)
        {
            ilogger.error("Malformed App Token '%s'", new Object[] {
                s
            });
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            flag = false;
        } else
        {
            ILogger ilogger1 = AdjustFactory.a();
            if (s1.equals("sandbox"))
            {
                ilogger1.Assert("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
                flag = true;
            } else
            if (s1.equals("production"))
            {
                ilogger1.Assert("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
                flag = true;
            } else
            {
                ilogger1.error("Unknown environment '%s'", new Object[] {
                    s1
                });
                flag = false;
            }
            if (!flag)
            {
                flag = false;
            } else
            {
                ILogger ilogger2 = AdjustFactory.a();
                boolean flag1;
                if (context == null)
                {
                    ilogger2.error("Missing context", new Object[0]);
                    flag1 = false;
                } else
                if (!Util.a(context, "android.permission.INTERNET"))
                {
                    ilogger2.error("Missing permission: INTERNET", new Object[0]);
                    flag1 = false;
                } else
                {
                    flag1 = true;
                }
                flag = flag2;
                if (!flag1)
                {
                    flag = false;
                }
            }
        }
        if (!flag)
        {
            return;
        } else
        {
            a = context.getApplicationContext();
            b = s;
            c = s1;
            e = LogLevel.c;
            g = Boolean.valueOf(false);
            return;
        }
    }

    public final boolean a()
    {
        return i != null;
    }
}
