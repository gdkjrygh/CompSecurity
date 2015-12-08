// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.GamesNotificationHelper;
import com.google.android.gms.games.service.GamesSyncAdapter;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.utils.UriUtils;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, Agents

public final class NotificationAgent extends Lockable
{
    public static final class NotificationParams
    {

        public final String externalGameId;
        public final String externalNotificationId;
        public final String externalSubId;
        public final Uri imageUri;
        public final String text;
        public final String ticker;
        public final String title;
        public final int type;

        public NotificationParams(String s, String s1, String s2, int i, String s3, String s4, String s5, 
                Uri uri)
        {
            externalGameId = s;
            externalNotificationId = s1;
            externalSubId = s2;
            type = i;
            ticker = s3;
            title = s4;
            text = s5;
            imageUri = uri;
        }
    }


    private static final ContentValues DISPLAYED_VALUES;
    private static final AtomicInteger LOCAL_NOTIFICATION_ID_COUNTER = new AtomicInteger(0);
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();

    public NotificationAgent(Lockable lockable)
    {
        super("NotificationAgent", LOCK, lockable);
    }

    public static void acknowledgeNotifications(Context context, String s, String s1)
    {
        GamesNotificationHelper.logDisplayedNotificationAction(context, s1, s, 3);
        s = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(s1);
        context.getContentResolver().update(s, DISPLAYED_VALUES, null, null);
    }

    public static String getNewLocalNotificationId()
    {
        return (new StringBuilder("local_notification_id_")).append(LOCAL_NOTIFICATION_ID_COUNTER.getAndIncrement()).toString();
    }

    public static DataHolder getNotifications(Context context, String s)
    {
        context = (new Agents.QueryBuilder(context)).setQuerySpec(com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(s));
        context.mSortOrder = "alert_level DESC,timestamp DESC";
        return context.query();
    }

    public static void notificationOpened(Context context, ClientContext clientcontext)
    {
        GamesNotificationHelper.logDisplayedNotificationAction(context, UriUtils.getDataStoreNameFromClientContext(clientcontext), AccountUtils.getResolvedAccountName(clientcontext), 4);
    }

    public static void register(Context context, Account account)
    {
        ContentResolver.cancelSync(account, "com.google.android.gms.games.background");
        GamesSyncAdapter.updateGsyncFeeds(context, account);
        GamesSyncAdapter.setSyncEnabled(account, true);
        GamesSyncAdapter.setUpPeriodicSync(context, account);
    }

    public static void updateNotifications(Context context, ClientContext clientcontext, ArrayList arraylist)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(clientcontext);
        ArrayList arraylist1 = new ArrayList(arraylist.size());
        int i = 0;
        int j = arraylist.size();
        while (i < j) 
        {
            Object obj1 = (NotificationParams)arraylist.get(i);
            String s = ((NotificationParams) (obj1)).externalGameId;
            Object obj = ((NotificationParams) (obj1)).externalNotificationId;
            String s1 = ((NotificationParams) (obj1)).externalSubId;
            int k = ((NotificationParams) (obj1)).type;
            String s2 = ((NotificationParams) (obj1)).ticker;
            String s3 = ((NotificationParams) (obj1)).title;
            String s4 = ((NotificationParams) (obj1)).text;
            obj1 = ((NotificationParams) (obj1)).imageUri;
            long l = Agents.forceResolveExternalGameId(context, clientcontext, s);
            if (l <= 0L)
            {
                GamesLog.e("NotificationAgent", (new StringBuilder("Unable to resolve internal game ID for game ")).append(s).toString());
                obj = null;
            } else
            {
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("game_id", Long.valueOf(l));
                contentvalues.put("notification_id", ((String) (obj)));
                contentvalues.put("external_sub_id", s1);
                contentvalues.put("type", Integer.valueOf(k));
                contentvalues.put("ticker", s2);
                contentvalues.put("title", s3);
                contentvalues.put("text", s4);
                contentvalues.put("coalesced_text", s4);
                contentvalues.put("acknowledged", Integer.valueOf(0));
                obj = contentvalues;
                if (obj1 != null)
                {
                    contentvalues.put("image_id", Long.valueOf(ContentUris.parseId(((Uri) (obj1)))));
                    obj = contentvalues;
                }
            }
            arraylist1.add(ContentProviderOperation.newInsert(uri).withValues(((ContentValues) (obj))).build());
            i++;
        }
        Agents.applyContentOperations(context.getContentResolver(), arraylist1, "NotificationAgent");
    }

    static 
    {
        ContentValues contentvalues = new ContentValues();
        DISPLAYED_VALUES = contentvalues;
        contentvalues.put("acknowledged", Integer.valueOf(1));
    }
}
