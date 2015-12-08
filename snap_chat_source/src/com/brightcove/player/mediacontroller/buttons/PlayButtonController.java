// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState

public class PlayButtonController extends AbstractButtonController
{
    final class a
        implements android.view.View.OnClickListener
    {

        private PlayButtonController a;

        public final void onClick(View view)
        {
            PlayButtonController.a();
            a.c.start();
        }

        private a()
        {
            a = PlayButtonController.this;
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

        private PlayButtonController a;

        public final void processEvent(Event event)
        {
            PlayButtonController.a();
            String.format("Process event: %s.", new Object[] {
                event.getType()
            });
            a.syncStates();
        }

        private b()
        {
            a = PlayButtonController.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    private static final String d = com/brightcove/player/mediacontroller/buttons/PlayButtonController.getSimpleName();

    public PlayButtonController(Context context, BaseVideoView basevideoview, BrightcoveControlBar brightcovecontrolbar, Typeface typeface)
    {
        super(context, basevideoview, brightcovecontrolbar, com.brightcove.player.R.id.play, typeface);
        basevideoview = new a((byte)0);
        typeface = brightcovecontrolbar.getImage(BrightcoveControlBar.PLAY_IMAGE);
        brightcovecontrolbar = brightcovecontrolbar.getImage(BrightcoveControlBar.PAUSE_IMAGE);
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_play, com.brightcove.player.R.string.desc_play, typeface, basevideoview));
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_pause, com.brightcove.player.R.string.desc_pause, brightcovecontrolbar, "pause"));
        context = new b((byte)0);
        addListener("didPlay", context);
        addListener("didPause", context);
        addListener("didSetVideo", context);
        addListener("stop", context);
        addListener("activityResumed", context);
        addListener("completed", context);
        syncStates();
    }

    static String a()
    {
        return d;
    }

    public int getManagedState()
    {
        return !c.isPlaying() ? 0 : 1;
    }

    public Map getProperties()
    {
        a.clear();
        a.put("playheadPosition", Integer.valueOf(c.getCurrentPosition()));
        return a;
    }

}
