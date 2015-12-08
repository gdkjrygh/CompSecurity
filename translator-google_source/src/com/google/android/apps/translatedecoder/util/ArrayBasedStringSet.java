// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.util;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.util:
//            StringSet, SortedStringArray

public class ArrayBasedStringSet extends StringSet
{

    public static final int CLASS_ID = 1;
    private static final Logger a = Logger.getLogger("translate");
    private static final long serialVersionUID = 0xe484e2803d334d5eL;
    private final SortedStringArray keys;

    public ArrayBasedStringSet(SortedStringArray sortedstringarray)
    {
        keys = sortedstringarray;
    }

    public ArrayBasedStringSet(Set set)
    {
        String as[] = new String[set.size()];
        set = set.iterator();
        for (int i = 0; set.hasNext(); i++)
        {
            as[i] = (String)set.next();
        }

        keys = new SortedStringArray(as, false);
    }

    public static StringSet readFromByteBufferHelper(ByteBuffer bytebuffer)
    {
        return new ArrayBasedStringSet(SortedStringArray.readFromByteBuffer(bytebuffer));
    }

    public boolean contains(String s)
    {
        return keys.contains(s);
    }

    public void writeToByteBuffer(ByteBuffer bytebuffer)
    {
        bytebuffer.putInt(1);
        keys.writeToByteBuffer(bytebuffer);
    }

}
