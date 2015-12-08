// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements TextWatcher
{

    final BugReportFragment this$0;

    public final void afterTextChanged(Editable editable)
    {
        if (editable.length() > 2 && !BugReportFragment.k(BugReportFragment.this))
        {
            BugReportFragment.d(BugReportFragment.this, true);
            BugReportFragment.l(BugReportFragment.this).setEnabled(true);
        } else
        if (editable.length() <= 2 && BugReportFragment.k(BugReportFragment.this))
        {
            BugReportFragment.d(BugReportFragment.this, false);
            BugReportFragment.l(BugReportFragment.this).setEnabled(false);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    _cls9()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
