// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;


public class ReadableObjectId
{

    public final Object id;
    public Object item;

    public ReadableObjectId(Object obj)
    {
        id = obj;
    }

    public void bindItem(Object obj)
    {
        if (item != null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Already had POJO for id (").append(id.getClass().getName()).append(") [").append(id).append("]").toString());
        } else
        {
            item = obj;
            return;
        }
    }
}
