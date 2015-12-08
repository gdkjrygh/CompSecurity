// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bu;

import java.util.LinkedHashMap;

// Referenced classes of package p.bu:
//            e

private class b extends LinkedHashMap
{

    final e a;
    private int b;

    protected boolean removeEldestEntry(java.util.Entry entry)
    {
        return size() > b;
    }

    public y(e e1, int i)
    {
        a = e1;
        super(i + 1, 1.0F, false);
        b = i;
    }
}
