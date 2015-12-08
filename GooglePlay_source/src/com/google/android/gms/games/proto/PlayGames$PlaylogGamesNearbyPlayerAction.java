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

    public int numNearbyPlayers;
    public int type;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (type != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
        }
        j = i;
        if (numNearbyPlayers != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, numNearbyPlayers);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof numNearbyPlayers))
            {
                return false;
            }
            obj = (numNearbyPlayers)obj;
            if (type != ((type) (obj)).type)
            {
                return false;
            }
            if (numNearbyPlayers != ((numNearbyPlayers) (obj)).numNearbyPlayers)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((getClass().getName().hashCode() + 527) * 31 + type) * 31 + numNearbyPlayers;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L5:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 48
    //                   8: 50
    //                   16: 91;
           goto _L1 _L2 _L3 _L4
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            type = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        numNearbyPlayers = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (type != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, type);
        }
        if (numNearbyPlayers != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, numNearbyPlayers);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Q()
    {
        type = 0;
        numNearbyPlayers = 0;
        cachedSize = -1;
    }
}
