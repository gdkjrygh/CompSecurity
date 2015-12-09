// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ac;
import android.support.v4.app.aj;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.model.Video;
import com.jcp.adapters.MultipleVideoItemAdapter;
import com.jcp.b.a;
import com.jcp.b.b;
import com.jcp.e.l;
import com.jcp.util.ae;
import com.jcp.util.au;
import com.jcp.views.JcpBrightcoveVideoView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.fragments:
//            s, bz, ca, cb, 
//            cc, cd, ce, by

public class MultipleVideosGridFragment extends s
{

    private static final String a = com/jcp/fragments/MultipleVideosGridFragment.getName();
    private List b;
    private MultipleVideoItemAdapter c;
    private l d;
    private Animation e;
    private Animation f;
    private Animation g;
    private Animation h;
    protected ImageView mCloseView;
    protected View mGridLayout;
    protected GridView mGridView;
    protected View mProgressBar;
    protected View mVideoLayout;
    protected JcpBrightcoveVideoView mVideoView;

    public MultipleVideosGridFragment()
    {
        b = new ArrayList();
    }

    private void U()
    {
        e = AnimationUtils.loadAnimation(i().getApplicationContext(), 0x7f040018);
        f = AnimationUtils.loadAnimation(i().getApplicationContext(), 0x7f040017);
        g = AnimationUtils.loadAnimation(i().getApplicationContext(), 0x7f04000e);
        h = AnimationUtils.loadAnimation(i().getApplicationContext(), 0x7f04000f);
        f.setAnimationListener(new bz(this));
        g.setAnimationListener(new ca(this));
        h.setAnimationListener(new cb(this));
    }

    private void V()
    {
        mVideoView.stopPlayback();
        mVideoView.seekTo(0);
        mVideoView.i();
    }

    private void W()
    {
        mVideoLayout.setVisibility(8);
        d = new cc(this);
        cd cd1 = new cd(this);
        mVideoView.setVideoListener(cd1);
    }

    private void X()
    {
        au.a(i(), a(0x7f070467), new ce(this));
    }

    private void Z()
    {
        if (mGridLayout.getVisibility() == 0)
        {
            com.jcp.b.a.a(d);
            mVideoLayout.startAnimation(e);
            mVideoLayout.setVisibility(0);
            mVideoLayout.setAlpha(1.0F);
            mGridLayout.startAnimation(h);
            return;
        } else
        {
            com.jcp.b.a.a(null);
            mVideoLayout.startAnimation(f);
            mGridLayout.startAnimation(g);
            return;
        }
    }

    public static MultipleVideosGridFragment a(String s1, List list)
    {
        MultipleVideosGridFragment multiplevideosgridfragment = new MultipleVideosGridFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ProductName", s1);
        bundle.putStringArrayList("VideoIds", (ArrayList)list);
        multiplevideosgridfragment.g(bundle);
        return multiplevideosgridfragment;
    }

    private void a(Video video)
    {
        mVideoView.getEventEmitter().emit("enterFullScreen");
        mVideoView.a(video);
        mVideoView.setVisibility(0);
        mProgressBar.setVisibility(0);
        mVideoView.seekTo(0);
    }

    static void a(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        multiplevideosgridfragment.X();
    }

    private boolean c(Bundle bundle)
    {
        if (bundle == null)
        {
            ae.a(a, "Fragment needs data");
            return false;
        }
        if (bundle.containsKey("VideoIds") && bundle.getStringArrayList("VideoIds") != null)
        {
            b.addAll(bundle.getStringArrayList("VideoIds"));
        }
        if (b == null || b.isEmpty())
        {
            ae.d(a, "Video ids does not exist.");
            return false;
        } else
        {
            return true;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03006d, null, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    protected String a()
    {
        return "MULTIPLEVIDEOS";
    }

    public void b()
    {
        a(a(0x7f070469));
        a(false);
        super.b();
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        i().getActionBar().hide();
        if (b != null)
        {
            b.clear();
        }
        if (!com.jcp.b.b.a(i()))
        {
            au.a(i(), j().getString(0x7f0702b7), new by(this));
            return;
        }
        if (!c(h()))
        {
            au.a(i(), a(0x7f070467));
            return;
        } else
        {
            c = new MultipleVideoItemAdapter(i(), b);
            mGridView.setAdapter(c);
            W();
            U();
            return;
        }
    }

    public void e()
    {
        super.e();
        if (mVideoLayout.getVisibility() == 0 && mVideoView != null)
        {
            mVideoView.getEventEmitter().emit("stop");
        }
    }

    public void f()
    {
        super.f();
        i().getActionBar().show();
    }

    public void g_()
    {
        super.g_();
        if (mVideoLayout.getVisibility() == 0 && mVideoView != null)
        {
            mVideoView.getEventEmitter().emit("pause");
        }
    }

    protected void onCloseFragmentClick()
    {
        i().f().c();
    }

    protected void onCloseVideoClick()
    {
        Z();
        V();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a(c.a(i));
        mVideoView.start();
        Z();
    }

}
