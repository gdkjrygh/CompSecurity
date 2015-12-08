// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.res.Resources;
import android.view.View;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.studies.ProfileAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.photo.PhotoPickerDialog;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerPhotoFromEditProfileView

class this._cls0
    implements android.view.ProfileView._cls2
{

    final UpdatePassengerPhotoFromEditProfileView this$0;

    public void onClick(View view)
    {
        ProfileAnalytics.updatePhoto();
        dialogFlow.show(new PhotoPickerDialog(getResources().getString(0x7f0702d2), new me.lyft.android.ui.camera.>(), new (), new me.lyft.android.ui.gallery.(), UpdatePassengerPhotoFromEditProfileView.access$000(UpdatePassengerPhotoFromEditProfileView.this), Category.EDIT_PROFILE));
    }

    ()
    {
        this$0 = UpdatePassengerPhotoFromEditProfileView.this;
        super();
    }
}
