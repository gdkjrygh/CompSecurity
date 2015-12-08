// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driverdocuments.Inspection;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.ui.photo.PhotoPickerDialog;
import me.lyft.android.utils.FileUtils;

public class VehicleInspectionView extends ScrollView
{

    private static final String TEMPORARY_VEHICLE_INSPECTION_PHOTO_NAME = "vehicle_inspection.jpg";
    DialogFlow dialogFlow;
    IDriverDocumentsProvider driverDocumentsProvider;
    ImageLoader imageLoader;
    TextView noInspectionText;
    Toolbar toolbar;
    Button updateButton;
    ImageView vehicleInspectionPhotoImageView;

    public VehicleInspectionView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private File getTemporaryInsurancePhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "vehicle_inspection.jpg");
    }

    private void showUpdateDialog()
    {
        PhotoPickerDialog photopickerdialog = new PhotoPickerDialog(getResources().getString(0x7f070383), new me.lyft.android.ui.camera.CameraScreens.CameraOtherDocumentsScreen(), new SettingsScreens.VehicleInspectionScreen(), new SettingsScreens.CapturedCarDocumentScreen(SettingsScreens.CapturedCarDocumentScreen.DocumentType.VEHICLE_INSPECTION), getTemporaryInsurancePhotoFile());
        dialogFlow.show(photopickerdialog);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        Inspection inspection = driverDocumentsProvider.getInspection();
        if (inspection.isNull() || Strings.isNullOrEmpty(inspection.getPhotoUrl()))
        {
            String s = getResources().getString(0x7f070382);
            noInspectionText.setText(Html.fromHtml(s));
            noInspectionText.setVisibility(0);
            updateButton.setText(0x7f070135);
        } else
        {
            noInspectionText.setVisibility(8);
            updateButton.setText(0x7f070134);
        }
        imageLoader.load(inspection.getPhotoUrl()).fit().placeholder(0x7f02013e).into(vehicleInspectionPhotoImageView);
        updateButton.setOnClickListener(new android.view.View.OnClickListener() {

            final VehicleInspectionView this$0;

            public void onClick(View view)
            {
                showUpdateDialog();
            }

            
            {
                this$0 = VehicleInspectionView.this;
                super();
            }
        });
        toolbar.setTitle(getResources().getString(0x7f070091));
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

}
