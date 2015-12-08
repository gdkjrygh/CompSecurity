// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.cf;
import com.google.android.gms.internal.ck;
import com.google.android.gms.internal.hi;
import java.util.Map;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            m

public static final class b
    implements cf
{

    public final void a(hi hi, Map map)
    {
        hi = (String)map.get("request_id");
        map = (String)map.get("errors");
        b.c((new StringBuilder("Invalid request: ")).append(map).toString());
        m.c().b(hi);
    }

    public b()
    {
    }
}
