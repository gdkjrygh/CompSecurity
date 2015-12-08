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
//            AppDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile splitId _emptyArray[];
    public int fileType;
    public boolean hasFileType;
    public boolean hasSize;
    public boolean hasSplitId;
    public boolean hasVersionCode;
    public long size;
    public String splitId;
    public int versionCode;

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
            if (fileType == 0)
            {
                i = j;
                if (!hasFileType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, fileType);
        }
        int k;
label1:
        {
            if (!hasVersionCode)
            {
                k = i;
                if (versionCode == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, versionCode);
        }
label2:
        {
            if (!hasSize)
            {
                i = k;
                if (size == 0L)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(3, size);
        }
label3:
        {
            if (!hasSplitId)
            {
                k = i;
                if (splitId.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, splitId);
        }
        return k;
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
    //                   16: 116
    //                   24: 132
    //                   34: 148;
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
            fileType = j;
            hasFileType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        versionCode = codedinputbytebuffernano.readRawVarint32();
        hasVersionCode = true;
        continue; /* Loop/switch isn't completed */
_L5:
        size = codedinputbytebuffernano.readRawVarint64();
        hasSize = true;
        continue; /* Loop/switch isn't completed */
_L6:
        splitId = codedinputbytebuffernano.readString();
        hasSplitId = true;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (fileType != 0 || hasFileType)
        {
            codedoutputbytebuffernano.writeInt32(1, fileType);
        }
        if (hasVersionCode || versionCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, versionCode);
        }
        if (hasSize || size != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, size);
        }
        if (hasSplitId || !splitId.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, splitId);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        fileType = 0;
        hasFileType = false;
        versionCode = 0;
        hasVersionCode = false;
        size = 0L;
        hasSize = false;
        splitId = "";
        hasSplitId = false;
        cachedSize = -1;
    }
}
