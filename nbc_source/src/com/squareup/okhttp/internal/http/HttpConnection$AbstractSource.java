// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.net.Socket;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Source;
import okio.Timeout;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            HttpConnection

private abstract class <init>
    implements Source
{

    protected boolean closed;
    final HttpConnection this$0;
    protected final ForwardingTimeout timeout;

    protected final void endOfInput(boolean flag)
        throws IOException
    {
        if (HttpConnection.access$500(HttpConnection.this) != 5)
        {
            throw new IllegalStateException((new StringBuilder()).append("state: ").append(HttpConnection.access$500(HttpConnection.this)).toString());
        }
        HttpConnection.access$400(HttpConnection.this, timeout);
        HttpConnection.access$502(HttpConnection.this, 0);
        if (flag && HttpConnection.access$700(HttpConnection.this) == 1)
        {
            HttpConnection.access$702(HttpConnection.this, 0);
            Internal.instance.recycle(HttpConnection.access$800(HttpConnection.this), HttpConnection.access$900(HttpConnection.this));
        } else
        if (HttpConnection.access$700(HttpConnection.this) == 2)
        {
            HttpConnection.access$502(HttpConnection.this, 6);
            HttpConnection.access$900(HttpConnection.this).getSocket().close();
            return;
        }
    }

    public Timeout timeout()
    {
        return timeout;
    }

    protected final void unexpectedEndOfInput()
    {
        Util.closeQuietly(HttpConnection.access$900(HttpConnection.this).getSocket());
        HttpConnection.access$502(HttpConnection.this, 6);
    }

    private ()
    {
        this$0 = HttpConnection.this;
        super();
        timeout = new ForwardingTimeout(HttpConnection.access$600(HttpConnection.this).timeout());
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
