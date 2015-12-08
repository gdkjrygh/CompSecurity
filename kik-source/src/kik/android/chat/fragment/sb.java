// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class sb
    implements android.view.View.OnTouchListener
{

    final VideoTrimmingFragment a;

    sb(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = a;
        boolean flag;
        if (!VideoTrimmingFragment.h(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        VideoTrimmingFragment.a(view, flag);
        if (VideoTrimmingFragment.h(a))
        {
            cv.e(new View[] {
                a._videoPlayIcon
            });
            a._videoView.start();
            if (VideoTrimmingFragment.k(a) == null)
            {
                VideoTrimmingFragment.l(a);
            }
            return false;
        } else
        {
            a._videoView.pause();
            cv.b(new View[] {
                a._videoPlayIcon
            });
            return false;
        }
    }
}
