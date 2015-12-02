// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.view.View;
import android.widget.AdapterView;
import com.qihoo.security.malware.vo.MaliciousInfo;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements android.widget.lickListener
{

    final AbsMonitorDialog a;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (MaliciousInfo)AbsMonitorDialog.e(a).getItem(i);
        AbsMonitorDialog.a(a, adapterview);
    }

    (AbsMonitorDialog absmonitordialog)
    {
        a = absmonitordialog;
        super();
    }
}
