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

    public String discoveryTid;
    public int rankingPosition;
    public int section;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (section != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, section);
        }
        j = i;
        if (!discoveryTid.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, discoveryTid);
        }
        i = j;
        if (rankingPosition != 0)
        {
            i = j + CodedOutputByteBufferNano.computeUInt32Size(3, rankingPosition);
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
            if (section != ((section) (obj)).section)
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
        int j = getClass().getName().hashCode();
        int k = section;
        int i;
        if (discoveryTid == null)
        {
            i = 0;
        } else
        {
            i = discoveryTid.hashCode();
        }
        return (((j + 527) * 31 + k) * 31 + i) * 31 + rankingPosition;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   8: 58
    //                   18: 111
    //                   24: 122;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
            section = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        discoveryTid = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        rankingPosition = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (section != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, section);
        }
        if (!discoveryTid.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, discoveryTid);
        }
        if (rankingPosition != 0)
        {
            codedoutputbytebuffernano.writeUInt32(3, rankingPosition);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        section = 0;
        discoveryTid = "";
        rankingPosition = 0;
        cachedSize = -1;
    }
}
