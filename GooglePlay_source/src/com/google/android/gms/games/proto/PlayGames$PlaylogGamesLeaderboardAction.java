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

    public String leaderboardId;
    public int leaderboardType;
    public int scoreWindowType;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!leaderboardId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, leaderboardId);
        }
        j = i;
        if (leaderboardType != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, leaderboardType);
        }
        i = j;
        if (scoreWindowType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, scoreWindowType);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof scoreWindowType))
            {
                return false;
            }
            obj = (scoreWindowType)obj;
            if (leaderboardId == null)
            {
                if (((leaderboardId) (obj)).leaderboardId != null)
                {
                    return false;
                }
            } else
            if (!leaderboardId.equals(((leaderboardId) (obj)).leaderboardId))
            {
                return false;
            }
            if (leaderboardType != ((leaderboardType) (obj)).leaderboardType)
            {
                return false;
            }
            if (scoreWindowType != ((scoreWindowType) (obj)).scoreWindowType)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int i;
        if (leaderboardId == null)
        {
            i = 0;
        } else
        {
            i = leaderboardId.hashCode();
        }
        return (((j + 527) * 31 + i) * 31 + leaderboardType) * 31 + scoreWindowType;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   10: 58
    //                   16: 69
    //                   24: 111;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        leaderboardId = codedinputbytebuffernano.readString();
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            leaderboardType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            scoreWindowType = k;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!leaderboardId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, leaderboardId);
        }
        if (leaderboardType != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, leaderboardType);
        }
        if (scoreWindowType != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, scoreWindowType);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        leaderboardId = "";
        leaderboardType = 0;
        scoreWindowType = 0;
        cachedSize = -1;
    }
}
