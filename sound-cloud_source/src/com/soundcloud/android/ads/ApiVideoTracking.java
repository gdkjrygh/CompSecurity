// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            VideoAdProperty

public class ApiVideoTracking
    implements PropertySetSource
{

    public final List exitFullScreenUrls;
    public final List finishUrls;
    public final List firstQuartileUrls;
    public final List fullScreenUrls;
    public final List impressionUrls;
    public final List pauseUrls;
    public final List resumeUrls;
    public final List secondQuartileUrls;
    public final List skipUrls;
    public final List startUrls;
    public final List thirdQuartileUrls;

    public ApiVideoTracking(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
            List list7, List list8, List list9, List list10)
    {
        impressionUrls = list;
        skipUrls = list1;
        startUrls = list2;
        firstQuartileUrls = list3;
        secondQuartileUrls = list4;
        thirdQuartileUrls = list5;
        finishUrls = list6;
        pauseUrls = list7;
        resumeUrls = list8;
        fullScreenUrls = list9;
        exitFullScreenUrls = list10;
    }

    public PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            VideoAdProperty.AD_IMPRESSION_URLS.bind(impressionUrls), VideoAdProperty.AD_SKIP_URLS.bind(skipUrls), VideoAdProperty.AD_START_URLS.bind(startUrls), VideoAdProperty.AD_FIRST_QUARTILE_URLS.bind(firstQuartileUrls), VideoAdProperty.AD_SECOND_QUARTILE_URLS.bind(secondQuartileUrls), VideoAdProperty.AD_THIRD_QUARTILE_URLS.bind(thirdQuartileUrls), VideoAdProperty.AD_FINISH_URLS.bind(finishUrls), VideoAdProperty.AD_PAUSE_URLS.bind(pauseUrls), VideoAdProperty.AD_RESUME_URLS.bind(resumeUrls), VideoAdProperty.AD_FULLSCREEN_URLS.bind(fullScreenUrls), 
            VideoAdProperty.AD_EXIT_FULLSCREEN_URLS.bind(exitFullScreenUrls)
        });
    }
}
