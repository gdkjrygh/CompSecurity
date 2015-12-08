// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;


// Referenced classes of package com.soundcloud.android.offline:
//            OfflineState

class 
{

    static final int $SwitchMap$com$soundcloud$android$offline$OfflineState[];

    static 
    {
        $SwitchMap$com$soundcloud$android$offline$OfflineState = new int[OfflineState.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.NO_OFFLINE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.UNAVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.REQUESTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.DOWNLOADING.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$offline$OfflineState[OfflineState.DOWNLOADED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
