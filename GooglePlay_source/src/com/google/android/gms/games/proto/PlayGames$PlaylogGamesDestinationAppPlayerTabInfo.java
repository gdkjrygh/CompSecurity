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

    public int collection;
    public String discoveryTid;
    public boolean topOfList;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (collection != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, collection);
        }
        j = i;
        if (topOfList)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
        }
        i = j;
        if (!discoveryTid.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, discoveryTid);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof discoveryTid))
        {
            return false;
        }
        obj = (discoveryTid)obj;
        if (collection != ((collection) (obj)).collection)
        {
            return false;
        }
        if (topOfList != ((topOfList) (obj)).topOfList)
        {
            return false;
        }
        if (discoveryTid != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((discoveryTid) (obj)).discoveryTid == null) goto _L1; else goto _L3
_L3:
        return false;
        if (discoveryTid.equals(((discoveryTid) (obj)).discoveryTid)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = collection;
        char c;
        int i;
        if (topOfList)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (discoveryTid == null)
        {
            i = 0;
        } else
        {
            i = discoveryTid.hashCode();
        }
        return i + (((j + 527) * 31 + k) * 31 + c) * 31;
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
    //                   16: 107
    //                   26: 118;
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
            collection = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        topOfList = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L5:
        discoveryTid = codedinputbytebuffernano.readString();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (collection != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, collection);
        }
        if (topOfList)
        {
            codedoutputbytebuffernano.writeBool(2, topOfList);
        }
        if (!discoveryTid.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, discoveryTid);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        collection = 0;
        topOfList = false;
        discoveryTid = "";
        cachedSize = -1;
    }
}
