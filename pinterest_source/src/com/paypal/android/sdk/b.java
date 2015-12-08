// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.UUID;

// Referenced classes of package com.paypal.android.sdk:
//            d, i

public class b
{

    private static final String a = com/paypal/android/sdk/b.getSimpleName();
    private Context b;
    private String c;
    private final i d;

    public b(Context context, String s)
    {
        if (context == null)
        {
            throw new NullPointerException("context == null");
        } else
        {
            b = context;
            c = s;
            context = com.paypal.android.sdk.d.a(e());
            s = c();
            d = new i((new StringBuilder()).append(context).append(s).toString());
            return;
        }
    }

    public final String a(String s)
    {
        return d.b(b.getSharedPreferences(c, 0).getString(s, null));
    }

    public final void a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences(c, 0).edit();
        editor.putString(s, d.a(s1));
        editor.commit();
    }

    public final boolean a()
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)b.getSystemService("connectivity");
        if (connectivitymanager == null)
        {
            Log.w("paypal.sdk", "Unable to retrieve Context.CONNECTIVITY_SERVICE. Ignoring.");
            return true;
        }
        if (connectivitymanager.getAllNetworkInfo() == null)
        {
            Log.w("paypal.sdk", "ConnectivityManager.getAllNetworkInfo() returned null. Ignoring.");
            return true;
        }
        NetworkInfo anetworkinfo[] = connectivitymanager.getAllNetworkInfo();
        int i1 = anetworkinfo.length;
        int j = 0;
        int k;
        int l;
        for (k = 0; j < i1; k = l)
        {
            l = k;
            if (anetworkinfo[j].isConnectedOrConnecting())
            {
                l = k + 1;
            }
            j++;
        }

        return k > 0;
    }

    public final int b()
    {
        return ((TelephonyManager)b.getSystemService("phone")).getPhoneType();
    }

    public final String b(String s)
    {
        return d.a(s);
    }

    public final String c()
    {
        Object obj;
        try
        {
            obj = b.getPackageManager();
            obj = ((PackageManager) (obj)).getPackageInfo(b.getPackageName(), 0).applicationInfo.loadLabel(((PackageManager) (obj))).toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        return ((String) (obj));
    }

    public final String c(String s)
    {
        return d.b(s);
    }

    public final String d()
    {
        String s;
        try
        {
            s = ((TelephonyManager)b.getSystemService("phone")).getSimOperatorName();
        }
        catch (SecurityException securityexception)
        {
            securityexception.toString();
            return null;
        }
        return s;
    }

    public final String e()
    {
        String s = b.getSharedPreferences(c, 0).getString("InstallationGUID", null);
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = UUID.randomUUID().toString();
            android.content.SharedPreferences.Editor editor = b.getSharedPreferences(c, 0).edit();
            editor.putString("InstallationGUID", s1);
            editor.commit();
            return s1;
        }
    }

    public final Context f()
    {
        return b;
    }

}
