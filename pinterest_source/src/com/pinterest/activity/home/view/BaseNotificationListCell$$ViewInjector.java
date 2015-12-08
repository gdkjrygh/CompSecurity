// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;


// Referenced classes of package com.pinterest.activity.home.view:
//            BaseNotificationListCell

public class 
{

    public static void inject(butterknife.stCell stcell, BaseNotificationListCell basenotificationlistcell, Object obj)
    {
        basenotificationlistcell._unseenMark = stcell._unseenMark(obj, 0x7f0f0343);
        basenotificationlistcell._divider = stcell._divider(obj, 0x7f0f0348);
    }

    public static void reset(BaseNotificationListCell basenotificationlistcell)
    {
        basenotificationlistcell._unseenMark = null;
        basenotificationlistcell._divider = null;
    }

    public ()
    {
    }
}
