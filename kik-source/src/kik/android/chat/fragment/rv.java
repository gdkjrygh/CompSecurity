// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.VideoView;
import kik.android.util.bf;

// Referenced classes of package kik.android.chat.fragment:
//            rw, VideoTrimmingFragment, rx

final class rv extends bf
{

    final VideoTrimmingFragment a;

    rv(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
_L4:
        a.b(new rw(this));
        if ((float)a._videoView.getCurrentPosition() < VideoTrimmingFragment.b(a) * 1000F) goto _L2; else goto _L1
_L1:
        VideoTrimmingFragment.a(a, false);
        a._videoView.pause();
        a._videoView.seekTo((int)VideoTrimmingFragment.a(a) * 1000);
        a.b(new rx(this));
_L3:
        VideoTrimmingFragment.i(a);
        return null;
_L2:
        if (a._videoView.isPlaying()) goto _L4; else goto _L3
    }
}
