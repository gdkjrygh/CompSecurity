// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;

public class ListCellSwitch extends RelativeLayout
{

    View _dividerVw;
    TextView _metadataTv;
    TextView _titleTv;
    SwitchCompat _toggleSw;

    public ListCellSwitch(Context context)
    {
        this(context, null);
    }

    public ListCellSwitch(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static ListCellSwitch get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof ListCellSwitch))
        {
            return new ListCellSwitch(viewgroup.getContext());
        } else
        {
            return (ListCellSwitch)view;
        }
    }

    private void init()
    {
        setMinimumHeight((int)Resources.dimension(0x7f0a0155));
        setBackgroundResource(0x7f020283);
        inflate(getContext(), 0x7f03016b, this);
        ButterKnife.a(this);
    }

    public void setAlignWithActionBar(boolean flag)
    {
        int i;
        if (flag)
        {
            i = (int)Device.dpToPixel(38F);
        } else
        {
            i = 0;
        }
        _titleTv.setPadding(i, 0, 0, 0);
    }

    public void setDividerVisibility(int i)
    {
        _dividerVw.setVisibility(i);
    }

    public void setMetadataIcon(Drawable drawable)
    {
        _metadataTv.setCompoundDrawables(null, null, DrawableUtils.tintIcon(drawable), null);
    }

    public void setMetadataText(String s)
    {
        if (s == null)
        {
            _metadataTv.setVisibility(8);
            return;
        } else
        {
            _metadataTv.setVisibility(0);
            _metadataTv.setText(s);
            return;
        }
    }

    public void setSwitchChecked(boolean flag)
    {
        _toggleSw.setChecked(flag);
    }

    public void setSwitchListener(android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
    {
        _toggleSw.setOnCheckedChangeListener(oncheckedchangelistener);
    }

    public void setSwitchTag(int i, Object obj)
    {
        _toggleSw.setTag(i, obj);
    }

    public void setText(String s)
    {
        _titleTv.setText(s);
    }
}
