// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.util.TimeUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements com.netflix.mediaclient.android.widget.appableSeekBarChangeListener
{

    private long lastProgressChangeTime;
    final MdxMiniPlayerViews this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).onProgressChanged(seekbar, i, flag);
        while (!flag || TimeUtils.convertNsToMs(System.nanoTime() - lastProgressChangeTime) < -1L) 
        {
            return;
        }
        lastProgressChangeTime = System.nanoTime();
        if (ServiceManagerUtils.isMdxAgentAvailable(MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getManager()))
        {
            com.netflix.mediaclient.media.BifInView(MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getMdx().getBifFrame(i * 1000), MdxMiniPlayerViews.access$400(MdxMiniPlayerViews.this));
        }
        MdxMiniPlayerViews.access$800(MdxMiniPlayerViews.this, i);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        Log.v("MdxMiniPlayerViews", "onStartTrackingTouch");
        MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).onStartTrackingTouch(seekbar);
        MdxMiniPlayerViews.access$100(MdxMiniPlayerViews.this).setVisibility(4);
        MdxMiniPlayerViews.access$300(MdxMiniPlayerViews.this, new View[] {
            MdxMiniPlayerViews.access$200(MdxMiniPlayerViews.this)
        });
        MdxMiniPlayerViews.access$600(MdxMiniPlayerViews.this, new View[] {
            MdxMiniPlayerViews.access$400(MdxMiniPlayerViews.this), MdxMiniPlayerViews.access$500(MdxMiniPlayerViews.this)
        });
        MdxMiniPlayerViews.access$700(MdxMiniPlayerViews.this, true);
    }

    public void onStopTrackingTouch(SeekBar seekbar, boolean flag)
    {
        Log.v("MdxMiniPlayerViews", (new StringBuilder()).append("onStopTrackingTouch, isInSnapRegion: ").append(flag).toString());
        MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).onStopTrackingTouch(seekbar, flag);
        lastProgressChangeTime = 0L;
        if (flag)
        {
            MdxMiniPlayerViews.access$800(MdxMiniPlayerViews.this, seekbar.getProgress());
        } else
        {
            onProgressChanged(seekbar, seekbar.getProgress(), true);
        }
        showArtworkAndHideBif();
        MdxMiniPlayerViews.access$700(MdxMiniPlayerViews.this, false);
        if (!flag)
        {
            setControlsEnabled(false);
        }
    }

    ls()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
