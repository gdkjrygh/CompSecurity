// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            ShowHideController, BrightcoveControlBar

public class BrightcoveShowHideController extends AbstractComponent
    implements ShowHideController
{
    final class a extends AnimatorListenerAdapter
    {

        private BrightcoveShowHideController a;

        public final void onAnimationEnd(Animator animator)
        {
            BrightcoveShowHideController.a(a).setVisibility(8);
        }

        private a()
        {
            a = BrightcoveShowHideController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b extends Handler
    {

        private final WeakReference a;

        public final void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                message = (BrightcoveShowHideController)a.get();
                if (message != null)
                {
                    message.hide();
                }
            }
        }

        b(BrightcoveShowHideController brightcoveshowhidecontroller)
        {
            a = new WeakReference(brightcoveshowhidecontroller);
        }
    }


    private int a;
    private a b;
    private BrightcoveControlBar c;
    private BaseVideoView d;
    private float e;
    private b f;
    private BrightcoveMediaController.c g;
    private int h;
    private boolean i;

    public BrightcoveShowHideController(BrightcoveControlBar brightcovecontrolbar, BaseVideoView basevideoview)
    {
        super(basevideoview.getEventEmitter());
        a = 0;
        g = BrightcoveMediaController.c.a;
        h = 3000;
        c = brightcovecontrolbar;
        d = basevideoview;
        a = basevideoview.getContext().getResources().getInteger(0x10e0000);
        if (android.os.Build.VERSION.SDK_INT > 12)
        {
            b = new a((byte)0);
            e = brightcovecontrolbar.getY();
        }
        f = new b(this);
        brightcovecontrolbar = new EventListener() {

            private BrightcoveShowHideController a;

            public final void processEvent(Event event)
            {
                a.hide();
            }

            
            {
                a = BrightcoveShowHideController.this;
                super();
            }
        };
        EventListener eventlistener = new EventListener() {

            private BrightcoveShowHideController a;

            public final void processEvent(Event event)
            {
                a.show();
            }

            
            {
                a = BrightcoveShowHideController.this;
                super();
            }
        };
        basevideoview = basevideoview.getEventEmitter();
        basevideoview.on("showMediaControls", eventlistener);
        basevideoview.on("hideMediaControls", brightcovecontrolbar);
        basevideoview.on("enterFullScreen", brightcovecontrolbar);
        basevideoview.on("exitFullScreen", brightcovecontrolbar);
        basevideoview.on("didEnterFullScreen", brightcovecontrolbar);
        basevideoview.on("didExitFullScreen", brightcovecontrolbar);
    }

    static BrightcoveControlBar a(BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        return brightcoveshowhidecontroller.c;
    }

    static EventEmitter b(BrightcoveShowHideController brightcoveshowhidecontroller)
    {
        return brightcoveshowhidecontroller.eventEmitter;
    }

    public void hide()
    {
        i = false;
        if (android.os.Build.VERSION.SDK_INT >= 12) goto _L2; else goto _L1
_L1:
        c.setVisibility(8);
_L4:
        eventEmitter.emit("didHideMediaControls");
        return;
_L2:
        static final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[BrightcoveMediaController.c.values().length];
                try
                {
                    a[BrightcoveMediaController.c.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[BrightcoveMediaController.c.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[g.ordinal()])
        {
        default:
            c.animate().alpha(0.0F).setDuration(a).setListener(b);
            break;

        case 1: // '\001'
            c.animate().setInterpolator(new DecelerateInterpolator(1.0F)).setDuration(a).translationY(e + (float)c.getHeight()).setListener(b);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isShowing()
    {
        return i;
    }

    public void setShowHideAnimationStyle(BrightcoveMediaController.c c1)
    {
        g = c1;
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
        String.format("Showing the media controls.  They will be hidden in %d milliseconds using animation style: %s.", new Object[] {
            Integer.valueOf(h), g
        });
        int j = (d.getHeight() - d.getMeasuredVideoHeight()) / 2;
        ((android.widget.FrameLayout.LayoutParams)c.getLayoutParams()).setMargins(0, 0, 0, j);
        i = true;
        c.setVisibility(0);
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            switch (_cls4.a[g.ordinal()])
            {
            default:
                c.animate().alpha(1.0F).setDuration(a).setListener(null);
                break;

            case 1: // '\001'
                break MISSING_BLOCK_LABEL_207;
            }
        }
_L1:
        if (c.getHeight() == 0)
        {
            (new Handler()).postDelayed(new Runnable() {

                private BrightcoveShowHideController a;

                public final void run()
                {
                    HashMap hashmap1 = new HashMap();
                    hashmap1.put("controlsHeight", Integer.valueOf(BrightcoveShowHideController.a(a).getHeight()));
                    BrightcoveShowHideController.b(a).emit("didShowMediaControls", hashmap1);
                }

            
            {
                a = BrightcoveShowHideController.this;
                super();
            }
            }, 150L);
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("controlsHeight", Integer.valueOf(c.getHeight()));
            eventEmitter.emit("didShowMediaControls", hashmap);
        }
        f.removeMessages(1);
        if (h > 0)
        {
            Message message = f.obtainMessage(1);
            f.sendMessageDelayed(message, h);
        }
        return;
        c.animate().setInterpolator(new DecelerateInterpolator(1.0F)).setDuration(a).translationY(e).setListener(null);
          goto _L1
    }

    static 
    {
        com/brightcove/player/mediacontroller/BrightcoveShowHideController.getSimpleName();
    }
}
