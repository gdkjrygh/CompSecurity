// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, WellBehavedMap

class val.key extends AbstractMapEntry
{

    final val.key this$0;
    final Object val$key;

    public Object getKey()
    {
        return val$key;
    }

    public Object getValue()
    {
        return p.get(val$key);
    }

    public Object setValue(Object obj)
    {
        return p.put(val$key, obj);
    }

    ()
    {
        this$0 = final_;
        val$key = Object.this;
        super();
    }
}
