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
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile requestorIp _emptyArray[];
    public String correlationId;
    public String deprecatedAuthToken;
    public requestorIp deviceContext;
    public requestorIp error;
    public requestorIp id;
    public ingInfo internalProvisioningInfo;
    public Integer internalProvisioningState;
    public ingInfo metadata;
    public String partnerId;
    public Integer provisioningState;
    public String requestorIp;
    public String sessionId;
    public Long startTimeMillis;
    public fier typedEntityIdentifier;
    public String userAgent;
    public fier walletContext;

    private clear clear()
    {
        id = null;
        metadata = null;
        typedEntityIdentifier = null;
        correlationId = null;
        provisioningState = null;
        userAgent = null;
        internalProvisioningState = null;
        deviceContext = null;
        walletContext = null;
        partnerId = null;
        deprecatedAuthToken = null;
        error = null;
        internalProvisioningInfo = null;
        sessionId = null;
        startTimeMillis = null;
        requestorIp = null;
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
_L19:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   10: 163
    //                   18: 192
    //                   26: 221
    //                   34: 250
    //                   40: 261
    //                   48: 318
    //                   58: 398
    //                   66: 427
    //                   74: 438
    //                   82: 449
    //                   90: 478
    //                   98: 507
    //                   104: 518
    //                   114: 532
    //                   122: 543
    //                   130: 572;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        if (id == null)
        {
            id = new <init>();
        }
        codedinputbytebuffernano.readMessage(id);
          goto _L19
_L4:
        if (metadata == null)
        {
            metadata = new nit>();
        }
        codedinputbytebuffernano.readMessage(metadata);
          goto _L19
_L5:
        if (typedEntityIdentifier == null)
        {
            typedEntityIdentifier = new fier();
        }
        codedinputbytebuffernano.readMessage(typedEntityIdentifier);
          goto _L19
_L6:
        correlationId = codedinputbytebuffernano.readString();
          goto _L19
_L7:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            provisioningState = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
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
            internalProvisioningState = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        if (deviceContext == null)
        {
            deviceContext = new >();
        }
        codedinputbytebuffernano.readMessage(deviceContext);
        continue; /* Loop/switch isn't completed */
_L10:
        partnerId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L11:
        deprecatedAuthToken = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L12:
        if (error == null)
        {
            error = new error();
        }
        codedinputbytebuffernano.readMessage(error);
        continue; /* Loop/switch isn't completed */
_L13:
        if (internalProvisioningInfo == null)
        {
            internalProvisioningInfo = new ingInfo();
        }
        codedinputbytebuffernano.readMessage(internalProvisioningInfo);
        continue; /* Loop/switch isn't completed */
_L14:
        sessionId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L15:
        startTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L16:
        userAgent = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L17:
        if (walletContext == null)
        {
            walletContext = new >();
        }
        codedinputbytebuffernano.readMessage(walletContext);
        continue; /* Loop/switch isn't completed */
_L18:
        requestorIp = codedinputbytebuffernano.readString();
        if (true) goto _L19; else goto _L20
_L20:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, id);
        }
        j = i;
        if (metadata != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, metadata);
        }
        i = j;
        if (typedEntityIdentifier != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, typedEntityIdentifier);
        }
        j = i;
        if (correlationId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, correlationId);
        }
        i = j;
        if (provisioningState != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, provisioningState.intValue());
        }
        j = i;
        if (internalProvisioningState != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, internalProvisioningState.intValue());
        }
        i = j;
        if (deviceContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, deviceContext);
        }
        j = i;
        if (partnerId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, partnerId);
        }
        i = j;
        if (deprecatedAuthToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, deprecatedAuthToken);
        }
        j = i;
        if (error != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(10, error);
        }
        i = j;
        if (internalProvisioningInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(11, internalProvisioningInfo);
        }
        j = i;
        if (sessionId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, sessionId);
        }
        i = j;
        if (startTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(13, startTimeMillis.longValue());
        }
        j = i;
        if (userAgent != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(14, userAgent);
        }
        i = j;
        if (walletContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(15, walletContext);
        }
        j = i;
        if (requestorIp != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(16, requestorIp);
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeMessage(1, id);
        }
        if (metadata != null)
        {
            codedoutputbytebuffernano.writeMessage(2, metadata);
        }
        if (typedEntityIdentifier != null)
        {
            codedoutputbytebuffernano.writeMessage(3, typedEntityIdentifier);
        }
        if (correlationId != null)
        {
            codedoutputbytebuffernano.writeString(4, correlationId);
        }
        if (provisioningState != null)
        {
            codedoutputbytebuffernano.writeInt32(5, provisioningState.intValue());
        }
        if (internalProvisioningState != null)
        {
            codedoutputbytebuffernano.writeInt32(6, internalProvisioningState.intValue());
        }
        if (deviceContext != null)
        {
            codedoutputbytebuffernano.writeMessage(7, deviceContext);
        }
        if (partnerId != null)
        {
            codedoutputbytebuffernano.writeString(8, partnerId);
        }
        if (deprecatedAuthToken != null)
        {
            codedoutputbytebuffernano.writeString(9, deprecatedAuthToken);
        }
        if (error != null)
        {
            codedoutputbytebuffernano.writeMessage(10, error);
        }
        if (internalProvisioningInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(11, internalProvisioningInfo);
        }
        if (sessionId != null)
        {
            codedoutputbytebuffernano.writeString(12, sessionId);
        }
        if (startTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(13, startTimeMillis.longValue());
        }
        if (userAgent != null)
        {
            codedoutputbytebuffernano.writeString(14, userAgent);
        }
        if (walletContext != null)
        {
            codedoutputbytebuffernano.writeMessage(15, walletContext);
        }
        if (requestorIp != null)
        {
            codedoutputbytebuffernano.writeString(16, requestorIp);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public fier()
    {
        clear();
    }
}
