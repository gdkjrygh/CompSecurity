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
//            FilterRules

public static final class cachedSize extends MessageNano
{

    private static volatile filterInfo _emptyArray[];
    public long androidId;
    public long channelId;
    public int deviceRestriction;
    public filterInfo filterInfo;
    public boolean hasAndroidId;
    public boolean hasChannelId;
    public boolean hasDeviceRestriction;

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
            i = j + (CodedOutputByteBufferNano.computeTagSize(10) + 8);
        }
        int k;
label1:
        {
            if (deviceRestriction == 1)
            {
                k = i;
                if (!hasDeviceRestriction)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(11, deviceRestriction);
        }
label2:
        {
            if (!hasChannelId)
            {
                i = k;
                if (channelId == 0L)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(12, channelId);
        }
        k = i;
        if (filterInfo != null)
        {
            k = i + CodedOutputByteBufferNano.computeMessageSize(15, filterInfo);
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
    //                   81: 66
    //                   88: 82
    //                   96: 212
    //                   122: 228;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        androidId = codedinputbytebuffernano.readRawLittleEndian64();
        hasAndroidId = true;
          goto _L7
_L4:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
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
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
            deviceRestriction = j;
            hasDeviceRestriction = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        channelId = codedinputbytebuffernano.readRawVarint64();
        hasChannelId = true;
        continue; /* Loop/switch isn't completed */
_L6:
        if (filterInfo == null)
        {
            filterInfo = new filterInfo();
        }
        codedinputbytebuffernano.readMessage(filterInfo);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasAndroidId || androidId != 0L)
        {
            codedoutputbytebuffernano.writeFixed64(10, androidId);
        }
        if (deviceRestriction != 1 || hasDeviceRestriction)
        {
            codedoutputbytebuffernano.writeInt32(11, deviceRestriction);
        }
        if (hasChannelId || channelId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(12, channelId);
        }
        if (filterInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(15, filterInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        androidId = 0L;
        hasAndroidId = false;
        deviceRestriction = 1;
        hasDeviceRestriction = false;
        channelId = 0L;
        hasChannelId = false;
        filterInfo = null;
        cachedSize = -1;
    }
}
