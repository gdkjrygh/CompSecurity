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

    public boolean added;
    public int source;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (source != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, source);
        }
        j = i;
        if (added)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof added))
            {
                return false;
            }
            obj = (added)obj;
            if (source != ((source) (obj)).source)
            {
                return false;
            }
            if (added != ((added) (obj)).added)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i = getClass().getName().hashCode();
        int j = source;
        char c;
        if (added)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c + ((i + 527) * 31 + j) * 31;
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
    //                   16: 111;
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
            source = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        added = codedinputbytebuffernano.readBool();
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (source != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, source);
        }
        if (added)
        {
            codedoutputbytebuffernano.writeBool(2, added);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        source = 0;
        added = false;
        cachedSize = -1;
    }
}
