// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.app.Activity;

// Referenced classes of package com.fitbit.ui:
//            q

public class r
{

    public r()
    {
    }

    public static void a(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            final Activity a;

            public void run()
            {
                if (a instanceof q)
                {
                    ((q)a).f();
                    return;
                } else
                {
                    a.setProgressBarIndeterminateVisibility(true);
                    return;
                }
            }

            
            {
                a = activity;
                super();
            }
        });
    }

    public static void b(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            final Activity a;

            public void run()
            {
                if (a instanceof q)
                {
                    ((q)a).g();
                    return;
                } else
                {
                    a.setProgressBarIndeterminateVisibility(false);
                    return;
                }
            }

            
            {
                a = activity;
                super();
            }
        });
    }
}
