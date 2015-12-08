// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{
    public static final class Section extends ExtendableMessageNano
    {

        private static volatile Section _emptyArray[];
        public Integer orientation;
        public NanoWalletLoyalty.DiscoverableLoyaltyProgram programs[];
        public String title;

        private Section clear()
        {
            title = null;
            orientation = null;
            programs = NanoWalletLoyalty.DiscoverableLoyaltyProgram.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static Section[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Section[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private Section mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 70
        //                       26: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            title = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                orientation = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            NanoWalletLoyalty.DiscoverableLoyaltyProgram adiscoverableloyaltyprogram[];
            int k;
            if (programs == null)
            {
                k = 0;
            } else
            {
                k = programs.length;
            }
            adiscoverableloyaltyprogram = new NanoWalletLoyalty.DiscoverableLoyaltyProgram[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(programs, 0, adiscoverableloyaltyprogram, 0, k);
                l = k;
            }
            for (; l < adiscoverableloyaltyprogram.length - 1; l++)
            {
                adiscoverableloyaltyprogram[l] = new NanoWalletLoyalty.DiscoverableLoyaltyProgram();
                codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[l]);
                codedinputbytebuffernano.readTag();
            }

            adiscoverableloyaltyprogram[l] = new NanoWalletLoyalty.DiscoverableLoyaltyProgram();
            codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[l]);
            programs = adiscoverableloyaltyprogram;
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (title != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, title);
            }
            i = j;
            if (orientation != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, orientation.intValue());
            }
            int l = i;
            if (programs != null)
            {
                l = i;
                if (programs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= programs.length)
                        {
                            break;
                        }
                        NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[k];
                        l = i;
                        if (discoverableloyaltyprogram != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, discoverableloyaltyprogram);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (orientation != null)
            {
                codedoutputbytebuffernano.writeInt32(2, orientation.intValue());
            }
            if (programs != null && programs.length > 0)
            {
                for (int i = 0; i < programs.length; i++)
                {
                    NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[i];
                    if (discoverableloyaltyprogram != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, discoverableloyaltyprogram);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Section()
        {
            clear();
        }
    }


    public String continuationToken;
    public section programs[];
    public Section section[];

    private Section clear()
    {
        programs = Array();
        continuationToken = null;
        section = Section.emptyArray();
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
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                cachedSize acachedsize[];
                int j;
                if (programs == null)
                {
                    j = 0;
                } else
                {
                    j = programs.length;
                }
                acachedsize = new programs[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(programs, 0, acachedsize, 0, j);
                    l = j;
                }
                for (; l < acachedsize.length - 1; l++)
                {
                    acachedsize[l] = new >();
                    codedinputbytebuffernano.readMessage(acachedsize[l]);
                    codedinputbytebuffernano.readTag();
                }

                acachedsize[l] = new >();
                codedinputbytebuffernano.readMessage(acachedsize[l]);
                programs = acachedsize;
                break;

            case 18: // '\022'
                continuationToken = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                Section asection[];
                int k;
                if (section == null)
                {
                    k = 0;
                } else
                {
                    k = section.length;
                }
                asection = new Section[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(section, 0, asection, 0, k);
                    i1 = k;
                }
                for (; i1 < asection.length - 1; i1++)
                {
                    asection[i1] = new Section();
                    codedinputbytebuffernano.readMessage(asection[i1]);
                    codedinputbytebuffernano.readTag();
                }

                asection[i1] = new Section();
                codedinputbytebuffernano.readMessage(asection[i1]);
                section = asection;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (programs != null)
        {
            j = i;
            if (programs.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= programs.length)
                    {
                        break;
                    }
                    section section1 = programs[l];
                    j = i;
                    if (section1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(1, section1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (continuationToken != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, continuationToken);
        }
        int i1 = i;
        if (section != null)
        {
            i1 = i;
            if (section.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= section.length)
                    {
                        break;
                    }
                    Section section2 = section[k];
                    i1 = i;
                    if (section2 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, section2);
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
        if (programs != null && programs.length > 0)
        {
            for (int i = 0; i < programs.length; i++)
            {
                mergeFrom mergefrom = programs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, mergefrom);
                }
            }

        }
        if (continuationToken != null)
        {
            codedoutputbytebuffernano.writeString(2, continuationToken);
        }
        if (section != null && section.length > 0)
        {
            for (int j = 0; j < section.length; j++)
            {
                Section section1 = section[j];
                if (section1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, section1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Section.clear()
    {
        clear();
    }
}
