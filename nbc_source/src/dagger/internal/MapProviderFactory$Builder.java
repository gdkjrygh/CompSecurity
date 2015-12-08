// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.LinkedHashMap;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            MapProviderFactory, Collections

public static final class <init>
{

    private final LinkedHashMap mapBuilder;

    public MapProviderFactory build()
    {
        return new MapProviderFactory(mapBuilder, null);
    }

    public mapBuilder put(Object obj, Provider provider)
    {
        if (obj == null)
        {
            throw new NullPointerException("The key is null");
        }
        if (provider == null)
        {
            throw new NullPointerException("The provider of the value is null");
        } else
        {
            mapBuilder.put(obj, provider);
            return this;
        }
    }

    private (int i)
    {
        mapBuilder = Collections.newLinkedHashMapWithExpectedSize(i);
    }

    pWithExpectedSize(int i, pWithExpectedSize pwithexpectedsize)
    {
        this(i);
    }
}
