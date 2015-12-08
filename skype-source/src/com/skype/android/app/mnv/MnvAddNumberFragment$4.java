// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.Editable;
import com.skype.android.widget.AccessibleAutoCompleteTextView;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAddNumberFragment

final class this._cls0
    implements Runnable
{

    final MnvAddNumberFragment this$0;

    public final void run()
    {
        phoneEdit.setSelection(phoneEdit.getText().length());
    }

    xtView()
    {
        this$0 = MnvAddNumberFragment.this;
        super();
    }
}
