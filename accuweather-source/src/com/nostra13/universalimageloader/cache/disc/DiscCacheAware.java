// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.cache.disc;

import java.io.File;

public interface DiscCacheAware
{

    public abstract void clear();

    public abstract File get(String s);

    public abstract void put(String s, File file);
}
