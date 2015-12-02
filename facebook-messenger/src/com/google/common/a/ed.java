// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            ik

class ed
    implements Supplier, Serializable
{

    final int a;

    ed(int i)
    {
        a = i;
    }

    public Map a()
    {
        return ik.a(a);
    }

    public Object get()
    {
        return a();
    }
}
