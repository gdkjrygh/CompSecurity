// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package kik.android.widget:
//            WebVideoView, VideoController

final class ex
    implements android.view.SurfaceHolder.Callback
{

    final WebVideoView a;

    ex(WebVideoView webvideoview)
    {
        a = webvideoview;
        super();
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        WebVideoView.f(a, j);
        WebVideoView.g(a, k);
        WebVideoView.a(a, surfaceholder);
        if (WebVideoView.l(a) == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (WebVideoView.a(a) == j && WebVideoView.b(a) == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (WebVideoView.g(a) != null && i != 0 && j != 0)
        {
            if (WebVideoView.m(a) != -1)
            {
                a.a(WebVideoView.m(a));
            }
            if (WebVideoView.n(a) != 3)
            {
                a.a();
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        WebVideoView.a(a, surfaceholder);
        WebVideoView.a(a, WebVideoView.g(a).getVideoWidth());
        WebVideoView.b(a, WebVideoView.g(a).getVideoHeight());
        if (WebVideoView.a(a) != 0 && WebVideoView.b(a) != 0)
        {
            a.getHolder().setFixedSize(WebVideoView.a(a), WebVideoView.b(a));
        }
        WebVideoView.g(a).setDisplay(WebVideoView.o(a));
        WebVideoView.g(a).setScreenOnWhilePlaying(true);
        WebVideoView.o(a).setType(3);
        WebVideoView.p(a);
        WebVideoView.q(a);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        WebVideoView.h(a, a.d());
        WebVideoView.a(a, null);
        if (WebVideoView.h(a) != null)
        {
            WebVideoView.h(a).c();
        }
    }
}
