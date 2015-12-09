// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            IDriveService, DisconnectRequest, BaseDriveServiceCallbacks, OnSyncMoreResponse, 
//            DriveBaseApiMethodImpl, QueryRequest

public final class DriveClientImpl extends GmsClient
{
    static final class SyncMoreCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new SyncMoreResultImpl(status, false));
        }

        public final void onSyncMoreResponse(OnSyncMoreResponse onsyncmoreresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new SyncMoreResultImpl(Status.RESULT_SUCCESS, onsyncmoreresponse.mMoreEntriesMayExist));
        }

        public SyncMoreCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    static final class SyncMoreResultImpl
        implements com.google.android.gms.drive.query.Query.SyncMoreResult
    {

        private final boolean mMoreEntriesMayExist;
        private final Status mStatus;

        public final Status getStatus()
        {
            return mStatus;
        }

        public SyncMoreResultImpl(Status status, boolean flag)
        {
            mStatus = status;
            mMoreEntriesMayExist = flag;
        }
    }


    volatile DriveId mAppDataId;
    final Map mChangeEventCallbackMap = new HashMap();
    final Map mChangesAvailableEventCallbackMap = new HashMap();
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks mConnectionCallbacks;
    public final boolean mHasEventService;
    volatile boolean mIsInitComplete;
    private final Bundle mOptionsBundle;
    final Map mPinnedDownloadProgressEventCallbackMap = new HashMap();
    private final String mRealClientPackageName;
    private volatile DriveId mRootId;
    final Map mUploadProgressEventCallbackMap = new HashMap();

    public DriveClientImpl(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, Bundle bundle)
    {
        super(context, looper, 11, clientsettings, connectioncallbacks, onconnectionfailedlistener);
        mIsInitComplete = false;
        mRealClientPackageName = clientsettings.mRealClientPackageName;
        mConnectionCallbacks = connectioncallbacks;
        mOptionsBundle = bundle;
        looper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        looper.setPackage(context.getPackageName());
        context = context.getPackageManager().queryIntentServices(looper, 0);
        switch (context.size())
        {
        default:
            throw new IllegalStateException((new StringBuilder("AndroidManifest.xml can only define one service that handles the ")).append(looper.getAction()).append(" action").toString());

        case 0: // '\0'
            mHasEventService = false;
            return;

        case 1: // '\001'
            context = ((ResolveInfo)context.get(0)).serviceInfo;
            break;
        }
        if (!((ServiceInfo) (context)).exported)
        {
            throw new IllegalStateException((new StringBuilder("Drive event service ")).append(((ServiceInfo) (context)).name).append(" must be exported in AndroidManifest.xml").toString());
        } else
        {
            mHasEventService = true;
            return;
        }
    }

    protected final volatile IInterface createServiceInterface(IBinder ibinder)
    {
        return IDriveService.Stub.asInterface(ibinder);
    }

    public final void disconnect()
    {
        if (isConnected())
        {
            try
            {
                ((IDriveService)getService()).disconnect(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        synchronized (mChangeEventCallbackMap)
        {
            mChangeEventCallbackMap.clear();
        }
        synchronized (mChangesAvailableEventCallbackMap)
        {
            mChangesAvailableEventCallbackMap.clear();
        }
        synchronized (mUploadProgressEventCallbackMap)
        {
            mUploadProgressEventCallbackMap.clear();
        }
        synchronized (mPinnedDownloadProgressEventCallbackMap)
        {
            mPinnedDownloadProgressEventCallbackMap.clear();
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        map;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        map;
        JVM INSTR monitorexit ;
        throw exception2;
        exception3;
        map;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    protected final Bundle getGetServiceRequestExtraArgs()
    {
        String s = super.mContext.getPackageName();
        Preconditions.checkNotNull(s);
        Bundle bundle;
        boolean flag;
        if (!super.mClientSettings.mAllRequestedScopes.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        bundle = new Bundle();
        if (!s.equals(mRealClientPackageName))
        {
            bundle.putString("proxy_package_name", mRealClientPackageName);
        }
        bundle.putAll(mOptionsBundle);
        return bundle;
    }

    protected final String getServiceDescriptor()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    protected final String getStartServiceAction()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected final void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            mRootId = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            mAppDataId = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
            mIsInitComplete = true;
        }
        super.onPostInitHandler(i, ibinder, bundle, j);
    }

    public final boolean requiresAccount()
    {
        return true;
    }

    public final boolean requiresSignIn()
    {
        return !super.mContext.getPackageName().equals(mRealClientPackageName) || !GooglePlayServicesUtil.isGooglePlayServicesUid(super.mContext, Process.myUid());
    }

    // Unreferenced inner class com/google/android/gms/drive/internal/DriveClientImpl$6

/* anonymous class */
    public final class _cls6 extends DriveBaseApiMethodImpl
    {

        final DriveClientImpl this$0;
        final Query val$query;

        public final volatile Result createFailedResult(Status status)
        {
            return new SyncMoreResultImpl(status, false);
        }

        protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            ((IDriveService)((DriveClientImpl)client).getService()).syncMore(new QueryRequest(query), new SyncMoreCallback(this));
        }

            public 
            {
                this$0 = DriveClientImpl.this;
                query = query1;
                super(final_googleapiclient);
            }
    }

}
