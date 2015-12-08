// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.app.SharedElementCallback;

// Referenced classes of package android.support.v4.app:
//            e, d

final class c
{

    private static SharedElementCallback a(d d)
    {
        e e1 = null;
        if (d != null)
        {
            e1 = new e(d);
        }
        return e1;
    }

    public static void a(Activity activity, d d)
    {
        activity.setEnterSharedElementCallback(a(d));
    }

    public static void b(Activity activity, d d)
    {
        activity.setExitSharedElementCallback(a(d));
    }
}
