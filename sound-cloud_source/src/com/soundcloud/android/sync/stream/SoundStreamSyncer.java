// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.stream;

import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.timeline.TimelineSyncStorage;
import com.soundcloud.android.sync.timeline.TimelineSyncer;

// Referenced classes of package com.soundcloud.android.sync.stream:
//            StoreSoundStreamCommand, ReplaceSoundStreamCommand

public class SoundStreamSyncer extends TimelineSyncer
{

    public SoundStreamSyncer(ApiClient apiclient, StoreSoundStreamCommand storesoundstreamcommand, ReplaceSoundStreamCommand replacesoundstreamcommand, TimelineSyncStorage timelinesyncstorage)
    {
        super(ApiEndpoints.STREAM, Content.ME_SOUND_STREAM.uri, apiclient, storesoundstreamcommand, replacesoundstreamcommand, timelinesyncstorage, new _cls1());
    }

    private class _cls1 extends TypeToken
    {

        _cls1()
        {
        }
    }

}
