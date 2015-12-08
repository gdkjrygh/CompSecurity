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

public interface NanoWalletLoyalty
{
    public static final class DiscoverLoyaltyProgramsRequest extends ExtendableMessageNano
    {

        public String continuationToken;
        public Boolean includeNonIntegrated;
        public com.google.wallet.proto.NanoWalletEntities.PhysicalLocation location;
        public Integer pageSize;
        public String queryString;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public Boolean supportsHorizontalSections;
        public Boolean supportsOptionalData;

        private DiscoverLoyaltyProgramsRequest clear()
        {
            queryString = null;
            continuationToken = null;
            pageSize = null;
            renderInfo = null;
            includeNonIntegrated = null;
            supportsOptionalData = null;
            location = null;
            supportsHorizontalSections = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverLoyaltyProgramsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    queryString = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    continuationToken = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    pageSize = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 34: // '"'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 40: // '('
                    includeNonIntegrated = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 48: // '0'
                    supportsOptionalData = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 58: // ':'
                    if (location == null)
                    {
                        location = new com.google.wallet.proto.NanoWalletEntities.PhysicalLocation();
                    }
                    codedinputbytebuffernano.readMessage(location);
                    break;

                case 64: // '@'
                    supportsHorizontalSections = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (queryString != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, queryString);
            }
            j = i;
            if (continuationToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, continuationToken);
            }
            i = j;
            if (pageSize != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, pageSize.intValue());
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, renderInfo);
            }
            i = j;
            if (includeNonIntegrated != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, includeNonIntegrated.booleanValue());
            }
            j = i;
            if (supportsOptionalData != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(6, supportsOptionalData.booleanValue());
            }
            i = j;
            if (location != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, location);
            }
            j = i;
            if (supportsHorizontalSections != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(8, supportsHorizontalSections.booleanValue());
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
            if (queryString != null)
            {
                codedoutputbytebuffernano.writeString(1, queryString);
            }
            if (continuationToken != null)
            {
                codedoutputbytebuffernano.writeString(2, continuationToken);
            }
            if (pageSize != null)
            {
                codedoutputbytebuffernano.writeInt32(3, pageSize.intValue());
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, renderInfo);
            }
            if (includeNonIntegrated != null)
            {
                codedoutputbytebuffernano.writeBool(5, includeNonIntegrated.booleanValue());
            }
            if (supportsOptionalData != null)
            {
                codedoutputbytebuffernano.writeBool(6, supportsOptionalData.booleanValue());
            }
            if (location != null)
            {
                codedoutputbytebuffernano.writeMessage(7, location);
            }
            if (supportsHorizontalSections != null)
            {
                codedoutputbytebuffernano.writeBool(8, supportsHorizontalSections.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverLoyaltyProgramsRequest()
        {
            clear();
        }
    }

    public static final class DiscoverLoyaltyProgramsResponse extends ExtendableMessageNano
    {

        public String continuationToken;
        public DiscoverableLoyaltyProgram programs[];
        public Section section[];

        private DiscoverLoyaltyProgramsResponse clear()
        {
            programs = DiscoverableLoyaltyProgram.emptyArray();
            continuationToken = null;
            section = Section.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverLoyaltyProgramsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    DiscoverableLoyaltyProgram adiscoverableloyaltyprogram[];
                    int j;
                    if (programs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = programs.length;
                    }
                    adiscoverableloyaltyprogram = new DiscoverableLoyaltyProgram[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(programs, 0, adiscoverableloyaltyprogram, 0, j);
                        l = j;
                    }
                    for (; l < adiscoverableloyaltyprogram.length - 1; l++)
                    {
                        adiscoverableloyaltyprogram[l] = new DiscoverableLoyaltyProgram();
                        codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    adiscoverableloyaltyprogram[l] = new DiscoverableLoyaltyProgram();
                    codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[l]);
                    programs = adiscoverableloyaltyprogram;
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
                        DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[l];
                        j = i;
                        if (discoverableloyaltyprogram != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, discoverableloyaltyprogram);
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
                        Section section1 = section[k];
                        i1 = i;
                        if (section1 != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, section1);
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
                    DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[i];
                    if (discoverableloyaltyprogram != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, discoverableloyaltyprogram);
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

        public DiscoverLoyaltyProgramsResponse()
        {
            clear();
        }
    }

    public static final class DiscoverLoyaltyProgramsResponse.Section extends ExtendableMessageNano
    {

        private static volatile DiscoverLoyaltyProgramsResponse.Section _emptyArray[];
        public Integer orientation;
        public DiscoverableLoyaltyProgram programs[];
        public String title;

        private DiscoverLoyaltyProgramsResponse.Section clear()
        {
            title = null;
            orientation = null;
            programs = DiscoverableLoyaltyProgram.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static DiscoverLoyaltyProgramsResponse.Section[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DiscoverLoyaltyProgramsResponse.Section[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private DiscoverLoyaltyProgramsResponse.Section mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            DiscoverableLoyaltyProgram adiscoverableloyaltyprogram[];
            int k;
            if (programs == null)
            {
                k = 0;
            } else
            {
                k = programs.length;
            }
            adiscoverableloyaltyprogram = new DiscoverableLoyaltyProgram[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(programs, 0, adiscoverableloyaltyprogram, 0, k);
                l = k;
            }
            for (; l < adiscoverableloyaltyprogram.length - 1; l++)
            {
                adiscoverableloyaltyprogram[l] = new DiscoverableLoyaltyProgram();
                codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[l]);
                codedinputbytebuffernano.readTag();
            }

            adiscoverableloyaltyprogram[l] = new DiscoverableLoyaltyProgram();
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
                        DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[k];
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
                    DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[i];
                    if (discoverableloyaltyprogram != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, discoverableloyaltyprogram);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverLoyaltyProgramsResponse.Section()
        {
            clear();
        }
    }

    public static final class DiscoverableLoyaltyProgram extends ExtendableMessageNano
    {

        private static volatile DiscoverableLoyaltyProgram _emptyArray[];
        public LinkingInfo linkingInfo;
        public Boolean linkingSupported;
        public NativeRenderingInfo nativeRenderingInfo;
        public String privacyUrl;
        public String programDetailUrl;
        public String programId;
        public com.google.wallet.proto.NanoWalletWobl.RenderOutput renderOutput;
        public SignupInfo signupInfo;
        public Boolean signupSupported;
        public Integer status;
        public String tosUrl;

        private DiscoverableLoyaltyProgram clear()
        {
            programId = null;
            programDetailUrl = null;
            linkingSupported = null;
            linkingInfo = null;
            signupSupported = null;
            signupInfo = null;
            nativeRenderingInfo = null;
            tosUrl = null;
            status = null;
            privacyUrl = null;
            renderOutput = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static DiscoverableLoyaltyProgram[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new DiscoverableLoyaltyProgram[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private DiscoverableLoyaltyProgram mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L14:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 12: default 112
        //                       0: 121
        //                       10: 123
        //                       18: 134
        //                       24: 145
        //                       34: 159
        //                       40: 188
        //                       50: 202
        //                       58: 231
        //                       66: 260
        //                       72: 271
        //                       82: 326
        //                       90: 337;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L14; else goto _L2
_L2:
            return this;
_L3:
            programId = codedinputbytebuffernano.readString();
              goto _L14
_L4:
            programDetailUrl = codedinputbytebuffernano.readString();
              goto _L14
_L5:
            linkingSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L14
_L6:
            if (linkingInfo == null)
            {
                linkingInfo = new LinkingInfo();
            }
            codedinputbytebuffernano.readMessage(linkingInfo);
              goto _L14
_L7:
            signupSupported = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L14
_L8:
            if (signupInfo == null)
            {
                signupInfo = new SignupInfo();
            }
            codedinputbytebuffernano.readMessage(signupInfo);
              goto _L14
_L9:
            if (nativeRenderingInfo == null)
            {
                nativeRenderingInfo = new NativeRenderingInfo();
            }
            codedinputbytebuffernano.readMessage(nativeRenderingInfo);
              goto _L14
_L10:
            tosUrl = codedinputbytebuffernano.readString();
              goto _L14
_L11:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                status = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L12:
            privacyUrl = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L13:
            if (renderOutput == null)
            {
                renderOutput = new com.google.wallet.proto.NanoWalletWobl.RenderOutput();
            }
            codedinputbytebuffernano.readMessage(renderOutput);
            if (true) goto _L14; else goto _L15
_L15:
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
            if (programDetailUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, programDetailUrl);
            }
            i = j;
            if (linkingSupported != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, linkingSupported.booleanValue());
            }
            j = i;
            if (linkingInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, linkingInfo);
            }
            i = j;
            if (signupSupported != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(5, signupSupported.booleanValue());
            }
            j = i;
            if (signupInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, signupInfo);
            }
            i = j;
            if (nativeRenderingInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, nativeRenderingInfo);
            }
            j = i;
            if (tosUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, tosUrl);
            }
            i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(9, status.intValue());
            }
            j = i;
            if (privacyUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, privacyUrl);
            }
            i = j;
            if (renderOutput != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, renderOutput);
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
            if (programId != null)
            {
                codedoutputbytebuffernano.writeString(1, programId);
            }
            if (programDetailUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, programDetailUrl);
            }
            if (linkingSupported != null)
            {
                codedoutputbytebuffernano.writeBool(3, linkingSupported.booleanValue());
            }
            if (linkingInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, linkingInfo);
            }
            if (signupSupported != null)
            {
                codedoutputbytebuffernano.writeBool(5, signupSupported.booleanValue());
            }
            if (signupInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(6, signupInfo);
            }
            if (nativeRenderingInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(7, nativeRenderingInfo);
            }
            if (tosUrl != null)
            {
                codedoutputbytebuffernano.writeString(8, tosUrl);
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(9, status.intValue());
            }
            if (privacyUrl != null)
            {
                codedoutputbytebuffernano.writeString(10, privacyUrl);
            }
            if (renderOutput != null)
            {
                codedoutputbytebuffernano.writeMessage(11, renderOutput);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableLoyaltyProgram()
        {
            clear();
        }
    }

    public static final class DiscoverableLoyaltyProgram.LinkingInfo extends ExtendableMessageNano
    {

        public Boolean enableCamera;
        public String identifierLabel;
        public Integer identifierTypeOrdinal;
        public SharedDataConfig sharedDataConfigs[];

        private DiscoverableLoyaltyProgram.LinkingInfo clear()
        {
            identifierTypeOrdinal = null;
            identifierLabel = null;
            enableCamera = null;
            sharedDataConfigs = SharedDataConfig.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableLoyaltyProgram.LinkingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    identifierTypeOrdinal = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    identifierLabel = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    enableCamera = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    SharedDataConfig ashareddataconfig[];
                    int j;
                    if (sharedDataConfigs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataConfigs.length;
                    }
                    ashareddataconfig = new SharedDataConfig[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataConfigs, 0, ashareddataconfig, 0, j);
                        k = j;
                    }
                    for (; k < ashareddataconfig.length - 1; k++)
                    {
                        ashareddataconfig[k] = new SharedDataConfig();
                        codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ashareddataconfig[k] = new SharedDataConfig();
                    codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                    sharedDataConfigs = ashareddataconfig;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (identifierTypeOrdinal != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, identifierTypeOrdinal.intValue());
            }
            j = i;
            if (identifierLabel != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, identifierLabel);
            }
            i = j;
            if (enableCamera != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, enableCamera.booleanValue());
            }
            int l = i;
            if (sharedDataConfigs != null)
            {
                l = i;
                if (sharedDataConfigs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= sharedDataConfigs.length)
                        {
                            break;
                        }
                        SharedDataConfig shareddataconfig = sharedDataConfigs[k];
                        l = i;
                        if (shareddataconfig != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, shareddataconfig);
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
            if (identifierTypeOrdinal != null)
            {
                codedoutputbytebuffernano.writeInt32(1, identifierTypeOrdinal.intValue());
            }
            if (identifierLabel != null)
            {
                codedoutputbytebuffernano.writeString(2, identifierLabel);
            }
            if (enableCamera != null)
            {
                codedoutputbytebuffernano.writeBool(3, enableCamera.booleanValue());
            }
            if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
            {
                for (int i = 0; i < sharedDataConfigs.length; i++)
                {
                    SharedDataConfig shareddataconfig = sharedDataConfigs[i];
                    if (shareddataconfig != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, shareddataconfig);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableLoyaltyProgram.LinkingInfo()
        {
            clear();
        }
    }

    public static final class DiscoverableLoyaltyProgram.NativeRenderingInfo extends ExtendableMessageNano
    {

        public String logoImageUrl;
        public String merchantName;
        public String programName;

        private DiscoverableLoyaltyProgram.NativeRenderingInfo clear()
        {
            programName = null;
            merchantName = null;
            logoImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableLoyaltyProgram.NativeRenderingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    programName = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    logoImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (programName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, programName);
            }
            j = i;
            if (merchantName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, merchantName);
            }
            i = j;
            if (logoImageUrl != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, logoImageUrl);
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
            if (programName != null)
            {
                codedoutputbytebuffernano.writeString(1, programName);
            }
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(2, merchantName);
            }
            if (logoImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(3, logoImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableLoyaltyProgram.NativeRenderingInfo()
        {
            clear();
        }
    }

    public static final class DiscoverableLoyaltyProgram.SignupInfo extends ExtendableMessageNano
    {

        public Boolean marketingOptInDefault;
        public SharedDataConfig sharedDataConfigs[];
        public String signupIncentive;

        private DiscoverableLoyaltyProgram.SignupInfo clear()
        {
            sharedDataConfigs = SharedDataConfig.emptyArray();
            signupIncentive = null;
            marketingOptInDefault = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableLoyaltyProgram.SignupInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    SharedDataConfig ashareddataconfig[];
                    int j;
                    if (sharedDataConfigs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataConfigs.length;
                    }
                    ashareddataconfig = new SharedDataConfig[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataConfigs, 0, ashareddataconfig, 0, j);
                        k = j;
                    }
                    for (; k < ashareddataconfig.length - 1; k++)
                    {
                        ashareddataconfig[k] = new SharedDataConfig();
                        codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ashareddataconfig[k] = new SharedDataConfig();
                    codedinputbytebuffernano.readMessage(ashareddataconfig[k]);
                    sharedDataConfigs = ashareddataconfig;
                    break;

                case 18: // '\022'
                    signupIncentive = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    marketingOptInDefault = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (sharedDataConfigs != null)
            {
                j = i;
                if (sharedDataConfigs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= sharedDataConfigs.length)
                        {
                            break;
                        }
                        SharedDataConfig shareddataconfig = sharedDataConfigs[k];
                        j = i;
                        if (shareddataconfig != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, shareddataconfig);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (signupIncentive != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, signupIncentive);
            }
            j = i;
            if (marketingOptInDefault != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(3, marketingOptInDefault.booleanValue());
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
            if (sharedDataConfigs != null && sharedDataConfigs.length > 0)
            {
                for (int i = 0; i < sharedDataConfigs.length; i++)
                {
                    SharedDataConfig shareddataconfig = sharedDataConfigs[i];
                    if (shareddataconfig != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, shareddataconfig);
                    }
                }

            }
            if (signupIncentive != null)
            {
                codedoutputbytebuffernano.writeString(2, signupIncentive);
            }
            if (marketingOptInDefault != null)
            {
                codedoutputbytebuffernano.writeBool(3, marketingOptInDefault.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableLoyaltyProgram.SignupInfo()
        {
            clear();
        }
    }

    public static final class EditLoyaltyRequest extends ExtendableMessageNano
    {

        public NanoWalletWobForms.InputFormSubmission formSubmission;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public byte serverData[];

        private EditLoyaltyRequest clear()
        {
            serverData = null;
            formSubmission = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EditLoyaltyRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serverData = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    if (formSubmission == null)
                    {
                        formSubmission = new NanoWalletWobForms.InputFormSubmission();
                    }
                    codedinputbytebuffernano.readMessage(formSubmission);
                    break;

                case 26: // '\032'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, serverData);
            }
            j = i;
            if (formSubmission != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, formSubmission);
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
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
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(1, serverData);
            }
            if (formSubmission != null)
            {
                codedoutputbytebuffernano.writeMessage(2, formSubmission);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EditLoyaltyRequest()
        {
            clear();
        }
    }

    public static final class EditLoyaltyResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private EditLoyaltyResponse clear()
        {
            wobInstance = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EditLoyaltyResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (wobInstance == null)
                    {
                        wobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(wobInstance);
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobInstance != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, wobInstance);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
            if (wobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(1, wobInstance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EditLoyaltyResponse()
        {
            clear();
        }
    }

    public static final class GetLoyaltyEditFormRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public byte serverData[];

        private GetLoyaltyEditFormRequest clear()
        {
            serverData = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltyEditFormRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serverData = codedinputbytebuffernano.readBytes();
                    break;

                case 26: // '\032'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serverData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, serverData);
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, renderInfo);
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
            if (serverData != null)
            {
                codedoutputbytebuffernano.writeBytes(1, serverData);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltyEditFormRequest()
        {
            clear();
        }
    }

    public static final class GetLoyaltyEditFormResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public LoyaltyForm loyaltyForm;

        private GetLoyaltyEditFormResponse clear()
        {
            loyaltyForm = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltyEditFormResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 26: // '\032'
                    if (loyaltyForm == null)
                    {
                        loyaltyForm = new LoyaltyForm();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyForm);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            j = i;
            if (loyaltyForm != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, loyaltyForm);
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
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (loyaltyForm != null)
            {
                codedoutputbytebuffernano.writeMessage(3, loyaltyForm);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltyEditFormResponse()
        {
            clear();
        }
    }

    public static final class GetLoyaltyProgramsRequest extends ExtendableMessageNano
    {

        public String programId[];
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public Boolean supportsOptionalData;

        private GetLoyaltyProgramsRequest clear()
        {
            programId = WireFormatNano.EMPTY_STRING_ARRAY;
            renderInfo = null;
            supportsOptionalData = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltyProgramsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    String as[];
                    int j;
                    if (programId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = programId.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(programId, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    programId = as;
                    break;

                case 18: // '\022'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 24: // '\030'
                    supportsOptionalData = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int k1 = super.computeSerializedSize();
            int i = k1;
            if (programId != null)
            {
                i = k1;
                if (programId.length > 0)
                {
                    int i1 = 0;
                    int j = 0;
                    for (i = 0; i < programId.length;)
                    {
                        String s = programId[i];
                        int j1 = i1;
                        int l = j;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        i1 = j1;
                        j = l;
                    }

                    i = k1 + j + i1 * 1;
                }
            }
            int k = i;
            if (renderInfo != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
            }
            i = k;
            if (supportsOptionalData != null)
            {
                i = k + CodedOutputByteBufferNano.computeBoolSize(3, supportsOptionalData.booleanValue());
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
            if (programId != null && programId.length > 0)
            {
                for (int i = 0; i < programId.length; i++)
                {
                    String s = programId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, renderInfo);
            }
            if (supportsOptionalData != null)
            {
                codedoutputbytebuffernano.writeBool(3, supportsOptionalData.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltyProgramsRequest()
        {
            clear();
        }
    }

    public static final class GetLoyaltyProgramsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public DiscoverableLoyaltyProgram programs[];

        private GetLoyaltyProgramsResponse clear()
        {
            programs = DiscoverableLoyaltyProgram.emptyArray();
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltyProgramsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    DiscoverableLoyaltyProgram adiscoverableloyaltyprogram[];
                    int j;
                    if (programs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = programs.length;
                    }
                    adiscoverableloyaltyprogram = new DiscoverableLoyaltyProgram[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(programs, 0, adiscoverableloyaltyprogram, 0, j);
                        k = j;
                    }
                    for (; k < adiscoverableloyaltyprogram.length - 1; k++)
                    {
                        adiscoverableloyaltyprogram[k] = new DiscoverableLoyaltyProgram();
                        codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adiscoverableloyaltyprogram[k] = new DiscoverableLoyaltyProgram();
                    codedinputbytebuffernano.readMessage(adiscoverableloyaltyprogram[k]);
                    programs = adiscoverableloyaltyprogram;
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
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
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= programs.length)
                        {
                            break;
                        }
                        DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[k];
                        j = i;
                        if (discoverableloyaltyprogram != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, discoverableloyaltyprogram);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
            if (programs != null && programs.length > 0)
            {
                for (int i = 0; i < programs.length; i++)
                {
                    DiscoverableLoyaltyProgram discoverableloyaltyprogram = programs[i];
                    if (discoverableloyaltyprogram != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, discoverableloyaltyprogram);
                    }
                }

            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltyProgramsResponse()
        {
            clear();
        }
    }

    public static final class GetLoyaltySharedDataPromptsRequest extends ExtendableMessageNano
    {

        public int sharedDataIds[];

        private GetLoyaltySharedDataPromptsRequest clear()
        {
            sharedDataIds = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltySharedDataPromptsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
                    int ai[];
                    int j;
                    if (sharedDataIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataIds.length;
                    }
                    ai = new int[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataIds, 0, ai, 0, j);
                        l = j;
                    }
                    for (; l < ai.length - 1; l++)
                    {
                        ai[l] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[l] = codedinputbytebuffernano.readInt32();
                    sharedDataIds = ai;
                    break;

                case 10: // '\n'
                    int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        i1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    int ai1[];
                    if (sharedDataIds == null)
                    {
                        k = 0;
                    } else
                    {
                        k = sharedDataIds.length;
                    }
                    ai1 = new int[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(sharedDataIds, 0, ai1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai1.length; i1++)
                    {
                        ai1[i1] = codedinputbytebuffernano.readInt32();
                    }

                    sharedDataIds = ai1;
                    codedinputbytebuffernano.popLimit(j1);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int k = super.computeSerializedSize();
            int i = k;
            if (sharedDataIds != null)
            {
                i = k;
                if (sharedDataIds.length > 0)
                {
                    int j = 0;
                    for (i = 0; i < sharedDataIds.length; i++)
                    {
                        j += CodedOutputByteBufferNano.computeInt32SizeNoTag(sharedDataIds[i]);
                    }

                    i = k + j + sharedDataIds.length * 1;
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
            if (sharedDataIds != null && sharedDataIds.length > 0)
            {
                for (int i = 0; i < sharedDataIds.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(1, sharedDataIds[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltySharedDataPromptsRequest()
        {
            clear();
        }
    }

    public static final class GetLoyaltySharedDataPromptsResponse extends ExtendableMessageNano
    {

        public SharedDataPrompt sharedDataPrompts[];

        private GetLoyaltySharedDataPromptsResponse clear()
        {
            sharedDataPrompts = SharedDataPrompt.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetLoyaltySharedDataPromptsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    SharedDataPrompt ashareddataprompt[];
                    int j;
                    if (sharedDataPrompts == null)
                    {
                        j = 0;
                    } else
                    {
                        j = sharedDataPrompts.length;
                    }
                    ashareddataprompt = new SharedDataPrompt[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(sharedDataPrompts, 0, ashareddataprompt, 0, j);
                        k = j;
                    }
                    for (; k < ashareddataprompt.length - 1; k++)
                    {
                        ashareddataprompt[k] = new SharedDataPrompt();
                        codedinputbytebuffernano.readMessage(ashareddataprompt[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    ashareddataprompt[k] = new SharedDataPrompt();
                    codedinputbytebuffernano.readMessage(ashareddataprompt[k]);
                    sharedDataPrompts = ashareddataprompt;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (sharedDataPrompts != null)
            {
                k = i;
                if (sharedDataPrompts.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= sharedDataPrompts.length)
                        {
                            break;
                        }
                        SharedDataPrompt shareddataprompt = sharedDataPrompts[j];
                        k = i;
                        if (shareddataprompt != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, shareddataprompt);
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
            if (sharedDataPrompts != null && sharedDataPrompts.length > 0)
            {
                for (int i = 0; i < sharedDataPrompts.length; i++)
                {
                    SharedDataPrompt shareddataprompt = sharedDataPrompts[i];
                    if (shareddataprompt != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, shareddataprompt);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetLoyaltySharedDataPromptsResponse()
        {
            clear();
        }
    }

    public static final class LinkAdhocLoyaltyProgramRequest extends ExtendableMessageNano
    {

        public String backgroundColor;
        public com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        public String linkingId;
        public String merchantName;
        public Integer programIcon;
        public String programName;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public NanoUserAddedImages.UserAddedImage userAddedImage[];

        private LinkAdhocLoyaltyProgramRequest clear()
        {
            merchantName = null;
            programName = null;
            backgroundColor = null;
            programIcon = null;
            linkingId = null;
            barcode = null;
            renderInfo = null;
            userAddedImage = NanoUserAddedImages.UserAddedImage.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkAdhocLoyaltyProgramRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 97
        //                       10: 99
        //                       18: 110
        //                       26: 121
        //                       34: 132
        //                       42: 143
        //                       50: 172
        //                       58: 201
        //                       64: 325;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            merchantName = codedinputbytebuffernano.readString();
              goto _L11
_L4:
            programName = codedinputbytebuffernano.readString();
              goto _L11
_L5:
            backgroundColor = codedinputbytebuffernano.readString();
              goto _L11
_L6:
            linkingId = codedinputbytebuffernano.readString();
              goto _L11
_L7:
            if (barcode == null)
            {
                barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
            }
            codedinputbytebuffernano.readMessage(barcode);
              goto _L11
_L8:
            if (renderInfo == null)
            {
                renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
            }
            codedinputbytebuffernano.readMessage(renderInfo);
              goto _L11
_L9:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
            NanoUserAddedImages.UserAddedImage auseraddedimage[];
            int j;
            if (userAddedImage == null)
            {
                j = 0;
            } else
            {
                j = userAddedImage.length;
            }
            auseraddedimage = new NanoUserAddedImages.UserAddedImage[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(userAddedImage, 0, auseraddedimage, 0, j);
                l = j;
            }
            for (; l < auseraddedimage.length - 1; l++)
            {
                auseraddedimage[l] = new NanoUserAddedImages.UserAddedImage();
                codedinputbytebuffernano.readMessage(auseraddedimage[l]);
                codedinputbytebuffernano.readTag();
            }

            auseraddedimage[l] = new NanoUserAddedImages.UserAddedImage();
            codedinputbytebuffernano.readMessage(auseraddedimage[l]);
            userAddedImage = auseraddedimage;
              goto _L11
_L10:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 1: // '\001'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
                programIcon = Integer.valueOf(k);
                break;
            }
            if (true) goto _L11; else goto _L12
_L12:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
            }
            j = i;
            if (programName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, programName);
            }
            i = j;
            if (backgroundColor != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, backgroundColor);
            }
            j = i;
            if (linkingId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, linkingId);
            }
            int k = j;
            if (barcode != null)
            {
                k = j + CodedOutputByteBufferNano.computeMessageSize(5, barcode);
            }
            i = k;
            if (renderInfo != null)
            {
                i = k + CodedOutputByteBufferNano.computeMessageSize(6, renderInfo);
            }
            j = i;
            if (userAddedImage != null)
            {
                j = i;
                if (userAddedImage.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= userAddedImage.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[l];
                        j = i;
                        if (useraddedimage != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(7, useraddedimage);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (programIcon != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(8, programIcon.intValue());
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
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantName);
            }
            if (programName != null)
            {
                codedoutputbytebuffernano.writeString(2, programName);
            }
            if (backgroundColor != null)
            {
                codedoutputbytebuffernano.writeString(3, backgroundColor);
            }
            if (linkingId != null)
            {
                codedoutputbytebuffernano.writeString(4, linkingId);
            }
            if (barcode != null)
            {
                codedoutputbytebuffernano.writeMessage(5, barcode);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(6, renderInfo);
            }
            if (userAddedImage != null && userAddedImage.length > 0)
            {
                for (int i = 0; i < userAddedImage.length; i++)
                {
                    NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[i];
                    if (useraddedimage != null)
                    {
                        codedoutputbytebuffernano.writeMessage(7, useraddedimage);
                    }
                }

            }
            if (programIcon != null)
            {
                codedoutputbytebuffernano.writeInt32(8, programIcon.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkAdhocLoyaltyProgramRequest()
        {
            clear();
        }
    }

    public static final class LinkAdhocLoyaltyProgramResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private LinkAdhocLoyaltyProgramResponse clear()
        {
            wobInstance = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkAdhocLoyaltyProgramResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (wobInstance == null)
                    {
                        wobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(wobInstance);
                    break;

                case 18: // '\022'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobInstance != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, wobInstance);
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
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
            if (wobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(1, wobInstance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkAdhocLoyaltyProgramResponse()
        {
            clear();
        }
    }

    public static final class LinkLoyaltyProgramRequest extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        public Boolean forDifferentUser;
        public String linkingId;
        public String programId;
        public Integer programStatus;
        public Boolean promotionalEmailOptIn;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public SharedDataValue sharedDataValues[];
        public NanoUserAddedImages.UserAddedImage userAddedImage[];

        private LinkLoyaltyProgramRequest clear()
        {
            programId = null;
            linkingId = null;
            barcode = null;
            promotionalEmailOptIn = null;
            sharedDataValues = SharedDataValue.emptyArray();
            renderInfo = null;
            programStatus = null;
            forDifferentUser = null;
            userAddedImage = NanoUserAddedImages.UserAddedImage.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkLoyaltyProgramRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 105
        //                       10: 107
        //                       18: 118
        //                       26: 129
        //                       34: 253
        //                       40: 282
        //                       50: 296
        //                       64: 325
        //                       72: 378
        //                       82: 392;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
            return this;
_L3:
            programId = codedinputbytebuffernano.readString();
              goto _L12
_L4:
            linkingId = codedinputbytebuffernano.readString();
              goto _L12
_L5:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            SharedDataValue ashareddatavalue[];
            int j;
            if (sharedDataValues == null)
            {
                j = 0;
            } else
            {
                j = sharedDataValues.length;
            }
            ashareddatavalue = new SharedDataValue[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(sharedDataValues, 0, ashareddatavalue, 0, j);
                i1 = j;
            }
            for (; i1 < ashareddatavalue.length - 1; i1++)
            {
                ashareddatavalue[i1] = new SharedDataValue();
                codedinputbytebuffernano.readMessage(ashareddatavalue[i1]);
                codedinputbytebuffernano.readTag();
            }

            ashareddatavalue[i1] = new SharedDataValue();
            codedinputbytebuffernano.readMessage(ashareddatavalue[i1]);
            sharedDataValues = ashareddatavalue;
              goto _L12
_L6:
            if (renderInfo == null)
            {
                renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
            }
            codedinputbytebuffernano.readMessage(renderInfo);
              goto _L12
_L7:
            promotionalEmailOptIn = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L12
_L8:
            if (barcode == null)
            {
                barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
            }
            codedinputbytebuffernano.readMessage(barcode);
              goto _L12
_L9:
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
_L10:
            forDifferentUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
            continue; /* Loop/switch isn't completed */
_L11:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
            NanoUserAddedImages.UserAddedImage auseraddedimage[];
            int l;
            if (userAddedImage == null)
            {
                l = 0;
            } else
            {
                l = userAddedImage.length;
            }
            auseraddedimage = new NanoUserAddedImages.UserAddedImage[l + j1];
            j1 = l;
            if (l != 0)
            {
                System.arraycopy(userAddedImage, 0, auseraddedimage, 0, l);
                j1 = l;
            }
            for (; j1 < auseraddedimage.length - 1; j1++)
            {
                auseraddedimage[j1] = new NanoUserAddedImages.UserAddedImage();
                codedinputbytebuffernano.readMessage(auseraddedimage[j1]);
                codedinputbytebuffernano.readTag();
            }

            auseraddedimage[j1] = new NanoUserAddedImages.UserAddedImage();
            codedinputbytebuffernano.readMessage(auseraddedimage[j1]);
            userAddedImage = auseraddedimage;
            if (true) goto _L12; else goto _L13
_L13:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (programId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, programId);
            }
            i = j;
            if (linkingId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, linkingId);
            }
            j = i;
            if (sharedDataValues != null)
            {
                j = i;
                if (sharedDataValues.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= sharedDataValues.length)
                        {
                            break;
                        }
                        SharedDataValue shareddatavalue = sharedDataValues[l];
                        j = i;
                        if (shareddatavalue != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, shareddatavalue);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, renderInfo);
            }
            j = i;
            if (promotionalEmailOptIn != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(5, promotionalEmailOptIn.booleanValue());
            }
            i = j;
            if (barcode != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(6, barcode);
            }
            j = i;
            if (programStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, programStatus.intValue());
            }
            i = j;
            if (forDifferentUser != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(9, forDifferentUser.booleanValue());
            }
            int i1 = i;
            if (userAddedImage != null)
            {
                i1 = i;
                if (userAddedImage.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= userAddedImage.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[k];
                        i1 = i;
                        if (useraddedimage != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(10, useraddedimage);
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
            if (programId != null)
            {
                codedoutputbytebuffernano.writeString(1, programId);
            }
            if (linkingId != null)
            {
                codedoutputbytebuffernano.writeString(2, linkingId);
            }
            if (sharedDataValues != null && sharedDataValues.length > 0)
            {
                for (int i = 0; i < sharedDataValues.length; i++)
                {
                    SharedDataValue shareddatavalue = sharedDataValues[i];
                    if (shareddatavalue != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, shareddatavalue);
                    }
                }

            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, renderInfo);
            }
            if (promotionalEmailOptIn != null)
            {
                codedoutputbytebuffernano.writeBool(5, promotionalEmailOptIn.booleanValue());
            }
            if (barcode != null)
            {
                codedoutputbytebuffernano.writeMessage(6, barcode);
            }
            if (programStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(8, programStatus.intValue());
            }
            if (forDifferentUser != null)
            {
                codedoutputbytebuffernano.writeBool(9, forDifferentUser.booleanValue());
            }
            if (userAddedImage != null && userAddedImage.length > 0)
            {
                for (int j = 0; j < userAddedImage.length; j++)
                {
                    NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[j];
                    if (useraddedimage != null)
                    {
                        codedoutputbytebuffernano.writeMessage(10, useraddedimage);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkLoyaltyProgramRequest()
        {
            clear();
        }
    }

    public static final class LinkLoyaltyProgramResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public int invalidDataIds[];
        public String merchantMessage;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private LinkLoyaltyProgramResponse clear()
        {
            merchantMessage = null;
            wobInstance = null;
            callError = null;
            invalidDataIds = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkLoyaltyProgramResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    merchantMessage = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (wobInstance == null)
                    {
                        wobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(wobInstance);
                    break;

                case 34: // '"'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 40: // '('
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 40);
                    int ai[];
                    int j;
                    if (invalidDataIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = invalidDataIds.length;
                    }
                    ai = new int[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(invalidDataIds, 0, ai, 0, j);
                        l = j;
                    }
                    for (; l < ai.length - 1; l++)
                    {
                        ai[l] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[l] = codedinputbytebuffernano.readInt32();
                    invalidDataIds = ai;
                    break;

                case 42: // '*'
                    int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        i1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    int ai1[];
                    if (invalidDataIds == null)
                    {
                        k = 0;
                    } else
                    {
                        k = invalidDataIds.length;
                    }
                    ai1 = new int[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(invalidDataIds, 0, ai1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai1.length; i1++)
                    {
                        ai1[i1] = codedinputbytebuffernano.readInt32();
                    }

                    invalidDataIds = ai1;
                    codedinputbytebuffernano.popLimit(j1);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, merchantMessage);
            }
            j = i;
            if (wobInstance != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, wobInstance);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, callError);
            }
            j = i;
            if (invalidDataIds != null)
            {
                j = i;
                if (invalidDataIds.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < invalidDataIds.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(invalidDataIds[j]);
                    }

                    j = i + k + invalidDataIds.length * 1;
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
            if (merchantMessage != null)
            {
                codedoutputbytebuffernano.writeString(2, merchantMessage);
            }
            if (wobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(3, wobInstance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(4, callError);
            }
            if (invalidDataIds != null && invalidDataIds.length > 0)
            {
                for (int i = 0; i < invalidDataIds.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(5, invalidDataIds[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkLoyaltyProgramResponse()
        {
            clear();
        }
    }

    public static final class LoyaltyForm extends ExtendableMessageNano
    {

        public NanoWalletWobForms.InputForm loyaltyForm;
        public SuggestedLoyaltyProgramInfo loyaltyProgramInfo;

        private LoyaltyForm clear()
        {
            loyaltyForm = null;
            loyaltyProgramInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoyaltyForm mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (loyaltyForm == null)
                    {
                        loyaltyForm = new NanoWalletWobForms.InputForm();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyForm);
                    break;

                case 26: // '\032'
                    if (loyaltyProgramInfo == null)
                    {
                        loyaltyProgramInfo = new SuggestedLoyaltyProgramInfo();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyProgramInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (loyaltyForm != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, loyaltyForm);
            }
            j = i;
            if (loyaltyProgramInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, loyaltyProgramInfo);
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
            if (loyaltyForm != null)
            {
                codedoutputbytebuffernano.writeMessage(1, loyaltyForm);
            }
            if (loyaltyProgramInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, loyaltyProgramInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LoyaltyForm()
        {
            clear();
        }
    }

    public static final class SharedDataConfig extends ExtendableMessageNano
    {

        private static volatile SharedDataConfig _emptyArray[];
        public Integer sharedDataId;

        private SharedDataConfig clear()
        {
            sharedDataId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SharedDataConfig[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SharedDataConfig[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SharedDataConfig mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    sharedDataId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (sharedDataId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, sharedDataId.intValue());
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
            if (sharedDataId != null)
            {
                codedoutputbytebuffernano.writeInt32(1, sharedDataId.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SharedDataConfig()
        {
            clear();
        }
    }

    public static final class SharedDataPrompt extends ExtendableMessageNano
    {

        private static volatile SharedDataPrompt _emptyArray[];
        public String hint;
        public Integer inputTypeNumber;
        public Boolean isRequired;
        public String label;
        public Boolean modifiableByUser;
        public String prefilledValue;
        public Integer sharedDataId;

        private SharedDataPrompt clear()
        {
            inputTypeNumber = null;
            sharedDataId = null;
            label = null;
            hint = null;
            prefilledValue = null;
            modifiableByUser = null;
            isRequired = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SharedDataPrompt[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SharedDataPrompt[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SharedDataPrompt mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    inputTypeNumber = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    sharedDataId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 26: // '\032'
                    label = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    hint = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    prefilledValue = codedinputbytebuffernano.readString();
                    break;

                case 48: // '0'
                    modifiableByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 56: // '8'
                    isRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (inputTypeNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, inputTypeNumber.intValue());
            }
            j = i;
            if (sharedDataId != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, sharedDataId.intValue());
            }
            i = j;
            if (label != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, label);
            }
            j = i;
            if (hint != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, hint);
            }
            i = j;
            if (prefilledValue != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, prefilledValue);
            }
            j = i;
            if (modifiableByUser != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(6, modifiableByUser.booleanValue());
            }
            i = j;
            if (isRequired != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRequired.booleanValue());
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
            if (inputTypeNumber != null)
            {
                codedoutputbytebuffernano.writeInt32(1, inputTypeNumber.intValue());
            }
            if (sharedDataId != null)
            {
                codedoutputbytebuffernano.writeInt32(2, sharedDataId.intValue());
            }
            if (label != null)
            {
                codedoutputbytebuffernano.writeString(3, label);
            }
            if (hint != null)
            {
                codedoutputbytebuffernano.writeString(4, hint);
            }
            if (prefilledValue != null)
            {
                codedoutputbytebuffernano.writeString(5, prefilledValue);
            }
            if (modifiableByUser != null)
            {
                codedoutputbytebuffernano.writeBool(6, modifiableByUser.booleanValue());
            }
            if (isRequired != null)
            {
                codedoutputbytebuffernano.writeBool(7, isRequired.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SharedDataPrompt()
        {
            clear();
        }
    }

    public static final class SharedDataValue extends ExtendableMessageNano
    {

        private static volatile SharedDataValue _emptyArray[];
        public Boolean modifiedByUser;
        public Integer sharedDataId;
        public String value;

        private SharedDataValue clear()
        {
            sharedDataId = null;
            value = null;
            modifiedByUser = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SharedDataValue[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SharedDataValue[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SharedDataValue mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 8: // '\b'
                    sharedDataId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    value = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    modifiedByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (sharedDataId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, sharedDataId.intValue());
            }
            j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
            }
            i = j;
            if (modifiedByUser != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, modifiedByUser.booleanValue());
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
            if (sharedDataId != null)
            {
                codedoutputbytebuffernano.writeInt32(1, sharedDataId.intValue());
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            if (modifiedByUser != null)
            {
                codedoutputbytebuffernano.writeBool(3, modifiedByUser.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SharedDataValue()
        {
            clear();
        }
    }

    public static final class SignupLoyaltyProgramRequest extends ExtendableMessageNano
    {

        public Boolean forDifferentUser;
        public String programId;
        public Integer programStatus;
        public Boolean promotionalEmailOptIn;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public SharedDataValue sharedDataValues[];

        private SignupLoyaltyProgramRequest clear()
        {
            programId = null;
            promotionalEmailOptIn = null;
            sharedDataValues = SharedDataValue.emptyArray();
            renderInfo = null;
            programStatus = null;
            forDifferentUser = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SignupLoyaltyProgramRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       18: 94
        //                       26: 218
        //                       32: 247
        //                       48: 261
        //                       56: 314;
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
            SharedDataValue ashareddatavalue[];
            int j;
            if (sharedDataValues == null)
            {
                j = 0;
            } else
            {
                j = sharedDataValues.length;
            }
            ashareddatavalue = new SharedDataValue[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(sharedDataValues, 0, ashareddatavalue, 0, j);
                l = j;
            }
            for (; l < ashareddatavalue.length - 1; l++)
            {
                ashareddatavalue[l] = new SharedDataValue();
                codedinputbytebuffernano.readMessage(ashareddatavalue[l]);
                codedinputbytebuffernano.readTag();
            }

            ashareddatavalue[l] = new SharedDataValue();
            codedinputbytebuffernano.readMessage(ashareddatavalue[l]);
            sharedDataValues = ashareddatavalue;
              goto _L9
_L5:
            if (renderInfo == null)
            {
                renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
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
                        SharedDataValue shareddatavalue = sharedDataValues[k];
                        j = i;
                        if (shareddatavalue != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, shareddatavalue);
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
                    SharedDataValue shareddatavalue = sharedDataValues[i];
                    if (shareddatavalue != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, shareddatavalue);
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

        public SignupLoyaltyProgramRequest()
        {
            clear();
        }
    }

    public static final class SignupLoyaltyProgramResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public int invalidDataIds[];
        public String merchantMessage;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private SignupLoyaltyProgramResponse clear()
        {
            merchantMessage = null;
            wobInstance = null;
            callError = null;
            invalidDataIds = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SignupLoyaltyProgramResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 18: // '\022'
                    merchantMessage = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (wobInstance == null)
                    {
                        wobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(wobInstance);
                    break;

                case 34: // '"'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 40: // '('
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 40);
                    int ai[];
                    int j;
                    if (invalidDataIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = invalidDataIds.length;
                    }
                    ai = new int[j + l];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(invalidDataIds, 0, ai, 0, j);
                        l = j;
                    }
                    for (; l < ai.length - 1; l++)
                    {
                        ai[l] = codedinputbytebuffernano.readInt32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[l] = codedinputbytebuffernano.readInt32();
                    invalidDataIds = ai;
                    break;

                case 42: // '*'
                    int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i1 = 0;
                    int k = codedinputbytebuffernano.getPosition();
                    while (codedinputbytebuffernano.getBytesUntilLimit() > 0) 
                    {
                        codedinputbytebuffernano.readInt32();
                        i1++;
                    }
                    codedinputbytebuffernano.rewindToPosition(k);
                    int ai1[];
                    if (invalidDataIds == null)
                    {
                        k = 0;
                    } else
                    {
                        k = invalidDataIds.length;
                    }
                    ai1 = new int[k + i1];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(invalidDataIds, 0, ai1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai1.length; i1++)
                    {
                        ai1[i1] = codedinputbytebuffernano.readInt32();
                    }

                    invalidDataIds = ai1;
                    codedinputbytebuffernano.popLimit(j1);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, merchantMessage);
            }
            j = i;
            if (wobInstance != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, wobInstance);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(4, callError);
            }
            j = i;
            if (invalidDataIds != null)
            {
                j = i;
                if (invalidDataIds.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < invalidDataIds.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(invalidDataIds[j]);
                    }

                    j = i + k + invalidDataIds.length * 1;
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
            if (merchantMessage != null)
            {
                codedoutputbytebuffernano.writeString(2, merchantMessage);
            }
            if (wobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(3, wobInstance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(4, callError);
            }
            if (invalidDataIds != null && invalidDataIds.length > 0)
            {
                for (int i = 0; i < invalidDataIds.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(5, invalidDataIds[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SignupLoyaltyProgramResponse()
        {
            clear();
        }
    }

    public static final class SuggestLoyaltyProgramsRequest extends ExtendableMessageNano
    {

        public Integer maxResultsToFetch;
        public String merchantNameInput;

        private SuggestLoyaltyProgramsRequest clear()
        {
            merchantNameInput = null;
            maxResultsToFetch = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SuggestLoyaltyProgramsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    merchantNameInput = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    maxResultsToFetch = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantNameInput != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantNameInput);
            }
            j = i;
            if (maxResultsToFetch != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, maxResultsToFetch.intValue());
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
            if (merchantNameInput != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantNameInput);
            }
            if (maxResultsToFetch != null)
            {
                codedoutputbytebuffernano.writeInt32(2, maxResultsToFetch.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SuggestLoyaltyProgramsRequest()
        {
            clear();
        }
    }

    public static final class SuggestLoyaltyProgramsResponse extends ExtendableMessageNano
    {

        public SuggestedLoyaltyProgramInfo matchingPrograms[];
        public String merchantNameInput;

        private SuggestLoyaltyProgramsResponse clear()
        {
            merchantNameInput = null;
            matchingPrograms = SuggestedLoyaltyProgramInfo.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SuggestLoyaltyProgramsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    merchantNameInput = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    SuggestedLoyaltyProgramInfo asuggestedloyaltyprograminfo[];
                    int j;
                    if (matchingPrograms == null)
                    {
                        j = 0;
                    } else
                    {
                        j = matchingPrograms.length;
                    }
                    asuggestedloyaltyprograminfo = new SuggestedLoyaltyProgramInfo[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(matchingPrograms, 0, asuggestedloyaltyprograminfo, 0, j);
                        k = j;
                    }
                    for (; k < asuggestedloyaltyprograminfo.length - 1; k++)
                    {
                        asuggestedloyaltyprograminfo[k] = new SuggestedLoyaltyProgramInfo();
                        codedinputbytebuffernano.readMessage(asuggestedloyaltyprograminfo[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    asuggestedloyaltyprograminfo[k] = new SuggestedLoyaltyProgramInfo();
                    codedinputbytebuffernano.readMessage(asuggestedloyaltyprograminfo[k]);
                    matchingPrograms = asuggestedloyaltyprograminfo;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantNameInput != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantNameInput);
            }
            int l = i;
            if (matchingPrograms != null)
            {
                l = i;
                if (matchingPrograms.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= matchingPrograms.length)
                        {
                            break;
                        }
                        SuggestedLoyaltyProgramInfo suggestedloyaltyprograminfo = matchingPrograms[k];
                        l = i;
                        if (suggestedloyaltyprograminfo != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(2, suggestedloyaltyprograminfo);
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
            if (merchantNameInput != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantNameInput);
            }
            if (matchingPrograms != null && matchingPrograms.length > 0)
            {
                for (int i = 0; i < matchingPrograms.length; i++)
                {
                    SuggestedLoyaltyProgramInfo suggestedloyaltyprograminfo = matchingPrograms[i];
                    if (suggestedloyaltyprograminfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, suggestedloyaltyprograminfo);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SuggestLoyaltyProgramsResponse()
        {
            clear();
        }
    }

    public static final class SuggestedLoyaltyProgramInfo extends ExtendableMessageNano
    {

        private static volatile SuggestedLoyaltyProgramInfo _emptyArray[];
        public String discoverableProgramId;
        public String logoImageUrl;
        public String merchantName;
        public String programName;

        private SuggestedLoyaltyProgramInfo clear()
        {
            merchantName = null;
            programName = null;
            discoverableProgramId = null;
            logoImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SuggestedLoyaltyProgramInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SuggestedLoyaltyProgramInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SuggestedLoyaltyProgramInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    merchantName = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    programName = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    discoverableProgramId = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    logoImageUrl = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (merchantName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantName);
            }
            j = i;
            if (programName != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, programName);
            }
            i = j;
            if (discoverableProgramId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, discoverableProgramId);
            }
            j = i;
            if (logoImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, logoImageUrl);
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
            if (merchantName != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantName);
            }
            if (programName != null)
            {
                codedoutputbytebuffernano.writeString(2, programName);
            }
            if (discoverableProgramId != null)
            {
                codedoutputbytebuffernano.writeString(3, discoverableProgramId);
            }
            if (logoImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(4, logoImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SuggestedLoyaltyProgramInfo()
        {
            clear();
        }
    }

}
