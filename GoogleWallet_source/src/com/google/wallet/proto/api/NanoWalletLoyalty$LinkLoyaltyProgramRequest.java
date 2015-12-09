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

    public com.google.wallet.proto.est.userAddedImage barcode;
    public Boolean forDifferentUser;
    public String linkingId;
    public String programId;
    public Integer programStatus;
    public Boolean promotionalEmailOptIn;
    public com.google.wallet.proto.est.userAddedImage renderInfo;
    public userAddedImage sharedDataValues[];
    public userAddedImage userAddedImage[];

    private clear clear()
    {
        programId = null;
        linkingId = null;
        barcode = null;
        promotionalEmailOptIn = null;
        sharedDataValues = ();
        renderInfo = null;
        programStatus = null;
        forDifferentUser = null;
        userAddedImage = y();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 118
    //                   26: 129
    //                   34: 253
    //                   40: 282
    //                   50: 296
    //                   64: 325
    //                   72: 378
    //                   82: 392;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        programId = codedinputbytebuffernano.readString();
          goto _L12
_L4:
        linkingId = codedinputbytebuffernano.readString();
          goto _L12
_L5:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        cachedSize acachedsize[];
        int j;
        if (sharedDataValues == null)
        {
            j = 0;
        } else
        {
            j = sharedDataValues.length;
        }
        acachedsize = new sharedDataValues[j + i1];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(sharedDataValues, 0, acachedsize, 0, j);
            i1 = j;
        }
        for (; i1 < acachedsize.length - 1; i1++)
        {
            acachedsize[i1] = new sharedDataValues();
            codedinputbytebuffernano.readMessage(acachedsize[i1]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[i1] = new sharedDataValues();
        codedinputbytebuffernano.readMessage(acachedsize[i1]);
        sharedDataValues = acachedsize;
          goto _L12
_L6:
        if (renderInfo == null)
        {
            renderInfo = new com.google.wallet.proto.();
        }
        codedinputbytebuffernano.readMessage(renderInfo);
          goto _L12
_L7:
        promotionalEmailOptIn = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L12
_L8:
        if (barcode == null)
        {
            barcode = new com.google.wallet.proto.est.barcode();
        }
        codedinputbytebuffernano.readMessage(barcode);
          goto _L12
_L9:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            programStatus = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        forDifferentUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L11:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
        cachedSize acachedsize1[];
        int l;
        if (userAddedImage == null)
        {
            l = 0;
        } else
        {
            l = userAddedImage.length;
        }
        acachedsize1 = new userAddedImage[l + j1];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(userAddedImage, 0, acachedsize1, 0, l);
            j1 = l;
        }
        for (; j1 < acachedsize1.length - 1; j1++)
        {
            acachedsize1[j1] = new userAddedImage();
            codedinputbytebuffernano.readMessage(acachedsize1[j1]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize1[j1] = new userAddedImage();
        codedinputbytebuffernano.readMessage(acachedsize1[j1]);
        userAddedImage = acachedsize1;
        if (true) goto _L12; else goto _L13
_L13:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (programId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, programId);
        }
        i = j;
        if (linkingId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, linkingId);
        }
        j = i;
        if (sharedDataValues != null)
        {
            j = i;
            if (sharedDataValues.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= sharedDataValues.length)
                    {
                        break;
                    }
                    userAddedImage useraddedimage = sharedDataValues[l];
                    j = i;
                    if (useraddedimage != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, useraddedimage);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(4, renderInfo);
        }
        j = i;
        if (promotionalEmailOptIn != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(5, promotionalEmailOptIn.booleanValue());
        }
        i = j;
        if (barcode != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(6, barcode);
        }
        j = i;
        if (programStatus != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, programStatus.intValue());
        }
        i = j;
        if (forDifferentUser != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(9, forDifferentUser.booleanValue());
        }
        int i1 = i;
        if (userAddedImage != null)
        {
            i1 = i;
            if (userAddedImage.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= userAddedImage.length)
                    {
                        break;
                    }
                    userAddedImage useraddedimage1 = userAddedImage[k];
                    i1 = i;
                    if (useraddedimage1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(10, useraddedimage1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (programId != null)
        {
            codedoutputbytebuffernano.writeString(1, programId);
        }
        if (linkingId != null)
        {
            codedoutputbytebuffernano.writeString(2, linkingId);
        }
        if (sharedDataValues != null && sharedDataValues.length > 0)
        {
            for (int i = 0; i < sharedDataValues.length; i++)
            {
                mergeFrom mergefrom = sharedDataValues[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom);
                }
            }

        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(4, renderInfo);
        }
        if (promotionalEmailOptIn != null)
        {
            codedoutputbytebuffernano.writeBool(5, promotionalEmailOptIn.booleanValue());
        }
        if (barcode != null)
        {
            codedoutputbytebuffernano.writeMessage(6, barcode);
        }
        if (programStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(8, programStatus.intValue());
        }
        if (forDifferentUser != null)
        {
            codedoutputbytebuffernano.writeBool(9, forDifferentUser.booleanValue());
        }
        if (userAddedImage != null && userAddedImage.length > 0)
        {
            for (int j = 0; j < userAddedImage.length; j++)
            {
                mergeFrom mergefrom1 = userAddedImage[j];
                if (mergefrom1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(10, mergefrom1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
