// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.b;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            i

final class m extends Handler
{

    final i a;

    public m(i j, Looper looper)
    {
        a = j;
        super(looper);
    }

    static void a(m m1)
    {
        m1.removeMessages(1);
    }

    static void a(m m1, boolean flag)
    {
        int j = m1.a.a.a().i;
        (new StringBuilder(33)).append("scheduling with delay ").append(j);
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        m1.sendMessageDelayed(m1.obtainMessage(j), m1.a.a.a().i);
    }

    public final void handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 34
    //                   2 34;
           goto _L1 _L2 _L2
_L1:
        super.handleMessage(message);
_L4:
        return;
_L2:
        String s = String.valueOf(message);
        (new StringBuilder(String.valueOf(s).length() + 10)).append("starting: ").append(s);
        if (!a.e.isEmpty())
        {
            i j = a;
            int k = a.j;
            StrokeList strokelist = a.e;
            if (message.what != 1)
            {
                flag = false;
            }
            j.a(k, strokelist, flag);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
