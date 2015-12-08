// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso;

import java.nio.ByteBuffer;

// Referenced classes of package com.coremedia.iso:
//            Utf8

public final class IsoTypeWriter
{

    static final boolean $assertionsDisabled;

    public IsoTypeWriter()
    {
    }

    public static void writeFixedPoint0230(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(1073741824D * d);
        bytebuffer.put((byte)((0xff000000 & i) >> 24));
        bytebuffer.put((byte)((0xff0000 & i) >> 16));
        bytebuffer.put((byte)((0xff00 & i) >> 8));
        bytebuffer.put((byte)(i & 0xff));
    }

    public static void writeFixedPoint1616(ByteBuffer bytebuffer, double d)
    {
        int i = (int)(65536D * d);
        bytebuffer.put((byte)((0xff000000 & i) >> 24));
        bytebuffer.put((byte)((0xff0000 & i) >> 16));
        bytebuffer.put((byte)((0xff00 & i) >> 8));
        bytebuffer.put((byte)(i & 0xff));
    }

    public static void writeFixedPoint88(ByteBuffer bytebuffer, double d)
    {
        short word0 = (short)(int)(256D * d);
        bytebuffer.put((byte)((0xff00 & word0) >> 8));
        bytebuffer.put((byte)(word0 & 0xff));
    }

    public static void writeIso639(ByteBuffer bytebuffer, String s)
    {
        int i = 0;
        if (s.getBytes().length != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("\"")).append(s).append("\" language string isn't exactly 3 characters long!").toString());
        }
        int j = 0;
        do
        {
            if (i >= 3)
            {
                writeUInt16(bytebuffer, j);
                return;
            }
            j += s.getBytes()[i] - 96 << (2 - i) * 5;
            i++;
        } while (true);
    }

    public static void writePascalUtfString(ByteBuffer bytebuffer, String s)
    {
        s = Utf8.convert(s);
        if (!$assertionsDisabled && s.length >= 255)
        {
            throw new AssertionError();
        } else
        {
            writeUInt8(bytebuffer, s.length);
            bytebuffer.put(s);
            return;
        }
    }

    public static void writeUInt16(ByteBuffer bytebuffer, int i)
    {
        i = 0xffff & i;
        writeUInt8(bytebuffer, i >> 8);
        writeUInt8(bytebuffer, i & 0xff);
    }

    public static void writeUInt16BE(ByteBuffer bytebuffer, int i)
    {
        i = 0xffff & i;
        writeUInt8(bytebuffer, i & 0xff);
        writeUInt8(bytebuffer, i >> 8);
    }

    public static void writeUInt24(ByteBuffer bytebuffer, int i)
    {
        i = 0xffffff & i;
        writeUInt16(bytebuffer, i >> 8);
        writeUInt8(bytebuffer, i);
    }

    public static void writeUInt32(ByteBuffer bytebuffer, long l)
    {
        if (!$assertionsDisabled && (l < 0L || l > 0x100000000L))
        {
            throw new AssertionError((new StringBuilder("The given long is not in the range of uint32 (")).append(l).append(")").toString());
        } else
        {
            bytebuffer.putInt((int)l);
            return;
        }
    }

    public static void writeUInt32BE(ByteBuffer bytebuffer, long l)
    {
        if (!$assertionsDisabled && (l < 0L || l > 0x100000000L))
        {
            throw new AssertionError((new StringBuilder("The given long is not in the range of uint32 (")).append(l).append(")").toString());
        } else
        {
            writeUInt16BE(bytebuffer, (int)l & 0xffff);
            writeUInt16BE(bytebuffer, (int)(l >> 16 & 65535L));
            return;
        }
    }

    public static void writeUInt48(ByteBuffer bytebuffer, long l)
    {
        l = 0xffffffffffffL & l;
        writeUInt16(bytebuffer, (int)(l >> 32));
        writeUInt32(bytebuffer, l & 0xffffffffL);
    }

    public static void writeUInt64(ByteBuffer bytebuffer, long l)
    {
        if (!$assertionsDisabled && l < 0L)
        {
            throw new AssertionError("The given long is negative");
        } else
        {
            bytebuffer.putLong(l);
            return;
        }
    }

    public static void writeUInt8(ByteBuffer bytebuffer, int i)
    {
        bytebuffer.put((byte)(i & 0xff));
    }

    public static void writeUtf8String(ByteBuffer bytebuffer, String s)
    {
        bytebuffer.put(Utf8.convert(s));
        writeUInt8(bytebuffer, 0);
    }

    public static void writeZeroTermUtf8String(ByteBuffer bytebuffer, String s)
    {
        bytebuffer.put(Utf8.convert(s));
        writeUInt8(bytebuffer, 0);
    }

    static 
    {
        boolean flag;
        if (!com/coremedia/iso/IsoTypeWriter.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
