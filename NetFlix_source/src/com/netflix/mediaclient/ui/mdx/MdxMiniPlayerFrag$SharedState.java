// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag

private static class <init>
{

    boolean controlsEnabled;
    float currRating;
    boolean isEpisodeReady;
    boolean isVideoUnshared;
    boolean isVolumeEnabled;
    int mostRecentVolume;
    boolean shouldShowSelf;

    public void reset()
    {
        Log.v("MdxMiniPlayerFrag", "resetting shared state");
        shouldShowSelf = false;
        controlsEnabled = false;
        isEpisodeReady = false;
        isVideoUnshared = false;
        isVolumeEnabled = false;
        currRating = -1F;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
