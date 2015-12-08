// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

// Referenced classes of package android.support.v4.app:
//            ActivityCompatJB, ActivityCompat21

public class ActivityCompat extends ContextCompat
{

    public static void finishAffinity(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            ActivityCompatJB.finishAffinity(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    public static void finishAfterTransition(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            ActivityCompat21.finishAfterTransition(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }
}
