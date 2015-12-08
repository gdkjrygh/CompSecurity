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

    public boolean hasLicenseTitle;
    public boolean hasLicenseUrl;
    public boolean hasSourceTitle;
    public boolean hasSourceUrl;
    public String licenseTitle;
    public String licenseUrl;
    public String sourceTitle;
    public String sourceUrl;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasSourceTitle)
            {
                i = j;
                if (sourceTitle.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, sourceTitle);
        }
        int k;
label1:
        {
            if (!hasSourceUrl)
            {
                k = i;
                if (sourceUrl.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, sourceUrl);
        }
label2:
        {
            if (!hasLicenseTitle)
            {
                i = k;
                if (licenseTitle.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, licenseTitle);
        }
label3:
        {
            if (!hasLicenseUrl)
            {
                k = i;
                if (licenseUrl.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, licenseUrl);
        }
        return k;
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
                sourceTitle = codedinputbytebuffernano.readString();
                hasSourceTitle = true;
                break;

            case 18: // '\022'
                sourceUrl = codedinputbytebuffernano.readString();
                hasSourceUrl = true;
                break;

            case 26: // '\032'
                licenseTitle = codedinputbytebuffernano.readString();
                hasLicenseTitle = true;
                break;

            case 34: // '"'
                licenseUrl = codedinputbytebuffernano.readString();
                hasLicenseUrl = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSourceTitle || !sourceTitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, sourceTitle);
        }
        if (hasSourceUrl || !sourceUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, sourceUrl);
        }
        if (hasLicenseTitle || !licenseTitle.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, licenseTitle);
        }
        if (hasLicenseUrl || !licenseUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, licenseUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public _cls9()
    {
        sourceTitle = "";
        hasSourceTitle = false;
        sourceUrl = "";
        hasSourceUrl = false;
        licenseTitle = "";
        hasLicenseTitle = false;
        licenseUrl = "";
        hasLicenseUrl = false;
        cachedSize = -1;
    }
}
