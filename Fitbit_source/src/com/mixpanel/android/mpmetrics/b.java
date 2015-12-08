// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.AsyncTask;
import com.mixpanel.android.util.e;

class com.mixpanel.android.mpmetrics.b
{
    private static class a extends AsyncTask
    {

        private final b a;
        private final Activity b;
        private Bitmap c;
        private int d;

        protected transient Void a(Void avoid[])
        {
            if (c != null)
            {
                try
                {
                    e.a(c, 20);
                    (new Canvas(c)).drawColor(com.mixpanel.android.mpmetrics.b.a(), android.graphics.PorterDuff.Mode.SRC_ATOP);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    c = null;
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    c = null;
                    return null;
                }
            }
            return null;
        }

        protected void a(Void void1)
        {
            a.a(c, d);
        }

        protected Object doInBackground(Object aobj[])
        {
            return a((Void[])aobj);
        }

        protected void onPostExecute(Object obj)
        {
            a((Void)obj);
        }

        protected void onPreExecute()
        {
            c = com.mixpanel.android.util.a.a(b, 2, 2, true);
            d = com.mixpanel.android.util.a.a(c);
        }

        public a(Activity activity, b b1)
        {
            b = activity;
            a = b1;
            d = 0xff000000;
        }
    }

    public static interface b
    {

        public abstract void a(Bitmap bitmap, int i);
    }


    private static final int a = Color.argb(186, 28, 28, 28);
    private static final String b = "MixpanelAPI.BackgroundCapture";

    com.mixpanel.android.mpmetrics.b()
    {
    }

    static int a()
    {
        return a;
    }

    public static void a(Activity activity, b b1)
    {
        activity.runOnUiThread(new Runnable(activity, b1) {

            final Activity a;
            final b b;

            public void run()
            {
                (new a(a, b)).execute(new Void[0]);
            }

            
            {
                a = activity;
                b = b1;
                super();
            }
        });
    }

}
