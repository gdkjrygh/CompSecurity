// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//            b, ah

public final class android.support.v4.app.a extends android.support.v4.content.a
{
    public static interface a
    {

        public abstract void onRequestPermissionsResult(int i, String as[], int ai[]);
    }

    private static final class b extends b.a
    {

        private ah a;

        public final Parcelable a(View view, Matrix matrix, RectF rectf)
        {
            return a.a(view, matrix, rectf);
        }

        public final View a(Context context, Parcelable parcelable)
        {
            return ah.a(context, parcelable);
        }

        public b(ah ah1)
        {
            a = ah1;
        }
    }


    private static b.a a(ah ah)
    {
        b b1 = null;
        if (ah != null)
        {
            b1 = new b(ah);
        }
        return b1;
    }

    public static void a(Activity activity, ah ah)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            android.support.v4.app.b.a(activity, a(ah));
        }
    }

    public static void a(Activity activity, String as[], int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            if (activity instanceof c.a)
            {
                ((c.a)activity).validateRequestPermissionsRequestCode(i);
            }
            activity.requestPermissions(as, i);
        } else
        if (activity instanceof a)
        {
            (new Handler(Looper.getMainLooper())).post(new Runnable(as, activity, i) {

                final String a[];
                final Activity b;
                final int c;

                public final void run()
                {
                    int ai[] = new int[a.length];
                    PackageManager packagemanager = b.getPackageManager();
                    String s = b.getPackageName();
                    int k = a.length;
                    for (int j = 0; j < k; j++)
                    {
                        ai[j] = packagemanager.checkPermission(a[j], s);
                    }

                    ((a)b).onRequestPermissionsResult(c, a, ai);
                }

            
            {
                a = as;
                b = activity;
                c = i;
                super();
            }
            });
            return;
        }
    }

    public static void b(Activity activity, ah ah)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            android.support.v4.app.b.b(activity, a(ah));
        }
    }
}
