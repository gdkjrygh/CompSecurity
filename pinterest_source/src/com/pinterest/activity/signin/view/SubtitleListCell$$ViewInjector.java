// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.view;

import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.signin.view:
//            SubtitleListCell

public class 
{

    public static void inject(butterknife.ListCell listcell, SubtitleListCell subtitlelistcell, Object obj)
    {
        subtitlelistcell._title = (TextView)listcell._title(obj, 0x7f0f0077, "field '_title'");
        subtitlelistcell._subTitle = (TextView)listcell._subTitle(obj, 0x7f0f01d1, "field '_subTitle'");
    }

    public static void reset(SubtitleListCell subtitlelistcell)
    {
        subtitlelistcell._title = null;
        subtitlelistcell._subTitle = null;
    }

    public ()
    {
    }
}
