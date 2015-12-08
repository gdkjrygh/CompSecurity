// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.VideoView;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class sa
    implements android.view.View.OnClickListener
{

    final VideoTrimmingFragment a;

    sa(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final void onClick(View view)
    {
        VideoTrimmingFragment.a(a, true);
        cv.e(new View[] {
            a._videoPlayIcon
        });
        a._videoView.start();
        if (VideoTrimmingFragment.k(a) == null)
        {
            VideoTrimmingFragment.l(a);
        }
    }
}
