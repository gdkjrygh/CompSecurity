// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            NVASpeechKit

static class ate
{

    static final int $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[];

    static 
    {
        $SwitchMap$com$millennialmedia$android$NVASpeechKit$State = new int[ate.values().length];
        try
        {
            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[ate.ERROR.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[ate.PROCESSING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[ate.READY.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[ate.RECORDING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$millennialmedia$android$NVASpeechKit$State[ate.VOCALIZING.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
