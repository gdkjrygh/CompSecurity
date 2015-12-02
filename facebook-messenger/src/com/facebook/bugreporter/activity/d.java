// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.bugreporter.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.facebook.o;

// Referenced classes of package com.facebook.bugreporter.activity:
//            f, e, BugReportActivity, c

class d extends DialogFragment
{

    final BugReportActivity Z;

    private d(BugReportActivity bugreportactivity)
    {
        Z = bugreportactivity;
        super();
    }

    d(BugReportActivity bugreportactivity, c c1)
    {
        this(bugreportactivity);
    }

    public Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(n())).setTitle(o.bug_report_old_version_title).setMessage(o.bug_report_old_version_text).setPositiveButton(o.dialog_yes, new f(this)).setNegativeButton(o.dialog_no, new e(this)).create();
    }
}
