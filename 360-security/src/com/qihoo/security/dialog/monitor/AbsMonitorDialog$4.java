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
        AbsMonitorDialog.a(a, true);
        AbsMonitorDialog.f(a);
        if (AbsMonitorDialog.g(a) != null && AbsMonitorDialog.h(a) != null)
        {
            b.a(14312, (new StringBuilder()).append(AbsMonitorDialog.g(a).size()).append("").toString(), (new StringBuilder()).append(AbsMonitorDialog.h(a).size()).append("").toString());
            return;
        } else
        {
            b.b(14312);
            return;
        }
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
