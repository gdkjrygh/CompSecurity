// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;


final class IntentSource extends Enum
{

    private static final IntentSource ENUM$VALUES[];
    public static final IntentSource NATIVE_APP_INTENT;
    public static final IntentSource NONE;
    public static final IntentSource PRODUCT_SEARCH_LINK;
    public static final IntentSource ZXING_LINK;

    private IntentSource(String s, int i)
    {
        super(s, i);
    }

    public static IntentSource valueOf(String s)
    {
        return (IntentSource)Enum.valueOf(com/google/zxing/client/android/IntentSource, s);
    }

    public static IntentSource[] values()
    {
        IntentSource aintentsource[] = ENUM$VALUES;
        int i = aintentsource.length;
        IntentSource aintentsource1[] = new IntentSource[i];
        System.arraycopy(aintentsource, 0, aintentsource1, 0, i);
        return aintentsource1;
    }

    static 
    {
        NATIVE_APP_INTENT = new IntentSource("NATIVE_APP_INTENT", 0);
        PRODUCT_SEARCH_LINK = new IntentSource("PRODUCT_SEARCH_LINK", 1);
        ZXING_LINK = new IntentSource("ZXING_LINK", 2);
        NONE = new IntentSource("NONE", 3);
        ENUM$VALUES = (new IntentSource[] {
            NATIVE_APP_INTENT, PRODUCT_SEARCH_LINK, ZXING_LINK, NONE
        });
    }
}
