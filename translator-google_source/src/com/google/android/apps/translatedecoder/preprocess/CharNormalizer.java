// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.preprocess;

import com.google.android.apps.translatedecoder.util.StringMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharNormalizer
    implements Serializable
{

    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x490727f74037fb4cL;
    private final StringMap charMap;
    private Map dynamicCharMap;
    private boolean removeDiacritics;

    public CharNormalizer(boolean flag, StringMap stringmap)
    {
        removeDiacritics = flag;
        charMap = stringmap;
        dynamicCharMap = new HashMap();
        dynamicCharMap.put("\u3002", ".");
        dynamicCharMap.put("\267", ".");
    }

    public static String normalize(String s)
    {
        return Normalizer.normalize(s, java.text.Normalizer.Form.NFC);
    }

    public static CharNormalizer readFromByteBuffer(ByteBuffer bytebuffer)
    {
        boolean flag = true;
        if (bytebuffer.getInt() != 1)
        {
            flag = false;
        }
        return new CharNormalizer(flag, StringMap.readFromByteBuffer(bytebuffer));
    }

    public static CharNormalizer readFromFile(String s)
    {
        Object obj;
        try
        {
            obj = (new RandomAccessFile(s, "r")).getChannel();
            obj = ((FileChannel) (obj)).map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, (int)((FileChannel) (obj)).size());
            if (((ByteBuffer) (obj)).getInt() == 0x49950a81)
            {
                return readFromByteBuffer(((ByteBuffer) (obj)));
            }
            s = new ObjectInputStream(new FileInputStream(s));
            obj = (CharNormalizer)s.readObject();
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return ((CharNormalizer) (obj));
    }

    public static String removeDiacriticalMarks(String s)
    {
        s = Normalizer.normalize(s, java.text.Normalizer.Form.NFD);
        return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(s).replaceAll("");
    }

    public String mapChars(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) 
        {
            int j = s.codePointAt(i);
            String s1 = new String(Character.toChars(j));
            String s2 = charMap.get(s1);
            if (s2 != null)
            {
                stringbuilder.append(s2);
            } else
            {
                String s3 = (String)dynamicCharMap.get(s1);
                if (s3 != null)
                {
                    stringbuilder.append(s3);
                } else
                {
                    stringbuilder.append(s1);
                }
            }
            i = Character.charCount(j) + i;
        }
        return stringbuilder.toString();
    }

    public String normalizeChars(String s)
    {
        if (removeDiacritics)
        {
            return removeDiacriticalMarks(mapChars(normalize(s)));
        } else
        {
            return mapChars(normalize(s));
        }
    }

    public boolean removeDiacritics()
    {
        return removeDiacritics;
    }

    public void setRemoveDiacritics(boolean flag)
    {
        removeDiacritics = flag;
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        int i;
        if (removeDiacritics)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bytebuffer.putInt(i);
        charMap.writeToByteBuffer(bytebuffer);
    }

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
                java.nio.MappedByteBuffer mappedbytebuffer = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_WRITE, 0L, 0x2faf080L);
                mappedbytebuffer.putInt(0x49950a81);
                writeToByteBuffer(mappedbytebuffer);
                filechannel.truncate(mappedbytebuffer.position());
                s.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_94;
        }
        s = new ObjectOutputStream(new FileOutputStream(s));
        s.writeObject(this);
        s.close();
        return;
    }

}
