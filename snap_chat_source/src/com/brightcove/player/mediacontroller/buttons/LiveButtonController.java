// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.util.StringUtil;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState

public class LiveButtonController extends AbstractButtonController
{
    final class a
        implements EventListener
    {

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            LiveButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            int j = event.getIntegerProperty("duration");
            if (j > 0)
            {
                LiveButtonController.a();
                LiveButtonController.a(a, j);
                LiveButtonController.c(a).setMax(LiveButtonController.b(a));
                LiveButtonController.c(a).setProgress(LiveButtonController.b(a));
                LiveButtonController.d(a).setText(StringUtil.stringForTime(LiveButtonController.b(a)));
            }
            LiveButtonController.a();
            String.format("Current video duration: %1$d.", new Object[] {
                Integer.valueOf(LiveButtonController.b(a))
            });
        }

        private a()
        {
            a = LiveButtonController.this;
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

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            a.getButton().setVisibility(4);
        }

        private b()
        {
            a = LiveButtonController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    final class c
        implements android.view.View.OnClickListener
    {

        private LiveButtonController a;

        public final void onClick(View view)
        {
            LiveButtonController.a();
            a.c.seekToLive();
            a.getButton().setTextColor(LiveButtonController.e(a));
            if (!a.c.isPlaying())
            {
                a.c.start();
            }
        }

        private c()
        {
            a = LiveButtonController.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }

    final class d
        implements EventListener
    {

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            LiveButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            a.getButton().setTextColor(LiveButtonController.f(a));
        }

        private d()
        {
            a = LiveButtonController.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    final class e
        implements EventListener
    {

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            LiveButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            a.c.seekToLive();
            a.getButton().setTextColor(LiveButtonController.e(a));
            a.removeListener("videoDurationChanged");
        }

        private e()
        {
            a = LiveButtonController.this;
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

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            LiveButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            LiveButtonController.g(a);
            if (a.c.getVideoDisplay().isLive())
            {
                LiveButtonController.a(a);
                return;
            } else
            {
                LiveButtonController.h(a);
                return;
            }
        }

        private f()
        {
            a = LiveButtonController.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    final class g
        implements EventListener
    {

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            int k = event.getIntegerProperty("playheadPosition");
            int l = event.getIntegerProperty("segmentDuration");
            int j;
            if (k > 0 && l > 0 && k > LiveButtonController.b(a) - l * 3)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            LiveButtonController.a();
            if (j != 0)
            {
                event = "live";
            } else
            {
                event = "not live";
            }
            String.format("The video is %1$s, playhead position is %2$d, segmentDuration is %3$d.", new Object[] {
                event, Integer.valueOf(k), Integer.valueOf(l)
            });
            if (j != 0)
            {
                j = LiveButtonController.e(a);
            } else
            {
                j = LiveButtonController.f(a);
            }
            a.getButton().setTextColor(j);
        }

        private g()
        {
            a = LiveButtonController.this;
            super();
        }

        g(byte byte0)
        {
            this();
        }
    }

    final class h
        implements EventListener
    {

        private LiveButtonController a;

        public final void processEvent(Event event)
        {
            a.getButton().setVisibility(0);
        }

        private h()
        {
            a = LiveButtonController.this;
            super();
        }

        h(byte byte0)
        {
            this();
        }
    }


    private static final String d = com/brightcove/player/mediacontroller/buttons/LiveButtonController.getSimpleName();
    private TextView e;
    private int f;
    private int g;
    private int h;
    private SeekBar i;

    public LiveButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.live, typeface);
        f = 0;
        i = (SeekBar)view.findViewById(com.brightcove.player.R.id.seek_bar);
        e = (TextView)view.findViewById(com.brightcove.player.R.id.current_time);
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_live, com.brightcove.player.R.string.desc_live, null, new c((byte)0)));
        g = a(com.brightcove.player.R.color.bmc_live, 0xff00ff00);
        h = a(com.brightcove.player.R.color.bmc_not_live, -1);
        addListener("didSetVideo", new f((byte)0));
        b();
        syncStates();
    }

    private int a(int j, int k)
    {
        int l;
        try
        {
            l = c.getResources().getColor(j);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            String.format("The resource with id (%1$x) cannot be found.  Going with the default.", new Object[] {
                Integer.valueOf(j)
            });
            return k;
        }
        return l;
    }

    static int a(LiveButtonController livebuttoncontroller, int j)
    {
        livebuttoncontroller.f = j;
        return j;
    }

    static String a()
    {
        return d;
    }

    static void a(LiveButtonController livebuttoncontroller)
    {
        if (!livebuttoncontroller.c.isPlaying())
        {
            livebuttoncontroller.eventEmitter.once("didPlay", livebuttoncontroller. new e((byte)0));
        }
        livebuttoncontroller.addListener("didPause", livebuttoncontroller. new d((byte)0));
        livebuttoncontroller.addListener("hideSeekControls", livebuttoncontroller. new b((byte)0));
        livebuttoncontroller.addListener("progress", livebuttoncontroller. new g((byte)0));
        livebuttoncontroller.addListener("showSeekControls", livebuttoncontroller. new h((byte)0));
        livebuttoncontroller.addListener("videoDurationChanged", livebuttoncontroller. new a((byte)0));
    }

    static int b(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.f;
    }

    private void b()
    {
        eventEmitter.once("bufferedUpdate", new EventListener() {

            private LiveButtonController a;

            public final void processEvent(Event event)
            {
                if (a.c.getVideoDisplay().isLive())
                {
                    LiveButtonController.a(a);
                }
            }

            
            {
                a = LiveButtonController.this;
                super();
            }
        });
    }

    static SeekBar c(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.i;
    }

    static TextView d(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.e;
    }

    static int e(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.g;
    }

    static int f(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.h;
    }

    static void g(LiveButtonController livebuttoncontroller)
    {
        livebuttoncontroller.removeListener("didPlay");
        livebuttoncontroller.removeListener("didPause");
        livebuttoncontroller.removeListener("hideSeekControls");
        livebuttoncontroller.removeListener("progress");
        livebuttoncontroller.removeListener("showSeekControls");
        livebuttoncontroller.removeListener("videoDurationChanged");
    }

    static void h(LiveButtonController livebuttoncontroller)
    {
        livebuttoncontroller.b();
    }

    public int getManagedState()
    {
        return 0;
    }

    public int getVisibilityState()
    {
        (new StringBuilder("getVisibilityState: isLive = ")).append(c.getVideoDisplay().isLive());
        return !c.getVideoDisplay().isLive() ? 8 : 0;
    }

}
