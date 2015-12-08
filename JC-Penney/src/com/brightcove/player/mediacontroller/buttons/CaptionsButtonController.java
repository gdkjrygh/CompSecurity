// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, c, ButtonState, e

public class CaptionsButtonController extends AbstractButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/CaptionsButtonController.getSimpleName();
    private boolean e;

    public CaptionsButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface, Bundle bundle)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.captions, typeface);
        basevideoview = new c(this, null);
        b.add(new ButtonState(context, com.brightcove.player.R.string.captions, com.brightcove.player.R.string.desc_captions, basevideoview));
        addListener("captionsAvailable", new e(this, null));
        boolean flag;
        if (bundle != null && bundle.containsKey("captionsState"))
        {
            flag = bundle.getBoolean("captionsState");
        } else
        {
            flag = false;
        }
        e = flag;
    }

    static EventEmitter a(CaptionsButtonController captionsbuttoncontroller)
    {
        return captionsbuttoncontroller.F;
    }

    static String a()
    {
        return d;
    }

    static boolean a(CaptionsButtonController captionsbuttoncontroller, boolean flag)
    {
        captionsbuttoncontroller.e = flag;
        return flag;
    }

    public int getManagedState()
    {
        return 0;
    }

    public int getVisibilityState()
    {
        return !e ? 8 : 0;
    }

}
