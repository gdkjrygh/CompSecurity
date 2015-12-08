// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Intent;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import java.util.TreeMap;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            a, r, t

final class u
    implements a
{

    final r a;

    u(r r1)
    {
        a = r1;
        super();
    }

    public final void a(int i, int j)
    {
        (new StringBuilder(32)).append("onError: ").append(i).append(" ").append(j);
        synchronized (a.c)
        {
            a.c.put(Integer.valueOf(i), null);
            a.c.notifyAll();
        }
        return;
        exception;
        treemap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, Intent intent)
    {
        (new StringBuilder(35)).append("onInitializationFailed: ").append(i);
        if (a.f != null)
        {
            a.f.a(intent);
        }
    }

    public final void a(int i, RecognitionResult recognitionresult)
    {
        String s = String.valueOf(recognitionresult);
        (new StringBuilder(String.valueOf(s).length() + 42)).append("onRecognitionEnded requestId: ").append(i).append(" ").append(s);
        synchronized (a.c)
        {
            a.c.put(Integer.valueOf(i), recognitionresult);
            a.c.notifyAll();
        }
        return;
        recognitionresult;
        treemap;
        JVM INSTR monitorexit ;
        throw recognitionresult;
    }
}
