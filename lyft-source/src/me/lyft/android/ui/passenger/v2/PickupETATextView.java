// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PickupETAPresenter

public class PickupETATextView extends TextView
    implements PickupETAPresenter.PickupETAView
{

    PickupETAPresenter pickupETAController;
    TextView pickupEtaLabel;

    public PickupETATextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            pickupETAController.attachView(this);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        pickupETAController.detachView(this);
        super.onDetachedFromWindow();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setNoDriversAvailable()
    {
        pickupEtaLabel.setText(getResources().getString(0x7f07023c));
    }

    public void setNoDriversAvailable(String s)
    {
        pickupEtaLabel.setText(s);
    }

    public void setPickupETA(int i)
    {
        String s = getResources().getString(0x7f07023b, new Object[] {
            Integer.valueOf(i)
        });
        pickupEtaLabel.setText(s);
    }

    public void setPickupNearbyDriverCount(int i)
    {
        String s = getResources().getQuantityString(0x7f0f0003, i, new Object[] {
            Integer.valueOf(i)
        });
        pickupEtaLabel.setText(s);
    }
}
