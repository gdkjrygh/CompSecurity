// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;

public final class bhw extends FrameLayout
    implements bht
{

    final FrameLayout a;
    public final bic b = new bic(this);
    public bhu c;
    TextView d;
    long e;
    public String f;
    private final ckw g;
    private boolean h;
    private boolean i;
    private long j;

    public bhw(Context context, ckw ckw1, cbk cbk, cbi cbi)
    {
        super(context);
        g = ckw1;
        a = new FrameLayout(context);
        addView(a, new android.widget.FrameLayout.LayoutParams(-1, -1));
        bru.a(ckw1.g());
        c = ckw1.g().b.a(context, ckw1, cbk, cbi);
        if (c != null)
        {
            a.addView(c, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        }
        d = new TextView(context);
        d.setBackgroundColor(0xff000000);
        j();
        b.a();
        if (c != null)
        {
            c.a(this);
        }
        if (c == null)
        {
            a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public static void a(ckw ckw1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        ckw1.a("onVideoEvent", hashmap);
    }

    private void j()
    {
        if (!h())
        {
            a.addView(d, new android.widget.FrameLayout.LayoutParams(-1, -1));
            a.bringChildToFront(d);
        }
    }

    public final void a()
    {
        while (c == null || j != 0L) 
        {
            return;
        }
        a("canplaythrough", new String[] {
            "duration", String.valueOf((float)c.e() / 1000F), "videoWidth", String.valueOf(c.i()), "videoHeight", String.valueOf(c.j())
        });
    }

    public final void a(int k, int l, int i1, int j1)
    {
        if (i1 == 0 || j1 == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(i1 + 2, j1 + 2);
            layoutparams.setMargins(k - 1, l - 1, 0, 0);
            a.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public final void a(String s, String s1)
    {
        a("error", new String[] {
            "what", s, "extra", s1
        });
    }

    final transient void a(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int l = as.length;
        int k = 0;
        s = null;
        while (k < l) 
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
        g.a("onVideoEvent", hashmap);
    }

    public final void b()
    {
        if (g.e() != null && !h)
        {
            boolean flag;
            if ((g.e().getWindow().getAttributes().flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = flag;
            if (!i)
            {
                g.e().getWindow().addFlags(128);
                h = true;
            }
        }
    }

    public final void c()
    {
        a("pause", new String[0]);
        i();
    }

    public final void d()
    {
        a("ended", new String[0]);
        i();
    }

    public final void e()
    {
        j();
        j = e;
    }

    public final void f()
    {
        if (c == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(f))
        {
            c.a(f);
            return;
        } else
        {
            a("no_src", new String[0]);
            return;
        }
    }

    public final void g()
    {
        if (c == null)
        {
            return;
        } else
        {
            TextView textview = new TextView(c.getContext());
            textview.setText((new StringBuilder("AdMob - ")).append(c.a()).toString());
            textview.setTextColor(0xffff0000);
            textview.setBackgroundColor(-256);
            a.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            a.bringChildToFront(textview);
            return;
        }
    }

    final boolean h()
    {
        return d.getParent() != null;
    }

    public final void i()
    {
        while (g.e() == null || !h || i) 
        {
            return;
        }
        g.e().getWindow().clearFlags(128);
        h = false;
    }
}
