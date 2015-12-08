// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.info.ClosedCaptionsTrack;
import java.util.List;

// Referenced classes of package com.adobe.mediacore:
//            MediaResource

public interface MediaPlayerItem
{

    public abstract List getAdTags();

    public abstract List getAudioTracks();

    public abstract List getAvailablePlaybackRates();

    public abstract List getClosedCaptionsTracks();

    public abstract List getDRMMetadataInfos();

    public abstract List getProfiles();

    public abstract MediaResource getResource();

    public abstract AudioTrack getSelectedAudioTrack();

    public abstract ClosedCaptionsTrack getSelectedClosedCaptionsTrack();

    public abstract List getTimedMetadata();

    public abstract boolean hasAlternateAudio();

    public abstract boolean hasClosedCaptions();

    public abstract boolean hasTimedMetadata();

    public abstract boolean isDynamic();

    public abstract boolean isLive();

    public abstract boolean isProtected();

    public abstract boolean isTrickPlaySupported();

    public abstract boolean selectAudioTrack(AudioTrack audiotrack);

    public abstract boolean selectClosedCaptionsTrack(ClosedCaptionsTrack closedcaptionstrack);
}
