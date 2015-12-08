// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.google.android.m4b.maps.ay.b;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            x, v, t, u, 
//            cc, ag, af, bm, 
//            cb

public final class w
{

    final FrameLayout a;
    public final Resources b;
    public final ag c;
    public final af d;
    public final bm e;
    public final cb f;
    public final b g;
    public cc h;
    public List i;
    public t j;
    private final Context k;
    private v l;

    public w(Context context, Resources resources, ag ag, af af, bm bm, cb cb, b b1)
    {
        a = new FrameLayout(context);
        a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        a.setTag("GoogleMapMapsEngineInfocardManagerView");
        k = context;
        b = resources;
        c = ag;
        d = af;
        e = bm;
        f = cb;
        g = b1;
    }

    private void c()
    {
        if (l != null)
        {
            a.removeView(l);
            a.invalidate();
            j = null;
            l = null;
        }
    }

    public final void a()
    {
        c();
        l = new x(k, b, this, i);
        l.setTag("GoogleMapMapsEngineInfolist");
        a.addView(l);
    }

    public final void a(int i1)
    {
        boolean flag = true;
        c();
        j = (t)i.get(i1);
        Context context = k;
        Resources resources = b;
        if (i == null || i.size() <= 1)
        {
            flag = false;
        }
        l = new u(context, resources, this, flag, j);
        l.setTag("GoogleMapMapsEngineInfocard");
        a.addView(l);
    }

    public final void b()
    {
        c();
        if (h != null)
        {
            h.c();
            h = null;
        }
        i = null;
    }
}
