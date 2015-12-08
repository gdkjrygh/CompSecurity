// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.fragments;

import android.media.MediaPlayer;

// Referenced classes of package com.accuweather.android.fragments:
//            VideoDetailsFragment

class this._cls0
    implements android.media.nListener
{

    final VideoDetailsFragment this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (VideoDetailsFragment.access$000(VideoDetailsFragment.this) != null)
        {
            VideoDetailsFragment.access$102(VideoDetailsFragment.this, 0);
            VideoDetailsFragment.access$000(VideoDetailsFragment.this).onVideoCompleted();
        }
    }

    ideoDetailsFragmentListener()
    {
        this$0 = VideoDetailsFragment.this;
        super();
    }
}
