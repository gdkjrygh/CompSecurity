// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ndmob.relay;

import android.graphics.Bitmap;
import kik.android.util.bx;

public class RelayNative
{

    private static final String a[] = {
        "avutil", "avcodec", "avformat", "swscale", "relay"
    };
    public int mNativeContext;

    public RelayNative()
    {
        String as[];
        int j;
        as = a;
        j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        System.loadLibrary(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            native_init();
        }
        catch (Exception exception)
        {
            bx.d(exception);
        }
        native_setup();
        return;
    }

    private final native void native_finalize();

    private static native void native_init();

    private native void native_setup();

    public native String extractMetadata(String s);

    protected void finalize()
    {
        native_finalize();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public native void release();

    public native void renderBitmapStrip(Bitmap bitmap);

    public native void setDataSource(String s);

}
