// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;


// Referenced classes of package org.apache.commons.codec.binary:
//            BaseNCodec

static class 
{

    byte buffer[];
    int currentLinePos;
    boolean eof;
    int ibitWorkArea;
    long lbitWorkArea;
    int modulus;
    int pos;
    int readPos;

    public String toString()
    {
        return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", new Object[] {
            getClass().getSimpleName(), buffer, Integer.valueOf(currentLinePos), Boolean.valueOf(eof), Integer.valueOf(ibitWorkArea), Long.valueOf(lbitWorkArea), Integer.valueOf(modulus), Integer.valueOf(pos), Integer.valueOf(readPos)
        });
    }

    ()
    {
    }
}
