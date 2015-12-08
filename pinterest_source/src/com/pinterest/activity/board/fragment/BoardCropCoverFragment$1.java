// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.ui.grid.board.BoardCropCoverView;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardCropCoverFragment

class this._cls0
    implements android.view.BoardCropCoverFragment._cls1
{

    final BoardCropCoverFragment this$0;

    public void onClick(View view)
    {
        _contentView.submit(BoardCropCoverFragment.access$000(BoardCropCoverFragment.this), BoardCropCoverFragment.access$100(BoardCropCoverFragment.this), onBoardCoverSubmitted);
    }

    ()
    {
        this$0 = BoardCropCoverFragment.this;
        super();
    }
}
