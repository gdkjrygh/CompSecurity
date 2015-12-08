// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import com.pinterest.activity.create.BoardSelectedEvent;
import com.pinterest.activity.place.PlaceSelectedEvent;
import com.pinterest.api.model.Place;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreateBaseFragment

class this._cls0
    implements com.pinterest.base.er
{

    final CreateBaseFragment this$0;

    public void onEventMainThread(BoardSelectedEvent boardselectedevent)
    {
        Events.removeStickyEvent(boardselectedevent);
        boardUid = boardselectedevent.getBoardId();
        autoPickBoard();
    }

    public void onEventMainThread(com.pinterest.activity.create.helper.rdCreatedEvent rdcreatedevent)
    {
        Events.removeStickyEvent(rdcreatedevent);
        boardUid = rdcreatedevent.getBoardId();
        autoPickBoard();
    }

    public void onEventMainThread(PlaceSelectedEvent placeselectedevent)
    {
        Events.removeStickyEvent(placeselectedevent);
        placeUid = placeselectedevent.getSelectedPlace().getUid();
        getActivity().getIntent().putExtra("com.pinterest.EXTRA_PLACE_ID", placeUid);
        updatePlaceDisplay(placeselectedevent.getSelectedPlace(), descriptionEt.getText().toString());
    }

    CreatedEvent()
    {
        this$0 = CreateBaseFragment.this;
        super();
    }
}
