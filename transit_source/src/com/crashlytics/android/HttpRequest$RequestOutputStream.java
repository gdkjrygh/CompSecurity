// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

// Referenced classes of package com.crashlytics.android:
//            HttpRequest

public class a extends BufferedOutputStream
{

    private final CharsetEncoder a;

    public a write(String s)
        throws IOException
    {
        s = a.encode(CharBuffer.wrap(s));
        super.write(s.array(), 0, s.limit());
        return this;
    }

    public (OutputStream outputstream, String s, int i)
    {
        super(outputstream, i);
        a = Charset.forName(HttpRequest.b(s)).newEncoder();
    }
}
