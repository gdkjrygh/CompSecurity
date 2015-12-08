// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.photo;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.photo:
//            PhotoPickerDialogView, PhotoPickerDialog

class this._cls0
    implements Action1
{

    final PhotoPickerDialogView this$0;

    public volatile void call(Object obj)
    {
        call((RideDTO)obj);
    }

    public void call(RideDTO ridedto)
    {
        if ("droppedOff".equalsIgnoreCase(ridedto.getStatus()))
        {
            dialogFlow.dismiss(me/lyft/android/ui/photo/PhotoPickerDialog);
        }
    }

    ()
    {
        this$0 = PhotoPickerDialogView.this;
        super();
    }
}
