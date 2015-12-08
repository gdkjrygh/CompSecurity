// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.OutputStream;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            j

final class g extends OutputStream
{

    final OutputStream a;
    final j b;

    g(OutputStream outputstream, j j1)
    {
        a = outputstream;
        b = j1;
    }

    public final void close()
    {
        a.close();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }

    public final void flush()
    {
        a.flush();
    }

    public final void write(int i)
    {
        a.write(i);
    }

    public final void write(byte abyte0[])
    {
        a.write(abyte0);
    }

    public final void write(byte abyte0[], int i, int k)
    {
        a.write(abyte0, i, k);
    }
}
