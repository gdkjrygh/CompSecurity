// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.pinterest.ui.notify:
//            DialogTitleView

public class 
{

    public static void inject(butterknife.iewInjector iewinjector, DialogTitleView dialogtitleview, Object obj)
    {
        dialogtitleview.titleTv = (TextView)iewinjector.tleTv(obj, 0x7f0f0077, "field 'titleTv'");
        dialogtitleview.subTitleTv = (TextView)iewinjector.bTitleTv(obj, 0x7f0f01d1, "field 'subTitleTv'");
        dialogtitleview.textTv = (TextView)iewinjector.xtTv(obj, 0x7f0f0469, "field 'textTv'");
        dialogtitleview.titleDivider = iewinjector.tleDivider(obj, 0x7f0f03e5, "field 'titleDivider'");
        dialogtitleview.dismissBt = (Button)iewinjector.smissBt(obj, 0x7f0f0335, "field 'dismissBt'");
    }

    public static void reset(DialogTitleView dialogtitleview)
    {
        dialogtitleview.titleTv = null;
        dialogtitleview.subTitleTv = null;
        dialogtitleview.textTv = null;
        dialogtitleview.titleDivider = null;
        dialogtitleview.dismissBt = null;
    }

    public ()
    {
    }
}
