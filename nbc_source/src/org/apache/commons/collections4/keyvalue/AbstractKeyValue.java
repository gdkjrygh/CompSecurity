// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.keyvalue;


public abstract class AbstractKeyValue
{

    private Object key;
    private Object value;

    protected AbstractKeyValue(Object obj, Object obj1)
    {
        key = obj;
        value = obj1;
    }

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    protected Object setValue(Object obj)
    {
        Object obj1 = value;
        value = obj;
        return obj1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getKey()).append('=').append(getValue()).toString();
    }
}
