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
//            MusicDocDetails

public static final class cachedSize extends MessageNano
{

    public displayArtist details;
    public  displayArtist;
    public boolean hasName;
    public String name;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasName)
            {
                i = j;
                if (name.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, name);
        }
        int k = i;
        if (details != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(2, details);
        }
        i = k;
        if (displayArtist != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(3, displayArtist);
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
                name = codedinputbytebuffernano.readString();
                hasName = true;
                break;

            case 18: // '\022'
                if (details == null)
                {
                    details = new <init>();
                }
                codedinputbytebuffernano.readMessage(details);
                break;

            case 26: // '\032'
                if (displayArtist == null)
                {
                    displayArtist = new ();
                }
                codedinputbytebuffernano.readMessage(displayArtist);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasName || !name.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, name);
        }
        if (details != null)
        {
            codedoutputbytebuffernano.writeMessage(2, details);
        }
        if (displayArtist != null)
        {
            codedoutputbytebuffernano.writeMessage(3, displayArtist);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        name = "";
        hasName = false;
        details = null;
        displayArtist = null;
        cachedSize = -1;
    }
}
