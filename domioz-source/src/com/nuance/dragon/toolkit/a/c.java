// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.nuance.a.a.a.a.b.b;
import com.nuance.a.a.a.a.d.a.g;
import com.nuance.a.a.a.b.d;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.f;
import java.util.List;

final class c
{

    private final String a;
    private final String b;
    private final byte c[];
    private final String d;
    private final short e;
    private final Context f;
    private final String g;
    private final e h;
    private final e i;
    private final List j;

    public c(Context context, String s, String s1, int i1, String s2, byte abyte0[], String s3, 
            e e1, e e2, List list)
    {
        f = context;
        if (s == null || s.length() <= 0)
        {
            s = a(context);
        }
        a = s;
        d = s1;
        e = (short)i1;
        b = s2;
        c = abyte0;
        if (s3 == null || s3.length() <= 0)
        {
            s = com.nuance.a.a.a.b.d.a(context).a();
            context = s;
            if (s != null)
            {
                context = s;
                if (s.length() == 0)
                {
                    context = null;
                }
            }
            s3 = context;
        }
        g = s3;
        h = e1;
        i = e2;
        j = list;
    }

    private static b a(e e1)
    {
        if (e1.m == f.a)
        {
            if (e1.l == 8000)
            {
                return b.S;
            }
            if (e1.l == 16000)
            {
                return b.U;
            }
        } else
        if (e1.m == f.b)
        {
            if (e1.l == 8000)
            {
                return b.N;
            }
            if (e1.l == 16000)
            {
                return b.O;
            }
        } else
        if (e1.m == f.c)
        {
            if (e1.l == 8000)
            {
                return b.Q;
            }
            if (e1.l == 16000)
            {
                return b.R;
            }
        }
        return null;
    }

    private static String a(Context context)
    {
        try
        {
            Object obj = context.getPackageManager();
            String s = context.getPackageName();
            context = (String)((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(s, 0));
            obj = ((PackageManager) (obj)).getPackageInfo(s, 0).versionName;
            context = (new StringBuilder()).append(context).append(" ").append(((String) (obj))).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "unknown";
        }
        return context;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final byte[] c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final short e()
    {
        return e;
    }

    public final String f()
    {
        String s;
label0:
        {
            String s1 = ((TelephonyManager)f.getSystemService("phone")).getNetworkOperatorName();
            if (s1 != null)
            {
                s = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s = "carrier";
        }
        return s;
    }

    public final String g()
    {
        Object obj = ((ConnectivityManager)f.getSystemService("connectivity")).getActiveNetworkInfo();
        if (obj != null)
        {
            obj = ((NetworkInfo) (obj)).getTypeName();
            if (obj != null && ((String) (obj)).length() > 0)
            {
                return ((String) (obj));
            }
        }
        return "unknown";
    }

    public final String h()
    {
        if (g == null)
        {
            return "unknown";
        } else
        {
            return g;
        }
    }

    public final List i()
    {
        return j;
    }

    public final b j()
    {
        return a(h);
    }

    public final b k()
    {
        return a(i);
    }

    public final e l()
    {
        return i;
    }
}
