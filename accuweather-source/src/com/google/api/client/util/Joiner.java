// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


public final class Joiner
{

    private final com.google.api.client.repackaged.com.google.common.base.Joiner wrapped;

    private Joiner(com.google.api.client.repackaged.com.google.common.base.Joiner joiner)
    {
        wrapped = joiner;
    }

    public static Joiner on(char c)
    {
        return new Joiner(com.google.api.client.repackaged.com.google.common.base.Joiner.on(c));
    }

    public final String join(Iterable iterable)
    {
        return wrapped.join(iterable);
    }
}
