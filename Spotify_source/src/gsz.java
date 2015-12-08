// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.net.SocketTimeoutException;

final class gsz extends hce
{

    private gsw a;

    gsz(gsw gsw1)
    {
        a = gsw1;
        super();
    }

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
        a.b(ErrorCode.h);
    }

    public final void b()
    {
        if (V_())
        {
            throw a(null);
        } else
        {
            return;
        }
    }
}
