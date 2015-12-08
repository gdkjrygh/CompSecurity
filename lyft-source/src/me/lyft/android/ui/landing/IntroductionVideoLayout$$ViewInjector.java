// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.View;
import android.widget.ImageView;
import me.lyft.android.controls.TextureVideoView;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionVideoLayout

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (IntroductionVideoLayout)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, IntroductionVideoLayout introductionvideolayout, Object obj)
    {
        introductionvideolayout.videoView = (TextureVideoView)viewinjector.videoView((View)viewinjector.videoView(obj, 0x7f0d041a, "field 'videoView'"), 0x7f0d041a, "field 'videoView'");
        introductionvideolayout.staticImageView = (ImageView)viewinjector.staticImageView((View)viewinjector.staticImageView(obj, 0x7f0d0419, "field 'staticImageView'"), 0x7f0d0419, "field 'staticImageView'");
    }

    public volatile void reset(Object obj)
    {
        reset((IntroductionVideoLayout)obj);
    }

    public void reset(IntroductionVideoLayout introductionvideolayout)
    {
        introductionvideolayout.videoView = null;
        introductionvideolayout.staticImageView = null;
    }

    public ()
    {
    }
}
