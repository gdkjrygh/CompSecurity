// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.imageview.GrayWebImageView;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBar

public class 
{

    public static void inject(butterknife.rchBar rchbar, GuidedSearchBar guidedsearchbar, Object obj)
    {
        guidedsearchbar._searchEt = (LinearLayout)rchbar._searchEt(obj, 0x7f0f0070, "field '_searchEt'");
        guidedsearchbar._queryText = (EditText)rchbar._queryText(obj, 0x7f0f0071, "field '_queryText'");
        guidedsearchbar._tokenScrollable = (HorizontalScrollView)rchbar._tokenScrollable(obj, 0x7f0f006f, "field '_tokenScrollable'");
        guidedsearchbar._searchRightIcon = (ImageView)rchbar._searchRightIcon(obj, 0x7f0f0073, "field '_searchRightIcon'");
        guidedsearchbar._focusView = rchbar._focusView(obj, 0x7f0f006e, "field '_focusView'");
        guidedsearchbar._userIcon = (GrayWebImageView)rchbar.w(obj, 0x7f0f0072, "field '_userIcon'");
    }

    public static void reset(GuidedSearchBar guidedsearchbar)
    {
        guidedsearchbar._searchEt = null;
        guidedsearchbar._queryText = null;
        guidedsearchbar._tokenScrollable = null;
        guidedsearchbar._searchRightIcon = null;
        guidedsearchbar._focusView = null;
        guidedsearchbar._userIcon = null;
    }

    public ()
    {
    }
}
