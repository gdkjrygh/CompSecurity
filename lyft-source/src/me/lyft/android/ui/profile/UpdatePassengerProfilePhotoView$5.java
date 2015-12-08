// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.res.Resources;
import android.view.View;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.studies.ProfileAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.ui.photo.PhotoPickerDialog;

// Referenced classes of package me.lyft.android.ui.profile:
//            UpdatePassengerProfilePhotoView

class this._cls0
    implements android.view.lePhotoView._cls5
{

    final UpdatePassengerProfilePhotoView this$0;

    public void onClick(View view)
    {
        ProfileAnalytics.updatePhoto();
        dialogFlow.show(new PhotoPickerDialog(getResources().getString(0x7f0702d2), new me.lyft.android.ui.camera.en(), Scoop.a(UpdatePassengerProfilePhotoView.this).a(), new me.lyft.android.ui.gallery.this._cls0(), UpdatePassengerProfilePhotoView.access$000(UpdatePassengerProfilePhotoView.this), Category.PROFILE));
    }

    n()
    {
        this$0 = UpdatePassengerProfilePhotoView.this;
        super();
    }
}
