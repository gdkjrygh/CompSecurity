// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.display;

import android.media.MediaPlayer;

// Referenced classes of package com.brightcove.player.display:
//            VideoDisplayComponent

final class a
    implements android.media.hangedListener
{

    private VideoDisplayComponent a;

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        if (i != 0 && j != 0)
        {
            a.a(i, j);
        }
    }

    (VideoDisplayComponent videodisplaycomponent)
    {
        a = videodisplaycomponent;
        super();
    }
}
