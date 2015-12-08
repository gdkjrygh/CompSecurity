// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;

public final class jpe extends FrameLayout
{

    final kxu a;
    public final FrameLayout b;
    final jph c;
    public jpd d;
    TextView e;
    long f;
    public String g;
    public String h;

    public jpe(Context context, kxu kxu1, int i, ktm ktm, ktl ktl)
    {
        super(context);
        a = kxu1;
        b = new FrameLayout(context);
        addView(b);
        b.c(kxu1.f());
        throw new NullPointerException();
    }

    public static void a(kxu kxu1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        kxu1.a("onVideoEvent", hashmap);
    }

    public final void a()
    {
        if (TextUtils.isEmpty(h))
        {
            a("no_src", new String[0]);
        }
    }

    public final void a(int i, int j, int k, int l)
    {
        if (k == 0 || l == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k + 2, l + 2);
            layoutparams.setMargins(i - 1, j - 1, 0, 0);
            b.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    transient void a(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int j = as.length;
        int i = 0;
        s = null;
        while (i < j) 
        {
            String s1 = as[i];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            i++;
        }
        a.a("onVideoEvent", hashmap);
    }

    boolean b()
    {
        return e.getParent() != null;
    }
}
