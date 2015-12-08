// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.capitalone.mobile.banking.security;

import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.capitalone.mobile.banking.security:
//            ExpressSignInIntroActivity

class val.introHeaderTextView extends ClickableSpan
{

    final ExpressSignInIntroActivity this$0;
    final TextView val$introHeaderTextView;

    public void onClick(View view)
    {
        view = getString(0x7f0900cc);
        val$introHeaderTextView.setText(val$introHeaderTextView.getText().subSequence(0, val$introHeaderTextView.getText().length() - 7));
        val$introHeaderTextView.append(view);
    }

    I()
    {
        this$0 = final_expresssigninintroactivity;
        val$introHeaderTextView = TextView.this;
        super();
    }
}
