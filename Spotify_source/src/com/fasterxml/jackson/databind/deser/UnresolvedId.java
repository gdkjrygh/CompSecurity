// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;

public class UnresolvedId
{

    private final Object _id;
    private final JsonLocation _location;
    private final Class _type;

    public UnresolvedId(Object obj, Class class1, JsonLocation jsonlocation)
    {
        _id = obj;
        _type = class1;
        _location = jsonlocation;
    }

    public String toString()
    {
        return String.format("Object id [%s] (for %s) at %s", new Object[] {
            _id, _type, _location
        });
    }
}
