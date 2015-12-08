// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.decoder;


// Referenced classes of package com.google.zxing.aztec.decoder:
//            Decoder

static class ble
{

    static final int $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[];

    static 
    {
        $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = new int[ble.values().length];
        try
        {
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[ble.UPPER.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[ble.LOWER.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[ble.MIXED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[ble.PUNCT.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[ble.DIGIT.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
