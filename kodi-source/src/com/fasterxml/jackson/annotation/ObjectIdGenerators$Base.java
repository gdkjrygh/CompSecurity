// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerator, ObjectIdGenerators

private static abstract class _scope extends ObjectIdGenerator
{

    protected final Class _scope;

    public boolean canUseFor(ObjectIdGenerator objectidgenerator)
    {
        return objectidgenerator.getClass() == getClass() && objectidgenerator.getScope() == _scope;
    }

    public final Class getScope()
    {
        return _scope;
    }

    protected (Class class1)
    {
        _scope = class1;
    }
}
