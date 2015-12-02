// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appconfig;

import com.facebook.config.background.a;
import com.facebook.http.protocol.v;

// Referenced classes of package com.facebook.appconfig:
//            e, o, b

public class c extends a
{

    private final o a;
    private final b b;

    public c(o o, b b1)
    {
        a = o;
        b = b1;
    }

    static o a(c c1)
    {
        return c1.a;
    }

    static b b(c c1)
    {
        return c1.b;
    }

    public v a()
    {
        return new e(this, null);
    }
}
