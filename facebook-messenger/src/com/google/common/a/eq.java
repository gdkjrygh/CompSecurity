// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.io.Serializable;

// Referenced classes of package com.google.common.a:
//            w

class eq extends w
    implements Serializable
{

    private final Object a;
    private final Object b;

    eq(Object obj, Object obj1)
    {
        a = obj;
        b = obj1;
    }

    public Object getKey()
    {
        return a;
    }

    public Object getValue()
    {
        return b;
    }

    public final Object setValue(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
