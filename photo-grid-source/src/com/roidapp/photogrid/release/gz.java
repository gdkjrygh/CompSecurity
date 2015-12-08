// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.c.an;
import java.io.File;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.release:
//            ge, PhotoGridActivity, gv

final class gz extends Handler
{

    private WeakReference a;

    private gz(ge ge1)
    {
        a = new WeakReference(ge1);
    }

    gz(ge ge1, byte byte0)
    {
        this(ge1);
    }

    public final void handleMessage(Message message)
    {
        Object obj;
        ge ge1;
        obj = null;
        if (a == null)
        {
            return;
        }
        ge1 = (ge)a.get();
        if (ge1 == null || ge.p(ge1))
        {
            a = null;
            return;
        }
        message.what;
        JVM INSTR tableswitch 1 8: default 88
    //                   1 94
    //                   2 105
    //                   3 119
    //                   4 133
    //                   5 191
    //                   6 162
    //                   7 220
    //                   8 264;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        super.handleMessage(message);
        return;
_L2:
        ge.b(ge1, message.arg1);
        continue; /* Loop/switch isn't completed */
_L3:
        ge.a(ge1, (File)message.obj);
        continue; /* Loop/switch isn't completed */
_L4:
        ge.b(ge1, (File)message.obj);
        continue; /* Loop/switch isn't completed */
_L5:
        an.a(new WeakReference(ge.f(ge1)), ge.f(ge1).getResources().getString(0x7f07004e));
        continue; /* Loop/switch isn't completed */
_L7:
        an.a(new WeakReference(ge.f(ge1)), ge.f(ge1).getResources().getString(0x7f070171));
        continue; /* Loop/switch isn't completed */
_L6:
        an.a(new WeakReference(ge.f(ge1)), ge.f(ge1).getResources().getString(0x7f07028e));
        continue; /* Loop/switch isn't completed */
_L8:
        if (ge.f(ge1) != null && !ge.f(ge1).isFinishing())
        {
            obj = ge.f(ge1).getResources().getString(0x7f070170);
        } else
        {
            obj = "";
        }
        ge.c(ge1, ((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L9:
        if (message.arg1 == 1 || message.arg2 == 1)
        {
            if (ge.q(ge1) != null)
            {
                obj = (gv)ge.q(ge1).get();
            }
            if (obj == null || obj == message.obj)
            {
                ge.r(ge1);
            }
        }
        if (true) goto _L1; else goto _L10
_L10:
    }
}
