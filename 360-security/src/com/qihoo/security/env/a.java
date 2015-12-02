// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.env;

import android.content.Context;
import android.content.res.AssetManager;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.io.DataInputStream;

public class a
{

    public static boolean a = true;
    public static String b = "fec53268a38f029357056d46098c9384";
    public static String c = "9bb820b73f0e914ebee7301c41e919e8";
    public static String d = "ue_rate";
    public static final String e[] = new String[0];
    public static String f = "com.qihoo.security.service.SYS_CLEAR";
    public static boolean g = false;
    public static int h = 0;
    public static long i = 0L;
    private static int j = -1;

    public static int a(Context context)
    {
        Object obj;
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        j = SharedPref.b(context, "g_cid", -1);
        if (j > 0)
        {
            return j;
        }
        context = context.getAssets();
        obj = null;
        context = new DataInputStream(context.open("cid.dat"));
        j = Integer.parseInt(context.readLine().trim());
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return j;
        context;
        context = null;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        context;
_L2:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw context;
        Exception exception1;
        exception1;
        obj = context;
        context = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Context context, int k)
    {
        j = k;
        SharedPref.a(context, "g_cid", k);
    }

    public static void a(Context context, String s)
    {
        SharedPref.a(context, "g_subcid", s);
    }

}
