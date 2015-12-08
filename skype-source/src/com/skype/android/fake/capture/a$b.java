// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture;

import com.skype.android.fake.capture.impl.PreviewRenderer;
import com.skype.android.util.Log;
import com.skype.android.util.Systrace;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.skype.android.fake.capture:
//            a

private static final class e
    implements com.skype.android.fake.capture.impl.eProducer.Callback
{

    private final a a;
    private final le b;
    private final Deque c;
    private final PreviewRenderer d;
    private final AtomicReference e;

    public final void a()
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        Systrace.begin(com.skype.android.util.race.Section.k);
        com.skype.android.fake.capture.a.e(a);
        Systrace.end();
        return;
        Exception exception;
        exception;
        Systrace.end();
        throw exception;
    }

    public final void a(byte abyte0[])
    {
        if (b != null)
        {
            b.sendMessage(b.obtainMessage(0, abyte0));
        }
    }

    public final byte[] a(int i, long l)
    {
        if (e.get() == null)
        {
            return null;
        }
        Deque deque = c;
        deque;
        JVM INSTR monitorenter ;
        boolean flag = c.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c.wait(l);
        Object obj;
        obj = (byte[])c.pop();
        if (obj.length < i)
        {
            throw new RuntimeException((new StringBuilder("Insuficient buffer size: ")).append(obj.length).append(" instead of ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_135;
        obj;
        deque;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        if (Log.isLoggable("Capture", 5))
        {
            Log.w("Capture", "Interrupted", ((Throwable) (obj)));
        }
        deque;
        JVM INSTR monitorexit ;
        return null;
        deque;
        JVM INSTR monitorexit ;
        return ((byte []) (obj));
    }

    public eference(a a1)
    {
        a = a1;
        b = com.skype.android.fake.capture.a.a(a1);
        c = com.skype.android.fake.capture.a.b(a1);
        d = com.skype.android.fake.capture.a.c(a1);
        e = com.skype.android.fake.capture.a.d(a1);
    }
}
