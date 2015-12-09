// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycActivity

static final class .NavState
{

    static final int $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState = new int[.NavState.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.ENTER_PERSONAL_INFO.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.ENTER_PERSONAL_INFO_RETRY.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.ENTER_ADDRESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.OOW_INTRO.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.ENTER_OOW.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.PASSED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.REFERRED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$kyc$KycNavListener$NavState[.NavState.FAILED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
