// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;

public class KidsOnPhoneConfigData
    implements KidsOnPhoneConfiguration
{

    public static final KidsOnPhoneConfigData DEFAULT_KIDS_CONFIG = new KidsOnPhoneConfigData();
    private com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ActionBarNavType actionBarNavType;
    private com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType imageType;
    private boolean isEntryInActionBar;
    private boolean isEntryInGenreLolomo;
    private boolean isEntryInMenu;
    private boolean isKidsOnPhoneEnabled;
    private com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ScrollBehavior scrollBehavior;

    public KidsOnPhoneConfigData()
    {
        scrollBehavior = com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ScrollBehavior.LRUD;
        imageType = com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType.HORIZONTAL;
        actionBarNavType = com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ActionBarNavType.UP;
    }

    public com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ActionBarNavType getActionBarNavType()
    {
        return actionBarNavType;
    }

    public com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.LolomoImageType getLolomoImageType()
    {
        return imageType;
    }

    public com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration.ScrollBehavior getScrollBehavior()
    {
        return scrollBehavior;
    }

    public boolean isKidsOnPhoneEnabled()
    {
        return isKidsOnPhoneEnabled;
    }

    public boolean shouldShowKidsEntryInActionBar()
    {
        return isEntryInActionBar;
    }

    public boolean shouldShowKidsEntryInGenreLomo()
    {
        return isEntryInGenreLolomo;
    }

    public boolean shouldShowKidsEntryInMenu()
    {
        return isEntryInMenu;
    }

}
