// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.DriverDocumentsAnalytics;
import me.lyft.android.application.driverdocuments.IDriverDocumentsProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DateUtils;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.driverdocuments.Insurance;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.photo.PhotoPickerDialog;
import me.lyft.android.utils.FileUtils;
import rx.functions.Action1;

public class PersonalInsuranceView extends ScrollView
{

    public static final DateFormat DATE_UI_FORMAT = DateUtils.createDateFormat("MM/dd/yyyy");
    public static final String STATUS_FORMAT = " (%s)";
    public static final String TEMPORARY_INSURANCE_PHOTO_NAME = "insurance_photo.jpg";
    AppFlow appFlow;
    private Binder binder;
    DialogFlow dialogFlow;
    IDriverDocumentsProvider driverDocumentsProvider;
    TextView expirationDateTextView;
    ImageLoader imageLoader;
    TableLayout insuranceInfoTableLayout;
    ImageView insurancePhoto;
    ILyftPreferences lyftPreferences;
    TextView noInsuranceTextView;
    private Action1 onFilePicked;
    TextView pendingInsuranceTextView;
    IPhotoPickerService photoPickerService;
    TextView requirementsLinkTextView;
    TextView stateTextView;
    View statusBannerContainer;
    TextView statusBannerTextView;
    Toolbar toolbar;
    Button updateInsuranceButton;

    public PersonalInsuranceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onFilePicked = new Action1() {

            final PersonalInsuranceView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                appFlow.goTo(new SettingsScreens.CapturedPersonalInsuranceScreen());
            }

            
            {
                this$0 = PersonalInsuranceView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private File getTemporaryInsurancePhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "insurance_photo.jpg");
    }

    private void openInsuranceRequirements()
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(lyftPreferences.getLyftWebRoot()).append("/drive/help/article/1517270").toString()));
        intent.addFlags(0x10000000);
        getContext().startActivity(intent);
    }

    private void showUpdateDialog()
    {
        PhotoPickerDialog photopickerdialog = new PhotoPickerDialog(getResources().getString(0x7f07029a), new me.lyft.android.ui.camera.CameraScreens.CameraPersonalInsurance(), new SettingsScreens.PersonalInsuranceScreen(), new SettingsScreens.CapturedPersonalInsuranceScreen(), getTemporaryInsurancePhotoFile());
        dialogFlow.show(photopickerdialog);
    }

    private void updateInsuranceInfo()
    {
        Insurance insurance = driverDocumentsProvider.getInsurance();
        if (insurance.isNull() || Strings.isNullOrEmpty(insurance.getPhotoUrl()))
        {
            noInsuranceTextView.setText(Html.fromHtml(getResources().getString(0x7f070298)));
            noInsuranceTextView.setVisibility(0);
            insuranceInfoTableLayout.setVisibility(8);
            statusBannerContainer.setVisibility(8);
            updateInsuranceButton.setEnabled(true);
            updateInsuranceButton.setText(0x7f070135);
            return;
        }
        noInsuranceTextView.setVisibility(8);
        insuranceInfoTableLayout.setVisibility(0);
        StringBuilder stringbuilder = new StringBuilder();
        Date date = insurance.getExpirationDate();
        if (date != null)
        {
            stringbuilder.append(DATE_UI_FORMAT.format(new Date(date.getTime())));
        }
        if (insurance.isApproved())
        {
            statusBannerContainer.setVisibility(8);
            expirationDateTextView.setTextColor(getResources().getColor(0x7f0c0063));
        } else
        if (insurance.isExpired() || insurance.isRejected())
        {
            String s;
            TextView textview;
            if (insurance.isExpired())
            {
                s = getResources().getString(0x7f0702a2);
            } else
            {
                s = getResources().getString(0x7f0702a4);
            }
            stringbuilder.append(String.format(" (%s)", new Object[] {
                s
            }));
            expirationDateTextView.setTextColor(getResources().getColor(0x7f0c008f));
            statusBannerTextView.setCompoundDrawablesWithIntrinsicBounds(0x7f02010c, 0, 0, 0);
            textview = statusBannerTextView;
            if (insurance.isExpired())
            {
                s = getResources().getString(0x7f07029f);
            } else
            {
                s = getResources().getString(0x7f0702a1);
            }
            textview.setText(s);
        } else
        {
            stringbuilder.append(String.format(" (%s)", new Object[] {
                getResources().getString(0x7f0702a3)
            }));
            expirationDateTextView.setTextColor(getResources().getColor(0x7f0c0063));
            statusBannerTextView.setCompoundDrawablesWithIntrinsicBounds(0x7f02010b, 0, 0, 0);
            statusBannerTextView.setText(getResources().getString(0x7f0702a0));
            pendingInsuranceTextView.setText(Html.fromHtml(getResources().getString(0x7f070299)));
            pendingInsuranceTextView.setVisibility(0);
            requirementsLinkTextView.setVisibility(8);
            updateInsuranceButton.setVisibility(8);
        }
        expirationDateTextView.setText(stringbuilder.toString());
        stateTextView.setText(insurance.getState());
        imageLoader.load(insurance.getPhotoUrl()).fit().placeholder(0x7f02013e).into(insurancePhoto);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            binder.bind(photoPickerService.observePhotoPickerResult(), onFilePicked);
            requirementsLinkTextView.setOnClickListener(new android.view.View.OnClickListener() {

                final PersonalInsuranceView this$0;

                public void onClick(View view)
                {
                    openInsuranceRequirements();
                }

            
            {
                this$0 = PersonalInsuranceView.this;
                super();
            }
            });
            updateInsuranceButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PersonalInsuranceView this$0;

                public void onClick(View view)
                {
                    DriverDocumentsAnalytics.driverInsuranceUpdate();
                    showUpdateDialog();
                }

            
            {
                this$0 = PersonalInsuranceView.this;
                super();
            }
            });
            updateInsuranceInfo();
            toolbar.setTitle(getResources().getString(0x7f0702a5));
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
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
