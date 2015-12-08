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

    public syncStatusDetails entities[];
    public Long lastSyncGenerationNumber;
    public Integer syncStatus;
    public String syncStatusDetails;
    public Integer transportVersion;

    private clear clear()
    {
        entities = entities();
        lastSyncGenerationNumber = null;
        transportVersion = null;
        syncStatus = null;
        syncStatusDetails = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   10: 75
    //                   16: 199
    //                   24: 213
    //                   32: 282
    //                   42: 338;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
        cachedSize acachedsize[];
        int j;
        if (entities == null)
        {
            j = 0;
        } else
        {
            j = entities.length;
        }
        acachedsize = new entities[j + i1];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(entities, 0, acachedsize, 0, j);
            i1 = j;
        }
        for (; i1 < acachedsize.length - 1; i1++)
        {
            acachedsize[i1] = new entities();
            codedinputbytebuffernano.readMessage(acachedsize[i1]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[i1] = new entities();
        codedinputbytebuffernano.readMessage(acachedsize[i1]);
        entities = acachedsize;
          goto _L8
_L4:
        lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L8
_L5:
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
        continue; /* Loop/switch isn't completed */
_L6:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            syncStatus = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        syncStatusDetails = codedinputbytebuffernano.readString();
        if (true) goto _L8; else goto _L9
_L9:
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
                    syncStatusDetails syncstatusdetails = entities[k];
                    j = i;
                    if (syncstatusdetails != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, syncstatusdetails);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (lastSyncGenerationNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
        }
        j = i;
        if (transportVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
        }
        i = j;
        if (syncStatus != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
        }
        j = i;
        if (syncStatusDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
        }
        return j;
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
        if (lastSyncGenerationNumber != null)
        {
            codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
        }
        if (transportVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
        }
        if (syncStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
        }
        if (syncStatusDetails != null)
        {
            codedoutputbytebuffernano.writeString(5, syncStatusDetails);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
