// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.gservices.GServicesHelper;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.appcontent.AppContentFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.Connections;
import java.util.concurrent.ConcurrentHashMap;

public final class PlayNowStreamFragment extends AppContentFragment
    implements LoggablePage
{

    private static final String LOAD_NAMES[] = {
        "PLAY_NOW", "PLAY_NOW_1", "PLAY_NOW_2"
    };
    private static int sCurrLoadName = 0;
    private final ConcurrentHashMap mEndpointIdToName = new ConcurrentHashMap();
    private LatencyLogger mLatencyLogger;
    private String mScreenName;

    public PlayNowStreamFragment()
    {
    }

    private boolean isLatencyVisible()
    {
        return mLoadingDataViewManager.mViewState != 2;
    }

    public final int getLogId(String s)
    {
        byte byte0;
        int i;
        i = 1;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 44
    //                   -528695389: 94
    //                   271317128: 108
    //                   1366835707: 80;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_108;
_L5:
        switch (byte0)
        {
        default:
            i = super.getLogId(s);
            // fall through

        case 0: // '\0'
        case 1: // '\001'
            return i;

        case 2: // '\002'
            return 6;
        }
_L4:
        if (s.equals("LATENCY_TYPE"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s.equals("ACTION_TYPE"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("CIRCLES_ACTION_SOURCE"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    protected final int getLogSource()
    {
        return 2;
    }

    protected final int getPlaylogElementType()
    {
        return 1;
    }

    protected final String getScreenName()
    {
        return mScreenName;
    }

    protected final PendingResult loadData(GoogleApiClient googleapiclient)
    {
        mLatencyLogger.onConnected(googleapiclient);
        if (isLatencyVisible())
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4, 2
            });
        } else
        {
            mLatencyLogger.ensureStarted(new int[] {
                2
            });
        }
        if (mLoadingDataViewManager.mViewState == 4)
        {
            mLoadingDataViewManager.setViewState(1);
        }
        return Games.AppContents.loadFirstParty$6b0b0641(googleapiclient, mScreenName, GServicesHelper.getString(G.playNowScreenExperiment).split(","));
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        if (isLatencyVisible())
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
        } else
        {
            mLatencyLogger.ensureStarted(new int[0]);
        }
        powerupplaylogger.logBasicAction(getLogId("ACTION_TYPE"), PowerUpUtils.getExperimentIdsForLogging());
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mScreenName = "PLAY_NOW";
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, getLogId("LATENCY_TYPE"));
        if (isLatencyVisible())
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
            return;
        } else
        {
            mLatencyLogger.ensureStarted(new int[0]);
            return;
        }
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mLoadingDataViewManager.setViewState(4);
        return layoutinflater;
    }

    protected final void onDataLoadFailed()
    {
        mLatencyLogger.logEvents(new int[] {
            7
        });
    }

    protected final void onDataLoaded()
    {
        mLatencyLogger.logEvents(new int[] {
            8
        });
    }

    public final void onDestroyView()
    {
        super.onDestroyView();
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            GamesLog.i("PlayNowStreamFrag", "Stopping discovery");
            Nearby.Connections.stopCrossAppDiscoveryRestricted(googleapiclient);
        }
        super.onStop();
    }

}
