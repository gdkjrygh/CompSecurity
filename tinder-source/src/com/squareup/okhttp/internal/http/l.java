// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.o;
import com.squareup.okhttp.r;
import com.squareup.okhttp.w;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            k

public final class l extends w
{

    private final o a;
    private final e b;

    public l(o o1, e e)
    {
        a = o1;
        b = e;
    }

    public final r a()
    {
        String s = a.a("Content-Type");
        if (s != null)
        {
            return r.a(s);
        } else
        {
            return null;
        }
    }

    public final long b()
    {
        return k.a(a);
    }

    public final e c()
    {
        return b;
    }
}
