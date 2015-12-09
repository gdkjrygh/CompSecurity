// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.jcp.views.CarouselPageIndicator;

// Referenced classes of package com.jcp.activities:
//            VisualSearchTutorialActivity, cd

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, VisualSearchTutorialActivity visualsearchtutorialactivity, Object obj)
    {
        visualsearchtutorialactivity.pager = (ViewPager)jector.jector((View)jector.jector(obj, 0x7f0e01b7, "field 'pager'"), 0x7f0e01b7, "field 'pager'");
        visualsearchtutorialactivity.pageIndicator = (CarouselPageIndicator)jector.icator((View)jector.icator(obj, 0x7f0e01b8, "field 'pageIndicator'"), 0x7f0e01b8, "field 'pageIndicator'");
        ((View)jector.icator(obj, 0x7f0e01b9, "method 'onGotItClick'")).setOnClickListener(new cd(this, visualsearchtutorialactivity));
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (VisualSearchTutorialActivity)obj, obj1);
    }

    public void reset(VisualSearchTutorialActivity visualsearchtutorialactivity)
    {
        visualsearchtutorialactivity.pager = null;
        visualsearchtutorialactivity.pageIndicator = null;
    }

    public volatile void reset(Object obj)
    {
        reset((VisualSearchTutorialActivity)obj);
    }

    public ()
    {
    }
}
