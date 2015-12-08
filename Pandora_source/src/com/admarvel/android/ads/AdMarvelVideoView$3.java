// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoView

class this._cls0
    implements android.media.tionListener
{

    final AdMarvelVideoView this$0;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        AdMarvelVideoView.access$4(AdMarvelVideoView.this, 5);
        AdMarvelVideoView.access$15(AdMarvelVideoView.this, 5);
        if (AdMarvelVideoView.access$16(AdMarvelVideoView.this) != null)
        {
            AdMarvelVideoView.access$16(AdMarvelVideoView.this).onCompletion(AdMarvelVideoView.access$9(AdMarvelVideoView.this));
        }
    }

    r()
    {
        this$0 = AdMarvelVideoView.this;
        super();
    }
}
