// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            StringMap, SortedStringArray

public class ArrayBasedStringMap extends StringMap
{

    public static final int CLASS_ID = 1;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0x7d98e4178f216c77L;
    private final SortedStringArray keys;
    private final SortedStringArray values;

    public ArrayBasedStringMap(SortedStringArray sortedstringarray, SortedStringArray sortedstringarray1)
    {
        keys = sortedstringarray;
        values = sortedstringarray1;
    }

    public ArrayBasedStringMap(Map map)
    {
        boolean flag = false;
        super();
        String as[] = new String[map.size()];
        Iterator iterator = map.keySet().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            as[i] = (String)iterator.next();
        }

        Arrays.sort(as);
        String as1[] = new String[map.size()];
        for (int j = ((flag) ? 1 : 0); j < as.length; j++)
        {
            as1[j] = (String)map.get(as[j]);
        }

        keys = new SortedStringArray(as, true);
        values = new SortedStringArray(as1, true);
    }

    public static StringMap readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        return new ArrayBasedStringMap(SortedStringArray.readFromByteBuffer(bytebuffer), SortedStringArray.readFromByteBuffer(bytebuffer));
    }

    public String get(String s)
    {
        int i = keys.getPos(s);
        if (i < 0)
        {
            return null;
        } else
        {
            return values.getWord(i);
        }
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        keys.writeToByteBuffer(bytebuffer);
        values.writeToByteBuffer(bytebuffer);
    }

}
