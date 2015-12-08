// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.squareup.okhttp.internal:
//            DiskLruCache

private class <init> extends FilterOutputStream
{

    final this._cls1 this$1;

    public void close()
    {
        try
        {
            out.close();
            return;
        }
        catch (IOException ioexception)
        {
            out(this._cls1.this, true);
        }
    }

    public void flush()
    {
        try
        {
            out.flush();
            return;
        }
        catch (IOException ioexception)
        {
            out(this._cls1.this, true);
        }
    }

    public void write(int i)
    {
        try
        {
            out.write(i);
            return;
        }
        catch (IOException ioexception)
        {
            out(this._cls1.this, true);
        }
    }

    public void write(byte abyte0[], int i, int j)
    {
        try
        {
            out.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            out(this._cls1.this, true);
        }
    }

    private (OutputStream outputstream)
    {
        this$1 = this._cls1.this;
        super(outputstream);
    }

    this._cls1(OutputStream outputstream, this._cls1 _pcls1_1)
    {
        this(outputstream);
    }
}
