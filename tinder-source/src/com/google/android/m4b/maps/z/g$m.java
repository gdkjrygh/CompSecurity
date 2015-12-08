// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.io.Serializable;

// Referenced classes of package com.google.android.m4b.maps.z:
//            b, g, c

static class <init>
    implements b, Serializable
{

    private static final long serialVersionUID = 1L;
    final g a;

    Object writeReplace()
    {
        return new <init>(a);
    }

    (c c)
    {
        this(new g(c, null));
    }

    private nit>(g g1)
    {
        a = g1;
    }

    a(g g1, byte byte0)
    {
        this(g1);
    }
}
