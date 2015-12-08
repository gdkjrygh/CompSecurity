// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.pt;

import com.google.android.apps.translatedecoder.util.DecoderRuntimeException;
import com.google.android.apps.translatedecoder.util.SymbolTable;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.pt:
//            PhraseTable, PhrasePair

public class HashMapBasedPt extends PhraseTable
{

    private static final Logger b = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x2c43815cd41de026L;
    private final transient SymbolTable a;
    private String error;
    private final Map table;

    public HashMapBasedPt(int i, double d, String s, SymbolTable symboltable)
    {
        this(i, d, s, symboltable, false);
    }

    public HashMapBasedPt(int i, double d, String s, SymbolTable symboltable, boolean flag)
    {
        error = null;
        maxPhraseLen = i;
        oovCost = d;
        a = symboltable;
        table = new HashMap();
        if (flag)
        {
            a(s);
            return;
        } else
        {
            b(s);
            return;
        }
    }

    private int a(String s, int i)
    {
        String as[] = s.split("\\s+\\|{3}\\s+");
        if (as.length != 3)
        {
            return i;
        }
        s = a.addWords(as[0]);
        int j = i;
        if (s.length > i)
        {
            j = s.length;
        }
        String s1 = a(((int []) (s)), 0, s.length - 1);
        List list = (List)table.get(s1);
        s = list;
        if (list == null)
        {
            s = new ArrayList();
            table.put(s1, s);
        }
        s.add(new PhrasePair(a.addWords(as[1]), (new Double(as[2])).doubleValue()));
        return j;
    }

    private static String a(int ai[], int i, int j)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (; i <= j; i++)
        {
            stringbuilder.append(ai[i]);
            if (i < j)
            {
                stringbuilder.append(" ");
            }
        }

        return stringbuilder.toString();
    }

    private void a(String s)
    {
        s = s.split("\\n");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            a(s[i], 0);
        }

    }

    private void b(String s)
    {
        int i;
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("HmbpLffNullFile");
        }
        i = -1;
        DataInputStream datainputstream;
        BufferedReader bufferedreader;
        datainputstream = new DataInputStream(new FileInputStream(s));
        bufferedreader = new BufferedReader(new InputStreamReader(datainputstream));
_L1:
        String s1 = bufferedreader.readLine();
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            try
            {
                i = a(s1.trim(), i);
            }
            catch (Exception exception)
            {
                throw new DecoderRuntimeException("HmbpLffFailed", exception, s);
            }
        }
          goto _L1
        datainputstream.close();
        if (i != maxPhraseLen)
        {
            maxPhraseLen = i;
        }
        return;
    }

    public List getPhrases(int ai[])
    {
        return getPhrases(ai, 0, ai.length - 1);
    }

    public List getPhrases(int ai[], int i, int j)
    {
        if ((j - i) + 1 > maxPhraseLen || table.size() <= 0)
        {
            return null;
        } else
        {
            return (List)table.get(a(ai, i, j));
        }
    }

    public boolean hasError()
    {
        return error != null;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        throw new DecoderRuntimeException("calling unimplemented function");
    }

}
