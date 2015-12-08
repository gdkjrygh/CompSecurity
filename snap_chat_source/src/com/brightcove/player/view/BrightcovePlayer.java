// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventLogger;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveVideoView

public class BrightcovePlayer extends Activity
    implements Component
{

    public static final String POSITION = "position";
    public static final String TAG = com/brightcove/player/view/BrightcovePlayer.getSimpleName();
    public static final String WAS_PLAYING = "wasPlaying";
    private int a;
    private boolean b;

    public BrightcovePlayer()
    {
    }

    static int a(BrightcovePlayer brightcoveplayer)
    {
        return brightcoveplayer.a;
    }

    static EventEmitter a()
    {
        return null;
    }

    static void a(BrightcovePlayer brightcoveplayer, Bundle bundle)
    {
        brightcoveplayer.Activity.onSaveInstanceState(bundle);
    }

    static int b(BrightcovePlayer brightcoveplayer)
    {
        brightcoveplayer.a = -1;
        return -1;
    }

    public void fullScreen()
    {
    }

    public BaseVideoView getBaseVideoView()
    {
        return null;
    }

    public BrightcoveVideoView getBrightcoveVideoView()
    {
        return null;
    }

    public EventLogger getEventLogger()
    {
        return null;
    }

    public void normalScreen()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        throw new IllegalStateException("brightcoveVideoView needs to be wired up to the layout.");
    }

    protected void onDestroy()
    {
        super.onDestroy();
        new EventListener() {

            public final void processEvent(Event event)
            {
                BrightcovePlayer.a().off();
            }

        };
        throw new NullPointerException();
    }

    protected void onPause()
    {
        super.onPause();
        throw new NullPointerException();
    }

    protected void onRestart()
    {
        super.onRestart();
        throw new NullPointerException();
    }

    protected void onResume()
    {
        super.onResume();
        if (b)
        {
            throw new NullPointerException();
        } else
        {
            throw new NullPointerException();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("position", a);
        bundle.putBoolean("wasPlaying", b);
        new EventListener(bundle) {

            private Bundle a;
            private BrightcovePlayer b;

            public final void processEvent(Event event)
            {
                BrightcovePlayer.a(b, a);
            }

            
            {
                b = BrightcovePlayer.this;
                a = bundle;
                super();
            }
        };
        throw new NullPointerException();
    }

    protected void onStart()
    {
        super.onStart();
        if (a > 0)
        {
            throw new NullPointerException();
        } else
        {
            throw new NullPointerException();
        }
    }

    protected void onStop()
    {
        super.onStop();
        throw new NullPointerException();
    }

    public void showClosedCaptioningDialog()
    {
        throw new NullPointerException();
    }


    // Unreferenced inner class com/brightcove/player/view/BrightcovePlayer$1

/* anonymous class */
    final class _cls1
        implements EventListener
    {

        private BrightcovePlayer a;

        public final void processEvent(Event event)
        {
            BrightcovePlayer.a(a);
            throw new NullPointerException();
        }

            
            {
                a = BrightcovePlayer.this;
                super();
            }
    }


    // Unreferenced inner class com/brightcove/player/view/BrightcovePlayer$2

/* anonymous class */
    final class _cls2
        implements EventListener
    {

        public final void processEvent(Event event)
        {
            throw new NullPointerException();
        }

    }

}
