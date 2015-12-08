// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.adobe.adobepass.accessenabler.utils:
//            Entities, IntHashMap

static class I
    implements I
{

    private final Map mapNameToValue = new HashMap();
    private final IntHashMap mapValueToName = new IntHashMap();

    public void add(String s, int i)
    {
        mapNameToValue.put(s, Integer.valueOf(i));
        mapValueToName.put(i, s);
    }

    public String name(int i)
    {
        return (String)mapValueToName.get(i);
    }

    public int value(String s)
    {
        s = ((String) (mapNameToValue.get(s)));
        if (s == null)
        {
            return -1;
        } else
        {
            return ((Integer)s).intValue();
        }
    }

    I()
    {
    }
}
