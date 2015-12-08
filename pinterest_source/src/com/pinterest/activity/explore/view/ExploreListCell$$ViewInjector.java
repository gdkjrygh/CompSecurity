// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore.view;

import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.explore.view:
//            ExploreListCell

public class 
{

    public static void inject(butterknife.eListCell elistcell, ExploreListCell explorelistcell, Object obj)
    {
        explorelistcell._wrapper = elistcell._wrapper(obj, 0x7f0f0324, "field '_wrapper'");
        explorelistcell._icon = (WebImageView)elistcell._icon(obj, 0x7f0f0325, "field '_icon'");
        explorelistcell._title = (TextView)elistcell._title(obj, 0x7f0f0077, "field '_title'");
        explorelistcell._titleOnlyTv = (TextView)elistcell._titleOnlyTv(obj, 0x7f0f0323, "field '_titleOnlyTv'");
    }

    public static void reset(ExploreListCell explorelistcell)
    {
        explorelistcell._wrapper = null;
        explorelistcell._icon = null;
        explorelistcell._title = null;
        explorelistcell._titleOnlyTv = null;
    }

    public ()
    {
    }
}
