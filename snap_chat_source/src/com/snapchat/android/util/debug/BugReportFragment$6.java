// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements android.widget.ionListener
{

    final BugReportFragment this$0;

    public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        textview = BugReportFragment.i(BugReportFragment.this).getText();
        int j = textview.toString().split("\n").length;
        if (i == 5 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            keyevent = (new StringBuilder("\n")).append(j + 1).append(". ").toString();
            BugReportFragment.i(BugReportFragment.this).setText((new StringBuilder()).append(textview).append(keyevent).toString());
            BugReportFragment.i(BugReportFragment.this).setSelection(textview.length() + keyevent.length());
            return true;
        } else
        {
            return false;
        }
    }

    _cls9()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
