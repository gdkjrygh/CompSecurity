// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import java.util.Locale;

// Referenced classes of package com.facebook.loom.logger:
//            NativeRingBuffer, LogEntry

class nativeInit
    implements Cloneable
{

    private final NativeRingBuffer mBuffer;
    private final long mBufferPtr;
    private long mNativeCursor;

    private native void nativeInit();

    public Object clone()
    {
        nativeInit nativeinit = new <init>(mBuffer);
        nativeinit.mNativeCursor = mNativeCursor;
        return nativeinit;
    }

    native void resetToTail(double d);

    public String toString()
    {
        return String.format(Locale.US, "{Cursor: mBufferPtr = 0x%x, mNativeCursor = 0x%x}", new Object[] {
            Long.valueOf(mBufferPtr), Long.valueOf(mNativeCursor)
        });
    }

    native boolean tryReadBackward(LogEntry logentry);

    native boolean tryReadForward(LogEntry logentry);

    native boolean waitAndTryReadForward(LogEntry logentry);

    (NativeRingBuffer nativeringbuffer)
    {
        mBuffer = nativeringbuffer;
        mBufferPtr = NativeRingBuffer.a(mBuffer);
        nativeInit();
    }
}
