// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

abstract class advance
{

    AtomicReferenceArray currentTable;
    ntry lastReturned;
    Object nextEntry;
    ntry nextExternal;
    int nextSegmentIndex;
    int nextTableIndex;
    final ntry this$0;

    final void advance()
    {
        nextExternal = null;
        break MISSING_BLOCK_LABEL_5;
        if (!nextInChain() && !nextInTable())
        {
            while (nextSegmentIndex >= 0) 
            {
                advance aadvance[] = this._cls0.this.nextSegmentIndex;
                int i = nextSegmentIndex;
                nextSegmentIndex = i - 1;
                advance advance1 = aadvance[i];
                if (advance1. != 0)
                {
                    currentTable = advance1.;
                    nextTableIndex = currentTable.length() - 1;
                    if (nextInTable())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    boolean advanceTo(Object obj)
    {
        nextInTable nextintable = this._cls0.this.nextInTable;
        Object obj1 = nextintable._mth0(obj);
        obj = nextintable._mth0(obj);
        if (obj1 != null && obj != null)
        {
            nextExternal = new ntry(this._cls0.this, obj1, obj);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean hasMoreElements()
    {
        return hasNext();
    }

    public boolean hasNext()
    {
        return nextExternal != null;
    }

    ntry nextEntry()
    {
        if (nextExternal == null)
        {
            throw new NoSuchElementException();
        } else
        {
            lastReturned = nextExternal;
            advance();
            return lastReturned;
        }
    }

    boolean nextInChain()
    {
        lastReturned lastreturned = this._cls0.this.lastReturned;
        if (nextEntry != null)
        {
            for (nextEntry = lastreturned.nextEntry(nextEntry); nextEntry != null; nextEntry = lastreturned.nextEntry(nextEntry))
            {
                if (advanceTo(nextEntry))
                {
                    return true;
                }
            }

        }
        return false;
    }

    boolean nextInTable()
    {
        while (nextTableIndex >= 0) 
        {
            Object obj = currentTable;
            int i = nextTableIndex;
            nextTableIndex = i - 1;
            obj = ((AtomicReferenceArray) (obj)).get(i);
            nextEntry = obj;
            if (obj != null && (advanceTo(nextEntry) || nextInChain()))
            {
                return true;
            }
        }
        return false;
    }

    public void remove()
    {
        if (lastReturned == null)
        {
            throw new IllegalStateException();
        } else
        {
            lastReturned.this.lastReturned(lastReturned.getKey());
            lastReturned = null;
            return;
        }
    }

    ntry()
    {
        this$0 = this._cls0.this;
        super();
        nextSegmentIndex = nextSegmentIndex.this.nextSegmentIndex.length - 1;
        nextTableIndex = -1;
        advance();
    }
}
