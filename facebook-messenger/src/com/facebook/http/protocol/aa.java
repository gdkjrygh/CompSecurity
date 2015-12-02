// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import java.io.OutputStream;

// Referenced classes of package com.facebook.http.protocol:
//            ab

public class aa extends ab
{

    private byte a[];

    public aa(byte abyte0[], String s, String s1)
    {
        super(s, abyte0.length, s1);
        a = abyte0;
    }

    public void a(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        } else
        {
            outputstream.write(a);
            return;
        }
    }
}
