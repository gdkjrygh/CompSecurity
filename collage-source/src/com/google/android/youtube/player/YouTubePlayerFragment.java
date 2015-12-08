// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.youtube.player;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.internal.c;

// Referenced classes of package com.google.android.youtube.player:
//            YouTubePlayerView

public class YouTubePlayerFragment extends Fragment
    implements d.b
{

    private final a a = new a((byte)0);
    private Bundle b;
    private YouTubePlayerView c;
    private String d;
    private d.a e;
    private boolean f;

    public YouTubePlayerFragment()
    {
    /* block-local class not found */
    class a {}

    }

    private void a()
    {
        if (c != null && e != null)
        {
            c.a(f);
            c.a(getActivity(), this, d, e, b);
            b = null;
            e = null;
        }
    }

    public void a(String s, d.a a1)
    {
        d = com.google.android.youtube.player.internal.c.a(s, "Developer key cannot be null or empty");
        e = a1;
        a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            bundle = bundle.getBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE");
        } else
        {
            bundle = null;
        }
        b = bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c = new YouTubePlayerView(getActivity(), null, 0, a);
        a();
        return c;
    }

    public void onDestroy()
    {
        if (c != null)
        {
            Activity activity = getActivity();
            YouTubePlayerView youtubeplayerview = c;
            boolean flag;
            if (activity == null || activity.isFinishing())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            youtubeplayerview.b(flag);
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        c.c(getActivity().isFinishing());
        c = null;
        super.onDestroyView();
    }

    public void onPause()
    {
        c.c();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        c.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Bundle bundle1;
        if (c != null)
        {
            bundle1 = c.e();
        } else
        {
            bundle1 = b;
        }
        bundle.putBundle("YouTubePlayerFragment.KEY_PLAYER_VIEW_STATE", bundle1);
    }

    public void onStart()
    {
        super.onStart();
        c.a();
    }

    public void onStop()
    {
        c.d();
        super.onStop();
    }
}
