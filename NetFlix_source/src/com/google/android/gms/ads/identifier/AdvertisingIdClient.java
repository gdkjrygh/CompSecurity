// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.t;
import java.io.IOException;

public final class AdvertisingIdClient
{
    public static final class Info
    {

        private final String kw;
        private final boolean kx;

        public String getId()
        {
            return kw;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return kx;
        }

        public Info(String s, boolean flag)
        {
            kw = s;
            kx = flag;
        }
    }


    public AdvertisingIdClient()
    {
    }

    static Info a(Context context, a a1)
        throws IOException
    {
        Object obj;
        obj = com.google.android.gms.internal.t.a.b(a1.dV());
        obj = new Info(((t) (obj)).getId(), ((t) (obj)).a(true));
        try
        {
            context.unbindService(a1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("AdvertisingIdClient", "getAdvertisingIdInfo unbindService failed.", context);
            return ((Info) (obj));
        }
        return ((Info) (obj));
        Object obj1;
        obj1;
        Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
        throw new IOException("Remote exception");
        obj1;
        try
        {
            context.unbindService(a1);
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

    static a g(Context context)
        throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        a a1;
        Intent intent;
        try
        {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesNotAvailableException(9);
        }
        try
        {
            GooglePlayServicesUtil.s(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException(context);
        }
        a1 = new a();
        intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, a1, 1))
        {
            return a1;
        } else
        {
            throw new IOException("Connection failure");
        }
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        fq.ak("Calling this from your main thread can lead to deadlock");
        return a(context, g(context));
    }
}
