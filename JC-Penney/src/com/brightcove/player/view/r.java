// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.widget.MediaController;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;

// Referenced classes of package com.brightcove.player.view:
//            t, BaseVideoView

class r
    implements t
{

    final BaseVideoView a;
    private BrightcoveMediaController b;

    public r(BaseVideoView basevideoview, BrightcoveMediaController brightcovemediacontroller)
    {
        a = basevideoview;
        super();
        b = brightcovemediacontroller;
    }

    public MediaController a()
    {
        return null;
    }

    public BrightcoveMediaController b()
    {
        return b;
    }

    public void c()
    {
        b.hide();
    }

    public boolean d()
    {
        return b.isShowing();
    }

    public void e()
    {
        b.show();
    }

    public void f()
    {
        if (d())
        {
            c();
            return;
        } else
        {
            e();
            return;
        }
    }

    public void g()
    {
    }
}
