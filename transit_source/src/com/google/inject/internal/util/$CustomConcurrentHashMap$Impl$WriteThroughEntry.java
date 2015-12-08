// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $AbstractMapEntry, $CustomConcurrentHashMap

final class value extends $AbstractMapEntry
{

    final Object key;
    final value this$0;
    Object value;

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    public Object setValue(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            Object obj1 = value.this.value(getKey(), obj);
            value = obj;
            return obj1;
        }
    }

    (Object obj, Object obj1)
    {
        this$0 = this._cls0.this;
        super();
        key = obj;
        value = obj1;
    }
}
