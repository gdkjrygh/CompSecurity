// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;


public final class LinkedNode
{

    final LinkedNode _next;
    final Object _value;

    public final LinkedNode next()
    {
        return _next;
    }

    public final Object value()
    {
        return _value;
    }
}
