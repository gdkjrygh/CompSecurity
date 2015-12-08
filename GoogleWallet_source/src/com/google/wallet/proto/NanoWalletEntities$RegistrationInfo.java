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

    public tionInfo androidIdRegistrationInfo;
    public nfo apnsRegistrationInfo;
    public fo gcmRegistrationInfo;
    public Integer type;

    private clear clear()
    {
        androidIdRegistrationInfo = null;
        gcmRegistrationInfo = null;
        apnsRegistrationInfo = null;
        type = null;
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
    //                   18: 96
    //                   26: 125
    //                   32: 154;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        if (androidIdRegistrationInfo == null)
        {
            androidIdRegistrationInfo = new tionInfo();
        }
        codedinputbytebuffernano.readMessage(androidIdRegistrationInfo);
          goto _L7
_L4:
        if (gcmRegistrationInfo == null)
        {
            gcmRegistrationInfo = new fo();
        }
        codedinputbytebuffernano.readMessage(gcmRegistrationInfo);
          goto _L7
_L5:
        if (apnsRegistrationInfo == null)
        {
            apnsRegistrationInfo = new nfo();
        }
        codedinputbytebuffernano.readMessage(apnsRegistrationInfo);
          goto _L7
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = Integer.valueOf(j);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (androidIdRegistrationInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, androidIdRegistrationInfo);
        }
        j = i;
        if (gcmRegistrationInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, gcmRegistrationInfo);
        }
        i = j;
        if (apnsRegistrationInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, apnsRegistrationInfo);
        }
        j = i;
        if (type != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, type.intValue());
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
        if (androidIdRegistrationInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(1, androidIdRegistrationInfo);
        }
        if (gcmRegistrationInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, gcmRegistrationInfo);
        }
        if (apnsRegistrationInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, apnsRegistrationInfo);
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(4, type.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public fo()
    {
        clear();
    }
}
