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
//            NanoWalletClient

public static final class clear extends ExtendableMessageNano
{

    public Integer badPinAttempts;
    public Long cloudPinGeneration;
    public Boolean cloudPinSet;
    public Boolean deprecatedPinExpired;
    public String localPinHash;
    public Long localSalt;
    public byte pendingSecurePinBytes[];
    public Long pendingSecurePinGeneration;
    public Integer pendingSecurePinVersion;
    public Integer pinTryCounter;
    public Integer pinTryLimit;
    public byte securePinBytes[];
    public Long securePinGeneration;
    public Integer securePinVersion;
    public Long stateTransitionDeltaMs;
    public Long stateTransitionTimestamp;

    private clear clear()
    {
        localSalt = null;
        localPinHash = null;
        badPinAttempts = null;
        deprecatedPinExpired = null;
        stateTransitionTimestamp = null;
        stateTransitionDeltaMs = null;
        securePinVersion = null;
        securePinBytes = null;
        pinTryCounter = null;
        pinTryLimit = null;
        pendingSecurePinVersion = null;
        pendingSecurePinBytes = null;
        pendingSecurePinGeneration = null;
        cloudPinSet = null;
        cloudPinGeneration = null;
        securePinGeneration = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                localSalt = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 18: // '\022'
                localPinHash = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                badPinAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 32: // ' '
                deprecatedPinExpired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 40: // '('
                stateTransitionTimestamp = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 48: // '0'
                stateTransitionDeltaMs = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 56: // '8'
                securePinVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 66: // 'B'
                securePinBytes = codedinputbytebuffernano.readBytes();
                break;

            case 72: // 'H'
                pinTryCounter = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 80: // 'P'
                pinTryLimit = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 88: // 'X'
                pendingSecurePinVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 98: // 'b'
                pendingSecurePinBytes = codedinputbytebuffernano.readBytes();
                break;

            case 104: // 'h'
                pendingSecurePinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 112: // 'p'
                cloudPinSet = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 120: // 'x'
                cloudPinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;

            case 128: 
                securePinGeneration = Long.valueOf(codedinputbytebuffernano.readInt64());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (localSalt != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, localSalt.longValue());
        }
        j = i;
        if (localPinHash != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, localPinHash);
        }
        i = j;
        if (badPinAttempts != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, badPinAttempts.intValue());
        }
        j = i;
        if (deprecatedPinExpired != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, deprecatedPinExpired.booleanValue());
        }
        i = j;
        if (stateTransitionTimestamp != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(5, stateTransitionTimestamp.longValue());
        }
        j = i;
        if (stateTransitionDeltaMs != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, stateTransitionDeltaMs.longValue());
        }
        i = j;
        if (securePinVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(7, securePinVersion.intValue());
        }
        j = i;
        if (securePinBytes != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(8, securePinBytes);
        }
        i = j;
        if (pinTryCounter != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(9, pinTryCounter.intValue());
        }
        j = i;
        if (pinTryLimit != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(10, pinTryLimit.intValue());
        }
        i = j;
        if (pendingSecurePinVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(11, pendingSecurePinVersion.intValue());
        }
        j = i;
        if (pendingSecurePinBytes != null)
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(12, pendingSecurePinBytes);
        }
        i = j;
        if (pendingSecurePinGeneration != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(13, pendingSecurePinGeneration.longValue());
        }
        j = i;
        if (cloudPinSet != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(14, cloudPinSet.booleanValue());
        }
        i = j;
        if (cloudPinGeneration != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(15, cloudPinGeneration.longValue());
        }
        j = i;
        if (securePinGeneration != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(16, securePinGeneration.longValue());
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
        if (localSalt != null)
        {
            codedoutputbytebuffernano.writeInt64(1, localSalt.longValue());
        }
        if (localPinHash != null)
        {
            codedoutputbytebuffernano.writeString(2, localPinHash);
        }
        if (badPinAttempts != null)
        {
            codedoutputbytebuffernano.writeInt32(3, badPinAttempts.intValue());
        }
        if (deprecatedPinExpired != null)
        {
            codedoutputbytebuffernano.writeBool(4, deprecatedPinExpired.booleanValue());
        }
        if (stateTransitionTimestamp != null)
        {
            codedoutputbytebuffernano.writeInt64(5, stateTransitionTimestamp.longValue());
        }
        if (stateTransitionDeltaMs != null)
        {
            codedoutputbytebuffernano.writeInt64(6, stateTransitionDeltaMs.longValue());
        }
        if (securePinVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(7, securePinVersion.intValue());
        }
        if (securePinBytes != null)
        {
            codedoutputbytebuffernano.writeBytes(8, securePinBytes);
        }
        if (pinTryCounter != null)
        {
            codedoutputbytebuffernano.writeInt32(9, pinTryCounter.intValue());
        }
        if (pinTryLimit != null)
        {
            codedoutputbytebuffernano.writeInt32(10, pinTryLimit.intValue());
        }
        if (pendingSecurePinVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(11, pendingSecurePinVersion.intValue());
        }
        if (pendingSecurePinBytes != null)
        {
            codedoutputbytebuffernano.writeBytes(12, pendingSecurePinBytes);
        }
        if (pendingSecurePinGeneration != null)
        {
            codedoutputbytebuffernano.writeInt64(13, pendingSecurePinGeneration.longValue());
        }
        if (cloudPinSet != null)
        {
            codedoutputbytebuffernano.writeBool(14, cloudPinSet.booleanValue());
        }
        if (cloudPinGeneration != null)
        {
            codedoutputbytebuffernano.writeInt64(15, cloudPinGeneration.longValue());
        }
        if (securePinGeneration != null)
        {
            codedoutputbytebuffernano.writeInt64(16, securePinGeneration.longValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        clear();
    }
}
