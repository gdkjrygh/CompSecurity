// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.notifications;

import android.content.ContentResolver;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.games.broker.AccountAgent;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.InboxCounter;
import com.google.android.gms.games.broker.Lockable;
import com.google.android.gms.games.broker.NotificationAgent;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.GamesNotificationHelper;
import java.util.ArrayList;

public final class ClearNotificationsOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final String mDataStoreName;
    private final String mExternalGameId;
    private final String mExternalSubId = null;
    private final int mNotificationTypes;

    public ClearNotificationsOperation(String s, String s1, String s2, int i)
    {
        mDataStoreName = s;
        mExternalGameId = s1;
        mNotificationTypes = i;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        String s;
        Object obj;
        String s2;
        int j;
        s = mDataStoreName;
        obj = mExternalGameId;
        s2 = mExternalSubId;
        j = mNotificationTypes;
        DataBroker.acquireLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        String s1;
        Object obj1;
        obj1 = AccountAgent.getPlayerRecord(context, s);
        s1 = (String)((Pair) (obj1)).first;
        obj1 = (String)((Pair) (obj1)).second;
        if (s1 != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        GamesLog.e("DataBroker", (new StringBuilder("No account found for the given datastore! Bailing! (datastore name :")).append(s).append(")").toString());
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        return;
        int k = databroker.mInboxCounters.size();
        int i = 0;
_L2:
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((InboxCounter)databroker.mInboxCounters.get(i)).clearActivityTypes(j);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Object obj2;
        QuerySpec queryspec;
        obj2 = databroker.mNotificationAgent;
        obj2 = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(s);
        queryspec = new QuerySpec(((android.net.Uri) (obj2)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        long l = Agents.forceResolveExternalGameIdNoSync(context, ((android.net.Uri) (obj2)), ((String) (obj)));
        if (l > 0L)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        throw new IllegalStateException((new StringBuilder("Unable to resolve internal game ID for game ")).append(((String) (obj))).toString());
        context;
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        throw context;
        queryspec.addWhereById("game_id", l);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        queryspec.addWhere("external_sub_id", s2);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_286;
        }
        queryspec.addWhereForMask("type", j);
        context.getContentResolver().delete(((android.net.Uri) (obj2)), queryspec.getSelection(), queryspec.mSelectionArgs);
        obj = NotificationAgent.getNotifications(context, s);
        GamesNotificationHelper.updateNotifications(context, s, s1, ((String) (obj1)), ((DataHolder) (obj)));
        ((DataHolder) (obj)).close();
        DataBroker.releaseLocks(new Lockable[] {
            databroker.mNotificationAgent
        });
        return;
        context;
        ((DataHolder) (obj)).close();
        throw context;
    }

    public final void postExecute()
    {
    }
}
