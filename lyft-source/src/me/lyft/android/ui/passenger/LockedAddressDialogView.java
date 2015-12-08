// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.ui.dialogs.DialogContainerView;

public class LockedAddressDialogView extends DialogContainerView
{

    DialogFlow dialogFlow;
    private boolean isPickup;
    TextView lockedAddressName;
    ImageView lockedAddressPinIconView;
    TextView lockedAddressTitleView;
    Button okButton;
    IPassengerRideProvider passengerRideProvider;

    public LockedAddressDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        isPickup = ((PassengerDialogs.LockAddressDialog)context.a()).isPickup();
    }

    private Drawable getPinIcon()
    {
        if (isPickup)
        {
            return getResources().getDrawable(0x7f020181);
        } else
        {
            return getResources().getDrawable(0x7f02017d);
        }
    }

    private String getTitle()
    {
        if (isPickup)
        {
            return getResources().getString(0x7f0700ea);
        } else
        {
            return getResources().getString(0x7f0700e9);
        }
    }

    public String getAddress()
    {
        if (!isPickup) goto _L2; else goto _L1
_L1:
        String s;
        Object obj = passengerRideProvider.getPassengerRide().getPickup();
        s = ((Location) (obj)).getRoutableAddress();
        if (Strings.isNullOrEmpty(s))
        {
            s = ((Location) (obj)).getDisplayName();
        }
_L4:
        obj = s;
        if (Strings.isNullOrEmpty(s))
        {
            obj = getResources().getString(0x7f070064);
        }
        return ((String) (obj));
_L2:
        Location location = passengerRideProvider.getPassengerRide().getDropoff();
        String s1 = location.getRoutableAddress();
        s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = location.getDisplayName();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Drawable getButtonDrawable()
    {
        if (isPickup)
        {
            return getResources().getDrawable(0x7f02004e);
        } else
        {
            return getResources().getDrawable(0x7f020058);
        }
    }

    public ColorStateList getButtonTextColor()
    {
        if (isPickup)
        {
            return getResources().getColorStateList(0x7f0c00ab);
        } else
        {
            return getResources().getColorStateList(0x7f0c00ac);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        lockedAddressTitleView.setText(getTitle());
        lockedAddressPinIconView.setBackgroundDrawable(getPinIcon());
        lockedAddressName.setText(getAddress());
        okButton.setTextColor(getButtonTextColor());
        okButton.setBackgroundDrawable(getButtonDrawable());
    }
}
