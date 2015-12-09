// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    public Boolean canPerformDocumentVerification;
    public Boolean needsFullSsn;
    public Boolean shouldPoll;
    public Integer status;
    public int validatedInformation[];

    private clear clear()
    {
        status = null;
        validatedInformation = WireFormatNano.EMPTY_INT_ARRAY;
        canPerformDocumentVerification = null;
        needsFullSsn = null;
        shouldPoll = null;
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
        JVM INSTR lookupswitch 7: default 76
    //                   0: 86
    //                   8: 88
    //                   16: 147
    //                   18: 340
    //                   24: 562
    //                   32: 576
    //                   40: 590;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        i = codedinputbytebuffernano.readInt32();
        switch (i)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            status = Integer.valueOf(i);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 16);
        ai = new int[i1];
        j = 0;
        i = 0;
_L15:
        if (j >= i1) goto _L11; else goto _L10
_L10:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readInt32();
        j1;
        JVM INSTR tableswitch 0 4: default 224
    //                   0 233
    //                   1 233
    //                   2 233
    //                   3 233
    //                   4 233;
           goto _L12 _L13 _L13 _L13 _L13 _L13
_L12:
        j++;
        continue; /* Loop/switch isn't completed */
_L13:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L12; else goto _L11
_L11:
        if (i != 0)
        {
            if (validatedInformation == null)
            {
                j = 0;
            } else
            {
                j = validatedInformation.length;
            }
            if (j == 0 && i == i1)
            {
                validatedInformation = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(validatedInformation, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                validatedInformation = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L15; else goto _L14
_L14:
_L5:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        j = 0;
        i = codedinputbytebuffernano.getPosition();
_L21:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L17; else goto _L16
_L16:
        codedinputbytebuffernano.rewindToPosition(i);
        if (validatedInformation == null)
        {
            i = 0;
        } else
        {
            i = validatedInformation.length;
        }
        ai = new int[i + j];
        j = i;
        if (i != 0)
        {
            System.arraycopy(validatedInformation, 0, ai, 0, i);
            j = i;
        }
_L19:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        validatedInformation = ai;
_L17:
        codedinputbytebuffernano.popLimit(l);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L6:
        canPerformDocumentVerification = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L7:
        needsFullSsn = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L8:
        shouldPoll = Boolean.valueOf(codedinputbytebuffernano.readBool());
        if (true) goto _L9; else goto _L22
_L22:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (status != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
        }
        j = i;
        if (validatedInformation != null)
        {
            j = i;
            if (validatedInformation.length > 0)
            {
                int k = 0;
                for (j = 0; j < validatedInformation.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt32SizeNoTag(validatedInformation[j]);
                }

                j = i + k + validatedInformation.length * 1;
            }
        }
        i = j;
        if (canPerformDocumentVerification != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, canPerformDocumentVerification.booleanValue());
        }
        j = i;
        if (needsFullSsn != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, needsFullSsn.booleanValue());
        }
        i = j;
        if (shouldPoll != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, shouldPoll.booleanValue());
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
        if (status != null)
        {
            codedoutputbytebuffernano.writeInt32(1, status.intValue());
        }
        if (validatedInformation != null && validatedInformation.length > 0)
        {
            for (int i = 0; i < validatedInformation.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(2, validatedInformation[i]);
            }

        }
        if (canPerformDocumentVerification != null)
        {
            codedoutputbytebuffernano.writeBool(3, canPerformDocumentVerification.booleanValue());
        }
        if (needsFullSsn != null)
        {
            codedoutputbytebuffernano.writeBool(4, needsFullSsn.booleanValue());
        }
        if (shouldPoll != null)
        {
            codedoutputbytebuffernano.writeBool(5, shouldPoll.booleanValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
