// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            GAServiceProxy

static class nnectState
{

    static final int $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[];

    static 
    {
        $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState = new int[nnectState.values().length];
        try
        {
            $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[nnectState.CONNECTED_LOCAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[nnectState.CONNECTED_SERVICE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$analytics$tracking$android$GAServiceProxy$ConnectState[nnectState.DISCONNECTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
