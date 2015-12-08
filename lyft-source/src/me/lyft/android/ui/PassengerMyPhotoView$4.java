// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui:
//            PassengerMyPhotoView

class this._cls0
    implements android.view.iew._cls4
{

    final PassengerMyPhotoView this$0;

    public void onClick(View view)
    {
        if (PassengerMyPhotoView.access$400(PassengerMyPhotoView.this))
        {
            profileFlow.openMyPassengerRideProfile();
            return;
        } else
        {
            PassengerMyPhotoView.access$500(PassengerMyPhotoView.this);
            return;
        }
    }

    ()
    {
        this$0 = PassengerMyPhotoView.this;
        super();
    }
}
