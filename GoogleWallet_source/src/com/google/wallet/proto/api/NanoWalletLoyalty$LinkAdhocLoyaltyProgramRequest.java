// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    public String backgroundColor;
    public com.google.wallet.proto.est.programIcon barcode;
    public String linkingId;
    public String merchantName;
    public Integer programIcon;
    public String programName;
    public com.google.wallet.proto.est.programIcon renderInfo;
    public programIcon userAddedImage[];

    private clear clear()
    {
        merchantName = null;
        programName = null;
        backgroundColor = null;
        programIcon = null;
        linkingId = null;
        barcode = null;
        renderInfo = null;
        userAddedImage = userAddedImage();
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
    //                   42: 143
    //                   50: 172
    //                   58: 201
    //                   64: 325;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        merchantName = codedinputbytebuffernano.readString();
          goto _L11
_L4:
        programName = codedinputbytebuffernano.readString();
          goto _L11
_L5:
        backgroundColor = codedinputbytebuffernano.readString();
          goto _L11
_L6:
        linkingId = codedinputbytebuffernano.readString();
          goto _L11
_L7:
        if (barcode == null)
        {
            barcode = new com.google.wallet.proto.est.barcode();
        }
        codedinputbytebuffernano.readMessage(barcode);
          goto _L11
_L8:
        if (renderInfo == null)
        {
            renderInfo = new com.google.wallet.proto.est.renderInfo();
        }
        codedinputbytebuffernano.readMessage(renderInfo);
          goto _L11
_L9:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
        cachedSize acachedsize[];
        int j;
        if (userAddedImage == null)
        {
            j = 0;
        } else
        {
            j = userAddedImage.length;
        }
        acachedsize = new userAddedImage[j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(userAddedImage, 0, acachedsize, 0, j);
            l = j;
        }
        for (; l < acachedsize.length - 1; l++)
        {
            acachedsize[l] = new userAddedImage();
            codedinputbytebuffernano.readMessage(acachedsize[l]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[l] = new userAddedImage();
        codedinputbytebuffernano.readMessage(acachedsize[l]);
        userAddedImage = acachedsize;
          goto _L11
_L10:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            programIcon = Integer.valueOf(k);
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (merchantName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
        }
        j = i;
        if (programName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, programName);
        }
        i = j;
        if (backgroundColor != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, backgroundColor);
        }
        j = i;
        if (linkingId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, linkingId);
        }
        int k = j;
        if (barcode != null)
        {
            k = j + CodedOutputByteBufferNano.computeMessageSize(5, barcode);
        }
        i = k;
        if (renderInfo != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(6, renderInfo);
        }
        j = i;
        if (userAddedImage != null)
        {
            j = i;
            if (userAddedImage.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= userAddedImage.length)
                    {
                        break;
                    }
                    programIcon programicon = userAddedImage[l];
                    j = i;
                    if (programicon != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(7, programicon);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (programIcon != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(8, programIcon.intValue());
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (merchantName != null)
        {
            codedoutputbytebuffernano.writeString(1, merchantName);
        }
        if (programName != null)
        {
            codedoutputbytebuffernano.writeString(2, programName);
        }
        if (backgroundColor != null)
        {
            codedoutputbytebuffernano.writeString(3, backgroundColor);
        }
        if (linkingId != null)
        {
            codedoutputbytebuffernano.writeString(4, linkingId);
        }
        if (barcode != null)
        {
            codedoutputbytebuffernano.writeMessage(5, barcode);
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(6, renderInfo);
        }
        if (userAddedImage != null && userAddedImage.length > 0)
        {
            for (int i = 0; i < userAddedImage.length; i++)
            {
                mergeFrom mergefrom = userAddedImage[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(7, mergefrom);
                }
            }

        }
        if (programIcon != null)
        {
            codedoutputbytebuffernano.writeInt32(8, programIcon.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
