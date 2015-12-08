// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, MapMaker, MapEvictionListener

static class computingFunction extends computingFunction
{

    private static final long serialVersionUID = 2L;
    transient cache cache;
    final Function computingFunction;

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        cache = readMapMaker(objectinputstream).makeCache(computingFunction);
        _flddelegate = cache.cache();
        readEntries(objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        writeMapTo(objectoutputstream);
    }

    public Object apply(Object obj)
    {
        return cache.cache(obj);
    }

    public ConcurrentMap asMap()
    {
        return _flddelegate;
    }

    Object readResolve()
    {
        return cache;
    }

    ( ,  1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, MapEvictionListener mapevictionlistener, ConcurrentMap concurrentmap, Function function)
    {
        super(, 1, equivalence, equivalence1, l, l1, i, j, mapevictionlistener, concurrentmap);
        computingFunction = function;
    }
}
