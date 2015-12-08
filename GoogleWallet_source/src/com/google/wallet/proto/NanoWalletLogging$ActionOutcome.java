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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public Integer action;
    public Integer bank;
    public Long elapsedMillis;
    public String encodedCplc;
    public Integer environment;
    public String imei;
    public  networkDetails;
    public String partnerId;
    public String returnCode;
    public String sessionId;
    public Integer status;

    private clear clear()
    {
        action = null;
        bank = null;
        environment = null;
        status = null;
        returnCode = null;
        elapsedMillis = null;
        sessionId = null;
        encodedCplc = null;
        imei = null;
        partnerId = null;
        networkDetails = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L14:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 12: default 112
    //                   0: 121
    //                   8: 123
    //                   16: 354
    //                   24: 438
    //                   32: 510
    //                   42: 602
    //                   48: 613
    //                   58: 627
    //                   66: 638
    //                   74: 649
    //                   82: 660
    //                   90: 671;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L14; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
        case 45: // '-'
        case 46: // '.'
        case 47: // '/'
        case 48: // '0'
            action = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            bank = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            environment = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = codedinputbytebuffernano.readInt32();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            status = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        returnCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L8:
        elapsedMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L9:
        sessionId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        encodedCplc = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L11:
        imei = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L12:
        partnerId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L13:
        if (networkDetails == null)
        {
            networkDetails = new ();
        }
        codedinputbytebuffernano.readMessage(networkDetails);
        if (true) goto _L14; else goto _L15
_L15:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (action != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, action.intValue());
        }
        j = i;
        if (bank != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, bank.intValue());
        }
        i = j;
        if (environment != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, environment.intValue());
        }
        j = i;
        if (status != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, status.intValue());
        }
        i = j;
        if (returnCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, returnCode);
        }
        j = i;
        if (elapsedMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, elapsedMillis.longValue());
        }
        i = j;
        if (sessionId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, sessionId);
        }
        j = i;
        if (encodedCplc != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, encodedCplc);
        }
        i = j;
        if (imei != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, imei);
        }
        j = i;
        if (partnerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, partnerId);
        }
        i = j;
        if (networkDetails != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, networkDetails);
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
        if (action != null)
        {
            codedoutputbytebuffernano.writeInt32(1, action.intValue());
        }
        if (bank != null)
        {
            codedoutputbytebuffernano.writeInt32(2, bank.intValue());
        }
        if (environment != null)
        {
            codedoutputbytebuffernano.writeInt32(3, environment.intValue());
        }
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(4, status.intValue());
        }
        if (returnCode != null)
        {
            codedoutputbytebuffernano.writeString(5, returnCode);
        }
        if (elapsedMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(6, elapsedMillis.longValue());
        }
        if (sessionId != null)
        {
            codedoutputbytebuffernano.writeString(7, sessionId);
        }
        if (encodedCplc != null)
        {
            codedoutputbytebuffernano.writeString(8, encodedCplc);
        }
        if (imei != null)
        {
            codedoutputbytebuffernano.writeString(9, imei);
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(10, partnerId);
        }
        if (networkDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(11, networkDetails);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
