// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.view.View;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class HidePromotedPinToast extends BaseToast
{

    private Pin _pin;

    public HidePromotedPinToast(Pin pin)
    {
        _pin = pin;
    }

    public View getView(ToastContainer toastcontainer)
    {
        setImageUrl(_pin.getImageSquareUrl());
        setMessage(0x7f07058f);
        setSecondaryMessage(0x7f0705a3);
        setLayoutGravity(81);
        return super.getView(toastcontainer);
    }
}
