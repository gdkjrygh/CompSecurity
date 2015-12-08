// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.view.SurfaceHolder;
import android.widget.MediaController;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

class this._cls0
    implements android.view.r.Callback
{

    final VideoView this$0;

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        VideoView.access$17(VideoView.this, j);
        VideoView.access$18(VideoView.this, k);
        if (VideoView.access$11(VideoView.this) == 3)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (VideoView.access$2(VideoView.this) == j && VideoView.access$3(VideoView.this) == k)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (VideoView.access$6(VideoView.this) != null && i != 0 && j != 0)
        {
            if (VideoView.access$8(VideoView.this) != 0)
            {
                seekTo(VideoView.access$8(VideoView.this));
            }
            start();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        VideoView.access$19(VideoView.this, surfaceholder);
        VideoView.access$20(VideoView.this);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        VideoView.access$19(VideoView.this, null);
        if (VideoView.access$7(VideoView.this) != null)
        {
            VideoView.access$7(VideoView.this).hide();
        }
        VideoView.access$21(VideoView.this, true);
    }

    ()
    {
        this$0 = VideoView.this;
        super();
    }
}
