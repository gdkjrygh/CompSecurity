// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState

public class FullScreenButtonController extends AbstractButtonController
{
    final class a
        implements EventListener
    {

        private FullScreenButtonController a;

        public final void processEvent(Event event)
        {
            a.syncStates();
        }

        private a()
        {
            a = FullScreenButtonController.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    public FullScreenButtonController(Context context, BaseVideoView basevideoview, BrightcoveControlBar brightcovecontrolbar, Typeface typeface)
    {
        super(context, basevideoview, brightcovecontrolbar, com.brightcove.player.R.id.full_screen, typeface);
        basevideoview = brightcovecontrolbar.getImage(BrightcoveControlBar.ENTER_FULL_SCREEN_IMAGE);
        brightcovecontrolbar = brightcovecontrolbar.getImage(BrightcoveControlBar.EXIT_FULL_SCREEN_IMAGE);
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_enter_full_screen, com.brightcove.player.R.string.desc_enter_full_screen, basevideoview, "enterFullScreen"));
        b.add(new ButtonState(context, com.brightcove.player.R.string.brightcove_controls_exit_full_screen, com.brightcove.player.R.string.desc_exit_full_screen, brightcovecontrolbar, "exitFullScreen"));
        context = new a((byte)0);
        addListener("enterFullScreen", context);
        addListener("exitFullScreen", context);
        addListener("didEnterFullScreen", context);
        addListener("didExitFullScreen", context);
        syncStates();
    }

    public int getManagedState()
    {
        return !c.isFullScreen() ? 0 : 1;
    }

    static 
    {
        com/brightcove/player/mediacontroller/buttons/FullScreenButtonController.getSimpleName();
    }
}
