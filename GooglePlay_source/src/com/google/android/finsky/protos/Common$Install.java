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

    private static volatile no _emptyArray[];
    public long androidId;
    public boolean bundled;
    public boolean hasAndroidId;
    public boolean hasBundled;
    public boolean hasLastUpdateTimestampMillis;
    public boolean hasPending;
    public boolean hasVersion;
    public long lastUpdateTimestampMillis;
    public boolean pending;
    public int version;

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
            if (!hasAndroidId)
            {
                i = j;
                if (androidId == 0L)
                {
                    break label0;
                }
            }
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 8);
        }
        int k;
label1:
        {
            if (!hasVersion)
            {
                k = i;
                if (version == 0)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(2, version);
        }
label2:
        {
            if (!hasBundled)
            {
                i = k;
                if (!bundled)
                {
                    break label2;
                }
            }
            i = k + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
        }
label3:
        {
            if (!hasPending)
            {
                k = i;
                if (!pending)
                {
                    break label3;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
        }
label4:
        {
            if (!hasLastUpdateTimestampMillis)
            {
                i = k;
                if (lastUpdateTimestampMillis == 0L)
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(5, lastUpdateTimestampMillis);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 9: // '\t'
                androidId = codedinputbytebuffernano.readRawLittleEndian64();
                hasAndroidId = true;
                break;

            case 16: // '\020'
                version = codedinputbytebuffernano.readRawVarint32();
                hasVersion = true;
                break;

            case 24: // '\030'
                bundled = codedinputbytebuffernano.readBool();
                hasBundled = true;
                break;

            case 32: // ' '
                pending = codedinputbytebuffernano.readBool();
                hasPending = true;
                break;

            case 40: // '('
                lastUpdateTimestampMillis = codedinputbytebuffernano.readRawVarint64();
                hasLastUpdateTimestampMillis = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasAndroidId || androidId != 0L)
        {
            codedoutputbytebuffernano.writeFixed64(1, androidId);
        }
        if (hasVersion || version != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, version);
        }
        if (hasBundled || bundled)
        {
            codedoutputbytebuffernano.writeBool(3, bundled);
        }
        if (hasPending || pending)
        {
            codedoutputbytebuffernano.writeBool(4, pending);
        }
        if (hasLastUpdateTimestampMillis || lastUpdateTimestampMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(5, lastUpdateTimestampMillis);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public no()
    {
        androidId = 0L;
        hasAndroidId = false;
        version = 0;
        hasVersion = false;
        bundled = false;
        hasBundled = false;
        pending = false;
        hasPending = false;
        lastUpdateTimestampMillis = 0L;
        hasLastUpdateTimestampMillis = false;
        cachedSize = -1;
    }
}
