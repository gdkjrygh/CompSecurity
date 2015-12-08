// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.media.MediaPlayer;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoView

class this._cls0
    implements android.media.ingUpdateListener
{

    final AdMarvelVideoView this$0;

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        AdMarvelVideoView.access$18(AdMarvelVideoView.this, i);
    }

    stener()
    {
        this$0 = AdMarvelVideoView.this;
        super();
    }
}
