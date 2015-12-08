// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            AuthState, ServiceAuthInfo

public static interface 
{

    public abstract boolean isPreloading();

    public abstract boolean onAuthCompleted(ServiceAuthInfo serviceauthinfo, boolean flag, boolean flag1);
}
