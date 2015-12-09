// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            ab

class ad
{

    private static final String a = com/threatmetrix/TrustDefenderMobile/ad.getName();

    ad()
    {
    }

    static String a(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("ThreatMetrixMobileSDK", 0);
        String s = sharedpreferences.getString("ThreatMetrixMobileSDK", null);
        context = s;
        if (s == null)
        {
            context = a;
            context = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("ThreatMetrixMobileSDK", context);
            editor.commit();
        }
        return context;
    }

    private static String a(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (s.length() != 32)
            {
                if (s.length() < 32)
                {
                    s = (new StringBuilder()).append(s).append(ab.b(s).substring(0, 32 - s.length())).toString();
                } else
                {
                    s = ab.b(s);
                }
                return s;
            }
        }
        return s1;
    }

    static String a(String s, String s1, String s2, boolean flag)
    {
        String s3;
        if (Build.SERIAL == null)
        {
            s3 = "";
        } else
        {
            s3 = Build.SERIAL;
        }
        if (s2 != null && !s2.isEmpty() && !s2.equals("000000000000000"))
        {
            s = (new StringBuilder()).append(s3).append(s2).toString();
        } else
        if (s != null)
        {
            s = (new StringBuilder()).append(s3).append(s).toString();
        } else
        {
            s = (new StringBuilder()).append(s3).append(s1).toString();
        }
        s1 = s;
        if (flag)
        {
            s1 = ab.b(s);
        }
        return a(ab.b(s1));
    }

    static String a(String s, boolean flag)
    {
        String s1 = s;
        if (flag)
        {
            s1 = ab.b(s);
        }
        s = a;
        (new StringBuilder("using generated ID for LSC:")).append(s1);
        return a(s1);
    }

    static boolean a()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            String s = Build.SERIAL;
            flag = flag1;
            if (s == null)
            {
                break label0;
            }
            if (!s.equals("unknown"))
            {
                flag = flag1;
                if (!s.equals("1234567890ABCDEF"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    static String b(Context context)
    {
label0:
        {
            String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (s != null && !s.equals("9774d56d682e549c"))
            {
                context = s;
                if (s.length() >= 15)
                {
                    break label0;
                }
            }
            context = a;
            context = null;
        }
        return context;
    }

    static String b(String s, boolean flag)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (flag)
            {
                s1 = ab.b(s);
            }
            s = a;
            (new StringBuilder("using ANDROID_ID for TPC:")).append(s1);
        }
        return a(s1);
    }

    static String c(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
            String s = a;
            (new StringBuilder("imei: ")).append(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = a;
            return "";
        }
        return context;
    }

}
