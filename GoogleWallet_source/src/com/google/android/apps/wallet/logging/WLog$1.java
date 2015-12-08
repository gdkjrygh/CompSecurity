// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.logging;


// Referenced classes of package com.google.android.apps.wallet.logging:
//            WLog

static final class gPriority
{

    static final int $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority = new int[gPriority.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[gPriority.DEBUG.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[gPriority.ERROR.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[gPriority.INFO.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[gPriority.VERBOSE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$logging$WLog$LogPriority[gPriority.WARN.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
