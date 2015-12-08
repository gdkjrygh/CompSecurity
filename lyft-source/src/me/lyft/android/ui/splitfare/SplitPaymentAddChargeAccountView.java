// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.payment.AddChargeAccountView;
import rx.functions.Action1;

public class SplitPaymentAddChargeAccountView extends FrameLayout
{

    AddChargeAccountView addChargeAccountView;
    AppFlow appFlow;
    Binder binder;
    ISplitFareRequestRepository splitFareRequestRepository;

    public SplitPaymentAddChargeAccountView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(addChargeAccountView.observeSaveSuccess(), new Action1() {

            final SplitPaymentAddChargeAccountView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (splitFareRequestRepository.hasPendingRequest())
                {
                    appFlow.resetTo(new SplitScreens.AcceptDeclineSplitFareScreen());
                }
            }

            
            {
                this$0 = SplitPaymentAddChargeAccountView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }
}
