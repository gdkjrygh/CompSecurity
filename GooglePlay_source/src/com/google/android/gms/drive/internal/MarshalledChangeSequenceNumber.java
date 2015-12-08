// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

public final class MarshalledChangeSequenceNumber extends ExtendableMessageNano
{

    public long accountId;
    public long databaseInstanceId;
    public long sequenceNumber;
    public int versionCode;

    public MarshalledChangeSequenceNumber()
    {
        versionCode = 1;
        sequenceNumber = -1L;
        databaseInstanceId = -1L;
        accountId = -1L;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        return super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, versionCode) + CodedOutputByteBufferNano.computeSInt64Size(2, sequenceNumber) + CodedOutputByteBufferNano.computeSInt64Size(3, databaseInstanceId) + CodedOutputByteBufferNano.computeSInt64Size(4, accountId);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof MarshalledChangeSequenceNumber))
            {
                return false;
            }
            obj = (MarshalledChangeSequenceNumber)obj;
            if (versionCode != ((MarshalledChangeSequenceNumber) (obj)).versionCode)
            {
                return false;
            }
            if (sequenceNumber != ((MarshalledChangeSequenceNumber) (obj)).sequenceNumber)
            {
                return false;
            }
            if (databaseInstanceId != ((MarshalledChangeSequenceNumber) (obj)).databaseInstanceId)
            {
                return false;
            }
            if (accountId != ((MarshalledChangeSequenceNumber) (obj)).accountId)
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((MarshalledChangeSequenceNumber) (obj)).unknownFieldData != null && !((MarshalledChangeSequenceNumber) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((MarshalledChangeSequenceNumber) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = versionCode;
        int l = (int)(sequenceNumber ^ sequenceNumber >>> 32);
        int i1 = (int)(databaseInstanceId ^ databaseInstanceId >>> 32);
        int j1 = (int)(accountId ^ accountId >>> 32);
        int i;
        if (unknownFieldData == null || unknownFieldData.isEmpty())
        {
            i = 0;
        } else
        {
            i = unknownFieldData.hashCode();
        }
        return i + (((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                versionCode = codedinputbytebuffernano.readRawVarint32();
                break;

            case 16: // '\020'
                sequenceNumber = codedinputbytebuffernano.readSInt64();
                break;

            case 24: // '\030'
                databaseInstanceId = codedinputbytebuffernano.readSInt64();
                break;

            case 32: // ' '
                accountId = codedinputbytebuffernano.readSInt64();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        codedoutputbytebuffernano.writeInt32(1, versionCode);
        codedoutputbytebuffernano.writeSInt64(2, sequenceNumber);
        codedoutputbytebuffernano.writeSInt64(3, databaseInstanceId);
        codedoutputbytebuffernano.writeSInt64(4, accountId);
        super.writeTo(codedoutputbytebuffernano);
    }
}
