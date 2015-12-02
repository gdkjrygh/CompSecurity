// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerator

public final class <init> extends <init>
{

    public boolean canUseFor(ObjectIdGenerator objectidgenerator)
    {
        return objectidgenerator.getClass() == getClass();
    }

    public ObjectIdGenerator forScope(Class class1)
    {
        return this;
    }

    public volatile Object generateId(Object obj)
    {
        return generateId(obj);
    }

    public UUID generateId(Object obj)
    {
        return UUID.randomUUID();
    }

    public generateId key(Object obj)
    {
        return new generateId(getClass(), null, obj);
    }

    public ObjectIdGenerator newForSerialization(Object obj)
    {
        return this;
    }

    public ()
    {
        this(java/lang/Object);
    }

    private <init>(Class class1)
    {
        super(java/lang/Object);
    }
}
