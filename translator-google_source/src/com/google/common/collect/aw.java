// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            RegularImmutableMap, ImmutableMap, aq, dt

public class aw
{

    ImmutableMapEntry.TerminalEntry a[];
    int b;

    public aw()
    {
        this((byte)0);
    }

    private aw(byte byte0)
    {
        a = new ImmutableMapEntry.TerminalEntry[4];
        b = 0;
    }

    public ImmutableMap a()
    {
        switch (b)
        {
        default:
            return new RegularImmutableMap(b, a);

        case 0: // '\0'
            return ImmutableMap.of();

        case 1: // '\001'
            return ImmutableMap.of(a[0].getKey(), a[0].getValue());
        }
    }

    public aw a(Object obj, Object obj1)
    {
        int i = b + 1;
        if (i > a.length)
        {
            a = (ImmutableMapEntry.TerminalEntry[])dt.b(a, aq.a(a.length, i));
        }
        obj = ImmutableMap.entryOf(obj, obj1);
        obj1 = a;
        i = b;
        b = i + 1;
        obj1[i] = obj;
        return this;
    }
}
