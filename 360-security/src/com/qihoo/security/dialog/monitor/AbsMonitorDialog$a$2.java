// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog.monitor;

import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.malware.db.c;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.q;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.dialog.monitor:
//            AbsMonitorDialog

class a
    implements android.view.AbsMonitorDialog.a._cls2
{

    final MaliciousInfo a;
    final b b;

    public void onClick(View view)
    {
        view = new ArrayList();
        view.add(a);
        c.a(AbsMonitorDialog.n(b.b), view);
        q.a().a(AbsMonitorDialog.p(b.b).a(0x7f0c0120, new Object[] {
            com.qihoo360.mobilesafe.b.a.a(AbsMonitorDialog.o(b.b), a.packageName, a.filePath, a.isInstalled)
        }));
        AbsMonitorDialog.j(b.b).remove(a);
        b.tifyDataSetChanged();
        AbsMonitorDialog.b(b.b);
    }

    ( , MaliciousInfo maliciousinfo)
    {
        b = ;
        a = maliciousinfo;
        super();
    }
}
