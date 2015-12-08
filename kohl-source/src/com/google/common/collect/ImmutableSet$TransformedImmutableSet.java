// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ObjectArrays, UnmodifiableIterator, AbstractIndexedListIterator

static abstract class hashCode extends ImmutableSet
{

    final int hashCode;
    final Object source[];

    public final int hashCode()
    {
        return hashCode;
    }

    public boolean isEmpty()
    {
        return false;
    }

    boolean isHashCodeFast()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return new AbstractIndexedListIterator(source.length) {

            final ImmutableSet.TransformedImmutableSet this$0;

            protected Object get(int i)
            {
                return transform(source[i]);
            }

            
            {
                this$0 = ImmutableSet.TransformedImmutableSet.this;
                super(i);
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return source.length;
    }

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        for (i = 0; i < source.length; i++)
        {
            aobj1[i] = transform(source[i]);
        }

        break; /* Loop/switch isn't completed */
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return aobj1;
    }

    abstract Object transform(Object obj);

    _cls1.this._cls0(Object aobj[], int i)
    {
        source = aobj;
        hashCode = i;
    }
}
