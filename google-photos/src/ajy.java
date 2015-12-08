// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;

final class ajy extends LinkedHashMap
{

    private int a;

    public ajy(int i)
    {
        super(65, 1.0F, true);
        a = 64;
    }

    protected final boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return super.size() > a;
    }
}
