// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, cc, hi

public final class cb
    implements cf
{

    private final cc a;

    public cb(cc cc1)
    {
        a = cc1;
    }

    public final void a(hi hi, Map map)
    {
        hi = (String)map.get("name");
        if (hi == null)
        {
            b.c("App event with no name parameter.");
            return;
        } else
        {
            a.a(hi, (String)map.get("info"));
            return;
        }
    }
}
