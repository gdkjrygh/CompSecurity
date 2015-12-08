// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.errorinfo;

import android.util.Log;
import com.arist.activity.MyApplication;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public b()
    {
        f = MyApplication.d.getPackageName();
    }

    public static String a(b b1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("errorTime", b1.a);
            jsonobject.put("errorInfo", b1.c);
            jsonobject.put("errorPhone", b1.d);
            jsonobject.put("errorType", b1.b);
            jsonobject.put("errorPath", b1.e);
            jsonobject.put("errorPackage", b1.f);
            b1 = jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            b1.printStackTrace();
            return "";
        }
        return b1;
    }

    public static b e(String s)
    {
        Log.i("shaolong", (new StringBuilder("dfffdfff")).append(s).toString());
        if (s != null && s.length() > 0) goto _L2; else goto _L1
_L1:
        b b1 = null;
_L4:
        return b1;
_L2:
        b b2 = new b();
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject(s);
            if (s.contains("errorTime"))
            {
                b2.a = jsonobject.getString("errorTime");
            }
            if (s.contains("errorInfo"))
            {
                b2.c = jsonobject.getString("errorInfo");
            }
            if (s.contains("errorPhone"))
            {
                b2.d = jsonobject.getString("errorPhone");
            }
            if (s.contains("errorType"))
            {
                b2.b = jsonobject.getString("errorType");
            }
            if (s.contains("errorPath"))
            {
                b2.e = jsonobject.getString("errorPath");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        b1 = b2;
        if (!s.contains("errorPackage")) goto _L4; else goto _L3
_L3:
        b2.f = jsonobject.getString("errorPackage");
        return b2;
    }

    public final String a()
    {
        return b;
    }

    public final void a(String s)
    {
        d = s;
    }

    public final String b()
    {
        return d;
    }

    public final void b(String s)
    {
        a = s;
    }

    public final String c()
    {
        return a;
    }

    public final void c(String s)
    {
        c = s;
    }

    public final String d()
    {
        return c;
    }

    public final void d(String s)
    {
        e = s;
    }

    public final String e()
    {
        return e;
    }
}
