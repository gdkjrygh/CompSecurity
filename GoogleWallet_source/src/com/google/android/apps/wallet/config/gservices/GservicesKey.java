// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.config.gservices;

import com.google.common.base.Preconditions;

public final class GservicesKey
{

    public static final GservicesKey ANDROID_ID = newLongKey("android_id", Long.valueOf(-1L));
    public static final GservicesKey GSERVICES_FORCE_PROD = newBooleanKey("google_wallet:force-prod-featureset", Boolean.valueOf(false));
    public static final GservicesKey GSERVICES_KEY_CLOUD_CONFIG = newStringKey("google_wallet:cloud_config", "");
    public static final GservicesKey GSERVICES_KEY_CROSSBAR_IMAGE_RESIZE_URL = newStringKey("google_wallet:crossbar_image_resize_url", "");
    public static final GservicesKey GSERVICES_MIN_SUPPORTED_VERSION = newIntKey("google_wallet:min_supported_version", Integer.valueOf(1));
    public static final GservicesKey GSERVICES_MIN_UPGRADE_SOON_VERSION = newIntKey("google_wallet:min_upgrade_soon_version", Integer.valueOf(1));
    private final Object mDefaultValue;
    private final String mKey;

    private GservicesKey(String s, Object obj)
    {
        mKey = s;
        mDefaultValue = Preconditions.checkNotNull(obj);
    }

    private static GservicesKey newBooleanKey(String s, Boolean boolean1)
    {
        return new GservicesKey(s, boolean1);
    }

    private static GservicesKey newIntKey(String s, Integer integer)
    {
        return new GservicesKey(s, integer);
    }

    private static GservicesKey newLongKey(String s, Long long1)
    {
        return new GservicesKey(s, long1);
    }

    private static GservicesKey newStringKey(String s, String s1)
    {
        return new GservicesKey(s, s1);
    }

    public final Object getDefaultValue()
    {
        return mDefaultValue;
    }

    public final String getKey()
    {
        return mKey;
    }

}
