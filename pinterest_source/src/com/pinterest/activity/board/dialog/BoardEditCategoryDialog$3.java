// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.adapter.CategoryListAdapter;
import com.pinterest.api.model.Feed;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditCategoryDialog

class  extends com.pinterest.api.remote.ApiResponse
{

    final BoardEditCategoryDialog this$0;

    public void onSuccess(Feed feed)
    {
        super.onSuccess(feed);
        java.util.List _tmp = BoardEditCategoryDialog.access$302(new ArrayList(feed.getItems()));
        BoardEditCategoryDialog.access$000(BoardEditCategoryDialog.this).setDataSource(BoardEditCategoryDialog.access$300());
    }

    (boolean flag, boolean flag1)
    {
        this$0 = BoardEditCategoryDialog.this;
        super(flag, flag1);
    }
}
