// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public int count;
    public boolean hasCount;
    public boolean hasUnit;
    public int unit;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (unit == 0)
            {
                i = j;
                if (!hasUnit)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, unit);
        }
        int k;
label1:
        {
            if (!hasCount)
            {
                k = i;
                if (count == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, count);
        }
        return k;
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
    //                   16: 120;
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
            unit = j;
            hasUnit = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        count = codedinputbytebuffernano.readRawVarint32();
        hasCount = true;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (unit != 0 || hasUnit)
        {
            codedoutputbytebuffernano.writeInt32(1, unit);
        }
        if (hasCount || count != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, count);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        unit = 0;
        hasUnit = false;
        count = 0;
        hasCount = false;
        cachedSize = -1;
    }
}
