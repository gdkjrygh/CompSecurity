// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.InvalidTokenException;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.UnexpectedResponseException;
import com.soundcloud.android.api.legacy.model.LocalCollection;
import com.soundcloud.android.utils.ErrorUtils;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncJob, ApiSyncService, ApiSyncResult, SyncStateManager, 
//            ApiSyncerFactory, SyncStrategy

public class LegacySyncJob
    implements SyncJob
{
    static class Factory
    {

        private final ApiSyncerFactory apiSyncerFactory;
        private final Context context;
        private final SyncStateManager syncStateManager;

        LegacySyncJob create(Uri uri, String s, boolean flag)
        {
            return new LegacySyncJob(context, uri, s, flag, apiSyncerFactory, syncStateManager);
        }

        Factory(Context context1, ApiSyncerFactory apisyncerfactory, SyncStateManager syncstatemanager)
        {
            context = context1;
            apiSyncerFactory = apisyncerfactory;
            syncStateManager = syncstatemanager;
        }
    }


    public static final String TAG = com/soundcloud/android/sync/ApiSyncService.getSimpleName();
    private final String action;
    private final ApiSyncerFactory apiSyncerFactory;
    private final Uri contentUri;
    private final Context context;
    private Exception exception;
    private final boolean isUI;
    private LocalCollection localCollection;
    private ApiSyncResult result;
    private final SyncStateManager syncStateManager;

    public LegacySyncJob(Context context1, Uri uri, String s, boolean flag)
    {
        context = context1;
        contentUri = uri;
        action = s;
        isUI = flag;
        apiSyncerFactory = null;
        syncStateManager = null;
        result = new ApiSyncResult(contentUri);
    }

    public LegacySyncJob(Context context1, Uri uri, String s, boolean flag, ApiSyncerFactory apisyncerfactory, SyncStateManager syncstatemanager)
    {
        context = context1;
        contentUri = uri;
        action = s;
        isUI = flag;
        syncStateManager = syncstatemanager;
        apiSyncerFactory = apisyncerfactory;
        result = new ApiSyncResult(contentUri);
    }

    private void handleApiRequestException(ApiRequestException apirequestexception)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.api.ApiRequestException.Reason[apirequestexception.reason().ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unknown error reason : ")).append(apirequestexception.reason()).toString());

        case 1: // '\001'
        case 2: // '\002'
            handleSyncException(ApiSyncResult.fromAuthException(contentUri), apirequestexception);
            return;

        case 3: // '\003'
            handleSyncException(ApiSyncResult.fromIOException(contentUri), apirequestexception);
            return;

        case 4: // '\004'
            handleSyncException(ApiSyncResult.fromServerError(contentUri), apirequestexception);
            return;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            ErrorUtils.handleSilentException(apirequestexception);
            // fall through

        case 8: // '\b'
        case 9: // '\t'
            handleSyncException(ApiSyncResult.fromClientError(contentUri), apirequestexception);
            break;
        }
    }

    private void handleSyncException(ApiSyncResult apisyncresult, Exception exception1)
    {
        syncStateManager.updateSyncState(localCollection.getId(), 0);
        result = apisyncresult;
        exception = exception1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LegacySyncJob)obj;
            if (action == null ? ((LegacySyncJob) (obj)).action != null : !action.equals(((LegacySyncJob) (obj)).action))
            {
                return false;
            }
            if (contentUri == null ? ((LegacySyncJob) (obj)).contentUri != null : !contentUri.equals(((LegacySyncJob) (obj)).contentUri))
            {
                return false;
            }
        }
        return true;
    }

    public Uri getContentUri()
    {
        return contentUri;
    }

    public Exception getException()
    {
        return exception;
    }

    public ApiSyncResult getResult()
    {
        return result;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (contentUri != null)
        {
            i = contentUri.hashCode();
        } else
        {
            i = 0;
        }
        if (action != null)
        {
            j = action.hashCode();
        }
        return i * 31 + j;
    }

    public void onQueued()
    {
        localCollection = syncStateManager.fromContent(contentUri);
        if (localCollection != null)
        {
            syncStateManager.updateSyncState(localCollection.getId(), 1);
            return;
        } else
        {
            (new StringBuilder("Unable to create collection for uri ")).append(contentUri);
            return;
        }
    }

    public boolean resultedInAChange()
    {
        return result.change == 2;
    }

    public void run()
    {
        if (localCollection == null || !syncStateManager.updateSyncState(localCollection.getId(), 2))
        {
            (new StringBuilder("LocalCollection error :")).append(contentUri);
            return;
        }
        boolean flag;
        if (!isUI)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PublicApi.setBackgroundMode(flag);
        (new StringBuilder("syncing ")).append(contentUri);
        result = apiSyncerFactory.forContentUri(context, contentUri).syncContent(contentUri, action);
        syncStateManager.onSyncComplete(result, localCollection);
        PublicApi.setBackgroundMode(false);
_L1:
        (new StringBuilder("executed sync on ")).append(this);
        return;
        Object obj;
        obj;
        handleSyncException(ApiSyncResult.fromAuthException(contentUri), ((Exception) (obj)));
        PublicApi.setBackgroundMode(false);
          goto _L1
        obj;
        handleSyncException(ApiSyncResult.fromUnexpectedResponse(contentUri, ((UnexpectedResponseException) (obj)).getStatusCode()), ((Exception) (obj)));
        PublicApi.setBackgroundMode(false);
          goto _L1
        obj;
        handleSyncException(ApiSyncResult.fromIOException(contentUri), ((Exception) (obj)));
        PublicApi.setBackgroundMode(false);
          goto _L1
        obj;
        handleApiRequestException(((ApiRequestException) (obj)));
        PublicApi.setBackgroundMode(false);
          goto _L1
        obj;
        ErrorUtils.handleSilentException(((Throwable) (obj)));
        handleSyncException(ApiSyncResult.fromGeneralFailure(contentUri), ((Exception) (obj)));
        PublicApi.setBackgroundMode(false);
          goto _L1
        obj;
        PublicApi.setBackgroundMode(false);
        throw obj;
    }

    public void setResult(ApiSyncResult apisyncresult)
    {
        result = apisyncresult;
    }

    public String toString()
    {
        return (new StringBuilder("CollectionSyncRequest{contentUri=")).append(contentUri).append(", action='").append(action).append('\'').append(", result=").append(result).append('}').toString();
    }


    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ApiRequestException.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.AUTH_ERROR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_ALLOWED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NETWORK_ERROR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.SERVER_ERROR.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.UNEXPECTED_RESPONSE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.BAD_REQUEST.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.MALFORMED_INPUT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_FOUND.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.RATE_LIMITED.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
