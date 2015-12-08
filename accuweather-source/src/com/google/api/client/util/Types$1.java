// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.api.client.util:
//            Types

static final class val.value
    implements Iterable
{

    final Object val$value;

    public Iterator iterator()
    {
        return new Iterator() {

            int index;
            final int length;
            final Types._cls1 this$0;

            public boolean hasNext()
            {
                return index < length;
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    Object obj = value;
                    int i = index;
                    index = i + 1;
                    return Array.get(obj, i);
                }
            }

            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            
            {
                this$0 = Types._cls1.this;
                super();
                length = Array.getLength(value);
                index = 0;
            }
        };
    }

    _cls1.index(Object obj)
    {
        val$value = obj;
        super();
    }
}
