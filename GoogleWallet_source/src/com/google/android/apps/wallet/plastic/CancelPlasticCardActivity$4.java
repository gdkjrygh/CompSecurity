// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            CancelPlasticCardActivity

final class val.otherExplanation
    implements android.widget.stener
{

    final CancelPlasticCardActivity this$0;
    final EditText val$otherExplanation;
    final ValidatedSpinner val$spinner;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (((ason)val$spinner.getValue()).toString().equals(getString(com.google.android.apps.walletnfcrel.reason_other)))
        {
            val$otherExplanation.setVisibility(0);
            val$otherExplanation.requestFocus();
            return;
        } else
        {
            val$otherExplanation.setVisibility(8);
            Views.hideSoftKeyboard(CancelPlasticCardActivity.this, getCurrentFocus());
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        val$otherExplanation.setVisibility(8);
    }

    ason()
    {
        this$0 = final_cancelplasticcardactivity;
        val$spinner = validatedspinner;
        val$otherExplanation = EditText.this;
        super();
    }
}
