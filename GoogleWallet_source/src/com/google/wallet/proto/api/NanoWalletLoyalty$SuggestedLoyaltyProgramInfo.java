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

    private static volatile logoImageUrl _emptyArray[];
    public String discoverableProgramId;
    public String logoImageUrl;
    public String merchantName;
    public String programName;

    private clear clear()
    {
        merchantName = null;
        programName = null;
        discoverableProgramId = null;
        logoImageUrl = null;
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

            case 10: // '\n'
                merchantName = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                programName = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                discoverableProgramId = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                logoImageUrl = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (merchantName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
        }
        j = i;
        if (programName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, programName);
        }
        i = j;
        if (discoverableProgramId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, discoverableProgramId);
        }
        j = i;
        if (logoImageUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, logoImageUrl);
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
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(1, merchantName);
        }
        if (programName != null)
        {
            codedoutputbytebuffernano.writeString(2, programName);
        }
        if (discoverableProgramId != null)
        {
            codedoutputbytebuffernano.writeString(3, discoverableProgramId);
        }
        if (logoImageUrl != null)
        {
            codedoutputbytebuffernano.writeString(4, logoImageUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
