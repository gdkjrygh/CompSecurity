// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, ImmutableCollection

abstract class ImmutableAsList extends ImmutableList
{

    ImmutableAsList()
    {
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract ImmutableCollection c();

    public boolean contains(Object obj)
    {
        return c().contains(obj);
    }

    final boolean e()
    {
        return c().e();
    }

    public boolean isEmpty()
    {
        return c().isEmpty();
    }

    public int size()
    {
        return c().size();
    }

    Object writeReplace()
    {
        return new SerializedForm(c());
    }

    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableCollection collection;

        Object readResolve()
        {
            return collection.b();
        }

        SerializedForm(ImmutableCollection immutablecollection)
        {
            collection = immutablecollection;
        }
    }

}
