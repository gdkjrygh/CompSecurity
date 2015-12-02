// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.core;

import android.content.Context;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{

    private static d a;
    private Context b;
    private long c;
    private final long d = 0x5265c00L;
    private boolean e;
    private int f;
    private int g;

    private d()
    {
        b = SecurityApplication.a();
    }

    public static d a()
    {
        com/qihoo/security/appbox/core/d;
        JVM INSTR monitorenter ;
        d d1;
        if (a == null)
        {
            a = new d();
        }
        d1 = a;
        com/qihoo/security/appbox/core/d;
        JVM INSTR monitorexit ;
        return d1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(String s1)
    {
        if (s1 == null)
        {
            return;
        }
        try
        {
            s1 = new JSONObject(s1);
            e = s1.optBoolean("is_show_appbox_func", false);
            f = s1.optInt("red_dot_display_rule", 1);
            g = s1.optInt("mobivsta_red_dot_show", 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
    }

    private boolean a(int i)
    {
        boolean flag = false;
        if (SharedPref.b(b, "last_get_red_dot_show_rule_value", 0) == i)
        {
            flag = true;
        }
        return flag;
    }

    private void f()
    {
        long l = s.e(b, "m_b.dat");
        if (c != l)
        {
            e();
        }
    }

    public boolean b()
    {
        f();
        return e;
    }

    public int c()
    {
        f();
        return f;
    }

    public boolean d()
    {
        long l;
        System.currentTimeMillis();
        f();
        System.currentTimeMillis();
        l = SharedPref.b(b, "appbox_new_function_enable_last_time", 0L);
        if (f == 2 || f == 3) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (l == 0L)
        {
            return true;
        }
        if (f != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a(f)) goto _L1; else goto _L3
_L3:
        return true;
        if (f != 3 || g < 1 || g > 9998 || System.currentTimeMillis() - l < (long)g * 0x5265c00L) goto _L1; else goto _L4
_L4:
        return true;
    }

    public void e()
    {
        Object obj2;
        String s1;
        obj2 = null;
        s1 = null;
        Object obj;
        c = s.e(b, "m_b.dat");
        obj = s.b(b, "m_b.dat");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        Object obj1 = s.a(((InputStream) (obj)), NativeManager.a);
        obj = obj1;
        obj1 = obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj2 = new BufferedReader(new InputStreamReader(((InputStream) (obj))));
        obj1 = new StringBuffer();
_L5:
        s1 = ((BufferedReader) (obj2)).readLine();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        ((StringBuffer) (obj1)).append(s1);
          goto _L5
_L8:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        ((InputStream) (obj)).close();
_L7:
        return;
_L4:
        obj1 = ((StringBuffer) (obj1)).toString();
        this;
        JVM INSTR monitorenter ;
        a(((String) (obj1)));
        this;
        JVM INSTR monitorexit ;
        obj1 = obj;
_L2:
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        try
        {
            ((InputStream) (obj1)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        obj1;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = obj2;
        }
        finally { }
          goto _L8
_L10:
        if (obj2 != null)
        {
            try
            {
                ((BufferedReader) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2) { }
        }
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw obj1;
        obj;
        return;
        obj1;
        obj = null;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = null;
        if (true) goto _L10; else goto _L9
_L9:
        obj;
        obj = null;
        obj1 = s1;
          goto _L8
        obj1;
        obj1 = s1;
          goto _L8
        obj1;
        obj1 = s1;
          goto _L8
        obj1 = obj;
          goto _L2
    }
}
