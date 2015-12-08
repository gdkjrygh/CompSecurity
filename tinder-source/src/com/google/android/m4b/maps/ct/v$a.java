// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            v

static final class _cls2
{

    private static final Iterator a = new Iterator() {

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
            throw new UnsupportedOperationException();
        }

    };
    private static final Iterable b = new Iterable() {

        public final Iterator iterator()
        {
            return v.a.b();
        }

    };

    static Iterable a()
    {
        return b;
    }

    static Iterator b()
    {
        return a;
    }

}
