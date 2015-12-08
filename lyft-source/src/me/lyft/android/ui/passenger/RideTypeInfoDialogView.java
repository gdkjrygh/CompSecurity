// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.assets.IAssetLoadingService;
import me.lyft.android.infrastructure.lyft.constants.Popup;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class RideTypeInfoDialogView extends DialogContainerView
{

    IAssetLoadingService assetLoadingService;
    ImageView cancelButton;
    IConstantsProvider constantsProvider;
    TextView descriptionText;
    DialogFlow dialogFlow;
    TextView dialogTitle;
    TextView minimumFareText;
    TextView perMileFareText;
    TextView perMinuteFareText;
    TextView pickupFareText;
    TextView primeTimeDescriptionTextView;
    TextView primeTimeTitleTextView;
    View primeTimeTitleView;
    private final String rideTypeId;
    ImageView rideTypeImage;
    IRequestRideTypeProvider rideTypeProvider;
    TextView seatsNumberText;
    View titleContainer;

    public RideTypeInfoDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        rideTypeId = ((PassengerDialogs.RideTypeInfoDialog)context.a()).getRideTypeId();
    }

    private void displayPrimeTime(RequestRideType requestridetype)
    {
        byte byte0 = 8;
        requestridetype = requestridetype.getPricing().getDynamicPricing();
        Object obj = primeTimeTitleView;
        int i;
        if (requestridetype.intValue() > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        primeTimeTitleTextView.setText(getResources().getString(0x7f0702ba, new Object[] {
            requestridetype
        }));
        obj = primeTimeDescriptionTextView;
        i = byte0;
        if (requestridetype.intValue() > 0)
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        primeTimeDescriptionTextView.setText(getResources().getString(0x7f070312, new Object[] {
            requestridetype
        }));
    }

    private void initView()
    {
        Object obj = rideTypeProvider.findRideTypeById(rideTypeId);
        Object obj1 = ((RequestRideType) (obj)).getPricing();
        displayPrimeTime(((RequestRideType) (obj)));
        minimumFareText.setText(((Pricing) (obj1)).getMinimum());
        pickupFareText.setText(((Pricing) (obj1)).getPickup());
        perMileFareText.setText(((Pricing) (obj1)).getPerMile());
        perMinuteFareText.setText(((Pricing) (obj1)).getPerMinute());
        obj = constantsProvider.getRideTypeMetaById(rideTypeId).getPopup();
        dialogTitle.setText(((Popup) (obj)).getTitle());
        obj1 = dialogTitle;
        int i;
        if (Strings.isNullOrBlank(((Popup) (obj)).getTitle()))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj1)).setVisibility(i);
        seatsNumberText.setText(((Popup) (obj)).getSeats());
        obj1 = ((Popup) (obj)).getBackgroundColor();
        if (!Strings.isNullOrEmpty(((String) (obj1))))
        {
            i = Color.parseColor(((String) (obj1)));
        } else
        {
            i = getResources().getColor(0x7f0c000e);
        }
        titleContainer.setBackgroundColor(i);
        descriptionText.setText(((Popup) (obj)).getDescription());
        if (!Strings.isNullOrEmpty(((Popup) (obj)).getIconFile()))
        {
            assetLoadingService.loadImage(((Popup) (obj)).getIconFile()).error(getResources().getDrawable(0x7f0201b1)).into(rideTypeImage);
        }
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RideTypeInfoDialogView this$0;

            public void onClick(View view)
            {
                dialogFlow.dismiss();
            }

            
            {
                this$0 = RideTypeInfoDialogView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        initView();
    }
}
