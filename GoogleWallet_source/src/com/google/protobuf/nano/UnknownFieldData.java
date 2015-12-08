// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.protobuf.nano:
//            CodedOutputByteBufferNano

final class UnknownFieldData
{

    final byte bytes[];
    final int tag;

    UnknownFieldData(int i, byte abyte0[])
    {
        tag = i;
        bytes = abyte0;
    }

    final int computeSerializedSize()
    {
        return CodedOutputByteBufferNano.computeRawVarint32Size(tag) + 0 + bytes.length;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof UnknownFieldData))
            {
                return false;
            }
            obj = (UnknownFieldData)obj;
            if (tag != ((UnknownFieldData) (obj)).tag || !Arrays.equals(bytes, ((UnknownFieldData) (obj)).bytes))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(bytes);
    }

    final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        codedoutputbytebuffernano.writeRawVarint32(tag);
        codedoutputbytebuffernano.writeRawBytes(bytes);
    }
}
