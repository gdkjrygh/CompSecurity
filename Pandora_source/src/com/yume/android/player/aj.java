// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.media.MediaPlayer;
import android.widget.FrameLayout;

// Referenced classes of package com.yume.android.player:
//            ai, B, ar

final class aj
    implements android.media.MediaPlayer.OnPreparedListener
{

    private ai a;

    aj(ai ai1)
    {
        a = ai1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        a.a.b("Ad ready for playing.");
        a.e = true;
        if (a.d)
        {
            return;
        }
        a.b.invalidate();
        if (a.c != null)
        {
            a.c.j = null;
        }
        a.b();
        a.a(0);
        a.a();
        if (a.c != null)
        {
            a.c.invalidate();
        }
        try
        {
            a.i();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            mediaplayer.printStackTrace();
        }
    }
}
