// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;


public interface Matcher
{

    public abstract Matcher and(Matcher matcher);

    public abstract boolean matches(Object obj);

    public abstract Matcher or(Matcher matcher);
}
