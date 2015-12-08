// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerators, ObjectIdGenerator

public static final class <init> extends <init>
{

    private static final long serialVersionUID = 1L;

    public final boolean canUseFor(ObjectIdGenerator objectidgenerator)
    {
        return objectidgenerator.getClass() == getClass();
    }

    public final ObjectIdGenerator forScope(Class class1)
    {
        return this;
    }

    public final volatile Object generateId(Object obj)
    {
        return generateId(obj);
    }

    public final UUID generateId(Object obj)
    {
        return UUID.randomUUID();
    }

    public final generateId key(Object obj)
    {
        return new generateId(getClass(), null, obj);
    }

    public final ObjectIdGenerator newForSerialization(Object obj)
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
