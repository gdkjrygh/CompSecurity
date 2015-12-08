// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEditEmailView

class this._cls0
    implements TextWatcher
{

    final WorkPerksEditEmailView this$0;

    public void afterTextChanged(Editable editable)
    {
        WorkPerksEditEmailView.access$100(WorkPerksEditEmailView.this);
        if (emailEditText.getEditableText().toString().equals(WorkPerksEditEmailView.access$200(WorkPerksEditEmailView.this)))
        {
            WorkPerksEditEmailView.access$300(WorkPerksEditEmailView.this, Boolean.valueOf(false));
            handleEmailError(getResources().getString(0x7f07039c));
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        WorkPerksEditEmailView.access$100(WorkPerksEditEmailView.this);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        inlineErrorTxt.setVisibility(8);
        emailEditText.setTextAppearance(getContext(), 0x7f09008b);
        emailEditText.setCompoundDrawablesWithIntrinsicBounds(0x7f020150, 0, 0, 0);
        emailEditText.setBackgroundResource(0x7f0201d8);
        WorkPerksEditEmailView.access$100(WorkPerksEditEmailView.this);
    }

    ()
    {
        this$0 = WorkPerksEditEmailView.this;
        super();
    }
}
