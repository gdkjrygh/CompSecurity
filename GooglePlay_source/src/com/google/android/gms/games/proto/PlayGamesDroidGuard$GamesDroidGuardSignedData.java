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
//            PlayGamesDroidGuard

public static final class cachedSize extends MessageNano
{

    public submittedScore submittedScore;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (submittedScore != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, submittedScore);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof submittedScore))
        {
            return false;
        }
        obj = (submittedScore)obj;
        if (submittedScore != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((submittedScore) (obj)).submittedScore == null) goto _L1; else goto _L3
_L3:
        return false;
        if (submittedScore.quals(((quals) (obj)).submittedScore)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int i;
        if (submittedScore == null)
        {
            i = 0;
        } else
        {
            i = submittedScore.ashCode();
        }
        return i + (j + 527) * 31;
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
                if (submittedScore == null)
                {
                    submittedScore = new init>();
                }
                codedinputbytebuffernano.readMessage(submittedScore);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (submittedScore != null)
        {
            codedoutputbytebuffernano.writeMessage(1, submittedScore);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        submittedScore = null;
        cachedSize = -1;
    }
}
