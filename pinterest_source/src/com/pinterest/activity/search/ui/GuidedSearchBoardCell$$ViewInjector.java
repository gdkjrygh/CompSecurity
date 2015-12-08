// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import com.pinterest.ui.grid.board.BoardGridCell;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBoardCell

public class 
{

    public static void inject(butterknife.rdCell rdcell, GuidedSearchBoardCell guidedsearchboardcell, Object obj)
    {
        guidedsearchboardcell._paddingLeftView = rdcell._paddingLeftView(obj, 0x7f0f0336, "field '_paddingLeftView'");
        guidedsearchboardcell._paddingRightView = rdcell._paddingRightView(obj, 0x7f0f0339, "field '_paddingRightView'");
        guidedsearchboardcell._cell = (BoardGridCell)rdcell._cell(obj, 0x7f0f035d, "field '_cell'");
    }

    public static void reset(GuidedSearchBoardCell guidedsearchboardcell)
    {
        guidedsearchboardcell._paddingLeftView = null;
        guidedsearchboardcell._paddingRightView = null;
        guidedsearchboardcell._cell = null;
    }

    public ()
    {
    }
}
