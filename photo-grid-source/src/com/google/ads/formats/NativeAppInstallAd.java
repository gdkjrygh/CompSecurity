// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.formats;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.ads.formats:
//            NativeAd

public interface NativeAppInstallAd
    extends NativeAd
{

    public static final int ASSET_ATTRIBUTION_ICON = 2009;
    public static final int ASSET_ATTRIBUTION_TEXT = 2010;
    public static final int ASSET_BODY = 2004;
    public static final int ASSET_CALL_TO_ACTION = 2002;
    public static final int ASSET_HEADLINE = 2001;
    public static final int ASSET_ICON = 2003;
    public static final int ASSET_IMAGE = 2007;
    public static final int ASSET_PRICE = 2006;
    public static final int ASSET_STAR_RATING = 2008;
    public static final int ASSET_STORE = 2005;

    public abstract Drawable getAttributionIcon();

    public abstract String getAttributionText();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract Drawable getIcon();

    public abstract Drawable getImage();

    public abstract String getPrice();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract boolean hasAttribution();
}
