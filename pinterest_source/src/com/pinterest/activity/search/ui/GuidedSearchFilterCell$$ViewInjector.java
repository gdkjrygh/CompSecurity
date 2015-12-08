// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.widget.TextView;
import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchFilterCell

public class 
{

    public static void inject(butterknife.erCell ercell, GuidedSearchFilterCell guidedsearchfiltercell, Object obj)
    {
        com.pinterest.activity.explore.view.(ercell, guidedsearchfiltercell, obj);
        guidedsearchfiltercell._countView = (TextView)ercell._countView(obj, 0x7f0f0326, "field '_countView'");
        guidedsearchfiltercell._icon = (WebImageView)ercell._icon(obj, 0x7f0f0325, "field '_icon'");
    }

    public static void reset(GuidedSearchFilterCell guidedsearchfiltercell)
    {
        com.pinterest.activity.explore.view.(guidedsearchfiltercell);
        guidedsearchfiltercell._countView = null;
        guidedsearchfiltercell._icon = null;
    }

    public ()
    {
    }
}
