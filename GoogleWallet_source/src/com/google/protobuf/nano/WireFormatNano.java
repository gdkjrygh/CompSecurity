// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.nano:
//            CodedInputByteBufferNano

public final class WireFormatNano
{

    public static final boolean EMPTY_BOOLEAN_ARRAY[] = new boolean[0];
    public static final byte EMPTY_BYTES[] = new byte[0];
    public static final byte EMPTY_BYTES_ARRAY[][] = new byte[0][];
    public static final double EMPTY_DOUBLE_ARRAY[] = new double[0];
    public static final float EMPTY_FLOAT_ARRAY[] = new float[0];
    public static final int EMPTY_INT_ARRAY[] = new int[0];
    public static final long EMPTY_LONG_ARRAY[] = new long[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];

    public static final int getRepeatedFieldArrayLength(CodedInputByteBufferNano codedinputbytebuffernano, int i)
        throws IOException
    {
        int j = 1;
        int k = codedinputbytebuffernano.getPosition();
        codedinputbytebuffernano.skipField(i);
        while (codedinputbytebuffernano.readTag() == i) 
        {
            codedinputbytebuffernano.skipField(i);
            j++;
        }
        codedinputbytebuffernano.rewindToPosition(k);
        return j;
    }

    public static int getTagFieldNumber(int i)
    {
        return i >>> 3;
    }

    static int getTagWireType(int i)
    {
        return i & 7;
    }

    static int makeTag(int i, int j)
    {
        return i << 3 | j;
    }

}
