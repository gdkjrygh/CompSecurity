// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public byte apnsDeviceToken[];
    public String language;
    public String sdkVersion;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(1, apnsDeviceToken);
        }
        j = i;
        if (!sdkVersion.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, sdkVersion);
        }
        i = j;
        if (!language.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, language);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof language))
        {
            return false;
        }
        obj = (language)obj;
        if (!Arrays.equals(apnsDeviceToken, ((apnsDeviceToken) (obj)).apnsDeviceToken))
        {
            return false;
        }
        if (sdkVersion == null)
        {
            if (((sdkVersion) (obj)).sdkVersion != null)
            {
                return false;
            }
        } else
        if (!sdkVersion.equals(((sdkVersion) (obj)).sdkVersion))
        {
            return false;
        }
        if (language != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((language) (obj)).language == null) goto _L1; else goto _L3
_L3:
        return false;
        if (language.equals(((language) (obj)).language)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = getClass().getName().hashCode();
        int l = Arrays.hashCode(apnsDeviceToken);
        int i;
        if (sdkVersion == null)
        {
            i = 0;
        } else
        {
            i = sdkVersion.hashCode();
        }
        if (language != null)
        {
            j = language.hashCode();
        }
        return (((k + 527) * 31 + l) * 31 + i) * 31 + j;
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
                apnsDeviceToken = codedinputbytebuffernano.readBytes();
                break;

            case 18: // '\022'
                sdkVersion = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                language = codedinputbytebuffernano.readString();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(1, apnsDeviceToken);
        }
        if (!sdkVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, sdkVersion);
        }
        if (!language.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, language);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        apnsDeviceToken = WireFormatNano.EMPTY_BYTES;
        sdkVersion = "";
        language = "";
        cachedSize = -1;
    }
}
