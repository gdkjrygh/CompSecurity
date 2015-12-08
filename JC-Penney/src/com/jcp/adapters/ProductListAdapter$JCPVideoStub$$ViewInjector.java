// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.jcp.views.JcpBrightcoveVideoView;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        . = (JcpBrightcoveVideoView)ctor.((View)ctor.(obj, 0x7f0e01d0, "field 'videoView'"), 0x7f0e01d0, "field 'videoView'");
        . = (ProgressBar)ctor.er((View)ctor.er(obj, 0x7f0e01d3, "field 'videoLoader'"), 0x7f0e01d3, "field 'videoLoader'");
        . = (RelativeLayout)ctor.out((View)ctor.out(obj, 0x7f0e01d2, "field 'loaderLayout'"), 0x7f0e01d2, "field 'loaderLayout'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.inject = null;
        inject1.inject = null;
        inject1.inject = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
