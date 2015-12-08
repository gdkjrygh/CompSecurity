// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            MapMaker, bu

final class computingFunction extends computingFunction
{

    private static final long serialVersionUID = 4L;
    final d computingFunction;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        _flddelegate = readMapMaker(objectinputstream).a(computingFunction);
        readEntries(objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        writeMapTo(objectoutputstream);
    }

    final Object readResolve()
    {
        return _flddelegate;
    }

    ( ,  1, Equivalence equivalence, Equivalence equivalence1, long l, long l1, int i, int j, bu bu, ConcurrentMap concurrentmap, d d)
    {
        super(, 1, equivalence, equivalence1, l, l1, i, j, bu, concurrentmap);
        computingFunction = d;
    }
}
