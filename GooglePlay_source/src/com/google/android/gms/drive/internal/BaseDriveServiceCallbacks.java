// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.IRealtimeService;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnChangesResponse, OnContentsResponse, OnDeviceUsagePreferenceResponse, OnDownloadProgressResponse, 
//            OnDriveIdResponse, OnDrivePreferencesResponse, OnFetchThumbnailResponse, GetPermissionsResponse, 
//            OnListEntriesResponse, OnListParentsResponse, OnLoadRealtimeResponse, OnMetadataResponse, 
//            OnResourceIdSetResponse, OnStartStreamSession, StringListResponse, OnSyncMoreResponse

public class BaseDriveServiceCallbacks extends IDriveServiceCallbacks.Stub
{

    public BaseDriveServiceCallbacks()
    {
    }

    public final void onAutobackupEnabledResponse(boolean flag)
        throws RemoteException
    {
    }

    public final void onChangeSequenceNumberResponse(ChangeSequenceNumber changesequencenumber)
        throws RemoteException
    {
    }

    public final void onChangesResponse(OnChangesResponse onchangesresponse)
        throws RemoteException
    {
    }

    public void onContentsResponse(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
    }

    public final void onDeviceUsagePreferenceResponse(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
        throws RemoteException
    {
    }

    public void onDownloadProgress(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
    }

    public void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
        throws RemoteException
    {
    }

    public final void onDrivePreferencesResponse(OnDrivePreferencesResponse ondrivepreferencesresponse)
        throws RemoteException
    {
    }

    public void onError(Status status)
        throws RemoteException
    {
    }

    public final void onFetchThumbnailResponse(OnFetchThumbnailResponse onfetchthumbnailresponse)
        throws RemoteException
    {
    }

    public final void onGetPermissionsResponse(GetPermissionsResponse getpermissionsresponse)
        throws RemoteException
    {
    }

    public void onListEntriesResponse(OnListEntriesResponse onlistentriesresponse)
        throws RemoteException
    {
    }

    public final void onListParentsResponse(OnListParentsResponse onlistparentsresponse)
        throws RemoteException
    {
    }

    public final void onLoadRealtimeResponse(OnLoadRealtimeResponse onloadrealtimeresponse, IRealtimeService irealtimeservice)
        throws RemoteException
    {
    }

    public void onMetadataResponse(OnMetadataResponse onmetadataresponse)
        throws RemoteException
    {
    }

    public void onResourceIdSetResponse(OnResourceIdSetResponse onresourceidsetresponse)
        throws RemoteException
    {
    }

    public final void onStartStreamSession(OnStartStreamSession onstartstreamsession)
        throws RemoteException
    {
    }

    public final void onStringListResponse(StringListResponse stringlistresponse)
        throws RemoteException
    {
    }

    public void onSuccess()
        throws RemoteException
    {
    }

    public void onSyncMoreResponse(OnSyncMoreResponse onsyncmoreresponse)
        throws RemoteException
    {
    }
}
