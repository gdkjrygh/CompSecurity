// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoView

class this._cls0
    implements android.media.izeChangedListener
{

    final AdMarvelVideoView this$0;

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        AdMarvelVideoView.access$0(AdMarvelVideoView.this, mediaplayer.getVideoWidth());
        AdMarvelVideoView.access$1(AdMarvelVideoView.this, mediaplayer.getVideoHeight());
        if (AdMarvelVideoView.access$2(AdMarvelVideoView.this) != 0 && AdMarvelVideoView.access$3(AdMarvelVideoView.this) != 0)
        {
            getHolder().setFixedSize(AdMarvelVideoView.access$2(AdMarvelVideoView.this), AdMarvelVideoView.access$3(AdMarvelVideoView.this));
        }
    }

    istener()
    {
        this$0 = AdMarvelVideoView.this;
        super();
    }
}
