// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.persistence;


public interface ISimpleStorage
{

    public abstract void clearAll();

    public abstract Object getOrDefault(String s, Class class1, Object obj);

    public abstract void put(String s, Object obj);
}
