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
import com.google.android.gms.internal.hm;
import java.lang.reflect.Method;

public class ProviderInstaller
{
    public static interface ProviderInstallListener
    {

        public abstract void onProviderInstallFailed(int i, Intent intent);

        public abstract void onProviderInstalled();
    }


    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static Method aea = null;
    private static final Object qp = new Object();

    public ProviderInstaller()
    {
    }

    private static void L(Context context)
        throws ClassNotFoundException, NoSuchMethodException
    {
        aea = context.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[] {
            android/content/Context
        });
    }

    public static void installIfNeeded(Context context)
        throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
    {
        Context context1;
        hm.b(context, "Context must not be null");
        GooglePlayServicesUtil.z(context);
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
        synchronized (qp)
        {
            if (aea == null)
            {
                L(context1);
            }
            aea.invoke(null, new Object[] {
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
        hm.b(context, "Context must not be null");
        hm.b(providerinstalllistener, "Listener must not be null");
        hm.ay("Must be called on the UI thread");
        (new AsyncTask(context, providerinstalllistener) {

            final ProviderInstallListener aeb;
            final Context qu;

            protected transient Integer b(Void avoid[])
            {
                try
                {
                    ProviderInstaller.installIfNeeded(qu);
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

            protected void d(Integer integer)
            {
                if (integer.intValue() == 0)
                {
                    aeb.onProviderInstalled();
                    return;
                } else
                {
                    Intent intent = GooglePlayServicesUtil.Z(integer.intValue());
                    aeb.onProviderInstallFailed(integer.intValue(), intent);
                    return;
                }
            }

            protected Object doInBackground(Object aobj[])
            {
                return b((Void[])aobj);
            }

            protected void onPostExecute(Object obj)
            {
                d((Integer)obj);
            }

            
            {
                qu = context;
                aeb = providerinstalllistener;
                super();
            }
        }).execute(new Void[0]);
    }

}
