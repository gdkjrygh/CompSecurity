// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ContainerNode

protected static class 
    implements Iterator
{

    static final next instance = new <init>();

    public static  instance()
    {
        return instance;
    }

    public boolean hasNext()
    {
        return false;
    }

    public JsonNode next()
    {
        throw new NoSuchElementException();
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new IllegalStateException();
    }


    private ()
    {
    }
}
