// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.net.Uri;
import com.soundcloud.java.collections.Property;

public class AdOverlayProperty
{

    public static final Property CLICK_THROUGH_URL = Property.of(com/soundcloud/android/ads/AdOverlayProperty, android/net/Uri);
    public static final Property IMAGE_URL = Property.of(com/soundcloud/android/ads/AdOverlayProperty, java/lang/String);
    public static final Property META_AD_CLICKED = Property.of(com/soundcloud/android/ads/AdOverlayProperty, java/lang/Boolean);
    public static final Property META_AD_COMPLETED = Property.of(com/soundcloud/android/ads/AdOverlayProperty, java/lang/Boolean);
    public static final Property META_AD_DISMISSED = Property.of(com/soundcloud/android/ads/AdOverlayProperty, java/lang/Boolean);
    public static final Property TRACKING_CLICK_URLS = Property.ofList(com/soundcloud/android/ads/AdOverlayProperty, java/lang/String);
    public static final Property TRACKING_IMPRESSION_URLS = Property.ofList(com/soundcloud/android/ads/AdOverlayProperty, java/lang/String);

    public AdOverlayProperty()
    {
    }

}
