// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.kit.view:
//            PinCollectionBaseView

public class 
{

    public static void inject(butterknife.ewInjector ewinjector, PinCollectionBaseView pincollectionbaseview, Object obj)
    {
        pincollectionbaseview._gridContainer = (LinearLayout)ewinjector.idContainer(obj, 0x7f0f00a5, "field '_gridContainer'");
    }

    public static void reset(PinCollectionBaseView pincollectionbaseview)
    {
        pincollectionbaseview._gridContainer = null;
    }

    public ()
    {
    }
}
