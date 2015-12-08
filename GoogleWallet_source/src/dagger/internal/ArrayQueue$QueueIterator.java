// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package dagger.internal:
//            ArrayQueue

class <init>
    implements Iterator
{

    private int cursor;
    private int fence;
    private int lastRet;
    final ArrayQueue this$0;

    public boolean hasNext()
    {
        return cursor != fence;
    }

    public Object next()
    {
        if (cursor == fence)
        {
            throw new NoSuchElementException();
        }
        Object obj = ArrayQueue.access$300(ArrayQueue.this)[cursor];
        if (ArrayQueue.access$200(ArrayQueue.this) != fence || obj == null)
        {
            throw new ConcurrentModificationException();
        } else
        {
            lastRet = cursor;
            cursor = cursor + 1 & ArrayQueue.access$300(ArrayQueue.this).length - 1;
            return obj;
        }
    }

    public void remove()
    {
        if (lastRet < 0)
        {
            throw new IllegalStateException();
        }
        if (ArrayQueue.access$400(ArrayQueue.this, lastRet))
        {
            cursor = cursor - 1 & ArrayQueue.access$300(ArrayQueue.this).length - 1;
            fence = ArrayQueue.access$200(ArrayQueue.this);
        }
        lastRet = -1;
    }

    private ()
    {
        this$0 = ArrayQueue.this;
        super();
        cursor = ArrayQueue.access$100(ArrayQueue.this);
        fence = ArrayQueue.access$200(ArrayQueue.this);
        lastRet = -1;
    }

    lastRet(lastRet lastret)
    {
        this();
    }
}
