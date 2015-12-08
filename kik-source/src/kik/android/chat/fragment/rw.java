// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.VideoView;
import kik.android.widget.VideoKeyFrameView;

// Referenced classes of package kik.android.chat.fragment:
//            rv, VideoTrimmingFragment

final class rw
    implements Runnable
{

    final rv a;

    rw(rv rv1)
    {
        a = rv1;
        super();
    }

    public final void run()
    {
label0:
        {
            if (VideoTrimmingFragment.h(a.a))
            {
                if ((float)a.a._videoView.getCurrentPosition() / (float)VideoTrimmingFragment.c(a.a) >= a.a._videoKeyFrameView.b())
                {
                    break label0;
                }
                a.a._videoKeyFrameView.c(a.a._videoKeyFrameView.b());
            }
            return;
        }
        if ((float)a.a._videoView.getCurrentPosition() / (float)VideoTrimmingFragment.c(a.a) < a.a._videoKeyFrameView.d())
        {
            a.a._videoKeyFrameView.c(a.a._videoKeyFrameView.d());
            return;
        } else
        {
            a.a._videoKeyFrameView.c((float)a.a._videoView.getCurrentPosition() / (float)VideoTrimmingFragment.c(a.a));
            return;
        }
    }
}
