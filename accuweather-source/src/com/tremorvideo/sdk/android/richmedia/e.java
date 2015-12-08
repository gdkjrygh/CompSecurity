// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class e
{

    DataInputStream a;

    public e(InputStream inputstream)
    {
        a = new DataInputStream(inputstream);
    }

    public int a()
        throws IOException
    {
        return Integer.reverseBytes(a.readInt());
    }

    public int b()
        throws IOException
    {
        return a.readUnsignedByte();
    }

    public String c()
        throws IOException
    {
        byte abyte0[] = new byte[e()];
        a.readFully(abyte0);
        return new String(abyte0, "UTF8");
    }

    public float d()
        throws IOException
    {
        return Float.intBitsToFloat(Integer.reverseBytes(a.readInt()));
    }

    public int e()
        throws IOException
    {
        return a.readUnsignedByte() | a.readUnsignedByte() << 8;
    }

    public boolean f()
        throws IOException
    {
        return a.readBoolean();
    }
}
