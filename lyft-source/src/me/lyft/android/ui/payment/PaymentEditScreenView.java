// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toolbar;

public class PaymentEditScreenView extends LinearLayout
    implements IHandleBack
{

    public static final String DONE_TOOLBAR_ITEM = "DONE";
    AppFlow appFlow;
    final PaymentScreens.PaymentEditScreen params;
    Toolbar toolbar;

    public PaymentEditScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (PaymentScreens.PaymentEditScreen)context.a();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        TextView textview = (TextView)ButterKnife.a(toolbar.getToolbarItemView(0x7f0d0012), 0x7f0d0061);
        textview.setTypeface(null, 1);
        textview.setTextColor(getResources().getColor(0x7f0c0025));
    }

    public boolean onBack()
    {
        appFlow.goTo(new PaymentScreens.PaymentSelectScreen());
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f070242)).hideHomeIcon().clearItems().addItem(0x7f0d0012, "DONE");
    }
}
