// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.auth.IAuthManagerService;
import com.google.android.gms.auth.firstparty.shared.Status;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.UserRecoverableException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.auth:
//            GooglePlayServicesAvailabilityException, GoogleAuthException, UserRecoverableAuthException, TokenData

public final class GoogleAuthUtil
{
    private static interface ConnectionExecutor
    {

        public abstract Object exec(IBinder ibinder)
            throws RemoteException, IOException, GoogleAuthException;
    }


    private static final ComponentName GET_TOKEN_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    public static final String KEY_ANDROID_PACKAGE_NAME = "androidPackageName";
    public static final String KEY_CALLER_UID = "callerUid";
    private static final ComponentName RECOVERY_MGMT_SERVICE_COMPONENT_NAME = new ComponentName("com.google.android.gms", "com.google.android.gms.recovery.RecoveryService");

    public static void clearToken(Context context, String s)
        throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context);
        Bundle bundle = new Bundle();
        String s1 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", s1);
        if (!bundle.containsKey(KEY_ANDROID_PACKAGE_NAME))
        {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, s1);
        }
        s = new ConnectionExecutor(s, bundle) {

            final Bundle val$extras;
            final String val$token;

            public final volatile Object exec(IBinder ibinder)
                throws RemoteException, IOException, GoogleAuthException
            {
                ibinder = (Bundle)GoogleAuthUtil.access$000(com.google.android.auth.IAuthManagerService.Stub.asInterface(ibinder).clearToken(token, extras));
                String s2 = ibinder.getString("Error");
                if (!ibinder.getBoolean("booleanResult"))
                {
                    throw new GoogleAuthException(s2);
                } else
                {
                    return null;
                }
            }

            
            {
                token = s;
                extras = bundle;
                super();
            }
        };
        connectAndExecute(context, GET_TOKEN_SERVICE_COMPONENT_NAME, s);
    }

    private static Object connectAndExecute(Context context, ComponentName componentname, ConnectionExecutor connectionexecutor)
        throws IOException, GoogleAuthException
    {
        BlockingServiceConnection blockingserviceconnection;
        GmsClientSupervisor gmsclientsupervisor;
        blockingserviceconnection = new BlockingServiceConnection();
        gmsclientsupervisor = GmsClientSupervisor.getInstance(context);
        if (!gmsclientsupervisor.bindService(componentname, blockingserviceconnection, "GoogleAuthUtil")) goto _L2; else goto _L1
_L1:
        context = ((Context) (connectionexecutor.exec(blockingserviceconnection.getService())));
        gmsclientsupervisor.unbindService(componentname, blockingserviceconnection, "GoogleAuthUtil");
        return context;
        context;
_L4:
        Log.i("GoogleAuthUtil", "Error on service connection.", context);
        throw new IOException("Error on service connection.", context);
        context;
        gmsclientsupervisor.unbindService(componentname, blockingserviceconnection, "GoogleAuthUtil");
        throw context;
_L2:
        throw new IOException("Could not bind to service.");
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void ensurePlayServicesAvailable(Context context)
        throws GoogleAuthException
    {
        try
        {
            GooglePlayServicesUtil.ensurePlayServicesAvailable(context.getApplicationContext());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GooglePlayServicesAvailabilityException(((GooglePlayServicesRepairableException) (context)).mConnectionStatusCode, context.getMessage(), new Intent(((UserRecoverableException) (context)).mIntent));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new GoogleAuthException(context.getMessage());
        }
    }

    public static String getToken(Context context, Account account, String s)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, account, s, new Bundle());
    }

    private static String getToken(Context context, Account account, String s, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        ensurePlayServicesAvailable(context);
        String s1;
        if (bundle == null)
        {
            bundle = new Bundle();
        } else
        {
            bundle = new Bundle(bundle);
        }
        s1 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", s1);
        if (TextUtils.isEmpty(bundle.getString(KEY_ANDROID_PACKAGE_NAME)))
        {
            bundle.putString(KEY_ANDROID_PACKAGE_NAME, s1);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        account = new ConnectionExecutor(account, s, bundle) {

            final Account val$account;
            final Bundle val$options;
            final String val$scope;

            public final volatile Object exec(IBinder ibinder)
                throws RemoteException, IOException, GoogleAuthException
            {
                Object obj = (Bundle)GoogleAuthUtil.access$000(com.google.android.auth.IAuthManagerService.Stub.asInterface(ibinder).getTokenByAccount(account, scope, options));
                ibinder = TokenData.fromWrappedBundle(((Bundle) (obj)), "tokenDetails");
                if (ibinder != null)
                {
                    return ibinder;
                }
                ibinder = ((Bundle) (obj)).getString("Error");
                obj = (Intent)((Bundle) (obj)).getParcelable("userRecoveryIntent");
                Status status = Status.fromWireCode(ibinder);
                if (Status.isUserRecoverableError(status))
                {
                    throw new UserRecoverableAuthException(ibinder, ((Intent) (obj)));
                }
                if (Status.isRetryableError(status))
                {
                    throw new IOException(ibinder);
                } else
                {
                    throw new GoogleAuthException(ibinder);
                }
            }

            
            {
                account = account1;
                scope = s;
                options = bundle;
                super();
            }
        };
        return ((TokenData)connectAndExecute(context, GET_TOKEN_SERVICE_COMPONENT_NAME, account)).mToken;
    }

    public static String getToken(Context context, String s, String s1, Bundle bundle)
        throws IOException, UserRecoverableAuthException, GoogleAuthException
    {
        return getToken(context, new Account(s, "com.google"), s1, bundle);
    }

    public static void invalidateToken(Context context, String s)
    {
        AccountManager.get(context).invalidateAuthToken("com.google", s);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        i = android.os.Build.VERSION.SDK_INT;
    }


/*
    static Object access$000(Object obj)
        throws IOException
    {
        if (obj == null)
        {
            Log.w("GoogleAuthUtil", "Binder call returned null.");
            throw new IOException("Service unavailable.");
        } else
        {
            return obj;
        }
    }

*/
}
