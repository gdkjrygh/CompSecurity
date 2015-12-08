// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap, $Function

static final class concurrencyLevel
{

    int concurrencyLevel;
    int initialCapacity;
    float loadFactor;

    public ConcurrentMap buildComputingMap(gStrategy gstrategy, $Function $function)
    {
        if (gstrategy == null)
        {
            throw new NullPointerException("strategy");
        }
        if ($function == null)
        {
            throw new NullPointerException("computer");
        } else
        {
            return new gImpl(gstrategy, this, $function);
        }
    }

    public ConcurrentMap buildMap( )
    {
        if ( == null)
        {
            throw new NullPointerException("strategy");
        } else
        {
            return new it>(, this);
        }
    }

    public  concurrencyLevel(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            concurrencyLevel = i;
            return this;
        }
    }

    public concurrencyLevel initialCapacity(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        } else
        {
            initialCapacity = i;
            return this;
        }
    }

    public initialCapacity loadFactor(float f)
    {
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException();
        } else
        {
            loadFactor = f;
            return this;
        }
    }

    ()
    {
        loadFactor = 0.75F;
        initialCapacity = 16;
        concurrencyLevel = 16;
    }
}
