// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf;

import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.google.protobuf:
//            CodedInputStream

public final class Internal
{
    public static interface EnumLiteMap
    {
    }

    public static final class ListAdapter extends AbstractList
    {

        private final Converter converter;
        private final List fromList;

        public final Object get(int i)
        {
            return converter.convert(fromList.get(i));
        }

        public final int size()
        {
            return fromList.size();
        }

        public ListAdapter(List list, Converter converter1)
        {
            fromList = list;
            converter = converter1;
        }
    }

    public static interface ListAdapter.Converter
    {

        public abstract Object convert(Object obj);
    }


    public static final byte EMPTY_BYTE_ARRAY[];
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM;

    static 
    {
        byte abyte0[] = new byte[0];
        EMPTY_BYTE_ARRAY = abyte0;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(abyte0);
        EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(EMPTY_BYTE_ARRAY);
    }
}
