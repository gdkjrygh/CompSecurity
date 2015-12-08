// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.e;

import java.io.OutputStream;

// Referenced classes of package com.roidapp.baselib.e:
//            f

public final class k extends f
{

    private byte b[];

    public k(String s, String s1)
    {
        super(s);
        b = s1.getBytes();
    }

    final void a(OutputStream outputstream)
    {
        outputstream.write((new StringBuilder("Content-Disposition: form-data; name=\"")).append(a).append("\"\r\n\r\n").toString().getBytes());
        outputstream.write(b);
    }

    public final byte[] a()
    {
        return b;
    }
}
