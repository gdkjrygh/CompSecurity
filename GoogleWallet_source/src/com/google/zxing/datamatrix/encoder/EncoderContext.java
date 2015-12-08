// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.Charset;

// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            SymbolShapeHint, SymbolInfo

final class EncoderContext
{

    private final StringBuilder codewords;
    private Dimension maxSize;
    private Dimension minSize;
    private final String msg;
    private int newEncoding;
    int pos;
    private SymbolShapeHint shape;
    private int skipAtEnd;
    private SymbolInfo symbolInfo;

    EncoderContext(String s)
    {
        byte abyte0[] = s.getBytes(Charset.forName("ISO-8859-1"));
        StringBuilder stringbuilder = new StringBuilder(abyte0.length);
        int i = 0;
        for (int j = abyte0.length; i < j; i++)
        {
            char c = (char)(abyte0[i] & 0xff);
            if (c == '?' && s.charAt(i) != '?')
            {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            stringbuilder.append(c);
        }

        msg = stringbuilder.toString();
        shape = SymbolShapeHint.FORCE_NONE;
        codewords = new StringBuilder(s.length());
        newEncoding = -1;
    }

    private int getTotalMessageCharCount()
    {
        return msg.length() - skipAtEnd;
    }

    public final int getCodewordCount()
    {
        return codewords.length();
    }

    public final StringBuilder getCodewords()
    {
        return codewords;
    }

    public final char getCurrentChar()
    {
        return msg.charAt(pos);
    }

    public final String getMessage()
    {
        return msg;
    }

    public final int getNewEncoding()
    {
        return newEncoding;
    }

    public final int getRemainingCharacters()
    {
        return getTotalMessageCharCount() - pos;
    }

    public final SymbolInfo getSymbolInfo()
    {
        return symbolInfo;
    }

    public final boolean hasMoreCharacters()
    {
        return pos < getTotalMessageCharCount();
    }

    public final void resetEncoderSignal()
    {
        newEncoding = -1;
    }

    public final void resetSymbolInfo()
    {
        symbolInfo = null;
    }

    public final void setSizeConstraints(Dimension dimension, Dimension dimension1)
    {
        minSize = dimension;
        maxSize = dimension1;
    }

    public final void setSkipAtEnd(int i)
    {
        skipAtEnd = i;
    }

    public final void setSymbolShape(SymbolShapeHint symbolshapehint)
    {
        shape = symbolshapehint;
    }

    public final void signalEncoderChange(int i)
    {
        newEncoding = i;
    }

    public final void updateSymbolInfo()
    {
        updateSymbolInfo(getCodewordCount());
    }

    public final void updateSymbolInfo(int i)
    {
        if (symbolInfo == null || i > symbolInfo.getDataCapacity())
        {
            symbolInfo = SymbolInfo.lookup(i, shape, minSize, maxSize, true);
        }
    }

    public final void writeCodeword(char c)
    {
        codewords.append(c);
    }

    public final void writeCodewords(String s)
    {
        codewords.append(s);
    }
}
