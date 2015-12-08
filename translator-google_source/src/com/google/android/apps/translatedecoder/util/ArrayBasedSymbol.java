// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            SymbolTable, SortedStringArray, HashMapBasedSymbol, DecoderRuntimeException

public class ArrayBasedSymbol extends SymbolTable
{

    public static final int CLASS_ID = 1;
    private static final Logger b = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xe1bc62d7ae4eab8L;
    private transient HashMapBasedSymbol a;
    private final SortedStringArray sortedArray;

    public ArrayBasedSymbol(SortedStringArray sortedstringarray)
    {
        sortedArray = sortedstringarray;
    }

    public static SymbolTable readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        return new ArrayBasedSymbol(SortedStringArray.readFromByteBuffer(bytebuffer));
    }

    public int addWord(String s)
    {
        int i = sortedArray.getPos(s);
        if (i != -1)
        {
            return i;
        }
        if (a == null)
        {
            a = new HashMapBasedSymbol(sortedArray.maxPos());
        }
        return a.addWord(s);
    }

    public String[] allWords()
    {
        return sortedArray.getAllWords();
    }

    public void flush()
    {
        if (a != null)
        {
            a.flush();
        }
    }

    public int getId(String s)
    {
        int i = sortedArray.getPos(s);
        if (i != -1)
        {
            return i;
        }
        if (a != null)
        {
            return a.getId(s);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("The word ").append(s).append(" does not exist!").toString());
        }
    }

    public String getWord(int i)
    {
        String s = sortedArray.getWord(i);
        if (s != null)
        {
            return s;
        }
        if (a != null)
        {
            return a.getWord(i);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("The word ").append(s).append(" does not exist!").toString());
        }
    }

    public boolean hasWord(String s)
    {
        return sortedArray.getPos(s) != -1;
    }

    public int maximumId()
    {
        return sortedArray.maxPos();
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        sortedArray.writeToByteBuffer(bytebuffer);
    }

}
