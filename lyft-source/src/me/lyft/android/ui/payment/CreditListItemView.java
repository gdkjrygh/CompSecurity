// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class CreditListItemView extends LinearLayout
{

    private Context context;
    TextView creditListItemText;

    public CreditListItemView(Context context1)
    {
        super(context1);
        initView(context1);
    }

    private void initView(Context context1)
    {
        context = context1;
        ButterKnife.a(this, LayoutInflater.from(context1).inflate(0x7f030048, this, true));
    }

    public CreditListItemView setCreditListItemText(String s)
    {
        creditListItemText.setText(s);
        return this;
    }
}
