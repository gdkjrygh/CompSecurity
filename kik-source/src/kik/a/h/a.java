// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.util.LinkedHashMap;

public final class a extends LinkedHashMap
{

    private final int a = 100;

    public a()
    {
    }

    protected final boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return super.size() > a;
    }
}
