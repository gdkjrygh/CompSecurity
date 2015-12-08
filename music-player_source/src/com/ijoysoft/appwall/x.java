// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class x
{

    private static Properties a;

    public static String a()
    {
        return a.getProperty("BASE_URL");
    }

    public static void a(Context context)
    {
        Properties properties = new Properties();
        try
        {
            context = context.getAssets().open("pop.properties");
            properties.load(context);
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        a = properties;
    }

    public static String b()
    {
        return a.getProperty("SECOND_BASE_URL");
    }

    public static String c()
    {
        return a.getProperty("LIST_FILE_NAME");
    }

    public static String d()
    {
        return a.getProperty("SECOND_LIST_FILE_NAME");
    }
}
