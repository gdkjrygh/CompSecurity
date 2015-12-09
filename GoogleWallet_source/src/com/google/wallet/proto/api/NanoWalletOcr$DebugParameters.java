// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public String abeModelId;
    public  classifierWeight[];
    public Integer featureLevel;
    public Float thresholdOverride;

    private clear clear()
    {
        classifierWeight = .emptyArray();
        abeModelId = null;
        thresholdOverride = null;
        featureLevel = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 191
    //                   29: 202
    //                   32: 216;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
         a[];
        int j;
        if (classifierWeight == null)
        {
            j = 0;
        } else
        {
            j = classifierWeight.length;
        }
        a = new [j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(classifierWeight, 0, a, 0, j);
            l = j;
        }
        for (; l < a.length - 1; l++)
        {
            a[l] = new ();
            codedinputbytebuffernano.readMessage(a[l]);
            codedinputbytebuffernano.readTag();
        }

        a[l] = new ();
        codedinputbytebuffernano.readMessage(a[l]);
        classifierWeight = a;
          goto _L7
_L4:
        abeModelId = codedinputbytebuffernano.readString();
          goto _L7
_L5:
        thresholdOverride = Float.valueOf(codedinputbytebuffernano.readFloat());
          goto _L7
_L6:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            featureLevel = Integer.valueOf(k);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (classifierWeight != null)
        {
            j = i;
            if (classifierWeight.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= classifierWeight.length)
                    {
                        break;
                    }
                      = classifierWeight[k];
                    j = i;
                    if ( != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, );
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (abeModelId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, abeModelId);
        }
        j = i;
        if (thresholdOverride != null)
        {
            j = i + CodedOutputByteBufferNano.computeFloatSize(3, thresholdOverride.floatValue());
        }
        i = j;
        if (featureLevel != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, featureLevel.intValue());
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (classifierWeight != null && classifierWeight.length > 0)
        {
            for (int i = 0; i < classifierWeight.length; i++)
            {
                  = classifierWeight[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, );
                }
            }

        }
        if (abeModelId != null)
        {
            codedoutputbytebuffernano.writeString(2, abeModelId);
        }
        if (thresholdOverride != null)
        {
            codedoutputbytebuffernano.writeFloat(3, thresholdOverride.floatValue());
        }
        if (featureLevel != null)
        {
            codedoutputbytebuffernano.writeInt32(4, featureLevel.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
