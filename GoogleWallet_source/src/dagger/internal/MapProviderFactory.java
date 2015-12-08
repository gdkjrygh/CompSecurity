// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.Factory;
import java.util.Map;

public final class MapProviderFactory
    implements Factory
{
    public static final class Builder
    {
    }


    private final Map contributingMap;

    private Map get()
    {
        return contributingMap;
    }

    public final volatile Object get()
    {
        return get();
    }
}
