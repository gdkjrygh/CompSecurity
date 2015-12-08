// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, s, ButtonState, t

public class PlayButtonController extends AbstractButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/PlayButtonController.getSimpleName();

    public PlayButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.play, typeface);
        basevideoview = new s(this, null);
        b.add(new ButtonState(context, com.brightcove.player.R.string.play, com.brightcove.player.R.string.desc_play, basevideoview));
        b.add(new ButtonState(context, com.brightcove.player.R.string.pause, com.brightcove.player.R.string.desc_pause, "pause"));
        context = new t(this, null);
        addListener("didPlay", context);
        addListener("didPause", context);
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
