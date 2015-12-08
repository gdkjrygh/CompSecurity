// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json;

import java.lang.reflect.Field;
import java.util.Collection;

public class CustomizeJsonParser
{

    public CustomizeJsonParser()
    {
    }

    public void handleUnrecognizedKey(Object obj, String s)
    {
    }

    public Collection newInstanceForArray(Object obj, Field field)
    {
        return null;
    }

    public Object newInstanceForObject(Object obj, Class class1)
    {
        return null;
    }

    public boolean stopAt(Object obj, String s)
    {
        return false;
    }
}
