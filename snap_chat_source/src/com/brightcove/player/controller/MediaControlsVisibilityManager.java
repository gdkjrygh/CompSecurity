// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.controller;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MediaControlsVisibilityManager
{
    final class a
        implements EventListener
    {

        private MediaControlsVisibilityManager a;

        public final void processEvent(Event event)
        {
            event = ((Event) (event.properties.get("seekControlsVisibility")));
            if (event != null && (event instanceof Map))
            {
                event = (Map)event;
                MediaControlsVisibilityManager.a(a).clear();
                MediaControlsVisibilityManager.a(a).putAll(event);
                a.setVisibilityState();
            }
        }

        private a()
        {
            a = MediaControlsVisibilityManager.this;
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

        private MediaControlsVisibilityManager a;

        public final void processEvent(Event event)
        {
            MediaControlsVisibilityManager.a();
            event = ((Event) (event.properties.get("instanceState")));
            if (event != null && (event instanceof Bundle))
            {
                event = (Bundle)event;
            } else
            {
                event = null;
            }
            if (event != null)
            {
                event = event.getBundle("mediaControlsVisibilityState");
            } else
            {
                event = null;
            }
            if (event != null)
            {
                MediaControlsVisibilityManager.b(a, event);
                return;
            } else
            {
                MediaControlsVisibilityManager.a();
                return;
            }
        }

        private b()
        {
            a = MediaControlsVisibilityManager.this;
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

        private MediaControlsVisibilityManager a;

        public final void processEvent(Event event)
        {
            MediaControlsVisibilityManager.a();
            event = ((Event) (event.properties.get("instanceState")));
            if (event != null && (event instanceof Bundle))
            {
                event = (Bundle)event;
            } else
            {
                event = null;
            }
            if (event != null && MediaControlsVisibilityManager.a(a).size() > 0)
            {
                MediaControlsVisibilityManager.a(a, event);
            }
        }

        private c()
        {
            a = MediaControlsVisibilityManager.this;
            super();
        }

        c(byte byte0)
        {
            this();
        }
    }


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

    static void a(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, Bundle bundle)
    {
        Bundle bundle1 = new Bundle();
        bundle.putBundle("mediaControlsVisibilityState", bundle1);
        String s;
        for (bundle = mediacontrolsvisibilitymanager.c.keySet().iterator(); bundle.hasNext(); bundle1.putInt(s, ((Integer)mediacontrolsvisibilitymanager.c.get(s)).intValue()))
        {
            s = (String)bundle.next();
        }

    }

    static void b(MediaControlsVisibilityManager mediacontrolsvisibilitymanager, Bundle bundle)
    {
        mediacontrolsvisibilitymanager.c.clear();
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            int i = bundle.getInt(s);
            if (i == 0)
            {
                String.format("Invalid visibility state (0) detected using key: %s.", new Object[] {
                    s
                });
            } else
            {
                mediacontrolsvisibilitymanager.c.put(s, Integer.valueOf(i));
            }
        }

    }

    public void initListeners(EventEmitter eventemitter)
    {
        a a1 = new a((byte)0);
        eventemitter.on("hideSeekControls", a1);
        eventemitter.on("showSeekControls", a1);
        eventemitter.on("activityCreated", new b((byte)0));
        eventemitter.on("activitySaveInstanceState", new c((byte)0));
    }

    public void setVisibilityState()
    {
        Resources resources = Resources.getSystem();
        MediaController mediacontroller = b.getMediaController();
        if (mediacontroller != null)
        {
            for (Iterator iterator = c.keySet().iterator(); iterator.hasNext();)
            {
                String s = (String)iterator.next();
                View view = mediacontroller.findViewById(resources.getIdentifier(s, "id", "android"));
                if (view != null)
                {
                    view.setVisibility(((Integer)c.get(s)).intValue());
                } else
                {
                    (new StringBuilder("View/button: ")).append(s).append(" does not exist!");
                }
            }

            mediacontroller.show();
        }
    }

}
