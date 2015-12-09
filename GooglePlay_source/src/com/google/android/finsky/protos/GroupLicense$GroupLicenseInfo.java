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
//            GroupLicense

public static final class cachedSize extends MessageNano
{

    public long gaiaGroupId;
    public groupLicenseKey groupLicenseKey;
    public boolean hasGaiaGroupId;
    public boolean hasLicensedOfferType;
    public int licensedOfferType;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (licensedOfferType == 1)
            {
                i = j;
                if (!hasLicensedOfferType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, licensedOfferType);
        }
        int k;
label1:
        {
            if (!hasGaiaGroupId)
            {
                k = i;
                if (gaiaGroupId == 0L)
                {
                    break label1;
                }
            }
            k = i + (CodedOutputByteBufferNano.computeTagSize(2) + 8);
        }
        i = k;
        if (groupLicenseKey != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(3, groupLicenseKey);
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
    //                   8: 58
    //                   17: 144
    //                   26: 160;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
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
            licensedOfferType = j;
            hasLicensedOfferType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        gaiaGroupId = codedinputbytebuffernano.readRawLittleEndian64();
        hasGaiaGroupId = true;
        continue; /* Loop/switch isn't completed */
_L5:
        if (groupLicenseKey == null)
        {
            groupLicenseKey = new groupLicenseKey();
        }
        codedinputbytebuffernano.readMessage(groupLicenseKey);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (licensedOfferType != 1 || hasLicensedOfferType)
        {
            codedoutputbytebuffernano.writeInt32(1, licensedOfferType);
        }
        if (hasGaiaGroupId || gaiaGroupId != 0L)
        {
            codedoutputbytebuffernano.writeFixed64(2, gaiaGroupId);
        }
        if (groupLicenseKey != null)
        {
            codedoutputbytebuffernano.writeMessage(3, groupLicenseKey);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        licensedOfferType = 1;
        hasLicensedOfferType = false;
        gaiaGroupId = 0L;
        hasGaiaGroupId = false;
        groupLicenseKey = null;
        cachedSize = -1;
    }
}
