// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventLogger;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveVideoView, ah, ai

public class BrightcovePlayerFragment extends Fragment
{

    public static final String TAG = com/brightcove/player/view/BrightcovePlayerFragment.getSimpleName();
    protected BrightcoveVideoView a;
    private EventEmitter b;
    private int c;
    private boolean d;

    public BrightcovePlayerFragment()
    {
    }

    static EventEmitter a(BrightcovePlayerFragment brightcoveplayerfragment)
    {
        return brightcoveplayerfragment.b;
    }

    static void a(BrightcovePlayerFragment brightcoveplayerfragment, Bundle bundle)
    {
        brightcoveplayerfragment.Fragment.onSaveInstanceState(bundle);
    }

    public void fullScreen()
    {
        if (b != null && !a.isFullScreen())
        {
            b.emit("enterFullScreen");
            return;
        } else
        {
            Log.e(TAG, "Event emitter is not defined or the video view is already in full screen mode.");
            return;
        }
    }

    public BrightcoveVideoView getBrightcoveVideoView()
    {
        return a;
    }

    public void normalScreen()
    {
        if (b != null && a.isFullScreen())
        {
            b.emit("exitFullScreen");
            return;
        } else
        {
            Log.e(TAG, "Event emitter is not defined or the video view is not in full screen mode!");
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        Log.v(TAG, "onActivityCreated");
        super.onActivityCreated(bundle);
        HashMap hashmap = new HashMap();
        if (bundle != null)
        {
            hashmap.put("instanceState", bundle);
        }
        b.emit("fragmentActivityCreated", hashmap);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Log.v(TAG, "onCreateView");
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (a != null)
        {
            b = a.getEventEmitter();
            new EventLogger(b, true, getClass().getSimpleName());
            if (bundle != null)
            {
                c = bundle.getInt("position");
                d = bundle.getBoolean("wasPlaying");
            }
            viewgroup = new HashMap();
            viewgroup.put("fragment", this);
            if (bundle != null)
            {
                viewgroup.put("instanceState", bundle);
            }
            b.emit("fragmentCreatedView", viewgroup);
            return layoutinflater;
        } else
        {
            throw new IllegalStateException("brightcoveVideoView needs to be wired up to the layout.");
        }
    }

    public void onDestroy()
    {
        Log.v(TAG, "onDestroy");
        super.onDestroy();
        b.emit("fragmentDestroyed");
    }

    public void onDestroyView()
    {
        Log.v(TAG, "onDestroyView");
        super.onDestroyView();
        b.on("fragmentDestroyedView", new ah(this));
        b.emit("fragmentDestroyedView");
    }

    public void onDetach()
    {
        Log.v(TAG, "onDetach");
        super.onDetach();
        b.emit("fragmentDetached");
    }

    public void onPause()
    {
        Log.v(TAG, "onPause");
        super.onPause();
        if (a.isPlaying())
        {
            a.pause();
            d = true;
        } else
        {
            d = false;
        }
        c = a.getCurrentPosition();
        b.emit("fragmentPaused");
    }

    public void onResume()
    {
        Log.v(TAG, "onResume");
        super.onResume();
        if (d)
        {
            a.start();
        }
        b.emit("fragmentResumed");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        Log.v(TAG, "onSaveInstanceState");
        bundle.putInt("position", c);
        bundle.putBoolean("wasPlaying", d);
        b.on("fragmentSaveInstanceState", new ai(this, bundle));
        HashMap hashmap = new HashMap();
        hashmap.put("instanceState", bundle);
        b.emit("fragmentSaveInstanceState", hashmap);
    }

    public void onStart()
    {
        Log.v(TAG, "onStart");
        super.onStart();
        if (c > 0)
        {
            a.seekTo(c);
            c = -1;
        }
        b.emit("fragmentStarted");
    }

    public void onStop()
    {
        Log.v(TAG, "onStop");
        super.onStop();
        a.stopPlayback();
        b.emit("fragmentStopped");
    }

    public void onViewStateRestored(Bundle bundle)
    {
        Log.v(TAG, "onViewStateRestored");
        super.onViewStateRestored(bundle);
        HashMap hashmap = new HashMap();
        if (bundle != null)
        {
            hashmap.put("instanceState", bundle);
        }
        b.emit("fragmentViewStateRestored", hashmap);
    }

}
