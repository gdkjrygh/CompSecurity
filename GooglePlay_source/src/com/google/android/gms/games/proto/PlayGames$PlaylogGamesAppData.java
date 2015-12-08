// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public int oldVersion;
    public int version;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (version != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, version);
        }
        j = i;
        if (oldVersion != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, oldVersion);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof oldVersion))
            {
                return false;
            }
            obj = (oldVersion)obj;
            if (version != ((version) (obj)).version)
            {
                return false;
            }
            if (oldVersion != ((oldVersion) (obj)).oldVersion)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((getClass().getName().hashCode() + 527) * 31 + version) * 31 + oldVersion;
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
                version = codedinputbytebuffernano.readRawVarint32();
                break;

            case 16: // '\020'
                oldVersion = codedinputbytebuffernano.readRawVarint32();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (version != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, version);
        }
        if (oldVersion != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, oldVersion);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        version = 0;
        oldVersion = 0;
        cachedSize = -1;
    }
}
