// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitLayout;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsBoardFragment

public class 
{

    public static void inject(butterknife.dFragment dfragment, NUXCoreConceptsBoardFragment nuxcoreconceptsboardfragment, Object obj)
    {
        nuxcoreconceptsboardfragment._title = (PTextView)dfragment._title(obj, 0x7f0f0272, "field '_title'");
        nuxcoreconceptsboardfragment._board = (WebImageView)dfragment._board(obj, 0x7f0f0273, "field '_board'");
        nuxcoreconceptsboardfragment._boardTip = (WebImageView)dfragment._boardTip(obj, 0x7f0f0274, "field '_boardTip'");
        nuxcoreconceptsboardfragment._boardName = (PTextView)dfragment._boardName(obj, 0x7f0f0275, "field '_boardName'");
        nuxcoreconceptsboardfragment._titleWrapper = (AutofitLayout)dfragment._titleWrapper(obj, 0x7f0f0271, "field '_titleWrapper'");
    }

    public static void reset(NUXCoreConceptsBoardFragment nuxcoreconceptsboardfragment)
    {
        nuxcoreconceptsboardfragment._title = null;
        nuxcoreconceptsboardfragment._board = null;
        nuxcoreconceptsboardfragment._boardTip = null;
        nuxcoreconceptsboardfragment._boardName = null;
        nuxcoreconceptsboardfragment._titleWrapper = null;
    }

    public ()
    {
    }
}
