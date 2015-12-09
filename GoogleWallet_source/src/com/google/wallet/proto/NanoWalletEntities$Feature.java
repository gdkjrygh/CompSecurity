// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile eTo _emptyArray[];
    public Integer code;

    private clear clear()
    {
        code = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L4:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 200: 
        case 201: 
        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 304: 
        case 305: 
        case 306: 
        case 400: 
        case 500: 
        case 600: 
        case 601: 
        case 700: 
        case 800: 
        case 900: 
        case 1000: 
        case 1101: 
        case 1200: 
        case 1300: 
        case 1301: 
        case 1302: 
        case 1600: 
        case 1601: 
        case 1602: 
        case 1700: 
        case 1800: 
        case 1902: 
            code = Integer.valueOf(j);
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (code != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, code.intValue());
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (code != null)
        {
            codedoutputbytebuffernano.writeInt32(1, code.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
