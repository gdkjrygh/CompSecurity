// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            VariantItemView

public class VariantItemRowView extends RelativeLayout
    implements VariantItemView
{

    PTextView priceTextView;
    PTextView titleTextView;

    public VariantItemRowView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301b7, this);
        ButterKnife.a(this);
    }

    public void setAvailable(boolean flag)
    {
        if (flag)
        {
            int i = Resources.color(0x7f0e0052);
            titleTextView.setTextColor(i);
            titleTextView.setPaintFlags(titleTextView.getPaintFlags() & 0xffffffef);
            priceTextView.setTextColor(i);
            return;
        } else
        {
            int j = Resources.color(0x7f0e0053);
            titleTextView.setTextColor(j);
            titleTextView.setPaintFlags(titleTextView.getPaintFlags() | 0x10);
            priceTextView.setTextColor(j);
            return;
        }
    }

    public void setPrice(String s)
    {
        priceTextView.setText(s);
    }

    public void setRowClickListener(android.view.View.OnClickListener onclicklistener)
    {
        setOnClickListener(onclicklistener);
    }

    public void setTitle(String s)
    {
        titleTextView.setText(s);
    }
}
