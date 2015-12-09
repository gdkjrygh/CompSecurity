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
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{

    public String broadcaster;
    public int endYear;
    public boolean hasBroadcaster;
    public boolean hasEndYear;
    public boolean hasSeasonCount;
    public boolean hasStartYear;
    public int seasonCount;
    public int startYear;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasSeasonCount)
            {
                i = j;
                if (seasonCount == 0)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, seasonCount);
        }
        int k;
label1:
        {
            if (!hasStartYear)
            {
                k = i;
                if (startYear == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, startYear);
        }
label2:
        {
            if (!hasEndYear)
            {
                i = k;
                if (endYear == 0)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, endYear);
        }
label3:
        {
            if (!hasBroadcaster)
            {
                k = i;
                if (broadcaster.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, broadcaster);
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

            case 8: // '\b'
                seasonCount = codedinputbytebuffernano.readRawVarint32();
                hasSeasonCount = true;
                break;

            case 16: // '\020'
                startYear = codedinputbytebuffernano.readRawVarint32();
                hasStartYear = true;
                break;

            case 24: // '\030'
                endYear = codedinputbytebuffernano.readRawVarint32();
                hasEndYear = true;
                break;

            case 34: // '"'
                broadcaster = codedinputbytebuffernano.readString();
                hasBroadcaster = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasSeasonCount || seasonCount != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, seasonCount);
        }
        if (hasStartYear || startYear != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, startYear);
        }
        if (hasEndYear || endYear != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, endYear);
        }
        if (hasBroadcaster || !broadcaster.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, broadcaster);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        seasonCount = 0;
        hasSeasonCount = false;
        startYear = 0;
        hasStartYear = false;
        endYear = 0;
        hasEndYear = false;
        broadcaster = "";
        hasBroadcaster = false;
        cachedSize = -1;
    }
}
