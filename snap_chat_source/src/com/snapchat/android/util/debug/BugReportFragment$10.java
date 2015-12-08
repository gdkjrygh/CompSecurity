// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import Jo;
import S;
import V;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment, BugReportRemoteLogListFragment

final class tFragment
    implements android.view.gReportFragment._cls10
{

    final BugReportFragment this$0;
    final int val$containerId = 0x7f0d009d;

    public final void onClick(View view)
    {
        if (BugReportFragment.m(BugReportFragment.this) == null)
        {
            try
            {
                Jo.a(BugReportFragment.d(BugReportFragment.this), view);
                getActivity().mFragments.a().a(val$containerId, new BugReportRemoteLogListFragment()).a("BugReportRemoteLogListFragment").a();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                Timber.a("BugReportFragment", view);
            }
            return;
        } else
        {
            BugReportFragment.n(BugReportFragment.this);
            BugReportFragment.o(BugReportFragment.this).setText("Remote Log");
            return;
        }
    }


// JavaClassFileOutputException: Invalid index accessing method local variables table of <init>
}
