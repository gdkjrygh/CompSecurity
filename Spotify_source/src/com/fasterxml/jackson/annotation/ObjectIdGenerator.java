// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.io.Serializable;

public abstract class ObjectIdGenerator
    implements Serializable
{

    public ObjectIdGenerator()
    {
    }

    public abstract boolean canUseFor(ObjectIdGenerator objectidgenerator);

    public abstract ObjectIdGenerator forScope(Class class1);

    public abstract Object generateId(Object obj);

    public abstract Class getScope();

    public abstract IdKey key(Object obj);

    public abstract ObjectIdGenerator newForSerialization(Object obj);
}
