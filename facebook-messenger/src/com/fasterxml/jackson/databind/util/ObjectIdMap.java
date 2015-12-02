// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.util.IdentityHashMap;

public class ObjectIdMap extends IdentityHashMap
{

    public ObjectIdMap()
    {
        super(16);
    }

    public Object findId(Object obj)
    {
        return get(obj);
    }

    public void insertId(Object obj, Object obj1)
    {
        put(obj, obj1);
    }
}
