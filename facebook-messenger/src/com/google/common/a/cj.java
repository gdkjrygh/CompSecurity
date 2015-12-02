// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ci, dk, bj

final class cj extends ci
    implements Iterator
{

    final bj a;

    cj(bj bj)
    {
        a = bj;
        super(bj);
    }

    public Object next()
    {
        return e().getKey();
    }
}
