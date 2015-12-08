// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            DecodedBitStreamParser

static class de
{

    static final int $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[];

    static 
    {
        $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = new int[de.values().length];
        try
        {
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[de.C40_ENCODE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[de.TEXT_ENCODE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[de.ANSIX12_ENCODE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[de.EDIFACT_ENCODE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[de.BASE256_ENCODE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
