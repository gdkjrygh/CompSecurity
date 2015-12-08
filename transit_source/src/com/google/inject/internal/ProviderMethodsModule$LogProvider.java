// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import java.lang.reflect.Method;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal:
//            ProviderMethodsModule

private static final class name
    implements Provider
{

    private final String name;

    public volatile Object get()
    {
        return get();
    }

    public Logger get()
    {
        return Logger.getLogger(name);
    }

    public (Method method)
    {
        name = (new StringBuilder()).append(method.getDeclaringClass().getName()).append(".").append(method.getName()).toString();
    }
}
