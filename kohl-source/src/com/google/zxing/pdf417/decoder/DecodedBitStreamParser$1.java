// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder;


// Referenced classes of package com.google.zxing.pdf417.decoder:
//            DecodedBitStreamParser

static class de
{

    static final int $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[];

    static 
    {
        $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = new int[de.values().length];
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.ALPHA.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.LOWER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.MIXED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.PUNCT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.ALPHA_SHIFT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[de.PUNCT_SHIFT.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
