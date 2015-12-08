// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.brightcove.player.controller:
//            l, m, n

public class MediaControlsVisibilityManager
{

    private static final String a = com/brightcove/player/controller/MediaControlsVisibilityManager.getSimpleName();
    private BaseVideoView b;
    private final Map c = new HashMap();

    public MediaControlsVisibilityManager(BaseVideoView basevideoview)
    {
        b = basevideoview;
    }

    static String a()
    {
        return a;
    }

    static Map a(MediaControlsVisibilityManager mediacontrolsvisibilitymanager)
    {
        return mediacontrolsvisibilitymanager.c;
    }

    private void a(Bundle bundle)
    {
        Log.v(a, "Saving media controls visibility state...");
        Bundle bundle1 = new Bundle();
        bundle.putBundle("mediaControlsVisibilityState", bundle1);
        String s;
        for (bundle = c.keySet().iterator(); bundle.hasNext(); bundle1.putInt(s, ((Integer)c.get(s)).intValue()))
        {
            s = (String)bundle.next();
        }

    }

    static void a(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, Bundle bundle)
    {
        mediacontrolsvisibilitymanager.a(bundle);
    }

    private void b(Bundle bundle)
    {
        Log.v(a, "Restoring media controls visibility state...");
        c.clear();
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            int i = bundle.getInt(s);
            if (i == 0)
            {
                Log.w(a, String.format("Invalid visibility state (0) detected using key: %s.", new Object[] {
                    s
                }));
            } else
            {
                c.put(s, Integer.valueOf(i));
            }
        }

    }

    static void b(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, Bundle bundle)
    {
        mediacontrolsvisibilitymanager.b(bundle);
    }

    public void initListeners(EventEmitter eventemitter)
    {
        l l1 = new l(this, null);
        eventemitter.on("hideSeekControls", l1);
        eventemitter.on("showSeekControls", l1);
        eventemitter.on("activityCreated", new m(this, null));
        eventemitter.on("activitySaveInstanceState", new n(this, null));
    }

    public void setVisibilityState()
    {
        Resources resources = Resources.getSystem();
        MediaController mediacontroller = b.getMediaController();
        if (mediacontroller == null)
        {
            Log.e(a, "The visibility state cannot be restored!  No media controller exists.");
            return;
        }
        Log.v(a, "Updating the media controls visibility state...");
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            View view = mediacontroller.findViewById(resources.getIdentifier(s, "id", "android"));
            if (view != null)
            {
                view.setVisibility(((Integer)c.get(s)).intValue());
            } else
            {
                Log.w(a, (new StringBuilder()).append("View/button: ").append(s).append(" does not exist!").toString());
            }
        }

        mediacontroller.show();
    }

}
