// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    private static volatile Nano _emptyArray[];
    public int backend;
    public String backendDocid;
    public boolean hasBackend;
    public boolean hasBackendDocid;
    public boolean hasType;
    public int type;

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
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasBackendDocid)
            {
                i = j;
                if (backendDocid.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, backendDocid);
        }
        int k;
label1:
        {
            if (type == 1)
            {
                k = i;
                if (!hasType)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, type);
        }
label2:
        {
            if (backend == 0)
            {
                i = k;
                if (!hasBackend)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, backend);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   10: 58
    //                   16: 74
    //                   24: 276;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        backendDocid = codedinputbytebuffernano.readString();
        hasBackendDocid = true;
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
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
        case 25: // '\031'
        case 26: // '\032'
        case 27: // '\033'
        case 28: // '\034'
        case 29: // '\035'
        case 30: // '\036'
        case 31: // '\037'
        case 32: // ' '
        case 33: // '!'
        case 34: // '"'
        case 35: // '#'
        case 36: // '$'
        case 37: // '%'
        case 38: // '&'
        case 39: // '\''
        case 40: // '('
        case 41: // ')'
            type = j;
            hasType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            backend = k;
            hasBackend = true;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasBackendDocid || !backendDocid.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, backendDocid);
        }
        if (type != 1 || hasType)
        {
            codedoutputbytebuffernano.writeInt32(2, type);
        }
        if (backend != 0 || hasBackend)
        {
            codedoutputbytebuffernano.writeInt32(3, backend);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Nano()
    {
        backendDocid = "";
        hasBackendDocid = false;
        type = 1;
        hasType = false;
        backend = 0;
        hasBackend = false;
        cachedSize = -1;
    }
}
