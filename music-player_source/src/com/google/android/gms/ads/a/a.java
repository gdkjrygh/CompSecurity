// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.e;
import com.google.android.gms.common.g;
import com.google.android.gms.common.i;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.lh;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.ads.a:
//            b

public final class a
{

    public static b a(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
        } else
        {
            return a(context, b(context));
        }
    }

    private static b a(Context context, i j)
    {
        Object obj;
        obj = lh.a(j.a());
        obj = new b(((lg) (obj)).a(), ((lg) (obj)).a(true));
        try
        {
            context.unbindService(j);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", context);
            return ((b) (obj));
        }
        return ((b) (obj));
        Object obj1;
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
        obj1;
        try
        {
            context.unbindService(j);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", context);
        }
        throw obj1;
        obj1;
        throw new IOException("Interrupted exception");
    }

    private static i b(Context context)
    {
        i j;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e(9);
        }
        try
        {
            g.b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        j = new i();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, j, 1))
        {
            return j;
        } else
        {
            throw new IOException("Connection failure");
        }
    }
}
