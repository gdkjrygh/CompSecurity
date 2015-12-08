// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            VariantItemView

public class VariantItemCircleView extends FrameLayout
    implements VariantItemView
{

    TextView titleTextView;
    View variantCircleView;

    public VariantItemCircleView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301b4, this);
        ButterKnife.a(this);
    }

    public void setAvailable(boolean flag)
    {
        View view = variantCircleView;
        int i;
        if (flag)
        {
            i = 0x7f020295;
        } else
        {
            i = 0x7f020296;
        }
        view.setBackgroundResource(i);
    }

    public void setPrice(String s)
    {
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
