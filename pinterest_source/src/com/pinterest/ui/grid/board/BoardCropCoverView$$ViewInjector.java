// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.pinterest.ui.imageview.NonRoundWebImageView;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardCropCoverView

public class 
{

    public static void inject(butterknife.w w, BoardCropCoverView boardcropcoverview, Object obj)
    {
        boardcropcoverview._scrollView = (ScrollView)w._scrollView(obj, 0x7f0f0456, "field '_scrollView'");
        boardcropcoverview._horizontalScrollView = (HorizontalScrollView)w._horizontalScrollView(obj, 0x7f0f0457, "field '_horizontalScrollView'");
        boardcropcoverview._imageView = (NonRoundWebImageView)w.ew(obj, 0x7f0f004b, "field '_imageView'");
        boardcropcoverview._maskTop = w._maskTop(obj, 0x7f0f0459, "field '_maskTop'");
        boardcropcoverview._maskBottom = w._maskBottom(obj, 0x7f0f045a, "field '_maskBottom'");
        boardcropcoverview._spacerTop = w._spacerTop(obj, 0x7f0f0189, "field '_spacerTop'");
        boardcropcoverview._spacerBottom = w._spacerBottom(obj, 0x7f0f0458, "field '_spacerBottom'");
    }

    public static void reset(BoardCropCoverView boardcropcoverview)
    {
        boardcropcoverview._scrollView = null;
        boardcropcoverview._horizontalScrollView = null;
        boardcropcoverview._imageView = null;
        boardcropcoverview._maskTop = null;
        boardcropcoverview._maskBottom = null;
        boardcropcoverview._spacerTop = null;
        boardcropcoverview._spacerBottom = null;
    }

    public ()
    {
    }
}
