// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.affiliations;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.PublicApiResource;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.legacy.model.UserAssociation;
import com.soundcloud.android.associations.NextFollowingOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.profile.VerifyAgeActivity;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.storage.LegacyUserAssociationStorage;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.ApiSyncResult;
import com.soundcloud.android.sync.LegacySyncStrategy;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.java.reflect.TypeToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import rx.f.i;

// Referenced classes of package com.soundcloud.android.sync.affiliations:
//            FollowErrors

public class MyFollowingsSyncer extends LegacySyncStrategy
{

    private static final int BULK_INSERT_BATCH_SIZE = 500;
    private static final String REQUEST_NO_BACKOFF = "0";
    private int bulkInsertBatchSize;
    private final JsonTransformer jsonTransformer;
    private final LegacyUserAssociationStorage legacyUserAssociationStorage;
    private final Navigator navigator;
    private final NextFollowingOperations nextFollowingOperations;
    private final NotificationManager notificationManager;

    protected MyFollowingsSyncer(Context context, ContentResolver contentresolver, LegacyUserAssociationStorage legacyuserassociationstorage, AccountOperations accountoperations, NextFollowingOperations nextfollowingoperations, NotificationManager notificationmanager, JsonTransformer jsontransformer, 
            Navigator navigator1)
    {
        super(context, contentresolver, accountoperations);
        bulkInsertBatchSize = 500;
        legacyUserAssociationStorage = legacyuserassociationstorage;
        nextFollowingOperations = nextfollowingoperations;
        notificationManager = notificationmanager;
        jsonTransformer = jsontransformer;
        navigator = navigator1;
    }

    public MyFollowingsSyncer(Context context, AccountOperations accountoperations, NextFollowingOperations nextfollowingoperations, NotificationManager notificationmanager, JsonTransformer jsontransformer, Navigator navigator1)
    {
        this(context, context.getContentResolver(), new LegacyUserAssociationStorage(i.a(), context.getContentResolver()), accountoperations, nextfollowingoperations, notificationmanager, jsontransformer, navigator1);
    }

    private Notification buildBlockedFollowNotification(UserAssociation userassociation, String s)
    {
        return buildNotification(context.getString(0x7f070142), context.getString(0x7f070141, new Object[] {
            s
        }), context.getString(0x7f070140, new Object[] {
            s
        }), buildReturnToProfileIntent(userassociation));
    }

    private Notification buildNotification(String s, String s1, String s2, PendingIntent pendingintent)
    {
        return (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x7f02015d).setContentTitle(s).setContentText(s1).setStyle((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(s2).setBigContentTitle(s)).setAutoCancel(true).setContentIntent(pendingintent).build();
    }

    private PendingIntent buildReturnToProfileIntent(UserAssociation userassociation)
    {
        return navigator.openProfileFromNotification(context, userassociation.getUser().getUrn());
    }

    private Notification buildUnderAgeNotification(UserAssociation userassociation, FollowErrors followerrors, String s)
    {
        return buildNotification(context.getString(0x7f07013c), context.getString(0x7f07013a, new Object[] {
            followerrors.getAge(), s
        }), context.getString(0x7f07013b, new Object[] {
            followerrors.getAge(), s
        }), buildReturnToProfileIntent(userassociation));
    }

    private Notification buildUnknownAgeNotification(UserAssociation userassociation, String s)
    {
        return buildNotification(context.getString(0x7f07013f), context.getString(0x7f07013e, new Object[] {
            s
        }), context.getString(0x7f07013d, new Object[] {
            s
        }), buildVerifyAgeIntent(userassociation));
    }

    private PendingIntent buildVerifyAgeIntent(UserAssociation userassociation)
    {
        userassociation = VerifyAgeActivity.getIntent(context, userassociation.getUser().getUrn());
        userassociation.addFlags(0x30000000);
        return PendingIntent.getActivity(context, 0, userassociation, 0);
    }

    private boolean checkUnchanged(ApiSyncResult apisyncresult, List list, List list1)
    {
        list = new HashSet(list);
        list1 = new HashSet(list1);
        if (!list.equals(list1))
        {
            apisyncresult.change = 2;
            apisyncresult.extra = "0";
        } else
        {
            int j;
            if (list1.isEmpty())
            {
                j = 0;
            } else
            {
                j = 1;
            }
            apisyncresult.change = j;
        }
        return apisyncresult.change == 0;
    }

    private FollowErrors extractApiErrors(HttpEntity httpentity)
        throws IOException
    {
        try
        {
            httpentity = IOUtils.readInputStream(httpentity.getContent());
            httpentity = (FollowErrors)jsonTransformer.fromJson(httpentity, TypeToken.of(com/soundcloud/android/sync/affiliations/FollowErrors));
        }
        // Misplaced declaration of an exception variable
        catch (HttpEntity httpentity)
        {
            return FollowErrors.empty();
        }
        return httpentity;
    }

    private void forbiddenUserPushHandler(UserAssociation userassociation, FollowErrors followerrors)
    {
        followerrors = getForbiddenNotification(userassociation, followerrors);
        notificationManager.notify(userassociation.getUser().getUrn().toString(), 7, followerrors);
        DefaultSubscriber.fireAndForget(nextFollowingOperations.toggleFollowing(userassociation.getUser().getUrn(), false));
    }

    private Notification getForbiddenNotification(UserAssociation userassociation, FollowErrors followerrors)
    {
        String s = userassociation.getUser().getDisplayName();
        if (followerrors.isAgeRestricted())
        {
            return buildUnderAgeNotification(userassociation, followerrors, s);
        }
        if (followerrors.isAgeUnknown())
        {
            return buildUnknownAgeNotification(userassociation, s);
        } else
        {
            return buildBlockedFollowNotification(userassociation, s);
        }
    }

    private boolean pushUserAssociationAddition(UserAssociation userassociation, Request request)
        throws IOException
    {
        request = api.put(request);
        int j = request.getStatusLine().getStatusCode();
        if (j == 403)
        {
            forbiddenUserPushHandler(userassociation, extractApiErrors(request.getEntity()));
            return true;
        }
        if (j == 200 || j == 201)
        {
            legacyUserAssociationStorage.setFollowingAsSynced(userassociation);
            return true;
        } else
        {
            (new StringBuilder("failure ")).append(j).append(" in user association addition of ").append(userassociation.getUser().getId());
            return false;
        }
    }

    private boolean pushUserAssociationRemoval(UserAssociation userassociation, Request request)
        throws IOException
    {
        int j = api.delete(request).getStatusLine().getStatusCode();
        if (j == 200 || j == 404 || j == 422)
        {
            legacyUserAssociationStorage.setFollowingAsSynced(userassociation);
            return true;
        } else
        {
            (new StringBuilder("failure ")).append(j).append(" in user association removal of ").append(userassociation.getUser().getId());
            return false;
        }
    }

    private ApiSyncResult pushUserAssociations()
    {
        ApiSyncResult apisyncresult = new ApiSyncResult(Content.ME_FOLLOWINGS.uri);
        apisyncresult.success = true;
        if (legacyUserAssociationStorage.hasFollowingsNeedingSync())
        {
            Iterator iterator = legacyUserAssociationStorage.getFollowingsNeedingSync().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                UserAssociation userassociation = (UserAssociation)iterator.next();
                if (!userassociation.hasToken() && !pushUserAssociation(userassociation))
                {
                    apisyncresult.success = false;
                }
            } while (true);
        }
        return apisyncresult;
    }

