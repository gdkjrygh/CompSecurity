// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public Integer backend;
    public Long clientExpirationTime;
    public byte fingerprint[];
    public Long pinGeneration;
    public Long pinTokenTtlMinutes;
    public Long serverIssueTime;
    public Long tokenVersion;

    private clear clear()
    {
        clientExpirationTime = null;
        serverIssueTime = null;
        pinGeneration = null;
        tokenVersion = null;
        pinTokenTtlMinutes = null;
        backend = null;
        fingerprint = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   16: 105
    //                   32: 119
    //                   40: 133
    //                   50: 147
    //                   56: 158
    //                   64: 172;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        clientExpirationTime = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L4:
        serverIssueTime = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L5:
        pinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L6:
        tokenVersion = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L7:
        fingerprint = codedinputbytebuffernano.readBytes();
          goto _L10
_L8:
        pinTokenTtlMinutes = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L10
_L9:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            backend = Integer.valueOf(j);
            break;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (clientExpirationTime != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientExpirationTime.longValue());
        }
        j = i;
        if (serverIssueTime != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, serverIssueTime.longValue());
        }
        i = j;
        if (pinGeneration != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(4, pinGeneration.longValue());
        }
        j = i;
        if (tokenVersion != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(5, tokenVersion.longValue());
        }
        i = j;
        if (fingerprint != null)
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(6, fingerprint);
        }
        j = i;
        if (pinTokenTtlMinutes != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(7, pinTokenTtlMinutes.longValue());
        }
        i = j;
        if (backend != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(8, backend.intValue());
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
        if (clientExpirationTime != null)
        {
            codedoutputbytebuffernano.writeInt64(1, clientExpirationTime.longValue());
        }
        if (serverIssueTime != null)
        {
            codedoutputbytebuffernano.writeInt64(2, serverIssueTime.longValue());
        }
        if (pinGeneration != null)
        {
            codedoutputbytebuffernano.writeInt64(4, pinGeneration.longValue());
        }
        if (tokenVersion != null)
        {
            codedoutputbytebuffernano.writeInt64(5, tokenVersion.longValue());
        }
        if (fingerprint != null)
        {
            codedoutputbytebuffernano.writeBytes(6, fingerprint);
        }
        if (pinTokenTtlMinutes != null)
        {
            codedoutputbytebuffernano.writeInt64(7, pinTokenTtlMinutes.longValue());
        }
        if (backend != null)
        {
            codedoutputbytebuffernano.writeInt32(8, backend.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _cls9()
    {
        clear();
    }
}
