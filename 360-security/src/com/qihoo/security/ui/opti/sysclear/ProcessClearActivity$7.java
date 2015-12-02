// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.opti.sysclear;

import android.os.Handler;
import android.os.RemoteException;
import com.qihoo360.mobilesafe.core.c.b;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.opti.sysclear:
//            ProcessClearActivity

class a extends b
{

    final ProcessClearActivity a;

    public void a(int i, int j)
        throws RemoteException
    {
    }

    public void a(List list, boolean flag)
        throws RemoteException
    {
        super.a(list, flag);
        a.y.post(new Runnable(list) {

            final List a;
            final ProcessClearActivity._cls7 b;

            public void run()
            {
                if (!b.a.isFinishing())
                {
                    b.a.a(a);
                }
            }

            
            {
                b = ProcessClearActivity._cls7.this;
                a = list;
                super();
            }
        });
    }

    public void b()
        throws RemoteException
    {
        if (ProcessClearActivity.l(a))
        {
            com.qihoo.security.ui.opti.sysclear.ProcessClearActivity.b(a, false);
        } else
        {
            ProcessClearActivity.c(a, true);
            if (!a.isFinishing())
            {
                a.finish();
                return;
            }
        }
    }

    _cls1.a(ProcessClearActivity processclearactivity)
    {
        a = processclearactivity;
        super();
    }
}
