// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package org.apache.commons.lang3:
//            CharRange

private static class <init>
    implements Iterator
{

    private char current;
    private boolean hasNext;
    private final CharRange range;

    private void prepareNext()
    {
        if (CharRange.access$100(range))
        {
            if (current == '\uFFFF')
            {
                hasNext = false;
                return;
            }
            if (current + 1 == CharRange.access$200(range))
            {
                if (CharRange.access$300(range) == '\uFFFF')
                {
                    hasNext = false;
                    return;
                } else
                {
                    current = (char)(CharRange.access$300(range) + 1);
                    return;
                }
            } else
            {
                current = (char)(current + 1);
                return;
            }
        }
        if (current < CharRange.access$300(range))
        {
            current = (char)(current + 1);
            return;
        } else
        {
            hasNext = false;
            return;
        }
    }

    public boolean hasNext()
    {
        return hasNext;
    }

    public Character next()
    {
        if (!hasNext)
        {
            throw new NoSuchElementException();
        } else
        {
            char c = current;
            prepareNext();
            return Character.valueOf(c);
        }
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    private (CharRange charrange)
    {
        range = charrange;
        hasNext = true;
        if (CharRange.access$100(range))
        {
            if (CharRange.access$200(range) == 0)
            {
                if (CharRange.access$300(range) == '\uFFFF')
                {
                    hasNext = false;
                    return;
                } else
                {
                    current = (char)(CharRange.access$300(range) + 1);
                    return;
                }
            } else
            {
                current = '\0';
                return;
            }
        } else
        {
            current = CharRange.access$200(range);
            return;
        }
    }

    range(CharRange charrange, range range1)
    {
        this(charrange);
    }
}
