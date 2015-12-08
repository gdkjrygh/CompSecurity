// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toolbar;

public class PaymentSelectScreenView extends LinearLayout
    implements IHandleBack
{

    AppFlow appFlow;
    Toolbar toolbar;

    public PaymentSelectScreenView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    public boolean onBack()
    {
        appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
        return true;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.showTitle().setTitle(getContext().getString(0x7f070242)).clearItems().addItem(0x7f0d0013, 0x7f020104);
    }
}
