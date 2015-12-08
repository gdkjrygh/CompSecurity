// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideExpenseNoteView, PassengerSubmitRatingButton

public class 
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerRideExpenseNoteView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, PassengerRideExpenseNoteView passengerrideexpensenoteview, Object obj)
    {
        passengerrideexpensenoteview.expenseNoteTextView = (TextView)viewinjector.expenseNoteTextView((View)viewinjector.expenseNoteTextView(obj, 0x7f0d02f0, "field 'expenseNoteTextView'"), 0x7f0d02f0, "field 'expenseNoteTextView'");
        passengerrideexpensenoteview.expenseNoteText = (EditText)viewinjector.expenseNoteText((View)viewinjector.expenseNoteText(obj, 0x7f0d02ef, "field 'expenseNoteText'"), 0x7f0d02ef, "field 'expenseNoteText'");
        passengerrideexpensenoteview.expenseCodeView = (LinearLayout)viewinjector.expenseCodeView((View)viewinjector.expenseCodeView(obj, 0x7f0d02f1, "field 'expenseCodeView'"), 0x7f0d02f1, "field 'expenseCodeView'");
        passengerrideexpensenoteview.expenseCodeText = (EditText)viewinjector.expenseCodeText((View)viewinjector.expenseCodeText(obj, 0x7f0d02f2, "field 'expenseCodeText'"), 0x7f0d02f2, "field 'expenseCodeText'");
        passengerrideexpensenoteview.submitDriverRatingButton = (PassengerSubmitRatingButton)viewinjector.n((View)viewinjector.n(obj, 0x7f0d02c6, "field 'submitDriverRatingButton'"), 0x7f0d02c6, "field 'submitDriverRatingButton'");
        passengerrideexpensenoteview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerRideExpenseNoteView)obj);
    }

    public void reset(PassengerRideExpenseNoteView passengerrideexpensenoteview)
    {
        passengerrideexpensenoteview.expenseNoteTextView = null;
        passengerrideexpensenoteview.expenseNoteText = null;
        passengerrideexpensenoteview.expenseCodeView = null;
        passengerrideexpensenoteview.expenseCodeText = null;
        passengerrideexpensenoteview.submitDriverRatingButton = null;
        passengerrideexpensenoteview.toolbar = null;
    }

    public ()
    {
    }
}
