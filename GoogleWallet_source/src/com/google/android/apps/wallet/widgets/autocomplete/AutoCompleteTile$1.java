// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.autocomplete;

import android.text.Editable;
import android.widget.Filter;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

// Referenced classes of package com.google.android.apps.wallet.widgets.autocomplete:
//            AutoCompleteTile

final class this._cls0 extends DefaultTextWatcher
{

    final AutoCompleteTile this$0;

    public final void afterTextChanged(Editable editable)
    {
        if (AutoCompleteTile.access$000(AutoCompleteTile.this) != null)
        {
            AutoCompleteTile.access$000(AutoCompleteTile.this).filter(editable);
        }
    }

    ()
    {
        this$0 = AutoCompleteTile.this;
        super();
    }
}
