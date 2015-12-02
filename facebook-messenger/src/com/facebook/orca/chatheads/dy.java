// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.g;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import javax.inject.a;

public class dy
    implements a
{

    public static final ae a = n.a("messenger_chat_heads_android");
    private static final Class b = com/facebook/orca/chatheads/dy;
    private final Context c;
    private final d d;
    private final com.facebook.config.a.a e;
    private final Resources f;

    public dy(Context context, d d1, com.facebook.config.a.a a1, Resources resources)
    {
        c = context;
        d = d1;
        e = a1;
        f = resources;
    }

    private boolean c()
    {
        DisplayMetrics displaymetrics = f.getDisplayMetrics();
        int i = Math.min(displaymetrics.widthPixels, displaymetrics.heightPixels);
        int j = Math.max(displaymetrics.widthPixels, displaymetrics.heightPixels);
        int k = f.getDimensionPixelSize(g.chat_heads_minimum_portrait_width);
        int l = f.getDimensionPixelSize(g.chat_heads_minimum_portrait_height);
        if (i < k || j < l)
        {
            com.facebook.debug.log.b.a(b, (new StringBuilder()).append("screen size not supported: ").append(displaymetrics.widthPixels).append(",").append(displaymetrics.heightPixels).toString());
            return false;
        } else
        {
            return true;
        }
    }

    public Boolean a()
    {
        boolean flag = false;
        if (!d.a(a, false))
        {
            return Boolean.valueOf(false);
        }
        if (c.checkCallingOrSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == -1)
        {
            return Boolean.valueOf(false);
        }
        if (!c())
        {
            return Boolean.valueOf(false);
        }
        if (e.i() == com.facebook.config.a.d.MESSENGER)
        {
            flag = true;
        }
        return Boolean.valueOf(flag);
    }

    public Object b()
    {
        return a();
    }

}
