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
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    private static volatile isRequired _emptyArray[];
    public String hint;
    public Integer inputTypeNumber;
    public Boolean isRequired;
    public String label;
    public Boolean modifiableByUser;
    public String prefilledValue;
    public Integer sharedDataId;

    private clear clear()
    {
        inputTypeNumber = null;
        sharedDataId = null;
        label = null;
        hint = null;
        prefilledValue = null;
        modifiableByUser = null;
        isRequired = null;
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
                inputTypeNumber = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 16: // '\020'
                sharedDataId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 26: // '\032'
                label = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                hint = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                prefilledValue = codedinputbytebuffernano.readString();
                break;

            case 48: // '0'
                modifiableByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 56: // '8'
                isRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (inputTypeNumber != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, inputTypeNumber.intValue());
        }
        j = i;
        if (sharedDataId != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, sharedDataId.intValue());
        }
        i = j;
        if (label != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, label);
        }
        j = i;
        if (hint != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, hint);
        }
        i = j;
        if (prefilledValue != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, prefilledValue);
        }
        j = i;
        if (modifiableByUser != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(6, modifiableByUser.booleanValue());
        }
        i = j;
        if (isRequired != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRequired.booleanValue());
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
        if (inputTypeNumber != null)
        {
            codedoutputbytebuffernano.writeInt32(1, inputTypeNumber.intValue());
        }
        if (sharedDataId != null)
        {
            codedoutputbytebuffernano.writeInt32(2, sharedDataId.intValue());
        }
        if (label != null)
        {
            codedoutputbytebuffernano.writeString(3, label);
        }
        if (hint != null)
        {
            codedoutputbytebuffernano.writeString(4, hint);
        }
        if (prefilledValue != null)
        {
            codedoutputbytebuffernano.writeString(5, prefilledValue);
        }
        if (modifiableByUser != null)
        {
            codedoutputbytebuffernano.writeBool(6, modifiableByUser.booleanValue());
        }
        if (isRequired != null)
        {
            codedoutputbytebuffernano.writeBool(7, isRequired.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
