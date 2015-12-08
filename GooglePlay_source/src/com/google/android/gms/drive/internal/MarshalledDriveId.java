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

public final class MarshalledDriveId extends ExtendableMessageNano
{

    public long databaseInstanceId;
    public String resourceId;
    public int resourceType;
    public long sqlId;
    public int versionCode;

    public MarshalledDriveId()
    {
        versionCode = 1;
        resourceId = "";
        sqlId = -1L;
        databaseInstanceId = -1L;
        resourceType = -1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + CodedOutputByteBufferNano.computeInt32Size(1, versionCode) + CodedOutputByteBufferNano.computeStringSize(2, resourceId) + CodedOutputByteBufferNano.computeSInt64Size(3, sqlId) + CodedOutputByteBufferNano.computeSInt64Size(4, databaseInstanceId);
        int i = j;
        if (resourceType != -1)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, resourceType);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof MarshalledDriveId))
            {
                return false;
            }
            obj = (MarshalledDriveId)obj;
            if (versionCode != ((MarshalledDriveId) (obj)).versionCode)
            {
                return false;
            }
            if (resourceId == null)
            {
                if (((MarshalledDriveId) (obj)).resourceId != null)
                {
                    return false;
                }
            } else
            if (!resourceId.equals(((MarshalledDriveId) (obj)).resourceId))
            {
                return false;
            }
            if (sqlId != ((MarshalledDriveId) (obj)).sqlId)
            {
                return false;
            }
            if (databaseInstanceId != ((MarshalledDriveId) (obj)).databaseInstanceId)
            {
                return false;
            }
            if (resourceType != ((MarshalledDriveId) (obj)).resourceType)
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((MarshalledDriveId) (obj)).unknownFieldData != null && !((MarshalledDriveId) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((MarshalledDriveId) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int k = getClass().getName().hashCode();
        int l = versionCode;
        int i;
        int j;
        int i1;
        int j1;
        int k1;
        if (resourceId == null)
        {
            i = 0;
        } else
        {
            i = resourceId.hashCode();
        }
        i1 = (int)(sqlId ^ sqlId >>> 32);
        j1 = (int)(databaseInstanceId ^ databaseInstanceId >>> 32);
        k1 = resourceType;
        j = ((flag) ? 1 : 0);
        if (unknownFieldData != null)
        {
            if (unknownFieldData.isEmpty())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = unknownFieldData.hashCode();
            }
        }
        return ((((((k + 527) * 31 + l) * 31 + i) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + j;
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

            case 18: // '\022'
                resourceId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                sqlId = codedinputbytebuffernano.readSInt64();
                break;

            case 32: // ' '
                databaseInstanceId = codedinputbytebuffernano.readSInt64();
                break;

            case 40: // '('
                resourceType = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        codedoutputbytebuffernano.writeInt32(1, versionCode);
        codedoutputbytebuffernano.writeString(2, resourceId);
        codedoutputbytebuffernano.writeSInt64(3, sqlId);
        codedoutputbytebuffernano.writeSInt64(4, databaseInstanceId);
        if (resourceType != -1)
        {
            codedoutputbytebuffernano.writeInt32(5, resourceType);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
