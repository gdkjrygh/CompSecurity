// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


abstract class AmpCallable
{

    public static final int ON_AMP_DESTROY = 1;
    public static final int ON_AMP_JS_CLOSE_WINDOW = 4;
    public static final int ON_AMP_JS_GET_ATTRIBUTES = 7;
    public static final int ON_AMP_JS_GET_CUSTOM_DIMENSIONS = 6;
    public static final int ON_AMP_JS_GET_IDENTIFIERS = 5;
    public static final int ON_AMP_JS_SET_CUSTOM_DIMENSIONS = 8;
    public static final int ON_AMP_JS_TAG_EVENT = 3;
    public static final int ON_AMP_NAVIGATE = 15;
    public static final int ON_AMP_TAG_ACTION = 2;
    public static final int ON_AMP_TEST_CLOSE_CAMPAIGN_LIST = 10;
    public static final int ON_AMP_TEST_COPY_INSTALL_ID = 14;
    public static final int ON_AMP_TEST_COPY_PUSH_TOKEN = 13;
    public static final int ON_AMP_TEST_POPUP_CAMPAIGN_LIST = 9;
    public static final int ON_AMP_TEST_REFRESH_CAMPAIGN_LIST = 12;
    public static final int ON_AMP_TEST_SHOW_CAMPAIGN = 11;

    AmpCallable()
    {
    }

    abstract Object call(Object aobj[]);
}
