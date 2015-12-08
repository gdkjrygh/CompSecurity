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
    public String osFullVersion;
    public String osMajorVersion;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!clientId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, clientId);
        }
        j = i;
        if (!loggingId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, loggingId);
        }
        i = j;
        if (!osMajorVersion.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, osMajorVersion);
        }
        j = i;
        if (!osFullVersion.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, osFullVersion);
        }
        i = j;
        if (!applicationBuild.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, applicationBuild);
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

            case 10: // '\n'
                clientId = codedinputbytebuffernano.readString();
                break;

            case 18: // '\022'
                loggingId = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                osMajorVersion = codedinputbytebuffernano.readString();
                break;

            case 34: // '"'
                osFullVersion = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                applicationBuild = codedinputbytebuffernano.readString();
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
        if (!loggingId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, loggingId);
        }
        if (!osMajorVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, osMajorVersion);
        }
        if (!osFullVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, osFullVersion);
        }
        if (!applicationBuild.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, applicationBuild);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clientId = "";
        loggingId = "";
        osMajorVersion = "";
        osFullVersion = "";
        applicationBuild = "";
        cachedSize = -1;
    }
}
