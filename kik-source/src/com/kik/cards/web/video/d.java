// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.video;

import android.media.MediaPlayer;
import kik.android.chat.fragment.WebVideoFragment;
import kik.android.widget.WebVideoView;

// Referenced classes of package com.kik.cards.web.video:
//            b

final class d
    implements android.media.MediaPlayer.OnPreparedListener
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        if (b.a(a) != null)
        {
            b.b(a).l();
            b.a(a).d();
            if (b.c(a))
            {
                b.b(a).a();
                b.a(a).a();
            }
        }
        b.d(a);
        b.a(a, false);
    }
}
