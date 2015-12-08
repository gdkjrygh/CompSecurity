// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Scope;

// Referenced classes of package com.google.inject.spi:
//            BindingScopingVisitor

public class DefaultBindingScopingVisitor
    implements BindingScopingVisitor
{

    public DefaultBindingScopingVisitor()
    {
    }

    public Object visitEagerSingleton()
    {
        return visitOther();
    }

    public Object visitNoScoping()
    {
        return visitOther();
    }

    protected Object visitOther()
    {
        return null;
    }

    public Object visitScope(Scope scope)
    {
        return visitOther();
    }

    public Object visitScopeAnnotation(Class class1)
    {
        return visitOther();
    }
}
