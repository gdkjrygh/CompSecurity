// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.Color;

final class cwz
{

    private static final int a = Color.argb(186, 28, 28, 28);

    static int a()
    {
        return a;
    }

    public static void a(Activity activity, cxb cxb)
    {
        activity.runOnUiThread(new Runnable(activity, cxb) {

            private Activity a;
            private cxb b;

            public final void run()
            {
                (new cxa(a, b)).execute(new Void[0]);
            }

            
            {
                a = activity;
                b = cxb;
                super();
            }
        });
    }

}
