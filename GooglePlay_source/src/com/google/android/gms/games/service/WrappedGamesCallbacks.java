// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.database.CursorWindow;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.GamesConstants;
import com.google.android.gms.games.internal.IGamesCallbacks;
import java.util.Iterator;
import java.util.Set;

public final class WrappedGamesCallbacks
{

    private static final String BLOCKED_3P_COLUMNS[] = {
        "real_name"
    };
    public final IGamesCallbacks mCallbacks;
    private final int mCallingUid;
    private final String mExternalGameId;

    public WrappedGamesCallbacks(IGamesCallbacks igamescallbacks, String s)
    {
        this(igamescallbacks, s, Binder.getCallingUid());
    }

    private WrappedGamesCallbacks(IGamesCallbacks igamescallbacks, String s, int i)
    {
        mCallbacks = (IGamesCallbacks)Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
        mExternalGameId = s;
        mCallingUid = i;
    }

    private void audit(Bundle bundle)
    {
        if (bundle != null)
        {
            Iterator iterator = bundle.keySet().iterator();
            while (iterator.hasNext()) 
            {
                Object obj = bundle.get((String)iterator.next());
                if (obj instanceof DataHolder)
                {
                    audit(new DataHolder[] {
                        (DataHolder)obj
                    });
                }
            }
        }
    }

    public final transient void audit(DataHolder adataholder[])
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_3;
        if (!GamesConstants.isFirstPartyAppId(mExternalGameId, false) && !GooglePlayServicesUtil.uidHasPackageName(GmsApplicationContext.getInstance(), mCallingUid, "com.google.android.play.games"))
        {
            flag = true;
        }
        if (flag)
        {
            int i = 0;
            while (i < adataholder.length) 
            {
                DataHolder dataholder = adataholder[i];
                for (int j = 0; j <= 0; j++)
                {
                    String s = BLOCKED_3P_COLUMNS[j];
                    if (!dataholder.hasColumn(s))
                    {
                        continue;
                    }
                    int k = 0;
                    for (int l = dataholder.mRowCount; k < l; k++)
                    {
                        int i1 = dataholder.getWindowIndex(k);
                        dataholder.checkColumnAndRow(s, k);
                        dataholder.mWindows[i1].putNull(k, dataholder.mColumnBundle.getInt(s));
                    }

                }

                i++;
            }
        }
        return;
    }

    public final void onAchievementUpdated(int i, String s)
        throws RemoteException
    {
        mCallbacks.onAchievementUpdated(i, s);
    }

    public final void onAchievementsLoaded(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onAchievementsLoaded(dataholder);
    }

    public final void onEventsLoaded(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onEventsLoaded(dataholder);
    }

    public final void onInboxCountsLoaded(int i, Bundle bundle)
        throws RemoteException
    {
        audit(bundle);
        mCallbacks.onInboxCountsLoaded(i, bundle);
    }

    public final void onLeaderboardScoresLoaded(DataHolder dataholder, DataHolder dataholder1)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder, dataholder1
        });
        mCallbacks.onLeaderboardScoresLoaded(dataholder, dataholder1);
    }

    public final void onLeftRoom(int i, String s)
        throws RemoteException
    {
        mCallbacks.onLeftRoom(i, s);
    }

    public final void onMessageSent(int i, int j, String s)
        throws RemoteException
    {
        mCallbacks.onMessageSent(i, j, s);
    }

    public final void onPlayersLoaded(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onPlayersLoaded(dataholder);
    }

    public final void onRequestsLoaded(int i, Bundle bundle)
        throws RemoteException
    {
        audit(bundle);
        mCallbacks.onRequestsLoaded(i, bundle);
    }

    public final void onRequestsUpdated(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onRequestsUpdated(dataholder);
    }

    public final void onScoreSubmitted(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onScoreSubmitted(dataholder);
    }

    public final void onSnapshotConflict(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onSnapshotConflict(dataholder, s, contents, contents1, contents2);
    }

    public final void onSnapshotOpened(DataHolder dataholder, Contents contents)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onSnapshotOpened(dataholder, contents);
    }

    public final void onTurnBasedMatchInitiated(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onTurnBasedMatchInitiated(dataholder);
    }

    public final void onTurnBasedMatchUpdated(DataHolder dataholder)
        throws RemoteException
    {
        audit(new DataHolder[] {
            dataholder
        });
        mCallbacks.onTurnBasedMatchUpdated(dataholder);
    }

    public final void onTurnBasedMatchesLoaded(int i, Bundle bundle)
        throws RemoteException
    {
        audit(bundle);
        mCallbacks.onTurnBasedMatchesLoaded(i, bundle);
    }

    public final void onXpForGameCategoriesLoaded(int i, Bundle bundle)
        throws RemoteException
    {
        audit(bundle);
        mCallbacks.onXpForGameCategoriesLoaded(i, bundle);
    }

}
