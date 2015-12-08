// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.fragment;

import android.view.View;
import com.pinterest.activity.report.ReportHelper;

// Referenced classes of package com.pinterest.activity.library.fragment:
//            LibraryFragment

class this._cls0
    implements android.view.er
{

    final LibraryFragment this$0;

    public void onClick(View view)
    {
        if (LibraryFragment.access$300(LibraryFragment.this) != null)
        {
            if ((view = getActivity()) != null)
            {
                ReportHelper.showBlockDialog(view, LibraryFragment.access$300(LibraryFragment.this));
                return;
            }
        }
    }

    ()
    {
        this$0 = LibraryFragment.this;
        super();
    }
}
