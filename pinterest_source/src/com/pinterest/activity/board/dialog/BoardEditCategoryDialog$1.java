// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.adapter.CategoryListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditCategoryDialog

class this._cls0
    implements android.widget.tener
{

    final BoardEditCategoryDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Pinalytics.a(ElementType.BOARD_CATEGORY, ComponentType.MODAL_DIALOG, _board.getUid());
        adapterview = BoardEditCategoryDialog.access$000(BoardEditCategoryDialog.this).getItem(i).getKey();
        view = BoardEditCategoryDialog.access$000(BoardEditCategoryDialog.this).getItem(i).getName();
        _board.setCategory(adapterview);
        BoardEditCategoryDialog.access$102(BoardEditCategoryDialog.this, view);
        ModelHelper.updateBoard(_board, null, adapterview, null, null, null, BoardEditCategoryDialog.access$200(BoardEditCategoryDialog.this), null);
        dismiss();
    }

    ()
    {
        this$0 = BoardEditCategoryDialog.this;
        super();
    }
}
