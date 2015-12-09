// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ar

final class av
    implements android.media.MediaPlayer.OnCompletionListener
{

    private ar a;

    av(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        a.a = 5;
        a.b = 5;
        if (a.i != null)
        {
            a.i.onCompletion(a.d);
        }
    }
}
