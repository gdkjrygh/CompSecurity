// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            ArrayBasedSymbol, PTSymbolWrapper, DecoderRuntimeException

public abstract class SymbolTable
    implements Serializable
{

    public static final int MAX_MMAP_SIZE = 0x5f5e100;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x3048b8bc313e1225L;

    public SymbolTable()
    {
    }

    public static SymbolTable readFromByteBuffer(ByteBuffer bytebuffer)
    {
        int i = bytebuffer.getInt();
        if (i == 1)
        {
            return ArrayBasedSymbol.readFromByteBufferHelper(bytebuffer);
        }
        if (i == 2)
        {
            return PTSymbolWrapper.readFromByteBufferHelper(bytebuffer);
        } else
        {
            throw new DecoderRuntimeException((new StringBuilder(32)).append("StRfbbUnknownClassId:").append(i).toString());
        }
    }

    public static SymbolTable readFromFile(String s)
    {
        if (s == null || s.isEmpty())
        {
            throw new DecoderRuntimeException("StRffNullFile");
        }
        FileChannel filechannel;
        Object obj;
        filechannel = (new RandomAccessFile(s, "r")).getChannel();
        obj = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)filechannel.size());
        if (((ByteBuffer) (obj)).getInt() != 0x49950a81)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = readFromByteBuffer(((ByteBuffer) (obj)));
        filechannel.close();
        return ((SymbolTable) (obj));
        SymbolTable symboltable;
        try
        {
            ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(s));
            symboltable = (SymbolTable)objectinputstream.readObject();
            objectinputstream.close();
            filechannel.close();
        }
        catch (Exception exception)
        {
            throw new DecoderRuntimeException("StRffFailed", exception, s);
        }
        return symboltable;
    }

    public abstract int addWord(String s);

    public final int[] addWords(String s)
    {
        return addWords(s.trim().split("\\s+"));
    }

    public final int[] addWords(String as[])
    {
        int ai[] = new int[as.length];
        for (int i = 0; i < as.length; i++)
        {
            ai[i] = addWord(as[i]);
        }

        return ai;
    }

    public abstract String[] allWords();

    public abstract void flush();

    public abstract int getId(String s);

    public final int[] getIds(String s)
    {
        s = s.trim().split("\\s+");
        int ai[] = new int[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ai[i] = getId(s[i]);
        }

        return ai;
    }

    public abstract String getWord(int i);

    public final String getWords(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(getWord(((Integer)list.get(i)).intValue()));
            if (i < list.size() - 1)
            {
                stringbuilder.append(" ");
            }
        }

        return stringbuilder.toString();
    }

    public final String getWords(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < ai.length; i++)
        {
            stringbuilder.append(getWord(ai[i]));
            if (i < ai.length - 1)
            {
                stringbuilder.append(" ");
            }
        }

        return stringbuilder.toString();
    }

    public abstract boolean hasWord(String s);

    public abstract int maximumId();

    public abstract void writeToByteBuffer(ByteBuffer bytebuffer);

    public void writeToFile(String s)
    {
        writeToFile(s, false);
    }

    public void writeToFile(String s, boolean flag)
    {
        if (flag)
        {
            try
            {
                s = new RandomAccessFile(s, "rw");
                FileChannel filechannel = s.getChannel();
                java.nio.MappedByteBuffer mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 0x5f5e100L);
                mappedbytebuffer.putInt(0x49950a81);
                writeToByteBuffer(mappedbytebuffer);
                filechannel.truncate(mappedbytebuffer.position());
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }
        s = new ObjectOutputStream(new FileOutputStream(s));
        s.writeObject(this);
        s.close();
        return;
    }

}
