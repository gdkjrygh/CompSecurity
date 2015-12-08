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
//            AppDocDetails

public static final class cachedSize extends MessageNano
{

    public boolean hasSubscriptionPeriod;
    public int subscriptionPeriod;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (subscriptionPeriod == 1)
            {
                i = j;
                if (!hasSubscriptionPeriod)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, subscriptionPeriod);
        }
        return i;
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
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            subscriptionPeriod = j;
            hasSubscriptionPeriod = true;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (subscriptionPeriod != 1 || hasSubscriptionPeriod)
        {
            codedoutputbytebuffernano.writeInt32(1, subscriptionPeriod);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        subscriptionPeriod = 1;
        hasSubscriptionPeriod = false;
        cachedSize = -1;
    }
}
