// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.create.adapter.BoardPickerAdapter;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment

class this._cls0
    implements android.widget.kListener
{

    final BoardPickerFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (_adapter != null)
        {
            int j = i;
            if (_fastRepinMode)
            {
                if (i == 0)
                {
                    BoardPickerFragment.access$000(BoardPickerFragment.this);
                    return;
                }
                if (i == 1)
                {
                    BoardPickerFragment.access$100(BoardPickerFragment.this).nClick(_fastRepinDup);
                    return;
                }
                if (i == 2)
                {
                    BoardPickerFragment.access$200(BoardPickerFragment.this).nClick(_fastRepinEdit);
                    return;
                }
                j = i - 3;
            }
            if (_adapter.getItemViewType(j) == 1)
            {
                adapterview = CreateBoardDialog.newInstance(null);
                adapterview.setShouldNavigateToBoardOnCreate(false);
                Events.post(new DialogEvent(adapterview));
                return;
            }
            if (_adapter.getItemViewType(j) != 2)
            {
                view = _adapter.getItem(j);
                if (_adapter.getItemViewType(j) == 3)
                {
                    if (view != null)
                    {
                        adapterview = CreateBoardDialog.newInstance(view.getName());
                        adapterview.setShouldNavigateToBoardOnCreate(false);
                        adapterview.setIsSuggestedBoard(true);
                        Events.post(new DialogEvent(adapterview));
                        return;
                    }
                } else
                {
                    if (view != null)
                    {
                        adapterview = view.getUid();
                    } else
                    {
                        adapterview = MyUser.getLastSelectedBoardId();
                    }
                    MyUser.setLastSelectedBoardId(adapterview);
                    Pinalytics.a(ElementType.BOARD_NAME, null, adapterview);
                    onBoardSelected(view);
                    getActivity().onBackPressed();
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = BoardPickerFragment.this;
        super();
    }
}
