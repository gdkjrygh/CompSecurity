// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerFrameLayout, PlayerView

public class 
    implements butterknife.layerView..ViewBinder
{

    public void bind(butterknife.layerView..ViewBinder viewbinder, PlayerView playerview, Object obj)
    {
        playerview.playerFrame = (PlayerFrameLayout)viewbinder.View((View)viewbinder.RequiredView(obj, 0x7f0f01c9, "field 'playerFrame'"), 0x7f0f01c9, "field 'playerFrame'");
        playerview.posterArt = (ImageView)viewbinder.View((View)viewbinder.RequiredView(obj, 0x7f0f01ca, "field 'posterArt'"), 0x7f0f01ca, "field 'posterArt'");
        playerview.progress = (ProgressBar)viewbinder.View((View)viewbinder.RequiredView(obj, 0x7f0f017b, "field 'progress'"), 0x7f0f017b, "field 'progress'");
        playerview.qosStub = (ViewStub)viewbinder.View((View)viewbinder.RequiredView(obj, 0x7f0f01cb, "field 'qosStub'"), 0x7f0f01cb, "field 'qosStub'");
    }

    public volatile void bind(butterknife.layerView..ViewBinder viewbinder, Object obj, Object obj1)
    {
        bind(viewbinder, (PlayerView)obj, obj1);
    }

    public void unbind(PlayerView playerview)
    {
        playerview.playerFrame = null;
        playerview.posterArt = null;
        playerview.progress = null;
        playerview.qosStub = null;
    }

    public volatile void unbind(Object obj)
    {
        unbind((PlayerView)obj);
    }

    public ()
    {
    }
}
