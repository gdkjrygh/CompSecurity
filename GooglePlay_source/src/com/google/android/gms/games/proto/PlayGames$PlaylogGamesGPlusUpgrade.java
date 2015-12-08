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

    public int state;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (state != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, state);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof state))
            {
                return false;
            }
            obj = (state)obj;
            if (state != ((state) (obj)).state)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (getClass().getName().hashCode() + 527) * 31 + state;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L4:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 40
    //                   8: 42;
           goto _L1 _L2 _L3
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            state = j;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (state != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, state);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        state = 0;
        cachedSize = -1;
    }
}
