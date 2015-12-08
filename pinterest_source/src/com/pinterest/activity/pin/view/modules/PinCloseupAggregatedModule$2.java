// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.widget.TextView;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.NumberUtils;
import com.pinterest.kit.view.BoardView;

// Referenced classes of package com.pinterest.activity.pin.view.modules:
//            PinCloseupAggregatedModule

class this._cls0 extends com.pinterest.api.remote.egatedModule._cls2
{

    final PinCloseupAggregatedModule this$0;

    public void onSuccess(final ApiResponse response)
    {
        class _cls1 extends BackgroundTask
        {

            public Board board;
            final PinCloseupAggregatedModule._cls2 this$1;
            final ApiResponse val$response;

            public void onFinish()
            {
                onSuccess(board);
            }

            public void run()
            {
                board = Board.make((PinterestJsonObject)response.getData(), false).getBoard();
            }

            _cls1()
            {
                this$1 = PinCloseupAggregatedModule._cls2.this;
                response = apiresponse;
                super();
            }
        }

        (new _cls1()).execute();
    }

    public void onSuccess(Board board)
    {
        super.uccess(board);
        PinCloseupAggregatedModule.access$002(PinCloseupAggregatedModule.this, board);
        _followBoardButton.setBoard(PinCloseupAggregatedModule.access$000(PinCloseupAggregatedModule.this));
        _boardName.setText(board.getName());
        int i = board.getPinCount().intValue();
        Object obj = Resources.stringPlural(0x7f090017, Integer.valueOf(i), new Object[] {
            NumberUtils.getFormattedNumber(i)
        });
        _boardStats.setText(((CharSequence) (obj)));
        obj = _boardVw;
        if (Device.isTablet())
        {
            i = 4;
        } else
        {
            i = 3;
        }
        ((BoardView) (obj)).setWeights(i, board.getLargestPinIndex().intValue());
        _boardVw.setContentUrls(board.getPinImagesList());
    }

    _cls1()
    {
        this$0 = PinCloseupAggregatedModule.this;
        super();
    }
}
