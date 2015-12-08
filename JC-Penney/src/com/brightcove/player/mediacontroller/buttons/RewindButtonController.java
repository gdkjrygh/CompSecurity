// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState, x, v, 
//            w, y

public class RewindButtonController extends AbstractButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/RewindButtonController.getSimpleName();
    private int e;
    private int f;
    private int g;

    public RewindButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.rewind, typeface);
        e = 3000;
        b.add(new ButtonState(context, com.brightcove.player.R.string.rewind, com.brightcove.player.R.string.desc_rewind, "rewind"));
        addListener("rewind", new x(this, null));
        addListener("didSeekTo", new v(this, null));
        addListener("hideSeekControls", new w(this, null));
        addListener("showSeekControls", new y(this, null));
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
        return rewindbuttoncontroller.F;
    }

    static EventEmitter e(RewindButtonController rewindbuttoncontroller)
    {
        return rewindbuttoncontroller.F;
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
