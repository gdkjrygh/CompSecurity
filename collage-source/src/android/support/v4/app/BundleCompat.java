// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//            BundleCompatJellybeanMR2, BundleCompatDonut

public class BundleCompat
{

    public BundleCompat()
    {
    }

    public static IBinder getBinder(Bundle bundle, String s)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return BundleCompatJellybeanMR2.getBinder(bundle, s);
        } else
        {
            return BundleCompatDonut.getBinder(bundle, s);
        }
    }

    public static void putBinder(Bundle bundle, String s, IBinder ibinder)
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            BundleCompatJellybeanMR2.putBinder(bundle, s, ibinder);
            return;
        } else
        {
            BundleCompatDonut.putBinder(bundle, s, ibinder);
            return;
        }
    }
}
