// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.utils.Systrace;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import com.microsoft.dl.video.capture.impl.virtual.impl.PreviewRenderer;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual:
//            VirtualCameraImpl

private static class e
    implements com.microsoft.dl.video.capture.impl.virtual.impl.a
{

    private final VirtualCameraImpl a;
    private final e b;
    private final Deque c;
    private final PreviewRenderer d;
    private final AtomicReference e;

    public byte[] getBuffer(int i, long l)
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

    public void onFrameCaptured(ByteBuffer bytebuffer, ImageFormat imageformat, Resolution resolution)
    {
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Systrace.begin(com.microsoft.dl.utils.oFrameSourceCallback.d);
        d.drawFrame(bytebuffer, imageformat, resolution, VirtualCameraImpl.e(a));
        Systrace.end();
        return;
        bytebuffer;
        Systrace.end();
        throw bytebuffer;
    }

    public void onFrameReady(byte abyte0[])
    {
        b.b(b.e(0, abyte0));
    }

    public (VirtualCameraImpl virtualcameraimpl)
    {
        a = virtualcameraimpl;
        b = VirtualCameraImpl.a(virtualcameraimpl);
        c = VirtualCameraImpl.b(virtualcameraimpl);
        d = VirtualCameraImpl.c(virtualcameraimpl);
        e = VirtualCameraImpl.d(virtualcameraimpl);
    }
}
