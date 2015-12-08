// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.internal.GamesConstants;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.signin.service.AccountSessionStore;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, GamesClientContext, Agents

public final class AccountAgent extends Lockable
{
    private static interface MetadataQuery
    {

        public static final String PROJECTION[] = {
            "account_name", "external_player_id", "last_package_scan_timestamp", "account_type"
        };

    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();

    public AccountAgent(Lockable lockable)
    {
        super("AccountAgent", LOCK, lockable);
    }

    public static Account getAccount(Context context, String s)
    {
        Cursor cursor;
        Object obj2 = null;
        Object obj = null;
        s = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(s);
        cursor = context.getContentResolver().query(s, MetadataQuery.PROJECTION, null, null, null);
        s = obj2;
        context = obj;
        if (cursor.moveToFirst())
        {
            s = cursor.getString(0);
            context = cursor.getString(3);
        }
        cursor.close();
        if (s == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_80;
        context;
        cursor.close();
        throw context;
        Object obj1 = context;
        if (context == null)
        {
            obj1 = "com.google";
        }
        return new Account(s, ((String) (obj1)));
    }

    public static String getExternalPlayerId(Context context, ClientContext clientcontext)
    {
        Object obj = null;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext);
        clientcontext = context.getContentResolver().query(clientcontext, MetadataQuery.PROJECTION, null, null, null);
        context = obj;
        if (clientcontext.moveToFirst())
        {
            context = clientcontext.getString(1);
        }
        clientcontext.close();
        return context;
        context;
        clientcontext.close();
        throw context;
    }

    public static long getLastPackageScanTimestamp(GamesClientContext gamesclientcontext)
    {
        long l;
        l = -1L;
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(gamesclientcontext.mClientContext);
        gamesclientcontext = gamesclientcontext.mContext.getContentResolver().query(uri, MetadataQuery.PROJECTION, null, null, null);
        if (gamesclientcontext.moveToFirst())
        {
            l = gamesclientcontext.getLong(2);
        }
        gamesclientcontext.close();
        return l;
        Exception exception;
        exception;
        gamesclientcontext.close();
        throw exception;
    }

    public static Pair getPlayerRecord(Context context, String s)
    {
        Cursor cursor;
        Object obj1 = null;
        Object obj = null;
        s = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(s);
        cursor = context.getContentResolver().query(s, MetadataQuery.PROJECTION, null, null, null);
        context = obj1;
        s = obj;
        if (cursor.moveToFirst())
        {
            context = cursor.getString(0);
            s = cursor.getString(1);
        }
        cursor.close();
        return new Pair(context, s);
        context;
        cursor.close();
        throw context;
    }

    public static int recordSignIn(Context context, ClientContext clientcontext, String s, Integer integer)
    {
        boolean flag = GamesConstants.isPackagePlayGamesApp(clientcontext.mCallingPackageName);
        if (Agents.resolveExternalPlayerId(context, clientcontext, s) == -1L && !flag)
        {
            throw new IllegalStateException((new StringBuilder("No such player ID: ")).append(s).toString());
        }
        SignInCache.recordSignIn(context, clientcontext);
        if (s != null && saveAccountToDatabase(context, clientcontext, s) == null)
        {
            GamesLog.e("AccountAgent", (new StringBuilder("Error recording sign-in for player ")).append(s).toString());
            return 1;
        }
        if (integer != null)
        {
            context = clientcontext.mCallingPackageName;
            int i = integer.intValue();
            clientcontext = clientcontext.mResolvedAccount;
            AndroidUtils.assertMainGmsProcess();
            s = AccountSessionStore.getInstance();
            integer = String.format("putAccount with package name: %s, sessionId: %d, account: %s", new Object[] {
                context, Integer.valueOf(i), ((Account) (clientcontext)).name
            });
            if (((AccountSessionStore) (s)).mIsLogVerbose)
            {
                Log.v("AccountSessionStore", integer);
            }
            ((AccountSessionStore) (s)).mResolvedAccountMap.put(context, clientcontext);
        } else
        {
            AccountUtils.setSelectedAccount(context, clientcontext);
        }
        return 0;
    }

    public static Uri saveAccountToDatabase(Context context, ClientContext clientcontext, String s)
    {
        Object obj = null;
        ContentValues contentvalues = new ContentValues();
        Account account = clientcontext.mResolvedAccount;
        String s1;
        if (account == null)
        {
            s1 = null;
        } else
        {
            s1 = account.name;
        }
        contentvalues.put("account_name", s1);
        if (account == null)
        {
            s1 = obj;
        } else
        {
            s1 = account.type;
        }
        contentvalues.put("account_type", s1);
        if (s != null)
        {
            contentvalues.put("external_player_id", s);
        }
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext);
        return context.getContentResolver().insert(clientcontext, contentvalues);
    }

    public static void setLastPackageScanTimestamp(GamesClientContext gamesclientcontext, long l)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("last_package_scan_timestamp", Long.valueOf(l));
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(gamesclientcontext.mClientContext);
        gamesclientcontext.mContext.getContentResolver().update(uri, contentvalues, null, null);
    }

}
