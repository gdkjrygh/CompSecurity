// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import com.brightcove.player.controller.MediaControlsVisibilityManager;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;

// Referenced classes of package com.brightcove.player.view:
//            t, BaseVideoView

class s
    implements t
{

    final BaseVideoView a;
    private MediaController b;
    private boolean c;

    public s(BaseVideoView basevideoview, MediaController mediacontroller)
    {
        a = basevideoview;
        super();
        b = mediacontroller;
        d();
    }

    public MediaController a()
    {
        return b;
    }

    public BrightcoveMediaController b()
    {
        return null;
    }

    public void c()
    {
        if (a.e() && b != null)
        {
            b.hide();
            c = false;
        }
    }

    public void d()
    {
        Log.v(BaseVideoView.g(), "attachMediaController...");
        if (b != null)
        {
            b.setMediaPlayer(a);
            MediaController mediacontroller = b;
            Object obj;
            if (a.getParent() instanceof View)
            {
                obj = (View)a.getParent();
            } else
            {
                obj = a;
            }
            mediacontroller.setAnchorView(((View) (obj)));
            if (a.f())
            {
                b.setEnabled(true);
                BaseVideoView.i(a).setVisibilityState();
                e();
                if (a.h > 0)
                {
                    Log.v(BaseVideoView.g(), "MediaController is quietly jumping to where we left off.");
                }
            }
        }
    }

    public void e()
    {
        if (a.e() && b != null)
        {
            b.show();
            c = true;
        }
    }

    public void f()
    {
label0:
        {
            if (b != null && a.e())
            {
                if (!b.isShowing())
                {
                    break label0;
                }
                b.hide();
            }
            return;
        }
        b.show();
    }

    public void g()
    {
        if (b != null)
        {
            b.setMediaPlayer(a);
        }
    }
}
