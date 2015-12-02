// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.view.View;
import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a
    implements android.view.ProcessClearActivity._cls3
{

    final ProcessClearActivity a;

    public void onClick(View view)
    {
        if (ProcessClearActivity.a(a) == null)
        {
            return;
        }
        if (com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a))
        {
            a.dismissDialog(1);
            return;
        }
        ProcessClearActivity.a(a, true);
        view = ProcessClearActivity.a(a).b(ProcessClearActivity.c(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a));
        if (view != null)
        {
            b.c(11023);
            String s = ((a) (view)).a;
            a.c(s);
            ProcessClearActivity.a(a).b(ProcessClearActivity.e(a), com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.d(a), view);
            int i = ProcessClearActivity.f(a);
            if (((a) (view)).c)
            {
                ProcessClearActivity.c(a, ProcessClearActivity.f(a) - ((a) (view)).d);
            }
            ProcessClearActivity.a(a, false, ProcessClearActivity.f(a), i);
            q.a().a(a.o.a(0x7f0c00ba, new Object[] {
                Integer.valueOf(1)
            }));
        }
        a.dismissDialog(1);
    }

    (ProcessClearActivity processclearactivity)
    {
        a = processclearactivity;
        super();
    }
}
