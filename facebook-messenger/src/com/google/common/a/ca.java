// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ci, bj

final class ca extends ci
    implements Iterator
{

    final bj a;

    ca(bj bj)
    {
        a = bj;
        super(bj);
    }

    public java.util.Map.Entry a()
    {
        return e();
    }

    public Object next()
    {
        return a();
    }
}
