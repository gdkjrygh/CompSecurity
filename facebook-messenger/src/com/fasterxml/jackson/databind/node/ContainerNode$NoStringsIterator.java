// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class I
    implements Iterator
{

    static final next instance = new <init>();

    public static I instance()
    {
        return instance;
    }

    public boolean hasNext()
    {
        return false;
    }

    public volatile Object next()
    {
        return next();
    }

    public String next()
    {
        throw new NoSuchElementException();
    }

    public void remove()
    {
        throw new IllegalStateException();
    }


    private I()
    {
    }
}
