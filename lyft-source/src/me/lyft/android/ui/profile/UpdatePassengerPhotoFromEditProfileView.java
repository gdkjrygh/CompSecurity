// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.studies.ProfileAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.photo.PhotoPickerDialog;
import me.lyft.android.utils.FileUtils;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            EditProfileSession

public class UpdatePassengerPhotoFromEditProfileView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    private final android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() {

        final UpdatePassengerPhotoFromEditProfileView this$0;

        public void onClick(View view)
        {
            ProfileAnalytics.updatePhoto();
            dialogFlow.show(new PhotoPickerDialog(getResources().getString(0x7f0702d2), new me.lyft.android.ui.camera.CameraScreens.CaptureUserPhotoScreen(), new ProfileScreens.EditProfileScreen(), new me.lyft.android.ui.gallery.GalleryScreens.CropScreen(), getTemporaryUserPhotoFile(), Category.EDIT_PROFILE));
        }

            
            {
                this$0 = UpdatePassengerPhotoFromEditProfileView.this;
                super();
            }
    };
    private final Action1 onHomeClick = new Action1() {

        final UpdatePassengerPhotoFromEditProfileView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            appFlow.goBack();
        }

            
            {
                this$0 = UpdatePassengerPhotoFromEditProfileView.this;
                super();
            }
    };
    private final ProfileScreens.UpdatePassengerPhotoFromEditProfileScreen params;
    ImageView photoImageView;
    IProfilePhotoLoader profilePhotoLoader;
    Button profileUpdatePhotoButton;
    Toolbar toolbar;

    public UpdatePassengerPhotoFromEditProfileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (ProfileScreens.UpdatePassengerPhotoFromEditProfileScreen)context.a();
        setOrientation(1);
    }

    private File getTemporaryUserPhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "profile_photo.jpg");
    }

    private void updatePreview(File file)
    {
        profilePhotoLoader.usePhotoFilePreview(file);
        updateProfileImage();
    }

    private void updateProfileImage()
    {
        android.graphics.drawable.Drawable drawable = photoImageView.getDrawable();
        profilePhotoLoader.loadPreview().error(drawable).fit().centerInside().placeholder(drawable).into(photoImageView);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(toolbar.observeHomeClick(), onHomeClick);
        updatePreview(params.getEditProfileSession().getUserPhotoFile());
        toolbar.setTitle(getResources().getString(0x7f0702c9));
        profileUpdatePhotoButton.setOnClickListener(onClickListener);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

}
