// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.assist.deque;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.nostra13.universalimageloader.core.assist.deque:
//            LinkedBlockingDeque

private abstract class next
    implements Iterator
{

    private lastRet lastRet;
    lastRet next;
    Object nextItem;
    final LinkedBlockingDeque this$0;

    private next succ(next next1)
    {
_L6:
        next next2 = nextNode(next1);
        if (next2 != null) goto _L2; else goto _L1
_L1:
        next next3 = null;
_L4:
        return next3;
_L2:
        next3 = next2;
        if (next2.nextNode != null) goto _L4; else goto _L3
_L3:
        if (next2 == next1)
        {
            return firstNode();
        }
        next1 = next2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void advance()
    {
        ReentrantLock reentrantlock;
        reentrantlock = lock;
        reentrantlock.lock();
        next = succ(next);
        if (next != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Object obj = null;
_L1:
        nextItem = obj;
        reentrantlock.unlock();
        return;
        obj = next.next;
          goto _L1
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    abstract next firstNode();

    public boolean hasNext()
    {
        return next != null;
    }

    public Object next()
    {
        if (next == null)
        {
            throw new NoSuchElementException();
        } else
        {
            lastRet = next;
            Object obj = nextItem;
            advance();
            return obj;
        }
    }

    abstract advance nextNode(advance advance1);

    public void remove()
    {
        ReentrantLock reentrantlock;
        advance advance1;
        advance1 = lastRet;
        if (advance1 == null)
        {
            throw new IllegalStateException();
        }
        lastRet = null;
        reentrantlock = lock;
        reentrantlock.lock();
        if (advance1.lastRet != null)
        {
            unlink(advance1);
        }
        reentrantlock.unlock();
        return;
        Exception exception;
        exception;
        reentrantlock.unlock();
        throw exception;
    }

    Y()
    {
        ReentrantLock reentrantlock;
        this$0 = LinkedBlockingDeque.this;
        super();
        reentrantlock = lock;
        reentrantlock.lock();
        next = firstNode();
        if (next != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        linkedblockingdeque = null;
_L1:
        nextItem = LinkedBlockingDeque.this;
        reentrantlock.unlock();
        return;
        linkedblockingdeque = ((LinkedBlockingDeque) (next.next));
          goto _L1
        linkedblockingdeque;
        reentrantlock.unlock();
        throw LinkedBlockingDeque.this;
    }
}
