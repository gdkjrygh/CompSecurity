// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.soundcloud.android.view:
//            ClearText

class val.x
    implements TextWatcher
{

    final ClearText this$0;
    final Drawable val$x;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        ClearText cleartext = ClearText.this;
        if (getText().toString().equals(""))
        {
            charsequence = ClearText.access$100(ClearText.this);
        } else
        {
            charsequence = val$x;
        }
        cleartext.setCompoundDrawables(null, null, charsequence, null);
    }

    ()
    {
        this$0 = final_cleartext;
        val$x = Drawable.this;
        super();
    }
}
