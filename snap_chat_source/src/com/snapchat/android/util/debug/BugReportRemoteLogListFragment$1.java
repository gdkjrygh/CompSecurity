// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import S;
import V;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportRemoteLogListFragment

final class this._cls0
    implements android.widget.ogListFragment._cls1
{

    final BugReportRemoteLogListFragment this$0;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getItemAtPosition(i).toString().length() == 1)
        {
            return;
        }
        if (getActivity() instanceof tActivity)
        {
            adapterview = adapterview.getItemAtPosition(i).toString();
            ((tActivity)getActivity()).b(adapterview);
        }
        getActivity().mFragments.a().a(BugReportRemoteLogListFragment.this).a("Chosen remote recipient").a();
    }

    ()
    {
        this$0 = BugReportRemoteLogListFragment.this;
        super();
    }
}
