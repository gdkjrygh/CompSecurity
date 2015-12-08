// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements android.view.stener
{

    final BugReportFragment this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            BugReportFragment.i(BugReportFragment.this).setSelection(BugReportFragment.i(BugReportFragment.this).getText().length());
        }
    }

    _cls9()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
