// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

class AudioTrackEvent extends MediaPlayerEvent
{

    private final AudioTrack _audioTrack;

    private AudioTrackEvent(MediaPlayerEvent.Type type, AudioTrack audiotrack)
    {
        super(type);
        _audioTrack = audiotrack;
    }

    public static AudioTrackEvent createAudioTrackFailedEvent(AudioTrack audiotrack)
    {
        AudioTrackEvent audiotrackevent = new AudioTrackEvent(MediaPlayerEvent.Type.AUDIO_TRACK_FAILED, audiotrack);
        MediaPlayerNotification.Error error = new MediaPlayerNotification.Error(MediaPlayerNotification.ErrorCode.AUDIO_TRACK_ERROR, "An error related to an audio track occured.");
        MetadataNode metadatanode = new MetadataNode();
        metadatanode.setValue("AUDIO_TRACK_NAME", audiotrack.getName());
        metadatanode.setValue("AUDIO_TRACK_LANGUAGE", audiotrack.getLanguage());
        error.setMetadata(metadatanode);
        audiotrackevent.setNotification(error);
        return audiotrackevent;
    }

    public AudioTrack getAudioTrack()
    {
        return _audioTrack;
    }
}
