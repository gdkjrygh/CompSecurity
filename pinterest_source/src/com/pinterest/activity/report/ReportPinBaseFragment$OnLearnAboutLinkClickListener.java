// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import android.view.View;
import com.pinterest.activity.ActivityHelper;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment

public class _link
    implements android.view.inkClickListener
{

    String _link;
    final ReportPinBaseFragment this$0;

    public void onClick(View view)
    {
        ActivityHelper.goIntentView(getActivity(), _link);
    }

    public (String s)
    {
        this$0 = ReportPinBaseFragment.this;
        super();
        _link = s;
    }
}
