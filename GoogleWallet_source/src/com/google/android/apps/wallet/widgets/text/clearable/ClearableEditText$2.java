// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.text.clearable;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.google.android.apps.wallet.widgets.text.clearable:
//            ClearableEditText

final class this._cls0
    implements android.view.
{

    final ClearableEditText this$0;

    public final void onClick(View view)
    {
        ClearableEditText.access$100(ClearableEditText.this).setText("");
        ClearableEditText.access$100(ClearableEditText.this).clearComposingText();
        ClearableEditText.access$100(ClearableEditText.this).requestFocus();
    }

    ()
    {
        this$0 = ClearableEditText.this;
        super();
    }
}
