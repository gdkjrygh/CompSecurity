// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public abstract class StaticListSerializerBase extends StdSerializer
{

    protected StaticListSerializerBase(Class class1)
    {
        super(class1, false);
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (Collection)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Collection collection)
    {
        return collection == null || collection.size() == 0;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Collection)obj);
    }

    public boolean isEmpty(Collection collection)
    {
        return isEmpty(null, collection);
    }
}
