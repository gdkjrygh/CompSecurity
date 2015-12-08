// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.time;

import java.util.Calendar;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package org.apache.commons.lang3.time:
//            DateUtils

static class spot
    implements Iterator
{

    private final Calendar endFinal;
    private final Calendar spot;

    public boolean hasNext()
    {
        return spot.before(endFinal);
    }

    public volatile Object next()
    {
        return next();
    }

    public Calendar next()
    {
        if (spot.equals(endFinal))
        {
            throw new NoSuchElementException();
        } else
        {
            spot.add(5, 1);
            return (Calendar)spot.clone();
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    (Calendar calendar, Calendar calendar1)
    {
        endFinal = calendar1;
        spot = calendar;
        spot.add(5, -1);
    }
}
