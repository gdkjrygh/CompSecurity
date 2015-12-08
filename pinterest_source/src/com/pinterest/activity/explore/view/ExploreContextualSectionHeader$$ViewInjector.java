// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreContextualSectionHeader

public class 
{

    public static void inject(butterknife.ionHeader ionheader, ExploreContextualSectionHeader explorecontextualsectionheader, Object obj)
    {
        explorecontextualsectionheader._titleEt = (TextView)ionheader._titleEt(obj, 0x7f0f0077, "field '_titleEt'");
        explorecontextualsectionheader._subtitleEt = (TextView)ionheader._subtitleEt(obj, 0x7f0f01d1, "field '_subtitleEt'");
    }

    public static void reset(ExploreContextualSectionHeader explorecontextualsectionheader)
    {
        explorecontextualsectionheader._titleEt = null;
        explorecontextualsectionheader._subtitleEt = null;
    }

    public ()
    {
    }
}
