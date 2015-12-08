// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.widget.ListView;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestView

public class 
{

    public static void inject(butterknife.restView restview, AddInterestView addinterestview, Object obj)
    {
        addinterestview._searchEt = (SearchEditText)restview._searchEt(obj, 0x7f0f0127, "field '_searchEt'");
        addinterestview._listView = (ListView)restview._listView(obj, 0x7f0f0128, "field '_listView'");
        addinterestview._divider = restview._divider(obj, 0x7f0f0068, "field '_divider'");
    }

    public static void reset(AddInterestView addinterestview)
    {
        addinterestview._searchEt = null;
        addinterestview._listView = null;
        addinterestview._divider = null;
    }

    public ()
    {
    }
}
