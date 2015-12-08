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
//            NanoWalletSettings

public static final class clear extends ExtendableMessageNano
{

    private static volatile analyticsLabel _emptyArray[];
    public String analyticsLabel;
    public String description;
    public Integer id;
    public Boolean requiresLocationConsent;
    public String title;
    public Boolean value;

    private clear clear()
    {
        id = null;
        title = null;
        description = null;
        value = null;
        requiresLocationConsent = null;
        analyticsLabel = null;
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
                id = Integer.valueOf(codedinputbytebuffernano.readInt32());
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                description = codedinputbytebuffernano.readString();
                break;

            case 32: // ' '
                value = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 40: // '('
                requiresLocationConsent = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 50: // '2'
                analyticsLabel = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, id.intValue());
        }
        j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
        }
        j = i;
        if (value != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, value.booleanValue());
        }
        i = j;
        if (requiresLocationConsent != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, requiresLocationConsent.booleanValue());
        }
        j = i;
        if (analyticsLabel != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, analyticsLabel);
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
            codedoutputbytebuffernano.writeInt32(1, id.intValue());
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(3, description);
        }
        if (value != null)
        {
            codedoutputbytebuffernano.writeBool(4, value.booleanValue());
        }
        if (requiresLocationConsent != null)
        {
            codedoutputbytebuffernano.writeBool(5, requiresLocationConsent.booleanValue());
        }
        if (analyticsLabel != null)
        {
            codedoutputbytebuffernano.writeString(6, analyticsLabel);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
