// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.uploader.service.lib.service;


// Referenced classes of package com.google.android.libraries.uploader.service.lib.service:
//            Uploader, ByteArrayWrapper

final class val.httpResponseCode
    implements Runnable
{

    final val.httpResponseCode this$1;
    final int val$httpResponseCode;
    final ByteArrayWrapper val$responseTextBytes;
    final String val$sessionId;

    public final void run()
    {
        stener.stener(val$sessionId, val$responseTextBytes.getByteArray(), val$httpResponseCode);
    }

    ()
    {
        this$1 = final_;
        val$sessionId = s;
        val$responseTextBytes = bytearraywrapper;
        val$httpResponseCode = I.this;
        super();
    }
}
