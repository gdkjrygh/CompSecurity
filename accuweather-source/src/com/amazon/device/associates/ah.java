// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.amazon.device.associates:
//            al, bb, f, h

public class ah
{

    private static final Map a = new HashMap();

    private ah()
    {
    }

    public static al a(Class class1)
    {
        class1 = (al)a.get(class1);
        if (class1 != null)
        {
            return class1;
        } else
        {
            return null;
        }
    }

    public static void a()
    {
        a.put(com/amazon/device/associates/bb, new bb());
        a.put(com/amazon/device/associates/f, new f());
        a.put(com/amazon/device/associates/h, new h());
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((al)iterator.next()).j()) { }
    }

}
