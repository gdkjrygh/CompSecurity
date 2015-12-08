// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.support.v4.view.bi;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.brightcove.player.event.EventEmitter;
import com.jcp.e.q;
import com.jcp.e.v;
import com.jcp.g.a;
import com.jcp.views.JcpBrightcoveVideoView;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.List;

// Referenced classes of package com.jcp.adapters:
//            t, u

public class s extends bi
{

    private Context a;
    private LayoutInflater b;
    private int c;
    private int d;
    private List e;
    private int f;
    private List g;
    private String h;
    private int i;
    private List j;
    private List k;
    private q l;
    private int m;
    private boolean n;
    private v o;

    public s(Context context)
    {
        a = context;
        b = (LayoutInflater)a.getSystemService("layout_inflater");
    }

    static List a(s s1)
    {
        return s1.e;
    }

    private void a(ViewGroup viewgroup, android.widget.RelativeLayout.LayoutParams layoutparams, int i1, ImageView imageview, ImageView imageview1)
    {
        if (k.size() > 1)
        {
            o.a(k);
            return;
        }
        if (viewgroup.findViewById(0x7f0e01dc) == null)
        {
            ViewStub viewstub = (ViewStub)viewgroup.findViewById(0x7f0e01db);
            viewstub.setLayoutParams(layoutparams);
            viewstub.inflate();
        }
        viewgroup = (JcpBrightcoveVideoView)viewgroup.findViewById(0x7f0e01d0);
        ProgressBar progressbar = (ProgressBar)viewgroup.findViewById(0x7f0e01d1);
        progressbar.setVisibility(8);
        viewgroup.setVideoListener(l);
        viewgroup.setLayoutParams(layoutparams);
        viewgroup.setTag((new StringBuilder()).append("video").append(i1).toString());
        viewgroup.setVideoLoader(progressbar);
        viewgroup.setVisibility(0);
        imageview.setVisibility(8);
        imageview1.setVisibility(8);
        viewgroup.a((String)k.get(0));
        m = i1;
        n = true;
    }

    static void a(s s1, ViewGroup viewgroup, android.widget.RelativeLayout.LayoutParams layoutparams, int i1, ImageView imageview, ImageView imageview1)
    {
        s1.a(viewgroup, layoutparams, i1, imageview, imageview1);
    }

    static Context b(s s1)
    {
        return s1.a;
    }

    static String c(s s1)
    {
        return s1.h;
    }

    static List d(s s1)
    {
        return s1.g;
    }

    static List e(s s1)
    {
        return s1.j;
    }

    private void g()
    {
        m = -2;
    }

    public int a(Object obj)
    {
        return -2;
    }

    public Object a(ViewGroup viewgroup, int i1)
    {
        ViewGroup viewgroup1 = (ViewGroup)b.inflate(0x7f03003f, viewgroup, false);
        ImageView imageview = (ImageView)viewgroup1.findViewById(0x7f0e01da);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(d, c / 2);
        imageview.setLayoutParams(layoutparams);
        if (k != null && k.size() > 0)
        {
            ImageView imageview1 = (ImageView)viewgroup1.findViewById(0x7f0e01dd);
            imageview1.setVisibility(0);
            if (k.size() > 1)
            {
                imageview1.setImageResource(0x7f020178);
            } else
            {
                imageview1.setImageResource(0x7f02014c);
            }
            imageview1.setOnClickListener(new t(this, viewgroup1, layoutparams, i1, imageview1, imageview));
        }
        if (!e.isEmpty())
        {
            f = i1 % e.size();
            String s1;
            if (f < e.size())
            {
                s1 = (String)e.get(f);
            } else
            {
                s1 = null;
            }
            if (!TextUtils.isEmpty(s1))
            {
                s1 = s1.split(".tif")[0];
                com.jcp.g.a.a().a(s1).b(0x7f02023c).a(imageview);
                imageview.setOnClickListener(new u(this, imageview));
            }
        }
        viewgroup1.setTag((new StringBuilder()).append("carouselPage").append(i1).toString());
        viewgroup.addView(viewgroup1);
        return viewgroup1;
    }

    public String a(int i1)
    {
        if (i1 >= 0 && i > i1)
        {
            return (new StringBuilder()).append("carouselPage").append(i1).toString();
        } else
        {
            return null;
        }
    }

    public void a(int i1, List list, int j1, int k1, List list1, String s1, List list2)
    {
        d = j1;
        c = k1;
        e = list;
        f = i1;
        g = list1;
        h = s1;
        i = e.size();
        j = list2;
    }

    public void a(View view, boolean flag)
    {
        if (view != null)
        {
            JcpBrightcoveVideoView jcpbrightcovevideoview = (JcpBrightcoveVideoView)view.findViewWithTag((new StringBuilder()).append("video").append(m).toString());
            if (jcpbrightcovevideoview != null)
            {
                jcpbrightcovevideoview.stopPlayback();
                jcpbrightcovevideoview.seekTo(0);
                if (flag)
                {
                    jcpbrightcovevideoview.getEventEmitter().emit("exitFullScreen");
                }
                jcpbrightcovevideoview.setVisibility(8);
            }
            g();
            view.findViewById(0x7f0e01dd).setVisibility(0);
            view.findViewById(0x7f0e01da).setVisibility(0);
        }
    }

    public void a(ViewGroup viewgroup, int i1, Object obj)
    {
        if (viewgroup != null)
        {
            viewgroup.removeView((RelativeLayout)obj);
        }
    }

    public void a(List list, q q, v v1)
    {
        k = list;
        l = q;
        m = -2;
        o = v1;
    }

    public void a(boolean flag)
    {
        n = flag;
    }

    public boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public int b()
    {
        return i;
    }

    public void c(ViewGroup viewgroup)
    {
        if (viewgroup != null && f())
        {
            viewgroup = (JcpBrightcoveVideoView)viewgroup.findViewWithTag((new StringBuilder()).append("video").append(m).toString());
            if (viewgroup != null)
            {
                viewgroup.getEventEmitter().emit("pause");
            }
        }
    }

    public boolean d()
    {
        return n;
    }

    public String e()
    {
        return a(m);
    }

    public boolean f()
    {
        return m != -2;
    }
}
