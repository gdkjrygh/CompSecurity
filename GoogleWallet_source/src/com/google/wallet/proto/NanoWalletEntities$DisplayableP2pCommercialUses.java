// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{
    public static final class DisplayableP2pCommercialUse extends ExtendableMessageNano
    {

        private static volatile DisplayableP2pCommercialUse _emptyArray[];
        public String displayName;
        public Integer p2PCommercialUseType;

        private DisplayableP2pCommercialUse clear()
        {
            displayName = null;
            p2PCommercialUseType = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static DisplayableP2pCommercialUse[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DisplayableP2pCommercialUse[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private DisplayableP2pCommercialUse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 62;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            displayName = codedinputbytebuffernano.readString();
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
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
                p2PCommercialUseType = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
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
            if (p2PCommercialUseType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, p2PCommercialUseType.intValue());
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
            if (p2PCommercialUseType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, p2PCommercialUseType.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DisplayableP2pCommercialUse()
        {
            clear();
        }
    }


    public DisplayableP2pCommercialUse displaybleP2PCommercialUses[];

    private DisplayableP2pCommercialUse clear()
    {
        displaybleP2PCommercialUses = DisplayableP2pCommercialUse.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                DisplayableP2pCommercialUse adisplayablep2pcommercialuse[];
                int j;
                if (displaybleP2PCommercialUses == null)
                {
                    j = 0;
                } else
                {
                    j = displaybleP2PCommercialUses.length;
                }
                adisplayablep2pcommercialuse = new DisplayableP2pCommercialUse[j + k];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(displaybleP2PCommercialUses, 0, adisplayablep2pcommercialuse, 0, j);
                    k = j;
                }
                for (; k < adisplayablep2pcommercialuse.length - 1; k++)
                {
                    adisplayablep2pcommercialuse[k] = new DisplayableP2pCommercialUse();
                    codedinputbytebuffernano.readMessage(adisplayablep2pcommercialuse[k]);
                    codedinputbytebuffernano.readTag();
                }

                adisplayablep2pcommercialuse[k] = new DisplayableP2pCommercialUse();
                codedinputbytebuffernano.readMessage(adisplayablep2pcommercialuse[k]);
                displaybleP2PCommercialUses = adisplayablep2pcommercialuse;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (displaybleP2PCommercialUses != null)
        {
            k = i;
            if (displaybleP2PCommercialUses.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= displaybleP2PCommercialUses.length)
                    {
                        break;
                    }
                    DisplayableP2pCommercialUse displayablep2pcommercialuse = displaybleP2PCommercialUses[j];
                    k = i;
                    if (displayablep2pcommercialuse != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(1, displayablep2pcommercialuse);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (displaybleP2PCommercialUses != null && displaybleP2PCommercialUses.length > 0)
        {
            for (int i = 0; i < displaybleP2PCommercialUses.length; i++)
            {
                DisplayableP2pCommercialUse displayablep2pcommercialuse = displaybleP2PCommercialUses[i];
                if (displayablep2pcommercialuse != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, displayablep2pcommercialuse);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public DisplayableP2pCommercialUse.clear()
    {
        clear();
    }
}
