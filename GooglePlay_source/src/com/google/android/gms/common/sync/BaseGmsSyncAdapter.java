// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SyncResult;
import android.os.Bundle;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.GmsNetworkClientTags;
import com.google.android.gms.common.server.GmsNetworkTrafficStats;
import com.google.android.gms.common.stats.StatsUtils;
import com.google.android.gms.common.stats.WakeLockTracker;

public abstract class BaseGmsSyncAdapter extends AbstractThreadedSyncAdapter
{

    private Context mAppContext;
    private String mAuthority;
    private String mIdentifier;

    public BaseGmsSyncAdapter(Context context, String s)
    {
        super(context, false);
        mAppContext = context.getApplicationContext();
        mAuthority = (String)Preconditions.checkNotNull(s);
        mIdentifier = (new StringBuilder("sync:")).append(GmsNetworkClientTags.tagToString(3585)).toString();
        if (getPrefs().getBoolean(mAuthority, false))
        {
            ContentResolver.cancelSync(null, mAuthority);
            context = getPrefs().edit();
            context.putBoolean(mAuthority, false);
            SharedPreferencesCompat.apply(context);
        }
    }

    private SharedPreferences getPrefs()
    {
        return mAppContext.getSharedPreferences((new StringBuilder("gms_sync_prefs_")).append(mIdentifier).toString(), 4);
    }

    private void setSyncInProgress(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = getPrefs().edit();
        editor.putBoolean(mAuthority, flag);
        editor.commit();
    }

    public final void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        setSyncInProgress(true);
        Preconditions.checkNotNull(mIdentifier);
        WakeLockTracker.getInstance();
        Context context = mAppContext;
        String s1 = mIdentifier;
        WakeLockTracker.registerEvent(context, StatsUtils.getEventKey(this, s1), 10, s1, null, 0, null);
        GmsNetworkTrafficStats.setThreadStatsTag(3585);
        performSync(account, bundle, s, contentproviderclient, syncresult);
        WakeLockTracker.getInstance();
        account = mAppContext;
        bundle = mIdentifier;
        WakeLockTracker.registerEvent(account, StatsUtils.getEventKey(this, bundle), 11, bundle, null, 0, null);
        GmsNetworkTrafficStats.clearThreadStatsTag();
        setSyncInProgress(false);
        return;
        account;
        GmsNetworkTrafficStats.clearThreadStatsTag();
        setSyncInProgress(false);
        throw account;
    }

    public abstract boolean performSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult);
}
