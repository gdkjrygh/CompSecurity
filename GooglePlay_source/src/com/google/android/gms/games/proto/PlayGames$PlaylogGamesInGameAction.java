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

    public tion leaderboard;
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
        if (leaderboard != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, leaderboard);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof leaderboard))
        {
            return false;
        }
        obj = (leaderboard)obj;
        if (type != ((type) (obj)).type)
        {
            return false;
        }
        if (leaderboard != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((leaderboard) (obj)).leaderboard == null) goto _L1; else goto _L3
_L3:
        return false;
        if (leaderboard.equals(((tion.equals) (obj)).leaderboard)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = type;
        int i;
        if (leaderboard == null)
        {
            i = 0;
        } else
        {
            i = leaderboard.hashCode();
        }
        return i + ((j + 527) * 31 + k) * 31;
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
    //                   18: 263;
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
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
        case 42: // '*'
        case 43: // '+'
        case 44: // ','
            type = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (leaderboard == null)
        {
            leaderboard = new tion();
        }
        codedinputbytebuffernano.readMessage(leaderboard);
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
        if (leaderboard != null)
        {
            codedoutputbytebuffernano.writeMessage(2, leaderboard);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tion()
    {
        type = 0;
        leaderboard = null;
        cachedSize = -1;
    }
}
