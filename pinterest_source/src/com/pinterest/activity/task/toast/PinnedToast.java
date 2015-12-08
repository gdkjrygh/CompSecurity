// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class PinnedToast extends BaseToast
{

    private Pin _pin;

    public PinnedToast(Pin pin)
    {
        _pin = pin;
    }

    public View getView(ToastContainer toastcontainer)
    {
        Board board = _pin.getBoard();
        if (board != null)
        {
            setMessage(Resources.string(0x7f070420, new Object[] {
                board.getName()
            }));
        }
        setLayoutGravity(81);
        setArrowVis(true);
        return super.getView(toastcontainer);
    }

    public void onToastClicked(Context context)
    {
        Events.post(new Navigation(Location.BOARD, _pin.getBoard()));
    }
}
