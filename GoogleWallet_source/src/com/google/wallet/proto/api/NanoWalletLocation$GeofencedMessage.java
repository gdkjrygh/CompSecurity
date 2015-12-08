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
//            NanoWalletLocation

public static final class clear extends ExtendableMessageNano
{
    public static final class ExitZone extends ExtendableMessageNano
    {

        private static volatile ExitZone _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.PhysicalLocation center;
        public Float radiusInMeters;

        private ExitZone clear()
        {
            center = null;
            radiusInMeters = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ExitZone[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ExitZone[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ExitZone mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (center == null)
                    {
                        center = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
                    }
                    codedinputbytebuffernano.readMessage(center);
                    break;

                case 21: // '\025'
                    radiusInMeters = Float.valueOf(codedinputbytebuffernano.readFloat());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (center != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, center);
            }
            j = i;
            if (radiusInMeters != null)
            {
                j = i + CodedOutputByteBufferNano.computeFloatSize(2, radiusInMeters.floatValue());
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
            if (center != null)
            {
                codedoutputbytebuffernano.writeMessage(1, center);
            }
            if (radiusInMeters != null)
            {
                codedoutputbytebuffernano.writeFloat(2, radiusInMeters.floatValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ExitZone()
        {
            clear();
        }
    }

    public static final class LocalizedStrings extends ExtendableMessageNano
    {

        public String collapsedDescription;
        public String expandedDescriptionLines[];
        public String title;

        private LocalizedStrings clear()
        {
            title = null;
            collapsedDescription = null;
            expandedDescriptionLines = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LocalizedStrings mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    title = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    collapsedDescription = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (expandedDescriptionLines == null)
                    {
                        j = 0;
                    } else
                    {
                        j = expandedDescriptionLines.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(expandedDescriptionLines, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    expandedDescriptionLines = as;
                    break;
                }
            } while (true);
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
            if (collapsedDescription != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, collapsedDescription);
            }
            j = i;
            if (expandedDescriptionLines != null)
            {
                j = i;
                if (expandedDescriptionLines.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < expandedDescriptionLines.length;)
                    {
                        String s = expandedDescriptionLines[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
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
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(1, title);
            }
            if (collapsedDescription != null)
            {
                codedoutputbytebuffernano.writeString(2, collapsedDescription);
            }
            if (expandedDescriptionLines != null && expandedDescriptionLines.length > 0)
            {
                for (int i = 0; i < expandedDescriptionLines.length; i++)
                {
                    String s = expandedDescriptionLines[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LocalizedStrings()
        {
            clear();
        }
    }

    public static final class WobInstanceData extends ExtendableMessageNano
    {

        private static volatile WobInstanceData _emptyArray[];
        public com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        public String description[];
        public String logoUrl;
        public String merchant;
        public String targetUri;
        public String title;

        private WobInstanceData clear()
        {
            barcode = null;
            title = null;
            description = WireFormatNano.EMPTY_STRING_ARRAY;
            logoUrl = null;
            targetUri = null;
            merchant = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static WobInstanceData[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new WobInstanceData[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private WobInstanceData mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (barcode == null)
                    {
                        barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
                    }
                    codedinputbytebuffernano.readMessage(barcode);
                    break;

                case 18: // '\022'
                    title = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (description == null)
                    {
                        j = 0;
                    } else
                    {
                        j = description.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(description, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    description = as;
                    break;

                case 34: // '"'
                    logoUrl = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    targetUri = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    merchant = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (barcode != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, barcode);
            }
            i = j;
            if (title != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, title);
            }
            j = i;
            if (description != null)
            {
                j = i;
                if (description.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < description.length;)
                    {
                        String s = description[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
            }
            i = j;
            if (logoUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, logoUrl);
            }
            j = i;
            if (targetUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, targetUri);
            }
            i = j;
            if (merchant != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(6, merchant);
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
            if (barcode != null)
            {
                codedoutputbytebuffernano.writeMessage(1, barcode);
            }
            if (title != null)
            {
                codedoutputbytebuffernano.writeString(2, title);
            }
            if (description != null && description.length > 0)
            {
                for (int i = 0; i < description.length; i++)
                {
                    String s = description[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            if (logoUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, logoUrl);
            }
            if (targetUri != null)
            {
                codedoutputbytebuffernano.writeString(5, targetUri);
            }
            if (merchant != null)
            {
                codedoutputbytebuffernano.writeString(6, merchant);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobInstanceData()
        {
            clear();
        }
    }


    private static volatile wobInstanceData _emptyArray[];
    public com.google.wallet.proto.age barcode;
    public ExitZone exitZone[];
    public LocalizedStrings localizedStrings;
    public String logoUrl;
    public Boolean shouldBuzz;
    public String targetUri;
    public Integer type;
    public WobInstanceData wobInstanceData[];

    private WobInstanceData clear()
    {
        localizedStrings = null;
        targetUri = null;
        shouldBuzz = null;
        type = null;
        exitZone = ExitZone.emptyArray();
        barcode = null;
        logoUrl = null;
        wobInstanceData = WobInstanceData.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 128
    //                   24: 139
    //                   32: 153
    //                   42: 190
    //                   50: 314
    //                   58: 343
    //                   74: 354;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (localizedStrings == null)
        {
            localizedStrings = new LocalizedStrings();
        }
        codedinputbytebuffernano.readMessage(localizedStrings);
          goto _L11
_L4:
        targetUri = codedinputbytebuffernano.readString();
          goto _L11
_L5:
        shouldBuzz = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L11
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
            type = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
        ExitZone aexitzone[];
        int k;
        if (exitZone == null)
        {
            k = 0;
        } else
        {
            k = exitZone.length;
        }
        aexitzone = new ExitZone[k + i1];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(exitZone, 0, aexitzone, 0, k);
            i1 = k;
        }
        for (; i1 < aexitzone.length - 1; i1++)
        {
            aexitzone[i1] = new ExitZone();
            codedinputbytebuffernano.readMessage(aexitzone[i1]);
            codedinputbytebuffernano.readTag();
        }

        aexitzone[i1] = new ExitZone();
        codedinputbytebuffernano.readMessage(aexitzone[i1]);
        exitZone = aexitzone;
        continue; /* Loop/switch isn't completed */
_L8:
        if (barcode == null)
        {
            barcode = new com.google.wallet.proto.age.barcode();
        }
        codedinputbytebuffernano.readMessage(barcode);
        continue; /* Loop/switch isn't completed */
_L9:
        logoUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
        WobInstanceData awobinstancedata[];
        int l;
        if (wobInstanceData == null)
        {
            l = 0;
        } else
        {
            l = wobInstanceData.length;
        }
        awobinstancedata = new WobInstanceData[l + j1];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(wobInstanceData, 0, awobinstancedata, 0, l);
            j1 = l;
        }
        for (; j1 < awobinstancedata.length - 1; j1++)
        {
            awobinstancedata[j1] = new WobInstanceData();
            codedinputbytebuffernano.readMessage(awobinstancedata[j1]);
            codedinputbytebuffernano.readTag();
        }

        awobinstancedata[j1] = new WobInstanceData();
        codedinputbytebuffernano.readMessage(awobinstancedata[j1]);
        wobInstanceData = awobinstancedata;
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (localizedStrings != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, localizedStrings);
        }
        j = i;
        if (targetUri != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, targetUri);
        }
        int l = j;
        if (shouldBuzz != null)
        {
            l = j + CodedOutputByteBufferNano.computeBoolSize(3, shouldBuzz.booleanValue());
        }
        i = l;
        if (type != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(4, type.intValue());
        }
        j = i;
        if (exitZone != null)
        {
            j = i;
            if (exitZone.length > 0)
            {
                l = 0;
                do
                {
                    j = i;
                    if (l >= exitZone.length)
                    {
                        break;
                    }
                    ExitZone exitzone = exitZone[l];
                    j = i;
                    if (exitzone != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(5, exitzone);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        l = j;
        if (barcode != null)
        {
            l = j + CodedOutputByteBufferNano.computeMessageSize(6, barcode);
        }
        i = l;
        if (logoUrl != null)
        {
            i = l + CodedOutputByteBufferNano.computeStringSize(7, logoUrl);
        }
        l = i;
        if (wobInstanceData != null)
        {
            l = i;
            if (wobInstanceData.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= wobInstanceData.length)
                    {
                        break;
                    }
                    WobInstanceData wobinstancedata = wobInstanceData[k];
                    l = i;
                    if (wobinstancedata != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(9, wobinstancedata);
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
        if (localizedStrings != null)
        {
            codedoutputbytebuffernano.writeMessage(1, localizedStrings);
        }
        if (targetUri != null)
        {
            codedoutputbytebuffernano.writeString(2, targetUri);
        }
        if (shouldBuzz != null)
        {
            codedoutputbytebuffernano.writeBool(3, shouldBuzz.booleanValue());
        }
        if (type != null)
        {
            codedoutputbytebuffernano.writeInt32(4, type.intValue());
        }
        if (exitZone != null && exitZone.length > 0)
        {
            for (int i = 0; i < exitZone.length; i++)
            {
                ExitZone exitzone = exitZone[i];
                if (exitzone != null)
                {
                    codedoutputbytebuffernano.writeMessage(5, exitzone);
                }
            }

        }
        if (barcode != null)
        {
            codedoutputbytebuffernano.writeMessage(6, barcode);
        }
        if (logoUrl != null)
        {
            codedoutputbytebuffernano.writeString(7, logoUrl);
        }
        if (wobInstanceData != null && wobInstanceData.length > 0)
        {
            for (int j = 0; j < wobInstanceData.length; j++)
            {
                WobInstanceData wobinstancedata = wobInstanceData[j];
                if (wobinstancedata != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, wobinstancedata);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public WobInstanceData.clear()
    {
        clear();
    }
}
