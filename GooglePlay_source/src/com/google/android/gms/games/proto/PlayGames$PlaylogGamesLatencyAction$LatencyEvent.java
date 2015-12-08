// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    private static volatile deltaMs _emptyArray[];
    public long deltaMs;
    public int eventType;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (eventType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, eventType);
        }
        j = i;
        if (deltaMs != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(2, deltaMs);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof deltaMs))
            {
                return false;
            }
            obj = (deltaMs)obj;
            if (eventType != ((eventType) (obj)).eventType)
            {
                return false;
            }
            if (deltaMs != ((deltaMs) (obj)).deltaMs)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return ((getClass().getName().hashCode() + 527) * 31 + eventType) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
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
    //                   16: 119;
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
        case 8: // '\b'
            eventType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        deltaMs = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (eventType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, eventType);
        }
        if (deltaMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, deltaMs);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Y()
    {
        eventType = 0;
        deltaMs = 0L;
        cachedSize = -1;
    }
}
