// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import com.android.volley.c;
import com.android.volley.k;
import com.bumptech.glide.integration.volley.a;
import com.bumptech.glide.integration.volley.b;
import com.cardinalblue.android.piccollage.controller.network.e;
import java.util.Map;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            PCApplication

class a
    implements a
{

    final PCApplication a;

    public k a(String s, b b, com.android.volley.ey.b b1, Map map)
    {
        s = new e(s, b, b1, map);
        s.a(new c(2500, 5, 1.0F));
        return s;
    }

    rk.e(PCApplication pcapplication)
    {
        a = pcapplication;
        super();
    }
}
