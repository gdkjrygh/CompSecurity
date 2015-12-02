// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import com.facebook.http.b.m;
import com.facebook.http.b.u;
import javax.inject.a;

// Referenced classes of package com.facebook.zero.rewrite:
//            a, f

public class b
    implements u
{

    private final f a;
    private final a b;

    public b(f f, a a1)
    {
        a = f;
        b = a1;
    }

    public m a(m m)
    {
        return new com.facebook.zero.rewrite.a(m, b, a);
    }
}
