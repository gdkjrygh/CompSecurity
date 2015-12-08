// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.controls:
//            MultiSwitcher, RideSwitcherItem, ISwitcherItem

public class RideTypeSwitcher extends MultiSwitcher
{

    public RideTypeSwitcher(Context context)
    {
        super(context);
    }

    public RideTypeSwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RideTypeSwitcher(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected volatile void bindSwitcherItem(View view, ISwitcherItem iswitcheritem)
    {
        bindSwitcherItem(view, (RideSwitcherItem)iswitcheritem);
    }

    protected void bindSwitcherItem(View view, RideSwitcherItem rideswitcheritem)
    {
        ((TextView)ButterKnife.a(view, 0x7f0d0198)).setText(rideswitcheritem.getLabel());
        view = ButterKnife.a(view, 0x7f0d03b0);
        int i;
        if (rideswitcheritem.hasPrimeTime())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    protected View createMultiSwitcherView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f03011f, viewgroup, true);
    }

    protected volatile View createSwitcherItem(LayoutInflater layoutinflater, ISwitcherItem iswitcheritem)
    {
        return createSwitcherItem(layoutinflater, (RideSwitcherItem)iswitcheritem);
    }

    protected View createSwitcherItem(LayoutInflater layoutinflater, RideSwitcherItem rideswitcheritem)
    {
        return layoutinflater.inflate(0x7f030120, null);
    }

    protected View createThumb(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return layoutinflater.inflate(0x7f030121, viewgroup, true);
    }

    protected volatile void updateThumbViewToIndex(ISwitcherItem iswitcheritem, ViewGroup viewgroup)
    {
        updateThumbViewToIndex((RideSwitcherItem)iswitcheritem, viewgroup);
    }

    protected void updateThumbViewToIndex(RideSwitcherItem rideswitcheritem, ViewGroup viewgroup)
    {
        TextView textview = (TextView)ButterKnife.a(viewgroup, 0x7f0d03b1);
        textview.setText(rideswitcheritem.getLabel());
        String s = rideswitcheritem.getActiveColor();
        if (!Strings.isNullOrEmpty(s))
        {
            textview.setTextColor(Color.parseColor(s));
        }
        viewgroup = ButterKnife.a(viewgroup, 0x7f0d03b2);
        int i;
        if (rideswitcheritem.hasPrimeTime())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
    }
}
