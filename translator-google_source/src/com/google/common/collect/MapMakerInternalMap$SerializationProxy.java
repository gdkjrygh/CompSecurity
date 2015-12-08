// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMaker, MapMakerInternalMap, bu

final class onProxy extends onProxy
{

    private static final long serialVersionUID = 3L;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        Object obj = readMapMaker(objectinputstream);
        if (!((MapMaker) (obj)).b)
        {
            obj = new ConcurrentHashMap(((MapMaker) (obj)).b(), 0.75F, ((MapMaker) (obj)).c());
        } else
        {
            if (((MapMaker) (obj)).j == null)
            {
                obj = new MapMakerInternalMap(((MapMaker) (obj)));
            } else
            {
                obj = new readMapMaker(((MapMaker) (obj)));
            }
            obj = (ConcurrentMap)obj;
        }
        _flddelegate = ((ConcurrentMap) (obj));
        readEntries(objectinputstream);
    }

    private Object readResolve()
    {
        return _flddelegate;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        writeMapTo(objectoutputstream);
    }

    onProxy(onProxy onproxy, onProxy onproxy1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, bu bu, ConcurrentMap concurrentmap)
    {
        super(onproxy, onproxy1, equivalence, equivalence1, l, l1, i, j, bu, concurrentmap);
    }
}
