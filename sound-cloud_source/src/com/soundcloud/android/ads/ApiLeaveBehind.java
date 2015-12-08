// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import android.net.Uri;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiBaseAdVisual, LeaveBehindProperty

class ApiLeaveBehind extends ApiBaseAdVisual
    implements PropertySetSource
{

    public ApiLeaveBehind(String s, String s1, String s2, List list, List list1)
    {
        super(s, s1, s2, list, list1);
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            LeaveBehindProperty.LEAVE_BEHIND_URN.bind(urn), LeaveBehindProperty.IMAGE_URL.bind(imageUrl), LeaveBehindProperty.CLICK_THROUGH_URL.bind(Uri.parse(clickthroughUrl)), LeaveBehindProperty.TRACKING_IMPRESSION_URLS.bind(trackingImpressionUrls), LeaveBehindProperty.TRACKING_CLICK_URLS.bind(trackingClickUrls)
        });
    }
}
