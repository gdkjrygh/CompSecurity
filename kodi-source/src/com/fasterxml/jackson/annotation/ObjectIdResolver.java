// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


public interface ObjectIdResolver
{

    public abstract void bindItem(ObjectIdGenerator.IdKey idkey, Object obj);

    public abstract boolean canUseFor(ObjectIdResolver objectidresolver);

    public abstract ObjectIdResolver newForDeserialization(Object obj);

    public abstract Object resolveId(ObjectIdGenerator.IdKey idkey);
}
