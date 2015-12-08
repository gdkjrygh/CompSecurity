// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.video:
//            q, aa, ac

final class r extends Handler
{

    final q a;

    r(q q1)
    {
        a = q1;
        super();
    }

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR lookupswitch 7: default 72
    //                   8193: 72
    //                   8194: 238
    //                   8195: 73
    //                   8196: 257
    //                   12289: 72
    //                   12290: 350
    //                   12291: 531;
           goto _L1 _L1 _L2 _L3 _L4 _L1 _L5 _L6
_L1:
        return;
_L3:
        q.a(a).remove(Integer.valueOf(message.arg1));
        q.b(a);
        if (!q.c(a))
        {
            q.a(a, aa.a);
            if (q.d(a) != null)
            {
                q.d(a).a(4097, 0);
                return;
            }
        } else
        {
            if (q.d(a) != null)
            {
                q.d(a).a(4096, 8194);
            }
            if (q.e(a).ordinal() < aa.c.ordinal() || q.e(a) == aa.f)
            {
                q.a(a, aa.c);
                if (q.d(a) != null)
                {
                    q.d(a).a();
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        q.a(a).remove(Integer.valueOf(message.arg1));
        return;
_L4:
        if (message.arg2 != 1)
        {
            flag = false;
        }
        if (q.c(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        q.a(a, aa.a);
        if (q.d(a) != null)
        {
            q.d(a).a(4097, 0);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (flag || q.d(a) == null) goto _L1; else goto _L7
_L7:
        q.d(a).a(4096, 8194);
        return;
_L5:
        q.a(a).remove(Integer.valueOf(message.arg1));
        if (q.e(a).ordinal() < aa.c.ordinal())
        {
            break; /* Loop/switch isn't completed */
        }
        if (q.d(a) != null)
        {
            q.d(a).a(message.arg1);
        }
_L9:
        if (q.f(a).size() >= q.g(a))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = q.h(a);
        while (i != -1 && !q.a(a, i)) 
        {
            i = q.h(a);
        }
        if (true) goto _L1; else goto _L8
_L8:
        q.a(a, aa.c);
        if (q.d(a) != null)
        {
            q.d(a).a();
        }
          goto _L9
        if (q.i(a) == null) goto _L1; else goto _L10
_L10:
        q.b(a);
        q.a(a, aa.e);
        return;
_L6:
        q.a(a).remove(Integer.valueOf(message.arg1));
        return;
    }
}
