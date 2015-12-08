// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, dr

class ds
    implements android.media.MediaPlayer.OnPreparedListener
{

    final dr a;

    ds(dr dr1)
    {
        a = dr1;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        ct.d("WebView - Video Available");
        dr.f(a);
        mediaplayer.start();
    }
}
