// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.server.core.errors.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.api.server.core.errors.proto:
//            Output

public static final class cachedSize extends MessageNano
{

    private static volatile debugInfo _emptyArray[];
    public String debugInfo;
    public String domain;
    public String extendedHelp;
    public String location;
    public Integer locationType;
    public String message;
    public String reason;

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
        if (message != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, message);
        }
        j = i;
        if (domain != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, domain);
        }
        i = j;
        if (reason != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, reason);
        }
        j = i;
        if (extendedHelp != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, extendedHelp);
        }
        i = j;
        if (locationType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, locationType.intValue());
        }
        j = i;
        if (location != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, location);
        }
        i = j;
        if (debugInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, debugInfo);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L10:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 88
    //                   10: 90
    //                   18: 101
    //                   26: 112
    //                   34: 123
    //                   40: 134
    //                   50: 186
    //                   58: 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        message = codedinputbytebuffernano.readString();
          goto _L10
_L4:
        domain = codedinputbytebuffernano.readString();
          goto _L10
_L5:
        reason = codedinputbytebuffernano.readString();
          goto _L10
_L6:
        extendedHelp = codedinputbytebuffernano.readString();
          goto _L10
_L7:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            locationType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        location = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        debugInfo = codedinputbytebuffernano.readString();
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (message != null)
        {
            codedoutputbytebuffernano.writeString(1, message);
        }
        if (domain != null)
        {
            codedoutputbytebuffernano.writeString(2, domain);
        }
        if (reason != null)
        {
            codedoutputbytebuffernano.writeString(3, reason);
        }
        if (extendedHelp != null)
        {
            codedoutputbytebuffernano.writeString(4, extendedHelp);
        }
        if (locationType != null)
        {
            codedoutputbytebuffernano.writeInt32(5, locationType.intValue());
        }
        if (location != null)
        {
            codedoutputbytebuffernano.writeString(6, location);
        }
        if (debugInfo != null)
        {
            codedoutputbytebuffernano.writeString(7, debugInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        message = null;
        domain = null;
        reason = null;
        extendedHelp = null;
        locationType = null;
        location = null;
        debugInfo = null;
        cachedSize = -1;
    }
}
