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

    public long elapsedTimeMillis;
    public long sessionId;
    public int status;
    public int step;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (step != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, step);
        }
        j = i;
        if (sessionId != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, sessionId);
        }
        i = j;
        if (status != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, status);
        }
        j = i;
        if (elapsedTimeMillis != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(4, elapsedTimeMillis);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof elapsedTimeMillis))
            {
                return false;
            }
            obj = (elapsedTimeMillis)obj;
            if (step != ((step) (obj)).step)
            {
                return false;
            }
            if (sessionId != ((sessionId) (obj)).sessionId)
            {
                return false;
            }
            if (status != ((status) (obj)).status)
            {
                return false;
            }
            if (elapsedTimeMillis != ((elapsedTimeMillis) (obj)).elapsedTimeMillis)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((((getClass().getName().hashCode() + 527) * 31 + step) * 31 + (int)(sessionId ^ sessionId >>> 32)) * 31 + status) * 31 + (int)(elapsedTimeMillis ^ elapsedTimeMillis >>> 32);
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
    //                   16: 199
    //                   24: 210
    //                   32: 221;
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
            step = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        sessionId = codedinputbytebuffernano.readRawVarint64();
        continue; /* Loop/switch isn't completed */
_L5:
        status = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L6:
        elapsedTimeMillis = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (step != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, step);
        }
        if (sessionId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, sessionId);
        }
        if (status != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, status);
        }
        if (elapsedTimeMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(4, elapsedTimeMillis);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        step = 0;
        sessionId = 0L;
        status = 0;
        elapsedTimeMillis = 0L;
        cachedSize = -1;
    }
}
