// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appattach.tracking;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class appAttachTracking
{

    public static String ACTIVATED = "Activated";
    public static String BUY_NOW = "BuyNow";
    public static String INSTALLED = "Installed";
    public static String LAUNCHED = "Launched";
    public static String PURCHASED = "Purchased";
    public static String VERSION = "2.0.4";
    static Context ctx = null;
    private static boolean debug = false;
    static String referrer = null;
    static String utm_campaign = "";
    static String utm_content = "";
    static String utm_medium = "";
    static String utm_source = "";
    static String utm_term = "";

    public appAttachTracking()
    {
    }

    public static void event(String s)
    {
        if (ctx != null)
        {
            if (debug)
            {
                Log.d("appAttachTracking", (new StringBuilder("event: ")).append(s).toString());
            }
            try
            {
                Intent intent = new Intent("com.android.googleanalytics.EVENT");
                intent.putExtra("package", ctx.getPackageName());
                intent.putExtra("category", s);
                if (referrer != null)
                {
                    intent.putExtra("referrer", referrer);
                }
                ctx.sendBroadcast(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            if (debug)
            {
                Log.d("appAttachTracking", (new StringBuilder("event: ")).append(s).toString());
                return;
            }
        }
    }

    public static String getAppAttachID()
    {
        return utm_term;
    }

    public static String getAppName()
    {
        return utm_content;
    }

    public static String getMake()
    {
        return utm_source;
    }

    public static String getModel()
    {
        return utm_medium;
    }

    public static String getReferrer()
    {
        return referrer;
    }

    public static String getVendorName()
    {
        return utm_campaign;
    }

    public static void init(Context context)
    {
        SharedPreferences sharedpreferences;
        ctx = context;
        sharedpreferences = ctx.getSharedPreferences("com.appattach.tracking", 0);
        debug = sharedpreferences.getBoolean("debug", debug);
        if (debug)
        {
            Log.d("appAttachTracking", "init");
        }
        context = context.openFileInput("appAttach.txt");
        referrer = (new BufferedReader(new InputStreamReader(context))).readLine();
        context.close();
        if (referrer != null)
        {
            referrer = referrer.replaceAll("&amp;", "&");
        }
        if (debug)
        {
            Log.d("appAttachTracking", (new StringBuilder("referrer:")).append(referrer).toString());
        }
        if (referrer == null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        context = referrer.split("&");
        int i = 0;
_L2:
        if (i >= context.length)
        {
            return;
        }
        if (context[i].startsWith("utm_source="))
        {
            utm_source = context[i].substring(11);
        }
        if (context[i].startsWith("utm_medium="))
        {
            utm_medium = context[i].substring(11);
        }
        if (context[i].startsWith("utm_term="))
        {
            utm_term = context[i].substring(9);
        }
        if (context[i].startsWith("utm_campaign="))
        {
            utm_campaign = context[i].substring(13);
        }
        if (context[i].startsWith("utm_content="))
        {
            utm_content = context[i].substring(12);
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        context;
        if (!sharedpreferences.getBoolean("sendReferrer", false))
        {
            try
            {
                Intent intent = new Intent("com.android.googleanalytics.SEND_REFERRER");
                intent.putExtra("package", ctx.getPackageName());
                ctx.sendBroadcast(intent);
            }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("exception: ")).append(context).toString());
            }
            sharedpreferences.edit().putBoolean("sendReferrer", true).commit();
            return;
        }
        break MISSING_BLOCK_LABEL_355;
        context;
    }

    public static void onReceive(Context context, Intent intent)
    {
        intent = intent.getExtras().getString("referrer");
        if (intent != null)
        {
            try
            {
                FileOutputStream fileoutputstream = context.openFileOutput("appAttach.txt", 0);
                fileoutputstream.write(intent.getBytes());
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                Log.d("appAttachTracking", (new StringBuilder("onReceive() exception: ")).append(intent).toString());
            }
        }
        init(context);
        event(INSTALLED);
    }

    public static void setDebug(boolean flag)
    {
        debug = flag;
    }

}
