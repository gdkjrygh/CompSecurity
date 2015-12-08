// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.cache;

import java.util.Set;

public interface BrowseCache
{

    public abstract void flush();

    public abstract Object get(String s);

    public abstract Set getKeySet();

    public abstract Object put(String s, Object obj);

    public abstract Object remove(String s);
}
