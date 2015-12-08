// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.photo.PhotoPickerDialog;
import me.lyft.android.utils.FileUtils;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            PassengerPhotoView, UserImageView

public class PassengerMyPhotoView extends PassengerPhotoView
{

    TextView addPhotoText;
    Binder binder;
    DialogFlow dialogFlow;
    private final android.view.View.OnClickListener onClickListener;
    private final Action1 onImageCaptured;
    private final Action1 onNoImageSelected;
    IPassengerRideProvider passengerRideProvider;
    IPhotoPickerService photoPickerService;
    ProfileFlow profileFlow;
    IProfilePhotoLoader profilePhotoLoader;
    IProfileService profileService;
    ProgressBar progress;
    ImageView userImageView;
    View userNeedsPhotoContainer;

    public PassengerMyPhotoView(Context context)
    {
        super(context);
        onImageCaptured = new Action1() {

            final PassengerMyPhotoView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                unit = getTemporaryUserPhotoFile();
                uploadProfilePicture(unit);
            }

            
            {
                this$0 = PassengerMyPhotoView.this;
                super();
            }
        };
        onNoImageSelected = new Action1() {

            final PassengerMyPhotoView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                updatePreview(null);
            }

            
            {
                this$0 = PassengerMyPhotoView.this;
                super();
            }
        };
        onClickListener = new android.view.View.OnClickListener() {

            final PassengerMyPhotoView this$0;

            public void onClick(View view)
            {
                if (hasProfileImage())
                {
                    profileFlow.openMyPassengerRideProfile();
                    return;
                } else
                {
                    showPhotoPickerDialog();
                    return;
                }
            }

            
            {
                this$0 = PassengerMyPhotoView.this;
                super();
            }
        };
        init();
    }

    public PassengerMyPhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onImageCaptured = new _cls1();
        onNoImageSelected = new _cls2();
        onClickListener = new _cls4();
        init();
    }

    public PassengerMyPhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onImageCaptured = new _cls1();
        onNoImageSelected = new _cls2();
        onClickListener = new _cls4();
        init();
    }

    public PassengerMyPhotoView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        onImageCaptured = new _cls1();
        onNoImageSelected = new _cls2();
        onClickListener = new _cls4();
        init();
    }

    private File getTemporaryUserPhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "profile_photo.jpg");
    }

    private boolean hasProfileImage()
    {
        return !Strings.isNullOrEmpty(passengerRideProvider.getPassengerRide().getSelf().getPhotoUrl()) || profilePhotoLoader.hasCacheFile();
    }

    private void init()
    {
        setOnClickListener(onClickListener);
        setPassengerName(getResources().getString(0x7f070318));
        Scoop scoop = Scoop.a(this);
        scoop.b(this);
        addView(scoop.a(getContext()).inflate(0x7f030146, this, false), 0);
        ButterKnife.a(this);
    }

    private void setLoading(boolean flag)
    {
        if (flag)
        {
            progress.setVisibility(0);
            addPhotoText.setVisibility(4);
            return;
        } else
        {
            progress.setVisibility(4);
            addPhotoText.setVisibility(0);
            return;
        }
    }

    private void setPhotoNeeded(boolean flag)
    {
        if (flag)
        {
            userNeedsPhotoContainer.setVisibility(0);
            passengerPhotoImageView.setVisibility(8);
            return;
        }
        if (userNeedsPhotoContainer != null)
        {
            userNeedsPhotoContainer.setVisibility(8);
        }
        passengerPhotoImageView.setVisibility(0);
    }

    private void showPhotoPickerDialog()
    {
        PhotoPickerDialog photopickerdialog = new PhotoPickerDialog(getResources().getString(0x7f070301), new me.lyft.android.ui.camera.CameraScreens.CaptureUserPhotoScreen(), Scoop.a(this).a(), new me.lyft.android.ui.gallery.GalleryScreens.CropScreen(), getTemporaryUserPhotoFile());
        dialogFlow.show(photopickerdialog);
    }

    private void updatePreview(File file)
    {
        profilePhotoLoader.usePhotoFilePreview(file);
        updateProfileImage();
    }

    private void updateProfileImage()
    {
        profilePhotoLoader.load().fit().centerInside().into(userImageView);
        boolean flag;
        if (!hasProfileImage())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setPhotoNeeded(flag);
    }

    private void uploadProfilePicture(File file)
    {
        setLoading(true);
        binder.bind(profileService.uploadProfilePicture(file), new AsyncCall() {

            final PassengerMyPhotoView this$0;

            public void onFail(Throwable throwable)
            {
                dialogFlow.show(new Toast(getResources().getString(0x7f070219)));
                updatePreview(null);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                updatePreview(getTemporaryUserPhotoFile());
            }

            public void onUnsubscribe()
            {
                setLoading(false);
            }

            
            {
                this$0 = PassengerMyPhotoView.this;
                super();
            }
        });
    }

    protected void loadPhoto(String s)
    {
        updatePreview(null);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        setPartySize(Integer.valueOf(passengerRideProvider.getPassengerRide().getSelf().getPartySize()));
        binder = Binder.attach(this);
        Observable observable = photoPickerService.observePhotoPickerResult();
        binder.bind(observable, onImageCaptured);
        binder.bind(ReactiveUI.isTrue(observable.isEmpty()), onNoImageSelected);
    }

    protected void setPassengerName(String s)
    {
        super.setPassengerName(getResources().getString(0x7f070318));
    }






}
