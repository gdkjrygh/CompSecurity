// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui:
//            PassengerPhotoView

class this._cls0
    implements android.view.iew._cls1
{

    final PassengerPhotoView this$0;

    public void onClick(View view)
    {
        profileFlow.openPassengerRideProfile(PassengerPhotoView.access$000(PassengerPhotoView.this));
    }

    ()
    {
        this$0 = PassengerPhotoView.this;
        super();
    }
}
