// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.pinterest.ui.atmention:
//            AtMentionEditTextView

class this._cls0
    implements TextWatcher
{

    final AtMentionEditTextView this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (enoughToFilter())
        {
            i = AtMentionEditTextView.access$100(AtMentionEditTextView.this).findTokenStart(charsequence, getSelectionStart());
            j = AtMentionEditTextView.access$100(AtMentionEditTextView.this).findTokenEnd(charsequence, getSelectionStart());
            AtMentionEditTextView.access$200(AtMentionEditTextView.this, String.valueOf(charsequence.subSequence(i, j)));
        }
    }

    MentionTokenizer()
    {
        this$0 = AtMentionEditTextView.this;
        super();
    }
}
