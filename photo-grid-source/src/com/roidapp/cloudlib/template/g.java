// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template;

import android.content.Context;
import android.content.SharedPreferences;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.template:
//            i, j, h

public final class g
    implements s
{

    private static volatile boolean a;
    private SharedPreferences b;
    private i c;
    private h d;
    private r e;

    public g(Context context)
    {
        b = context.getSharedPreferences("cloudlib_prefs", 0);
        context = new i(this, (byte)0);
        context.a = b.getInt("template_serverVer", 0);
        context.b = b.getInt("template_localVer", 0);
        c = context;
        if (c.b == 0)
        {
            c.b = j.k();
            if (c.a < c.b)
            {
                c.a = c.b;
            }
            a(b, c.a, c.b);
        }
    }

    private i a(String s1)
    {
        i k;
        if (s1 == null)
        {
            return null;
        }
        k = new i(this, (byte)0);
        k.a = (new JSONObject(s1)).optInt("version", 0);
        s1 = k;
_L2:
        return s1;
        s1;
        s1.printStackTrace();
        s1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a(Context context, int k)
    {
        if (context == null)
        {
            return false;
        } else
        {
            return a(context.getSharedPreferences("cloudlib_prefs", 0), 0x80000000, k);
        }
    }

    private static boolean a(SharedPreferences sharedpreferences, int k, int l)
    {
        if (sharedpreferences == null)
        {
            return false;
        }
        sharedpreferences = sharedpreferences.edit();
        if (k != 0x80000000)
        {
            sharedpreferences.putInt("template_serverVer", k);
        }
        if (l != 0x80000000)
        {
            sharedpreferences.putInt("template_localVer", l);
        }
        sharedpreferences.apply();
        return true;
    }

    public final i a()
    {
        return c;
    }

    public final void a(int k, Exception exception)
    {
        e = null;
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        e = null;
        obj = a(((String) (obj)));
        if (obj != null && ((i) (obj)).a != c.a && a(b, ((i) (obj)).a, 0x80000000))
        {
            if (b != null)
            {
                b.edit().putLong("templateTime", System.currentTimeMillis()).apply();
            }
            c.a = ((i) (obj)).a;
            if (d != null)
            {
                d.a(c);
            }
        }
    }

    public final boolean a(h h1)
    {
        while (a || b == null || System.currentTimeMillis() - b.getLong("templateTime", 0L) < 0x5265c00L) 
        {
            return false;
        }
        a = true;
        d = h1;
        if (e != null)
        {
            e.f();
        }
        e = new r("http://dl.pg.ksmobile.com/templates/version", this);
        t.a().execute(e);
        return true;
    }
}
