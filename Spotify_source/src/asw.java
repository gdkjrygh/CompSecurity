// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.protocol.enums.MessageType;

public final class asw
{

    public byte a;
    public atc b;
    public byte c;
    public byte d;
    public int e;
    public int f;
    public int g;
    public byte h[];
    public byte i[];

    public asw()
    {
        a = 1;
        b = atc.b;
        MessageType messagetype = MessageType.a;
        c = 0;
        h = null;
        i = null;
    }

    public final void a(byte abyte0[])
    {
        h = abyte0;
        g = abyte0.length;
    }

    public final void b(byte abyte0[])
    {
        if (i != null)
        {
            i = null;
        }
        i = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, i, 0, abyte0.length);
    }
}
