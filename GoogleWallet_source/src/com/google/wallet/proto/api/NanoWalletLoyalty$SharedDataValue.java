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

    private static volatile modifiedByUser _emptyArray[];
    public Boolean modifiedByUser;
    public Integer sharedDataId;
    public String value;

    private clear clear()
    {
        sharedDataId = null;
        value = null;
        modifiedByUser = null;
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
                sharedDataId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 18: // '\022'
                value = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                modifiedByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (sharedDataId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, sharedDataId.intValue());
        }
        j = i;
        if (value != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
        }
        i = j;
        if (modifiedByUser != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, modifiedByUser.booleanValue());
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
        if (sharedDataId != null)
        {
            codedoutputbytebuffernano.writeInt32(1, sharedDataId.intValue());
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeString(2, value);
        }
        if (modifiedByUser != null)
        {
            codedoutputbytebuffernano.writeBool(3, modifiedByUser.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
