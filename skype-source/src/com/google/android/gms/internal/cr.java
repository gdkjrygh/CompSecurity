// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, cp, hi, co, 
//            cs

public final class cr
    implements cf
{

    public cr()
    {
    }

    public final void a(hi hi1, Map map)
    {
        p.r();
        if (map.containsKey("abort"))
        {
            if (!cp.a(hi1))
            {
                b.c("Precache abort but no preload task running.");
            }
            return;
        }
        String s = (String)map.get("src");
        if (s == null)
        {
            b.c("Precache video action is missing the src parameter.");
            return;
        }
        try
        {
            Integer.parseInt((String)map.get("player"));
        }
        catch (NumberFormatException numberformatexception) { }
        if (map.containsKey("mimetype"))
        {
            map.get("mimetype");
        }
        if (com.google.android.gms.internal.cp.b(hi1))
        {
            b.c("Precache task already running.");
            return;
        } else
        {
            e.a(hi1.f());
            (new co(hi1, hi1.f().a.a(hi1), s)).e();
            return;
        }
    }
}
