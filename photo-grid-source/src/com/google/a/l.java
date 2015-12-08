// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.util.HashMap;

// Referenced classes of package com.google.a:
//            k

final class l extends ThreadLocal
{

    final k a;

    l(k k)
    {
        a = k;
        super();
    }

    protected final Object initialValue()
    {
        return new HashMap();
    }
}
