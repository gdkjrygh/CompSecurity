// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cmid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cleanmaster.sdk.cmloginsdkjar.Settings;
import com.roidapp.baselib.c.aj;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cmid:
//            c, b

public final class a
{

    static SharedPreferences a;
    private static a b = new a();
    private b c;
    private c d;

    public a()
    {
        c = null;
        d = null;
    }

    public static a a(Context context)
    {
        a = context.getApplicationContext().getSharedPreferences("com.photoGrid.LOGIN_DATABASE", 0);
        return b;
    }

    private void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s))
        {
            a.edit().putString("com.photoGrid.KEY_LOGIN_SID_INIT", s).apply();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private static String e()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("regist_sid", Settings.getRegistSid());
            jsonobject.put("regist_sid_sig", Settings.getRegistSidSig());
            jsonobject.put("third_sid", Settings.getThirdSid());
            jsonobject.put("third_sid_sig", Settings.getThirdSidSig());
            jsonobject.put("login_sid", Settings.getLoginSid());
            jsonobject.put("login_sid_sig", Settings.getLoginSidSig());
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        return jsonobject.toString();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        Settings.sdkInitialize(aj.a());
        a(((Context) (aj.a())));
        String s = e();
        a(((Context) (aj.a()))).c(s);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        a.edit().putLong("com.photoGrid.REFRESH_TIME", l).apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s))
        {
            a.edit().putString("com.photoGrid.LOGIN_DATA", s).apply();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final c b()
    {
        this;
        JVM INSTR monitorenter ;
        c c1;
        if (d == null)
        {
            String s = a.getString("com.photoGrid.KEY_LOGIN_SID_INIT", "");
            if (!TextUtils.isEmpty(s))
            {
                d = new c(this, s);
            }
        }
        c1 = d;
        this;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!TextUtils.isEmpty(s))
        {
            a.edit().putString("com.photoGrid.LOGIN_USER_INFO", s).apply();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final b c()
    {
        this;
        JVM INSTR monitorenter ;
        b b1;
        if (c == null)
        {
            String s = a.getString("com.photoGrid.LOGIN_USER_INFO", "");
            if (!TextUtils.isEmpty(s))
            {
                c = new b(this, s);
            }
        }
        b1 = c;
        this;
        JVM INSTR monitorexit ;
        return b1;
        Exception exception;
        exception;
        throw exception;
    }

    public final long d()
    {
        this;
        JVM INSTR monitorenter ;
        long l = a.getLong("com.photoGrid.REFRESH_TIME", 0L);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

}
