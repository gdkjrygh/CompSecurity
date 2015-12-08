// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{
    public static final class Term extends MessageNano
    {

        private static volatile Term _emptyArray[];
        public String body;
        public boolean hasBody;
        public boolean hasHeader;
        public String header;

        public static Term[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Term[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasHeader)
                {
                    i = j;
                    if (header.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(5, header);
            }
            int k;
label1:
            {
                if (!hasBody)
                {
                    k = i;
                    if (body.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(6, body);
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 42: // '*'
                    header = codedinputbytebuffernano.readString();
                    hasHeader = true;
                    break;

                case 50: // '2'
                    body = codedinputbytebuffernano.readString();
                    hasBody = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasHeader || !header.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, header);
            }
            if (hasBody || !body.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, body);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Term()
        {
            header = "";
            hasHeader = false;
            body = "";
            hasBody = false;
            cachedSize = -1;
        }
    }


    private static volatile term _emptyArray[];
    public boolean hasOfferAbbreviation;
    public boolean hasOfferType;
    public boolean hasRentalHeader;
    public String offerAbbreviation;
    public int offerType;
    public String rentalHeader;
    public Term term[];

    public static Term[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (offerType == 1)
            {
                i = j;
                if (!hasOfferType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, offerType);
        }
        int k;
label1:
        {
            if (!hasOfferAbbreviation)
            {
                k = i;
                if (offerAbbreviation.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, offerAbbreviation);
        }
label2:
        {
            if (!hasRentalHeader)
            {
                i = k;
                if (rentalHeader.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, rentalHeader);
        }
        int i1 = i;
        if (term != null)
        {
            i1 = i;
            if (term.length > 0)
            {
                int l = 0;
                do
                {
                    i1 = i;
                    if (l >= term.length)
                    {
                        break;
                    }
                    Term term1 = term[l];
                    i1 = i;
                    if (term1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeGroupSize(4, term1);
                    }
                    l++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   8: 66
    //                   18: 152
    //                   26: 168
    //                   35: 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
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
        case 12: // '\f'
            offerType = j;
            hasOfferType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        offerAbbreviation = codedinputbytebuffernano.readString();
        hasOfferAbbreviation = true;
        continue; /* Loop/switch isn't completed */
_L5:
        rentalHeader = codedinputbytebuffernano.readString();
        hasRentalHeader = true;
        continue; /* Loop/switch isn't completed */
_L6:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 35);
        Term aterm[];
        int k;
        if (term == null)
        {
            k = 0;
        } else
        {
            k = term.length;
        }
        aterm = new Term[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(term, 0, aterm, 0, k);
            l = k;
        }
        for (; l < aterm.length - 1; l++)
        {
            aterm[l] = new Term();
            codedinputbytebuffernano.readGroup(aterm[l], 4);
            codedinputbytebuffernano.readTag();
        }

        aterm[l] = new Term();
        codedinputbytebuffernano.readGroup(aterm[l], 4);
        term = aterm;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (offerType != 1 || hasOfferType)
        {
            codedoutputbytebuffernano.writeInt32(1, offerType);
        }
        if (hasOfferAbbreviation || !offerAbbreviation.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, offerAbbreviation);
        }
        if (hasRentalHeader || !rentalHeader.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, rentalHeader);
        }
        if (term != null && term.length > 0)
        {
            for (int i = 0; i < term.length; i++)
            {
                Term term1 = term[i];
                if (term1 != null)
                {
                    codedoutputbytebuffernano.writeGroup(4, term1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public Term.cachedSize()
    {
        offerType = 1;
        hasOfferType = false;
        offerAbbreviation = "";
        hasOfferAbbreviation = false;
        rentalHeader = "";
        hasRentalHeader = false;
        term = Term.emptyArray();
        cachedSize = -1;
    }
}
