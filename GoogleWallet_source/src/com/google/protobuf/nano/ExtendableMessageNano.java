// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.nano:
//            MessageNano, InternalNano, FieldArray, FieldData, 
//            CodedInputByteBufferNano, WireFormatNano, UnknownFieldData, CodedOutputByteBufferNano

public abstract class ExtendableMessageNano extends MessageNano
{

    protected FieldArray unknownFieldData;

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

    protected int computeSerializedSize()
    {
        int k = 0;
        int i = 0;
        if (unknownFieldData != null)
        {
            int j = 0;
            do
            {
                k = i;
                if (j >= unknownFieldData.size())
                {
                    break;
                }
                i += unknownFieldData.dataAt(j).computeSerializedSize();
                j++;
            } while (true);
        }
        return k;
    }

    protected final boolean storeUnknownField(CodedInputByteBufferNano codedinputbytebuffernano, int i)
        throws IOException
    {
        int j = codedinputbytebuffernano.getPosition();
        if (!codedinputbytebuffernano.skipField(i))
        {
            return false;
        }
        int k = WireFormatNano.getTagFieldNumber(i);
        UnknownFieldData unknownfielddata = new UnknownFieldData(i, codedinputbytebuffernano.getData(j, codedinputbytebuffernano.getPosition() - j));
        codedinputbytebuffernano = null;
        Object obj;
        if (unknownFieldData == null)
        {
            unknownFieldData = new FieldArray();
        } else
        {
            codedinputbytebuffernano = unknownFieldData.get(k);
        }
        obj = codedinputbytebuffernano;
        if (codedinputbytebuffernano == null)
        {
            obj = new FieldData();
            unknownFieldData.put(k, ((FieldData) (obj)));
        }
        ((FieldData) (obj)).addUnknownField(unknownfielddata);
        return true;
    }

    public void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (unknownFieldData != null)
        {
            int i = 0;
            while (i < unknownFieldData.size()) 
            {
                unknownFieldData.dataAt(i).writeTo(codedoutputbytebuffernano);
                i++;
            }
        }
    }
}
