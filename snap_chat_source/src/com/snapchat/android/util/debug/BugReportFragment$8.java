// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import PG;
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
        if (i == 5 || keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
        {
            if (BugReportFragment.j(BugReportFragment.this))
            {
                BugReportFragment.i(BugReportFragment.this).requestFocus();
                return true;
            }
            BugReportFragment.c(BugReportFragment.this, true);
            (new Thread(new Runnable() {

                final BugReportFragment._cls8 this$1;

                public final void run()
                {
                    PG.a(300L);
                    BugReportFragment.c(this$0, false);
                }

            
            {
                this$1 = BugReportFragment._cls8.this;
                super();
            }
            })).start();
        }
        return false;
    }

    _cls1.this._cls1()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
