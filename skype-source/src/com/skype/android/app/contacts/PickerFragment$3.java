// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

final class this._cls0
    implements TextWatcher
{

    final PickerFragment this$0;

    public final void afterTextChanged(Editable editable)
    {
        editable = editable.toString();
        filter(editable);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
