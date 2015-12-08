// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.view.adapters;

import android.media.MediaPlayer;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.android.util.cv;
import kik.android.widget.ProgressWheel;

// Referenced classes of package com.kik.view.adapters:
//            bf

final class bt
    implements android.media.MediaPlayer.OnPreparedListener
{

    final bf.b a;
    final s b;
    final a c;
    final long d;
    final boolean e;
    final TextureView f;
    final bf g;

    bt(bf bf1, bf.b b1, s s, a a1, long l, boolean flag, 
            TextureView textureview)
    {
        g = bf1;
        a = b1;
        b = s;
        c = a1;
        d = l;
        e = flag;
        f = textureview;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        ProgressWheel progresswheel = ((bf.b)a).w;
        if (progresswheel != null)
        {
            progresswheel.a();
        }
        g.a(a, b);
        if (!c.A()) goto _L2; else goto _L1
_L1:
        mediaplayer.setVolume(0.0F, 0.0F);
_L4:
        g.e.b("Video Playback Begin").a("App ID", c.u()).a("Is Inline", true).a("Loading Duration", (double)(System.currentTimeMillis() - d) / 1000D).a("Video Length", (double)mediaplayer.getDuration() / 1000D).a("Was Cached", e).a("Autoplay", c.y()).a("Looping", c.z()).a("Muted", c.A()).a("Did Autoplay", a.z).b();
        f.bringToFront();
        a.u.bringToFront();
        return;
_L2:
        if (a.z)
        {
            cv.b(new View[] {
                a.u
            });
            mediaplayer.setVolume(0.0F, 0.0F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
