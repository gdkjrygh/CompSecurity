// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            SymbolTable, DecoderRuntimeException

public class HashMapBasedSymbol extends SymbolTable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x146d8439488440beL;
    private int curId;
    private final Map intToStrTbl;
    private final Map strToIntTbl;

    public HashMapBasedSymbol()
    {
        this(0);
    }

    public HashMapBasedSymbol(int i)
    {
        strToIntTbl = new HashMap();
        intToStrTbl = new HashMap();
        curId = i;
    }

    public int addWord(String s)
    {
        Integer integer = (Integer)strToIntTbl.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            curId = curId + 1;
            strToIntTbl.put(s, Integer.valueOf(curId));
            intToStrTbl.put(Integer.valueOf(curId), s);
            return curId;
        }
    }

    public String[] allWords()
    {
        String as[] = new String[strToIntTbl.size()];
        Iterator iterator = strToIntTbl.keySet().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            as[i] = (String)iterator.next();
        }

        return as;
    }

    public void flush()
    {
        if (curId > 0 && strToIntTbl.size() > 1000)
        {
            strToIntTbl.clear();
            intToStrTbl.clear();
        }
    }

    public int getId(String s)
    {
        Integer integer = (Integer)strToIntTbl.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("The word ").append(s).append(" does not exist!").toString());
        }
    }

    public String getWord(int i)
    {
        String s = (String)intToStrTbl.get(Integer.valueOf(i));
        if (s != null)
        {
            return s;
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(String.valueOf(s).length() + 25)).append("The word ").append(s).append(" does not exist!").toString());
        }
    }

    public boolean hasWord(String s)
    {
        return strToIntTbl.containsKey(s);
    }

    public int maximumId()
    {
        throw new UnsupportedOperationException("calling unimplement(ed) function");
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        throw new DecoderRuntimeException("Calling unimplemented funcion");
    }

}
