// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;


public abstract class PropertyValue
{

    public final PropertyValue next;
    public final Object value;

    protected PropertyValue(PropertyValue propertyvalue, Object obj)
    {
        next = propertyvalue;
        value = obj;
    }

    public abstract void assign(Object obj);
}
