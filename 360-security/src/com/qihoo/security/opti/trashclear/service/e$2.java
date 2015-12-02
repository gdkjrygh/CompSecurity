// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.service;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.qihoo.security.opti.trashclear.service:
//            e, a, c

class a
    implements Runnable
{

    final String a;
    final e b;

    public void run()
    {
        e.a(b, new a(e.c(b)));
        if (e.a(b) != null)
        {
            if (e.d(b) == null)
            {
                e.a(b, new ArrayList());
            }
            e.d(b).add(e.a(b));
            e.a(b).a(a);
            e.a(b).a();
            if (e.a(b).b() != null)
            {
                android.os.Message message = e.e(b).obtainMessage(2);
                e.e(b).sendMessage(message);
                return;
            }
        }
    }

    (e e1, String s)
    {
        b = e1;
        a = s;
        super();
    }
}
