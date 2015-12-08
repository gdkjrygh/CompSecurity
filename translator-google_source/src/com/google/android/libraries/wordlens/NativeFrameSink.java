// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;


// Referenced classes of package com.google.android.libraries.wordlens:
//            WordLensSystem, NativeBitmapInfo

public class NativeFrameSink
{

    private int a;

    public NativeFrameSink()
    {
        a = -1;
    }

    public final NativeBitmapInfo a()
    {
        this;
        JVM INSTR monitorenter ;
        NativeBitmapInfo nativebitmapinfo = onGetLastFrameNative();
        this;
        JVM INSTR monitorexit ;
        return nativebitmapinfo;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder(62)).append("NativeFrameSink camera natural orientation set to: ").append(i);
        a = i;
        Object obj = WordLensSystem.c();
        obj;
        JVM INSTR monitorenter ;
        i %= 360;
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
_L1:
        setCameraOrientationNative(i);
        obj;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        i += Math.abs(360);
          goto _L1
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public native NativeBitmapInfo onGetLastFrameNative();

    public native void onSetImageInfoNative(int i, int j, int k);

    public native void onSetNextFrameNative(byte abyte0[]);

    public native void setCameraOrientationNative(int i);
}
