// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    private static volatile offerPaymentPeriod _emptyArray[];
    public String currencyCode;
    public boolean hasCurrencyCode;
    public boolean hasMicros;
    public long micros;
    public eriod offerPaymentPeriod;

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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasMicros)
            {
                i = j;
                if (micros == 0L)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, micros);
        }
        int k;
label1:
        {
            if (!hasCurrencyCode)
            {
                k = i;
                if (currencyCode.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
        }
        i = k;
        if (offerPaymentPeriod != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(3, offerPaymentPeriod);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                micros = codedinputbytebuffernano.readRawVarint64();
                hasMicros = true;
                break;

            case 18: // '\022'
                currencyCode = codedinputbytebuffernano.readString();
                hasCurrencyCode = true;
                break;

            case 26: // '\032'
                if (offerPaymentPeriod == null)
                {
                    offerPaymentPeriod = new eriod();
                }
                codedinputbytebuffernano.readMessage(offerPaymentPeriod);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasMicros || micros != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, micros);
        }
        if (hasCurrencyCode || !currencyCode.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, currencyCode);
        }
        if (offerPaymentPeriod != null)
        {
            codedoutputbytebuffernano.writeMessage(3, offerPaymentPeriod);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public eriod()
    {
        micros = 0L;
        hasMicros = false;
        currencyCode = "";
        hasCurrencyCode = false;
        offerPaymentPeriod = null;
        cachedSize = -1;
    }
}
