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

    public int onboardingEvent;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (onboardingEvent != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, onboardingEvent);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof onboardingEvent))
            {
                return false;
            }
            obj = (onboardingEvent)obj;
            if (onboardingEvent != ((onboardingEvent) (obj)).onboardingEvent)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (getClass().getName().hashCode() + 527) * 31 + onboardingEvent;
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
            onboardingEvent = j;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (onboardingEvent != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, onboardingEvent);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        onboardingEvent = 0;
        cachedSize = -1;
    }
}
