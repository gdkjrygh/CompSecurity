// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class 
    implements butterknife.ctor
{

    public void inject(butterknife.ctor ctor,  , Object obj)
    {
        .ar = (ProgressBar)ctor.ressBar((View)ctor.ressBar(obj, 0x7f0e0334, "field 'mMainProgressBar'"), 0x7f0e0334, "field 'mMainProgressBar'");
        .ar = (ImageView)ctor.((View)ctor.(obj, 0x7f0e0336, "field 'mPlayIcon'"), 0x7f0e0336, "field 'mPlayIcon'");
        .eView = (ImageView)ctor.lImageView((View)ctor.lImageView(obj, 0x7f0e0335, "field 'mThumbnailImageView'"), 0x7f0e0335, "field 'mThumbnailImageView'");
    }

    public volatile void inject(butterknife.ctor ctor, Object obj, Object obj1)
    {
        inject(ctor, (inject)obj, obj1);
    }

    public void reset(inject inject1)
    {
        inject1.ar = null;
        inject1.ar = null;
        inject1.eView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((reset)obj);
    }

    public ()
    {
    }
}
