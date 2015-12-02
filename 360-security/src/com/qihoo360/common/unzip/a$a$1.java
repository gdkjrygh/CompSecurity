// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.unzip;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

// Referenced classes of package com.qihoo360.common.unzip:
//            a

class m extends InflaterInputStream
{

    final b a;
    private final Inflater b;

    public void close()
        throws IOException
    {
        super.close();
        b.end();
    }

    m(m m, InputStream inputstream, Inflater inflater, Inflater inflater1)
    {
        a = m;
        b = inflater1;
        super(inputstream, inflater);
    }
}
