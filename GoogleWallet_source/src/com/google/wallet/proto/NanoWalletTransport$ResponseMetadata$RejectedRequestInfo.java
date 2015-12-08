// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletTransport

public static final class clear extends ExtendableMessageNano
{

    private static volatile kycStatus _emptyArray[];
    public kycStatus callError;
    public kycStatus kycStatus;
    public kycStatus latestLegalDocument;
    public Integer reason;

    private clear clear()
    {
        reason = null;
        callError = null;
        latestLegalDocument = null;
        kycStatus = null;
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
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 138
    //                   26: 167
    //                   34: 196;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
            reason = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (callError == null)
        {
            callError = new callError();
        }
        codedinputbytebuffernano.readMessage(callError);
        continue; /* Loop/switch isn't completed */
_L5:
        if (latestLegalDocument == null)
        {
            latestLegalDocument = new latestLegalDocument();
        }
        codedinputbytebuffernano.readMessage(latestLegalDocument);
        continue; /* Loop/switch isn't completed */
_L6:
        if (kycStatus == null)
        {
            kycStatus = new kycStatus();
        }
        codedinputbytebuffernano.readMessage(kycStatus);
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (reason != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, reason.intValue());
        }
        j = i;
        if (callError != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
        }
        i = j;
        if (latestLegalDocument != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, latestLegalDocument);
        }
        j = i;
        if (kycStatus != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, kycStatus);
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
        if (reason != null)
        {
            codedoutputbytebuffernano.writeInt32(1, reason.intValue());
        }
        if (callError != null)
        {
            codedoutputbytebuffernano.writeMessage(2, callError);
        }
        if (latestLegalDocument != null)
        {
            codedoutputbytebuffernano.writeMessage(3, latestLegalDocument);
        }
        if (kycStatus != null)
        {
            codedoutputbytebuffernano.writeMessage(4, kycStatus);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
