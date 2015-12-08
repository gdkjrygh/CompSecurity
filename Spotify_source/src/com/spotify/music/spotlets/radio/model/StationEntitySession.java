// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.model;

import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import ctz;
import gpl;

// Referenced classes of package com.spotify.music.spotlets.radio.model:
//            RadioStationModel

public class StationEntitySession
    implements JacksonModel
{

    private int mIndex;
    private long mLastUpdateTime;
    private RadioStationModel mRadioStationModel;

    public StationEntitySession(RadioStationModel radiostationmodel, int i, long l)
    {
        mRadioStationModel = (RadioStationModel)ctz.a(radiostationmodel);
        mIndex = i;
        mLastUpdateTime = l;
    }

    public PlayerTrack getCurrentTrack()
    {
        if (mIndex >= 0 && mIndex < mRadioStationModel.tracks.length)
        {
            return mRadioStationModel.tracks[mIndex];
        } else
        {
            return null;
        }
    }

    public int getIndex()
    {
        return mIndex;
    }

    public long getLastUpdateTime()
    {
        return mLastUpdateTime;
    }

    public RadioStationModel getRadioStationModel()
    {
        return mRadioStationModel;
    }

    public void updateFollowing(boolean flag)
    {
        mRadioStationModel = gpl.a(mRadioStationModel, flag);
    }

    public void updateStationModel(RadioStationModel radiostationmodel)
    {
        mRadioStationModel = radiostationmodel;
        mLastUpdateTime = System.currentTimeMillis();
    }

    public void updateTracks(PlayerState playerstate)
    {
        if (TextUtils.equals(mRadioStationModel.getPlayerContextUri(), playerstate.entityUri()))
        {
            PlayerTrack playertrack = getCurrentTrack();
            Object obj = playerstate.track();
            if (obj != null && (playertrack == null || !TextUtils.equals(playertrack.uid(), ((PlayerTrack) (obj)).uid())))
            {
                PlayerTrack aplayertrack[] = playerstate.reverse();
                PlayerTrack aplayertrack1[] = playerstate.future();
                playerstate = new PlayerTrack[playerstate.reverse().length + playerstate.future().length + 1];
                System.arraycopy(aplayertrack, 0, playerstate, 0, aplayertrack.length);
                playerstate[aplayertrack.length] = obj;
                System.arraycopy(aplayertrack1, 0, playerstate, aplayertrack.length + 1, aplayertrack1.length);
                obj = gpl.a(mRadioStationModel.nextPageUrl, playerstate);
                mRadioStationModel = new RadioStationModel(mRadioStationModel.uri, mRadioStationModel.title, mRadioStationModel.titleUri, mRadioStationModel.imageUri, mRadioStationModel.subtitle, mRadioStationModel.subtitleUri, mRadioStationModel.seeds, mRadioStationModel.relatedArtists, playerstate, ((String) (obj)), mRadioStationModel.explicitSave);
                mIndex = aplayertrack.length;
                mLastUpdateTime = System.currentTimeMillis();
            }
        }
    }
}
