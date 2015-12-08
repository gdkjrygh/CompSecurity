// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.media.MediaPlayer;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct, bm

class bt
    implements android.media.MediaPlayer.OnErrorListener
{

    final bm a;

    bt(bm bm)
    {
        a = bm;
        super();
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        ct.d((new StringBuilder()).append("Media player error: What: ").append(i).append(" Extra: ").append(j).toString());
        return false;
    }
}
