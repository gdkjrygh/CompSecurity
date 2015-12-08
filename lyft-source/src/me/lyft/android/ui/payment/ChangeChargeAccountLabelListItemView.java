// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class ChangeChargeAccountLabelListItemView extends LinearLayout
{

    TextView changeChargeAccountLabelTextView;
    TextView changeCreditCardCustomLabelTextView;
    ImageView changeCreditCardLableCheckbox;
    private boolean checked;
    private Context context;
    private String customLabelText;
    private boolean isDefault;
    private String labelText;

    public ChangeChargeAccountLabelListItemView(Context context1)
    {
        super(context1);
        isDefault = false;
        checked = false;
        labelText = "";
        customLabelText = "";
        initView(context1);
    }

    private void initView(Context context1)
    {
        context = context1;
        context1 = LayoutInflater.from(context1).inflate(0x7f0300dc, this, true);
        setClickable(true);
        ButterKnife.a(this, context1);
    }

    public ChangeChargeAccountLabelListItemView setCheckbox()
    {
        ImageView imageview = changeCreditCardLableCheckbox;
        int i;
        if (checked)
        {
            i = 0x7f020019;
        } else
        {
            i = 0x7f020018;
        }
        imageview.setImageResource(i);
        return this;
    }

    public ChangeChargeAccountLabelListItemView setChecked(Boolean boolean1)
    {
        checked = boolean1.booleanValue();
        setCheckbox();
        return this;
    }

    public ChangeChargeAccountLabelListItemView setCustomLabelText(String s)
    {
        customLabelText = s;
        changeCreditCardCustomLabelTextView.setText(s);
        changeCreditCardCustomLabelTextView.setVisibility(0);
        return this;
    }

    public ChangeChargeAccountLabelListItemView setLabelText(String s)
    {
        labelText = s;
        changeChargeAccountLabelTextView.setText(s);
        return this;
    }
}
