// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aq, ax, cw, aw, 
//            ba

public final class az
    implements aq
{

    public az()
    {
    }

    public final void a(cw cw1, Map map)
    {
        d.k();
        if (map.containsKey("abort"))
        {
            if (!com.google.android.gms.internal.ax.a(cw1))
            {
                b.e("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            b.e("Precache video action is missing the src parameter.");
            return;
        }
        boolean flag;
        try
        {
            Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception) { }
        if (map.containsKey("mimetype"))
        {
            map.get("mimetype");
        }
        if (com.google.android.gms.internal.ax.b(cw1) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            b.e("Precache task already running.");
            return;
        } else
        {
            com.google.android.gms.common.internal.d.a(cw1.e());
            (new aw(cw1, cw1.e().a.a(), s)).b();
            return;
        }
    }
}
