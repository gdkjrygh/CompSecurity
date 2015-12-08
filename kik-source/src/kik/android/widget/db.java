// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kik.android.e.e;

// Referenced classes of package kik.android.widget:
//            ProgressWidget

final class db extends Handler
{

    final ProgressWidget a;

    db(ProgressWidget progresswidget)
    {
        a = progresswidget;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            removeMessages(1);
            if (ProgressWidget.a(a) != null)
            {
                message = (e)ProgressWidget.a(a).get();
                if (message != null)
                {
                    if (message.b() == 4)
                    {
                        ProgressWidget.b(a);
                        return;
                    }
                    if (message.b() == -1)
                    {
                        ProgressWidget.c(a);
                        return;
                    }
                    if (message.b() == 1)
                    {
                        ProgressWidget.d(a);
                        ProgressWidget.a(a, message.a());
                        return;
                    }
                    if (message.b() == 2)
                    {
                        kik.android.widget.ProgressWidget.e(a);
                        return;
                    }
                    ProgressWidget.f(a);
                    ProgressWidget.a(a, message.a());
                }
            }
            sendEmptyMessageDelayed(1, 1000L);
            return;

        case 2: // '\002'
            removeMessages(1);
            ProgressWidget.c(a);
            return;
        }
    }
}
