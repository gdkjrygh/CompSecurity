// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.IOException;

// Referenced classes of package com.mobvista.sdk.m.core:
//            n, o, m

public final class l
{

    public l()
    {
    }

    public final m a(Context context)
    {
        n n1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        Object obj;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        n1 = new n(this, (byte)0);
        obj = new Intent("com.google.android.gms.ads.identifier.service.START");
        ((Intent) (obj)).setPackage("com.google.android.gms");
        if (!context.bindService(((Intent) (obj)), n1, 1))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = new o(this, n1.a());
        obj = new m(this, ((o) (obj)).a(), ((o) (obj)).a(true));
        context.unbindService(n1);
        return ((m) (obj));
        Object obj1;
        obj1;
        throw obj1;
        obj1;
        context.unbindService(n1);
        throw obj1;
        throw new IOException("Google Play connection failed");
    }
}
