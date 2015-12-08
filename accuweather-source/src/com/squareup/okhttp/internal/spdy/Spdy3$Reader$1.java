// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Spdy3

class this._cls0 extends InputStream
{

    final this._cls0 this$0;

    public void close()
        throws IOException
    {
        cess._mth100(this._cls0.this).close();
    }

    public int read()
        throws IOException
    {
        return Util.readSingleByte(this);
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        j = Math.min(j, cess._mth000(this._cls0.this));
        i = cess._mth100(this._cls0.this).read(abyte0, i, j);
        cess._mth020(this._cls0.this, i);
        return i;
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
