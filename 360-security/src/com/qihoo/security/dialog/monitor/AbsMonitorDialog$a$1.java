// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.view.View;
import com.qihoo.security.malware.vo.MaliciousInfo;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements android.view.AbsMonitorDialog.a._cls1
{

    final MaliciousInfo a;
    final a b;

    public void onClick(View view)
    {
        AbsMonitorDialog.a(b.b, a);
    }

    ( , MaliciousInfo maliciousinfo)
    {
        b = ;
        a = maliciousinfo;
        super();
    }
}
