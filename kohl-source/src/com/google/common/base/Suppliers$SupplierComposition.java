// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Supplier, Suppliers, Function

private static class supplier
    implements Supplier, Serializable
{

    private static final long serialVersionUID = 0L;
    final Function function;
    final Supplier supplier;

    public Object get()
    {
        return function.apply(supplier.get());
    }

    (Function function1, Supplier supplier1)
    {
        function = function1;
        supplier = supplier1;
    }
}
