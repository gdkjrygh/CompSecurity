// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.kik.cards.web.video.b;
import com.kik.ui.fragment.FragmentBase;
import kik.android.widget.VideoController;
import kik.android.widget.WebVideoView;

// Referenced classes of package kik.android.chat.fragment:
//            tp, tq, tr, ts, 
//            tt

public class WebVideoFragment extends FragmentBase
{
    public static final class a extends com.kik.ui.fragment.FragmentBase.a
    {

        public a()
        {
        }
    }


    ViewGroup _errorLayout;
    ViewGroup _loadingLayout;
    private boolean a;
    private VideoController b;
    private b c;
    private WebVideoView d;
    private ViewGroup e;
    private boolean f;
    private boolean g;

    public WebVideoFragment()
    {
    }

    static b a(WebVideoFragment webvideofragment)
    {
        return webvideofragment.c;
    }

    static boolean b(WebVideoFragment webvideofragment)
    {
        webvideofragment.g = true;
        return true;
    }

    static WebVideoView c(WebVideoFragment webvideofragment)
    {
        return webvideofragment.d;
    }

    static ViewGroup d(WebVideoFragment webvideofragment)
    {
        return webvideofragment.e;
    }

    static void e(WebVideoFragment webvideofragment)
    {
        if (!webvideofragment.a) goto _L2; else goto _L1
_L1:
        webvideofragment.a();
_L4:
        return;
_L2:
        FragmentActivity fragmentactivity = webvideofragment.getActivity();
        if (fragmentactivity == null || webvideofragment.b == null) goto _L4; else goto _L3
_L3:
        webvideofragment.b.a();
        if (android.os.Build.VERSION.SDK_INT < 11 || android.os.Build.VERSION.SDK_INT >= 14) goto _L6; else goto _L5
_L5:
        fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
_L8:
        webvideofragment.a = true;
        return;
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT < 19)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            if (fragmentactivity.getRequestedOrientation() != 0)
            {
                fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(0);
            } else
            {
                fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1792);
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean B()
    {
        return true;
    }

    public final void a()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null) goto _L2; else goto _L3
_L3:
        if (android.os.Build.VERSION.SDK_INT < 11 || android.os.Build.VERSION.SDK_INT >= 14) goto _L5; else goto _L4
_L4:
        fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1);
_L7:
        b.c();
        a = false;
_L2:
        return;
_L5:
        if (android.os.Build.VERSION.SDK_INT >= 14 && android.os.Build.VERSION.SDK_INT < 19)
        {
            fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            if (fragmentactivity.getRequestedOrientation() != 0)
            {
                fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(1);
            } else
            {
                fragmentactivity.getWindow().getDecorView().setSystemUiVisibility(3846);
            }
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(boolean flag)
    {
label0:
        {
            if (!flag)
            {
                if (!f)
                {
                    break label0;
                }
                d.b();
            }
            return;
        }
        d.n();
    }

    public final void b()
    {
        f = false;
    }

    public final void c()
    {
        _errorLayout.setVisibility(0);
        _loadingLayout.setVisibility(8);
        a();
    }

    public final void d()
    {
        if (_loadingLayout.getVisibility() == 0)
        {
            _loadingLayout.setVisibility(8);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03001b, viewgroup, false);
        c = com.kik.cards.web.video.b.a();
        c.a(this);
        d = c.g();
        int i = c.v();
        getActivity().setRequestedOrientation(i);
        viewgroup = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        e = (FrameLayout)layoutinflater.findViewById(0x7f0e009b);
        e.addView(d, viewgroup);
        ButterKnife.inject(this, layoutinflater);
        d.i();
        if (!c.b())
        {
            _loadingLayout.setVisibility(0);
        }
        b = new VideoController(getActivity(), (byte)0);
        d.a(b);
        a();
        d.a(new tp(this));
        d.a(new tq(this));
        viewgroup = new tr(this);
        d.a(viewgroup);
        ((Button)_errorLayout.findViewById(0x7f0e009f)).setOnClickListener(new ts(this));
        e.setOnTouchListener(new tt(this));
        if (c.b())
        {
            d.l();
            _loadingLayout.setVisibility(8);
            if (c.c())
            {
                d.a();
                a();
            }
        } else
        if (c.k())
        {
            c();
            return layoutinflater;
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (g)
        {
            c.u();
        }
    }

    public void onDestroyView()
    {
        d.n();
        if (a)
        {
            a();
        }
        if (e != null && d != null)
        {
            e.removeView(d);
        }
        super.onDestroyView();
    }

    public void onPause()
    {
        a();
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        f = true;
    }

    public final boolean v()
    {
        c.i();
        a();
        return true;
    }
}
