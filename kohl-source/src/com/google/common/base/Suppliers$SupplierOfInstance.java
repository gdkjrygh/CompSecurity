// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers

private static class instance
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Object instance;

    public Object get()
    {
        return instance;
    }

    _cls9(Object obj)
    {
        instance = obj;
    }
}
