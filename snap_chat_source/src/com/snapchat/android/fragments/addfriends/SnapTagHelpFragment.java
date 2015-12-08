// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Mf;
import Mh;
import android.app.Activity;
import android.app.Application;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.ui.TextureVideoView;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import ll;

public class SnapTagHelpFragment extends SnapchatFragment
{

    private static final String a = (new StringBuilder("android.resource://")).append(SnapchatApplication.get().getPackageName()).append('/').append(0x7f070009).toString();
    private TextureVideoView b;

    public SnapTagHelpFragment()
    {
    }

    static TextureVideoView a(SnapTagHelpFragment snaptaghelpfragment)
    {
        return snaptaghelpfragment.b;
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f0400dd, viewgroup, false);
        b = (TextureVideoView)d(0x7f0d04a6);
        mFragmentLayout.setOnTouchListener(new android.view.View.OnTouchListener() {

            private SnapTagHelpFragment a;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                view = a.getActivity();
                if (view != null)
                {
                    view.onBackPressed();
                }
                return true;
            }

            
            {
                a = SnapTagHelpFragment.this;
                super();
            }
        });
        ll.f();
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        b.a();
        Mf.a().a(new Mh(CameraDisplayState.SHOW));
    }

    public void onResume()
    {
        super.onResume();
        Mf.a().a(new Mh(CameraDisplayState.CLOSE));
        b.setVideoPath(a);
        b.seekTo(0);
        b.start();
        b.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            private SnapTagHelpFragment a;

            public final void onPrepared(MediaPlayer mediaplayer)
            {
                SnapTagHelpFragment.a(a).setLooping(true);
            }

            
            {
                a = SnapTagHelpFragment.this;
                super();
            }
        });
    }

    protected void onVisible()
    {
    }

}
