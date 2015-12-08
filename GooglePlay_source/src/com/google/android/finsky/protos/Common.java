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

public interface Common
{
    public static final class Attribution extends MessageNano
    {

        public boolean hasLicenseTitle;
        public boolean hasLicenseUrl;
        public boolean hasSourceTitle;
        public boolean hasSourceUrl;
        public String licenseTitle;
        public String licenseUrl;
        public String sourceTitle;
        public String sourceUrl;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSourceTitle)
                {
                    i = j;
                    if (sourceTitle.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, sourceTitle);
            }
            int k;
label1:
            {
                if (!hasSourceUrl)
                {
                    k = i;
                    if (sourceUrl.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, sourceUrl);
            }
label2:
            {
                if (!hasLicenseTitle)
                {
                    i = k;
                    if (licenseTitle.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, licenseTitle);
            }
label3:
            {
                if (!hasLicenseUrl)
                {
                    k = i;
                    if (licenseUrl.equals(""))
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(4, licenseUrl);
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

                case 10: // '\n'
                    sourceTitle = codedinputbytebuffernano.readString();
                    hasSourceTitle = true;
                    break;

                case 18: // '\022'
                    sourceUrl = codedinputbytebuffernano.readString();
                    hasSourceUrl = true;
                    break;

                case 26: // '\032'
                    licenseTitle = codedinputbytebuffernano.readString();
                    hasLicenseTitle = true;
                    break;

                case 34: // '"'
                    licenseUrl = codedinputbytebuffernano.readString();
                    hasLicenseUrl = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSourceTitle || !sourceTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, sourceTitle);
            }
            if (hasSourceUrl || !sourceUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, sourceUrl);
            }
            if (hasLicenseTitle || !licenseTitle.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, licenseTitle);
            }
            if (hasLicenseUrl || !licenseUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, licenseUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Attribution()
        {
            sourceTitle = "";
            hasSourceTitle = false;
            sourceUrl = "";
            hasSourceUrl = false;
            licenseTitle = "";
            hasLicenseTitle = false;
            licenseUrl = "";
            hasLicenseUrl = false;
            cachedSize = -1;
        }
    }

    public static final class Docid extends MessageNano
    {

        private static volatile Docid _emptyArray[];
        public int backend;
        public String backendDocid;
        public boolean hasBackend;
        public boolean hasBackendDocid;
        public boolean hasType;
        public int type;

