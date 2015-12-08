// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            b, c, ct, d

public final class a extends android.support.v4.content.a
{

    private static d a(ct ct)
    {
        b b1 = null;
        if (ct != null)
        {
            b1 = new b(ct);
        }
        return b1;
    }

    public static void a(Activity activity, Intent intent, int i, Bundle bundle)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            activity.startActivityForResult(intent, i, bundle);
            return;
        } else
        {
            activity.startActivityForResult(intent, i);
            return;
        }
    }

    public static void a(Activity activity, ct ct)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            c.a(activity, a(ct));
        }
    }

    public static void b(Activity activity, ct ct)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            c.b(activity, a(ct));
        }
    }
}
