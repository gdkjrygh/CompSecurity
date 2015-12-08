// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gx, hs

public class dy
{

    private final hs a;
    private final boolean b;
    private final String c;

    public dy(hs hs1, Map map)
    {
        a = hs1;
        c = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            b = true;
            return;
        }
    }

    public void a()
    {
        if (a == null)
        {
            zzb.zzaE("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(c))
        {
            i = zzp.zzbz().b();
        } else
        if ("landscape".equalsIgnoreCase(c))
        {
            i = zzp.zzbz().a();
        } else
        if (b)
        {
            i = -1;
        } else
        {
            i = zzp.zzbz().c();
        }
        a.setRequestedOrientation(i);
    }
}
