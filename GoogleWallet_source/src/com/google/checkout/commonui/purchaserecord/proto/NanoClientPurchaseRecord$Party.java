// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoClientPurchaseRecord

public static final class clear extends ExtendableMessageNano
{

    public com.google.checkout.customer.purchaserecord.definitions.shared.ng address;
    public String displayName;
    public String email;
    public String phone;
    public Integer role;
    public String taxIdInfoString;
    public String thumbnailUrl;
    public String url;

    private clear clear()
    {
        displayName = null;
        email = null;
        phone = null;
        address = null;
        url = null;
        thumbnailUrl = null;
        role = null;
        taxIdInfoString = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 110
    //                   26: 121
    //                   34: 132
    //                   42: 161
    //                   50: 172
    //                   56: 183
    //                   66: 226;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        displayName = codedinputbytebuffernano.readString();
          goto _L11
_L4:
        email = codedinputbytebuffernano.readString();
          goto _L11
_L5:
        phone = codedinputbytebuffernano.readString();
          goto _L11
_L6:
        if (address == null)
        {
            address = new com.google.checkout.customer.purchaserecord.definitions.shared.ield();
        }
        codedinputbytebuffernano.readMessage(address);
          goto _L11
_L7:
        url = codedinputbytebuffernano.readString();
          goto _L11
_L8:
        thumbnailUrl = codedinputbytebuffernano.readString();
          goto _L11
_L9:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            role = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        taxIdInfoString = codedinputbytebuffernano.readString();
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (displayName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, displayName);
        }
        j = i;
        if (email != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, email);
        }
        i = j;
        if (phone != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, phone);
        }
        j = i;
        if (address != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(4, address);
        }
        i = j;
        if (url != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, url);
        }
        j = i;
        if (thumbnailUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, thumbnailUrl);
        }
        i = j;
        if (role != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(7, role.intValue());
        }
        j = i;
        if (taxIdInfoString != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, taxIdInfoString);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (displayName != null)
        {
            codedoutputbytebuffernano.writeString(1, displayName);
        }
        if (email != null)
        {
            codedoutputbytebuffernano.writeString(2, email);
        }
        if (phone != null)
        {
            codedoutputbytebuffernano.writeString(3, phone);
        }
        if (address != null)
        {
            codedoutputbytebuffernano.writeMessage(4, address);
        }
        if (url != null)
        {
            codedoutputbytebuffernano.writeString(5, url);
        }
        if (thumbnailUrl != null)
        {
            codedoutputbytebuffernano.writeString(6, thumbnailUrl);
        }
        if (role != null)
        {
            codedoutputbytebuffernano.writeInt32(7, role.intValue());
        }
        if (taxIdInfoString != null)
        {
            codedoutputbytebuffernano.writeString(8, taxIdInfoString);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public s()
    {
        clear();
    }
}
