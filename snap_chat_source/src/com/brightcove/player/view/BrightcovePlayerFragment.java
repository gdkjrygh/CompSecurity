// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveVideoView

public class BrightcovePlayerFragment extends Fragment
{

    public static final String TAG = com/brightcove/player/view/BrightcovePlayerFragment.getSimpleName();
    private int a;
    private boolean b;

    public BrightcovePlayerFragment()
    {
    }

    static EventEmitter a()
    {
        return null;
    }

    static void a(BrightcovePlayerFragment brightcoveplayerfragment, Bundle bundle)
    {
        brightcoveplayerfragment.Fragment.onSaveInstanceState(bundle);
    }

    public void fullScreen()
    {
    }

    public BrightcoveVideoView getBrightcoveVideoView()
    {
        return null;
    }

    public void normalScreen()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        HashMap hashmap = new HashMap();
        if (bundle != null)
        {
            hashmap.put("instanceState", bundle);
        }
        throw new NullPointerException();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        throw new IllegalStateException("brightcoveVideoView needs to be wired up to the layout.");
    }

    public void onDestroy()
    {
        super.onDestroy();
        throw new NullPointerException();
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        new EventListener() {

            public final void processEvent(Event event)
            {
                BrightcovePlayerFragment.a().off();
            }

        };
        throw new NullPointerException();
    }

    public void onDetach()
    {
        super.onDetach();
        throw new NullPointerException();
    }

    public void onPause()
    {
        super.onPause();
        throw new NullPointerException();
    }

    public void onResume()
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

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("position", a);
        bundle.putBoolean("wasPlaying", b);
        new EventListener(bundle) {

            private Bundle a;
            private BrightcovePlayerFragment b;

            public final void processEvent(Event event)
            {
                BrightcovePlayerFragment.a(b, a);
            }

            
            {
                b = BrightcovePlayerFragment.this;
                a = bundle;
                super();
            }
        };
        throw new NullPointerException();
    }

    public void onStart()
    {
        super.onStart();
        if (a > 0)
        {
            int i = a;
            throw new NullPointerException();
        } else
        {
            throw new NullPointerException();
        }
    }

    public void onStop()
    {
        super.onStop();
        throw new NullPointerException();
    }

    public void onViewStateRestored(Bundle bundle)
    {
        super.onViewStateRestored(bundle);
        HashMap hashmap = new HashMap();
        if (bundle != null)
        {
            hashmap.put("instanceState", bundle);
        }
        throw new NullPointerException();
    }

}
