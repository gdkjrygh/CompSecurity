// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

// Referenced classes of package com.dominos.activities:
//            AddCreditCardActivity

class this._cls1
    implements android.widget.Listener
{

    final urityCodeEditText this$1;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        mSecurityCodeEditText.requestFocus();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
