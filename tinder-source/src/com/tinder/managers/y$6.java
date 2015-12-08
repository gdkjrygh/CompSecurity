// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.v;
import com.tinder.model.TinderLocation;
import java.util.List;

// Referenced classes of package com.tinder.managers:
//            y

public final class b
    implements com.android.volley.
{

    final v a;
    final TinderLocation b;
    final y c;

    public final void a(Object obj)
    {
        a.y();
        c.a(b);
        if (!y.a(c).contains(b))
        {
            y.a(c).add(b);
        }
    }

    public ocation(y y1, v v1, TinderLocation tinderlocation)
    {
        c = y1;
        a = v1;
        b = tinderlocation;
        super();
    }
}
