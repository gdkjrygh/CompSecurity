// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Factory, Collections

public final class MapProviderFactory
    implements Factory
{
    public static final class Builder
    {

        private final LinkedHashMap mapBuilder;

        public MapProviderFactory build()
        {
            return new MapProviderFactory(mapBuilder);
        }

        public Builder put(Object obj, Provider provider)
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

        private Builder(int i)
        {
            mapBuilder = Collections.newLinkedHashMapWithExpectedSize(i);
        }

    }


    private final Map contributingMap;

    private MapProviderFactory(LinkedHashMap linkedhashmap)
    {
        contributingMap = Collections.unmodifiableMap(linkedhashmap);
    }


    public static Builder builder(int i)
    {
        return new Builder(i);
    }

    public volatile Object get()
    {
        return get();
    }

    public Map get()
    {
        return contributingMap;
    }
}
