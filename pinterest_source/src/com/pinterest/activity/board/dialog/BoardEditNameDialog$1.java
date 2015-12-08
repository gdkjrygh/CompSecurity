// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.Application;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditNameDialog

class this._cls0 extends ApiResponseHandler
{

    final BoardEditNameDialog this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        BoardEditNameDialog.access$000(BoardEditNameDialog.this, apiresponse);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (_board != null)
        {
            if ((apiresponse = ((ApiResponse) (apiresponse.getData()))) instanceof PinterestJsonObject)
            {
                apiresponse = ((PinterestJsonObject)apiresponse).a("name", "");
                if (ModelHelper.isValid(apiresponse))
                {
                    _board.setName(apiresponse);
                    ModelHelper.setBoard(_board);
                }
                Application.showToastShort(Resources.string(0x7f070092));
                Pinalytics.a(EventType.BOARD_EDIT, _board.getUid());
                return;
            }
        }
    }

    (boolean flag)
    {
        this$0 = BoardEditNameDialog.this;
        super(flag);
    }
}
