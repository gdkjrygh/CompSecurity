// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.formats;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.ads.formats:
//            NativeAd

public interface NativeContentAd
    extends NativeAd
{

    public static final int ASSET_ADVERTISER = 1004;
    public static final int ASSET_ATTRIBUTION_ICON = 1007;
    public static final int ASSET_ATTRIBUTION_TEXT = 1008;
    public static final int ASSET_BODY = 1002;
    public static final int ASSET_CALL_TO_ACTION = 1003;
    public static final int ASSET_HEADLINE = 1001;
    public static final int ASSET_IMAGE = 1005;
    public static final int ASSET_LOGO = 1006;

    public abstract String getAdvertiser();

    public abstract Drawable getAttributionIcon();

    public abstract String getAttributionText();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract Drawable getImage();

    public abstract Drawable getLogo();

    public abstract boolean hasAttribution();
}
