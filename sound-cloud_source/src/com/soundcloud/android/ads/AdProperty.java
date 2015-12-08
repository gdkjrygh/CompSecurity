// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.net.Uri;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;

public class AdProperty
{

    public static final Property AD_CLICKTHROUGH_URLS = Property.ofList(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property AD_COMPANION_DISPLAY_IMPRESSION_URLS = Property.ofList(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property AD_FINISH_URLS = Property.ofList(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property AD_IMPRESSION_URLS = Property.ofList(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property AD_SKIP_URLS = Property.ofList(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property AD_TYPE = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final String AD_TYPE_AUDIO = "audio_ad";
    public static final String AD_TYPE_VIDEO = "video_ad";
    public static final Property AD_URN = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property ARTWORK = Property.of(com/soundcloud/android/ads/AdProperty, android/net/Uri);
    public static final Property CLICK_THROUGH_LINK = Property.of(com/soundcloud/android/ads/AdProperty, android/net/Uri);
    public static final Property COMPANION_URN = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property DEFAULT_BACKGROUND_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property DEFAULT_TEXT_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property FOCUSED_BACKGROUND_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property FOCUSED_TEXT_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property MONETIZABLE_TRACK_CREATOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property MONETIZABLE_TRACK_TITLE = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property MONETIZABLE_TRACK_URN = Property.of(com/soundcloud/android/ads/AdProperty, com/soundcloud/android/model/Urn);
    public static final Property PRESSED_BACKGROUND_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);
    public static final Property PRESSED_TEXT_COLOR = Property.of(com/soundcloud/android/ads/AdProperty, java/lang/String);

    public AdProperty()
    {
    }

}
