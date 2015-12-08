// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.text.clearable;

import android.text.Editable;
import android.widget.ImageButton;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

// Referenced classes of package com.google.android.apps.wallet.widgets.text.clearable:
//            ClearableEditText

final class this._cls0 extends DefaultTextWatcher
{

    final ClearableEditText this$0;

    public final void afterTextChanged(Editable editable)
    {
        ImageButton imagebutton = ClearableEditText.access$000(ClearableEditText.this);
        int i;
        if (editable.length() > 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imagebutton.setVisibility(i);
    }

    ()
    {
        this$0 = ClearableEditText.this;
        super();
    }
}
