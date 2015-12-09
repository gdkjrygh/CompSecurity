// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import com.amazon.device.iap.internal.a;
import com.amazon.device.iap.internal.b;
import com.amazon.device.iap.internal.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazon.device.iap.internal.b:
//            c, f

public final class g
    implements b
{

    private static final Map a;

    public g()
    {
    }

    public Class a(Class class1)
    {
        return (Class)a.get(class1);
    }

    static 
    {
        a = new HashMap();
        a.put(com/amazon/device/iap/internal/c, com/amazon/device/iap/internal/b/c);
        a.put(com/amazon/device/iap/internal/a, com/amazon/device/iap/internal/b/f);
    }
}
