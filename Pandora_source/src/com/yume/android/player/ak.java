// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            aq, ai

final class ak
    implements android.media.MediaPlayer.OnCompletionListener
{

    private ai a;

    ak(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        a.h = aq.e;
        a.d();
    }
}
