// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.Recording;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UploadService

private static class recording
{

    final Recording recording;
    PublicApiTrack track;

    public String toString()
    {
        return (new StringBuilder("Upload{recording=")).append(recording).append(", playbackStream=").append(recording.getPlaybackStream()).append('}').toString();
    }

    public A(Recording recording1)
    {
        recording = recording1;
    }
}
