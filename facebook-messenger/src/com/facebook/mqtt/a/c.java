// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt.a;

import com.facebook.mqtt.messages.h;
import com.google.common.base.Charsets;
import java.io.DataInputStream;
import java.nio.charset.Charset;

class c
{

    protected h a;
    protected int b;

    c(h h, int i)
    {
        a = h;
        b = i;
    }

    protected String a(DataInputStream datainputstream)
    {
        int i = b(datainputstream);
        byte abyte0[] = new byte[i];
        datainputstream.readFully(abyte0);
        b = b - i;
        return new String(abyte0, Charsets.UTF_8.name());
    }

    protected int b(DataInputStream datainputstream)
    {
        int i = datainputstream.readUnsignedByte();
        int j = datainputstream.readUnsignedByte();
        b = b - 2;
        return i << 8 | j;
    }
}
