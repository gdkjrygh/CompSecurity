// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            POJOPropertyBuilder, AnnotatedMember

protected static class next
    implements Iterator
{

    private next next;

    public boolean hasNext()
    {
        return next != null;
    }

    public AnnotatedMember next()
    {
        if (next == null)
        {
            throw new NoSuchElementException();
        } else
        {
            AnnotatedMember annotatedmember = (AnnotatedMember)next.next;
            next = next.next;
            return annotatedmember;
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

    public ( )
    {
        next = ;
    }
}
