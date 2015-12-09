// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    public transportVersion entities[];
    public Integer transportVersion;

    private clear clear()
    {
        entities = entities();
        transportVersion = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L5:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   10: 51
    //                   16: 175;
           goto _L1 _L2 _L3 _L4
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
        cachedSize acachedsize[];
        int j;
        if (entities == null)
        {
            j = 0;
        } else
        {
            j = entities.length;
        }
        acachedsize = new entities[j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(entities, 0, acachedsize, 0, j);
            l = j;
        }
        for (; l < acachedsize.length - 1; l++)
        {
            acachedsize[l] = new entities();
            codedinputbytebuffernano.readMessage(acachedsize[l]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[l] = new entities();
        codedinputbytebuffernano.readMessage(acachedsize[l]);
        entities = acachedsize;
          goto _L5
_L4:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 101: // 'e'
            transportVersion = Integer.valueOf(k);
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (entities != null)
        {
            j = i;
            if (entities.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= entities.length)
                    {
                        break;
                    }
                    transportVersion transportversion = entities[k];
                    j = i;
                    if (transportversion != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, transportversion);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (transportVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
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
        if (entities != null && entities.length > 0)
        {
            for (int i = 0; i < entities.length; i++)
            {
                mergeFrom mergefrom = entities[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (transportVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
