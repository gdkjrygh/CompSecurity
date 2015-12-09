// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.support.v4.a.a;

// Referenced classes of package android.support.v4.app:
//            n

public class m extends a
{

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            android.support.v4.app.n.a(activity);
            return;
        } else
        {
            activity.finish();
            return;
        }
    }
}
