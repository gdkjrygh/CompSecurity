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
//            DocAnnotations

public static final class cachedSize extends MessageNano
{

    private static volatile uriBackend _emptyArray[];
    public boolean hasUri;
    public boolean hasUriBackend;
    public Link resolvedLink;
    public String uri;
    public int uriBackend;

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
            if (!hasUri)
            {
                i = j;
                if (uri.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, uri);
        }
label1:
        {
            int k = i;
            if (resolvedLink != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, resolvedLink);
            }
            if (uriBackend == 0)
            {
                i = k;
                if (!hasUriBackend)
                {
                    break label1;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(3, uriBackend);
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
    //                   18: 74
    //                   24: 103;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        uri = codedinputbytebuffernano.readString();
        hasUri = true;
          goto _L6
_L4:
        if (resolvedLink == null)
        {
            resolvedLink = new Link();
        }
        codedinputbytebuffernano.readMessage(resolvedLink);
          goto _L6
_L5:
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            uriBackend = j;
            hasUriBackend = true;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasUri || !uri.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, uri);
        }
        if (resolvedLink != null)
        {
            codedoutputbytebuffernano.writeMessage(2, resolvedLink);
        }
        if (uriBackend != 0 || hasUriBackend)
        {
            codedoutputbytebuffernano.writeInt32(3, uriBackend);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Link()
    {
        uri = "";
        hasUri = false;
        uriBackend = 0;
        hasUriBackend = false;
        resolvedLink = null;
        cachedSize = -1;
    }
}
