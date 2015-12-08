// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerProfilePhotoView, EditProfileSession

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
        unit = UpdatePassengerProfilePhotoView.access$200(UpdatePassengerProfilePhotoView.this).getEditProfileSession().getUserPhotoFile();
        UpdatePassengerProfilePhotoView.access$300(UpdatePassengerProfilePhotoView.this, unit);
    }

    ilePhotoScreen()
    {
        this$0 = UpdatePassengerProfilePhotoView.this;
        super();
    }
}
