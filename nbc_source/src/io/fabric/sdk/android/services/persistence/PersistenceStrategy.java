// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.persistence;


public interface PersistenceStrategy
{

    public abstract void clear();

    public abstract Object restore();

    public abstract void save(Object obj);
}
