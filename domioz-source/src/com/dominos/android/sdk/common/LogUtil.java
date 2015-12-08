// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.util.Log;
import com.dominos.android.sdk.app.DominosApplication;
import com.google.a.a.ao;
import java.util.Iterator;

// Referenced classes of package com.dominos.android.sdk.common:
//            StringHelper

public class LogUtil
{

    public LogUtil()
    {
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        splitLog(3, s, s1, aobj);
    }

    public static transient void e(String s, String s1, Exception exception, Object aobj[])
    {
        if (!DominosApplication.isDebuggable() || StringHelper.isEmpty(s) || StringHelper.isEmpty(s1))
        {
            return;
        }
        try
        {
            Log.e(s, String.format(s1, aobj), exception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            Log.e(s, s1);
        }
    }

    public static transient void e(String s, String s1, Object aobj[])
    {
        splitLog(6, s, s1, aobj);
    }

    public static transient void i(String s, String s1, Object aobj[])
    {
        splitLog(4, s, s1, aobj);
    }

    private static transient void splitLog(int j, String s, String s1, Object aobj[])
    {
        if (DominosApplication.isDebuggable() && !StringHelper.isEmpty(s) && !StringHelper.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            aobj = ao.a(170).a(String.format(s1, aobj)).iterator();
            while (((Iterator) (aobj)).hasNext()) 
            {
                Log.println(j, s, String.format("%s", new Object[] {
                    ((String)((Iterator) (aobj)).next()).replaceAll("\\s+", " ")
                }));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Log.println(j, s, s1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static transient void v(String s, String s1, Object aobj[])
    {
        splitLog(2, s, s1, aobj);
    }

    public static transient void w(String s, String s1, Object aobj[])
    {
        splitLog(5, s, s1, aobj);
    }

    public static transient void wtf(String s, String s1, Object aobj[])
    {
        if (!DominosApplication.isDebuggable() || StringHelper.isEmpty(s) || StringHelper.isEmpty(s1))
        {
            return;
        }
        try
        {
            Log.wtf(s, String.format(s1, aobj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Log.wtf(s, s1);
        }
    }
}
