// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.hi;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            g, h, m, zzi

public class zzk extends FrameLayout
    implements g
{

    private final hi a;
    private final FrameLayout b;
    private final m c = new m(this);
    private zzi d;
    private boolean e;
    private boolean f;
    private TextView g;
    private long h;
    private long i;
    private String j;
    private String k;

    public zzk(Context context, hi hi1, be be, bd bd)
    {
        super(context);
        a = hi1;
        b = new FrameLayout(context);
        addView(b);
        com.google.android.gms.common.internal.e.a(hi1.f());
        d = hi1.f().b.a(context, hi1, be, bd);
        b.addView(d, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        g = new TextView(context);
        g.setBackgroundColor(0xff000000);
        n();
        c.b();
        d.a(this);
    }

    public static void a(hi hi1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        hi1.a("onVideoEvent", hashmap);
    }

    private transient void a(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int j1 = as.length;
        int i1 = 0;
        s = null;
        while (i1 < j1) 
        {
            String s1 = as[i1];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            i1++;
        }
        a.a("onVideoEvent", hashmap);
    }

    private void n()
    {
        if (!o())
        {
            b.addView(g, new android.widget.FrameLayout.LayoutParams(-1, -1));
            b.bringChildToFront(g);
        }
    }

    private boolean o()
    {
        return g.getParent() != null;
    }

    private void p()
    {
        while (a.d() == null || !e || f) 
        {
            return;
        }
        a.d().getWindow().clearFlags(128);
        e = false;
    }

    public final void a()
    {
        if (i == 0L)
        {
            a("canplaythrough", new String[] {
                "duration", String.valueOf((float)d.e() / 1000F), "videoWidth", String.valueOf(d.i()), "videoHeight", String.valueOf(d.j())
            });
        }
    }

    public final void a(float f1)
    {
        d.a(f1);
    }

    public final void a(int i1)
    {
        d.a(i1);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        if (k1 == 0 || l1 == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k1 + 2, l1 + 2);
            layoutparams.setMargins(i1 - 1, j1 - 1, 0, 0);
            b.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public final void a(MotionEvent motionevent)
    {
        d.dispatchTouchEvent(motionevent);
    }

    public final void a(String s)
    {
        k = s;
    }

    public final void a(String s, String s1)
    {
        a("error", new String[] {
            "what", s, "extra", s1
        });
    }

    public final void b()
    {
        if (a.d() != null && !e)
        {
            boolean flag;
            if ((a.d().getWindow().getAttributes().flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            if (!f)
            {
                a.d().getWindow().addFlags(128);
                e = true;
            }
        }
    }

    public final void c()
    {
        a("pause", new String[0]);
        p();
    }

    public final void d()
    {
        a("ended", new String[0]);
        p();
    }

    public final void e()
    {
        n();
        i = h;
    }

    public final void f()
    {
        if (!TextUtils.isEmpty(k))
        {
            d.setMimeType(j);
            d.setVideoPath(k);
            return;
        } else
        {
            a("no_src", new String[0]);
            return;
        }
    }

    public final void g()
    {
        d.d();
    }

    public final void h()
    {
        d.c();
    }

    public final void i()
    {
        d.g();
    }

    public final void j()
    {
        d.h();
    }

    public final void k()
    {
        TextView textview = new TextView(d.getContext());
        textview.setText((new StringBuilder("AdMob - ")).append(d.a()).toString());
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        b.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        b.bringChildToFront(textview);
    }

    public final void l()
    {
        c.a();
        d.b();
        p();
    }

    final void m()
    {
        long l1 = d.f();
        if (h != l1 && l1 > 0L)
        {
            if (o())
            {
                b.removeView(g);
            }
            a("timeupdate", new String[] {
                "time", String.valueOf((float)l1 / 1000F)
            });
            h = l1;
        }
    }

    public void setMimeType(String s)
    {
        j = s;
    }
}
