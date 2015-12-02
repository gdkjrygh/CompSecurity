// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.f;

import com.facebook.config.background.a;
import com.facebook.http.protocol.v;
import com.facebook.prefs.shared.d;
import java.util.Set;

// Referenced classes of package com.facebook.f:
//            i, a

public class g extends a
{

    private final d a;
    private final com.facebook.f.a b;
    private final Set c;

    public g(d d, com.facebook.f.a a1, Set set)
    {
        a = d;
        b = a1;
        c = set;
    }

    static Set a(g g1)
    {
        return g1.c;
    }

    static com.facebook.f.a b(g g1)
    {
        return g1.b;
    }

    static d c(g g1)
    {
        return g1.a;
    }

    public v a()
    {
        return new i(this, null);
    }
}
