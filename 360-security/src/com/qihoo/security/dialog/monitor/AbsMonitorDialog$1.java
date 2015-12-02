// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import com.qihoo.security.dialog.g;
import com.qihoo.security.locale.d;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo360.common.utils.Utils;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements com.qihoo.security.malware.a.og._cls1
{

    final AbsMonitorDialog a;

    public void a()
    {
        Utils.dismissDialog(AbsMonitorDialog.a(a));
        AbsMonitorDialog.b(a);
        if (AbsMonitorDialog.c(a))
        {
            a.finish();
        }
    }

    public void a(MaliciousInfo maliciousinfo, int i, int j)
    {
        if (AbsMonitorDialog.a(a) != null)
        {
            if (!AbsMonitorDialog.a(a).isShowing())
            {
                AbsMonitorDialog.a(a).show();
            }
            AbsMonitorDialog.a(a).a(d.a().a(0x7f0c00ed, new Object[] {
                maliciousinfo.getLabel(com.qihoo.security.dialog.monitor.AbsMonitorDialog.d(a)), Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
    }

    public void b()
    {
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
