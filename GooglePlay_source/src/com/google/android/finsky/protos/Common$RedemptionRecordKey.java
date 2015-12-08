// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            Common

public static final class cachedSize extends MessageNano
{

    public long campaignId;
    public long codeGroupId;
    public boolean hasCampaignId;
    public boolean hasCodeGroupId;
    public boolean hasPublisherId;
    public boolean hasRecordId;
    public boolean hasType;
    public long publisherId;
    public long recordId;
    public int type;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasPublisherId)
            {
                i = j;
                if (publisherId == 0L)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, publisherId);
        }
        int k;
label1:
        {
            if (!hasCampaignId)
            {
                k = i;
                if (campaignId == 0L)
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt64Size(2, campaignId);
        }
label2:
        {
            if (!hasCodeGroupId)
            {
                i = k;
                if (codeGroupId == 0L)
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt64Size(3, codeGroupId);
        }
label3:
        {
            if (!hasRecordId)
            {
                k = i;
                if (recordId == 0L)
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt64Size(4, recordId);
        }
label4:
        {
            if (type == 1)
            {
                i = k;
                if (!hasType)
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeInt32Size(5, type);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 72
    //                   8: 74
    //                   16: 90
    //                   24: 106
    //                   32: 122
    //                   40: 138;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        publisherId = codedinputbytebuffernano.readRawVarint64();
        hasPublisherId = true;
          goto _L8
_L4:
        campaignId = codedinputbytebuffernano.readRawVarint64();
        hasCampaignId = true;
          goto _L8
_L5:
        codeGroupId = codedinputbytebuffernano.readRawVarint64();
        hasCodeGroupId = true;
          goto _L8
_L6:
        recordId = codedinputbytebuffernano.readRawVarint64();
        hasRecordId = true;
          goto _L8
_L7:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            type = j;
            hasType = true;
            break;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasPublisherId || publisherId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, publisherId);
        }
        if (hasCampaignId || campaignId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(2, campaignId);
        }
        if (hasCodeGroupId || codeGroupId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, codeGroupId);
        }
        if (hasRecordId || recordId != 0L)
        {
            codedoutputbytebuffernano.writeInt64(4, recordId);
        }
        if (type != 1 || hasType)
        {
            codedoutputbytebuffernano.writeInt32(5, type);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        type = 1;
        hasType = false;
        publisherId = 0L;
        hasPublisherId = false;
        campaignId = 0L;
        hasCampaignId = false;
        codeGroupId = 0L;
        hasCodeGroupId = false;
        recordId = 0L;
        hasRecordId = false;
        cachedSize = -1;
    }
}
