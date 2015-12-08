// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public grantEndTimeSeconds activatePeriod;
    public int dEPRECATEDActivatePeriodSeconds;
    public int dEPRECATEDGrantPeriodSeconds;
    public long grantEndTimeSeconds;
    public grantEndTimeSeconds grantPeriod;
    public boolean hasDEPRECATEDActivatePeriodSeconds;
    public boolean hasDEPRECATEDGrantPeriodSeconds;
    public boolean hasGrantEndTimeSeconds;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDEPRECATEDGrantPeriodSeconds)
            {
                i = j;
                if (dEPRECATEDGrantPeriodSeconds == 0)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, dEPRECATEDGrantPeriodSeconds);
        }
        int k;
label1:
        {
            if (!hasDEPRECATEDActivatePeriodSeconds)
            {
                k = i;
                if (dEPRECATEDActivatePeriodSeconds == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, dEPRECATEDActivatePeriodSeconds);
        }
label2:
        {
            i = k;
            if (grantPeriod != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, grantPeriod);
            }
            k = i;
            if (activatePeriod != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(4, activatePeriod);
            }
            if (!hasGrantEndTimeSeconds)
            {
                i = k;
                if (grantEndTimeSeconds == 0L)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(5, grantEndTimeSeconds);
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
                dEPRECATEDGrantPeriodSeconds = codedinputbytebuffernano.readRawVarint32();
                hasDEPRECATEDGrantPeriodSeconds = true;
                break;

            case 16: // '\020'
                dEPRECATEDActivatePeriodSeconds = codedinputbytebuffernano.readRawVarint32();
                hasDEPRECATEDActivatePeriodSeconds = true;
                break;

            case 26: // '\032'
                if (grantPeriod == null)
                {
                    grantPeriod = new init>();
                }
                codedinputbytebuffernano.readMessage(grantPeriod);
                break;

            case 34: // '"'
                if (activatePeriod == null)
                {
                    activatePeriod = new init>();
                }
                codedinputbytebuffernano.readMessage(activatePeriod);
                break;

            case 40: // '('
                grantEndTimeSeconds = codedinputbytebuffernano.readRawVarint64();
                hasGrantEndTimeSeconds = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDEPRECATEDGrantPeriodSeconds || dEPRECATEDGrantPeriodSeconds != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, dEPRECATEDGrantPeriodSeconds);
        }
        if (hasDEPRECATEDActivatePeriodSeconds || dEPRECATEDActivatePeriodSeconds != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, dEPRECATEDActivatePeriodSeconds);
        }
        if (grantPeriod != null)
        {
            codedoutputbytebuffernano.writeMessage(3, grantPeriod);
        }
        if (activatePeriod != null)
        {
            codedoutputbytebuffernano.writeMessage(4, activatePeriod);
        }
        if (hasGrantEndTimeSeconds || grantEndTimeSeconds != 0L)
        {
            codedoutputbytebuffernano.writeInt64(5, grantEndTimeSeconds);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _cls9()
    {
        grantPeriod = null;
        activatePeriod = null;
        grantEndTimeSeconds = 0L;
        hasGrantEndTimeSeconds = false;
        dEPRECATEDGrantPeriodSeconds = 0;
        hasDEPRECATEDGrantPeriodSeconds = false;
        dEPRECATEDActivatePeriodSeconds = 0;
        hasDEPRECATEDActivatePeriodSeconds = false;
        cachedSize = -1;
    }
}
