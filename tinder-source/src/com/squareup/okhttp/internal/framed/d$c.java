// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okio.a;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            d, ErrorCode

final class a extends a
{

    final d a;

    protected final IOException a(IOException ioexception)
    {
        SocketTimeoutException sockettimeoutexception = new SocketTimeoutException("timeout");
        if (ioexception != null)
        {
            sockettimeoutexception.initCause(ioexception);
        }
        return sockettimeoutexception;
    }

    protected final void a()
    {
        a.b(ErrorCode.l);
    }

    public final void b()
        throws IOException
    {
        if (s_())
        {
            throw a(null);
        } else
        {
            return;
        }
    }

    rCode(d d1)
    {
        a = d1;
        super();
    }
}
