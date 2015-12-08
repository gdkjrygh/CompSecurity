// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.activity.pin.view.comments.PinCommentsStandaloneCell;
import com.pinterest.ui.grid.AdapterFooterView;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinCommentsFragment

public class 
{

    public static void inject(butterknife.sFragment sfragment, PinCommentsFragment pincommentsfragment, Object obj)
    {
        pincommentsfragment._commentsCell = (PinCommentsStandaloneCell)sfragment.mmentsStandaloneCell(obj, 0x7f0f02a3, "field '_commentsCell'");
        pincommentsfragment._footerView = (AdapterFooterView)sfragment._footerView(obj, 0x7f0f01fd, "field '_footerView'");
    }

    public static void reset(PinCommentsFragment pincommentsfragment)
    {
        pincommentsfragment._commentsCell = null;
        pincommentsfragment._footerView = null;
    }

    public ()
    {
    }
}
