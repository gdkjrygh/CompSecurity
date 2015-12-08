// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import android.widget.TextView;
import com.pinterest.ui.imageview.GrayWebImageView;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            IconTwoLineView

public class 
{

    public static void inject(butterknife.LineView lineview, IconTwoLineView icontwolineview, Object obj)
    {
        icontwolineview._title = (TextView)lineview._title(obj, 0x7f0f0491, "field '_title'");
        icontwolineview._subtitle = (TextView)lineview._subtitle(obj, 0x7f0f0492, "field '_subtitle'");
        icontwolineview._icon = (GrayWebImageView)lineview.w(obj, 0x7f0f004e, "field '_icon'");
    }

    public static void reset(IconTwoLineView icontwolineview)
    {
        icontwolineview._title = null;
        icontwolineview._subtitle = null;
        icontwolineview._icon = null;
    }

    public ()
    {
    }
}
