// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import android.view.View;
import gck;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            AnnotatePlaylistActivity

final class a
    implements gck
{

    private AnnotatePlaylistActivity a;

    public final void d(boolean flag)
    {
        AnnotatePlaylistActivity.a(a, flag);
        View view = AnnotatePlaylistActivity.h(a);
        byte byte0;
        if (AnnotatePlaylistActivity.g(a))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        AnnotatePlaylistActivity.i(a);
    }

    (AnnotatePlaylistActivity annotateplaylistactivity)
    {
        a = annotateplaylistactivity;
        super();
    }
}
