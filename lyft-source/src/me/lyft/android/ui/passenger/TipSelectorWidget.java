// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.ride.TipOption;
import rx.Observable;
import rx.subjects.PublishSubject;

public class TipSelectorWidget extends FrameLayout
{

    private final PublishSubject customTipOptionClickSubject = PublishSubject.create();
    private final LayoutInflater inflater;
    RadioGroup tipAmountRadioGroup;
    private final List tipOptions = new ArrayList();
    private final PublishSubject tipSelectionSubject = PublishSubject.create();

    public TipSelectorWidget(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        inflater = Scoop.a(this).a(context);
        inflater.inflate(0x7f03013c, this, true);
    }

    private void createCustomTipOption()
    {
        RadioButton radiobutton = inflateRadioButton();
        radiobutton.setText(getResources().getString(0x7f070283));
        radiobutton.setOnClickListener(new android.view.View.OnClickListener() {

            final TipSelectorWidget this$0;

            public void onClick(View view)
            {
                customTipOptionClickSubject.onNext(Unit.create());
            }

            
            {
                this$0 = TipSelectorWidget.this;
                super();
            }
        });
        radiobutton.setId(0x7f0d0020);
        tipAmountRadioGroup.addView(radiobutton);
    }

    private void createTipOption(String s, final int amount)
    {
        RadioButton radiobutton = inflateRadioButton();
        radiobutton.setText(s);
        radiobutton.setOnClickListener(new android.view.View.OnClickListener() {

            final TipSelectorWidget this$0;
            final int val$amount;

            public void onClick(View view)
            {
                tipSelectionSubject.onNext(Integer.valueOf(amount));
            }

            
            {
                this$0 = TipSelectorWidget.this;
                amount = i;
                super();
            }
        });
        tipAmountRadioGroup.addView(radiobutton);
        tipOptions.add(new TipOptionViewModel(radiobutton.getId(), amount));
    }

    private TipOptionViewModel getModel(int i)
    {
        for (Iterator iterator = tipOptions.iterator(); iterator.hasNext();)
        {
            TipOptionViewModel tipoptionviewmodel = (TipOptionViewModel)iterator.next();
            if (tipoptionviewmodel.getTipAmount() == i)
            {
                return tipoptionviewmodel;
            }
        }

        return new TipOptionViewModel(0x7f0d0020, 0);
    }

    private RadioButton inflateRadioButton()
    {
        return (RadioButton)inflater.inflate(0x7f03013b, tipAmountRadioGroup, false);
    }

    public void createOptions(List list)
    {
        TipOption tipoption;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); createTipOption(tipoption.getTitle(), tipoption.getTipMoney().getAmount().intValue()))
        {
            tipoption = (TipOption)iterator.next();
        }

        if (!list.isEmpty())
        {
            createCustomTipOption();
        }
    }

    public Observable observeCustomTipClick()
    {
        return customTipOptionClickSubject.asObservable();
    }

    public Observable observeSelectionChange()
    {
        return tipSelectionSubject.asObservable();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void select(int i)
    {
        if (tipOptions.size() == 0)
        {
            return;
        } else
        {
            TipOptionViewModel tipoptionviewmodel = getModel(i);
            tipAmountRadioGroup.check(tipoptionviewmodel.getViewId());
            return;
        }
    }



    private class TipOptionViewModel
    {

        private final int tipAmount;
        private final int viewId;

        public int getTipAmount()
        {
            return tipAmount;
        }

        public int getViewId()
        {
            return viewId;
        }

        public TipOptionViewModel(int i, int j)
        {
            viewId = i;
            tipAmount = j;
        }
    }

}
