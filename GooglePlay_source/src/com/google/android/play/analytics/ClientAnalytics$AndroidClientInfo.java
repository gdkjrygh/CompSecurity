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

    public long androidId;
    public String applicationBuild;
    public String board;
    public String brand;
    public String country;
    public String device;
    public long deviceId;
    public String fingerprint;
    public int gmsCoreVersionCode;
    public String hardware;
    public String locale;
    public String loggingId;
    public String manufacturer;
    public String mccMnc;
    public String model;
    public String osBuild;
    public String product;
    public String radioVersion;
    public int sdkVersion;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (androidId != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, androidId);
        }
        j = i;
        if (!loggingId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, loggingId);
        }
        i = j;
        if (sdkVersion != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, sdkVersion);
        }
        j = i;
        if (!model.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, model);
        }
        i = j;
        if (!product.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, product);
        }
        j = i;
        if (!osBuild.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, osBuild);
        }
        i = j;
        if (!applicationBuild.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, applicationBuild);
        }
        j = i;
        if (!hardware.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, hardware);
        }
        i = j;
        if (!device.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, device);
        }
        j = i;
        if (!mccMnc.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, mccMnc);
        }
        i = j;
        if (!locale.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(11, locale);
        }
        j = i;
        if (!country.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, country);
        }
        i = j;
        if (!manufacturer.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(13, manufacturer);
        }
        j = i;
        if (!brand.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(14, brand);
        }
        i = j;
        if (!board.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(15, board);
        }
        j = i;
        if (!radioVersion.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(16, radioVersion);
        }
        i = j;
        if (!fingerprint.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(17, fingerprint);
        }
        j = i;
        if (deviceId != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(18, deviceId);
        }
        i = j;
        if (gmsCoreVersionCode != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(19, gmsCoreVersionCode);
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
                androidId = codedinputbytebuffernano.readRawVarint64();
                break;

            case 18: // '\022'
                loggingId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                sdkVersion = codedinputbytebuffernano.readRawVarint32();
                break;

            case 34: // '"'
                model = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                product = codedinputbytebuffernano.readString();
                break;

            case 50: // '2'
                osBuild = codedinputbytebuffernano.readString();
                break;

            case 58: // ':'
                applicationBuild = codedinputbytebuffernano.readString();
                break;

            case 66: // 'B'
                hardware = codedinputbytebuffernano.readString();
                break;

            case 74: // 'J'
                device = codedinputbytebuffernano.readString();
                break;

            case 82: // 'R'
                mccMnc = codedinputbytebuffernano.readString();
                break;

            case 90: // 'Z'
                locale = codedinputbytebuffernano.readString();
                break;

            case 98: // 'b'
                country = codedinputbytebuffernano.readString();
                break;

            case 106: // 'j'
                manufacturer = codedinputbytebuffernano.readString();
                break;

            case 114: // 'r'
                brand = codedinputbytebuffernano.readString();
                break;

            case 122: // 'z'
                board = codedinputbytebuffernano.readString();
                break;

            case 130: 
                radioVersion = codedinputbytebuffernano.readString();
                break;

            case 138: 
                fingerprint = codedinputbytebuffernano.readString();
                break;

            case 144: 
                deviceId = codedinputbytebuffernano.readRawVarint64();
                break;

            case 152: 
                gmsCoreVersionCode = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (androidId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, androidId);
        }
        if (!loggingId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, loggingId);
        }
        if (sdkVersion != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, sdkVersion);
        }
        if (!model.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, model);
        }
        if (!product.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, product);
        }
        if (!osBuild.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, osBuild);
        }
        if (!applicationBuild.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, applicationBuild);
        }
        if (!hardware.equals(""))
        {
            codedoutputbytebuffernano.writeString(8, hardware);
        }
        if (!device.equals(""))
        {
            codedoutputbytebuffernano.writeString(9, device);
        }
        if (!mccMnc.equals(""))
        {
            codedoutputbytebuffernano.writeString(10, mccMnc);
        }
        if (!locale.equals(""))
        {
            codedoutputbytebuffernano.writeString(11, locale);
        }
        if (!country.equals(""))
        {
            codedoutputbytebuffernano.writeString(12, country);
        }
        if (!manufacturer.equals(""))
        {
            codedoutputbytebuffernano.writeString(13, manufacturer);
        }
        if (!brand.equals(""))
        {
            codedoutputbytebuffernano.writeString(14, brand);
        }
        if (!board.equals(""))
        {
            codedoutputbytebuffernano.writeString(15, board);
        }
        if (!radioVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(16, radioVersion);
        }
        if (!fingerprint.equals(""))
        {
            codedoutputbytebuffernano.writeString(17, fingerprint);
        }
        if (deviceId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(18, deviceId);
        }
        if (gmsCoreVersionCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(19, gmsCoreVersionCode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        androidId = 0L;
        loggingId = "";
        deviceId = 0L;
        sdkVersion = 0;
        model = "";
        product = "";
        hardware = "";
        device = "";
        osBuild = "";
        applicationBuild = "";
        mccMnc = "";
        locale = "";
        country = "";
        manufacturer = "";
        brand = "";
        board = "";
        radioVersion = "";
        fingerprint = "";
        gmsCoreVersionCode = 0;
        cachedSize = -1;
    }
}
