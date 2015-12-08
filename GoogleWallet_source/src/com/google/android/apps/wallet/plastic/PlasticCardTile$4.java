// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;


// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardTile

static final class atus
{

    static final int $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status = new int[com.google.android.apps.wallet.plastic.api..values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api..NOT_REQUESTED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api..CANCELED.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api..REQUESTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api..SUSPENDED.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api..LOCKED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
