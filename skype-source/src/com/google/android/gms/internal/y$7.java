// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, y, w, hi

final class a
    implements cf
{

    final y a;

    public final void a(hi hi, Map map)
    {
        if (!a.a(map))
        {
            return;
        } else
        {
            (new StringBuilder("Received request to untrack: ")).append(com.google.android.gms.internal.y.b(a).d());
            b.a(3);
            a.b();
            return;
        }
    }

    util.client.b(y y1)
    {
        a = y1;
        super();
    }
}
