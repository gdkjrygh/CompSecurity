// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

public final class mwi
    implements nyf
{

    public static final onh a = new onh("debug.plus.debug_rpc_config");
    final nyf b;
    private final Context c;

    public final String a()
    {
        return b.a();
    }

    public final String a(String s)
    {
        if (!"plusi".equals(s)) goto _L2; else goto _L1
_L1:
        String s1 = PreferenceManager.getDefaultSharedPreferences(c).getString("debug.plus.frontend.config", null);
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L3
_L3:
        return s1;
_L2:
        String s2;
        if (!"plusdatamixer".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = PreferenceManager.getDefaultSharedPreferences(c).getString("debug.plus.datamixer.config", null);
        s1 = s2;
        if (!TextUtils.isEmpty(s2)) goto _L3; else goto _L4
_L4:
        return b.a(s);
    }

    public final String b()
    {
        return b.b();
    }

    public final boolean c()
    {
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(c);
        if (sharedpreferences.contains("debug.plus.frontend.tracing"))
        {
            return sharedpreferences.getBoolean("debug.plus.frontend.tracing", false);
        } else
        {
            return b.c();
        }
    }

    public final String d()
    {
        String s = PreferenceManager.getDefaultSharedPreferences(c).getString("tracing_token_key", null);
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return b.d();
        }
    }

    public final String e()
    {
        String s1 = PreferenceManager.getDefaultSharedPreferences(c).getString("tracing_pattern_key", null);
        String s = s1;
        if (s1 != null)
        {
            s = s1.trim();
        }
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return b.e();
        }
    }

    public final String f()
    {
        String s = PreferenceManager.getDefaultSharedPreferences(c).getString("experiment_override_key", null);
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return b.f();
        }
    }

}
