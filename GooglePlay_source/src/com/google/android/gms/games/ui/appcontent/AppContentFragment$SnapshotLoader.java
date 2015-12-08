// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends onLoad
{
    private static final class SnapshotKey
    {

        public final String applicationId;
        public final String playerId;
        public final String snapshotId;

        public final boolean equals(Object obj)
        {
            if (obj instanceof SnapshotKey)
            {
                if (this == obj)
                {
                    return true;
                }
                obj = (SnapshotKey)obj;
                if (applicationId.equals(((SnapshotKey) (obj)).applicationId) && playerId.equals(((SnapshotKey) (obj)).playerId) && snapshotId.equals(((SnapshotKey) (obj)).snapshotId))
                {
                    return true;
                }
            }
            return false;
        }

        public final String toString()
        {
            return (new StringBuilder(applicationId)).append(",").append(playerId).append(",").append(snapshotId).toString();
        }

        public SnapshotKey(String s, String s1, String s2)
        {
            applicationId = s;
            playerId = s1;
            snapshotId = s2;
        }
    }


    private static final HashMap sSnapshotMap = new HashMap();
    private final allback mCallback;
    private final SnapshotKey mKey;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sSnapshotMap.containsKey(mKey))
        {
            mCallback.onSnapshotLoaded((SnapshotMetadata)sSnapshotMap.get(mKey));
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.Snapshots.loadFirstParty$29b9cb1d(googleapiclient, mKey.playerId, mKey.applicationId);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        int i;
        int j;
        result = (com.google.android.gms.games.snapshot.ader)result;
        if (!mFragment.canUseResult(result))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        i = 0;
        j = result.napshots().getCount();
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        SnapshotMetadata snapshotmetadata = result.napshots().get(i);
        if (!mKey.snapshotId.equals(snapshotmetadata.getSnapshotId())) goto _L4; else goto _L3
_L3:
        snapshotmetadata = (SnapshotMetadata)snapshotmetadata.freeze();
        sSnapshotMap.put(mKey, snapshotmetadata);
        mCallback.onSnapshotLoaded(snapshotmetadata);
_L2:
        result.ase();
        finish();
        return;
_L4:
        i++;
          goto _L5
        GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load snapshot: ")).append(mKey.toString()).toString());
          goto _L2
    }


    public allback(AppContentFragment appcontentfragment, String s, String s1, String s2, allback allback)
    {
        super(appcontentfragment);
        mKey = new SnapshotKey(s, s1, s2);
        mCallback = allback;
        onLoad(null);
    }
}