    private ApiSyncResult syncLocalToRemote(long l)
        throws IOException
    {
        ApiSyncResult apisyncresult = new ApiSyncResult(Content.ME_FOLLOWINGS.uri);
        Object obj = legacyUserAssociationStorage.getStoredIds(Content.ME_FOLLOWINGS.uri);
        List list = api.readFullCollection(Request.to((new StringBuilder()).append(Content.ME_FOLLOWINGS.remoteUri).append("/ids").toString(), new Object[0]), com/soundcloud/android/sync/LegacySyncStrategy$IdHolder);
        if (!isLoggedIn())
        {
            return apisyncresult;
        }
        log((new StringBuilder("Cloud Api service: got remote ids ")).append(list.size()).append(" vs [local] ").append(((List) (obj)).size()).toString());
        apisyncresult.setSyncData(System.currentTimeMillis(), list.size());
        if (checkUnchanged(apisyncresult, ((List) (obj)), list))
        {
            apisyncresult.success = true;
            return apisyncresult;
        }
        obj = new ArrayList(((java.util.Collection) (obj)));
        ((List) (obj)).removeAll(list);
        legacyUserAssociationStorage.deleteAssociations(Content.ME_FOLLOWINGS.uri, ((List) (obj)));
        obj = api.readList(Request.to(Content.ME_FOLLOWINGS.remoteUri, new Object[0]).add("linked_partitioning", "1").add("limit", Integer.valueOf(30)));
        if (!isLoggedIn())
        {
            return new ApiSyncResult(Content.ME_FOLLOWINGS.uri);
        }
        int j = legacyUserAssociationStorage.insertAssociations(((List) (obj)), Content.ME_FOLLOWINGS.uri, l);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); list.remove(Long.valueOf(((PublicApiResource)iterator.next()).getId()))) { }
        int k = ((List) (obj)).size();
        log((new StringBuilder("Added ")).append(j).append(" new items for this endpoint").toString());
        legacyUserAssociationStorage.insertInBatches(l, list, k, bulkInsertBatchSize);
        apisyncresult.success = true;
        return apisyncresult;
    }

    boolean pushUserAssociation(UserAssociation userassociation)
    {
        Request request = Request.to("/me/followings/%d", new Object[] {
            Long.valueOf(userassociation.getUser().getId())
        });
        _cls1..SwitchMap.com.soundcloud.android.api.legacy.model.UserAssociation.LocalState[userassociation.getLocalSyncState().ordinal()];
        JVM INSTR tableswitch 1 2: default 75
    //                   1 56
    //                   2 63;
           goto _L1 _L2 _L3
_L2:
        return pushUserAssociationAddition(userassociation, request);
_L3:
        boolean flag = pushUserAssociationRemoval(userassociation, request);
        return flag;
        userassociation;
        return false;
_L1:
        return true;
    }

    public ApiSyncResult syncContent(Uri uri, String s)
        throws IOException
    {
        if (!isLoggedIn())
        {
            return new ApiSyncResult(Content.ME_FOLLOWINGS.uri);
        }
        if (s != null && s.equals("com.soundcloud.android.sync.action.PUSH"))
        {
            return pushUserAssociations();
        } else
        {
            return syncLocalToRemote(accountOperations.getLoggedInUserId());
        }
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState = new int[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.PENDING_ADDITION.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$legacy$model$UserAssociation$LocalState[com.soundcloud.android.api.legacy.model.UserAssociation.LocalState.PENDING_REMOVAL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
