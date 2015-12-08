// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.ui:
//            PinPickHeroCell

public class 
{

    public static void inject(butterknife.ctor ctor, PinPickHeroCell pinpickherocell, Object obj)
    {
        pinpickherocell._heroImageView = (WebImageView)ctor.eView(obj, 0x7f0f03cb, "field '_heroImageView'");
        pinpickherocell._titleTv = (TextView)ctor.eView(obj, 0x7f0f03cc, "field '_titleTv'");
        pinpickherocell._subTitleTv = (TextView)ctor.Tv(obj, 0x7f0f03cd, "field '_subTitleTv'");
    }

    public static void reset(PinPickHeroCell pinpickherocell)
    {
        pinpickherocell._heroImageView = null;
        pinpickherocell._titleTv = null;
        pinpickherocell._subTitleTv = null;
    }

    public ()
    {
    }
}
