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
import com.google.android.gms.internal.hm;
import com.google.android.gms.internal.s;
import java.io.IOException;

public final class AdvertisingIdClient
{
    public static final class Info
    {

        private final boolean kA;
        private final String kz;

        public String getId()
        {
            return kz;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return kA;
        }

        public Info(String s1, boolean flag)
        {
            kz = s1;
            kA = flag;
        }
    }


    public AdvertisingIdClient()
    {
    }

    static Info a(Context context, a a1)
        throws IOException
    {
        Object obj;
        obj = com.google.android.gms.internal.s.a.b(a1.ew());
        obj = new Info(((s) (obj)).getId(), ((s) (obj)).a(true));
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

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        hm.az("Calling this from your main thread can lead to deadlock");
        return a(context, j(context));
    }

    static a j(Context context)
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
            GooglePlayServicesUtil.z(context);
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
}
