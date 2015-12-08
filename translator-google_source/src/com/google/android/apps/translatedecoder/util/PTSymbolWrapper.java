// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            SymbolTable, d

public class PTSymbolWrapper extends SymbolTable
{

    public static final int CLASS_ID = 2;
    private static final long serialVersionUID = 1L;
    private final SymbolTable lmSymbol;
    private final SymbolTable ptSymbol;

    public PTSymbolWrapper(SymbolTable symboltable, SymbolTable symboltable1)
    {
        lmSymbol = symboltable;
        ptSymbol = symboltable1;
    }

    private static SymbolTable a(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        int j = bytebuffer.position();
        SymbolTable symboltable = SymbolTable.readFromByteBuffer(d.a(bytebuffer, i));
        bytebuffer.position(i + j);
        return symboltable;
    }

    private static void a(SymbolTable symboltable, ByteBuffer bytebuffer)
    {
        ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(0x5f5e100);
        symboltable.writeToByteBuffer(bytebuffer1);
        int i = bytebuffer1.position();
        bytebuffer1.limit(i);
        bytebuffer1.position(0);
        bytebuffer.putInt(i);
        bytebuffer.put(bytebuffer1);
    }

    public static SymbolTable readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        return new PTSymbolWrapper(a(bytebuffer), a(bytebuffer));
    }

    public int addWord(String s)
    {
        if (lmSymbol.hasWord(s))
        {
            return lmSymbol.getId(s);
        } else
        {
            return ptSymbol.addWord(s);
        }
    }

    public String[] allWords()
    {
        throw new UnsupportedOperationException("calling unimplement(ed) function");
    }

    public void flush()
    {
        if (lmSymbol != null)
        {
            lmSymbol.flush();
        }
        if (ptSymbol != null)
        {
            ptSymbol.flush();
        }
    }

    public int getId(String s)
    {
        if (lmSymbol.hasWord(s))
        {
            return lmSymbol.getId(s);
        } else
        {
            return ptSymbol.getId(s);
        }
    }

    public String getWord(int i)
    {
        if (i <= lmSymbol.maximumId())
        {
            return lmSymbol.getWord(i);
        } else
        {
            return ptSymbol.getWord(i);
        }
    }

    public boolean hasWord(String s)
    {
        return lmSymbol.hasWord(s) || ptSymbol.hasWord(s);
    }

    public int maximumId()
    {
        throw new UnsupportedOperationException("calling unimplement(ed) function");
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(2);
        a(lmSymbol, bytebuffer);
        a(ptSymbol, bytebuffer);
    }
}
