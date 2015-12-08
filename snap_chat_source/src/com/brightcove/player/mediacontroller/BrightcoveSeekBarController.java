// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller;

import android.widget.SeekBar;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller:
//            BrightcoveSeekBar

public class BrightcoveSeekBarController extends AbstractComponent
{
    final class a
        implements EventListener
    {

        private BrightcoveSeekBarController a;

        public final void processEvent(Event event)
        {
            a.setBufferedPercent(event.getIntegerProperty("percentComplete"));
        }

        private a()
        {
            a = BrightcoveSeekBarController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    final class b
        implements EventListener
    {

        private BrightcoveSeekBarController a;

        public final void processEvent(Event event)
        {
            BrightcoveSeekBarController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            int i = event.getIntegerProperty("duration");
            if (i != -1)
            {
                BrightcoveSeekBarController.a(a).setMax(i);
            }
        }

        private b()
        {
            a = BrightcoveSeekBarController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements EventListener
    {

        private BrightcoveSeekBarController a;

        public final void processEvent(Event event)
        {
            BrightcoveSeekBarController.a(a).setVisibility(4);
        }

        private c()
        {
            a = BrightcoveSeekBarController.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        private int a;
        private int b;
        private BaseVideoView c;
        private BrightcoveSeekBarController d;

        public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            int j = Math.abs(i - a);
            if (!flag || j < b)
            {
                return;
            } else
            {
                a = i;
                BrightcoveSeekBarController.a(d, i);
                BrightcoveSeekBarController.c(d).emit("showMediaControls");
                return;
            }
        }

        public final void onStartTrackingTouch(SeekBar seekbar)
        {
            BrightcoveSeekBarController.b(d).emit("showMediaControls");
            d.setDragging(true);
            b = Math.round((float)seekbar.getMax() * 0.01F);
        }

        public final void onStopTrackingTouch(SeekBar seekbar)
        {
            int i = seekbar.getProgress();
            c.seekTo(i);
            BrightcoveSeekBarController.a(d, i);
            BrightcoveSeekBarController.d(d).emit("showMediaControls");
            d.setDragging(false);
        }

        public d(BaseVideoView basevideoview)
        {
            d = BrightcoveSeekBarController.this;
            super();
            a = -1;
            b = 10;
            c = basevideoview;
        }
    }

    final class e
        implements EventListener
    {

        private BrightcoveSeekBarController a;

        public final void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("markerList")));
            if (event != null && (event instanceof int[]))
            {
                BrightcoveSeekBarController.a(a).getMarkers().clear();
                event = (int[])event;
                int j = event.length;
                for (int i = 0; i < j; i++)
                {
                    int k = event[i];
                    BrightcoveSeekBarController.a(a).addMarker(k);
                }

            }
        }

        private e()
        {
            a = BrightcoveSeekBarController.this;
            super();
        }

        e(byte byte0)
        {
            this();
        }
    }

    final class f
        implements EventListener
    {

        private BrightcoveSeekBarController a;

        public final void processEvent(Event event)
        {
            BrightcoveSeekBarController.a(a).setVisibility(0);
        }

        private f()
        {
            a = BrightcoveSeekBarController.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }


    private static final String a = com/brightcove/player/mediacontroller/BrightcoveSeekBarController.getSimpleName();
    private boolean b;
    private int c;
    private BrightcoveSeekBar d;

    public BrightcoveSeekBarController(BrightcoveSeekBar brightcoveseekbar, BaseVideoView basevideoview)
    {
        super(basevideoview.getEventEmitter());
        d = brightcoveseekbar;
        brightcoveseekbar.setOnSeekBarChangeListener(new d(basevideoview));
        addListener("setMarkers", new e((byte)0));
        addListener("bufferedUpdate", new a((byte)0));
        addListener("hideSeekControls", new c((byte)0));
        addListener("showSeekControls", new f((byte)0));
        addListener("videoDurationChanged", new b((byte)0));
    }

    static BrightcoveSeekBar a(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.d;
    }

    static String a()
    {
        return a;
    }

    static void a(BrightcoveSeekBarController brightcoveseekbarcontroller, int i)
    {
        if (i != -1)
        {
            String.format("Setting seekbar progress to %s.", new Object[] {
                Integer.valueOf(i)
            });
            brightcoveseekbarcontroller.d.setProgress(i);
        }
        String.format("Setting seekbar secondary progress to %s.", new Object[] {
            Integer.valueOf((brightcoveseekbarcontroller.d.getMax() * brightcoveseekbarcontroller.getBufferedPercent()) / 100)
        });
        brightcoveseekbarcontroller.d.setSecondaryProgress((brightcoveseekbarcontroller.d.getMax() * brightcoveseekbarcontroller.getBufferedPercent()) / 100);
    }

    static EventEmitter b(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.eventEmitter;
    }

    static EventEmitter c(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.eventEmitter;
    }

    static EventEmitter d(BrightcoveSeekBarController brightcoveseekbarcontroller)
    {
        return brightcoveseekbarcontroller.eventEmitter;
    }

    public int getBufferedPercent()
    {
        return c;
    }

    public boolean isDragging()
    {
        return b;
    }

    public void setBufferedPercent(int i)
    {
        c = i;
    }

    public void setDragging(boolean flag)
    {
        b = flag;
    }

}
