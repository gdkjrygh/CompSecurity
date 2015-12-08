// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;


class eMapIterator extends eMapIterator
{

    final b a;

    public Object next()
    {
        return b().b;
    }

    eMapIterator(eMapIterator emapiterator)
    {
        a = emapiterator;
        super(emapiterator.eMapIterator, null);
    }
}
