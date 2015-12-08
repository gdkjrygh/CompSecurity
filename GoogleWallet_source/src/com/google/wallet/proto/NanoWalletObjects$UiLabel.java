// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletObjects

public static final class clear extends ExtendableMessageNano
{

    public String iconUrl;
    public String imageUrl;
    public Long labelOrdinal;
    public String localizedTitle;
    public Integer mainNavDisplayPolicy;
    public Boolean showInMainNav;

    private clear clear()
    {
        labelOrdinal = null;
        localizedTitle = null;
        mainNavDisplayPolicy = null;
        showInMainNav = null;
        imageUrl = null;
        iconUrl = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   18: 97
    //                   24: 108
    //                   32: 122
    //                   42: 170
    //                   50: 181;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        labelOrdinal = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L9
_L4:
        localizedTitle = codedinputbytebuffernano.readString();
          goto _L9
_L5:
        showInMainNav = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L9
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            mainNavDisplayPolicy = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        imageUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L8:
        iconUrl = codedinputbytebuffernano.readString();
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (labelOrdinal != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, labelOrdinal.longValue());
        }
        j = i;
        if (localizedTitle != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, localizedTitle);
        }
        i = j;
        if (showInMainNav != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, showInMainNav.booleanValue());
        }
        j = i;
        if (mainNavDisplayPolicy != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, mainNavDisplayPolicy.intValue());
        }
        i = j;
        if (imageUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, imageUrl);
        }
        j = i;
        if (iconUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, iconUrl);
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
        if (labelOrdinal != null)
        {
            codedoutputbytebuffernano.writeInt64(1, labelOrdinal.longValue());
        }
        if (localizedTitle != null)
        {
            codedoutputbytebuffernano.writeString(2, localizedTitle);
        }
        if (showInMainNav != null)
        {
            codedoutputbytebuffernano.writeBool(3, showInMainNav.booleanValue());
        }
        if (mainNavDisplayPolicy != null)
        {
            codedoutputbytebuffernano.writeInt32(4, mainNavDisplayPolicy.intValue());
        }
        if (imageUrl != null)
        {
            codedoutputbytebuffernano.writeString(5, imageUrl);
        }
        if (iconUrl != null)
        {
            codedoutputbytebuffernano.writeString(6, iconUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
