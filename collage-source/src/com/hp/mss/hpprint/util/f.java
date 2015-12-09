// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hp.mss.hpprint.util;

import android.app.Activity;
import android.content.Intent;
import android.print.PrintManager;
import com.hp.mss.hpprint.a.a;
import com.hp.mss.hpprint.activity.PrintPreview;
import com.hp.mss.hpprint.model.PrintJobData;

// Referenced classes of package com.hp.mss.hpprint.util:
//            a

public class f
{

    protected static a a;
    public static boolean b;
    public static boolean c = true;
    private static PrintJobData d;

    public f()
    {
    }

    public static PrintJobData a()
    {
        return d;
    }

    public static void a(Activity activity)
    {
        a = null;
        com.hp.mss.hpprint.util.a.a(activity, com.hp.mss.hpprint.util.a.a.a);
    /* block-local class not found */
    class a {}

        if (a(activity, com/hp/mss/hpprint/util/f$a))
        {
            a = (a)activity;
        }
        if (d == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 21 || d.f())
        {
            if (c)
            {
                c(activity);
                return;
            } else
            {
                b(activity);
                return;
            }
        } else
        {
            d(activity);
            return;
        }
    }

    public static void a(PrintJobData printjobdata)
    {
        d = printjobdata;
    }

    private static boolean a(Activity activity, Class class1)
    {
        boolean flag1 = false;
        activity = activity.getClass().getInterfaces();
        int j = activity.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!activity[i].toString().equals(class1.toString()))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public static void b(Activity activity)
    {
        PrintManager printmanager = (PrintManager)activity.getSystemService("print");
        a a1 = new a(activity, d, false);
        activity.runOnUiThread(new PrintUtil._cls1(activity, printmanager.print(d.a(), a1, d.d())));
    }

    private static void c(Activity activity)
    {
        activity.runOnUiThread(new PrintUtil._cls3(activity, new _cls1(activity)));
    }

    private static void d(Activity activity)
    {
        Intent intent = new Intent(activity, com/hp/mss/hpprint/activity/PrintPreview);
        intent.setFlags(0x20000000);
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("has_metrics_listener", flag);
        activity.startActivityForResult(intent, 100);
        com.hp.mss.hpprint.util.a.a(activity, a.a.d);
    }


    /* member class not found */
    class _cls1 {}

}
