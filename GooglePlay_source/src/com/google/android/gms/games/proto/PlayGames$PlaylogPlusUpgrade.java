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

    public int resultCode;
    public int upgradeSource;
    public int upgradeStep;
    public int upgradeSubSource;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (upgradeStep != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, upgradeStep);
        }
        j = i;
        if (upgradeSource != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, upgradeSource);
        }
        i = j;
        if (upgradeSubSource != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, upgradeSubSource);
        }
        j = i;
        if (resultCode != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, resultCode);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof resultCode))
            {
                return false;
            }
            obj = (resultCode)obj;
            if (upgradeStep != ((upgradeStep) (obj)).upgradeStep)
            {
                return false;
            }
            if (upgradeSource != ((upgradeSource) (obj)).upgradeSource)
            {
                return false;
            }
            if (upgradeSubSource != ((upgradeSubSource) (obj)).upgradeSubSource)
            {
                return false;
            }
            if (resultCode != ((resultCode) (obj)).resultCode)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((((getClass().getName().hashCode() + 527) * 31 + upgradeStep) * 31 + upgradeSource) * 31 + upgradeSubSource) * 31 + resultCode;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   8: 66
    //                   16: 123
    //                   24: 223
    //                   32: 234;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
            upgradeStep = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
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
            upgradeSource = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        upgradeSubSource = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L6:
        resultCode = codedinputbytebuffernano.readRawVarint32();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (upgradeStep != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, upgradeStep);
        }
        if (upgradeSource != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, upgradeSource);
        }
        if (upgradeSubSource != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, upgradeSubSource);
        }
        if (resultCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(4, resultCode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        upgradeStep = 0;
        upgradeSource = 0;
        upgradeSubSource = 0;
        resultCode = 0;
        cachedSize = -1;
    }
}
