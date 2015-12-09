// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.support.v4.content.b;

// Referenced classes of package android.support.v4.app:
//            d, b

public class a extends b
{

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            d.a(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }

    public static void b(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            android.support.v4.app.b.a(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }
}
