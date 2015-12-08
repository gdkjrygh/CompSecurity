// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.res.Resources;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.waveform.WaveformFetchCommand;

// Referenced classes of package com.soundcloud.android.offline:
//            WaveformStorage

class OfflineTrackAssetDownloader
{

    private final ImageOperations imageOperations;
    private final Resources resources;
    private final WaveformFetchCommand waveformFetchCommand;
    private final WaveformStorage waveformStorage;

    public OfflineTrackAssetDownloader(ImageOperations imageoperations, Resources resources1, WaveformFetchCommand waveformfetchcommand, WaveformStorage waveformstorage)
    {
        waveformFetchCommand = waveformfetchcommand;
        waveformStorage = waveformstorage;
        imageOperations = imageoperations;
        resources = resources1;
    }

    public void fetchTrackArtwork(Urn urn)
    {
        (new StringBuilder("Prefetch artwork called for: ")).append(urn);
        ApiImageSize apiimagesize = ApiImageSize.getFullImageSize(resources);
        imageOperations.precacheTrackArtwork(urn, apiimagesize);
        apiimagesize = ApiImageSize.getListItemImageSize(resources);
        imageOperations.precacheTrackArtwork(urn, apiimagesize);
    }

    public void fetchTrackWaveform(Urn urn, String s)
    {
        (new StringBuilder("Prefetch waveform called for: ")).append(urn);
        if (waveformStorage.hasWaveform(urn))
        {
            break MISSING_BLOCK_LABEL_41;
        }
        waveformStorage.store(urn, waveformFetchCommand.call(s));
        return;
        s;
        ErrorUtils.handleSilentException((new StringBuilder("Failed to download waveform for track: ")).append(urn).toString(), s);
        return;
    }
}
