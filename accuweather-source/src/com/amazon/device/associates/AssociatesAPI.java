// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Set;

// Referenced classes of package com.amazon.device.associates:
//            NotInitializedException, an, m, ba, 
//            p, ShoppingService, LinkService

public class AssociatesAPI
{
    public static class Config
    {

        private final String a;
        private final Context b;
        private Set c;

        String a()
        {
            return a;
        }

        Context b()
        {
            return b;
        }

        Set c()
        {
            return c;
        }

        public void setPrefetchProducts(Set set)
        {
            an.a(set, "productIds");
            c = set;
        }

        public Config(String s, Context context)
        {
            c = null;
            an.a(s, "appKey");
            an.a(context, "appContext");
            a = s;
            b = context;
        }
    }


    static ShoppingService a;
    static LinkService b;
    private static final String c = com/amazon/device/associates/AssociatesAPI.getSimpleName();

    private AssociatesAPI()
    {
    }

    private static void a()
        throws NotInitializedException
    {
        if (a == null || b == null)
        {
            throw new NotInitializedException();
        } else
        {
            return;
        }
    }

    public static LinkService getLinkService()
        throws NotInitializedException
    {
        a();
        return b;
    }

    public static ShoppingService getShoppingService()
        throws NotInitializedException
    {
        a();
        return a;
    }

    public static void initialize(Config config)
    {
        Context context;
        boolean flag1;
        flag1 = false;
        an.a(config, "config");
        context = config.b().getApplicationContext();
        ApplicationInfo applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        boolean flag = flag1;
        if (applicationinfo != null)
        {
            flag = flag1;
            try
            {
                if (applicationinfo.metaData != null)
                {
                    flag = applicationinfo.metaData.getBoolean("com.amazon.device.associates.ENABLE_TESTING", false);
                }
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                flag = flag1;
            }
        }
        if (a == null)
        {
            a = new m(context, flag);
        }
        if (b == null)
        {
            b = new ba(context, config.a(), config.c());
        }
        p.c(c, "Mobile Associates API initialization complete. SDK Version 1.0.45.0");
        return;
    }

}
