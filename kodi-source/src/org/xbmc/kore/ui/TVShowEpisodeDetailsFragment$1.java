// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.widget.ImageView;
import android.widget.ScrollView;

// Referenced classes of package org.xbmc.kore.ui:
//            TVShowEpisodeDetailsFragment

class val.pixelsToTransparent
    implements android.view.dListener
{

    final TVShowEpisodeDetailsFragment this$0;
    final int val$pixelsToTransparent;

    public void onScrollChanged()
    {
        float f = Math.min(1.0F, Math.max(0.0F, 1.0F - (float)mediaPanel.getScrollY() / (float)val$pixelsToTransparent));
        mediaArt.setAlpha(f);
    }

    tener()
    {
        this$0 = final_tvshowepisodedetailsfragment;
        val$pixelsToTransparent = I.this;
        super();
    }
}
