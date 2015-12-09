// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.appcert;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth.appcert:
//            IAppCertService

public final class AppCertServiceClient
{
    private static interface Call
    {

        public abstract Object exec(IAppCertService iappcertservice)
            throws RemoteException;
    }


    private static final ComponentName APP_CERT_MGMT_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.be.appcert.AppCertService");
    private final Context mContext;

    public AppCertServiceClient(Context context)
    {
        mContext = context.getApplicationContext();
    }

    private Object exec(Call call)
        throws IOException, GoogleAuthException
    {
        Intent intent;
        long l;
        intent = (new Intent()).setComponent(APP_CERT_MGMT_SERVICE_COMPONENT_NAME);
        l = Binder.clearCallingIdentity();
        BlockingServiceConnection blockingserviceconnection;
        boolean flag;
        blockingserviceconnection = new BlockingServiceConnection();
        flag = ConnectionTracker.getInstance().bindService(mContext, intent, blockingserviceconnection, 1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        call = ((Call) (call.exec(IAppCertService.Stub.asInterface(blockingserviceconnection.getService()))));
        ConnectionTracker.getInstance().unbindService(mContext, blockingserviceconnection);
        Binder.restoreCallingIdentity(l);
        return call;
        call;
        Log.w("AppCertServiceClient", (new StringBuilder("Interrupted when getting service: ")).append(call).toString());
        throw new GoogleAuthException("Interrupted");
        call;
        ConnectionTracker.getInstance().unbindService(mContext, blockingserviceconnection);
        throw call;
        call;
        Binder.restoreCallingIdentity(l);
        throw call;
        call;
        Log.w("AppCertServiceClient", "RemoteException when executing call!", call);
        throw new IOException("remote exception");
        throw new IOException("Could not bind to service with the given context.");
    }

    public final String getAppCert(final String packageNameToCertify)
        throws IOException, GoogleAuthException
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Preconditions.checkNotNull(packageNameToCertify, "Package name cannot be null!");
        Context context = mContext;
        try
        {
            GooglePlayServicesUtil.ensurePlayServicesAvailable(context);
        }
        // Misplaced declaration of an exception variable
        catch (final String packageNameToCertify)
        {
            throw new GoogleAuthException(packageNameToCertify);
        }
        // Misplaced declaration of an exception variable
        catch (final String packageNameToCertify)
        {
            throw new GoogleAuthException(packageNameToCertify);
        }
        return (String)exec(new Call() {

            final AppCertServiceClient this$0;
            final String val$packageNameToCertify;

            public final volatile Object exec(IAppCertService iappcertservice)
                throws RemoteException
            {
                return iappcertservice.getAppCert(packageNameToCertify);
            }

            
            {
                this$0 = AppCertServiceClient.this;
                packageNameToCertify = s;
                super();
            }
        });
    }

}
