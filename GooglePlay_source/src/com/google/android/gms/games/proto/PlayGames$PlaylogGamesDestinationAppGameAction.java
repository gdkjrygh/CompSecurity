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

    public String applicationId;
    public String discoveryTid;
    public e gamePurchase;
    public boolean launchedGame;
    public e leaderboard;
    public int rankingPosition;
    public int section;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (!applicationId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, applicationId);
        }
        j = i;
        if (section != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, section);
        }
        i = j;
        if (launchedGame)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
        }
        j = i;
        if (leaderboard != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, leaderboard);
        }
        i = j;
        if (gamePurchase != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, gamePurchase);
        }
        j = i;
        if (!discoveryTid.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, discoveryTid);
        }
        i = j;
        if (rankingPosition != 0)
        {
            i = j + CodedOutputByteBufferNano.computeUInt32Size(7, rankingPosition);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof rankingPosition))
            {
                return false;
            }
            obj = (rankingPosition)obj;
            if (applicationId == null)
            {
                if (((applicationId) (obj)).applicationId != null)
                {
                    return false;
                }
            } else
            if (!applicationId.equals(((applicationId) (obj)).applicationId))
            {
                return false;
            }
            if (section != ((section) (obj)).section)
            {
                return false;
            }
            if (launchedGame != ((launchedGame) (obj)).launchedGame)
            {
                return false;
            }
            if (leaderboard == null)
            {
                if (((leaderboard) (obj)).leaderboard != null)
                {
                    return false;
                }
            } else
            if (!leaderboard.leaderboard(((leaderboard) (obj)).leaderboard))
            {
                return false;
            }
            if (gamePurchase == null)
            {
                if (((gamePurchase) (obj)).gamePurchase != null)
                {
                    return false;
                }
            } else
            if (!gamePurchase.equals(((e.equals) (obj)).gamePurchase))
            {
                return false;
            }
            if (discoveryTid == null)
            {
                if (((discoveryTid) (obj)).discoveryTid != null)
                {
                    return false;
                }
            } else
            if (!discoveryTid.equals(((discoveryTid) (obj)).discoveryTid))
            {
                return false;
            }
            if (rankingPosition != ((rankingPosition) (obj)).rankingPosition)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int l = 0;
        int i1 = getClass().getName().hashCode();
        int i;
        char c;
        int j;
        int k;
        int j1;
        if (applicationId == null)
        {
            i = 0;
        } else
        {
            i = applicationId.hashCode();
        }
        j1 = section;
        if (launchedGame)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (leaderboard == null)
        {
            j = 0;
        } else
        {
            j = leaderboard.e();
        }
        if (gamePurchase == null)
        {
            k = 0;
        } else
        {
            k = gamePurchase.hashCode();
        }
        if (discoveryTid != null)
        {
            l = discoveryTid.hashCode();
        }
        return (((((((i1 + 527) * 31 + i) * 31 + j1) * 31 + c) * 31 + j) * 31 + k) * 31 + l) * 31 + rankingPosition;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 88
    //                   10: 90
    //                   16: 101
    //                   24: 155
    //                   34: 166
    //                   42: 195
    //                   50: 224
    //                   56: 235;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        applicationId = codedinputbytebuffernano.readString();
          goto _L10
_L4:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            section = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        launchedGame = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L6:
        if (leaderboard == null)
        {
            leaderboard = new leaderboard();
        }
        codedinputbytebuffernano.readMessage(leaderboard);
        continue; /* Loop/switch isn't completed */
_L7:
        if (gamePurchase == null)
        {
            gamePurchase = new e();
        }
        codedinputbytebuffernano.readMessage(gamePurchase);
        continue; /* Loop/switch isn't completed */
_L8:
        discoveryTid = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        rankingPosition = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (!applicationId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, applicationId);
        }
        if (section != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, section);
        }
        if (launchedGame)
        {
            codedoutputbytebuffernano.writeBool(3, launchedGame);
        }
        if (leaderboard != null)
        {
            codedoutputbytebuffernano.writeMessage(4, leaderboard);
        }
        if (gamePurchase != null)
        {
            codedoutputbytebuffernano.writeMessage(5, gamePurchase);
        }
        if (!discoveryTid.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, discoveryTid);
        }
        if (rankingPosition != 0)
        {
            codedoutputbytebuffernano.writeUInt32(7, rankingPosition);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public e()
    {
        applicationId = "";
        section = 0;
        launchedGame = false;
        leaderboard = null;
        gamePurchase = null;
        discoveryTid = "";
        rankingPosition = 0;
        cachedSize = -1;
    }
}
