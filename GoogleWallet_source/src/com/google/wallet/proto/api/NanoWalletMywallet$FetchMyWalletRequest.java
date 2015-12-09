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
//            NanoWalletMywallet

public static final class clear extends ExtendableMessageNano
{

    public com.google.wallet.proto.est.supportedTileType location;
    public com.google.wallet.proto.est.supportedTileType renderInfo;
    public int supportedTileType[];

    private clear clear()
    {
        location = null;
        renderInfo = null;
        supportedTileType = WireFormatNano.EMPTY_INT_ARRAY;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L21:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 60
    //                   0: 70
    //                   10: 72
    //                   18: 101
    //                   24: 130
    //                   26: 380;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        if (location == null)
        {
            location = new com.google.wallet.proto.t>();
        }
        codedinputbytebuffernano.readMessage(location);
        continue; /* Loop/switch isn't completed */
_L4:
        if (renderInfo == null)
        {
            renderInfo = new com.google.wallet.proto.nit>();
        }
        codedinputbytebuffernano.readMessage(renderInfo);
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int j;
        int i1;
        i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
        ai = new int[i1];
        j = 0;
        i = 0;
_L13:
        if (j >= i1) goto _L8; else goto _L7
_L7:
        int j1;
        if (j != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        j1 = codedinputbytebuffernano.readInt32();
        j1;
        JVM INSTR tableswitch 1 19: default 264
    //                   1 273
    //                   2 273
    //                   3 273
    //                   4 273
    //                   5 273
    //                   6 273
    //                   7 273
    //                   8 273
    //                   9 273
    //                   10 273
    //                   11 273
    //                   12 273
    //                   13 264
    //                   14 273
    //                   15 273
    //                   16 273
    //                   17 273
    //                   18 273
    //                   19 273;
           goto _L9 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L10 _L9 _L10 _L10 _L10 _L10 _L10 _L10
_L9:
        j++;
          goto _L11
_L10:
        int k = i + 1;
        ai[i] = j1;
        i = k;
        if (true) goto _L9; else goto _L11
_L11:
        if (true) goto _L13; else goto _L12
_L12:
_L8:
        if (i != 0)
        {
            if (supportedTileType == null)
            {
                j = 0;
            } else
            {
                j = supportedTileType.length;
            }
            if (j == 0 && i == i1)
            {
                supportedTileType = ai;
            } else
            {
                int ai1[] = new int[j + i];
                if (j != 0)
                {
                    System.arraycopy(supportedTileType, 0, ai1, 0, j);
                }
                System.arraycopy(ai, 0, ai1, j, i);
                supportedTileType = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l;
        l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        j = 0;
        i = codedinputbytebuffernano.getPosition();
_L19:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
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
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j == 0) goto _L15; else goto _L14
_L14:
        codedinputbytebuffernano.rewindToPosition(i);
        if (supportedTileType == null)
        {
            i = 0;
        } else
        {
            i = supportedTileType.length;
        }
        ai = new int[i + j];
        j = i;
        if (i != 0)
        {
            System.arraycopy(supportedTileType, 0, ai, 0, i);
            j = i;
        }
_L17:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readInt32();
            switch (i)
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
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
                ai[j] = i;
                j++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        supportedTileType = ai;
          goto _L15
        if (true) goto _L17; else goto _L16
_L16:
        if (true) goto _L19; else goto _L18
_L18:
_L15:
        codedinputbytebuffernano.popLimit(l);
        if (true) goto _L21; else goto _L20
_L20:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (location != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, location);
        }
        i = j;
        if (renderInfo != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
        }
        j = i;
        if (supportedTileType != null)
        {
            j = i;
            if (supportedTileType.length > 0)
            {
                int k = 0;
                for (j = 0; j < supportedTileType.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeInt32SizeNoTag(supportedTileType[j]);
                }

                j = i + k + supportedTileType.length * 1;
            }
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
        if (location != null)
        {
            codedoutputbytebuffernano.writeMessage(1, location);
        }
        if (renderInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(2, renderInfo);
        }
        if (supportedTileType != null && supportedTileType.length > 0)
        {
            for (int i = 0; i < supportedTileType.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(3, supportedTileType[i]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public I()
    {
        clear();
    }
}
