// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;

// Referenced classes of package com.yume.android.player:
//            ar

final class aw
    implements android.media.MediaPlayer.OnErrorListener
{

    private ar a;

    aw(ar ar1)
    {
        a = ar1;
        super();
    }

    public final boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a.a = -1;
        a.b = -1;
        if (a.m != null)
        {
            if (!a.m.onError(a.d, i, j));
        }
        return true;
    }
}
