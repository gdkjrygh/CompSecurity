// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.sharedpref;


public interface DominosPrefs
{

    public abstract String CHECKOUT_EMAIL();

    public abstract String CHECKOUT_FIRST_NAME();

    public abstract String CHECKOUT_LAST_NAME();

    public abstract String CHECKOUT_PHONE();

    public abstract String CHECKOUT_PHONE_EXT();

    public abstract String OAUTH_JWT();

    public abstract boolean UTILIZE_USER_INFO_FROM_CHECKOUT();

    public abstract String deliveryAddress();

    public abstract boolean extraAnonymousCardUsed();

    public abstract boolean firstTimePebbleDetected();

    public abstract String googleWalletState();

    public abstract long oAuthLastAccessTime();

    public abstract boolean orderPlacedRemove();

    public abstract String ratedAppVersion();

    public abstract String rememberMeCookieValue();

    public abstract boolean saveCurrentUser();

    public abstract String shopRunnerMemberToken();

    public abstract boolean triggredWearIntro();
}
