// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.builder;

import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ByteBufferHelper
{

    public ByteBufferHelper()
    {
    }

    public static List mergeAdjacentBuffers(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                return arraylist;
            }
            ByteBuffer bytebuffer = (ByteBuffer)list.next();
            int i = arraylist.size() - 1;
            if (i >= 0 && bytebuffer.hasArray() && ((ByteBuffer)arraylist.get(i)).hasArray() && bytebuffer.array() == ((ByteBuffer)arraylist.get(i)).array())
            {
                int j = ((ByteBuffer)arraylist.get(i)).arrayOffset();
                if (((ByteBuffer)arraylist.get(i)).limit() + j == bytebuffer.arrayOffset())
                {
                    ByteBuffer bytebuffer1 = (ByteBuffer)arraylist.remove(i);
                    arraylist.add(ByteBuffer.wrap(bytebuffer.array(), bytebuffer1.arrayOffset(), bytebuffer1.limit() + bytebuffer.limit()).slice());
                    continue;
                }
            }
            if (i >= 0 && (bytebuffer instanceof MappedByteBuffer) && (arraylist.get(i) instanceof MappedByteBuffer) && ((ByteBuffer)arraylist.get(i)).limit() == ((ByteBuffer)arraylist.get(i)).capacity() - bytebuffer.capacity())
            {
                ByteBuffer bytebuffer2 = (ByteBuffer)arraylist.get(i);
                bytebuffer2.limit(bytebuffer.limit() + bytebuffer2.limit());
            } else
            {
                bytebuffer.reset();
                arraylist.add(bytebuffer);
            }
        } while (true);
    }
}
