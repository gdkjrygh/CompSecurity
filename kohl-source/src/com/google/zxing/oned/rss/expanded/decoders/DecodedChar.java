// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            DecodedObject

final class DecodedChar extends DecodedObject
{

    static final char FNC1 = 36;
    private final char value;

    DecodedChar(int i, char c)
    {
        super(i);
        value = c;
    }

    char getValue()
    {
        return value;
    }

    boolean isFNC1()
    {
        return value == '$';
    }
}
