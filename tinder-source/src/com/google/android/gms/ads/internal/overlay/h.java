// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.cw;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            g, l, f

public final class h extends FrameLayout
{

    public final cw a;
    final FrameLayout b;
    public final l c = new l(this);
    public f d;
    public boolean e;
    public boolean f;
    TextView g;
    long h;
    public String i;
    private String j;

    public h(Context context, cw cw1)
    {
        super(context);
        a = cw1;
        b = new FrameLayout(context);
        addView(b, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.d.a(cw1.e());
        d = cw1.e().b.a();
        if (d != null)
        {
            b.addView(d, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        }
        g = new TextView(context);
        g.setBackgroundColor(0xff000000);
        if (!c())
        {
            b.addView(g, new android.widget.FrameLayout.LayoutParams(-1, -1));
            b.bringChildToFront(g);
        }
        c.a();
        if (d == null)
        {
            a("error", new String[] {
                "what", "AdVideoUnderlay Error", "extra", "Allocating player failed."
            });
        }
    }

    public static void a(cw cw1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        cw1.a("onVideoEvent", hashmap);
    }

    public final void a()
    {
        if (d == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(i))
        {
            d.setMimeType(j);
            d.setVideoPath(i);
            return;
        } else
        {
            a("no_src", new String[0]);
            return;
        }
    }

    public final void a(int k, int i1, int j1, int k1)
    {
        if (j1 == 0 || k1 == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(j1 + 2, k1 + 2);
            layoutparams.setMargins(k - 1, i1 - 1, 0, 0);
            b.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    final transient void a(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int i1 = as.length;
        int k = 0;
        s = null;
        while (k < i1) 
        {
            String s1 = as[k];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            k++;
        }
        a.a("onVideoEvent", hashmap);
    }

    public final void b()
    {
        if (d == null)
        {
            return;
        } else
        {
            TextView textview = new TextView(d.getContext());
            textview.setText((new StringBuilder("AdMob - ")).append(d.a()).toString());
            textview.setTextColor(0xffff0000);
            textview.setBackgroundColor(-256);
            b.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            b.bringChildToFront(textview);
            return;
        }
    }

    final boolean c()
    {
        return g.getParent() != null;
    }

    public final void setMimeType(String s)
    {
        j = s;
    }
}
