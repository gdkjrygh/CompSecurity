// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aq, ap, cw

static final class il.client.b
    implements aq
{

    public final void a(cw cw, Map map)
    {
        b.c((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
    }

    il.client.b()
    {
    }
}
