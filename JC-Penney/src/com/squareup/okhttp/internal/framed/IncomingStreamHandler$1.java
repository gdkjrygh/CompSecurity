// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;


// Referenced classes of package com.squareup.okhttp.internal.framed:
//            IncomingStreamHandler, ErrorCode, FramedStream

final class A
    implements IncomingStreamHandler
{

    public void receive(FramedStream framedstream)
    {
        framedstream.close(ErrorCode.REFUSED_STREAM);
    }

    A()
    {
    }
}
