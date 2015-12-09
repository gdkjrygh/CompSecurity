// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class <init>
{

    public boolean allowHeadlessAccess;
    public String forceResolveAccountKey;
    int gravityForConnectingPopup;
    ArrayList proxyApis;
    public boolean retryingSignIn;
    int sdkVariant;
    boolean showConnectingPopup;

    public final <init> addProxyApi(String s)
    {
        proxyApis.add(s);
        return this;
    }

    public final proxyApis build()
    {
        return new proxyApis(this, (byte)0);
    }

    public final proxyApis setShowConnectingPopup$371b5ca1()
    {
        showConnectingPopup = false;
        gravityForConnectingPopup = 17;
        return this;
    }

    private ()
    {
        allowHeadlessAccess = false;
        showConnectingPopup = true;
        gravityForConnectingPopup = 17;
        retryingSignIn = false;
        sdkVariant = 4368;
        forceResolveAccountKey = null;
        proxyApis = new ArrayList();
    }

    proxyApis(byte byte0)
    {
        this();
    }
}
