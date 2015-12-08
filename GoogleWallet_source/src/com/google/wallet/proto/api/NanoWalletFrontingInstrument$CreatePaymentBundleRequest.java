// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletFrontingInstrument

public static final class clear extends ExtendableMessageNano
{

    public Integer bundleType;
    public Long clientTimeMillisSinceEpoch;
    public byte encryptedKeyczarSessionMaterial[];

    private clear clear()
    {
        encryptedKeyczarSessionMaterial = null;
        clientTimeMillisSinceEpoch = null;
        bundleType = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 70
    //                   24: 84;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        encryptedKeyczarSessionMaterial = codedinputbytebuffernano.readBytes();
          goto _L6
_L4:
        clientTimeMillisSinceEpoch = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L6
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 2: // '\002'
        case 4: // '\004'
            bundleType = Integer.valueOf(j);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (encryptedKeyczarSessionMaterial != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, encryptedKeyczarSessionMaterial);
        }
        j = i;
        if (clientTimeMillisSinceEpoch != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, clientTimeMillisSinceEpoch.longValue());
        }
        i = j;
        if (bundleType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, bundleType.intValue());
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
        if (encryptedKeyczarSessionMaterial != null)
        {
            codedoutputbytebuffernano.writeBytes(1, encryptedKeyczarSessionMaterial);
        }
        if (clientTimeMillisSinceEpoch != null)
        {
            codedoutputbytebuffernano.writeInt64(2, clientTimeMillisSinceEpoch.longValue());
        }
        if (bundleType != null)
        {
            codedoutputbytebuffernano.writeInt32(3, bundleType.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        clear();
    }
}
