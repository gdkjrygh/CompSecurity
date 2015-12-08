// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.lyft.scoop.Screen;
import java.io.File;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.studies.PhotoAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.events.RideStatusChangedEvent;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.infrastructure.gallery.IGalleryService;
import me.lyft.android.infrastructure.lyft.ride.RideDTO;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.dialogs.DialogButton;
import me.lyft.android.ui.dialogs.DialogContainerView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.photo:
//            PhotoPickerDialog

public class PhotoPickerDialogView extends DialogContainerView
{

    final Category analyticsCategory;
    MessageBus bus;
    ICaptureImage captureImage;
    final Screen captureScreen;
    DialogFlow dialogFlow;
    IGalleryService galleryService;
    DialogButton openGalleryButton;
    final File outFile;
    final Screen previewScreen;
    final Screen returnScreen;
    final Action1 rideStatusChanged = new Action1() {

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

            
            {
                this$0 = PhotoPickerDialogView.this;
                super();
            }
    };
    DialogButton takePhotoButton;
    final String title;
    TextView titleTextView;

    public PhotoPickerDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        context = (PhotoPickerDialog)context.a();
        captureScreen = context.getCaptureScreen();
        returnScreen = context.getReturnScreen();
        outFile = context.getOutFile();
        title = context.getTitle();
        previewScreen = context.getPreviewScreen();
        analyticsCategory = context.getAnalyticsCategory();
    }

    private void openGallery()
    {
        PhotoAnalytics.choosePhoto(analyticsCategory);
        galleryService.pickFileFromGallery(getContext(), returnScreen, previewScreen, outFile);
    }

    private void takePhoto()
    {
        PhotoAnalytics.takePhoto(analyticsCategory);
        captureImage.capturePhoto(captureScreen, returnScreen, previewScreen, outFile);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Binder.attach(this).bind(bus.observe(me/lyft/android/events/RideStatusChangedEvent), rideStatusChanged);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        titleTextView.setText(title);
        openGalleryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PhotoPickerDialogView this$0;

            public void onClick(View view)
            {
                openGallery();
            }

            
            {
                this$0 = PhotoPickerDialogView.this;
                super();
            }
        });
        takePhotoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PhotoPickerDialogView this$0;

            public void onClick(View view)
            {
                takePhoto();
            }

            
            {
                this$0 = PhotoPickerDialogView.this;
                super();
            }
        });
    }


}
