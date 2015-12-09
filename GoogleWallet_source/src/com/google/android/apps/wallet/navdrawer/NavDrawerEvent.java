// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;


public class NavDrawerEvent
{

    private final com.google.wallet.proto.api.NanoWalletNavigation.TopNavigation topNavigation;

    public NavDrawerEvent(com.google.wallet.proto.api.NanoWalletNavigation.TopNavigation topnavigation)
    {
        topNavigation = topnavigation;
    }

    public final com.google.wallet.proto.api.NanoWalletNavigation.TopNavigation getTopNavigation()
    {
        return topNavigation;
    }
}
