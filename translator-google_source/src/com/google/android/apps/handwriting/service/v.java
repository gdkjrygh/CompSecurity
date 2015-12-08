// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.TreeMap;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            w, r, HandwritingRecognizer

final class v extends Handler
{

    private final r a;

    v(r r1, Looper looper)
    {
        super(looper);
        a = r1;
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            message = (w)message.obj;
            r r1 = a;
            com.google.android.libraries.handwriting.base.StrokeList strokelist = ((w) (message)).b;
            int i = r1.e.a(strokelist);
            synchronized (a.d)
            {
                a.d.put(Integer.valueOf(((w) (message)).a), Integer.valueOf(i));
                a.d.notifyAll();
            }
            return;
        } else
        {
            super.handleMessage(message);
            return;
        }
        message;
        treemap;
        JVM INSTR monitorexit ;
        throw message;
    }
}
