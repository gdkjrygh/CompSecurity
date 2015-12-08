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
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    public Integer captureMode;
    public  debugParameters;
    public  image[];
    public int types[];

    private clear clear()
    {
        image = y();
        debugParameters = null;
        types = WireFormatNano.EMPTY_INT_ARRAY;
        captureMode = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L8:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 6: default 68
    //                   0: 78
    //                   10: 80
    //                   18: 211
    //                   24: 240
    //                   26: 436
    //                   32: 658;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
        cachedSize acachedsize[];
        if (image == null)
        {
            i = 0;
        } else
        {
            i = image.length;
        }
        acachedsize = new image[i + k];
        k = i;
        if (i != 0)
        {
            System.arraycopy(image, 0, acachedsize, 0, i);
            k = i;
        }
        for (; k < acachedsize.length - 1; k++)
        {
            acachedsize[k] = new image();
            codedinputbytebuffernano.readMessage(acachedsize[k]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[k] = new ();
        codedinputbytebuffernano.readMessage(acachedsize[k]);
        image = acachedsize;
          goto _L8
_L4:
        if (debugParameters == null)
        {
            debugParameters = new ();
        }
        codedinputbytebuffernano.readMessage(debugParameters);
          goto _L8
_L5:
        int ai[];
        int l;
        int k1;
        k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
        ai = new int[k1];
        l = 0;
        i = 0;
_L15:
        if (l >= k1) goto _L10; else goto _L9
_L9:
        int l1;
        if (l != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        l1 = codedinputbytebuffernano.readInt32();
        l1;
        JVM INSTR tableswitch 0 4: default 320
    //                   0 329
    //                   1 329
    //                   2 329
    //                   3 320
    //                   4 329;
           goto _L11 _L12 _L12 _L12 _L11 _L12
_L11:
        l++;
          goto _L13
_L12:
        int i1 = i + 1;
        ai[i] = l1;
        i = i1;
        if (true) goto _L11; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
_L10:
        if (i != 0)
        {
            if (types == null)
            {
                l = 0;
            } else
            {
                l = types.length;
            }
            if (l == 0 && i == k1)
            {
                types = ai;
            } else
            {
                int ai1[] = new int[l + i];
                if (l != 0)
                {
                    System.arraycopy(types, 0, ai1, 0, l);
                }
                System.arraycopy(ai, 0, ai1, l, i);
                types = ai1;
            }
        }
          goto _L8
_L6:
        int j1;
        j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        l = 0;
        i = codedinputbytebuffernano.getPosition();
_L21:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (l == 0) goto _L17; else goto _L16
_L16:
        codedinputbytebuffernano.rewindToPosition(i);
        if (types == null)
        {
            i = 0;
        } else
        {
            i = types.length;
        }
        ai = new int[i + l];
        l = i;
        if (i != 0)
        {
            System.arraycopy(types, 0, ai, 0, i);
            l = i;
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
            case 4: // '\004'
                ai[l] = i;
                l++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        types = ai;
          goto _L17
        if (true) goto _L19; else goto _L18
_L18:
        if (true) goto _L21; else goto _L20
_L20:
_L17:
        codedinputbytebuffernano.popLimit(j1);
          goto _L8
_L7:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            captureMode = Integer.valueOf(j);
            break;
        }
        if (true) goto _L8; else goto _L22
_L22:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (image != null)
        {
            j = i;
            if (image.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= image.length)
                    {
                        break;
                    }
                    captureMode capturemode = image[k];
                    j = i;
                    if (capturemode != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, capturemode);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (debugParameters != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(2, debugParameters);
        }
        j = i;
        if (types != null)
        {
            j = i;
            if (types.length > 0)
            {
                int l = 0;
                for (j = 0; j < types.length; j++)
                {
                    l += CodedOutputByteBufferNano.computeInt32SizeNoTag(types[j]);
                }

                j = i + l + types.length * 1;
            }
        }
        i = j;
        if (captureMode != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(4, captureMode.intValue());
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
        if (image != null && image.length > 0)
        {
            for (int i = 0; i < image.length; i++)
            {
                mergeFrom mergefrom = image[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (debugParameters != null)
        {
            codedoutputbytebuffernano.writeMessage(2, debugParameters);
        }
        if (types != null && types.length > 0)
        {
            for (int j = 0; j < types.length; j++)
            {
                codedoutputbytebuffernano.writeInt32(3, types[j]);
            }

        }
        if (captureMode != null)
        {
            codedoutputbytebuffernano.writeInt32(4, captureMode.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
