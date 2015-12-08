// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;


class val.jpegBytes
    implements Runnable
{

    final val.jpegBytes this$1;
    final byte val$jpegBytes[];

    public void run()
    {
        callback.onPictureTaken(val$jpegBytes, null);
    }

    ()
    {
        this$1 = final_;
        val$jpegBytes = _5B_B.this;
        super();
    }
}
