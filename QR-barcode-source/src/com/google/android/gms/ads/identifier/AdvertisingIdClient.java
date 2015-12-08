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
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.s;
import java.io.IOException;

public final class AdvertisingIdClient
{
    public static final class Info
    {

        private final String ln;
        private final boolean lo;

        public String getId()
        {
            return ln;
        }

        public boolean isLimitAdTrackingEnabled()
        {
            return lo;
        }

        public String toString()
        {
            return (new StringBuilder()).append("{").append(ln).append("}").append(lo).toString();
        }

        public Info(String s1, boolean flag)
        {
            ln = s1;
            lo = flag;
        }
    }


    a lk;
    s ll;
    boolean lm;
    final Context mContext;

    public AdvertisingIdClient(Context context)
    {
        o.i(context);
        mContext = context;
        lm = false;
    }

    static s a(Context context, a a1)
        throws IOException
    {
        try
        {
            context = com.google.android.gms.internal.s.a.b(a1.fW());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IOException("Interrupted exception");
        }
        return context;
    }

    public static Info getAdvertisingIdInfo(Context context)
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        context = new AdvertisingIdClient(context);
        Info info;
        context.start();
        info = context.W();
        context.finish();
        return info;
        Exception exception;
        exception;
        context.finish();
        throw exception;
    }

    static a i(Context context)
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
            GooglePlayServicesUtil.D(context);
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

    public Info W()
        throws IOException
    {
        o.aU("Calling this from your main thread can lead to deadlock");
        o.i(lk);
        o.i(ll);
        if (!lm)
        {
            throw new IOException("AdvertisingIdService is not connected.");
        }
        Info info;
        try
        {
            info = new Info(ll.getId(), ll.a(true));
        }
        catch (RemoteException remoteexception)
        {
            Log.i("AdvertisingIdClient", "GMS remote exception ", remoteexception);
            throw new IOException("Remote exception");
        }
        return info;
    }

    public void finish()
    {
        o.aU("Calling this from your main thread can lead to deadlock");
        if (mContext == null || lk == null)
        {
            return;
        }
        try
        {
            if (lm)
            {
                mContext.unbindService(lk);
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", illegalargumentexception);
        }
        lm = false;
        ll = null;
        lk = null;
    }

    public void start()
        throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
    {
        o.aU("Calling this from your main thread can lead to deadlock");
        if (lm)
        {
            finish();
        }
        lk = i(mContext);
        ll = a(mContext, lk);
        lm = true;
    }
}
