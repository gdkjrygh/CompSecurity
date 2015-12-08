// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

public abstract class $UnmodifiableIterator
    implements Iterator
{

    public $UnmodifiableIterator()
    {
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
