// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import IO;
import LF;
import PG;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements android.view.
{

    final BugReportFragment this$0;

    public final void onClick(View view)
    {
        if (BugReportFragment.q(BugReportFragment.this) == null)
        {
            BugReportFragment.p(BugReportFragment.this).show();
            return;
        }
        File file;
        File afile[];
        Object obj;
        if (BugReportFragment.b(BugReportFragment.this))
        {
            view = BugReportFragment.c(BugReportFragment.this).getText().toString();
        } else
        {
            view = "null";
        }
        obj = new StringBuilder(BugReportFragment.i(BugReportFragment.this).getText().toString());
        if (BugReportFragment.g(BugReportFragment.this) && !TextUtils.isEmpty(BugReportFragment.r(BugReportFragment.this)))
        {
            file = BugReportFragment.d(BugReportFragment.this).getFileStreamPath(BugReportFragment.r(BugReportFragment.this));
        } else
        {
            file = null;
        }
        afile = new File[BugReportFragment.s(BugReportFragment.this).length];
        for (int i = 0; i < afile.length; i++)
        {
            afile[i] = BugReportFragment.d(BugReportFragment.this).getFileStreamPath(BugReportFragment.s(BugReportFragment.this)[i]);
        }

        LF lf = new LF();
        String s = BugReportFragment.a(BugReportFragment.d(BugReportFragment.this));
        String s1 = BugReportFragment.t(BugReportFragment.this).getText().toString();
        obj = ((StringBuilder) (obj)).toString();
        String s2 = BugReportFragment.m(BugReportFragment.this);
        String s3 = BugReportFragment.q(BugReportFragment.this);
        PG.a(IO.SERIAL_EXECUTOR_FOR_DEBUGGING, new OR_DEBUGGING(lf, view, s3, s, s1, ((String) (obj)), file, afile, s2));
        BugReportFragment.d(BugReportFragment.this).finish();
    }

    _cls9()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
