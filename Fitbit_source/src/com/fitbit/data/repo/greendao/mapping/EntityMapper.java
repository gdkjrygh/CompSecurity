// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;


public interface EntityMapper
{

    public abstract Object fromDbEntity(Object obj);

    public abstract Object toDbEntity(Object obj);

    public abstract Object toDbEntity(Object obj, Object obj1);
}
