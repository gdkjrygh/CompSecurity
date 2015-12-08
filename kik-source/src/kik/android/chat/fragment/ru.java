// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.widget.TextView;
import android.widget.VideoView;

// Referenced classes of package kik.android.chat.fragment:
//            VideoTrimmingFragment

final class ru
    implements kik.android.widget.VideoKeyFrameView.b
{

    final VideoTrimmingFragment a;

    ru(VideoTrimmingFragment videotrimmingfragment)
    {
        a = videotrimmingfragment;
        super();
    }

    public final void a(float f, int i)
    {
        if (a._videoView == null)
        {
            return;
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            try
            {
                VideoTrimmingFragment.f(a);
                a._videoView.seekTo((int)((float)VideoTrimmingFragment.c(a) * f));
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
            a._editedSizeText.setText(VideoTrimmingFragment.g(a));
            VideoTrimmingFragment.a(a, ((float)VideoTrimmingFragment.c(a) * f) / 1000F);
            return;

        case 2: // '\002'
            try
            {
                VideoTrimmingFragment.f(a);
            }
            catch (Exception exception1)
            {
                exception1.printStackTrace();
            }
            a._editedSizeText.setText(VideoTrimmingFragment.g(a));
            VideoTrimmingFragment.b(a, ((float)VideoTrimmingFragment.c(a) * f) / 1000F);
            return;

        case 3: // '\003'
            break;
        }
        try
        {
            a._videoView.seekTo((int)((float)VideoTrimmingFragment.c(a) * f));
            return;
        }
        catch (Exception exception2)
        {
            exception2.printStackTrace();
        }
    }
}
