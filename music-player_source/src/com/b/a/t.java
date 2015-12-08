// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import b.a.ff;
import b.a.fg;
import b.a.fj;
import java.io.File;

// Referenced classes of package com.b.a:
//            u

public final class t
{

    private static t a = null;
    private static Context b;
    private static String c;
    private static long e = 0x48190800L;
    private static long f = 0x200000L;
    private u d;

    private t(Context context)
    {
        d = new u(context);
        b = context.getApplicationContext();
        c = context.getPackageName();
    }

    public static t a(Context context)
    {
        com/b/a/t;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new t(context);
        }
        context = a;
        com/b/a/t;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void a(int l)
    {
        if (l >= 0 && l <= 3)
        {
            SharedPreferences sharedpreferences = j();
            if (sharedpreferences != null)
            {
                sharedpreferences.edit().putInt("oc_dc", l).commit();
            }
        }
    }

    public static void a(byte abyte0[])
    {
        String s = k();
        try
        {
            fj.a(new File(b.getFilesDir(), s), abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            fg.b("MobclickAgent", abyte0.getMessage());
        }
    }

    public static String[] a()
    {
        Object obj = null;
        SharedPreferences sharedpreferences = b.getSharedPreferences((new StringBuilder("mobclick_agent_user_")).append(c).toString(), 0);
        String s = sharedpreferences.getString("au_p", null);
        String s1 = sharedpreferences.getString("au_u", null);
        String as[] = obj;
        if (s != null)
        {
            as = obj;
            if (s1 != null)
            {
                as = new String[2];
                as[0] = s;
                as[1] = s1;
            }
        }
        return as;
    }

    public static void b(int l)
    {
        if (l > 0)
        {
            SharedPreferences sharedpreferences = j();
            if (sharedpreferences != null)
            {
                sharedpreferences.edit().putInt("oc_lt", l).commit();
            }
        }
    }

    public static int[] b()
    {
        SharedPreferences sharedpreferences = j();
        int ai[] = new int[2];
        if (sharedpreferences.getInt("umeng_net_report_policy", -1) != -1)
        {
            ai[0] = sharedpreferences.getInt("umeng_net_report_policy", 1);
            ai[1] = (int)sharedpreferences.getLong("umeng_net_report_interval", 0L);
            return ai;
        } else
        {
            ai[0] = sharedpreferences.getInt("umeng_local_report_policy", 1);
            ai[1] = (int)sharedpreferences.getLong("umeng_local_report_interval", 0L);
            return ai;
        }
    }

    public static int c()
    {
        int l = 0;
        SharedPreferences sharedpreferences = j();
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getInt("oc_dc", 0);
        }
        return l;
    }

    public static void c(int l)
    {
        SharedPreferences sharedpreferences = j();
        if (sharedpreferences != null)
        {
            sharedpreferences.edit().putInt("oc_ec", l).commit();
        }
    }

    public static int d()
    {
        int l = 0;
        SharedPreferences sharedpreferences = j();
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getInt("oc_lt", 0);
        }
        return l;
    }

    public static int e()
    {
        int l = -1;
        SharedPreferences sharedpreferences = j();
        if (sharedpreferences != null)
        {
            l = sharedpreferences.getInt("oc_ec", -1);
        }
        return l;
    }

    public static byte[] f()
    {
        Object obj;
        Object obj1;
        obj = k();
        obj1 = new File(b.getFilesDir(), ((String) (obj)));
        long l = ((File) (obj1)).length();
        boolean flag;
        if (((File) (obj1)).exists() && l > f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        ((File) (obj1)).delete();
_L4:
        return null;
_L2:
        if (!((File) (obj1)).exists()) goto _L4; else goto _L3
_L3:
        obj1 = b.openFileInput(((String) (obj)));
        obj = obj1;
        byte abyte0[] = fj.b(((java.io.InputStream) (obj1)));
        fj.c(((java.io.InputStream) (obj1)));
        return abyte0;
        Object obj2;
        obj2;
        obj1 = null;
_L8:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        fj.c(((java.io.InputStream) (obj1)));
        return null;
        obj;
        java.io.InputStream inputstream;
        inputstream = null;
        obj1 = obj;
_L6:
        fj.c(inputstream);
        throw obj1;
        obj1;
        inputstream = ((java.io.InputStream) (obj));
        if (true) goto _L6; else goto _L5
_L5:
        inputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void g()
    {
        b.deleteFile((new StringBuilder("mobclick_agent_header_")).append(c).toString());
        b.deleteFile(k());
    }

    private static SharedPreferences j()
    {
        return b.getSharedPreferences((new StringBuilder("mobclick_agent_online_setting_")).append(c).toString(), 0);
    }

    private static String k()
    {
        return (new StringBuilder("mobclick_agent_cached_")).append(c).append(ff.a(b)).toString();
    }

    public final void b(byte abyte0[])
    {
        d.a(abyte0);
    }

    public final boolean h()
    {
        return d.a();
    }

    public final u i()
    {
        return d;
    }

}
