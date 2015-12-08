// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.sym;


public abstract class Name
{

    protected final int _hashCode;
    protected final String _name;

    protected Name(String s, int i)
    {
        _name = s;
        _hashCode = i;
    }

    public abstract boolean equals(int i);

    public abstract boolean equals(int i, int j);

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public abstract boolean equals(int ai[], int i);

    public String getName()
    {
        return _name;
    }

    public final int hashCode()
    {
        return _hashCode;
    }

    public String toString()
    {
        return _name;
    }
}
