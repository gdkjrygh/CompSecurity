// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.ui.driver.RideProgressPassengerItem;

public class CallPassengerMenuItem extends RelativeLayout
{

    TextView label;
    RideProgressPassengerItem userImageView;

    public CallPassengerMenuItem(Context context)
    {
        super(context);
        context = Scoop.a(this);
        context.b(this);
        context.a(getContext()).inflate(0x7f0300b1, this, true);
        ButterKnife.a(this);
        setBackgroundResource(0x7f02021e);
    }

    public void setPassenger(String s, String s1, int i, boolean flag)
    {
        label.setText(getResources().getString(0x7f070085, new Object[] {
            s
        }));
        userImageView.setPartyProfilePhoto(s1);
        userImageView.setPartySize(Integer.valueOf(i));
        userImageView.setPickedUp(flag);
    }
}
