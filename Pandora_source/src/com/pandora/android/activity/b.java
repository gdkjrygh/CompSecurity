// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.app.Activity;
import android.net.Uri;
import com.pandora.android.Main;
import com.pandora.android.util.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            WelcomeActivity, SignUpActivity, ForgotPasswordActivity, AndroidLinkActivity, 
//            PandoraLinkInterceptorActivity, PandoraLinkStatusActivity, ErrorStateActivity, InterstitialAdActivity, 
//            InterstitialAnnouncementActivity, AlarmRingerActivity, c

public class b
{

    private static volatile b b;
    private static List c = new ArrayList();
    private static final String d[] = {
        com/pandora/android/Main.toString(), com/pandora/android/activity/WelcomeActivity.toString(), com/pandora/android/activity/SignUpActivity.toString(), com/pandora/android/activity/ForgotPasswordActivity.toString(), com/pandora/android/activity/AndroidLinkActivity.toString(), com/pandora/android/activity/PandoraLinkInterceptorActivity.toString(), com/pandora/android/activity/PandoraLinkStatusActivity.toString(), com/pandora/android/activity/ErrorStateActivity.toString(), com/pandora/android/activity/InterstitialAdActivity.toString(), com/pandora/android/activity/InterstitialAnnouncementActivity.toString(), 
        com/pandora/android/activity/AlarmRingerActivity.toString()
    };
    private static String e[] = new String[0];
    private static String f[] = {
        com/pandora/android/activity/ForgotPasswordActivity.toString(), com/pandora/android/activity/SignUpActivity.toString(), com/pandora/android/activity/WelcomeActivity.toString()
    };
    private int a;

    private b()
    {
        a = 0;
    }

    public static b a()
    {
        if (b == null)
        {
            b = new b();
        }
        return b;
    }

    public static boolean a(Activity activity, Uri uri)
    {
        if (d != null)
        {
            String s1 = activity.getClass().toString();
            String as[] = d;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                if (s1.equals(as[i]))
                {
                    return true;
                }
            }

        }
        if (s.l())
        {
            p.df.a.c(activity.getClass().getSimpleName(), "App is 'dead', launching main activity");
            com.pandora.android.activity.c.a().a(activity, com/pandora/android/Main, 0, uri, null, -1, null);
            activity.finish();
            return false;
        } else
        {
            return true;
        }
    }

    public static void c(Activity activity)
    {
        if (activity != null)
        {
            String s1 = activity.getClass().toString();
            if (s1.equals(com/pandora/android/Main.toString()))
            {
                activity.overridePendingTransition(0x10a0000, 0x10a0001);
            } else
            {
                String as[] = e;
                int k = as.length;
                for (int i = 0; i < k; i++)
                {
                    if (s1.equals(as[i]))
                    {
                        activity.overridePendingTransition(0x7f050009, 0x7f050014);
                        return;
                    }
                }

                as = f;
                k = as.length;
                int j = 0;
                while (j < k) 
                {
                    if (s1.equals(as[j]))
                    {
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    j++;
                }
            }
        }
    }

    public void a(Activity activity)
    {
        c.add(activity);
    }

    public boolean b()
    {
        if (c.size() > 0)
        {
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Activity activity = (Activity)iterator.next();
                if (!activity.isFinishing())
                {
                    activity.finish();
                }
            } while (true);
            c.clear();
        }
        int i = a;
        a = i + 1;
        return i == 0;
    }

    public boolean b(Activity activity)
    {
        return c.contains(activity);
    }

    public boolean c()
    {
        int i = a - 1;
        a = i;
        return i == 0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public int d()
    {
        return a;
    }

}
