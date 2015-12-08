// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.a.j;
import com.jcp.activities.MainActivity;
import com.jcp.fragments.ez;
import com.jcp.fragments.rewards.RewardsBonusPointsPromoFragment;
import com.jcp.storepickup.pojo.Stores;

// Referenced classes of package com.jcp.util:
//            aa, ae, aq, ar

public class ap
{

    private static final String a = com/jcp/util/ap.getSimpleName();
    private static final ez b[] = {
        new RewardsBonusPointsPromoFragment()
    };
    private MainActivity c;

    public ap(MainActivity mainactivity)
    {
        c = mainactivity;
    }

    static MainActivity a(ap ap1)
    {
        return ap1.c;
    }

    public static Stores a(Context context)
    {
        context = b(context);
        if (!TextUtils.isEmpty(context))
        {
            return (Stores)aa.a(context, com/jcp/storepickup/pojo/Stores);
        } else
        {
            return null;
        }
    }

    public static void a(Activity activity)
    {
        if (activity != null)
        {
            g(activity).edit().putBoolean("bopus.geo.permission.first", true).commit();
        }
    }

    public static void a(boolean flag, Activity activity)
    {
        if (activity != null)
        {
            g(activity).edit().putBoolean("bopus.geo.permission", flag).commit();
        }
    }

    public static boolean a(Context context, Stores stores, boolean flag)
    {
        if (context == null || stores == null || !flag && c(context))
        {
            return false;
        } else
        {
            a(context, flag);
            return g(context).edit().putString("com.jcp.shopdata", (new j()).a(stores)).commit();
        }
    }

    public static boolean a(Context context, String s)
    {
        if (context != null)
        {
            return g(context).edit().putString("com.jcp.shopdata.zipcode", s).commit();
        } else
        {
            return false;
        }
    }

    private static boolean a(Context context, boolean flag)
    {
        if (context != null)
        {
            return g(context).edit().putBoolean("com.jcp.shopdata.lockmode", flag).commit();
        } else
        {
            return false;
        }
    }

    public static String b(Context context)
    {
        String s = null;
        if (context != null)
        {
            s = g(context).getString("com.jcp.shopdata", null);
        }
        return s;
    }

    public static ez c()
    {
        ez aez[] = b;
        int k = aez.length;
        for (int i = 0; i < k; i++)
        {
            ez ez1 = aez[i];
            if (ez1.U())
            {
                return ez1;
            }
        }

        return null;
    }

    public static boolean c(Context context)
    {
        boolean flag = false;
        if (context != null)
        {
            flag = g(context).getBoolean("com.jcp.shopdata.lockmode", false);
        }
        return flag;
    }

    public static String d(Context context)
    {
        String s = null;
        if (context != null)
        {
            s = g(context).getString("com.jcp.shopdata.zipcode", null);
        }
        return s;
    }

    public static boolean e(Context context)
    {
        boolean flag = false;
        if (context != null)
        {
            flag = g(context).getBoolean("bopus.geo.permission", false);
        }
        return flag;
    }

    public static boolean f(Context context)
    {
        boolean flag = false;
        if (context != null)
        {
            flag = g(context).getBoolean("bopus.geo.permission.first", false);
        }
        return flag;
    }

    private static SharedPreferences g(Context context)
    {
        return context.getSharedPreferences("com.jcp.activities", 0);
    }

    public int a()
    {
        char c1;
        int i;
        c1 = '\u0190';
        i = c.getResources().getDisplayMetrics().densityDpi;
        break MISSING_BLOCK_LABEL_18;
        if ((i <= 120 || i > 160) && (i <= 160 || i > 240))
        {
            if (i > 240 && i <= 320)
            {
                c1 = '\u01F4';
            } else
            if (i > 320 && i <= 480)
            {
                c1 = '\u02EE';
            } else
            if (i > 480 && i <= 640)
            {
                c1 = '\u0384';
            } else
            {
                c1 = '\0';
            }
        }
        if (c1 == 0)
        {
            ae.a(a, (new StringBuilder()).append("Device has unsupported screen density of ").append(i).append(" dpi").toString());
        }
        return c1;
    }

    public void b()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        builder.setMessage(0x7f0701c7);
        builder.create();
        builder.setPositiveButton("Yes", new aq(this));
        builder.setNegativeButton("No", new ar(this));
        builder.show();
    }

}
