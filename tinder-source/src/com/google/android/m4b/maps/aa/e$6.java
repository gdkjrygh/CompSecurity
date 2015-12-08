// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.k;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            b, e

static final class nit> extends b
{

    private Iterator b;
    private k c;

    protected final Object a()
    {
        while (b.hasNext()) 
        {
            Object obj = b.next();
            if (c.a(obj))
            {
                return obj;
            }
        }
        super.a = c;
        return null;
    }

    (Iterator iterator, k k1)
    {
        b = iterator;
        c = k1;
        super();
    }
}
