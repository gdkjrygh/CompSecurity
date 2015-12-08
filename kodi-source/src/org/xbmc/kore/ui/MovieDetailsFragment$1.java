// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.ImageView;
import android.widget.ScrollView;

// Referenced classes of package org.xbmc.kore.ui:
//            MovieDetailsFragment

class val.pixelsToTransparent
    implements android.view.llChangedListener
{

    final MovieDetailsFragment this$0;
    final int val$pixelsToTransparent;

    public void onScrollChanged()
    {
        float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)val$pixelsToTransparent));
        mediaArt.setAlpha(f);
    }

    angedListener()
    {
        this$0 = final_moviedetailsfragment;
        val$pixelsToTransparent = I.this;
        super();
    }
}
