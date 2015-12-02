// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra.util;

import java.io.FilterWriter;
import java.io.Writer;

class UrlEncodingWriter extends FilterWriter
{

    static final boolean THROW_ON_INVALID_INPUT = false;
    private static final int U16_SURROGATE_OFFSET = 0x35fdc00;
    private static final byte UPPER_CASE_DIGITS[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90
    };
    private static final byte UTF16_REPLACEMENT_BYTE = 63;
    private char mUtf16State;

    public UrlEncodingWriter(Writer writer)
    {
        super(writer);
        mUtf16State = '\0';
    }

    private void resetState()
    {
        mUtf16State = '\0';
    }

    private static int utf16GetSupplementary(char c, char c1)
    {
        return ((c << 10) + c1) - 0x35fdc00;
    }

    private static boolean utf16IsSurrogate(char c)
    {
        return (0xf800 & c) == 55296;
    }

    private static boolean utf16IsSurrogateLead(char c)
    {
        return (c & 0x400) == 0;
    }

    private static boolean utf16IsSurrogateTrail(char c)
    {
        return (c & 0x400) != 0;
    }

    private void writeByte(byte byte0)
    {
        if (byte0 >= 97 && byte0 <= 122 || byte0 >= 65 && byte0 <= 90 || byte0 >= 48 && byte0 <= 57 || byte0 == 46 || byte0 == 45 || byte0 == 42 || byte0 == 95)
        {
            out.write(byte0);
            return;
        }
        if (byte0 == 32)
        {
            out.write(43);
            return;
        } else
        {
            writeHexByte(byte0);
            return;
        }
    }

    private void writeHexByte(byte byte0)
    {
        out.write(37);
        out.write(UPPER_CASE_DIGITS[byte0 >> 4 & 0xf]);
        out.write(UPPER_CASE_DIGITS[byte0 & 0xf]);
    }

    public void close()
    {
        flush();
    }

    public void enforceCodepointBoundary()
    {
        if (mUtf16State != 0)
        {
            writeHexByte((byte)63);
            resetState();
        }
    }

    public void flush()
    {
        enforceCodepointBoundary();
        super.flush();
    }

    public void write(int i)
    {
        char c = (char)i;
        if (mUtf16State != 0)
        {
            if (utf16IsSurrogate(c) && utf16IsSurrogateTrail(c))
            {
                i = utf16GetSupplementary(mUtf16State, c);
                writeHexByte((byte)(i >> 18 | 0xf0));
                writeHexByte((byte)(i >> 12 & 0x3f | 0x80));
                writeHexByte((byte)(i >> 6 & 0x3f | 0x80));
                writeHexByte((byte)(i & 0x3f | 0x80));
                resetState();
                return;
            } else
            {
                writeHexByte((byte)63);
                resetState();
                write(c);
                return;
            }
        }
        if ((c & 0xffff) < 128)
        {
            writeByte((byte)c);
            return;
        }
        if ((c & 0xffff) < 2048)
        {
            writeHexByte((byte)(c >> 6 | 0xc0));
            writeHexByte((byte)(c & 0x3f | 0x80));
            return;
        }
        if (utf16IsSurrogate(c))
        {
            if (utf16IsSurrogateLead(c))
            {
                mUtf16State = c;
                return;
            } else
            {
                writeHexByte((byte)63);
                return;
            }
        } else
        {
            writeHexByte((byte)(c >> 12 | 0xe0));
            writeHexByte((byte)(c >> 6 & 0x3f | 0x80));
            writeHexByte((byte)(c & 0x3f | 0x80));
            return;
        }
    }

    public void write(String s, int i, int j)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        int k = i;
_L2:
        if (k >= i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        write(s.charAt(k));
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void write(char ac[], int i, int j)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        int k = i;
_L2:
        if (k >= i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        write(ac[k]);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        ac;
        obj;
        JVM INSTR monitorexit ;
        throw ac;
    }

}
