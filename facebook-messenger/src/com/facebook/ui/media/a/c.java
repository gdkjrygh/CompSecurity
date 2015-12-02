// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.a;

import java.io.InputStream;
import org.apache.http.HttpEntity;

// Referenced classes of package com.facebook.ui.media.a:
//            e, g, f, d

public abstract class c
{

    private final d a;

    protected c(d d1)
    {
        a = d1;
    }

    public static c a(d d1)
    {
        return new e(d1);
    }

    public static c a(InputStream inputstream)
    {
        return new g(inputstream);
    }

    public static c a(HttpEntity httpentity)
    {
        return new f(httpentity);
    }

    public d a()
    {
        return a;
    }

    public InputStream b()
    {
        throw new UnsupportedOperationException();
    }

    public void c()
    {
    }

    public long d()
    {
        return -1L;
    }
}