        public static Docid[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Docid[0];
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
                if (!hasBackendDocid)
                {
                    i = j;
                    if (backendDocid.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, backendDocid);
            }
            int k;
label1:
            {
                if (type == 1)
                {
                    k = i;
                    if (!hasType)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, type);
            }
label2:
            {
                if (backend == 0)
                {
                    i = k;
                    if (!hasBackend)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(3, backend);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       10: 58
        //                       16: 74
        //                       24: 276;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            backendDocid = codedinputbytebuffernano.readString();
            hasBackendDocid = true;
              goto _L6
_L4:
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
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
                type = j;
                hasType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                backend = k;
                hasBackend = true;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasBackendDocid || !backendDocid.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, backendDocid);
            }
            if (type != 1 || hasType)
            {
                codedoutputbytebuffernano.writeInt32(2, type);
            }
            if (backend != 0 || hasBackend)
            {
                codedoutputbytebuffernano.writeInt32(3, backend);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Docid()
        {
            backendDocid = "";
            hasBackendDocid = false;
            type = 1;
            hasType = false;
            backend = 0;
            hasBackend = false;
            cachedSize = -1;
        }
    }

    public static final class GroupLicenseKey extends MessageNano
    {

        public long dasherCustomerId;
        public Docid docid;
        public boolean hasDasherCustomerId;
        public boolean hasLicensedOfferType;
        public boolean hasRentalPeriodDays;
        public boolean hasType;
        public int licensedOfferType;
        public int rentalPeriodDays;
        public int type;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasDasherCustomerId)
                {
                    i = j;
                    if (dasherCustomerId == 0L)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 8);
            }
label1:
            {
                int k = i;
                if (docid != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(2, docid);
                }
                if (licensedOfferType == 1)
                {
                    i = k;
                    if (!hasLicensedOfferType)
                    {
                        break label1;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(3, licensedOfferType);
            }
            int l;
label2:
            {
                if (type == 0)
                {
                    l = i;
                    if (!hasType)
                    {
                        break label2;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeInt32Size(4, type);
            }
label3:
            {
                if (!hasRentalPeriodDays)
                {
                    i = l;
                    if (rentalPeriodDays == 0)
                    {
                        break label3;
                    }
                }
                i = l + CodedOutputByteBufferNano.computeInt32Size(5, rentalPeriodDays);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 72
        //                       9: 74
        //                       18: 90
        //                       24: 119
        //                       32: 204
        //                       40: 256;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            dasherCustomerId = codedinputbytebuffernano.readRawLittleEndian64();
            hasDasherCustomerId = true;
              goto _L8
_L4:
            if (docid == null)
            {
                docid = new Docid();
            }
            codedinputbytebuffernano.readMessage(docid);
              goto _L8
_L5:
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
                licensedOfferType = j;
                hasLicensedOfferType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                type = k;
                hasType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            rentalPeriodDays = codedinputbytebuffernano.readRawVarint32();
            hasRentalPeriodDays = true;
            if (true) goto _L8; else goto _L9
_L9:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasDasherCustomerId || dasherCustomerId != 0L)
            {
                codedoutputbytebuffernano.writeFixed64(1, dasherCustomerId);
            }
            if (docid != null)
            {
                codedoutputbytebuffernano.writeMessage(2, docid);
            }
            if (licensedOfferType != 1 || hasLicensedOfferType)
            {
                codedoutputbytebuffernano.writeInt32(3, licensedOfferType);
            }
            if (type != 0 || hasType)
            {
                codedoutputbytebuffernano.writeInt32(4, type);
            }
            if (hasRentalPeriodDays || rentalPeriodDays != 0)
            {
                codedoutputbytebuffernano.writeInt32(5, rentalPeriodDays);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GroupLicenseKey()
        {
            dasherCustomerId = 0L;
            hasDasherCustomerId = false;
            docid = null;
            licensedOfferType = 1;
            hasLicensedOfferType = false;
            type = 0;
            hasType = false;
            rentalPeriodDays = 0;
            hasRentalPeriodDays = false;
            cachedSize = -1;
        }
    }

    public static final class Image extends MessageNano
    {

        private static volatile Image _emptyArray[];
        public String altTextLocalized;
        public Attribution attribution;
        public boolean autogen;
        public String backgroundColorRgb;
        public Citation citation;
        public Dimension dimension;
        public int durationSeconds;
        public String fillColorRgb;
        public boolean hasAltTextLocalized;
        public boolean hasAutogen;
        public boolean hasBackgroundColorRgb;
        public boolean hasDurationSeconds;
        public boolean hasFillColorRgb;
        public boolean hasImageType;
        public boolean hasImageUrl;
        public boolean hasPositionInSequence;
        public boolean hasSecureUrl;
        public boolean hasSupportsFifeUrlOptions;
        public int imageType;
        public String imageUrl;
        public int positionInSequence;
        public String secureUrl;
        public boolean supportsFifeUrlOptions;

        public static Image[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Image[0];
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
                if (imageType == 0)
                {
                    i = j;
                    if (!hasImageType)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, imageType);
            }
label1:
            {
                int k = i;
                if (dimension != null)
                {
                    k = i + CodedOutputByteBufferNano.computeGroupSize(2, dimension);
                }
                if (!hasImageUrl)
                {
                    i = k;
                    if (imageUrl.equals(""))
                    {
                        break label1;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(5, imageUrl);
            }
            int l;
label2:
            {
                if (!hasAltTextLocalized)
                {
                    l = i;
                    if (altTextLocalized.equals(""))
                    {
                        break label2;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeStringSize(6, altTextLocalized);
            }
label3:
            {
                if (!hasSecureUrl)
                {
                    i = l;
                    if (secureUrl.equals(""))
                    {
                        break label3;
                    }
                }
                i = l + CodedOutputByteBufferNano.computeStringSize(7, secureUrl);
            }
label4:
            {
                if (!hasPositionInSequence)
                {
                    l = i;
                    if (positionInSequence == 0)
                    {
                        break label4;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeInt32Size(8, positionInSequence);
            }
label5:
            {
                if (!hasSupportsFifeUrlOptions)
                {
                    i = l;
                    if (!supportsFifeUrlOptions)
                    {
                        break label5;
                    }
                }
                i = l + (CodedOutputByteBufferNano.computeTagSize(9) + 1);
            }
label6:
            {
                l = i;
                if (citation != null)
                {
                    l = i + CodedOutputByteBufferNano.computeGroupSize(10, citation);
                }
                if (!hasDurationSeconds)
                {
                    i = l;
                    if (durationSeconds == 0)
                    {
                        break label6;
                    }
                }
                i = l + CodedOutputByteBufferNano.computeInt32Size(14, durationSeconds);
            }
label7:
            {
                if (!hasFillColorRgb)
                {
                    l = i;
                    if (fillColorRgb.equals(""))
                    {
                        break label7;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeStringSize(15, fillColorRgb);
            }
label8:
            {
                if (!hasAutogen)
                {
                    i = l;
                    if (!autogen)
                    {
                        break label8;
                    }
                }
                i = l + (CodedOutputByteBufferNano.computeTagSize(16) + 1);
            }
label9:
            {
                int i1 = i;
                if (attribution != null)
                {
                    i1 = i + CodedOutputByteBufferNano.computeMessageSize(17, attribution);
                }
                if (!hasBackgroundColorRgb)
                {
                    i = i1;
                    if (backgroundColorRgb.equals(""))
                    {
                        break label9;
                    }
                }
                i = i1 + CodedOutputByteBufferNano.computeStringSize(19, backgroundColorRgb);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L16:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 14: default 128
        //                       0: 136
        //                       8: 138
        //                       19: 240
        //                       42: 270
        //                       50: 286
        //                       58: 302
        //                       64: 318
        //                       72: 334
        //                       83: 350
        //                       112: 381
        //                       122: 397
        //                       128: 413
        //                       138: 429
        //                       154: 458;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L16; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                imageType = j;
                hasImageType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (dimension == null)
            {
                dimension = new Dimension();
            }
            codedinputbytebuffernano.readGroup(dimension, 2);
            continue; /* Loop/switch isn't completed */
_L5:
            imageUrl = codedinputbytebuffernano.readString();
            hasImageUrl = true;
            continue; /* Loop/switch isn't completed */
_L6:
            altTextLocalized = codedinputbytebuffernano.readString();
            hasAltTextLocalized = true;
            continue; /* Loop/switch isn't completed */
_L7:
            secureUrl = codedinputbytebuffernano.readString();
            hasSecureUrl = true;
            continue; /* Loop/switch isn't completed */
_L8:
            positionInSequence = codedinputbytebuffernano.readRawVarint32();
            hasPositionInSequence = true;
            continue; /* Loop/switch isn't completed */
_L9:
            supportsFifeUrlOptions = codedinputbytebuffernano.readBool();
            hasSupportsFifeUrlOptions = true;
            continue; /* Loop/switch isn't completed */
_L10:
            if (citation == null)
            {
                citation = new Citation();
            }
            codedinputbytebuffernano.readGroup(citation, 10);
            continue; /* Loop/switch isn't completed */
_L11:
            durationSeconds = codedinputbytebuffernano.readRawVarint32();
            hasDurationSeconds = true;
            continue; /* Loop/switch isn't completed */
_L12:
            fillColorRgb = codedinputbytebuffernano.readString();
            hasFillColorRgb = true;
            continue; /* Loop/switch isn't completed */
_L13:
            autogen = codedinputbytebuffernano.readBool();
            hasAutogen = true;
            continue; /* Loop/switch isn't completed */
_L14:
            if (attribution == null)
            {
                attribution = new Attribution();
            }
            codedinputbytebuffernano.readMessage(attribution);
            continue; /* Loop/switch isn't completed */
_L15:
            backgroundColorRgb = codedinputbytebuffernano.readString();
            hasBackgroundColorRgb = true;
            if (true) goto _L16; else goto _L17
_L17:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (imageType != 0 || hasImageType)
            {
                codedoutputbytebuffernano.writeInt32(1, imageType);
            }
            if (dimension != null)
            {
                codedoutputbytebuffernano.writeGroup(2, dimension);
            }
            if (hasImageUrl || !imageUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, imageUrl);
            }
            if (hasAltTextLocalized || !altTextLocalized.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, altTextLocalized);
            }
            if (hasSecureUrl || !secureUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, secureUrl);
            }
            if (hasPositionInSequence || positionInSequence != 0)
            {
                codedoutputbytebuffernano.writeInt32(8, positionInSequence);
            }
            if (hasSupportsFifeUrlOptions || supportsFifeUrlOptions)
            {
                codedoutputbytebuffernano.writeBool(9, supportsFifeUrlOptions);
            }
            if (citation != null)
            {
                codedoutputbytebuffernano.writeGroup(10, citation);
            }
            if (hasDurationSeconds || durationSeconds != 0)
            {
                codedoutputbytebuffernano.writeInt32(14, durationSeconds);
            }
            if (hasFillColorRgb || !fillColorRgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(15, fillColorRgb);
            }
            if (hasAutogen || autogen)
            {
                codedoutputbytebuffernano.writeBool(16, autogen);
            }
            if (attribution != null)
            {
                codedoutputbytebuffernano.writeMessage(17, attribution);
            }
            if (hasBackgroundColorRgb || !backgroundColorRgb.equals(""))
            {
                codedoutputbytebuffernano.writeString(19, backgroundColorRgb);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Image()
        {
            imageType = 0;
            hasImageType = false;
            positionInSequence = 0;
            hasPositionInSequence = false;
            dimension = null;
            imageUrl = "";
            hasImageUrl = false;
            secureUrl = "";
            hasSecureUrl = false;
            altTextLocalized = "";
            hasAltTextLocalized = false;
            supportsFifeUrlOptions = false;
            hasSupportsFifeUrlOptions = false;
            durationSeconds = 0;
            hasDurationSeconds = false;
            fillColorRgb = "";
            hasFillColorRgb = false;
            autogen = false;
            hasAutogen = false;
            attribution = null;
            backgroundColorRgb = "";
            hasBackgroundColorRgb = false;
            citation = null;
            cachedSize = -1;
        }
    }

    public static final class Image.Citation extends MessageNano
    {

        public boolean hasTitleLocalized;
        public boolean hasUrl;
        public String titleLocalized;
        public String url;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasTitleLocalized)
                {
                    i = j;
                    if (titleLocalized.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(11, titleLocalized);
            }
            int k;
label1:
            {
                if (!hasUrl)
                {
                    k = i;
                    if (url.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(12, url);
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

                case 90: // 'Z'
                    titleLocalized = codedinputbytebuffernano.readString();
                    hasTitleLocalized = true;
                    break;

                case 98: // 'b'
                    url = codedinputbytebuffernano.readString();
                    hasUrl = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasTitleLocalized || !titleLocalized.equals(""))
            {
                codedoutputbytebuffernano.writeString(11, titleLocalized);
            }
            if (hasUrl || !url.equals(""))
            {
                codedoutputbytebuffernano.writeString(12, url);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Image.Citation()
        {
            titleLocalized = "";
            hasTitleLocalized = false;
            url = "";
            hasUrl = false;
            cachedSize = -1;
        }
    }

    public static final class Image.Dimension extends MessageNano
    {

        public int aspectRatio;
        public boolean hasAspectRatio;
        public boolean hasHeight;
        public boolean hasWidth;
        public int height;
        public int width;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasWidth)
                {
                    i = j;
                    if (width == 0)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, width);
            }
            int k;
label1:
            {
                if (!hasHeight)
                {
                    k = i;
                    if (height == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(4, height);
            }
label2:
            {
                if (aspectRatio == 0)
                {
                    i = k;
                    if (!hasAspectRatio)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(18, aspectRatio);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       24: 58
        //                       32: 74
        //                       144: 90;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            width = codedinputbytebuffernano.readRawVarint32();
            hasWidth = true;
              goto _L6
_L4:
            height = codedinputbytebuffernano.readRawVarint32();
            hasHeight = true;
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                aspectRatio = j;
                hasAspectRatio = true;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasWidth || width != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, width);
            }
            if (hasHeight || height != 0)
            {
                codedoutputbytebuffernano.writeInt32(4, height);
            }
            if (aspectRatio != 0 || hasAspectRatio)
            {
                codedoutputbytebuffernano.writeInt32(18, aspectRatio);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Image.Dimension()
        {
            width = 0;
            hasWidth = false;
            height = 0;
            hasHeight = false;
            aspectRatio = 0;
            hasAspectRatio = false;
            cachedSize = -1;
        }
    }

    public static final class Install extends MessageNano
    {

        private static volatile Install _emptyArray[];
        public long androidId;
        public boolean bundled;
        public boolean hasAndroidId;
        public boolean hasBundled;
        public boolean hasLastUpdateTimestampMillis;
        public boolean hasPending;
        public boolean hasVersion;
        public long lastUpdateTimestampMillis;
        public boolean pending;
        public int version;

        public static Install[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Install[0];
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
                if (!hasAndroidId)
                {
                    i = j;
                    if (androidId == 0L)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 8);
            }
            int k;
label1:
            {
                if (!hasVersion)
                {
                    k = i;
                    if (version == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, version);
            }
label2:
            {
                if (!hasBundled)
                {
                    i = k;
                    if (!bundled)
                    {
                        break label2;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
            }
label3:
            {
                if (!hasPending)
                {
                    k = i;
                    if (!pending)
                    {
                        break label3;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
            }
label4:
            {
                if (!hasLastUpdateTimestampMillis)
                {
                    i = k;
                    if (lastUpdateTimestampMillis == 0L)
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(5, lastUpdateTimestampMillis);
            }
            return i;
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

                case 9: // '\t'
                    androidId = codedinputbytebuffernano.readRawLittleEndian64();
                    hasAndroidId = true;
                    break;

                case 16: // '\020'
                    version = codedinputbytebuffernano.readRawVarint32();
                    hasVersion = true;
                    break;

                case 24: // '\030'
                    bundled = codedinputbytebuffernano.readBool();
                    hasBundled = true;
                    break;

                case 32: // ' '
                    pending = codedinputbytebuffernano.readBool();
                    hasPending = true;
                    break;

                case 40: // '('
                    lastUpdateTimestampMillis = codedinputbytebuffernano.readRawVarint64();
                    hasLastUpdateTimestampMillis = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasAndroidId || androidId != 0L)
            {
                codedoutputbytebuffernano.writeFixed64(1, androidId);
            }
            if (hasVersion || version != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, version);
            }
            if (hasBundled || bundled)
            {
                codedoutputbytebuffernano.writeBool(3, bundled);
            }
            if (hasPending || pending)
            {
                codedoutputbytebuffernano.writeBool(4, pending);
            }
            if (hasLastUpdateTimestampMillis || lastUpdateTimestampMillis != 0L)
            {
                codedoutputbytebuffernano.writeInt64(5, lastUpdateTimestampMillis);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Install()
        {
            androidId = 0L;
            hasAndroidId = false;
            version = 0;
            hasVersion = false;
            bundled = false;
            hasBundled = false;
            pending = false;
            hasPending = false;
            lastUpdateTimestampMillis = 0L;
            hasLastUpdateTimestampMillis = false;
            cachedSize = -1;
        }
    }

    public static final class LicenseTerms extends MessageNano
    {

        public GroupLicenseKey groupLicenseKey;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (groupLicenseKey != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, groupLicenseKey);
            }
            return i;
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

                case 10: // '\n'
                    if (groupLicenseKey == null)
                    {
                        groupLicenseKey = new GroupLicenseKey();
                    }
                    codedinputbytebuffernano.readMessage(groupLicenseKey);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (groupLicenseKey != null)
            {
                codedoutputbytebuffernano.writeMessage(1, groupLicenseKey);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LicenseTerms()
        {
            groupLicenseKey = null;
            cachedSize = -1;
        }
    }

    public static final class LicensedDocumentInfo extends MessageNano
    {

        public long assignedByGaiaId;
        public String dEPRECATEDAssignmentId;
        public long gaiaGroupId[];
        public String groupLicenseCheckoutOrderId;
        public GroupLicenseKey groupLicenseKey;
        public boolean hasAssignedByGaiaId;
        public boolean hasDEPRECATEDAssignmentId;
        public boolean hasGroupLicenseCheckoutOrderId;

        protected final int computeSerializedSize()
        {
            int l;
label0:
            {
                l = super.computeSerializedSize();
                int i = l;
                if (gaiaGroupId != null)
                {
                    i = l;
                    if (gaiaGroupId.length > 0)
                    {
                        i = l + gaiaGroupId.length * 8 + gaiaGroupId.length * 1;
                    }
                }
                if (!hasGroupLicenseCheckoutOrderId)
                {
                    l = i;
                    if (groupLicenseCheckoutOrderId.equals(""))
                    {
                        break label0;
                    }
                }
                l = i + CodedOutputByteBufferNano.computeStringSize(2, groupLicenseCheckoutOrderId);
            }
label1:
            {
                int j = l;
                if (groupLicenseKey != null)
                {
                    j = l + CodedOutputByteBufferNano.computeMessageSize(3, groupLicenseKey);
                }
                if (!hasAssignedByGaiaId)
                {
                    l = j;
                    if (assignedByGaiaId == 0L)
                    {
                        break label1;
                    }
                }
                l = j + (CodedOutputByteBufferNano.computeTagSize(4) + 8);
            }
            int k;
label2:
            {
                if (!hasDEPRECATEDAssignmentId)
                {
                    k = l;
                    if (dEPRECATEDAssignmentId.equals(""))
                    {
                        break label2;
                    }
                }
                k = l + CodedOutputByteBufferNano.computeStringSize(5, dEPRECATEDAssignmentId);
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

                case 9: // '\t'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 9);
                    long al[];
                    int j;
                    if (gaiaGroupId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = gaiaGroupId.length;
                    }
                    al = new long[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(gaiaGroupId, 0, al, 0, j);
                        l = j;
                    }
                    for (; l < al.length - 1; l++)
                    {
                        al[l] = codedinputbytebuffernano.readRawLittleEndian64();
                        codedinputbytebuffernano.readTag();
                    }

                    al[l] = codedinputbytebuffernano.readRawLittleEndian64();
                    gaiaGroupId = al;
                    break;

                case 10: // '\n'
                    int k = codedinputbytebuffernano.readRawVarint32();
                    int j1 = codedinputbytebuffernano.pushLimit(k);
                    int i1 = k / 8;
                    long al1[];
                    if (gaiaGroupId == null)
                    {
                        k = 0;
                    } else
                    {
                        k = gaiaGroupId.length;
                    }
                    al1 = new long[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(gaiaGroupId, 0, al1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < al1.length; i1++)
                    {
                        al1[i1] = codedinputbytebuffernano.readRawLittleEndian64();
                    }

                    gaiaGroupId = al1;
                    codedinputbytebuffernano.popLimit(j1);
                    break;

                case 18: // '\022'
                    groupLicenseCheckoutOrderId = codedinputbytebuffernano.readString();
                    hasGroupLicenseCheckoutOrderId = true;
                    break;

                case 26: // '\032'
                    if (groupLicenseKey == null)
                    {
                        groupLicenseKey = new GroupLicenseKey();
                    }
                    codedinputbytebuffernano.readMessage(groupLicenseKey);
                    break;

                case 33: // '!'
                    assignedByGaiaId = codedinputbytebuffernano.readRawLittleEndian64();
                    hasAssignedByGaiaId = true;
                    break;

                case 42: // '*'
                    dEPRECATEDAssignmentId = codedinputbytebuffernano.readString();
                    hasDEPRECATEDAssignmentId = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (gaiaGroupId != null && gaiaGroupId.length > 0)
            {
                for (int i = 0; i < gaiaGroupId.length; i++)
                {
                    codedoutputbytebuffernano.writeFixed64(1, gaiaGroupId[i]);
                }

            }
            if (hasGroupLicenseCheckoutOrderId || !groupLicenseCheckoutOrderId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, groupLicenseCheckoutOrderId);
            }
            if (groupLicenseKey != null)
            {
                codedoutputbytebuffernano.writeMessage(3, groupLicenseKey);
            }
            if (hasAssignedByGaiaId || assignedByGaiaId != 0L)
            {
                codedoutputbytebuffernano.writeFixed64(4, assignedByGaiaId);
            }
            if (hasDEPRECATEDAssignmentId || !dEPRECATEDAssignmentId.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, dEPRECATEDAssignmentId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LicensedDocumentInfo()
        {
            gaiaGroupId = WireFormatNano.EMPTY_LONG_ARRAY;
            groupLicenseCheckoutOrderId = "";
            hasGroupLicenseCheckoutOrderId = false;
            groupLicenseKey = null;
            assignedByGaiaId = 0L;
            hasAssignedByGaiaId = false;
            dEPRECATEDAssignmentId = "";
            hasDEPRECATEDAssignmentId = false;
            cachedSize = -1;
        }
    }

    public static final class MonthAndDay extends MessageNano
    {

        public int day;
        public boolean hasDay;
        public boolean hasMonth;
        public int month;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasMonth)
                {
                    i = j;
                    if (month == 0)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeUInt32Size(1, month);
            }
            int k;
label1:
            {
                if (!hasDay)
                {
                    k = i;
                    if (day == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeUInt32Size(2, day);
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

                case 8: // '\b'
                    month = codedinputbytebuffernano.readRawVarint32();
                    hasMonth = true;
                    break;

                case 16: // '\020'
                    day = codedinputbytebuffernano.readRawVarint32();
                    hasDay = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasMonth || month != 0)
            {
                codedoutputbytebuffernano.writeUInt32(1, month);
            }
            if (hasDay || day != 0)
            {
                codedoutputbytebuffernano.writeUInt32(2, day);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MonthAndDay()
        {
            month = 0;
            hasMonth = false;
            day = 0;
            hasDay = false;
            cachedSize = -1;
        }
    }

    public static final class Offer extends MessageNano
    {

        private static volatile Offer _emptyArray[];
        public boolean checkoutFlowRequired;
        public Offer convertedPrice[];
        public String currencyCode;
        public String formattedAmount;
        public String formattedDescription;
        public String formattedFullAmount;
        public String formattedName;
        public long fullPriceMicros;
        public boolean hasCheckoutFlowRequired;
        public boolean hasCurrencyCode;
        public boolean hasFormattedAmount;
        public boolean hasFormattedDescription;
        public boolean hasFormattedFullAmount;
        public boolean hasFormattedName;
        public boolean hasFullPriceMicros;
        public boolean hasLicensedOfferType;
        public boolean hasMicros;
        public boolean hasOfferId;
        public boolean hasOfferType;
        public boolean hasOnSaleDate;
        public boolean hasOnSaleDateDisplayTimeZoneOffsetMsec;
        public boolean hasPreorder;
        public boolean hasPreorderFulfillmentDisplayDate;
        public boolean hasTemporarilyFree;
        public LicenseTerms licenseTerms;
        public int licensedOfferType;
        public long micros;
        public String offerId;
        public OfferPayment offerPayment[];
        public int offerType;
        public long onSaleDate;
        public int onSaleDateDisplayTimeZoneOffsetMsec;
        public boolean preorder;
        public long preorderFulfillmentDisplayDate;
        public String promotionLabel[];
        public RentalTerms rentalTerms;
        public SubscriptionContentTerms subscriptionContentTerms;
        public SubscriptionTerms subscriptionTerms;
        public boolean temporarilyFree;
        public VoucherOfferTerms voucherTerms;

        public static Offer[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Offer[0];
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
                if (!hasMicros)
                {
                    i = j;
                    if (micros == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, micros);
            }
            int k;
label1:
            {
                if (!hasCurrencyCode)
                {
                    k = i;
                    if (currencyCode.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
            }
label2:
            {
                if (!hasFormattedAmount)
                {
                    i = k;
                    if (formattedAmount.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(3, formattedAmount);
            }
label3:
            {
                k = i;
                if (convertedPrice != null)
                {
                    k = i;
                    if (convertedPrice.length > 0)
                    {
                        int j1 = 0;
                        do
                        {
                            k = i;
                            if (j1 >= convertedPrice.length)
                            {
                                break;
                            }
                            Offer offer = convertedPrice[j1];
                            k = i;
                            if (offer != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(4, offer);
                            }
                            j1++;
                            i = k;
                        } while (true);
                    }
                }
                if (!hasCheckoutFlowRequired)
                {
                    i = k;
                    if (!checkoutFlowRequired)
                    {
                        break label3;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(5) + 1);
            }
label4:
            {
                if (!hasFullPriceMicros)
                {
                    k = i;
                    if (fullPriceMicros == 0L)
                    {
                        break label4;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(6, fullPriceMicros);
            }
label5:
            {
                if (!hasFormattedFullAmount)
                {
                    i = k;
                    if (formattedFullAmount.equals(""))
                    {
                        break label5;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(7, formattedFullAmount);
            }
label6:
            {
                if (offerType == 1)
                {
                    k = i;
                    if (!hasOfferType)
                    {
                        break label6;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(8, offerType);
            }
label7:
            {
                int k1 = k;
                if (rentalTerms != null)
                {
                    k1 = k + CodedOutputByteBufferNano.computeMessageSize(9, rentalTerms);
                }
                if (!hasOnSaleDate)
                {
                    i = k1;
                    if (onSaleDate == 0L)
                    {
                        break label7;
                    }
                }
                i = k1 + CodedOutputByteBufferNano.computeInt64Size(10, onSaleDate);
            }
label8:
            {
                k = i;
                if (promotionLabel != null)
                {
                    k = i;
                    if (promotionLabel.length > 0)
                    {
                        int k2 = 0;
                        int l1 = 0;
                        for (k = 0; k < promotionLabel.length;)
                        {
                            String s = promotionLabel[k];
                            int l2 = k2;
                            int j2 = l1;
                            if (s != null)
                            {
                                l2 = k2 + 1;
                                j2 = l1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                            }
                            k++;
                            k2 = l2;
                            l1 = j2;
                        }

                        k = i + l1 + k2 * 1;
                    }
                }
                i = k;
                if (subscriptionTerms != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(12, subscriptionTerms);
                }
                if (!hasFormattedName)
                {
                    k = i;
                    if (formattedName.equals(""))
                    {
                        break label8;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(13, formattedName);
            }
label9:
            {
                if (!hasFormattedDescription)
                {
                    i = k;
                    if (formattedDescription.equals(""))
                    {
                        break label9;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(14, formattedDescription);
            }
label10:
            {
                if (!hasPreorder)
                {
                    k = i;
                    if (!preorder)
                    {
                        break label10;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(15) + 1);
            }
label11:
            {
                if (!hasOnSaleDateDisplayTimeZoneOffsetMsec)
                {
                    i = k;
                    if (onSaleDateDisplayTimeZoneOffsetMsec == 0)
                    {
                        break label11;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(16, onSaleDateDisplayTimeZoneOffsetMsec);
            }
label12:
            {
                if (licensedOfferType == 1)
                {
                    k = i;
                    if (!hasLicensedOfferType)
                    {
                        break label12;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(17, licensedOfferType);
            }
label13:
            {
                i = k;
                if (subscriptionContentTerms != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(18, subscriptionContentTerms);
                }
                if (!hasOfferId)
                {
                    k = i;
                    if (offerId.equals(""))
                    {
                        break label13;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(19, offerId);
            }
label14:
            {
                if (!hasPreorderFulfillmentDisplayDate)
                {
                    i = k;
                    if (preorderFulfillmentDisplayDate == 0L)
                    {
                        break label14;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(20, preorderFulfillmentDisplayDate);
            }
            int i2;
label15:
            {
                int l = i;
                if (licenseTerms != null)
                {
                    l = i + CodedOutputByteBufferNano.computeMessageSize(21, licenseTerms);
                }
                if (!hasTemporarilyFree)
                {
                    i2 = l;
                    if (!temporarilyFree)
                    {
                        break label15;
                    }
                }
                i2 = l + (CodedOutputByteBufferNano.computeTagSize(22) + 1);
            }
            i = i2;
            if (voucherTerms != null)
            {
                i = i2 + CodedOutputByteBufferNano.computeMessageSize(23, voucherTerms);
            }
            i2 = i;
            if (offerPayment != null)
            {
                i2 = i;
                if (offerPayment.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        i2 = i;
                        if (i1 >= offerPayment.length)
                        {
                            break;
                        }
                        OfferPayment offerpayment = offerPayment[i1];
                        i2 = i;
                        if (offerpayment != null)
                        {
                            i2 = i + CodedOutputByteBufferNano.computeMessageSize(24, offerpayment);
                        }
                        i1++;
                        i = i2;
                    } while (true);
                }
            }
            return i2;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L27:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 25: default 216
        //                       0: 224
        //                       8: 226
        //                       18: 242
        //                       26: 258
        //                       34: 274
        //                       40: 398
        //                       48: 414
        //                       58: 430
        //                       64: 446
        //                       74: 532
        //                       80: 561
        //                       90: 577
        //                       98: 679
        //                       106: 708
        //                       114: 724
        //                       120: 740
        //                       128: 756
        //                       136: 772
        //                       146: 856
        //                       154: 885
        //                       160: 901
        //                       170: 917
        //                       176: 946
        //                       186: 962
        //                       194: 991;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L27; else goto _L2
_L2:
            return this;
_L3:
            micros = codedinputbytebuffernano.readRawVarint64();
            hasMicros = true;
              goto _L27
_L4:
            currencyCode = codedinputbytebuffernano.readString();
            hasCurrencyCode = true;
              goto _L27
_L5:
            formattedAmount = codedinputbytebuffernano.readString();
            hasFormattedAmount = true;
              goto _L27
_L6:
            int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
            Offer aoffer[];
            int j;
            if (convertedPrice == null)
            {
                j = 0;
            } else
            {
                j = convertedPrice.length;
            }
            aoffer = new Offer[k1 + j];
            k1 = j;
            if (j != 0)
            {
                System.arraycopy(convertedPrice, 0, aoffer, 0, j);
                k1 = j;
            }
            for (; k1 < aoffer.length - 1; k1++)
            {
                aoffer[k1] = new Offer();
                codedinputbytebuffernano.readMessage(aoffer[k1]);
                codedinputbytebuffernano.readTag();
            }

            aoffer[k1] = new Offer();
            codedinputbytebuffernano.readMessage(aoffer[k1]);
            convertedPrice = aoffer;
              goto _L27
_L7:
            checkoutFlowRequired = codedinputbytebuffernano.readBool();
            hasCheckoutFlowRequired = true;
              goto _L27
_L8:
            fullPriceMicros = codedinputbytebuffernano.readRawVarint64();
            hasFullPriceMicros = true;
              goto _L27
_L9:
            formattedFullAmount = codedinputbytebuffernano.readString();
            hasFormattedFullAmount = true;
              goto _L27
_L10:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
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
                offerType = k;
                hasOfferType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L11:
            if (rentalTerms == null)
            {
                rentalTerms = new RentalTerms();
            }
            codedinputbytebuffernano.readMessage(rentalTerms);
            continue; /* Loop/switch isn't completed */
_L12:
            onSaleDate = codedinputbytebuffernano.readRawVarint64();
            hasOnSaleDate = true;
            continue; /* Loop/switch isn't completed */
_L13:
            int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
            String as[];
            int l;
            if (promotionLabel == null)
            {
                l = 0;
            } else
            {
                l = promotionLabel.length;
            }
            as = new String[l1 + l];
            l1 = l;
            if (l != 0)
            {
                System.arraycopy(promotionLabel, 0, as, 0, l);
                l1 = l;
            }
            for (; l1 < as.length - 1; l1++)
            {
                as[l1] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[l1] = codedinputbytebuffernano.readString();
            promotionLabel = as;
            continue; /* Loop/switch isn't completed */
_L14:
            if (subscriptionTerms == null)
            {
                subscriptionTerms = new SubscriptionTerms();
            }
            codedinputbytebuffernano.readMessage(subscriptionTerms);
            continue; /* Loop/switch isn't completed */
_L15:
            formattedName = codedinputbytebuffernano.readString();
            hasFormattedName = true;
            continue; /* Loop/switch isn't completed */
_L16:
            formattedDescription = codedinputbytebuffernano.readString();
            hasFormattedDescription = true;
            continue; /* Loop/switch isn't completed */
_L17:
            preorder = codedinputbytebuffernano.readBool();
            hasPreorder = true;
            continue; /* Loop/switch isn't completed */
_L18:
            onSaleDateDisplayTimeZoneOffsetMsec = codedinputbytebuffernano.readRawVarint32();
            hasOnSaleDateDisplayTimeZoneOffsetMsec = true;
            continue; /* Loop/switch isn't completed */
_L19:
            int i1 = codedinputbytebuffernano.readRawVarint32();
            switch (i1)
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
                licensedOfferType = i1;
                hasLicensedOfferType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L20:
            if (subscriptionContentTerms == null)
            {
                subscriptionContentTerms = new SubscriptionContentTerms();
            }
            codedinputbytebuffernano.readMessage(subscriptionContentTerms);
            continue; /* Loop/switch isn't completed */
_L21:
            offerId = codedinputbytebuffernano.readString();
            hasOfferId = true;
            continue; /* Loop/switch isn't completed */
_L22:
            preorderFulfillmentDisplayDate = codedinputbytebuffernano.readRawVarint64();
            hasPreorderFulfillmentDisplayDate = true;
            continue; /* Loop/switch isn't completed */
_L23:
            if (licenseTerms == null)
            {
                licenseTerms = new LicenseTerms();
            }
            codedinputbytebuffernano.readMessage(licenseTerms);
            continue; /* Loop/switch isn't completed */
_L24:
            temporarilyFree = codedinputbytebuffernano.readBool();
            hasTemporarilyFree = true;
            continue; /* Loop/switch isn't completed */
_L25:
            if (voucherTerms == null)
            {
                voucherTerms = new VoucherOfferTerms();
            }
            codedinputbytebuffernano.readMessage(voucherTerms);
            continue; /* Loop/switch isn't completed */
_L26:
            int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
            OfferPayment aofferpayment[];
            int j1;
            if (offerPayment == null)
            {
                j1 = 0;
            } else
            {
                j1 = offerPayment.length;
            }
            aofferpayment = new OfferPayment[i2 + j1];
            i2 = j1;
            if (j1 != 0)
            {
                System.arraycopy(offerPayment, 0, aofferpayment, 0, j1);
                i2 = j1;
            }
            for (; i2 < aofferpayment.length - 1; i2++)
            {
                aofferpayment[i2] = new OfferPayment();
                codedinputbytebuffernano.readMessage(aofferpayment[i2]);
                codedinputbytebuffernano.readTag();
            }

            aofferpayment[i2] = new OfferPayment();
            codedinputbytebuffernano.readMessage(aofferpayment[i2]);
            offerPayment = aofferpayment;
            if (true) goto _L27; else goto _L28
_L28:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasMicros || micros != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, micros);
            }
            if (hasCurrencyCode || !currencyCode.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, currencyCode);
            }
            if (hasFormattedAmount || !formattedAmount.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, formattedAmount);
            }
            if (convertedPrice != null && convertedPrice.length > 0)
            {
                for (int i = 0; i < convertedPrice.length; i++)
                {
                    Offer offer = convertedPrice[i];
                    if (offer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, offer);
                    }
                }

            }
            if (hasCheckoutFlowRequired || checkoutFlowRequired)
            {
                codedoutputbytebuffernano.writeBool(5, checkoutFlowRequired);
            }
            if (hasFullPriceMicros || fullPriceMicros != 0L)
            {
                codedoutputbytebuffernano.writeInt64(6, fullPriceMicros);
            }
            if (hasFormattedFullAmount || !formattedFullAmount.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, formattedFullAmount);
            }
            if (offerType != 1 || hasOfferType)
            {
                codedoutputbytebuffernano.writeInt32(8, offerType);
            }
            if (rentalTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(9, rentalTerms);
            }
            if (hasOnSaleDate || onSaleDate != 0L)
            {
                codedoutputbytebuffernano.writeInt64(10, onSaleDate);
            }
            if (promotionLabel != null && promotionLabel.length > 0)
            {
                for (int j = 0; j < promotionLabel.length; j++)
                {
                    String s = promotionLabel[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(11, s);
                    }
                }

            }
            if (subscriptionTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(12, subscriptionTerms);
            }
            if (hasFormattedName || !formattedName.equals(""))
            {
                codedoutputbytebuffernano.writeString(13, formattedName);
            }
            if (hasFormattedDescription || !formattedDescription.equals(""))
            {
                codedoutputbytebuffernano.writeString(14, formattedDescription);
            }
            if (hasPreorder || preorder)
            {
                codedoutputbytebuffernano.writeBool(15, preorder);
            }
            if (hasOnSaleDateDisplayTimeZoneOffsetMsec || onSaleDateDisplayTimeZoneOffsetMsec != 0)
            {
                codedoutputbytebuffernano.writeInt32(16, onSaleDateDisplayTimeZoneOffsetMsec);
            }
            if (licensedOfferType != 1 || hasLicensedOfferType)
            {
                codedoutputbytebuffernano.writeInt32(17, licensedOfferType);
            }
            if (subscriptionContentTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(18, subscriptionContentTerms);
            }
            if (hasOfferId || !offerId.equals(""))
            {
                codedoutputbytebuffernano.writeString(19, offerId);
            }
            if (hasPreorderFulfillmentDisplayDate || preorderFulfillmentDisplayDate != 0L)
            {
                codedoutputbytebuffernano.writeInt64(20, preorderFulfillmentDisplayDate);
            }
            if (licenseTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(21, licenseTerms);
            }
            if (hasTemporarilyFree || temporarilyFree)
            {
                codedoutputbytebuffernano.writeBool(22, temporarilyFree);
            }
            if (voucherTerms != null)
            {
                codedoutputbytebuffernano.writeMessage(23, voucherTerms);
            }
            if (offerPayment != null && offerPayment.length > 0)
            {
                for (int k = 0; k < offerPayment.length; k++)
                {
                    OfferPayment offerpayment = offerPayment[k];
                    if (offerpayment != null)
                    {
                        codedoutputbytebuffernano.writeMessage(24, offerpayment);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Offer()
        {
            offerPayment = OfferPayment.emptyArray();
            micros = 0L;
            hasMicros = false;
            currencyCode = "";
            hasCurrencyCode = false;
            formattedAmount = "";
            hasFormattedAmount = false;
            formattedName = "";
            hasFormattedName = false;
            formattedDescription = "";
            hasFormattedDescription = false;
            fullPriceMicros = 0L;
            hasFullPriceMicros = false;
            formattedFullAmount = "";
            hasFormattedFullAmount = false;
            convertedPrice = emptyArray();
            checkoutFlowRequired = false;
            hasCheckoutFlowRequired = false;
            temporarilyFree = false;
            hasTemporarilyFree = false;
            offerType = 1;
            hasOfferType = false;
            licensedOfferType = 1;
            hasLicensedOfferType = false;
            licenseTerms = null;
            rentalTerms = null;
            subscriptionTerms = null;
            subscriptionContentTerms = null;
            voucherTerms = null;
            preorder = false;
            hasPreorder = false;
            preorderFulfillmentDisplayDate = 0L;
            hasPreorderFulfillmentDisplayDate = false;
            onSaleDate = 0L;
            hasOnSaleDate = false;
            onSaleDateDisplayTimeZoneOffsetMsec = 0;
            hasOnSaleDateDisplayTimeZoneOffsetMsec = false;
            promotionLabel = WireFormatNano.EMPTY_STRING_ARRAY;
            offerId = "";
            hasOfferId = false;
            cachedSize = -1;
        }
    }

    public static final class OfferPayment extends MessageNano
    {

        private static volatile OfferPayment _emptyArray[];
        public String currencyCode;
        public boolean hasCurrencyCode;
        public boolean hasMicros;
        public long micros;
        public OfferPaymentPeriod offerPaymentPeriod;

        public static OfferPayment[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new OfferPayment[0];
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
                if (!hasMicros)
                {
                    i = j;
                    if (micros == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, micros);
            }
            int k;
label1:
            {
                if (!hasCurrencyCode)
                {
                    k = i;
                    if (currencyCode.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, currencyCode);
            }
            i = k;
            if (offerPaymentPeriod != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(3, offerPaymentPeriod);
            }
            return i;
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

                case 8: // '\b'
                    micros = codedinputbytebuffernano.readRawVarint64();
                    hasMicros = true;
                    break;

                case 18: // '\022'
                    currencyCode = codedinputbytebuffernano.readString();
                    hasCurrencyCode = true;
                    break;

                case 26: // '\032'
                    if (offerPaymentPeriod == null)
                    {
                        offerPaymentPeriod = new OfferPaymentPeriod();
                    }
                    codedinputbytebuffernano.readMessage(offerPaymentPeriod);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasMicros || micros != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, micros);
            }
            if (hasCurrencyCode || !currencyCode.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, currencyCode);
            }
            if (offerPaymentPeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(3, offerPaymentPeriod);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OfferPayment()
        {
            micros = 0L;
            hasMicros = false;
            currencyCode = "";
            hasCurrencyCode = false;
            offerPaymentPeriod = null;
            cachedSize = -1;
        }
    }

    public static final class OfferPaymentPeriod extends MessageNano
    {

        public TimePeriod duration;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (duration != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, duration);
            }
            return i;
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

                case 10: // '\n'
                    if (duration == null)
                    {
                        duration = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(duration);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (duration != null)
            {
                codedoutputbytebuffernano.writeMessage(1, duration);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OfferPaymentPeriod()
        {
            duration = null;
            cachedSize = -1;
        }
    }

    public static final class RedemptionRecordKey extends MessageNano
    {

        public long campaignId;
        public long codeGroupId;
        public boolean hasCampaignId;
        public boolean hasCodeGroupId;
        public boolean hasPublisherId;
        public boolean hasRecordId;
        public boolean hasType;
        public long publisherId;
        public long recordId;
        public int type;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasPublisherId)
                {
                    i = j;
                    if (publisherId == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, publisherId);
            }
            int k;
label1:
            {
                if (!hasCampaignId)
                {
                    k = i;
                    if (campaignId == 0L)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(2, campaignId);
            }
label2:
            {
                if (!hasCodeGroupId)
                {
                    i = k;
                    if (codeGroupId == 0L)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(3, codeGroupId);
            }
label3:
            {
                if (!hasRecordId)
                {
                    k = i;
                    if (recordId == 0L)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt64Size(4, recordId);
            }
label4:
            {
                if (type == 1)
                {
                    i = k;
                    if (!hasType)
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(5, type);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 72
        //                       8: 74
        //                       16: 90
        //                       24: 106
        //                       32: 122
        //                       40: 138;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            publisherId = codedinputbytebuffernano.readRawVarint64();
            hasPublisherId = true;
              goto _L8
_L4:
            campaignId = codedinputbytebuffernano.readRawVarint64();
            hasCampaignId = true;
              goto _L8
_L5:
            codeGroupId = codedinputbytebuffernano.readRawVarint64();
            hasCodeGroupId = true;
              goto _L8
_L6:
            recordId = codedinputbytebuffernano.readRawVarint64();
            hasRecordId = true;
              goto _L8
_L7:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                type = j;
                hasType = true;
                break;
            }
            if (true) goto _L8; else goto _L9
_L9:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasPublisherId || publisherId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, publisherId);
            }
            if (hasCampaignId || campaignId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, campaignId);
            }
            if (hasCodeGroupId || codeGroupId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(3, codeGroupId);
            }
            if (hasRecordId || recordId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, recordId);
            }
            if (type != 1 || hasType)
            {
                codedoutputbytebuffernano.writeInt32(5, type);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RedemptionRecordKey()
        {
            type = 1;
            hasType = false;
            publisherId = 0L;
            hasPublisherId = false;
            campaignId = 0L;
            hasCampaignId = false;
            codeGroupId = 0L;
            hasCodeGroupId = false;
            recordId = 0L;
            hasRecordId = false;
            cachedSize = -1;
        }
    }

    public static final class RentalTerms extends MessageNano
    {

        public TimePeriod activatePeriod;
        public int dEPRECATEDActivatePeriodSeconds;
        public int dEPRECATEDGrantPeriodSeconds;
        public long grantEndTimeSeconds;
        public TimePeriod grantPeriod;
        public boolean hasDEPRECATEDActivatePeriodSeconds;
        public boolean hasDEPRECATEDGrantPeriodSeconds;
        public boolean hasGrantEndTimeSeconds;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasDEPRECATEDGrantPeriodSeconds)
                {
                    i = j;
                    if (dEPRECATEDGrantPeriodSeconds == 0)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, dEPRECATEDGrantPeriodSeconds);
            }
            int k;
label1:
            {
                if (!hasDEPRECATEDActivatePeriodSeconds)
                {
                    k = i;
                    if (dEPRECATEDActivatePeriodSeconds == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, dEPRECATEDActivatePeriodSeconds);
            }
label2:
            {
                i = k;
                if (grantPeriod != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(3, grantPeriod);
                }
                k = i;
                if (activatePeriod != null)
                {
                    k = i + CodedOutputByteBufferNano.computeMessageSize(4, activatePeriod);
                }
                if (!hasGrantEndTimeSeconds)
                {
                    i = k;
                    if (grantEndTimeSeconds == 0L)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(5, grantEndTimeSeconds);
            }
            return i;
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

                case 8: // '\b'
                    dEPRECATEDGrantPeriodSeconds = codedinputbytebuffernano.readRawVarint32();
                    hasDEPRECATEDGrantPeriodSeconds = true;
                    break;

                case 16: // '\020'
                    dEPRECATEDActivatePeriodSeconds = codedinputbytebuffernano.readRawVarint32();
                    hasDEPRECATEDActivatePeriodSeconds = true;
                    break;

                case 26: // '\032'
                    if (grantPeriod == null)
                    {
                        grantPeriod = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(grantPeriod);
                    break;

                case 34: // '"'
                    if (activatePeriod == null)
                    {
                        activatePeriod = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(activatePeriod);
                    break;

                case 40: // '('
                    grantEndTimeSeconds = codedinputbytebuffernano.readRawVarint64();
                    hasGrantEndTimeSeconds = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasDEPRECATEDGrantPeriodSeconds || dEPRECATEDGrantPeriodSeconds != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, dEPRECATEDGrantPeriodSeconds);
            }
            if (hasDEPRECATEDActivatePeriodSeconds || dEPRECATEDActivatePeriodSeconds != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, dEPRECATEDActivatePeriodSeconds);
            }
            if (grantPeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(3, grantPeriod);
            }
            if (activatePeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(4, activatePeriod);
            }
            if (hasGrantEndTimeSeconds || grantEndTimeSeconds != 0L)
            {
                codedoutputbytebuffernano.writeInt64(5, grantEndTimeSeconds);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RentalTerms()
        {
            grantPeriod = null;
            activatePeriod = null;
            grantEndTimeSeconds = 0L;
            hasGrantEndTimeSeconds = false;
            dEPRECATEDGrantPeriodSeconds = 0;
            hasDEPRECATEDGrantPeriodSeconds = false;
            dEPRECATEDActivatePeriodSeconds = 0;
            hasDEPRECATEDActivatePeriodSeconds = false;
            cachedSize = -1;
        }
    }

    public static final class SeasonalSubscriptionInfo extends MessageNano
    {

        public boolean hasMidSeasonPricingStrategy;
        public int midSeasonPricingStrategy;
        public MonthAndDay periodEnd;
        public MonthAndDay periodStart;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                i = j;
                if (periodStart != null)
                {
                    i = j + CodedOutputByteBufferNano.computeMessageSize(1, periodStart);
                }
                j = i;
                if (periodEnd != null)
                {
                    j = i + CodedOutputByteBufferNano.computeMessageSize(2, periodEnd);
                }
                if (midSeasonPricingStrategy == 0)
                {
                    i = j;
                    if (!hasMidSeasonPricingStrategy)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, midSeasonPricingStrategy);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       10: 58
        //                       18: 87
        //                       24: 116;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            if (periodStart == null)
            {
                periodStart = new MonthAndDay();
            }
            codedinputbytebuffernano.readMessage(periodStart);
              goto _L6
_L4:
            if (periodEnd == null)
            {
                periodEnd = new MonthAndDay();
            }
            codedinputbytebuffernano.readMessage(periodEnd);
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                midSeasonPricingStrategy = j;
                hasMidSeasonPricingStrategy = true;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (periodStart != null)
            {
                codedoutputbytebuffernano.writeMessage(1, periodStart);
            }
            if (periodEnd != null)
            {
                codedoutputbytebuffernano.writeMessage(2, periodEnd);
            }
            if (midSeasonPricingStrategy != 0 || hasMidSeasonPricingStrategy)
            {
                codedoutputbytebuffernano.writeInt32(3, midSeasonPricingStrategy);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SeasonalSubscriptionInfo()
        {
            periodStart = null;
            periodEnd = null;
            midSeasonPricingStrategy = 0;
            hasMidSeasonPricingStrategy = false;
            cachedSize = -1;
        }
    }

    public static final class SignedData extends MessageNano
    {

        public boolean hasSignature;
        public boolean hasSignedData;
        public String signature;
        public String signedData;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasSignedData)
                {
                    i = j;
                    if (signedData.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(1, signedData);
            }
            int k;
label1:
            {
                if (!hasSignature)
                {
                    k = i;
                    if (signature.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, signature);
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

                case 10: // '\n'
                    signedData = codedinputbytebuffernano.readString();
                    hasSignedData = true;
                    break;

                case 18: // '\022'
                    signature = codedinputbytebuffernano.readString();
                    hasSignature = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasSignedData || !signedData.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, signedData);
            }
            if (hasSignature || !signature.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, signature);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SignedData()
        {
            signedData = "";
            hasSignedData = false;
            signature = "";
            hasSignature = false;
            cachedSize = -1;
        }
    }

    public static final class SubscriptionContentTerms extends MessageNano
    {

        public Docid requiredSubscription;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (requiredSubscription != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, requiredSubscription);
            }
            return i;
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

                case 10: // '\n'
                    if (requiredSubscription == null)
                    {
                        requiredSubscription = new Docid();
                    }
                    codedinputbytebuffernano.readMessage(requiredSubscription);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (requiredSubscription != null)
            {
                codedoutputbytebuffernano.writeMessage(1, requiredSubscription);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubscriptionContentTerms()
        {
            requiredSubscription = null;
            cachedSize = -1;
        }
    }

    public static final class SubscriptionTerms extends MessageNano
    {

        public String formattedPriceWithRecurrencePeriod;
        public TimePeriod gracePeriod;
        public boolean hasFormattedPriceWithRecurrencePeriod;
        public boolean hasInitialValidUntilTimestampMsec;
        public boolean hasResignup;
        public long initialValidUntilTimestampMsec;
        public TimePeriod recurringPeriod;
        public Docid replaceDocid[];
        public boolean resignup;
        public SeasonalSubscriptionInfo seasonalSubscriptionInfo;
        public TimePeriod trialPeriod;

        protected final int computeSerializedSize()
        {
            int j1;
label0:
            {
                int l = super.computeSerializedSize();
                int i = l;
                if (recurringPeriod != null)
                {
                    i = l + CodedOutputByteBufferNano.computeMessageSize(1, recurringPeriod);
                }
                l = i;
                if (trialPeriod != null)
                {
                    l = i + CodedOutputByteBufferNano.computeMessageSize(2, trialPeriod);
                }
                if (!hasFormattedPriceWithRecurrencePeriod)
                {
                    j1 = l;
                    if (formattedPriceWithRecurrencePeriod.equals(""))
                    {
                        break label0;
                    }
                }
                j1 = l + CodedOutputByteBufferNano.computeStringSize(3, formattedPriceWithRecurrencePeriod);
            }
            int i1;
label1:
            {
                int j = j1;
                if (seasonalSubscriptionInfo != null)
                {
                    j = j1 + CodedOutputByteBufferNano.computeMessageSize(4, seasonalSubscriptionInfo);
                }
                i1 = j;
                if (replaceDocid != null)
                {
                    i1 = j;
                    if (replaceDocid.length > 0)
                    {
                        int k1 = 0;
                        do
                        {
                            i1 = j;
                            if (k1 >= replaceDocid.length)
                            {
                                break;
                            }
                            Docid docid = replaceDocid[k1];
                            i1 = j;
                            if (docid != null)
                            {
                                i1 = j + CodedOutputByteBufferNano.computeMessageSize(5, docid);
                            }
                            k1++;
                            j = i1;
                        } while (true);
                    }
                }
                j = i1;
                if (gracePeriod != null)
                {
                    j = i1 + CodedOutputByteBufferNano.computeMessageSize(6, gracePeriod);
                }
                if (!hasResignup)
                {
                    i1 = j;
                    if (!resignup)
                    {
                        break label1;
                    }
                }
                i1 = j + (CodedOutputByteBufferNano.computeTagSize(7) + 1);
            }
            int k;
label2:
            {
                if (!hasInitialValidUntilTimestampMsec)
                {
                    k = i1;
                    if (initialValidUntilTimestampMsec == 0L)
                    {
                        break label2;
                    }
                }
                k = i1 + CodedOutputByteBufferNano.computeInt64Size(8, initialValidUntilTimestampMsec);
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

                case 10: // '\n'
                    if (recurringPeriod == null)
                    {
                        recurringPeriod = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(recurringPeriod);
                    break;

                case 18: // '\022'
                    if (trialPeriod == null)
                    {
                        trialPeriod = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(trialPeriod);
                    break;

                case 26: // '\032'
                    formattedPriceWithRecurrencePeriod = codedinputbytebuffernano.readString();
                    hasFormattedPriceWithRecurrencePeriod = true;
                    break;

                case 34: // '"'
                    if (seasonalSubscriptionInfo == null)
                    {
                        seasonalSubscriptionInfo = new SeasonalSubscriptionInfo();
                    }
                    codedinputbytebuffernano.readMessage(seasonalSubscriptionInfo);
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    Docid adocid[];
                    int j;
                    if (replaceDocid == null)
                    {
                        j = 0;
                    } else
                    {
                        j = replaceDocid.length;
                    }
                    adocid = new Docid[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(replaceDocid, 0, adocid, 0, j);
                        k = j;
                    }
                    for (; k < adocid.length - 1; k++)
                    {
                        adocid[k] = new Docid();
                        codedinputbytebuffernano.readMessage(adocid[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocid[k] = new Docid();
                    codedinputbytebuffernano.readMessage(adocid[k]);
                    replaceDocid = adocid;
                    break;

                case 50: // '2'
                    if (gracePeriod == null)
                    {
                        gracePeriod = new TimePeriod();
                    }
                    codedinputbytebuffernano.readMessage(gracePeriod);
                    break;

                case 56: // '8'
                    resignup = codedinputbytebuffernano.readBool();
                    hasResignup = true;
                    break;

                case 64: // '@'
                    initialValidUntilTimestampMsec = codedinputbytebuffernano.readRawVarint64();
                    hasInitialValidUntilTimestampMsec = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (recurringPeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(1, recurringPeriod);
            }
            if (trialPeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(2, trialPeriod);
            }
            if (hasFormattedPriceWithRecurrencePeriod || !formattedPriceWithRecurrencePeriod.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, formattedPriceWithRecurrencePeriod);
            }
            if (seasonalSubscriptionInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, seasonalSubscriptionInfo);
            }
            if (replaceDocid != null && replaceDocid.length > 0)
            {
                for (int i = 0; i < replaceDocid.length; i++)
                {
                    Docid docid = replaceDocid[i];
                    if (docid != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, docid);
                    }
                }

            }
            if (gracePeriod != null)
            {
                codedoutputbytebuffernano.writeMessage(6, gracePeriod);
            }
            if (hasResignup || resignup)
            {
                codedoutputbytebuffernano.writeBool(7, resignup);
            }
            if (hasInitialValidUntilTimestampMsec || initialValidUntilTimestampMsec != 0L)
            {
                codedoutputbytebuffernano.writeInt64(8, initialValidUntilTimestampMsec);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SubscriptionTerms()
        {
            recurringPeriod = null;
            trialPeriod = null;
            formattedPriceWithRecurrencePeriod = "";
            hasFormattedPriceWithRecurrencePeriod = false;
            seasonalSubscriptionInfo = null;
            replaceDocid = Docid.emptyArray();
            gracePeriod = null;
            resignup = false;
            hasResignup = false;
            initialValidUntilTimestampMsec = 0L;
            hasInitialValidUntilTimestampMsec = false;
            cachedSize = -1;
        }
    }

    public static final class TimePeriod extends MessageNano
    {

        public int count;
        public boolean hasCount;
        public boolean hasUnit;
        public int unit;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (unit == 0)
                {
                    i = j;
                    if (!hasUnit)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, unit);
            }
            int k;
label1:
            {
                if (!hasCount)
                {
                    k = i;
                    if (count == 0)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, count);
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 120;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                unit = j;
                hasUnit = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            count = codedinputbytebuffernano.readRawVarint32();
            hasCount = true;
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (unit != 0 || hasUnit)
            {
                codedoutputbytebuffernano.writeInt32(1, unit);
            }
            if (hasCount || count != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, count);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TimePeriod()
        {
            unit = 0;
            hasUnit = false;
            count = 0;
            hasCount = false;
            cachedSize = -1;
        }
    }

    public static final class VoucherId extends MessageNano
    {

        public RedemptionRecordKey key;
        public Docid voucherDocid;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (voucherDocid != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, voucherDocid);
            }
            j = i;
            if (key != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, key);
            }
            return j;
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

                case 10: // '\n'
                    if (voucherDocid == null)
                    {
                        voucherDocid = new Docid();
                    }
                    codedinputbytebuffernano.readMessage(voucherDocid);
                    break;

                case 18: // '\022'
                    if (key == null)
                    {
                        key = new RedemptionRecordKey();
                    }
                    codedinputbytebuffernano.readMessage(key);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (voucherDocid != null)
            {
                codedoutputbytebuffernano.writeMessage(1, voucherDocid);
            }
            if (key != null)
            {
                codedoutputbytebuffernano.writeMessage(2, key);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VoucherId()
        {
            voucherDocid = null;
            key = null;
            cachedSize = -1;
        }
    }

    public static final class VoucherOfferTerms extends MessageNano
    {

        public boolean hasVoucherFormattedAmount;
        public boolean hasVoucherPriceMicros;
        public Docid voucherDocid[];
        public String voucherFormattedAmount;
        public long voucherPriceMicros;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                i = super.computeSerializedSize();
                int j = i;
                if (voucherDocid != null)
                {
                    j = i;
                    if (voucherDocid.length > 0)
                    {
                        int l = 0;
                        do
                        {
                            j = i;
                            if (l >= voucherDocid.length)
                            {
                                break;
                            }
                            Docid docid = voucherDocid[l];
                            j = i;
                            if (docid != null)
                            {
                                j = i + CodedOutputByteBufferNano.computeMessageSize(1, docid);
                            }
                            l++;
                            i = j;
                        } while (true);
                    }
                }
                if (!hasVoucherPriceMicros)
                {
                    i = j;
                    if (voucherPriceMicros == 0L)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, voucherPriceMicros);
            }
            int k;
label1:
            {
                if (!hasVoucherFormattedAmount)
                {
                    k = i;
                    if (voucherFormattedAmount.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(3, voucherFormattedAmount);
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

                case 10: // '\n'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    Docid adocid[];
                    int j;
                    if (voucherDocid == null)
                    {
                        j = 0;
                    } else
                    {
                        j = voucherDocid.length;
                    }
                    adocid = new Docid[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(voucherDocid, 0, adocid, 0, j);
                        k = j;
                    }
                    for (; k < adocid.length - 1; k++)
                    {
                        adocid[k] = new Docid();
                        codedinputbytebuffernano.readMessage(adocid[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocid[k] = new Docid();
                    codedinputbytebuffernano.readMessage(adocid[k]);
                    voucherDocid = adocid;
                    break;

                case 16: // '\020'
                    voucherPriceMicros = codedinputbytebuffernano.readRawVarint64();
                    hasVoucherPriceMicros = true;
                    break;

                case 26: // '\032'
                    voucherFormattedAmount = codedinputbytebuffernano.readString();
                    hasVoucherFormattedAmount = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (voucherDocid != null && voucherDocid.length > 0)
            {
                for (int i = 0; i < voucherDocid.length; i++)
                {
                    Docid docid = voucherDocid[i];
                    if (docid != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, docid);
                    }
                }

            }
            if (hasVoucherPriceMicros || voucherPriceMicros != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, voucherPriceMicros);
            }
            if (hasVoucherFormattedAmount || !voucherFormattedAmount.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, voucherFormattedAmount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VoucherOfferTerms()
        {
            voucherDocid = Docid.emptyArray();
            voucherPriceMicros = 0L;
            hasVoucherPriceMicros = false;
            voucherFormattedAmount = "";
            hasVoucherFormattedAmount = false;
            cachedSize = -1;
        }
    }

}
