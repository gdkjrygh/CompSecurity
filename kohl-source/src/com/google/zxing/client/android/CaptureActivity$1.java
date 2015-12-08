// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;


// Referenced classes of package com.google.zxing.client.android:
//            CaptureActivity, IntentSource

static class 
{

    static final int $SwitchMap$com$google$zxing$client$android$IntentSource[];

    static 
    {
        $SwitchMap$com$google$zxing$client$android$IntentSource = new int[IntentSource.values().length];
        try
        {
            $SwitchMap$com$google$zxing$client$android$IntentSource[IntentSource.NATIVE_APP_INTENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$zxing$client$android$IntentSource[IntentSource.PRODUCT_SEARCH_LINK.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$zxing$client$android$IntentSource[IntentSource.ZXING_LINK.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$zxing$client$android$IntentSource[IntentSource.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
