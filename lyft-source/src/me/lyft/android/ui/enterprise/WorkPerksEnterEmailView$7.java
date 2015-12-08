// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.content.Context;
import android.widget.TextView;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.SimpleTextWatcher;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksEnterEmailView

class this._cls0 extends SimpleTextWatcher
{

    final WorkPerksEnterEmailView this$0;

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        inlineErrorTxt.setVisibility(8);
        emailEditText.setTextAppearance(getContext().getApplicationContext(), 0x7f09008b);
        emailEditText.setBackgroundResource(0x7f0201d8);
    }

    ()
    {
        this$0 = WorkPerksEnterEmailView.this;
        super();
    }
}
