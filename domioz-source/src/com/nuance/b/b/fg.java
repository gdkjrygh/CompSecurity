// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;

// Referenced classes of package com.nuance.b.b:
//            fj, fh, fl, fi, 
//            fk

final class fg
{

    private String a;
    private String b;
    private String c;
    private final fi d;
    private final fj e;

    fg(Context context)
    {
        a = (new StringBuilder()).append(((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth()).append("x").append(((WindowManager)context.getSystemService("window")).getDefaultDisplay().getHeight()).toString();
        Object obj = (TelephonyManager)context.getSystemService("phone");
        String s;
        String s1;
        if (obj != null)
        {
            obj = ((TelephonyManager) (obj)).getNetworkOperatorName();
        } else
        {
            obj = "";
        }
        b = ((String) (obj));
        obj = Locale.getDefault();
        s = ((Locale) (obj)).getLanguage();
        s1 = ((Locale) (obj)).getCountry();
        obj = s;
        if (s1.length() > 0)
        {
            obj = (new StringBuilder()).append(s).append("-").append(s1).toString();
        }
        c = ((String) (obj));
        obj = Base64.decode("U3VwZXJTZWNyZXQ=", 0);
        e = new fj(new fh(context, ".nina.core.registry"), ((byte []) (obj)));
        new fl();
        d = new fi(context, e);
    }

    final String a()
    {
        return d.a;
    }

    final fk b()
    {
        return (fk)Enum.valueOf(com/nuance/b/b/fk, d.c.getString("install_type", fk.c.toString()));
    }

    final void c()
    {
        fi fi1 = d;
        android.content.SharedPreferences.Editor editor = fi1.c.edit();
        editor.remove("install_type");
        editor.commit();
        fi1.b.a("install_type", null);
        fi1.b.b();
    }
}
