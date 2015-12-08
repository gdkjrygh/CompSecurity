// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package storm.trident.util;

import java.util.LinkedHashMap;

public class LRUMap extends LinkedHashMap
{

    private int a;

    public LRUMap(int i)
    {
        super(i + 1, 1.0F, true);
        a = i;
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > a;
    }
}
