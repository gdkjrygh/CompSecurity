// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;

// Referenced classes of package com.brightcove.player.mediacontroller.buttons:
//            AbstractButtonController, ButtonState, k, m, 
//            l, n, o, j, 
//            p, q, i

public class LiveButtonController extends AbstractButtonController
{

    private static final String d = com/brightcove/player/mediacontroller/buttons/LiveButtonController.getSimpleName();
    private TextView e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private SeekBar j;

    public LiveButtonController(Context context, BaseVideoView basevideoview, View view, Typeface typeface)
    {
        super(context, basevideoview, view, com.brightcove.player.R.id.live, typeface);
        f = 0;
        j = (SeekBar)view.findViewById(com.brightcove.player.R.id.seek_bar);
        e = (TextView)view.findViewById(com.brightcove.player.R.id.current_time);
        b.add(new ButtonState(context, com.brightcove.player.R.string.live, com.brightcove.player.R.string.desc_live, new k(this, null)));
        h = a(com.brightcove.player.R.color.bmc_live, 0xff00ff00);
        i = a(com.brightcove.player.R.color.bmc_not_live, -1);
        g = false;
        b();
        syncStates();
    }

    private int a(int i1, int j1)
    {
        int k1;
        try
        {
            k1 = c.getResources().getColor(i1);
        }
        catch (android.content.res.Resources.NotFoundException notfoundexception)
        {
            Log.w(d, String.format("The resource with id (%1$x) cannot be found.  Going with the default.", new Object[] {
                Integer.valueOf(i1)
            }));
            return j1;
        }
        return k1;
    }

    static int a(LiveButtonController livebuttoncontroller, int i1)
    {
        livebuttoncontroller.f = i1;
        return i1;
    }

    static String a()
    {
        return d;
    }

    static boolean a(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.g;
    }

    static boolean a(LiveButtonController livebuttoncontroller, boolean flag)
    {
        livebuttoncontroller.g = flag;
        return flag;
    }

    static int b(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.f;
    }

    private void b()
    {
        m m1 = new m(this, null);
        addListener("completed", new l(this, null));
        addListener("didPlay", new n(this, null));
        addListener("didPause", m1);
        addListener("didSetVideo", new o(this, null));
        addListener("didStop", m1);
        addListener("hideSeekControls", new j(this, null));
        addListener("progress", new p(this, null));
        addListener("showSeekControls", new q(this, null));
        addListener("videoDurationChanged", new i(this, null));
    }

    static SeekBar c(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.j;
    }

    static TextView d(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.e;
    }

    static int e(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.h;
    }

    static int f(LiveButtonController livebuttoncontroller)
    {
        return livebuttoncontroller.i;
    }

    public int getManagedState()
    {
        return 0;
    }

    public int getVisibilityState()
    {
        return !c.getVideoDisplay().isLive() ? 8 : 0;
    }

}
