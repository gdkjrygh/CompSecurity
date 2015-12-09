// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzv;
import java.lang.reflect.Method;

public class ProviderInstaller
{
    public static interface ProviderInstallListener
    {

        public abstract void onProviderInstallFailed(int i, Intent intent);

        public abstract void onProviderInstalled();
    }


    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static Method zzaBA = null;
    private static final Object zznu = new Object();

    public ProviderInstaller()
    {
    }

    public static void installIfNeeded(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        Context context1;
        zzv.zzb(context, "Context must not be null");
        GooglePlayServicesUtil.zzM(context);
        context1 = GooglePlayServicesUtil.getRemoteContext(context);
        if (context1 == null)
        {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new GooglePlayServicesNotAvailableException(8);
        }
        if (true) goto _L2; else goto _L1
_L1:
        context;
        JVM INSTR monitorenter ;
_L2:
        synchronized (zznu)
        {
            if (zzaBA == null)
            {
                zzam(context1);
            }
            zzaBA.invoke(null, new Object[] {
                context1
            });
        }
        return;
        Exception exception;
        exception;
        Log.e("ProviderInstaller", (new StringBuilder()).append("Failed to install provider: ").append(exception.getMessage()).toString());
        throw new GooglePlayServicesNotAvailableException(8);
        exception1;
        context;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerinstalllistener)
    {
        zzv.zzb(context, "Context must not be null");
        zzv.zzb(providerinstalllistener, "Listener must not be null");
        zzv.zzbI("Must be called on the UI thread");
        (new AsyncTask(context, providerinstalllistener) {

            final Context a;
            final ProviderInstallListener b;

            protected transient Integer a(Void avoid[])
            {
                try
                {
                    ProviderInstaller.installIfNeeded(a);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    return Integer.valueOf(avoid.getConnectionStatusCode());
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    return Integer.valueOf(((GooglePlayServicesNotAvailableException) (avoid)).errorCode);
                }
                return Integer.valueOf(0);
            }

            protected void a(Integer integer)
            {
                if (integer.intValue() == 0)
                {
                    b.onProviderInstalled();
                    return;
                } else
                {
                    Intent intent = GooglePlayServicesUtil.zzar(integer.intValue());
                    b.onProviderInstallFailed(integer.intValue(), intent);
                    return;
                }
            }

            protected Object doInBackground(Object aobj[])
            {
                return a((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                a((Integer)obj);
            }

            
            {
                a = context;
                b = providerinstalllistener;
                super();
            }
        }).execute(new Void[0]);
    }

    private static void zzam(Context context)
        throws ClassNotFoundException, NoSuchMethodException
    {
        zzaBA = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] {
            android/content/Context
        });
    }

}
