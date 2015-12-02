// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import com.facebook.config.background.a;
import com.facebook.http.protocol.v;

// Referenced classes of package com.facebook.nux.status:
//            h, a, j

public class f extends a
{

    private static final Class a = com/facebook/nux/status/f;
    private final com.facebook.nux.status.a b;
    private final j c;

    public f(com.facebook.nux.status.a a1, j j)
    {
        b = a1;
        c = j;
    }

    static com.facebook.nux.status.a a(f f1)
    {
        return f1.b;
    }

    static j b(f f1)
    {
        return f1.c;
    }

    public v a()
    {
        return new h(this, null);
    }

}
