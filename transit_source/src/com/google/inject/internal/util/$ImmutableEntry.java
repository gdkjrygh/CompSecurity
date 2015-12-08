// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;

// Referenced classes of package com.google.inject.internal.util:
//            $AbstractMapEntry

class $ImmutableEntry extends $AbstractMapEntry
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object key;
    private final Object value;

    $ImmutableEntry(Object obj, Object obj1)
    {
        key = obj;
        value = obj1;
    }

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }
}
