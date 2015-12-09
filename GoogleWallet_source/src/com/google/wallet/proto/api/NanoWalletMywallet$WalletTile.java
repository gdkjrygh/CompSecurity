// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletMywallet

public static final class clear extends ExtendableMessageNano
{

    private static volatile dismissEvent _emptyArray[];
    public com.google.wallet.proto.yticsEvent dismissEvent;
    public com.google.wallet.proto.yticsEvent impressionEvent;
    public Boolean isDismissible;
    public Integer type;
    public String walletTileId;
    public ails woblTileDetails;

    private clear clear()
    {
        walletTileId = null;
        isDismissible = null;
        type = null;
        woblTileDetails = null;
        impressionEvent = null;
        dismissEvent = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   16: 94
    //                   24: 108
    //                   34: 218
    //                   42: 247
    //                   50: 276;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        walletTileId = codedinputbytebuffernano.readString();
          goto _L9
_L4:
        isDismissible = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L9
_L5:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
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
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (woblTileDetails == null)
        {
            woblTileDetails = new ails();
        }
        codedinputbytebuffernano.readMessage(woblTileDetails);
        continue; /* Loop/switch isn't completed */
_L7:
        if (impressionEvent == null)
        {
            impressionEvent = new com.google.wallet.proto.yticsEvent();
        }
        codedinputbytebuffernano.readMessage(impressionEvent);
        continue; /* Loop/switch isn't completed */
_L8:
        if (dismissEvent == null)
        {
            dismissEvent = new com.google.wallet.proto.yticsEvent();
        }
        codedinputbytebuffernano.readMessage(dismissEvent);
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (walletTileId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, walletTileId);
        }
        j = i;
        if (isDismissible != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, isDismissible.booleanValue());
        }
        i = j;
        if (type != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, type.intValue());
        }
        j = i;
        if (woblTileDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, woblTileDetails);
        }
        i = j;
        if (impressionEvent != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, impressionEvent);
        }
        j = i;
        if (dismissEvent != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, dismissEvent);
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
        if (walletTileId != null)
        {
            codedoutputbytebuffernano.writeString(1, walletTileId);
        }
        if (isDismissible != null)
        {
            codedoutputbytebuffernano.writeBool(2, isDismissible.booleanValue());
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(3, type.intValue());
        }
        if (woblTileDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(4, woblTileDetails);
        }
        if (impressionEvent != null)
        {
            codedoutputbytebuffernano.writeMessage(5, impressionEvent);
        }
        if (dismissEvent != null)
        {
            codedoutputbytebuffernano.writeMessage(6, dismissEvent);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ails()
    {
        clear();
    }
}
