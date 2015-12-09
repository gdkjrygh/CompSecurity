// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.Spinner;

// Referenced classes of package com.dominos.activities:
//            AddCreditCardActivity

class this._cls0
    implements Runnable
{

    final AddCreditCardActivity this$0;

    public void run()
    {
        class _cls1
            implements android.widget.AdapterView.OnItemSelectedListener
        {

            final AddCreditCardActivity._cls1 this$1;

            public void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                mSecurityCodeEditText.requestFocus();
            }

            public void onNothingSelected(AdapterView adapterview)
            {
            }

            _cls1()
            {
                this$1 = AddCreditCardActivity._cls1.this;
                super();
            }
        }

        mYearSpinner.setOnItemSelectedListener(new _cls1());
    }

    _cls1()
    {
        this$0 = AddCreditCardActivity.this;
        super();
    }
}
