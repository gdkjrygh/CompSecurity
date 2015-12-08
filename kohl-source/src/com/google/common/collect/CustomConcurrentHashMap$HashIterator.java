// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

abstract class advance
{

    AtomicReferenceArray currentTable;
    ntry lastReturned;
    y nextEntry;
    ntry nextExternal;
    int nextSegmentIndex;
    int nextTableIndex;
    final CustomConcurrentHashMap this$0;

    final void advance()
    {
        nextExternal = null;
        break MISSING_BLOCK_LABEL_5;
        if (!nextInChain() && !nextInTable())
        {
            while (nextSegmentIndex >= 0) 
            {
                advance aadvance[] = segments;
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

    boolean advanceTo(y y)
    {
        Object obj = y.getKey();
        Object obj1 = y.getValueReference().get();
        if (obj != null && obj1 != null && (!expires() || !isExpired(y)))
        {
            nextExternal = new ntry(CustomConcurrentHashMap.this, obj, obj1);
            return true;
        } else
        {
            return false;
        }
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
        if (nextEntry != null)
        {
            for (nextEntry = nextEntry.getNext(); nextEntry != null; nextEntry = nextEntry.getNext())
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
            obj = (y)((AtomicReferenceArray) (obj)).get(i);
            nextEntry = ((y) (obj));
            if (obj != null && (advanceTo(nextEntry) || nextInChain()))
            {
                return true;
            }
        }
        return false;
    }

    public void remove()
    {
        boolean flag;
        if (lastReturned != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        CustomConcurrentHashMap.this.remove(lastReturned.getKey());
        lastReturned = null;
    }

    ntry()
    {
        this$0 = CustomConcurrentHashMap.this;
        super();
        nextSegmentIndex = segments.length - 1;
        nextTableIndex = -1;
        advance();
    }
}
