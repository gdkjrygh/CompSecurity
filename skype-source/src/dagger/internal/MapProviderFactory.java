// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package dagger.internal:
//            Factory, a

public final class MapProviderFactory
    implements Factory
{
    public static final class a
    {

        private final LinkedHashMap a;

        private a(int i)
        {
            a = dagger.internal.a.b(i);
        }

        a(int i, byte byte0)
        {
            this(i);
        }
    }


    private final Map contributingMap;

    private MapProviderFactory(LinkedHashMap linkedhashmap)
    {
        contributingMap = Collections.unmodifiableMap(linkedhashmap);
    }


    public static a builder(int i)
    {
        return new a(i, (byte)0);
    }

    public final volatile Object get()
    {
        return get();
    }

    public final Map get()
    {
        return contributingMap;
    }
}
