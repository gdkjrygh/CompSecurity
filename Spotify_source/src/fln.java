// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.OrientationEventListener;
import com.spotify.mobile.android.spotlets.videoplayer.FullscreenVideoActivity;
import com.spotify.mobile.android.spotlets.videoplayer.VideoPresenter;

public final class fln extends OrientationEventListener
{

    private FullscreenVideoActivity a;

    public fln(FullscreenVideoActivity fullscreenvideoactivity, Context context)
    {
        a = fullscreenvideoactivity;
        super(context);
    }

    public final void onOrientationChanged(int i)
    {
label0:
        {
            VideoPresenter videopresenter = FullscreenVideoActivity.b(a);
            if (videopresenter.e)
            {
                if (!videopresenter.c.a(i))
                {
                    break label0;
                }
                videopresenter.e = false;
            }
            if (videopresenter.c.a())
            {
                if (videopresenter.c.a(i))
                {
                    videopresenter.b.f(true);
                } else
                {
                    flr flr1 = videopresenter.c;
                    boolean flag;
                    if (flr1.a == 1)
                    {
                        flag = flr.b(i);
                    } else
                    if (flr1.a == 2)
                    {
                        flag = flr.c(i);
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        videopresenter.b.f(false);
                        return;
                    }
                }
            }
        }
    }
}
