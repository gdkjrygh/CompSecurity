// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.g;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.baselib.g:
//            a, b

final class c extends Handler
{

    private final WeakReference a;

    private c(a a1)
    {
        a = new WeakReference(a1);
    }

    c(a a1, byte byte0)
    {
        this(a1);
    }

    public final void handleMessage(Message message)
    {
        a a1;
        if (a != null)
        {
            a1 = (a)a.get();
        } else
        {
            a1 = null;
        }
        if (a1 != null && !a1.isAdded()) goto _L2; else goto _L1
_L1:
        message.what;
        JVM INSTR tableswitch 52161 52163: default 60
    //                   52161 66
    //                   52162 94
    //                   52163 99;
           goto _L2 _L3 _L4 _L5
_L2:
        return;
_L3:
        a1.dismiss();
        if (com.roidapp.baselib.g.a.a(a1) != null)
        {
            com.roidapp.baselib.g.a.a(a1).a((String)message.obj);
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        com.roidapp.baselib.g.a.b(a1);
        return;
_L5:
        if (com.roidapp.baselib.g.a.c(a1) != null)
        {
            com.roidapp.baselib.g.a.c(a1).setProgress(message.arg1);
        }
        if (com.roidapp.baselib.g.a.d(a1) != null)
        {
            com.roidapp.baselib.g.a.d(a1).setText((new StringBuilder()).append(message.arg1).append("%").toString());
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }
}
