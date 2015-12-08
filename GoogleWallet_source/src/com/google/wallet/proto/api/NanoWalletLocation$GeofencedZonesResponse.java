// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{

    public refreshZone refreshZone;
    public refreshZone zone[];

    private clear clear()
    {
        zone = zone();
        refreshZone = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                cachedSize acachedsize[];
                int j;
                if (zone == null)
                {
                    j = 0;
                } else
                {
                    j = zone.length;
                }
                acachedsize = new zone[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zone, 0, acachedsize, 0, j);
                    k = j;
                }
                for (; k < acachedsize.length - 1; k++)
                {
                    acachedsize[k] = new zone();
                    codedinputbytebuffernano.readMessage(acachedsize[k]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[k] = new zone();
                codedinputbytebuffernano.readMessage(acachedsize[k]);
                zone = acachedsize;
                break;

            case 18: // '\022'
                if (refreshZone == null)
                {
                    refreshZone = new refreshZone();
                }
                codedinputbytebuffernano.readMessage(refreshZone);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (zone != null)
        {
            j = i;
            if (zone.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zone.length)
                    {
                        break;
                    }
                    refreshZone refreshzone = zone[k];
                    j = i;
                    if (refreshzone != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, refreshzone);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (refreshZone != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, refreshZone);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (zone != null && zone.length > 0)
        {
            for (int i = 0; i < zone.length; i++)
            {
                mergeFrom mergefrom = zone[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (refreshZone != null)
        {
            codedoutputbytebuffernano.writeMessage(2, refreshZone);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
