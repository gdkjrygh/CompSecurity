// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            NameValueBlockReader

class val.in extends InputStream
{

    final NameValueBlockReader this$0;
    final InputStream val$in;

    public void close()
        throws IOException
    {
        val$in.close();
    }

    public int read()
        throws IOException
    {
        return Util.readSingleByte(this);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = Math.min(j, NameValueBlockReader.access$000(NameValueBlockReader.this));
        i = val$in.read(abyte0, i, j);
        NameValueBlockReader.access$002(NameValueBlockReader.this, NameValueBlockReader.access$000(NameValueBlockReader.this) - i);
        return i;
    }

    ()
    {
        this$0 = final_namevalueblockreader;
        val$in = InputStream.this;
        super();
    }
}
