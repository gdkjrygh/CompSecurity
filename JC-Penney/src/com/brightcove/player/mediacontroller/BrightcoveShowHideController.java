// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            ShowHideController, d, r, BrightcoveControlBar, 
//            s, q

public class BrightcoveShowHideController extends AbstractComponent
    implements ShowHideController
{

    private static final String a = com/brightcove/player/mediacontroller/BrightcoveShowHideController.getSimpleName();
    private int b;
    private r c;
    private BrightcoveControlBar d;
    private float e;
    private s f;
    private d g;
    private int h;
    private boolean i;

    public BrightcoveShowHideController(BrightcoveControlBar brightcovecontrolbar, BaseVideoView basevideoview)
    {
        super(basevideoview.getEventEmitter());
        b = 0;
        g = d.a;
        h = 3000;
        d = brightcovecontrolbar;
        b = basevideoview.getContext().getResources().getInteger(0x10e0000);
        if (android.os.Build.VERSION.SDK_INT > 12)
        {
            c = new r(this, null);
            e = brightcovecontrolbar.getY();
        }
        f = new s(this);
    }

    static BrightcoveControlBar a(BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        return brightcoveshowhidecontroller.d;
    }

    public void hide()
    {
        i = false;
        if (android.os.Build.VERSION.SDK_INT >= 12) goto _L2; else goto _L1
_L1:
        d.setVisibility(8);
_L4:
        F.emit("didHideMediaControls");
        return;
_L2:
        switch (q.a[g.ordinal()])
        {
        default:
            d.animate().alpha(0.0F).setDuration(b).setListener(c);
            break;

        case 1: // '\001'
            d.animate().setInterpolator(new DecelerateInterpolator(1.0F)).setDuration(b).translationY(e + (float)d.getHeight()).setListener(c);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isShowing()
    {
        return i;
    }

    public void setShowHideAnimationStyle(d d1)
    {
        g = d1;
    }

    public void setShowHideTimeout(int j)
    {
        h = j;
        if (h == 0)
        {
            f.removeMessages(1);
        }
    }

    public void show()
    {
        Log.d(a, String.format("Showing the media controls.  They will be hidden in %d milliseconds using animation style: %s.", new Object[] {
            Integer.valueOf(h), g
        }));
        i = true;
        d.setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT < 12) goto _L2; else goto _L1
_L1:
        q.a[g.ordinal()];
        JVM INSTR tableswitch 1 1: default 84
    //                   1 186;
           goto _L3 _L4
_L3:
        d.animate().alpha(1.0F).setDuration(b).setListener(null);
_L2:
        HashMap hashmap = new HashMap();
        hashmap.put("controlsHeight", Integer.valueOf(d.getHeight()));
        F.emit("didShowMediaControls", hashmap);
        f.removeMessages(1);
        if (h > 0)
        {
            android.os.Message message = f.obtainMessage(1);
            f.sendMessageDelayed(message, h);
        }
        return;
_L4:
        d.animate().setInterpolator(new DecelerateInterpolator(1.0F)).setDuration(b).translationY(e).setListener(null);
        if (true) goto _L2; else goto _L5
_L5:
    }

}
