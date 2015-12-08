// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Maps;
import com.google.inject.spi.Dependency;
import java.util.Map;

// Referenced classes of package com.google.inject.internal:
//            ConstructionContext

final class InternalContext
{

    private Map constructionContexts;
    private Dependency dependency;

    InternalContext()
    {
        constructionContexts = $Maps.newHashMap();
    }

    public ConstructionContext getConstructionContext(Object obj)
    {
        ConstructionContext constructioncontext1 = (ConstructionContext)constructionContexts.get(obj);
        ConstructionContext constructioncontext = constructioncontext1;
        if (constructioncontext1 == null)
        {
            constructioncontext = new ConstructionContext();
            constructionContexts.put(obj, constructioncontext);
        }
        return constructioncontext;
    }

    public Dependency getDependency()
    {
        return dependency;
    }

    public Dependency setDependency(Dependency dependency1)
    {
        Dependency dependency2 = dependency;
        dependency = dependency1;
        return dependency2;
    }
}
