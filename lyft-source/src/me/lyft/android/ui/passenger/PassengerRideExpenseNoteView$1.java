// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.widget.EditText;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.passenger.PassengerRideExpense;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideExpenseNoteView, PassengerSubmitRatingButton

class val.concurEnabled
    implements Action1
{

    final PassengerRideExpenseNoteView this$0;
    final boolean val$concurEnabled;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        PassengerRideExpenseNoteView.access$000(PassengerRideExpenseNoteView.this);
        submitDriverRatingButton.submitRating(new PassengerRideExpense(val$concurEnabled, expenseNoteText.getText().toString(), expenseCodeText.getText().toString()));
    }

    A()
    {
        this$0 = final_passengerrideexpensenoteview;
        val$concurEnabled = Z.this;
        super();
    }
}
