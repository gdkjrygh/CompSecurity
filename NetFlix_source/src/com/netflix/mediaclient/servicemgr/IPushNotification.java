// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.Intent;

public interface IPushNotification
{

    public static final String CATEGORY_NFPUSH = "com.netflix.mediaclient.intent.category.PUSH";
    public static final String EXTRA_CP_UID = "cp_uid";
    public static final String EXTRA_DEVICECATEGORY = "device_cat";
    public static final String EXTRA_ESN = "esn";
    public static final String EXTRA_MSG = "msg";
    public static final String EXTRA_NETFLIXID = "nid";
    public static final String EXTRA_REGISTRATIONID = "reg_id";
    public static final String EXTRA_SECURENETFLIXID = "sid";
    public static final String EXTRA_UID = "uid";
    public static final String GCM_ON_MESSAGE = "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONMESSAGE";
    public static final String GCM_ON_REGISTERED = "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONREGISTERED";
    public static final String GCM_ON_UNREGISTERED = "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_GCM_ONUNREGISTERED";
    public static final String NOTIFICATION_BROWSER_REDIRECT = "com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT";
    public static final String NOTIFICATION_CANCELED = "com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED";
    public static final String ONLOGIN = "com.netflix.mediaclient.intent.action.PUSH_ONLOGIN";
    public static final String ONLOGOUT = "com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT";
    public static final String PUSH_OPTIN = "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN";
    public static final String PUSH_OPTOUT = "com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT";

    public abstract boolean isRegistered();

    public abstract boolean isSupported();

    public abstract void onMessage(Intent intent);

    public abstract void setRegistrationIdFromRegistrationServer(String s);

    public abstract void unregistrationFromFromRegistrationServer(String s);

    public abstract boolean wasNotificationOptInDisplayed();
}
