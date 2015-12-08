// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoView, AdMarvelVideoActivity

class this._cls0
    implements android.view.ck
{

    final AdMarvelVideoView this$0;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        boolean flag = true;
        AdMarvelVideoView.access$19(AdMarvelVideoView.this, j);
        AdMarvelVideoView.access$20(AdMarvelVideoView.this, k);
        if (AdMarvelVideoView.access$14(AdMarvelVideoView.this) == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (AdMarvelVideoView.access$2(AdMarvelVideoView.this) == j && AdMarvelVideoView.access$3(AdMarvelVideoView.this) == k)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (AdMarvelVideoView.access$9(AdMarvelVideoView.this) != null && i != 0 && j != 0)
        {
            if (AdMarvelVideoView.access$11(AdMarvelVideoView.this) != 0)
            {
                seekTo(AdMarvelVideoView.access$11(AdMarvelVideoView.this));
            }
            start();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        AdMarvelVideoView.access$21(AdMarvelVideoView.this, surfaceholder);
        if (AdMarvelVideoView.access$22(AdMarvelVideoView.this) != null)
        {
            surfaceholder = (AdMarvelVideoActivity)AdMarvelVideoView.access$22(AdMarvelVideoView.this).get();
            if (surfaceholder != null && ((AdMarvelVideoActivity) (surfaceholder)).videoState != y.VideoPlayerState.Stopped && ((AdMarvelVideoActivity) (surfaceholder)).videoState != y.VideoPlayerState.Finished && ((AdMarvelVideoActivity) (surfaceholder)).videoState != y.VideoPlayerState.PausedByToolbar)
            {
                AdMarvelVideoView.access$23(AdMarvelVideoView.this);
            }
            return;
        } else
        {
            AdMarvelVideoView.access$23(AdMarvelVideoView.this);
            return;
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        AdMarvelVideoView.access$21(AdMarvelVideoView.this, null);
        release(true);
    }

    y.VideoPlayerState()
    {
        this$0 = AdMarvelVideoView.this;
        super();
    }
}
