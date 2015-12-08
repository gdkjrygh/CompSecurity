// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


public interface Cache
{

    public abstract void clear();

    public abstract Entry get(String s);

    public abstract void initialize();

    public abstract void invalidate(String s, boolean flag);

    public abstract void put(String s, Entry entry);

    public abstract void remove(String s);
}
