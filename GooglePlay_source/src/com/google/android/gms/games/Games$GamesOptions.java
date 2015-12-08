// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            Games

public static final class Builder
    implements com.google.android.gms.common.api.onal
{
    public static final class Builder
    {

        public boolean allowHeadlessAccess;
        public String forceResolveAccountKey;
        int gravityForConnectingPopup;
        ArrayList proxyApis;
        public boolean retryingSignIn;
        int sdkVariant;
        boolean showConnectingPopup;

        public final Builder addProxyApi(String s)
        {
            proxyApis.add(s);
            return this;
        }

        public final Games.GamesOptions build()
        {
            return new Games.GamesOptions(this, (byte)0);
        }

        public final Builder setShowConnectingPopup$371b5ca1()
        {
            showConnectingPopup = false;
            gravityForConnectingPopup = 17;
            return this;
        }

        private Builder()
        {
            allowHeadlessAccess = false;
            showConnectingPopup = true;
            gravityForConnectingPopup = 17;
            retryingSignIn = false;
            sdkVariant = 4368;
            forceResolveAccountKey = null;
            proxyApis = new ArrayList();
        }

        Builder(byte byte0)
        {
            this();
        }
    }


    public final boolean allowHeadlessAccess;
    public final String forceResolveAccountKey;
    public final int gravityForConnectingPopup;
    public final ArrayList proxyApis;
    public final boolean retryingSignIn;
    public final int sdkVariant;
    public final boolean showConnectingPopup;

    public static Builder builder()
    {
        return new Builder((byte)0);
    }

    public final Bundle getAsBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", allowHeadlessAccess);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", showConnectingPopup);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", gravityForConnectingPopup);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", retryingSignIn);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", sdkVariant);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", forceResolveAccountKey);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", proxyApis);
        return bundle;
    }

    private Builder()
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

    private Builder(Builder builder1)
    {
        allowHeadlessAccess = builder1.allowHeadlessAccess;
        showConnectingPopup = builder1.showConnectingPopup;
        gravityForConnectingPopup = builder1.gravityForConnectingPopup;
        retryingSignIn = builder1.retryingSignIn;
        sdkVariant = builder1.sdkVariant;
        forceResolveAccountKey = builder1.forceResolveAccountKey;
        proxyApis = builder1.proxyApis;
    }

    Builder(Builder builder1, byte byte0)
    {
        this(builder1);
    }
}
