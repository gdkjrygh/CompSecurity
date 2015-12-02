// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.view.View;
import com.qihoo.security.support.b;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements android.view.r
{

    final AbsMonitorDialog a;

    public void onClick(View view)
    {
        a.finish();
        if (AbsMonitorDialog.h(a) != null)
        {
            b.a(14313, AbsMonitorDialog.h(a).size());
            return;
        } else
        {
            b.b(14313);
            return;
        }
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
