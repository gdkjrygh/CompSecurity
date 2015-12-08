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
//            ResolveLink

public static final class cachedSize extends MessageNano
{

    public String detailsUrl;
    public boolean hasDetailsUrl;
    public boolean hasOfferType;
    public boolean hasParentDocid;
    public boolean hasPurchaseDocid;
    public int offerType;
    public String parentDocid;
    public String purchaseDocid;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDetailsUrl)
            {
                i = j;
                if (detailsUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, detailsUrl);
        }
        int k;
label1:
        {
            if (!hasPurchaseDocid)
            {
                k = i;
                if (purchaseDocid.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, purchaseDocid);
        }
label2:
        {
            if (!hasParentDocid)
            {
                i = k;
                if (parentDocid.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, parentDocid);
        }
label3:
        {
            if (offerType == 1)
            {
                k = i;
                if (!hasOfferType)
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(4, offerType);
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
    //                   10: 66
    //                   18: 82
    //                   26: 98
    //                   32: 114;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        detailsUrl = codedinputbytebuffernano.readString();
        hasDetailsUrl = true;
          goto _L7
_L4:
        purchaseDocid = codedinputbytebuffernano.readString();
        hasPurchaseDocid = true;
          goto _L7
_L5:
        parentDocid = codedinputbytebuffernano.readString();
        hasParentDocid = true;
          goto _L7
_L6:
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
            offerType = j;
            hasOfferType = true;
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, detailsUrl);
        }
        if (hasPurchaseDocid || !purchaseDocid.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, purchaseDocid);
        }
        if (hasParentDocid || !parentDocid.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, parentDocid);
        }
        if (offerType != 1 || hasOfferType)
        {
            codedoutputbytebuffernano.writeInt32(4, offerType);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public A()
    {
        detailsUrl = "";
        hasDetailsUrl = false;
        purchaseDocid = "";
        hasPurchaseDocid = false;
        parentDocid = "";
        hasParentDocid = false;
        offerType = 1;
        hasOfferType = false;
        cachedSize = -1;
    }
}
