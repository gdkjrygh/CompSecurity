// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerProfilePhotoWidgetView

class val.userPhotoUrl
    implements android.view.oWidgetView._cls2
{

    final PassengerProfilePhotoWidgetView this$0;
    final boolean val$isSelf;
    final String val$userPhotoUrl;

    public void onClick(View view)
    {
        if (profileService.isPassengerPhotoUploadEnabled() && val$isSelf)
        {
            appFlow.goTo(new ilePhotoScreen());
            return;
        } else
        {
            appFlow.goTo(new me.lyft.android.ui.<init>(val$userPhotoUrl));
            return;
        }
    }

    ilePhotoScreen()
    {
        this$0 = final_passengerprofilephotowidgetview;
        val$isSelf = flag;
        val$userPhotoUrl = String.this;
        super();
    }
}
