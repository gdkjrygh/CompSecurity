// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Intent;
import android.util.SparseArray;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.java.objects.MoreObjects;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.playback:
//            Player, PlaybackProgress

public static class 
{

    public static final  DEFAULT;
    private static final String DURATION_EXTRA = "DURATION_EXTRA";
    public static final int EXTRA_CONNECTION_TYPE = 2;
    public static final int EXTRA_NETWORK_AND_WAKE_LOCKS_ACTIVE = 3;
    public static final int EXTRA_PLAYBACK_PROTOCOL = 0;
    public static final int EXTRA_PLAYER_TYPE = 1;
    public static final int EXTRA_URI = 4;
    private static final String PROGRESS_EXTRA = "PROGRESS_EXTRA";
    private static final String TRACK_URN_EXTRA = "TRACK_URN_EXTRA";
    private final SparseArray extraAttributes;
    private final  newState;
    private final PlaybackProgress progress;
    private final  reason;
    private final Urn trackUrn;

    public void addExtraAttribute(int i, String s)
    {
        extraAttributes.put(i, s);
    }

    public void addToIntent(Intent intent)
    {
        ss._mth000(newState, intent);
        _mth0(reason, intent);
        intent.putExtra("TRACK_URN_EXTRA", getTrackUrn());
        intent.putExtra("PROGRESS_EXTRA", progress.getPosition());
        intent.putExtra("DURATION_EXTRA", progress.getDuration());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ation)obj;
            if (!MoreObjects.equal(newState, ((newState) (obj)).newState) || !MoreObjects.equal(reason, ((reason) (obj)).reason) || !MoreObjects.equal(progress, ((progress) (obj)).progress) || !MoreObjects.equal(trackUrn, ((trackUrn) (obj)).trackUrn))
            {
                return false;
            }
        }
        return true;
    }

    public String getExtraAttribute(int i)
    {
        return (String)extraAttributes.get(i);
    }

    public extraAttributes getNewState()
    {
        return newState;
    }

    public PlaybackProgress getProgress()
    {
        return progress;
    }

    public progress getReason()
    {
        return reason;
    }

    public Urn getTrackUrn()
    {
        return trackUrn;
    }

    public int hashCode()
    {
        int j = newState.Code();
        int k = reason.reason();
        int l = progress.hashCode();
        int i;
        if (trackUrn != null)
        {
            i = trackUrn.hashCode();
        } else
        {
            i = 0;
        }
        return i + ((j * 31 + k) * 31 + l) * 31;
    }

    public boolean isBuffering()
    {
        return newState.ffering();
    }

    public boolean isForTrack(Urn urn)
    {
        return trackUrn != null && trackUrn.equals(urn);
    }

    public boolean isPaused()
    {
        return newState ==  && reason == reason;
    }

    public boolean isPlayQueueComplete()
    {
        return reason == E_COMPLETE;
    }

    public boolean isPlayerIdle()
    {
        return newState == ;
    }

    public boolean isPlayerPlaying()
    {
        return newState.ayerPlaying();
    }

    boolean isPlaying()
    {
        return newState.aying();
    }

    public boolean playSessionIsActive()
    {
        return newState.aying() || newState ==  && reason == PLETE;
    }

    public boolean playbackHasStopped()
    {
        return STOPPED.contains(reason);
    }

    public String toString()
    {
        return (new StringBuilder("StateTransition{newState=")).append(newState).append(", reason=").append(reason).append(", currentProgress=").append(progress.getPosition()).append(", duration=").append(progress.getDuration()).append(", trackUrn=").append(trackUrn).append(", extraAttributes=").append(extraAttributes).append('}').toString();
    }

    public boolean trackEnded()
    {
        return newState ==  && reason == PLETE;
    }

    public boolean wasError()
    {
        return PLETE.contains(reason);
    }

    public boolean wasGeneralFailure()
    {
        return reason == LED;
    }

    static 
    {
        DEFAULT = new <init>(, , Urn.NOT_SET);
    }

    public ( ,  1, Urn urn)
    {
        this(, 1, urn, 0L, 0L);
    }

    public <init>(<init> <init>1, <init> <init>2, Urn urn, long l, long l1)
    {
        this(<init>1, <init>2, urn, l, l1, new CurrentDateProvider());
    }

    public ( ,  1, Urn urn, long l, long l1, 
            CurrentDateProvider currentdateprovider)
    {
        extraAttributes = new SparseArray(2);
        newState = ;
        reason = 1;
        trackUrn = urn;
        progress = new PlaybackProgress(l, l1, currentdateprovider);
    }
}
