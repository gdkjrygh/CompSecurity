// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;


public abstract class JsonStreamContext
{

    protected int _index;
    protected int _type;

    protected JsonStreamContext()
    {
    }

    public final int getCurrentIndex()
    {
        if (_index < 0)
        {
            return 0;
        } else
        {
            return _index;
        }
    }

    public final String getTypeDesc()
    {
        switch (_type)
        {
        default:
            return "?";

        case 0: // '\0'
            return "ROOT";

        case 1: // '\001'
            return "ARRAY";

        case 2: // '\002'
            return "OBJECT";
        }
    }

    public final boolean inArray()
    {
        return _type == 1;
    }

    public final boolean inObject()
    {
        return _type == 2;
    }

    public final boolean inRoot()
    {
        return _type == 0;
    }

    public void setCurrentValue(Object obj)
    {
    }
}
