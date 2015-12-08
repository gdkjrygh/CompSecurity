// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState, g

public class FullScreenButtonController extends AbstractButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/FullScreenButtonController.getSimpleName();

    public FullScreenButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.full_screen, typeface);
        b.add(new ButtonState(context, com.brightcove.player.R.string.enter_full_screen, com.brightcove.player.R.string.desc_enter_full_screen, "enterFullScreen"));
        b.add(new ButtonState(context, com.brightcove.player.R.string.exit_full_screen, com.brightcove.player.R.string.desc_exit_full_screen, "exitFullScreen"));
        context = new g(this, null);
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

}
