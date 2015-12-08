// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            e

static final class 
    implements Iterator
{

    public final boolean hasNext()
    {
        return false;
    }

    public final Object next()
    {
        throw new NoSuchElementException();
    }

    public final void remove()
    {
        j.b(false, "no calls to next() since the last call to remove()");
    }

    ()
    {
    }
}
