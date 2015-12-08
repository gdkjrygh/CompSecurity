// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.content.DialogInterface;
import android.widget.Button;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements android.content.ickListener
{

    final BugReportFragment this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        BugReportFragment.a(BugReportFragment.this, BugReportFragment.h()[i].toString());
        BugReportFragment.u(BugReportFragment.this).setText(BugReportFragment.h()[i]);
    }

    _cls9()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
