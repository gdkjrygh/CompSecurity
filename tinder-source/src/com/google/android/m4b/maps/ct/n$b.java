// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            n

static final class a
    implements Iterator
{

    private Iterator a;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.Entry entry = (java.util.Entry)a.next();
        Object obj = entry;
        if (entry.getValue() instanceof n)
        {
            obj = new <init>(entry, (byte)0);
        }
        return obj;
    }

    public final void remove()
    {
        a.remove();
    }

    public (Iterator iterator)
    {
        a = iterator;
    }
}
