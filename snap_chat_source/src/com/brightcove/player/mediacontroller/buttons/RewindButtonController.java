// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Button;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState

public class RewindButtonController extends AbstractButtonController
{
    final class a
        implements EventListener
    {

        private RewindButtonController a;

        public final void processEvent(Event event)
        {
            RewindButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            int i = event.getIntegerProperty("fromSeekPosition");
            int j = event.getIntegerProperty("seekPosition");
            if (i == RewindButtonController.b(a) && j == RewindButtonController.c(a))
            {
                RewindButtonController.f(a).emit("didRewind", event.properties);
            }
        }

        private a()
        {
            a = RewindButtonController.this;
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

        private RewindButtonController a;

        public final void processEvent(Event event)
        {
            a.getButton().setVisibility(4);
        }

        private b()
        {
            a = RewindButtonController.this;
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

        private RewindButtonController a;

        public final void processEvent(Event event)
        {
            int i;
            if (a.c.getVideoDisplay().isLive())
            {
                i = 10000;
            } else
            {
                i = RewindButtonController.a(a);
            }
            RewindButtonController.a();
            String.format("Processing event: %s.", new Object[] {
                event.getType()
            });
            RewindButtonController.a(a, event.getIntegerProperty("playheadPosition"));
            event = a;
            if (RewindButtonController.b(a) - i > 0)
            {
                i = RewindButtonController.b(a) - i;
            } else
            {
                i = 0;
            }
            RewindButtonController.b(event, i);
            event = new HashMap();
            event.put("seekPosition", Integer.valueOf(RewindButtonController.c(a)));
            RewindButtonController.d(a).emit("seekTo", event);
            RewindButtonController.e(a).once("didSeekTo", a. new a((byte)0));
        }

        private c()
        {
            a = RewindButtonController.this;
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

        private RewindButtonController a;

        public final void processEvent(Event event)
        {
            a.getButton().setVisibility(0);
        }

        private d()
        {
            a = RewindButtonController.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }


    private static final String d = com/brightcove/player/mediacontroller/buttons/RewindButtonController.getSimpleName();
    private int e;
    private int f;
    private int g;

    public RewindButtonController(Context context, BaseVideoView basevideoview, BrightcoveControlBar brightcovecontrolbar, Typeface typeface)
    {
        super(context, basevideoview, brightcovecontrolbar, com.brightcove.player.R.id.rewind, typeface);
        e = 3000;
        basevideoview = brightcovecontrolbar.getImage(BrightcoveControlBar.REWIND_IMAGE);
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_rewind, com.brightcove.player.R.string.desc_rewind, basevideoview, "rewind"));
        addListener("rewind", new c((byte)0));
        addListener("hideSeekControls", new b((byte)0));
        addListener("showSeekControls", new d((byte)0));
    }

    static int a(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.e;
    }

    static int a(RewindButtonController rewindbuttoncontroller, int i)
    {
        rewindbuttoncontroller.f = i;
        return i;
    }

    static String a()
    {
        return d;
    }

    static int b(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.f;
    }

    static int b(RewindButtonController rewindbuttoncontroller, int i)
    {
        rewindbuttoncontroller.g = i;
        return i;
    }

    static int c(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.g;
    }

    static EventEmitter d(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.eventEmitter;
    }

    static EventEmitter e(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.eventEmitter;
    }

    static EventEmitter f(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.eventEmitter;
    }

    public int getManagedState()
    {
        return 0;
    }

    public Map getProperties()
    {
        a.clear();
        a.put("playheadPosition", Integer.valueOf(c.getCurrentPosition()));
        return a;
    }

    public int getVisibilityState()
    {
        return c.getVideoDisplay().isLive() && !c.getVideoDisplay().hasDvr() ? 8 : 0;
    }

    public void setRewindDefault(int i)
    {
        e = i;
    }

}
