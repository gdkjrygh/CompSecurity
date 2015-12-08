// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public String applicationBuild;
    public String clientId;
    public String loggingId;
    public String make;
    public String model;
    public String platformVersion;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!clientId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, clientId);
        }
        j = i;
        if (!make.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(3, make);
        }
        i = j;
        if (!model.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, model);
        }
        j = i;
        if (!applicationBuild.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(5, applicationBuild);
        }
        i = j;
        if (!platformVersion.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(6, platformVersion);
        }
        j = i;
        if (!loggingId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(7, loggingId);
        }
        return j;
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

            case 10: // '\n'
                clientId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                make = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                model = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                applicationBuild = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                platformVersion = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                loggingId = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!clientId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, clientId);
        }
        if (!make.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, make);
        }
        if (!model.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, model);
        }
        if (!applicationBuild.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, applicationBuild);
        }
        if (!platformVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, platformVersion);
        }
        if (!loggingId.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, loggingId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clientId = "";
        loggingId = "";
        make = "";
        model = "";
        applicationBuild = "";
        platformVersion = "";
        cachedSize = -1;
    }
}
