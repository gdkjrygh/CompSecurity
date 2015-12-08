// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.Locale;
import java.util.UUID;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class TDID
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TDID);

    TDID()
    {
    }

    static String a(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("ThreatMetrixMobileSDK", 0);
        String s = sharedpreferences.getString("ThreatMetrixMobileSDK", null);
        context = s;
        if (s == null)
        {
            Log.d(a, "Found nothing in shared prefs, generating GUID");
            context = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
            android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString("ThreatMetrixMobileSDK", context);
            editor.commit();
        }
        return context;
    }

    static String a(Context context, String s, String s1, String s2, boolean flag)
    {
        s = a(s, s1, s2);
        context = s;
        if (flag)
        {
            context = StringUtils.b(s);
        }
        return a(StringUtils.b(context));
    }

    static String a(String s)
    {
        String s1;
        if (s == null || s.length() == 0)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (s.length() != 32)
            {
                if (s.length() < 32)
                {
                    String s2 = StringUtils.b(s);
                    if (s2 == null)
                    {
                        return null;
                    }
                    int j = 32 - s.length();
                    int i = j;
                    if (j > s2.length())
                    {
                        i = s2.length();
                    }
                    s = (new StringBuilder()).append(s).append(s2.substring(0, i)).toString();
                } else
                {
                    s = StringUtils.b(s);
                }
                return s;
            }
        }
        return s1;
    }

    private static String a(String s, String s1, String s2)
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
            return (new StringBuilder()).append(s3).append(s2).toString();
        }
        if (s != null)
        {
            return (new StringBuilder()).append(s3).append(s).toString();
        } else
        {
            return (new StringBuilder()).append(s3).append(s1).toString();
        }
    }

    static String a(String s, boolean flag)
    {
        String s1 = s;
        if (flag)
        {
            s1 = StringUtils.b(s);
        }
        Log.d(a, (new StringBuilder()).append("using generated ID for LSC:").append(s1).toString());
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
            Log.d(a, "ANDROID_ID contains nothing useful");
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
                s1 = StringUtils.b(s);
            }
            Log.d(a, (new StringBuilder()).append("using ANDROID_ID for TPC:").append(s1).toString());
        }
        return a(s1);
    }

    static String c(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
            Log.d(a, (new StringBuilder()).append("imei: ").append(context).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.d(a, "imei failed", context);
            return "";
        }
        return context;
    }

}
