// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView

static final class .State
{

    static final int $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[];

    static 
    {
        $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State = new int[.State.values().length];
        try
        {
            $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[.State.NotAuthenticated.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[.State.InProgress.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$google$android$apps$wallet$webview$ServiceAuthState$State[.State.Authenticated.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
