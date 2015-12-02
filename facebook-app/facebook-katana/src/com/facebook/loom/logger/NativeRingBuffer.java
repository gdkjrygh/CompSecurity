// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import com.facebook.soloader.SoLoader;

class NativeRingBuffer
{

    private long mPtr;

    public NativeRingBuffer(int i)
    {
        if (!nativeInit(i))
        {
            throw new IllegalStateException("Could not initialize native buffer");
        } else
        {
            return;
        }
    }

    static long a(NativeRingBuffer nativeringbuffer)
    {
        return nativeringbuffer.mPtr;
    }

    private native void nativeDeinit();

    private native boolean nativeInit(int i);

    private static native void nativeWrite(long l, int i, int j, int k, int i1, int j1, long l1, long l2);

    private static native void nativeWriteAndGetCursor(long l, Cursor cursor, int i, int j, int k, int i1, int j1, 
            long l1, long l2);

    final Cursor a()
    {
        return new Cursor();
    }

    final void a(int i, int j, int k, int l, int i1, long l1, 
            long l2)
    {
        nativeWrite(mPtr, i, j, k, l, i1, l1, l2);
    }

    final void a(Cursor cursor, int i, int j, int k, int l, int i1, long l1, long l2)
    {
        nativeWriteAndGetCursor(mPtr, cursor, i, j, k, l, i1, l1, l2);
    }

    protected void finalize()
    {
        nativeDeinit();
        super.finalize();
    }

    static 
    {
        SoLoader.a("dextr");
    }

    private class Cursor
        implements Cloneable
    {

        private final NativeRingBuffer mBuffer;
        private final long mBufferPtr;
        private long mNativeCursor;

        private native void nativeInit();

        public Object clone()
        {
            Cursor cursor = mBuffer. new Cursor();
            cursor.mNativeCursor = mNativeCursor;
            return cursor;
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

        Cursor()
        {
            mBuffer = NativeRingBuffer.this;
            mBufferPtr = NativeRingBuffer.a(mBuffer);
            nativeInit();
        }
    }

}
