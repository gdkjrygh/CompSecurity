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

    public Boolean forDifferentUser;
    public String programId;
    public Integer programStatus;
    public Boolean promotionalEmailOptIn;
    public com.google.wallet.proto.est.forDifferentUser renderInfo;
    public forDifferentUser sharedDataValues[];

    private clear clear()
    {
        programId = null;
        promotionalEmailOptIn = null;
        sharedDataValues = sharedDataValues();
        renderInfo = null;
        programStatus = null;
        forDifferentUser = null;
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
    //                   10: 83
    //                   18: 94
    //                   26: 218
    //                   32: 247
    //                   48: 261
    //                   56: 314;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        programId = codedinputbytebuffernano.readString();
          goto _L9
_L4:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        cachedSize acachedsize[];
        int j;
        if (sharedDataValues == null)
        {
            j = 0;
        } else
        {
            j = sharedDataValues.length;
        }
        acachedsize = new sharedDataValues[j + l];
        l = j;
        if (j != 0)
        {
            System.arraycopy(sharedDataValues, 0, acachedsize, 0, j);
            l = j;
        }
        for (; l < acachedsize.length - 1; l++)
        {
            acachedsize[l] = new sharedDataValues();
            codedinputbytebuffernano.readMessage(acachedsize[l]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[l] = new sharedDataValues();
        codedinputbytebuffernano.readMessage(acachedsize[l]);
        sharedDataValues = acachedsize;
          goto _L9
_L5:
        if (renderInfo == null)
        {
            renderInfo = new com.google.wallet.proto.est.renderInfo();
        }
        codedinputbytebuffernano.readMessage(renderInfo);
          goto _L9
_L6:
        promotionalEmailOptIn = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L9
_L7:
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
_L8:
        forDifferentUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (programId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, programId);
        }
        j = i;
        if (sharedDataValues != null)
        {
            j = i;
            if (sharedDataValues.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= sharedDataValues.length)
                    {
                        break;
                    }
                    forDifferentUser fordifferentuser = sharedDataValues[k];
                    j = i;
                    if (fordifferentuser != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, fordifferentuser);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
        }
        j = i;
        if (promotionalEmailOptIn != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, promotionalEmailOptIn.booleanValue());
        }
        i = j;
        if (programStatus != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(6, programStatus.intValue());
        }
        j = i;
        if (forDifferentUser != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(7, forDifferentUser.booleanValue());
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
        if (programId != null)
        {
            codedoutputbytebuffernano.writeString(1, programId);
        }
        if (sharedDataValues != null && sharedDataValues.length > 0)
        {
            for (int i = 0; i < sharedDataValues.length; i++)
            {
                mergeFrom mergefrom = sharedDataValues[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, mergefrom);
                }
            }

        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(3, renderInfo);
        }
        if (promotionalEmailOptIn != null)
        {
            codedoutputbytebuffernano.writeBool(4, promotionalEmailOptIn.booleanValue());
        }
        if (programStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(6, programStatus.intValue());
        }
        if (forDifferentUser != null)
        {
            codedoutputbytebuffernano.writeBool(7, forDifferentUser.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
