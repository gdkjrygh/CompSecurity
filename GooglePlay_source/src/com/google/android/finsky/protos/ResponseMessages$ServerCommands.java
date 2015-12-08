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
//            ResponseMessages

public static final class cachedSize extends MessageNano
{

    public boolean clearCache;
    public String displayErrorMessage;
    public boolean hasClearCache;
    public boolean hasDisplayErrorMessage;
    public boolean hasLogErrorStacktrace;
    public String logErrorStacktrace;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasClearCache)
            {
                i = j;
                if (!clearCache)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
        }
        int k;
label1:
        {
            if (!hasDisplayErrorMessage)
            {
                k = i;
                if (displayErrorMessage.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, displayErrorMessage);
        }
label2:
        {
            if (!hasLogErrorStacktrace)
            {
                i = k;
                if (logErrorStacktrace.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, logErrorStacktrace);
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
                clearCache = codedinputbytebuffernano.readBool();
                hasClearCache = true;
                break;

            case 18: // '\022'
                displayErrorMessage = codedinputbytebuffernano.readString();
                hasDisplayErrorMessage = true;
                break;

            case 26: // '\032'
                logErrorStacktrace = codedinputbytebuffernano.readString();
                hasLogErrorStacktrace = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasClearCache || clearCache)
        {
            codedoutputbytebuffernano.writeBool(1, clearCache);
        }
        if (hasDisplayErrorMessage || !displayErrorMessage.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, displayErrorMessage);
        }
        if (hasLogErrorStacktrace || !logErrorStacktrace.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, logErrorStacktrace);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clearCache = false;
        hasClearCache = false;
        displayErrorMessage = "";
        hasDisplayErrorMessage = false;
        logErrorStacktrace = "";
        hasLogErrorStacktrace = false;
        cachedSize = -1;
    }
}
