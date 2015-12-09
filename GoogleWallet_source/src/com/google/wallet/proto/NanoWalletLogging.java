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

public interface NanoWalletLogging
{
    public static final class ActionOutcome extends ExtendableMessageNano
    {

        public Integer action;
        public Integer bank;
        public Long elapsedMillis;
        public String encodedCplc;
        public Integer environment;
        public String imei;
        public NetworkDetails networkDetails;
        public String partnerId;
        public String returnCode;
        public String sessionId;
        public Integer status;

        private ActionOutcome clear()
        {
            action = null;
            bank = null;
            environment = null;
            status = null;
            returnCode = null;
            elapsedMillis = null;
            sessionId = null;
            encodedCplc = null;
            imei = null;
            partnerId = null;
            networkDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ActionOutcome mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L14:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 12: default 112
        //                       0: 121
        //                       8: 123
        //                       16: 354
        //                       24: 438
        //                       32: 510
        //                       42: 602
        //                       48: 613
        //                       58: 627
        //                       66: 638
        //                       74: 649
        //                       82: 660
        //                       90: 671;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L14; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
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
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
                action = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int k = codedinputbytebuffernano.readInt32();
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
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
                bank = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
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
                environment = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int i1 = codedinputbytebuffernano.readInt32();
            switch (i1)
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
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
                status = Integer.valueOf(i1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            returnCode = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            elapsedMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L9:
            sessionId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L10:
            encodedCplc = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L11:
            imei = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L12:
            partnerId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L13:
            if (networkDetails == null)
            {
                networkDetails = new NetworkDetails();
            }
            codedinputbytebuffernano.readMessage(networkDetails);
            if (true) goto _L14; else goto _L15
_L15:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (action != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, action.intValue());
            }
            j = i;
            if (bank != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, bank.intValue());
            }
            i = j;
            if (environment != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, environment.intValue());
            }
            j = i;
            if (status != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, status.intValue());
            }
            i = j;
            if (returnCode != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, returnCode);
            }
            j = i;
            if (elapsedMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(6, elapsedMillis.longValue());
            }
            i = j;
            if (sessionId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, sessionId);
            }
            j = i;
            if (encodedCplc != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, encodedCplc);
            }
            i = j;
            if (imei != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, imei);
            }
            j = i;
            if (partnerId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, partnerId);
            }
            i = j;
            if (networkDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, networkDetails);
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
            if (action != null)
            {
                codedoutputbytebuffernano.writeInt32(1, action.intValue());
            }
            if (bank != null)
            {
                codedoutputbytebuffernano.writeInt32(2, bank.intValue());
            }
            if (environment != null)
            {
                codedoutputbytebuffernano.writeInt32(3, environment.intValue());
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(4, status.intValue());
            }
            if (returnCode != null)
            {
                codedoutputbytebuffernano.writeString(5, returnCode);
            }
            if (elapsedMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(6, elapsedMillis.longValue());
            }
            if (sessionId != null)
            {
                codedoutputbytebuffernano.writeString(7, sessionId);
            }
            if (encodedCplc != null)
            {
                codedoutputbytebuffernano.writeString(8, encodedCplc);
            }
            if (imei != null)
            {
                codedoutputbytebuffernano.writeString(9, imei);
            }
            if (partnerId != null)
            {
                codedoutputbytebuffernano.writeString(10, partnerId);
            }
            if (networkDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(11, networkDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActionOutcome()
        {
            clear();
        }
    }

    public static final class EventContext extends ExtendableMessageNano
    {

        public Long clientEventTimeMicros;
        public String clientVersion;
        public Integer processId;

        private EventContext clear()
        {
            clientEventTimeMicros = null;
            processId = null;
            clientVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private EventContext mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    clientEventTimeMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 16: // '\020'
                    processId = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 26: // '\032'
                    clientVersion = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientEventTimeMicros != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientEventTimeMicros.longValue());
            }
            j = i;
            if (processId != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, processId.intValue());
            }
            i = j;
            if (clientVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, clientVersion);
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
            if (clientEventTimeMicros != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientEventTimeMicros.longValue());
            }
            if (processId != null)
            {
                codedoutputbytebuffernano.writeInt32(2, processId.intValue());
            }
            if (clientVersion != null)
            {
                codedoutputbytebuffernano.writeString(3, clientVersion);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public EventContext()
        {
            clear();
        }
    }

    public static final class GeofencingContextExtraInfo extends ExtendableMessageNano
    {

        public Boolean buzzEnabled;
        public String offerTemplateId;
        public String offerTemplateNamespace;

        private GeofencingContextExtraInfo clear()
        {
            offerTemplateNamespace = null;
            offerTemplateId = null;
            buzzEnabled = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GeofencingContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    offerTemplateNamespace = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    offerTemplateId = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    buzzEnabled = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (offerTemplateNamespace != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, offerTemplateNamespace);
            }
            j = i;
            if (offerTemplateId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, offerTemplateId);
            }
            i = j;
            if (buzzEnabled != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(3, buzzEnabled.booleanValue());
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
            if (offerTemplateNamespace != null)
            {
                codedoutputbytebuffernano.writeString(1, offerTemplateNamespace);
            }
            if (offerTemplateId != null)
            {
                codedoutputbytebuffernano.writeString(2, offerTemplateId);
            }
            if (buzzEnabled != null)
            {
                codedoutputbytebuffernano.writeBool(3, buzzEnabled.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GeofencingContextExtraInfo()
        {
            clear();
        }
    }

    public static final class GiftCardContextExtraInfo extends ExtendableMessageNano
    {

        public Boolean giftCardDataEntered;
        public Integer giftCardMerchantEntryMethod;

        private GiftCardContextExtraInfo clear()
        {
            giftCardMerchantEntryMethod = null;
            giftCardDataEntered = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 102;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                giftCardMerchantEntryMethod = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            giftCardDataEntered = Boolean.valueOf(codedinputbytebuffernano.readBool());
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (giftCardMerchantEntryMethod != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, giftCardMerchantEntryMethod.intValue());
            }
            j = i;
            if (giftCardDataEntered != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, giftCardDataEntered.booleanValue());
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
            if (giftCardMerchantEntryMethod != null)
            {
                codedoutputbytebuffernano.writeInt32(1, giftCardMerchantEntryMethod.intValue());
            }
            if (giftCardDataEntered != null)
            {
                codedoutputbytebuffernano.writeBool(2, giftCardDataEntered.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardContextExtraInfo()
        {
            clear();
        }
    }

    public static final class ImageUploadContextExtraInfo extends ExtendableMessageNano
    {

        public String identifier;
        public Integer responseCode;

        private ImageUploadContextExtraInfo clear()
        {
            identifier = null;
            responseCode = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ImageUploadContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    identifier = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    responseCode = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (identifier != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, identifier);
            }
            j = i;
            if (responseCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, responseCode.intValue());
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
            if (identifier != null)
            {
                codedoutputbytebuffernano.writeString(1, identifier);
            }
            if (responseCode != null)
            {
                codedoutputbytebuffernano.writeInt32(2, responseCode.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ImageUploadContextExtraInfo()
        {
            clear();
        }
    }

    public static final class LogMessage extends ExtendableMessageNano
    {

        public String exception;
        public String log;
        public String namespace;

        private LogMessage clear()
        {
            log = null;
            exception = null;
            namespace = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LogMessage mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    log = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    exception = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    namespace = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (log != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, log);
            }
            j = i;
            if (exception != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, exception);
            }
            i = j;
            if (namespace != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, namespace);
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
            if (log != null)
            {
                codedoutputbytebuffernano.writeString(1, log);
            }
            if (exception != null)
            {
                codedoutputbytebuffernano.writeString(2, exception);
            }
            if (namespace != null)
            {
                codedoutputbytebuffernano.writeString(3, namespace);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogMessage()
        {
            clear();
        }
    }

    public static final class NetworkDetails extends ExtendableMessageNano
    {

        public Integer networkState;
        public Integer networkType;
        public Integer signalLevel;
        public Integer signalStrength;

        private NetworkDetails clear()
        {
            networkType = null;
            signalStrength = null;
            signalLevel = null;
            networkState = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private NetworkDetails mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       16: 122
        //                       24: 136
        //                       32: 150;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                networkType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            signalStrength = Integer.valueOf(codedinputbytebuffernano.readSInt32());
            continue; /* Loop/switch isn't completed */
_L5:
            signalLevel = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                networkState = Integer.valueOf(k);
                break;
            }
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (networkType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, networkType.intValue());
            }
            j = i;
            if (signalStrength != null)
            {
                j = i + CodedOutputByteBufferNano.computeSInt32Size(2, signalStrength.intValue());
            }
            i = j;
            if (signalLevel != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, signalLevel.intValue());
            }
            j = i;
            if (networkState != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, networkState.intValue());
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
            if (networkType != null)
            {
                codedoutputbytebuffernano.writeInt32(1, networkType.intValue());
            }
            if (signalStrength != null)
            {
                codedoutputbytebuffernano.writeSInt32(2, signalStrength.intValue());
            }
            if (signalLevel != null)
            {
                codedoutputbytebuffernano.writeInt32(3, signalLevel.intValue());
            }
            if (networkState != null)
            {
                codedoutputbytebuffernano.writeInt32(4, networkState.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NetworkDetails()
        {
            clear();
        }
    }

    public static final class OcrContextExtraInfo extends ExtendableMessageNano
    {

        public Long barcodeDetectionToOcrRecognitionInMs;
        public Integer barcodeStatus;
        public Long cameraStartToBarcodeDetectionInMs;
        public Integer connectionType;
        public Integer discoverableIdStatus;
        public Long durationBackCardCaptureInMs;
        public Long durationFrontCardCaptureInMs;
        public OcrExperiment experiment[];
        public Long frameProcessingMillis;
        public Integer mobileNetworkType;
        public Integer numAutoFocuses;
        public Integer numCaptureAttemptsBackCard;
        public Integer numCaptureAttemptsFrontCard;
        public Integer numCapturedBackCard;
        public Integer numCapturedFrontCard;
        public Integer numOcrRetries;
        public Integer ocrCompletionReason;
        public Integer ocrSubmissionReason;
        public Integer readableIdStatus;
        public String recognizedSubType[];
        public String savedSubType;
        public Integer subtypeStatus;
        public Long timeSinceOcrStartInMs;
        public Long timeToClientResultInMs;
        public Long timeToFirstValidFrameInMs;
        public Long timeToOcrCompletedInMs;
        public Long timeToOcrConfirm;
        public Long timeToServerResultInMs;
        public Long totalMillis;
        public int type[];
        public Boolean usesFlashlight;

        private OcrContextExtraInfo clear()
        {
            type = WireFormatNano.EMPTY_INT_ARRAY;
            totalMillis = null;
            frameProcessingMillis = null;
            numOcrRetries = null;
            usesFlashlight = null;
            numAutoFocuses = null;
            recognizedSubType = WireFormatNano.EMPTY_STRING_ARRAY;
            savedSubType = null;
            cameraStartToBarcodeDetectionInMs = null;
            barcodeDetectionToOcrRecognitionInMs = null;
            timeSinceOcrStartInMs = null;
            timeToFirstValidFrameInMs = null;
            timeToClientResultInMs = null;
            timeToServerResultInMs = null;
            timeToOcrCompletedInMs = null;
            subtypeStatus = null;
            discoverableIdStatus = null;
            barcodeStatus = null;
            readableIdStatus = null;
            ocrCompletionReason = null;
            ocrSubmissionReason = null;
            connectionType = null;
            mobileNetworkType = null;
            experiment = OcrExperiment.emptyArray();
            timeToOcrConfirm = null;
            durationBackCardCaptureInMs = null;
            durationFrontCardCaptureInMs = null;
            numCaptureAttemptsBackCard = null;
            numCaptureAttemptsFrontCard = null;
            numCapturedBackCard = null;
            numCapturedFrontCard = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private OcrContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L35:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 33: default 284
        //                       0: 294
        //                       8: 296
        //                       10: 488
        //                       16: 702
        //                       24: 716
        //                       32: 730
        //                       40: 744
        //                       48: 758
        //                       58: 772
        //                       66: 881
        //                       72: 892
        //                       80: 906
        //                       88: 920
        //                       96: 934
        //                       104: 948
        //                       112: 962
        //                       120: 976
        //                       128: 990
        //                       136: 1043
        //                       144: 1095
        //                       152: 1147
        //                       160: 1199
        //                       168: 1259
        //                       176: 1319
        //                       184: 1333
        //                       194: 1347
        //                       200: 1479
        //                       216: 1493
        //                       224: 1507
        //                       232: 1521
        //                       240: 1535
        //                       248: 1549
        //                       256: 1563;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L35; else goto _L2
_L2:
            return this;
_L3:
            int ai[];
            int j2;
            int k3;
            k3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
            ai = new int[k3];
            j2 = 0;
            i = 0;
_L42:
            if (j2 >= k3) goto _L37; else goto _L36
_L36:
            int l3;
            if (j2 != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            l3 = codedinputbytebuffernano.readInt32();
            l3;
            JVM INSTR tableswitch 1 4: default 372
        //                       1 381
        //                       2 381
        //                       3 381
        //                       4 381;
               goto _L38 _L39 _L39 _L39 _L39
_L38:
            j2++;
              goto _L40
_L39:
            int i3 = i + 1;
            ai[i] = l3;
            i = i3;
            if (true) goto _L38; else goto _L40
_L40:
            if (true) goto _L42; else goto _L41
_L41:
_L37:
            if (i != 0)
            {
                if (type == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = type.length;
                }
                if (j2 == 0 && i == k3)
                {
                    type = ai;
                } else
                {
                    int ai1[] = new int[j2 + i];
                    if (j2 != 0)
                    {
                        System.arraycopy(type, 0, ai1, 0, j2);
                    }
                    System.arraycopy(ai, 0, ai1, j2, i);
                    type = ai1;
                }
            }
              goto _L35
_L4:
            int j3;
            j3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            j2 = 0;
            i = codedinputbytebuffernano.getPosition();
_L48:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readInt32())
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    j2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j2 == 0) goto _L44; else goto _L43
_L43:
            codedinputbytebuffernano.rewindToPosition(i);
            if (type == null)
            {
                i = 0;
            } else
            {
                i = type.length;
            }
            ai = new int[i + j2];
            j2 = i;
            if (i != 0)
            {
                System.arraycopy(type, 0, ai, 0, i);
                j2 = i;
            }
_L46:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readInt32();
                switch (i)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    ai[j2] = i;
                    j2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            type = ai;
              goto _L44
            if (true) goto _L46; else goto _L45
_L45:
            if (true) goto _L48; else goto _L47
_L47:
_L44:
            codedinputbytebuffernano.popLimit(j3);
              goto _L35
_L5:
            totalMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L6:
            frameProcessingMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L7:
            numOcrRetries = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L35
_L8:
            usesFlashlight = Boolean.valueOf(codedinputbytebuffernano.readBool());
              goto _L35
_L9:
            numAutoFocuses = Integer.valueOf(codedinputbytebuffernano.readInt32());
              goto _L35
_L10:
            int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
            String as[];
            int j;
            if (recognizedSubType == null)
            {
                j = 0;
            } else
            {
                j = recognizedSubType.length;
            }
            as = new String[j + k2];
            k2 = j;
            if (j != 0)
            {
                System.arraycopy(recognizedSubType, 0, as, 0, j);
                k2 = j;
            }
            for (; k2 < as.length - 1; k2++)
            {
                as[k2] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[k2] = codedinputbytebuffernano.readString();
            recognizedSubType = as;
              goto _L35
_L11:
            savedSubType = codedinputbytebuffernano.readString();
              goto _L35
_L12:
            cameraStartToBarcodeDetectionInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L13:
            barcodeDetectionToOcrRecognitionInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L14:
            timeSinceOcrStartInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L15:
            timeToFirstValidFrameInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L16:
            timeToClientResultInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L17:
            timeToServerResultInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L18:
            timeToOcrCompletedInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L35
_L19:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                subtypeStatus = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L20:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                discoverableIdStatus = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L21:
            int i1 = codedinputbytebuffernano.readInt32();
            switch (i1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                barcodeStatus = Integer.valueOf(i1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L22:
            int j1 = codedinputbytebuffernano.readInt32();
            switch (j1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                readableIdStatus = Integer.valueOf(j1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L23:
            int k1 = codedinputbytebuffernano.readInt32();
            switch (k1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                ocrCompletionReason = Integer.valueOf(k1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L24:
            int l1 = codedinputbytebuffernano.readInt32();
            switch (l1)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                ocrSubmissionReason = Integer.valueOf(l1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L25:
            connectionType = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L26:
            mobileNetworkType = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L27:
            int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
            OcrExperiment aocrexperiment[];
            int i2;
            if (experiment == null)
            {
                i2 = 0;
            } else
            {
                i2 = experiment.length;
            }
            aocrexperiment = new OcrExperiment[i2 + l2];
            l2 = i2;
            if (i2 != 0)
            {
                System.arraycopy(experiment, 0, aocrexperiment, 0, i2);
                l2 = i2;
            }
            for (; l2 < aocrexperiment.length - 1; l2++)
            {
                aocrexperiment[l2] = new OcrExperiment();
                codedinputbytebuffernano.readMessage(aocrexperiment[l2]);
                codedinputbytebuffernano.readTag();
            }

            aocrexperiment[l2] = new OcrExperiment();
            codedinputbytebuffernano.readMessage(aocrexperiment[l2]);
            experiment = aocrexperiment;
            continue; /* Loop/switch isn't completed */
_L28:
            timeToOcrConfirm = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L29:
            durationBackCardCaptureInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L30:
            durationFrontCardCaptureInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L31:
            numCaptureAttemptsBackCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L32:
            numCaptureAttemptsFrontCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L33:
            numCapturedBackCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L34:
            numCapturedFrontCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
            if (true) goto _L35; else goto _L49
_L49:
        }

        protected final int computeSerializedSize()
        {
            int l = super.computeSerializedSize();
            int i = l;
            if (type != null)
            {
                i = l;
                if (type.length > 0)
                {
                    int j = 0;
                    for (i = 0; i < type.length; i++)
                    {
                        j += CodedOutputByteBufferNano.computeInt32SizeNoTag(type[i]);
                    }

                    i = l + j + type.length * 1;
                }
            }
            int k = i;
            if (totalMillis != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(2, totalMillis.longValue());
            }
            i = k;
            if (frameProcessingMillis != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(3, frameProcessingMillis.longValue());
            }
            k = i;
            if (numOcrRetries != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(4, numOcrRetries.intValue());
            }
            l = k;
            if (usesFlashlight != null)
            {
                l = k + CodedOutputByteBufferNano.computeBoolSize(5, usesFlashlight.booleanValue());
            }
            i = l;
            if (numAutoFocuses != null)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(6, numAutoFocuses.intValue());
            }
            k = i;
            if (recognizedSubType != null)
            {
                k = i;
                if (recognizedSubType.length > 0)
                {
                    int k1 = 0;
                    l = 0;
                    for (k = 0; k < recognizedSubType.length;)
                    {
                        String s = recognizedSubType[k];
                        int l1 = k1;
                        int j1 = l;
                        if (s != null)
                        {
                            l1 = k1 + 1;
                            j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        k1 = l1;
                        l = j1;
                    }

                    k = i + l + k1 * 1;
                }
            }
            i = k;
            if (savedSubType != null)
            {
                i = k + CodedOutputByteBufferNano.computeStringSize(8, savedSubType);
            }
            k = i;
            if (cameraStartToBarcodeDetectionInMs != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(9, cameraStartToBarcodeDetectionInMs.longValue());
            }
            i = k;
            if (barcodeDetectionToOcrRecognitionInMs != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(10, barcodeDetectionToOcrRecognitionInMs.longValue());
            }
            k = i;
            if (timeSinceOcrStartInMs != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(11, timeSinceOcrStartInMs.longValue());
            }
            i = k;
            if (timeToFirstValidFrameInMs != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(12, timeToFirstValidFrameInMs.longValue());
            }
            k = i;
            if (timeToClientResultInMs != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(13, timeToClientResultInMs.longValue());
            }
            i = k;
            if (timeToServerResultInMs != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(14, timeToServerResultInMs.longValue());
            }
            k = i;
            if (timeToOcrCompletedInMs != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(15, timeToOcrCompletedInMs.longValue());
            }
            i = k;
            if (subtypeStatus != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(16, subtypeStatus.intValue());
            }
            k = i;
            if (discoverableIdStatus != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(17, discoverableIdStatus.intValue());
            }
            i = k;
            if (barcodeStatus != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(18, barcodeStatus.intValue());
            }
            k = i;
            if (readableIdStatus != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(19, readableIdStatus.intValue());
            }
            i = k;
            if (ocrCompletionReason != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(20, ocrCompletionReason.intValue());
            }
            k = i;
            if (ocrSubmissionReason != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(21, ocrSubmissionReason.intValue());
            }
            l = k;
            if (connectionType != null)
            {
                l = k + CodedOutputByteBufferNano.computeInt32Size(22, connectionType.intValue());
            }
            i = l;
            if (mobileNetworkType != null)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(23, mobileNetworkType.intValue());
            }
            k = i;
            if (experiment != null)
            {
                k = i;
                if (experiment.length > 0)
                {
                    int i1 = 0;
                    do
                    {
                        k = i;
                        if (i1 >= experiment.length)
                        {
                            break;
                        }
                        OcrExperiment ocrexperiment = experiment[i1];
                        k = i;
                        if (ocrexperiment != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(24, ocrexperiment);
                        }
                        i1++;
                        i = k;
                    } while (true);
                }
            }
            i = k;
            if (timeToOcrConfirm != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(25, timeToOcrConfirm.longValue());
            }
            k = i;
            if (durationBackCardCaptureInMs != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt64Size(27, durationBackCardCaptureInMs.longValue());
            }
            i = k;
            if (durationFrontCardCaptureInMs != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt64Size(28, durationFrontCardCaptureInMs.longValue());
            }
            k = i;
            if (numCaptureAttemptsBackCard != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(29, numCaptureAttemptsBackCard.intValue());
            }
            i = k;
            if (numCaptureAttemptsFrontCard != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(30, numCaptureAttemptsFrontCard.intValue());
            }
            k = i;
            if (numCapturedBackCard != null)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(31, numCapturedBackCard.intValue());
            }
            i = k;
            if (numCapturedFrontCard != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(32, numCapturedFrontCard.intValue());
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
            if (type != null && type.length > 0)
            {
                for (int i = 0; i < type.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(1, type[i]);
                }

            }
            if (totalMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, totalMillis.longValue());
            }
            if (frameProcessingMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(3, frameProcessingMillis.longValue());
            }
            if (numOcrRetries != null)
            {
                codedoutputbytebuffernano.writeInt32(4, numOcrRetries.intValue());
            }
            if (usesFlashlight != null)
            {
                codedoutputbytebuffernano.writeBool(5, usesFlashlight.booleanValue());
            }
            if (numAutoFocuses != null)
            {
                codedoutputbytebuffernano.writeInt32(6, numAutoFocuses.intValue());
            }
            if (recognizedSubType != null && recognizedSubType.length > 0)
            {
                for (int j = 0; j < recognizedSubType.length; j++)
                {
                    String s = recognizedSubType[j];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(7, s);
                    }
                }

            }
            if (savedSubType != null)
            {
                codedoutputbytebuffernano.writeString(8, savedSubType);
            }
            if (cameraStartToBarcodeDetectionInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(9, cameraStartToBarcodeDetectionInMs.longValue());
            }
            if (barcodeDetectionToOcrRecognitionInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(10, barcodeDetectionToOcrRecognitionInMs.longValue());
            }
            if (timeSinceOcrStartInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(11, timeSinceOcrStartInMs.longValue());
            }
            if (timeToFirstValidFrameInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(12, timeToFirstValidFrameInMs.longValue());
            }
            if (timeToClientResultInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(13, timeToClientResultInMs.longValue());
            }
            if (timeToServerResultInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(14, timeToServerResultInMs.longValue());
            }
            if (timeToOcrCompletedInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(15, timeToOcrCompletedInMs.longValue());
            }
            if (subtypeStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(16, subtypeStatus.intValue());
            }
            if (discoverableIdStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(17, discoverableIdStatus.intValue());
            }
            if (barcodeStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(18, barcodeStatus.intValue());
            }
            if (readableIdStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(19, readableIdStatus.intValue());
            }
            if (ocrCompletionReason != null)
            {
                codedoutputbytebuffernano.writeInt32(20, ocrCompletionReason.intValue());
            }
            if (ocrSubmissionReason != null)
            {
                codedoutputbytebuffernano.writeInt32(21, ocrSubmissionReason.intValue());
            }
            if (connectionType != null)
            {
                codedoutputbytebuffernano.writeInt32(22, connectionType.intValue());
            }
            if (mobileNetworkType != null)
            {
                codedoutputbytebuffernano.writeInt32(23, mobileNetworkType.intValue());
            }
            if (experiment != null && experiment.length > 0)
            {
                for (int k = 0; k < experiment.length; k++)
                {
                    OcrExperiment ocrexperiment = experiment[k];
                    if (ocrexperiment != null)
                    {
                        codedoutputbytebuffernano.writeMessage(24, ocrexperiment);
                    }
                }

            }
            if (timeToOcrConfirm != null)
            {
                codedoutputbytebuffernano.writeInt64(25, timeToOcrConfirm.longValue());
            }
            if (durationBackCardCaptureInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(27, durationBackCardCaptureInMs.longValue());
            }
            if (durationFrontCardCaptureInMs != null)
            {
                codedoutputbytebuffernano.writeInt64(28, durationFrontCardCaptureInMs.longValue());
            }
            if (numCaptureAttemptsBackCard != null)
            {
                codedoutputbytebuffernano.writeInt32(29, numCaptureAttemptsBackCard.intValue());
            }
            if (numCaptureAttemptsFrontCard != null)
            {
                codedoutputbytebuffernano.writeInt32(30, numCaptureAttemptsFrontCard.intValue());
            }
            if (numCapturedBackCard != null)
            {
                codedoutputbytebuffernano.writeInt32(31, numCapturedBackCard.intValue());
            }
            if (numCapturedFrontCard != null)
            {
                codedoutputbytebuffernano.writeInt32(32, numCapturedFrontCard.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OcrContextExtraInfo()
        {
            clear();
        }
    }

    public static final class OcrExperiment extends ExtendableMessageNano
    {

        private static volatile OcrExperiment _emptyArray[];
        public NanoWalletShared.OcrAttribution attribution;
        public Integer field;
        public Integer status;
        public String subType;

        private OcrExperiment clear()
        {
            subType = null;
            field = null;
            status = null;
            attribution = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static OcrExperiment[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new OcrExperiment[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private OcrExperiment mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       10: 67
        //                       16: 78
        //                       24: 126
        //                       34: 178;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            subType = codedinputbytebuffernano.readString();
              goto _L7
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                field = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                status = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (attribution == null)
            {
                attribution = new NanoWalletShared.OcrAttribution();
            }
            codedinputbytebuffernano.readMessage(attribution);
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (subType != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, subType);
            }
            j = i;
            if (field != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, field.intValue());
            }
            i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, status.intValue());
            }
            j = i;
            if (attribution != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, attribution);
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
            if (subType != null)
            {
                codedoutputbytebuffernano.writeString(1, subType);
            }
            if (field != null)
            {
                codedoutputbytebuffernano.writeInt32(2, field.intValue());
            }
            if (status != null)
            {
                codedoutputbytebuffernano.writeInt32(3, status.intValue());
            }
            if (attribution != null)
            {
                codedoutputbytebuffernano.writeMessage(4, attribution);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OcrExperiment()
        {
            clear();
        }
    }

    public static final class OfferDetailsContextExtraInfo extends ExtendableMessageNano
    {

        public String offerLocalId;
        public String offerNamespace;

        private OfferDetailsContextExtraInfo clear()
        {
            offerNamespace = null;
            offerLocalId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private OfferDetailsContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    offerNamespace = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    offerLocalId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (offerNamespace != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, offerNamespace);
            }
            j = i;
            if (offerLocalId != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, offerLocalId);
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
            if (offerNamespace != null)
            {
                codedoutputbytebuffernano.writeString(1, offerNamespace);
            }
            if (offerLocalId != null)
            {
                codedoutputbytebuffernano.writeString(2, offerLocalId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OfferDetailsContextExtraInfo()
        {
            clear();
        }
    }

    public static final class PayByFaceContextExtraInfo extends ExtendableMessageNano
    {

        public Integer displayNearbyUsersDelayMillis;
        public Integer returnedNearbyUserCount;

        private PayByFaceContextExtraInfo clear()
        {
            displayNearbyUsersDelayMillis = null;
            returnedNearbyUserCount = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PayByFaceContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    displayNearbyUsersDelayMillis = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    returnedNearbyUserCount = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (displayNearbyUsersDelayMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, displayNearbyUsersDelayMillis.intValue());
            }
            j = i;
            if (returnedNearbyUserCount != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, returnedNearbyUserCount.intValue());
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
            if (displayNearbyUsersDelayMillis != null)
            {
                codedoutputbytebuffernano.writeInt32(1, displayNearbyUsersDelayMillis.intValue());
            }
            if (returnedNearbyUserCount != null)
            {
                codedoutputbytebuffernano.writeInt32(2, returnedNearbyUserCount.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PayByFaceContextExtraInfo()
        {
            clear();
        }
    }

    public static final class PhysicalTapLog extends ExtendableMessageNano
    {

        public Long clientStartTimeMillis;
        public Long durationMillis;
        public PhysicalTapLogEvent events[];

        private PhysicalTapLog clear()
        {
            clientStartTimeMillis = null;
            durationMillis = null;
            events = PhysicalTapLogEvent.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PhysicalTapLog mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    clientStartTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 16: // '\020'
                    durationMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    PhysicalTapLogEvent aphysicaltaplogevent[];
                    int j;
                    if (events == null)
                    {
                        j = 0;
                    } else
                    {
                        j = events.length;
                    }
                    aphysicaltaplogevent = new PhysicalTapLogEvent[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(events, 0, aphysicaltaplogevent, 0, j);
                        k = j;
                    }
                    for (; k < aphysicaltaplogevent.length - 1; k++)
                    {
                        aphysicaltaplogevent[k] = new PhysicalTapLogEvent();
                        codedinputbytebuffernano.readMessage(aphysicaltaplogevent[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aphysicaltaplogevent[k] = new PhysicalTapLogEvent();
                    codedinputbytebuffernano.readMessage(aphysicaltaplogevent[k]);
                    events = aphysicaltaplogevent;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (clientStartTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(1, clientStartTimeMillis.longValue());
            }
            i = j;
            if (durationMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, durationMillis.longValue());
            }
            int l = i;
            if (events != null)
            {
                l = i;
                if (events.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= events.length)
                        {
                            break;
                        }
                        PhysicalTapLogEvent physicaltaplogevent = events[k];
                        l = i;
                        if (physicaltaplogevent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, physicaltaplogevent);
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
            if (clientStartTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientStartTimeMillis.longValue());
            }
            if (durationMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, durationMillis.longValue());
            }
            if (events != null && events.length > 0)
            {
                for (int i = 0; i < events.length; i++)
                {
                    PhysicalTapLogEvent physicaltaplogevent = events[i];
                    if (physicaltaplogevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, physicaltaplogevent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PhysicalTapLog()
        {
            clear();
        }
    }

    public static final class PhysicalTapLog.PhysicalTapLogEvent extends ExtendableMessageNano
    {

        private static volatile PhysicalTapLog.PhysicalTapLogEvent _emptyArray[];
        public Long clientEventTimeMillis;
        public Integer type;

        private PhysicalTapLog.PhysicalTapLogEvent clear()
        {
            clientEventTimeMillis = null;
            type = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static PhysicalTapLog.PhysicalTapLogEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PhysicalTapLog.PhysicalTapLogEvent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private PhysicalTapLog.PhysicalTapLogEvent mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       16: 65;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            clientEventTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
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
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
                type = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientEventTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientEventTimeMillis.longValue());
            }
            j = i;
            if (type != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, type.intValue());
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
            if (clientEventTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientEventTimeMillis.longValue());
            }
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(2, type.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PhysicalTapLog.PhysicalTapLogEvent()
        {
            clear();
        }
    }

    public static final class PurchaseRecordContextExtraInfo extends ExtendableMessageNano
    {

        public String invalidUri;

        private PurchaseRecordContextExtraInfo clear()
        {
            invalidUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private PurchaseRecordContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    invalidUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (invalidUri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, invalidUri);
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
            if (invalidUri != null)
            {
                codedoutputbytebuffernano.writeString(1, invalidUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PurchaseRecordContextExtraInfo()
        {
            clear();
        }
    }

    public static final class RpcTimingLog extends ExtendableMessageNano
    {

        public Integer networkType;
        public Integer requestSizeBytes;
        public Integer responseCode;
        public Integer responseSizeBytes;
        public ServiceInfo serviceInfo;
        public Long spanId;
        public TimeSpan timeSpan;
        public Long traceId;

        private RpcTimingLog clear()
        {
            serviceInfo = null;
            timeSpan = null;
            networkType = null;
            responseCode = null;
            requestSizeBytes = null;
            responseSizeBytes = null;
            traceId = null;
            spanId = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RpcTimingLog mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 97
        //                       10: 99
        //                       18: 128
        //                       24: 157
        //                       32: 210
        //                       40: 224
        //                       48: 238
        //                       56: 252
        //                       64: 266;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            if (serviceInfo == null)
            {
                serviceInfo = new ServiceInfo();
            }
            codedinputbytebuffernano.readMessage(serviceInfo);
              goto _L11
_L4:
            if (timeSpan == null)
            {
                timeSpan = new TimeSpan();
            }
            codedinputbytebuffernano.readMessage(timeSpan);
              goto _L11
_L5:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                networkType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            responseCode = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L7:
            requestSizeBytes = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L8:
            responseSizeBytes = Integer.valueOf(codedinputbytebuffernano.readInt32());
            continue; /* Loop/switch isn't completed */
_L9:
            traceId = Long.valueOf(codedinputbytebuffernano.readInt64());
            continue; /* Loop/switch isn't completed */
_L10:
            spanId = Long.valueOf(codedinputbytebuffernano.readInt64());
            if (true) goto _L11; else goto _L12
_L12:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serviceInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, serviceInfo);
            }
            j = i;
            if (timeSpan != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, timeSpan);
            }
            i = j;
            if (networkType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, networkType.intValue());
            }
            j = i;
            if (responseCode != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, responseCode.intValue());
            }
            i = j;
            if (requestSizeBytes != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, requestSizeBytes.intValue());
            }
            j = i;
            if (responseSizeBytes != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, responseSizeBytes.intValue());
            }
            i = j;
            if (traceId != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(7, traceId.longValue());
            }
            j = i;
            if (spanId != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(8, spanId.longValue());
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
            if (serviceInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, serviceInfo);
            }
            if (timeSpan != null)
            {
                codedoutputbytebuffernano.writeMessage(2, timeSpan);
            }
            if (networkType != null)
            {
                codedoutputbytebuffernano.writeInt32(3, networkType.intValue());
            }
            if (responseCode != null)
            {
                codedoutputbytebuffernano.writeInt32(4, responseCode.intValue());
            }
            if (requestSizeBytes != null)
            {
                codedoutputbytebuffernano.writeInt32(5, requestSizeBytes.intValue());
            }
            if (responseSizeBytes != null)
            {
                codedoutputbytebuffernano.writeInt32(6, responseSizeBytes.intValue());
            }
            if (traceId != null)
            {
                codedoutputbytebuffernano.writeInt64(7, traceId.longValue());
            }
            if (spanId != null)
            {
                codedoutputbytebuffernano.writeInt64(8, spanId.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RpcTimingLog()
        {
            clear();
        }
    }

    public static final class RpcTimingLog.ServiceInfo extends ExtendableMessageNano
    {

        public String serviceEndpoint;

        private RpcTimingLog.ServiceInfo clear()
        {
            serviceEndpoint = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RpcTimingLog.ServiceInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    serviceEndpoint = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (serviceEndpoint != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, serviceEndpoint);
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
            if (serviceEndpoint != null)
            {
                codedoutputbytebuffernano.writeString(1, serviceEndpoint);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RpcTimingLog.ServiceInfo()
        {
            clear();
        }
    }

    public static final class TimeSpan extends ExtendableMessageNano
    {

        private static volatile TimeSpan _emptyArray[];
        public Long elapsedTimeMillis;
        public Long endTimeMillis;
        public String label;
        public Long startTimeMillis;
        public TimeSpan subSpan[];
        public Integer timingSource;

        private TimeSpan clear()
        {
            label = null;
            startTimeMillis = null;
            endTimeMillis = null;
            elapsedTimeMillis = null;
            timingSource = null;
            subSpan = emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private static TimeSpan[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new TimeSpan[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private TimeSpan mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 81
        //                       10: 83
        //                       16: 94
        //                       24: 108
        //                       32: 122
        //                       42: 170
        //                       48: 294;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            label = codedinputbytebuffernano.readString();
              goto _L9
_L4:
            startTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L9
_L5:
            endTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L9
_L6:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                timingSource = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
            TimeSpan atimespan[];
            int k;
            if (subSpan == null)
            {
                k = 0;
            } else
            {
                k = subSpan.length;
            }
            atimespan = new TimeSpan[k + l];
            l = k;
            if (k != 0)
            {
                System.arraycopy(subSpan, 0, atimespan, 0, k);
                l = k;
            }
            for (; l < atimespan.length - 1; l++)
            {
                atimespan[l] = new TimeSpan();
                codedinputbytebuffernano.readMessage(atimespan[l]);
                codedinputbytebuffernano.readTag();
            }

            atimespan[l] = new TimeSpan();
            codedinputbytebuffernano.readMessage(atimespan[l]);
            subSpan = atimespan;
            continue; /* Loop/switch isn't completed */
_L8:
            elapsedTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
            if (true) goto _L9; else goto _L10
_L10:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (label != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, label);
            }
            j = i;
            if (startTimeMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, startTimeMillis.longValue());
            }
            int k = j;
            if (endTimeMillis != null)
            {
                k = j + CodedOutputByteBufferNano.computeInt64Size(3, endTimeMillis.longValue());
            }
            i = k;
            if (timingSource != null)
            {
                i = k + CodedOutputByteBufferNano.computeInt32Size(4, timingSource.intValue());
            }
            j = i;
            if (subSpan != null)
            {
                j = i;
                if (subSpan.length > 0)
                {
                    int l = 0;
                    do
                    {
                        j = i;
                        if (l >= subSpan.length)
                        {
                            break;
                        }
                        TimeSpan timespan = subSpan[l];
                        j = i;
                        if (timespan != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(5, timespan);
                        }
                        l++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (elapsedTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(6, elapsedTimeMillis.longValue());
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
            if (label != null)
            {
                codedoutputbytebuffernano.writeString(1, label);
            }
            if (startTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, startTimeMillis.longValue());
            }
            if (endTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(3, endTimeMillis.longValue());
            }
            if (timingSource != null)
            {
                codedoutputbytebuffernano.writeInt32(4, timingSource.intValue());
            }
            if (subSpan != null && subSpan.length > 0)
            {
                for (int i = 0; i < subSpan.length; i++)
                {
                    TimeSpan timespan = subSpan[i];
                    if (timespan != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, timespan);
                    }
                }

            }
            if (elapsedTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(6, elapsedTimeMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public TimeSpan()
        {
            clear();
        }
    }

    public static final class UserEventContextExtraInfo extends ExtendableMessageNano
    {

        public GeofencingContextExtraInfo deprecatedGeofencingOfferNotificationExtraInfo;
        public GiftCardContextExtraInfo giftCardExtraInfo;
        public ImageUploadContextExtraInfo imageUploadExtraInfo;
        public OfferDetailsContextExtraInfo mobileOffersLibraryOfferDetails;
        public OcrContextExtraInfo ocrExtraInfo;
        public PayByFaceContextExtraInfo payByFaceExtraInfo;
        public PurchaseRecordContextExtraInfo purchaseRecordExtraInfo;
        public WobViewContextExtraInfo wobViewExtraInfo;

        private UserEventContextExtraInfo clear()
        {
            mobileOffersLibraryOfferDetails = null;
            purchaseRecordExtraInfo = null;
            deprecatedGeofencingOfferNotificationExtraInfo = null;
            ocrExtraInfo = null;
            wobViewExtraInfo = null;
            giftCardExtraInfo = null;
            payByFaceExtraInfo = null;
            imageUploadExtraInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UserEventContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (mobileOffersLibraryOfferDetails == null)
                    {
                        mobileOffersLibraryOfferDetails = new OfferDetailsContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(mobileOffersLibraryOfferDetails);
                    break;

                case 18: // '\022'
                    if (purchaseRecordExtraInfo == null)
                    {
                        purchaseRecordExtraInfo = new PurchaseRecordContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(purchaseRecordExtraInfo);
                    break;

                case 26: // '\032'
                    if (deprecatedGeofencingOfferNotificationExtraInfo == null)
                    {
                        deprecatedGeofencingOfferNotificationExtraInfo = new GeofencingContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(deprecatedGeofencingOfferNotificationExtraInfo);
                    break;

                case 34: // '"'
                    if (ocrExtraInfo == null)
                    {
                        ocrExtraInfo = new OcrContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(ocrExtraInfo);
                    break;

                case 42: // '*'
                    if (wobViewExtraInfo == null)
                    {
                        wobViewExtraInfo = new WobViewContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(wobViewExtraInfo);
                    break;

                case 50: // '2'
                    if (giftCardExtraInfo == null)
                    {
                        giftCardExtraInfo = new GiftCardContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(giftCardExtraInfo);
                    break;

                case 58: // ':'
                    if (payByFaceExtraInfo == null)
                    {
                        payByFaceExtraInfo = new PayByFaceContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(payByFaceExtraInfo);
                    break;

                case 66: // 'B'
                    if (imageUploadExtraInfo == null)
                    {
                        imageUploadExtraInfo = new ImageUploadContextExtraInfo();
                    }
                    codedinputbytebuffernano.readMessage(imageUploadExtraInfo);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (mobileOffersLibraryOfferDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, mobileOffersLibraryOfferDetails);
            }
            j = i;
            if (purchaseRecordExtraInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, purchaseRecordExtraInfo);
            }
            i = j;
            if (deprecatedGeofencingOfferNotificationExtraInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, deprecatedGeofencingOfferNotificationExtraInfo);
            }
            j = i;
            if (ocrExtraInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, ocrExtraInfo);
            }
            i = j;
            if (wobViewExtraInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, wobViewExtraInfo);
            }
            j = i;
            if (giftCardExtraInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, giftCardExtraInfo);
            }
            i = j;
            if (payByFaceExtraInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, payByFaceExtraInfo);
            }
            j = i;
            if (imageUploadExtraInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, imageUploadExtraInfo);
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
            if (mobileOffersLibraryOfferDetails != null)
            {
                codedoutputbytebuffernano.writeMessage(1, mobileOffersLibraryOfferDetails);
            }
            if (purchaseRecordExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, purchaseRecordExtraInfo);
            }
            if (deprecatedGeofencingOfferNotificationExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, deprecatedGeofencingOfferNotificationExtraInfo);
            }
            if (ocrExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, ocrExtraInfo);
            }
            if (wobViewExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, wobViewExtraInfo);
            }
            if (giftCardExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(6, giftCardExtraInfo);
            }
            if (payByFaceExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(7, payByFaceExtraInfo);
            }
            if (imageUploadExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(8, imageUploadExtraInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserEventContextExtraInfo()
        {
            clear();
        }
    }

    public static final class UserEventInfo extends ExtendableMessageNano
    {

        public UserEventContextExtraInfo contextExtraInfo;
        public Integer userEventContextType;
        public Integer userEventType;

        private UserEventInfo clear()
        {
            userEventContextType = null;
            userEventType = null;
            contextExtraInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UserEventInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 722
        //                       26: 5394;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
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
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 1000: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
            case 1005: 
            case 1006: 
            case 1007: 
            case 1008: 
            case 1009: 
            case 1010: 
            case 1011: 
            case 1012: 
            case 1013: 
            case 1014: 
            case 1015: 
            case 1016: 
            case 1017: 
            case 1018: 
            case 1019: 
            case 1020: 
            case 2000: 
                userEventContextType = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int k = codedinputbytebuffernano.readInt32();
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
            case 33: // '!'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
            case 58: // ':'
            case 59: // ';'
            case 60: // '<'
            case 61: // '='
            case 62: // '>'
            case 63: // '?'
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
            case 67: // 'C'
            case 68: // 'D'
            case 69: // 'E'
            case 70: // 'F'
            case 71: // 'G'
            case 72: // 'H'
            case 73: // 'I'
            case 74: // 'J'
            case 75: // 'K'
            case 76: // 'L'
            case 77: // 'M'
            case 78: // 'N'
            case 79: // 'O'
            case 80: // 'P'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 86: // 'V'
            case 87: // 'W'
            case 88: // 'X'
            case 89: // 'Y'
            case 90: // 'Z'
            case 91: // '['
            case 92: // '\\'
            case 93: // ']'
            case 94: // '^'
            case 96: // '`'
            case 97: // 'a'
            case 98: // 'b'
            case 99: // 'c'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
            case 106: // 'j'
            case 107: // 'k'
            case 108: // 'l'
            case 109: // 'm'
            case 110: // 'n'
            case 111: // 'o'
            case 112: // 'p'
            case 113: // 'q'
            case 114: // 'r'
            case 115: // 's'
            case 116: // 't'
            case 117: // 'u'
            case 118: // 'v'
            case 119: // 'w'
            case 120: // 'x'
            case 121: // 'y'
            case 122: // 'z'
            case 123: // '{'
            case 124: // '|'
            case 125: // '}'
            case 126: // '~'
            case 127: // '\177'
            case 128: 
            case 129: 
            case 130: 
            case 131: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 137: 
            case 138: 
            case 139: 
            case 140: 
            case 141: 
            case 142: 
            case 143: 
            case 144: 
            case 145: 
            case 146: 
            case 147: 
            case 148: 
            case 149: 
            case 150: 
            case 151: 
            case 152: 
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 167: 
            case 168: 
            case 169: 
            case 170: 
            case 171: 
            case 172: 
            case 173: 
            case 174: 
            case 175: 
            case 176: 
            case 177: 
            case 178: 
            case 179: 
            case 180: 
            case 181: 
            case 182: 
            case 183: 
            case 184: 
            case 185: 
            case 186: 
            case 187: 
            case 188: 
            case 189: 
            case 190: 
            case 191: 
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: 
            case 197: 
            case 198: 
            case 199: 
            case 200: 
            case 201: 
            case 202: 
            case 203: 
            case 204: 
            case 205: 
            case 206: 
            case 207: 
            case 208: 
            case 209: 
            case 210: 
            case 211: 
            case 212: 
            case 213: 
            case 214: 
            case 215: 
            case 216: 
            case 217: 
            case 218: 
            case 219: 
            case 220: 
            case 221: 
            case 222: 
            case 223: 
            case 224: 
            case 225: 
            case 226: 
            case 227: 
            case 228: 
            case 229: 
            case 230: 
            case 231: 
            case 232: 
            case 233: 
            case 234: 
            case 235: 
            case 236: 
            case 237: 
            case 238: 
            case 239: 
            case 240: 
            case 241: 
            case 242: 
            case 243: 
            case 244: 
            case 245: 
            case 246: 
            case 247: 
            case 248: 
            case 249: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 256: 
            case 257: 
            case 258: 
            case 259: 
            case 260: 
            case 261: 
            case 262: 
            case 263: 
            case 264: 
            case 265: 
            case 266: 
            case 267: 
            case 268: 
            case 269: 
            case 270: 
            case 271: 
            case 272: 
            case 273: 
            case 274: 
            case 275: 
            case 276: 
            case 277: 
            case 278: 
            case 279: 
            case 280: 
            case 281: 
            case 282: 
            case 283: 
            case 284: 
            case 285: 
            case 286: 
            case 287: 
            case 288: 
            case 289: 
            case 290: 
            case 291: 
            case 292: 
            case 293: 
            case 294: 
            case 295: 
            case 296: 
            case 297: 
            case 298: 
            case 299: 
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 306: 
            case 307: 
            case 308: 
            case 309: 
            case 310: 
            case 311: 
            case 312: 
            case 313: 
            case 314: 
            case 315: 
            case 316: 
            case 317: 
            case 318: 
            case 319: 
            case 320: 
            case 321: 
            case 322: 
            case 323: 
            case 324: 
            case 325: 
            case 326: 
            case 327: 
            case 328: 
            case 329: 
            case 330: 
            case 331: 
            case 332: 
            case 333: 
            case 334: 
            case 335: 
            case 336: 
            case 100000: 
            case 100001: 
            case 100002: 
            case 100003: 
            case 100004: 
            case 100005: 
            case 100006: 
            case 100007: 
            case 100008: 
            case 100009: 
            case 100010: 
            case 100011: 
            case 100012: 
            case 100013: 
            case 100014: 
            case 100015: 
            case 100016: 
            case 100017: 
            case 100018: 
            case 100019: 
            case 100020: 
            case 100021: 
            case 100022: 
            case 100023: 
            case 100024: 
            case 100025: 
            case 100026: 
            case 100027: 
            case 100028: 
            case 100029: 
            case 100030: 
            case 100031: 
            case 100032: 
            case 100033: 
            case 100035: 
            case 100036: 
            case 100037: 
            case 100038: 
            case 100039: 
            case 100040: 
            case 100041: 
            case 100042: 
            case 100043: 
            case 100044: 
            case 100045: 
            case 100046: 
            case 100047: 
            case 100048: 
            case 100049: 
            case 100050: 
            case 100051: 
            case 100052: 
            case 100053: 
            case 100054: 
            case 100055: 
            case 100056: 
            case 100057: 
            case 100058: 
            case 100059: 
            case 100060: 
            case 100061: 
            case 100062: 
            case 100063: 
            case 100064: 
            case 100065: 
            case 100066: 
            case 100067: 
            case 100068: 
            case 100069: 
            case 100070: 
            case 100071: 
            case 100072: 
            case 100073: 
            case 100074: 
            case 100075: 
            case 100076: 
            case 100077: 
            case 100078: 
            case 100079: 
            case 100080: 
            case 100081: 
            case 100082: 
            case 100083: 
            case 100084: 
            case 100085: 
            case 100086: 
            case 100087: 
            case 100088: 
            case 100089: 
            case 100090: 
            case 100091: 
            case 100092: 
            case 100093: 
            case 100094: 
            case 100095: 
            case 100096: 
            case 100097: 
            case 100098: 
            case 100099: 
            case 100100: 
            case 100101: 
            case 100102: 
            case 100103: 
            case 100104: 
            case 100105: 
            case 100106: 
            case 100107: 
            case 100108: 
            case 100109: 
            case 100110: 
            case 100111: 
            case 100112: 
            case 100113: 
            case 100114: 
            case 100115: 
            case 100116: 
            case 100117: 
            case 100118: 
            case 100119: 
            case 100120: 
            case 100121: 
            case 100122: 
            case 100123: 
            case 100124: 
            case 100125: 
            case 100126: 
            case 100127: 
            case 100128: 
            case 100129: 
            case 100136: 
            case 100137: 
            case 100138: 
            case 100139: 
            case 100140: 
            case 100141: 
            case 100142: 
            case 100143: 
            case 100144: 
            case 100145: 
            case 100146: 
            case 100147: 
            case 100148: 
            case 100149: 
            case 100150: 
            case 100151: 
            case 100152: 
            case 100153: 
            case 100154: 
            case 100155: 
            case 100156: 
            case 100157: 
            case 100158: 
            case 100159: 
            case 100160: 
            case 100161: 
            case 100162: 
            case 100163: 
            case 100164: 
            case 100165: 
            case 100166: 
            case 100167: 
            case 100168: 
            case 100169: 
            case 100170: 
            case 100171: 
            case 100172: 
            case 100173: 
            case 100174: 
            case 100175: 
            case 100176: 
            case 100177: 
            case 100178: 
            case 100179: 
            case 100180: 
            case 100181: 
            case 100182: 
            case 100183: 
            case 100184: 
            case 100185: 
            case 100186: 
            case 100187: 
            case 100188: 
            case 100189: 
            case 100190: 
            case 100191: 
            case 100192: 
            case 100193: 
            case 100194: 
            case 100195: 
            case 100196: 
            case 100197: 
            case 100198: 
            case 100199: 
            case 100200: 
            case 100201: 
            case 100202: 
            case 100203: 
            case 100204: 
            case 100205: 
            case 100206: 
            case 100207: 
            case 100208: 
            case 100209: 
            case 100210: 
            case 100211: 
            case 100212: 
            case 100213: 
            case 100214: 
            case 100215: 
            case 100216: 
            case 100217: 
            case 100218: 
            case 100219: 
            case 100220: 
            case 100221: 
            case 100222: 
            case 100223: 
            case 100224: 
            case 100225: 
            case 100226: 
            case 100227: 
            case 100228: 
            case 100229: 
            case 100230: 
            case 100231: 
            case 100232: 
            case 100233: 
            case 100234: 
            case 100235: 
            case 100236: 
            case 100237: 
            case 100238: 
            case 100239: 
            case 100240: 
            case 100241: 
            case 100242: 
            case 100243: 
            case 100244: 
            case 100245: 
            case 200000: 
            case 200001: 
            case 1000130: 
            case 1000131: 
            case 1000132: 
            case 1000133: 
            case 1000134: 
            case 1000135: 
                userEventType = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            if (contextExtraInfo == null)
            {
                contextExtraInfo = new UserEventContextExtraInfo();
            }
            codedinputbytebuffernano.readMessage(contextExtraInfo);
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (userEventContextType != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, userEventContextType.intValue());
            }
            j = i;
            if (userEventType != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, userEventType.intValue());
            }
            i = j;
            if (contextExtraInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, contextExtraInfo);
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
            if (userEventContextType != null)
            {
                codedoutputbytebuffernano.writeInt32(1, userEventContextType.intValue());
            }
            if (userEventType != null)
            {
                codedoutputbytebuffernano.writeInt32(2, userEventType.intValue());
            }
            if (contextExtraInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, contextExtraInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public UserEventInfo()
        {
            clear();
        }
    }

    public static final class WalletEventLog extends ExtendableMessageNano
    {

        private static volatile WalletEventLog _emptyArray[];
        public ActionOutcome actionOutcome;
        public EventContext eventContext;
        public LogMessage logMessage;
        public PhysicalTapLog physicalTapLog;
        public RpcTimingLog rpcTimingLog;
        public UserEventInfo userEventInfo;
        public NanoWalletShared.UtmCampaignInfo utmCampaignInfo;

        private WalletEventLog clear()
        {
            eventContext = null;
            actionOutcome = null;
            userEventInfo = null;
            physicalTapLog = null;
            rpcTimingLog = null;
            utmCampaignInfo = null;
            logMessage = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static WalletEventLog[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new WalletEventLog[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private WalletEventLog mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (eventContext == null)
                    {
                        eventContext = new EventContext();
                    }
                    codedinputbytebuffernano.readMessage(eventContext);
                    break;

                case 18: // '\022'
                    if (actionOutcome == null)
                    {
                        actionOutcome = new ActionOutcome();
                    }
                    codedinputbytebuffernano.readMessage(actionOutcome);
                    break;

                case 26: // '\032'
                    if (userEventInfo == null)
                    {
                        userEventInfo = new UserEventInfo();
                    }
                    codedinputbytebuffernano.readMessage(userEventInfo);
                    break;

                case 34: // '"'
                    if (physicalTapLog == null)
                    {
                        physicalTapLog = new PhysicalTapLog();
                    }
                    codedinputbytebuffernano.readMessage(physicalTapLog);
                    break;

                case 42: // '*'
                    if (rpcTimingLog == null)
                    {
                        rpcTimingLog = new RpcTimingLog();
                    }
                    codedinputbytebuffernano.readMessage(rpcTimingLog);
                    break;

                case 50: // '2'
                    if (utmCampaignInfo == null)
                    {
                        utmCampaignInfo = new NanoWalletShared.UtmCampaignInfo();
                    }
                    codedinputbytebuffernano.readMessage(utmCampaignInfo);
                    break;

                case 58: // ':'
                    if (logMessage == null)
                    {
                        logMessage = new LogMessage();
                    }
                    codedinputbytebuffernano.readMessage(logMessage);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (eventContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, eventContext);
            }
            j = i;
            if (actionOutcome != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, actionOutcome);
            }
            i = j;
            if (userEventInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, userEventInfo);
            }
            j = i;
            if (physicalTapLog != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, physicalTapLog);
            }
            i = j;
            if (rpcTimingLog != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, rpcTimingLog);
            }
            j = i;
            if (utmCampaignInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, utmCampaignInfo);
            }
            i = j;
            if (logMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, logMessage);
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
            if (eventContext != null)
            {
                codedoutputbytebuffernano.writeMessage(1, eventContext);
            }
            if (actionOutcome != null)
            {
                codedoutputbytebuffernano.writeMessage(2, actionOutcome);
            }
            if (userEventInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, userEventInfo);
            }
            if (physicalTapLog != null)
            {
                codedoutputbytebuffernano.writeMessage(4, physicalTapLog);
            }
            if (rpcTimingLog != null)
            {
                codedoutputbytebuffernano.writeMessage(5, rpcTimingLog);
            }
            if (utmCampaignInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(6, utmCampaignInfo);
            }
            if (logMessage != null)
            {
                codedoutputbytebuffernano.writeMessage(7, logMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletEventLog()
        {
            clear();
        }
    }

    public static final class WalletEventLogRequest extends ExtendableMessageNano
    {

        public Long clientRequestTimeMicros;
        public NanoWalletShared.DeviceContext deviceContext;
        public NanoWalletShared.WalletContext walletContext;
        public WalletEventLog walletEventLogs[];

        private WalletEventLogRequest clear()
        {
            clientRequestTimeMicros = null;
            deviceContext = null;
            walletContext = null;
            walletEventLogs = WalletEventLog.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WalletEventLogRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    clientRequestTimeMicros = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 18: // '\022'
                    if (deviceContext == null)
                    {
                        deviceContext = new NanoWalletShared.DeviceContext();
                    }
                    codedinputbytebuffernano.readMessage(deviceContext);
                    break;

                case 26: // '\032'
                    if (walletContext == null)
                    {
                        walletContext = new NanoWalletShared.WalletContext();
                    }
                    codedinputbytebuffernano.readMessage(walletContext);
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    WalletEventLog awalleteventlog[];
                    int j;
                    if (walletEventLogs == null)
                    {
                        j = 0;
                    } else
                    {
                        j = walletEventLogs.length;
                    }
                    awalleteventlog = new WalletEventLog[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(walletEventLogs, 0, awalleteventlog, 0, j);
                        k = j;
                    }
                    for (; k < awalleteventlog.length - 1; k++)
                    {
                        awalleteventlog[k] = new WalletEventLog();
                        codedinputbytebuffernano.readMessage(awalleteventlog[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    awalleteventlog[k] = new WalletEventLog();
                    codedinputbytebuffernano.readMessage(awalleteventlog[k]);
                    walletEventLogs = awalleteventlog;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientRequestTimeMicros != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientRequestTimeMicros.longValue());
            }
            j = i;
            if (deviceContext != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, deviceContext);
            }
            i = j;
            if (walletContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, walletContext);
            }
            int l = i;
            if (walletEventLogs != null)
            {
                l = i;
                if (walletEventLogs.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= walletEventLogs.length)
                        {
                            break;
                        }
                        WalletEventLog walleteventlog = walletEventLogs[k];
                        l = i;
                        if (walleteventlog != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, walleteventlog);
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
            if (clientRequestTimeMicros != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientRequestTimeMicros.longValue());
            }
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(2, deviceContext);
            }
            if (walletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(3, walletContext);
            }
            if (walletEventLogs != null && walletEventLogs.length > 0)
            {
                for (int i = 0; i < walletEventLogs.length; i++)
                {
                    WalletEventLog walleteventlog = walletEventLogs[i];
                    if (walleteventlog != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, walleteventlog);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletEventLogRequest()
        {
            clear();
        }
    }

    public static final class WalletEventLogResponse extends ExtendableMessageNano
    {

        public Integer status;

        private WalletEventLogResponse clear()
        {
            status = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WalletEventLogResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       8: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
                status = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status.intValue());
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
            super.writeTo(codedoutputbytebuffernano);
        }

        public WalletEventLogResponse()
        {
            clear();
        }
    }

    public static final class WobViewContextExtraInfo extends ExtendableMessageNano
    {

        public String tappedUri;
        public byte wobInstanceServerData[];

        private WobViewContextExtraInfo clear()
        {
            wobInstanceServerData = null;
            tappedUri = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private WobViewContextExtraInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    wobInstanceServerData = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    tappedUri = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (wobInstanceServerData != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, wobInstanceServerData);
            }
            j = i;
            if (tappedUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, tappedUri);
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
            if (wobInstanceServerData != null)
            {
                codedoutputbytebuffernano.writeBytes(1, wobInstanceServerData);
            }
            if (tappedUri != null)
            {
                codedoutputbytebuffernano.writeString(2, tappedUri);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public WobViewContextExtraInfo()
        {
            clear();
        }
    }

}
