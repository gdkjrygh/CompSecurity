// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.create.fragment.view:
//            CreateBoardEmptyView

class this._cls0
    implements android.view.nt.view.CreateBoardEmptyView._cls1
{

    final CreateBoardEmptyView this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_CREATE_SUGGESTED, ComponentType.NAVIGATION);
        String s1 = "";
        Object obj = ((Activity)getContext()).getIntent().getExtras();
        String s = s1;
        if (obj != null)
        {
            obj = ModelHelper.getPin(((Bundle) (obj)).getString("com.pinterest.EXTRA_PIN_ID"));
            s = s1;
            if (obj != null)
            {
                s = ((Pin) (obj)).getBoard().getCategory();
            }
        }
        view = CreateBoardDialog.newInstance((String)view.getTag());
        view.setCategory(s);
        Events.post(new DialogEvent(view));
    }

    ()
    {
        this$0 = CreateBoardEmptyView.this;
        super();
    }
}
