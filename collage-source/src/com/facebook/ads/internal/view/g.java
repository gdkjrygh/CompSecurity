// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import com.facebook.ads.internal.util.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class g extends LinearLayout
{

    private MediaController a;
    private VideoView b;
    private String c;
    private String d;
    private boolean e;
    private int f;
    private Handler g;
    private Handler h;

    public g(Context context)
    {
        super(context);
        b();
    }

    static int a(g g1, int i)
    {
        g1.f = i;
        return i;
    }

    static VideoView a(g g1)
    {
        return g1.b;
    }

    static int b(g g1)
    {
        return g1.f;
    }

    private void b()
    {
        a = new MediaController(getContext());
        b = new VideoView(getContext());
        a.setAnchorView(this);
        b.setMediaController(a);
        Object obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        addView(b);
        h = new Handler();
        obj = new Runnable(new WeakReference(this)) {

            final WeakReference a;
            final g b;

            public void run()
            {
                if ((g)a.get() != null)
                {
                    int i = g.a(b).getCurrentPosition();
                    if (i > g.b(b))
                    {
                        g.a(b, i);
                    }
                    g.c(b).postDelayed(this, 250L);
                }
            }

            
            {
                b = g.this;
                a = weakreference;
                super();
            }
        };
        h.postDelayed(((Runnable) (obj)), 250L);
        g = new Handler();
        obj = new Runnable() {

            final g a;

            public void run()
            {
                if (g.a(a).getCurrentPosition() > 3000)
                {
                    (new o()).execute(new String[] {
                        a.getVideoPlayReportURI()
                    });
                    return;
                } else
                {
                    g.d(a).postDelayed(this, 250L);
                    return;
                }
            }

            
            {
                a = g.this;
                super();
            }
        };
        g.postDelayed(((Runnable) (obj)), 250L);
    }

    static Handler c(g g1)
    {
        return g1.h;
    }

    private void c()
    {
        if (!e && getVideoTimeReportURI() != null)
        {
            HashMap hashmap = new HashMap();
            hashmap.put("time", Integer.toString(f / 1000));
            hashmap.put("inline", "0");
            (new o(hashmap)).execute(new String[] {
                getVideoTimeReportURI()
            });
            e = true;
            f = 0;
        }
    }

    static Handler d(g g1)
    {
        return g1.g;
    }

    public void a()
    {
        b.start();
    }

    public String getVideoPlayReportURI()
    {
        return c;
    }

    public String getVideoTimeReportURI()
    {
        return d;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    public void setVideoPlayReportURI(String s)
    {
        c = s;
    }

    public void setVideoTimeReportURI(String s)
    {
        d = s;
    }

    public void setVideoURI(Uri uri)
    {
        if (uri != null)
        {
            b.setVideoURI(uri);
        }
    }

    public void setVideoURI(String s)
    {
        if (s != null)
        {
            setVideoURI(Uri.parse(s));
        }
    }
}
