// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.util.List;

// Referenced classes of package com.google.protobuf.nano:
//            MessageNano, InternalNano, FieldArray, FieldData, 
//            CodedInputByteBufferNano, WireFormatNano, UnknownFieldData, CodedOutputByteBufferNano

public abstract class ExtendableMessageNano extends MessageNano
{

    public FieldArray unknownFieldData;

    public ExtendableMessageNano()
    {
    }

    private ExtendableMessageNano clone()
        throws CloneNotSupportedException
    {
        ExtendableMessageNano extendablemessagenano = (ExtendableMessageNano)super.clone();
        InternalNano.cloneUnknownFieldData(this, extendablemessagenano);
        return extendablemessagenano;
    }

    public final volatile MessageNano clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public int computeSerializedSize()
    {
        int k = 0;
        int i = 0;
        if (unknownFieldData != null)
        {
            int j = 0;
            do
            {
                k = i;
                if (j >= unknownFieldData.mSize)
                {
                    break;
                }
                i += unknownFieldData.mData[j].computeSerializedSize();
                j++;
            } while (true);
        }
        return k;
    }

    public final boolean storeUnknownField(CodedInputByteBufferNano codedinputbytebuffernano, int i)
        throws IOException
    {
        int k = codedinputbytebuffernano.getPosition();
        if (!codedinputbytebuffernano.skipField(i))
        {
            return false;
        }
        int j = WireFormatNano.getTagFieldNumber(i);
        int i1 = codedinputbytebuffernano.getPosition() - k;
        Object obj;
        UnknownFieldData unknownfielddata;
        if (i1 == 0)
        {
            codedinputbytebuffernano = WireFormatNano.EMPTY_BYTES;
        } else
        {
            obj = new byte[i1];
            int j1 = codedinputbytebuffernano.bufferStart;
            System.arraycopy(codedinputbytebuffernano.buffer, j1 + k, obj, 0, i1);
            codedinputbytebuffernano = ((CodedInputByteBufferNano) (obj));
        }
        unknownfielddata = new UnknownFieldData(i, codedinputbytebuffernano);
        codedinputbytebuffernano = null;
        if (unknownFieldData == null)
        {
            unknownFieldData = new FieldArray();
        } else
        {
            codedinputbytebuffernano = unknownFieldData;
            i = codedinputbytebuffernano.binarySearch(j);
            if (i < 0 || ((FieldArray) (codedinputbytebuffernano)).mData[i] == FieldArray.DELETED)
            {
                codedinputbytebuffernano = null;
            } else
            {
                codedinputbytebuffernano = ((FieldArray) (codedinputbytebuffernano)).mData[i];
            }
        }
        obj = codedinputbytebuffernano;
        if (codedinputbytebuffernano == null)
        {
            obj = new FieldData();
            codedinputbytebuffernano = unknownFieldData;
            i = codedinputbytebuffernano.binarySearch(j);
            if (i >= 0)
            {
                ((FieldArray) (codedinputbytebuffernano)).mData[i] = ((FieldData) (obj));
            } else
            {
                i = ~i;
                if (i < ((FieldArray) (codedinputbytebuffernano)).mSize && ((FieldArray) (codedinputbytebuffernano)).mData[i] == FieldArray.DELETED)
                {
                    ((FieldArray) (codedinputbytebuffernano)).mFieldNumbers[i] = j;
                    ((FieldArray) (codedinputbytebuffernano)).mData[i] = ((FieldData) (obj));
                } else
                {
                    if (((FieldArray) (codedinputbytebuffernano)).mSize >= ((FieldArray) (codedinputbytebuffernano)).mFieldNumbers.length)
                    {
                        int l = FieldArray.idealIntArraySize(((FieldArray) (codedinputbytebuffernano)).mSize + 1);
                        int ai[] = new int[l];
                        FieldData afielddata[] = new FieldData[l];
                        System.arraycopy(((FieldArray) (codedinputbytebuffernano)).mFieldNumbers, 0, ai, 0, ((FieldArray) (codedinputbytebuffernano)).mFieldNumbers.length);
                        System.arraycopy(((FieldArray) (codedinputbytebuffernano)).mData, 0, afielddata, 0, ((FieldArray) (codedinputbytebuffernano)).mData.length);
                        codedinputbytebuffernano.mFieldNumbers = ai;
                        codedinputbytebuffernano.mData = afielddata;
                    }
                    if (((FieldArray) (codedinputbytebuffernano)).mSize - i != 0)
                    {
                        System.arraycopy(((FieldArray) (codedinputbytebuffernano)).mFieldNumbers, i, ((FieldArray) (codedinputbytebuffernano)).mFieldNumbers, i + 1, ((FieldArray) (codedinputbytebuffernano)).mSize - i);
                        System.arraycopy(((FieldArray) (codedinputbytebuffernano)).mData, i, ((FieldArray) (codedinputbytebuffernano)).mData, i + 1, ((FieldArray) (codedinputbytebuffernano)).mSize - i);
                    }
                    ((FieldArray) (codedinputbytebuffernano)).mFieldNumbers[i] = j;
                    ((FieldArray) (codedinputbytebuffernano)).mData[i] = ((FieldData) (obj));
                    codedinputbytebuffernano.mSize = ((FieldArray) (codedinputbytebuffernano)).mSize + 1;
                }
            }
        }
        ((FieldData) (obj)).unknownFieldData.add(unknownfielddata);
        return true;
    }

    public void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (unknownFieldData != null)
        {
            int i = 0;
            while (i < unknownFieldData.mSize) 
            {
                unknownFieldData.mData[i].writeTo(codedoutputbytebuffernano);
                i++;
            }
        }
    }
}
