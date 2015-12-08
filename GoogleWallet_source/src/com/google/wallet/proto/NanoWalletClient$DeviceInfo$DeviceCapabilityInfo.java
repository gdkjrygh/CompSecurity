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
//            NanoWalletClient

public static final class clear extends ExtendableMessageNano
{

    public int deviceCapability[];

    private clear clear()
    {
        deviceCapability = WireFormatNano.EMPTY_INT_ARRAY;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L19:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   0: 54
    //                   8: 56
    //                   10: 248;
           goto _L1 _L2 _L3 _L4
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
        ai = new int[i1];
        j = 0;
        i = 0;
_L11:
        if (j >= i1) goto _L6; else goto _L5
_L5:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readInt32();
        j1;
        JVM INSTR tableswitch 1 4: default 132
    //                   1 141
    //                   2 141
    //                   3 132
    //                   4 141;
           goto _L7 _L8 _L8 _L7 _L8
_L7:
        j++;
          goto _L9
_L8:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L7; else goto _L9
_L9:
        if (true) goto _L11; else goto _L10
_L10:
_L6:
        if (i != 0)
        {
            if (deviceCapability == null)
            {
                j = 0;
            } else
            {
                j = deviceCapability.length;
            }
            if (j == 0 && i == i1)
            {
                deviceCapability = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(deviceCapability, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                deviceCapability = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        j = 0;
        i = codedinputbytebuffernano.getPosition();
_L17:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L13; else goto _L12
_L12:
        codedinputbytebuffernano.rewindToPosition(i);
        if (deviceCapability == null)
        {
            i = 0;
        } else
        {
            i = deviceCapability.length;
        }
        ai = new int[i + j];
        j = i;
        if (i != 0)
        {
            System.arraycopy(deviceCapability, 0, ai, 0, i);
            j = i;
        }
_L15:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        deviceCapability = ai;
          goto _L13
        if (true) goto _L15; else goto _L14
_L14:
        if (true) goto _L17; else goto _L16
_L16:
_L13:
        codedinputbytebuffernano.popLimit(l);
        if (true) goto _L19; else goto _L18
_L18:
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if (deviceCapability != null)
        {
            i = k;
            if (deviceCapability.length > 0)
            {
                int j = 0;
                for (i = 0; i < deviceCapability.length; i++)
                {
                    j += CodedOutputByteBufferNano.computeInt32SizeNoTag(deviceCapability[i]);
                }

                i = k + j + deviceCapability.length * 1;
            }
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
        if (deviceCapability != null && deviceCapability.length > 0)
        {
            for (int i = 0; i < deviceCapability.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(1, deviceCapability[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
