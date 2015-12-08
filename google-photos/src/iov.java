// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;

final class iov extends LinkedHashMap
{

    iov(iou iou, int i, float f, boolean flag)
    {
        super(4, 0.75F, true);
    }

    protected final boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > 4;
    }
}
