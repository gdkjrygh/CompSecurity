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

    public int getCodewordCount()
    {
        return codewords.length();
    }

    public StringBuilder getCodewords()
    {
        return codewords;
    }

    public char getCurrent()
    {
        return msg.charAt(pos);
    }

    public char getCurrentChar()
    {
        return msg.charAt(pos);
    }

    public String getMessage()
    {
        return msg;
    }

    public int getNewEncoding()
    {
        return newEncoding;
    }

    public int getRemainingCharacters()
    {
        return getTotalMessageCharCount() - pos;
    }

    public SymbolInfo getSymbolInfo()
    {
        return symbolInfo;
    }

    public boolean hasMoreCharacters()
    {
        return pos < getTotalMessageCharCount();
    }

    public void resetEncoderSignal()
    {
        newEncoding = -1;
    }

    public void resetSymbolInfo()
    {
        symbolInfo = null;
    }

    public void setSizeConstraints(Dimension dimension, Dimension dimension1)
    {
        minSize = dimension;
        maxSize = dimension1;
    }

    public void setSkipAtEnd(int i)
    {
        skipAtEnd = i;
    }

    public void setSymbolShape(SymbolShapeHint symbolshapehint)
    {
        shape = symbolshapehint;
    }

    public void signalEncoderChange(int i)
    {
        newEncoding = i;
    }

    public void updateSymbolInfo()
    {
        updateSymbolInfo(getCodewordCount());
    }

    public void updateSymbolInfo(int i)
    {
        if (symbolInfo == null || i > symbolInfo.getDataCapacity())
        {
            symbolInfo = SymbolInfo.lookup(i, shape, minSize, maxSize, true);
        }
    }

    public void writeCodeword(char c)
    {
        codewords.append(c);
    }

    public void writeCodewords(String s)
    {
        codewords.append(s);
    }
}
