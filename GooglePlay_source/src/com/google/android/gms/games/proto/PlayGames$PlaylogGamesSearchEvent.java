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

public static final class clear extends MessageNano
{

    public String query;
    public int type;

    public final clear clear()
    {
        type = 0;
        query = "";
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (type != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
        }
        j = i;
        if (!query.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, query);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof query))
        {
            return false;
        }
        obj = (query)obj;
        if (type != ((type) (obj)).type)
        {
            return false;
        }
        if (query != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((query) (obj)).query == null) goto _L1; else goto _L3
_L3:
        return false;
        if (query.equals(((query) (obj)).query)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = type;
        int i;
        if (query == null)
        {
            i = 0;
        } else
        {
            i = query.hashCode();
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
    //                   18: 95;
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
            type = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        query = codedinputbytebuffernano.readString();
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
        if (!query.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, query);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
