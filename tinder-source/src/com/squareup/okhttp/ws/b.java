// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.ws;

import com.squareup.okhttp.v;
import java.io.IOException;
import okio.e;

// Referenced classes of package com.squareup.okhttp.ws:
//            WebSocket

public interface b
{

    public abstract void a();

    public abstract void a(WebSocket websocket, v v);

    public abstract void a(IOException ioexception);

    public abstract void a(e e, WebSocket.PayloadType payloadtype)
        throws IOException;
}
