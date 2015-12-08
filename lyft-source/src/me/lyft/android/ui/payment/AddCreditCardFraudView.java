// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.common.AppFlow;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

public class AddCreditCardFraudView extends LinearLayout
{

    AppFlow appFlow;
    private Binder binder;
    ICardScanService cardScanService;
    private Action1 onCreditCardScanned;
    LinearLayout scanCardButton;
    Toolbar toolbar;

    public AddCreditCardFraudView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onCreditCardScanned = new Action1() {

            final AddCreditCardFraudView this$0;

            public volatile void call(Object obj)
            {
                call((ICard)obj);
            }

            public void call(ICard icard)
            {
                appFlow.replaceWith(new PaymentScreens.AddCreditCardScreen(icard.getNumber()));
            }

            
            {
                this$0 = AddCreditCardFraudView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        binder.bind(cardScanService.observeScannedCard(), onCreditCardScanned);
        toolbar.setTitle(getResources().getString(0x7f070243));
        scanCardButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AddCreditCardFraudView this$0;

            public void onClick(View view)
            {
                cardScanService.startCardScan();
            }

            
            {
                this$0 = AddCreditCardFraudView.this;
                super();
            }
        });
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }
}
