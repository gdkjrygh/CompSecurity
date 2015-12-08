// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import android.util.Log;
import java.util.Locale;

public class VolleyLog
{

    public static boolean DEBUG = Log.isLoggable("Volley", 2);
    public static String TAG = "Volley";

    public VolleyLog()
    {
    }

    private static transient String a(String s, Object aobj[])
    {
        int i;
        String s1;
        if (aobj != null)
        {
            s = String.format(Locale.US, s, aobj);
        }
        aobj = (new Throwable()).fillInStackTrace().getStackTrace();
        i = 2;
_L3:
        if (i >= aobj.length)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (aobj[i].getClass().equals(com/mopub/volley/VolleyLog)) goto _L2; else goto _L1
_L1:
        s1 = ((StackTraceElement) (aobj[i])).getClassName();
        s1 = s1.substring(s1.lastIndexOf('.') + 1);
        s1 = s1.substring(s1.lastIndexOf('$') + 1);
        aobj = (new StringBuilder()).append(s1).append(".").append(((StackTraceElement) (aobj[i])).getMethodName()).toString();
_L4:
        return String.format(Locale.US, "[%d] %s: %s", new Object[] {
            Long.valueOf(Thread.currentThread().getId()), aobj, s
        });
_L2:
        i++;
          goto _L3
        aobj = "<unknown>";
          goto _L4
    }

    public static transient void d(String s, Object aobj[])
    {
        a(s, aobj);
    }

    public static transient void e(String s, Object aobj[])
    {
        Log.e(TAG, a(s, aobj));
    }

    public static transient void e(Throwable throwable, String s, Object aobj[])
    {
        Log.e(TAG, a(s, aobj), throwable);
    }

    public static void setTag(String s)
    {
        d("Changing log tag to %s", new Object[] {
            s
        });
        TAG = s;
        DEBUG = Log.isLoggable(s, 2);
    }

    public static transient void v(String s, Object aobj[])
    {
        if (DEBUG)
        {
            a(s, aobj);
        }
    }

    public static transient void wtf(String s, Object aobj[])
    {
        Log.wtf(TAG, a(s, aobj));
    }

    public static transient void wtf(Throwable throwable, String s, Object aobj[])
    {
        Log.wtf(TAG, a(s, aobj), throwable);
    }

}
