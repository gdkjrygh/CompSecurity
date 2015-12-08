// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IExpenseNoteSession;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.passenger.PassengerRideExpense;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.rx.Binder;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSubmitRatingButton

public class PassengerRideExpenseNoteView extends LinearLayout
{

    private Binder binder;
    ICheckoutSession checkoutSession;
    EditText expenseCodeText;
    LinearLayout expenseCodeView;
    IExpenseNoteSession expenseNoteSession;
    EditText expenseNoteText;
    TextView expenseNoteTextView;
    IPassengerRideProvider passengerRideProvider;
    PassengerSubmitRatingButton submitDriverRatingButton;
    Toolbar toolbar;

    public PassengerRideExpenseNoteView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private void initView()
    {
        byte byte0 = 8;
        final boolean concurEnabled = expenseNoteSession.isConcurEnabled();
        Object obj = expenseCodeView;
        Toolbar toolbar1;
        int i;
        if (concurEnabled)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i);
        obj = expenseNoteText;
        if (concurEnabled)
        {
            i = 5;
        } else
        {
            i = 6;
        }
        ((EditText) (obj)).setImeOptions(i);
        toolbar1 = toolbar;
        if (concurEnabled)
        {
            obj = getResources().getString(0x7f07024d);
        } else
        {
            obj = getResources().getString(0x7f070171);
        }
        toolbar1.setTitle(((String) (obj)));
        obj = expenseNoteTextView;
        if (concurEnabled)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        expenseNoteTextView.setText(String.format(getContext().getString(0x7f07016e), new Object[] {
            checkoutSession.getSelectedOrDefaultChargeAccount().getLabel()
        }));
        binder.bind(submitDriverRatingButton.observeOnSubmitPressed(), new Action1() {

            final PassengerRideExpenseNoteView this$0;
            final boolean val$concurEnabled;

            public volatile void call(Object obj1)
            {
                call((Unit)obj1);
            }

            public void call(Unit unit)
            {
                persistExpenseNoteData();
                submitDriverRatingButton.submitRating(new PassengerRideExpense(concurEnabled, expenseNoteText.getText().toString(), expenseCodeText.getText().toString()));
            }

            
            {
                this$0 = PassengerRideExpenseNoteView.this;
                concurEnabled = flag;
                super();
            }
        });
        restoreExpenseNoteData();
    }

    private boolean isSameRide()
    {
        return expenseNoteSession.getRideId().equals(passengerRideProvider.getPassengerRide().getId());
    }

    private void persistExpenseNoteData()
    {
        expenseNoteSession.setRideId(passengerRideProvider.getPassengerRide().getId());
        expenseNoteSession.setExpenseNote(expenseNoteText.getText().toString());
        expenseNoteSession.setExpenseCode(expenseCodeText.getText().toString());
    }

    private void restoreExpenseNoteData()
    {
        if (isSameRide())
        {
            expenseNoteText.setText(expenseNoteSession.getExpenseNote());
            expenseCodeText.setText(expenseNoteSession.getExpenseCode());
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        binder = Binder.attach(this);
        initView();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        persistExpenseNoteData();
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
