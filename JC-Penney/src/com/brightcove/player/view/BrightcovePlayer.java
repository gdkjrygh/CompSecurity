// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventLogger;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveVideoView, af, ae, 
//            ag, ad

public class BrightcovePlayer extends Activity
    implements Component
{

    public static final String POSITION = "position";
    public static final String TAG = com/brightcove/player/view/BrightcovePlayer.getSimpleName();
    public static final String WAS_PLAYING = "wasPlaying";
    protected BaseVideoView a;
    private int b;
    private boolean c;
    private EventLogger d;
    private EventEmitter e;

    public BrightcovePlayer()
    {
    }

    static int a(BrightcovePlayer brightcoveplayer)
    {
        return brightcoveplayer.b;
    }

    static int a(BrightcovePlayer brightcoveplayer, int i)
    {
        brightcoveplayer.b = i;
        return i;
    }

    static void a(BrightcovePlayer brightcoveplayer, Bundle bundle)
    {
        brightcoveplayer.Activity.onSaveInstanceState(bundle);
    }

    static EventEmitter b(BrightcovePlayer brightcoveplayer)
    {
        return brightcoveplayer.e;
    }

    public void fullScreen()
    {
        if (e != null && !a.isFullScreen())
        {
            e.emit("enterFullScreen");
            return;
        } else
        {
            Log.e(TAG, "Event emitter is not defined or the video view is already in full screen mode.");
            return;
        }
    }

    public BaseVideoView getBaseVideoView()
    {
        return a;
    }

    public BrightcoveVideoView getBrightcoveVideoView()
    {
        BrightcoveVideoView brightcovevideoview = null;
        if (a instanceof BrightcoveVideoView)
        {
            brightcovevideoview = (BrightcoveVideoView)a;
        }
        return brightcovevideoview;
    }

    public EventLogger getEventLogger()
    {
        return d;
    }

    public void normalScreen()
    {
        if (e != null && a.isFullScreen())
        {
            e.emit("exitFullScreen");
            return;
        } else
        {
            Log.e(TAG, "Event emitter is not defined or the video view is not in full screen mode!");
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (e != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("configuration", configuration);
            e.emit("configurationChanged", hashmap);
        }
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (a != null)
        {
            e = a.getEventEmitter();
            d = new EventLogger(e, true, getClass().getSimpleName());
            if (bundle != null)
            {
                b = bundle.getInt("position");
                c = bundle.getBoolean("wasPlaying");
            }
            HashMap hashmap = new HashMap();
            hashmap.put("activity", this);
            if (bundle != null)
            {
                hashmap.put("instanceState", bundle);
            }
            e.emit("activityCreated", hashmap);
            return;
        } else
        {
            throw new IllegalStateException("brightcoveVideoView needs to be wired up to the layout.");
        }
    }

    protected void onDestroy()
    {
        Log.v(TAG, "onDestroy");
        super.onDestroy();
        e.on("activityDestroyed", new af(this));
        e.emit("activityDestroyed");
    }

    protected void onPause()
    {
        Log.v(TAG, "onPause");
        super.onPause();
        if (a.isPlaying())
        {
            a.pause();
            c = true;
        } else
        {
            c = false;
        }
        b = a.getCurrentPosition();
        e.emit("activityPaused");
    }

    protected void onRestart()
    {
        Log.v(TAG, "onRestart");
        super.onRestart();
        e.emit("activityRestarted");
    }

    protected void onResume()
    {
        Log.v(TAG, "onResume");
        super.onResume();
        if (c)
        {
            if (a.getCurrentIndex() != -1)
            {
                a.start();
            } else
            {
                e.once("videoDurationChanged", new ae(this));
            }
        }
        e.emit("activityResumed");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("position", b);
        bundle.putBoolean("wasPlaying", c);
        e.on("activitySaveInstanceState", new ag(this, bundle));
        HashMap hashmap = new HashMap();
        hashmap.put("instanceState", bundle);
        e.emit("activitySaveInstanceState", hashmap);
    }

    protected void onStart()
    {
        Log.v(TAG, "onStart");
        super.onStart();
        e.once("videoDurationChanged", new ad(this));
        e.emit("activityStarted");
    }

    protected void onStop()
    {
        Log.v(TAG, "onStop");
        super.onStop();
        a.stopPlayback();
        e.emit("activityStopped");
    }

    public void showClosedCaptioningDialog()
    {
        a.getClosedCaptioningController().showCaptionsDialog();
    }

}
