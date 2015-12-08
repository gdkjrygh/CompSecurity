// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ui.UserImageView;

public class RideOverviewPartyItem extends FrameLayout
{

    Button callPassengerButton;
    TextView firstName;
    UserImageView partyPhoto;

    public RideOverviewPartyItem(Context context)
    {
        super(context);
        initView();
    }

    private void initView()
    {
        Scoop.a(this).a(getContext()).inflate(0x7f03011b, this, true);
        ButterKnife.a(this);
        callPassengerButton.setEnabled(false);
    }

    public void setCallEnabled()
    {
        callPassengerButton.setEnabled(true);
    }

    public void setCallPassengerButtonAction(android.view.View.OnClickListener onclicklistener)
    {
        callPassengerButton.setOnClickListener(onclicklistener);
    }

    public void setPartyFirstName(String s)
    {
        firstName.setText(s);
    }

    public void setPartyProfilePhoto(String s)
    {
        partyPhoto.loadPhoto(s);
    }

    public void setPartySize(Integer integer)
    {
        partyPhoto.setUserPartySize(integer);
    }
}
