// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.widget.TextView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.grid.BoardInfo;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            UnauthSignupBoardScrollFragment, InspiredWallFragment

class this._cls0 extends com.pinterest.api.remote.ollFragment._cls1
{

    final UnauthSignupBoardScrollFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        PLog.error(throwable, (new StringBuilder("Could not load board for warm app signup: ")).append(apiresponse.toString()).toString(), new Object[0]);
        FragmentHelper.replaceFragment(getActivity(), new InspiredWallFragment(), false);
    }

    public void onSuccess(Board board)
    {
        super.s(board);
        _boardTitle.setText(board.getName());
        _boardInfo.setBoard(board, false);
    }

    ()
    {
        this$0 = UnauthSignupBoardScrollFragment.this;
        super();
    }
}
