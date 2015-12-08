// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.FixedFare;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher, ISwitcherItem

public class StandbySwitcher extends MultiSwitcher
{

    public StandbySwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected volatile void bindSwitcherItem(View view, ISwitcherItem iswitcheritem)
    {
        bindSwitcherItem(view, (StandbySwitcherItem)iswitcheritem);
    }

    protected void bindSwitcherItem(View view, StandbySwitcherItem standbyswitcheritem)
    {
        TextView textview = (TextView)ButterKnife.a(view, 0x7f0d03f2);
        view = (TextView)ButterKnife.a(view, 0x7f0d03ad);
        standbyswitcheritem = standbyswitcheritem.getFare();
        textview.setText(standbyswitcheritem.getTotalMoney().format());
        standbyswitcheritem = standbyswitcheritem.getDescriptionText();
        if (!Strings.isNullOrEmpty(standbyswitcheritem))
        {
            view.setVisibility(0);
            view.setText(standbyswitcheritem);
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    protected View createMultiSwitcherView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f030135, viewgroup, true);
    }

    protected volatile View createSwitcherItem(LayoutInflater layoutinflater, ISwitcherItem iswitcheritem)
    {
        return createSwitcherItem(layoutinflater, (StandbySwitcherItem)iswitcheritem);
    }

    protected View createSwitcherItem(LayoutInflater layoutinflater, StandbySwitcherItem standbyswitcheritem)
    {
        return layoutinflater.inflate(0x7f030136, null);
    }

    protected View createThumb(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f030137, viewgroup, true);
    }

    protected volatile void updateThumbViewToIndex(ISwitcherItem iswitcheritem, ViewGroup viewgroup)
    {
        updateThumbViewToIndex((StandbySwitcherItem)iswitcheritem, viewgroup);
    }

    protected void updateThumbViewToIndex(StandbySwitcherItem standbyswitcheritem, ViewGroup viewgroup)
    {
        bindSwitcherItem(viewgroup, standbyswitcheritem);
    }

    private class StandbySwitcherItem
        implements ISwitcherItem
    {

        private final FixedFare fare;

        public String getActiveColor()
        {
            return null;
        }

        public FixedFare getFare()
        {
            return fare;
        }

        public String getId()
        {
            return fare.getFixedFareToken();
        }

        public StandbySwitcherItem(FixedFare fixedfare)
        {
            fare = fixedfare;
        }
    }

}
