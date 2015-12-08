// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerProfilePhotoView

class this._cls0
    implements Action1
{

    final UpdatePassengerProfilePhotoView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        progressController.showProgress();
        unit = UpdatePassengerProfilePhotoView.access$000(UpdatePassengerProfilePhotoView.this);
        UpdatePassengerProfilePhotoView.access$100(UpdatePassengerProfilePhotoView.this).bind(profileService.uploadProfilePicture(unit), onSaveProfile);
    }

    ()
    {
        this$0 = UpdatePassengerProfilePhotoView.this;
        super();
    }
}
