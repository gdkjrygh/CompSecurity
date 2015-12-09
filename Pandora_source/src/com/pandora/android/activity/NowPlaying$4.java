// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.android.view.TrackView;
import p.ca.bd;

// Referenced classes of package com.pandora.android.activity:
//            NowPlaying

class a
    implements Runnable
{

    final TrackView a;
    final NowPlaying b;

    public void run()
    {
        a.a(false);
        if (!a.k())
        {
            NowPlaying.h(b).a(a, -0.9F);
        }
    }

    (NowPlaying nowplaying, TrackView trackview)
    {
        b = nowplaying;
        a = trackview;
        super();
    }
}
