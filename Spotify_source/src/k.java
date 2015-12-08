// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public final class k extends ct
{

    public static void a(Activity activity, String as[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            if (activity instanceof n)
            {
                ((n)activity).b_();
            }
            activity.requestPermissions(as, 49374);
        } else
        if (activity instanceof l)
        {
            (new Handler(Looper.getMainLooper())).post(new _cls1(as, activity));
            return;
        }
    }

    public static boolean a(Activity activity, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return activity.shouldShowRequestPermissionRationale(s);
        } else
        {
            return false;
        }
    }

    /* member class not found */
    class _cls1 {}

}
