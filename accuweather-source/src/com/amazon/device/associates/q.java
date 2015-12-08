// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            at, ar, ap, bg, 
//            b

final class q
    implements at
{

    private static final Map a;

    q()
    {
    }

    public Class a(Class class1)
    {
        return (Class)a.get(class1);
    }

    static 
    {
        a = new HashMap();
        a.put(com/amazon/device/associates/ar, com/amazon/device/associates/ap);
        a.put(com/amazon/device/associates/bg, com/amazon/device/associates/b);
    }
}
