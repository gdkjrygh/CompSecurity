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

public interface NanoWalletGiftCards
{
    public static final class DiscoverGiftCardsRequest extends ExtendableMessageNano
    {

        public String continuationToken;
        public Integer pageSize;
        public String queryString;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;

        private DiscoverGiftCardsRequest clear()
        {
            queryString = null;
            continuationToken = null;
            pageSize = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverGiftCardsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverGiftCardsRequest()
        {
            clear();
        }
    }

    public static final class DiscoverGiftCardsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String continuationToken;
        public GiftCardForm forms[];

        private DiscoverGiftCardsResponse clear()
        {
            continuationToken = null;
            forms = GiftCardForm.emptyArray();
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverGiftCardsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    continuationToken = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    if (callError == null)
                    {
                        callError = new com.google.wallet.proto.NanoWalletError.CallError();
                    }
                    codedinputbytebuffernano.readMessage(callError);
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    GiftCardForm agiftcardform[];
                    int j;
                    if (forms == null)
                    {
                        j = 0;
                    } else
                    {
                        j = forms.length;
                    }
                    agiftcardform = new GiftCardForm[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(forms, 0, agiftcardform, 0, j);
                        k = j;
                    }
                    for (; k < agiftcardform.length - 1; k++)
                    {
                        agiftcardform[k] = new GiftCardForm();
                        codedinputbytebuffernano.readMessage(agiftcardform[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    agiftcardform[k] = new GiftCardForm();
                    codedinputbytebuffernano.readMessage(agiftcardform[k]);
                    forms = agiftcardform;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (continuationToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, continuationToken);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
            }
            int l = i;
            if (forms != null)
            {
                l = i;
                if (forms.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= forms.length)
                        {
                            break;
                        }
                        GiftCardForm giftcardform = forms[k];
                        l = i;
                        if (giftcardform != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, giftcardform);
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
            if (continuationToken != null)
            {
                codedoutputbytebuffernano.writeString(2, continuationToken);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            if (forms != null && forms.length > 0)
            {
                for (int i = 0; i < forms.length; i++)
                {
                    GiftCardForm giftcardform = forms[i];
                    if (giftcardform != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, giftcardform);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverGiftCardsResponse()
        {
            clear();
        }
    }

    public static final class DiscoverableGiftCard extends ExtendableMessageNano
    {

        public NanoWalletWobForms.Message addMessage;
        public String discoverableId;
        public ExternalRedemption externalRedemption;
        public NativeRenderingInfo nativeRenderingInfo;

        private DiscoverableGiftCard clear()
        {
            discoverableId = null;
            nativeRenderingInfo = null;
            externalRedemption = null;
            addMessage = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableGiftCard mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    discoverableId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (nativeRenderingInfo == null)
                    {
                        nativeRenderingInfo = new NativeRenderingInfo();
                    }
                    codedinputbytebuffernano.readMessage(nativeRenderingInfo);
                    break;

                case 50: // '2'
                    if (externalRedemption == null)
                    {
                        externalRedemption = new ExternalRedemption();
                    }
                    codedinputbytebuffernano.readMessage(externalRedemption);
                    break;

                case 82: // 'R'
                    if (addMessage == null)
                    {
                        addMessage = new NanoWalletWobForms.Message();
                    }
                    codedinputbytebuffernano.readMessage(addMessage);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (discoverableId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableId);
            }
            j = i;
            if (nativeRenderingInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, nativeRenderingInfo);
            }
            i = j;
            if (externalRedemption != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(6, externalRedemption);
            }
            j = i;
            if (addMessage != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, addMessage);
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
            if (discoverableId != null)
            {
                codedoutputbytebuffernano.writeString(1, discoverableId);
            }
            if (nativeRenderingInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, nativeRenderingInfo);
            }
            if (externalRedemption != null)
            {
                codedoutputbytebuffernano.writeMessage(6, externalRedemption);
            }
            if (addMessage != null)
            {
                codedoutputbytebuffernano.writeMessage(10, addMessage);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableGiftCard()
        {
            clear();
        }
    }

    public static final class DiscoverableGiftCard.ExternalRedemption extends ExtendableMessageNano
    {

        public String abortText;
        public String messageContent;
        public String messageTitle;
        public String redeemText;
        public String redemptionUri;
        public String redemptionUriCardKnown;

        private DiscoverableGiftCard.ExternalRedemption clear()
        {
            messageTitle = null;
            messageContent = null;
            abortText = null;
            redeemText = null;
            redemptionUri = null;
            redemptionUriCardKnown = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableGiftCard.ExternalRedemption mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    messageTitle = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    messageContent = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    abortText = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    redeemText = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    redemptionUri = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    redemptionUriCardKnown = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (messageTitle != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, messageTitle);
            }
            j = i;
            if (messageContent != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, messageContent);
            }
            i = j;
            if (abortText != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, abortText);
            }
            j = i;
            if (redeemText != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, redeemText);
            }
            i = j;
            if (redemptionUri != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, redemptionUri);
            }
            j = i;
            if (redemptionUriCardKnown != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, redemptionUriCardKnown);
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
            if (messageTitle != null)
            {
                codedoutputbytebuffernano.writeString(1, messageTitle);
            }
            if (messageContent != null)
            {
                codedoutputbytebuffernano.writeString(2, messageContent);
            }
            if (abortText != null)
            {
                codedoutputbytebuffernano.writeString(3, abortText);
            }
            if (redeemText != null)
            {
                codedoutputbytebuffernano.writeString(4, redeemText);
            }
            if (redemptionUri != null)
            {
                codedoutputbytebuffernano.writeString(5, redemptionUri);
            }
            if (redemptionUriCardKnown != null)
            {
                codedoutputbytebuffernano.writeString(6, redemptionUriCardKnown);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableGiftCard.ExternalRedemption()
        {
            clear();
        }
    }

    public static final class DiscoverableGiftCard.NativeRenderingInfo extends ExtendableMessageNano
    {

        public String logoImageUrl;
        public String merchantName;

        private DiscoverableGiftCard.NativeRenderingInfo clear()
        {
            merchantName = null;
            logoImageUrl = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private DiscoverableGiftCard.NativeRenderingInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            if (logoImageUrl != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, logoImageUrl);
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
            if (logoImageUrl != null)
            {
                codedoutputbytebuffernano.writeString(2, logoImageUrl);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DiscoverableGiftCard.NativeRenderingInfo()
        {
            clear();
        }
    }

    public static final class GetEditFormRequest extends ExtendableMessageNano
    {

        public String contextUri;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public byte serverData[];

        private GetEditFormRequest clear()
        {
            serverData = null;
            contextUri = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetEditFormRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    contextUri = codedinputbytebuffernano.readString();
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
            if (contextUri != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, contextUri);
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
            if (contextUri != null)
            {
                codedoutputbytebuffernano.writeString(2, contextUri);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetEditFormRequest()
        {
            clear();
        }
    }

    public static final class GetEditFormResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public GiftCardForm giftCardForm;

        private GetEditFormResponse clear()
        {
            giftCardForm = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetEditFormResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (giftCardForm == null)
                    {
                        giftCardForm = new GiftCardForm();
                    }
                    codedinputbytebuffernano.readMessage(giftCardForm);
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
            if (giftCardForm != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(3, giftCardForm);
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
            if (giftCardForm != null)
            {
                codedoutputbytebuffernano.writeMessage(3, giftCardForm);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetEditFormResponse()
        {
            clear();
        }
    }

    public static final class GetGiftCardFormRequest extends ExtendableMessageNano
    {

        public String discoverableId;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;

        private GetGiftCardFormRequest clear()
        {
            discoverableId = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetGiftCardFormRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    discoverableId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
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
            if (discoverableId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableId);
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
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
            if (discoverableId != null)
            {
                codedoutputbytebuffernano.writeString(1, discoverableId);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, renderInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetGiftCardFormRequest()
        {
            clear();
        }
    }

    public static final class GetGiftCardFormResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public GiftCardForm giftCardForm;

        private GetGiftCardFormResponse clear()
        {
            giftCardForm = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GetGiftCardFormResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (giftCardForm == null)
                    {
                        giftCardForm = new GiftCardForm();
                    }
                    codedinputbytebuffernano.readMessage(giftCardForm);
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
            if (giftCardForm != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, giftCardForm);
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
            if (giftCardForm != null)
            {
                codedoutputbytebuffernano.writeMessage(1, giftCardForm);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GetGiftCardFormResponse()
        {
            clear();
        }
    }

    public static final class GiftCardForm extends ExtendableMessageNano
    {

        private static volatile GiftCardForm _emptyArray[];
        public DiscoverableGiftCard discoverable;
        public NanoWalletWobForms.InputForm form;

        private GiftCardForm clear()
        {
            form = null;
            discoverable = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static GiftCardForm[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new GiftCardForm[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private GiftCardForm mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (form == null)
                    {
                        form = new NanoWalletWobForms.InputForm();
                    }
                    codedinputbytebuffernano.readMessage(form);
                    break;

                case 18: // '\022'
                    if (discoverable == null)
                    {
                        discoverable = new DiscoverableGiftCard();
                    }
                    codedinputbytebuffernano.readMessage(discoverable);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (form != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, form);
            }
            j = i;
            if (discoverable != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, discoverable);
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
            if (form != null)
            {
                codedoutputbytebuffernano.writeMessage(1, form);
            }
            if (discoverable != null)
            {
                codedoutputbytebuffernano.writeMessage(2, discoverable);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardForm()
        {
            clear();
        }
    }

    public static final class LinkAdhocGiftCardsRequest extends ExtendableMessageNano
    {

        public NanoWalletWobForms.InputFormSubmission formSubmission;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public NanoUserAddedImages.UserAddedImage userAddedImage[];

        private LinkAdhocGiftCardsRequest clear()
        {
            renderInfo = null;
            userAddedImage = NanoUserAddedImages.UserAddedImage.emptyArray();
            formSubmission = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkAdhocGiftCardsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 42: // '*'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 50: // '2'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
                    NanoUserAddedImages.UserAddedImage auseraddedimage[];
                    int j;
                    if (userAddedImage == null)
                    {
                        j = 0;
                    } else
                    {
                        j = userAddedImage.length;
                    }
                    auseraddedimage = new NanoUserAddedImages.UserAddedImage[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(userAddedImage, 0, auseraddedimage, 0, j);
                        k = j;
                    }
                    for (; k < auseraddedimage.length - 1; k++)
                    {
                        auseraddedimage[k] = new NanoUserAddedImages.UserAddedImage();
                        codedinputbytebuffernano.readMessage(auseraddedimage[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    auseraddedimage[k] = new NanoUserAddedImages.UserAddedImage();
                    codedinputbytebuffernano.readMessage(auseraddedimage[k]);
                    userAddedImage = auseraddedimage;
                    break;

                case 58: // ':'
                    if (formSubmission == null)
                    {
                        formSubmission = new NanoWalletWobForms.InputFormSubmission();
                    }
                    codedinputbytebuffernano.readMessage(formSubmission);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (renderInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, renderInfo);
            }
            j = i;
            if (userAddedImage != null)
            {
                j = i;
                if (userAddedImage.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= userAddedImage.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[k];
                        j = i;
                        if (useraddedimage != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(6, useraddedimage);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (formSubmission != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, formSubmission);
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
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, renderInfo);
            }
            if (userAddedImage != null && userAddedImage.length > 0)
            {
                for (int i = 0; i < userAddedImage.length; i++)
                {
                    NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[i];
                    if (useraddedimage != null)
                    {
                        codedoutputbytebuffernano.writeMessage(6, useraddedimage);
                    }
                }

            }
            if (formSubmission != null)
            {
                codedoutputbytebuffernano.writeMessage(7, formSubmission);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkAdhocGiftCardsRequest()
        {
            clear();
        }
    }

    public static final class LinkAdhocGiftCardsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private LinkAdhocGiftCardsResponse clear()
        {
            wobInstance = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkAdhocGiftCardsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public LinkAdhocGiftCardsResponse()
        {
            clear();
        }
    }

    public static final class LinkGiftCardsRequest extends ExtendableMessageNano
    {

        public String discoverableId;
        public NanoWalletWobForms.InputFormSubmission formSubmission;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public NanoUserAddedImages.UserAddedImage userAddedImage[];

        private LinkGiftCardsRequest clear()
        {
            discoverableId = null;
            renderInfo = null;
            formSubmission = null;
            userAddedImage = NanoUserAddedImages.UserAddedImage.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkGiftCardsRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    discoverableId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (renderInfo == null)
                    {
                        renderInfo = new com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo();
                    }
                    codedinputbytebuffernano.readMessage(renderInfo);
                    break;

                case 26: // '\032'
                    if (formSubmission == null)
                    {
                        formSubmission = new NanoWalletWobForms.InputFormSubmission();
                    }
                    codedinputbytebuffernano.readMessage(formSubmission);
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    NanoUserAddedImages.UserAddedImage auseraddedimage[];
                    int j;
                    if (userAddedImage == null)
                    {
                        j = 0;
                    } else
                    {
                        j = userAddedImage.length;
                    }
                    auseraddedimage = new NanoUserAddedImages.UserAddedImage[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(userAddedImage, 0, auseraddedimage, 0, j);
                        k = j;
                    }
                    for (; k < auseraddedimage.length - 1; k++)
                    {
                        auseraddedimage[k] = new NanoUserAddedImages.UserAddedImage();
                        codedinputbytebuffernano.readMessage(auseraddedimage[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    auseraddedimage[k] = new NanoUserAddedImages.UserAddedImage();
                    codedinputbytebuffernano.readMessage(auseraddedimage[k]);
                    userAddedImage = auseraddedimage;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (discoverableId != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, discoverableId);
            }
            j = i;
            if (renderInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, renderInfo);
            }
            i = j;
            if (formSubmission != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, formSubmission);
            }
            int l = i;
            if (userAddedImage != null)
            {
                l = i;
                if (userAddedImage.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= userAddedImage.length)
                        {
                            break;
                        }
                        NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[k];
                        l = i;
                        if (useraddedimage != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, useraddedimage);
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
            if (discoverableId != null)
            {
                codedoutputbytebuffernano.writeString(1, discoverableId);
            }
            if (renderInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, renderInfo);
            }
            if (formSubmission != null)
            {
                codedoutputbytebuffernano.writeMessage(3, formSubmission);
            }
            if (userAddedImage != null && userAddedImage.length > 0)
            {
                for (int i = 0; i < userAddedImage.length; i++)
                {
                    NanoUserAddedImages.UserAddedImage useraddedimage = userAddedImage[i];
                    if (useraddedimage != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, useraddedimage);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkGiftCardsRequest()
        {
            clear();
        }
    }

    public static final class LinkGiftCardsResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public String merchantMessage;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private LinkGiftCardsResponse clear()
        {
            merchantMessage = null;
            wobInstance = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LinkGiftCardsResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    merchantMessage = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    if (wobInstance == null)
                    {
                        wobInstance = new com.google.wallet.proto.NanoWalletObjects.WobInstance();
                    }
                    codedinputbytebuffernano.readMessage(wobInstance);
                    break;

                case 26: // '\032'
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
            if (merchantMessage != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, merchantMessage);
            }
            j = i;
            if (wobInstance != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, wobInstance);
            }
            i = j;
            if (callError != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, callError);
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
            if (merchantMessage != null)
            {
                codedoutputbytebuffernano.writeString(1, merchantMessage);
            }
            if (wobInstance != null)
            {
                codedoutputbytebuffernano.writeMessage(2, wobInstance);
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(3, callError);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LinkGiftCardsResponse()
        {
            clear();
        }
    }

    public static final class UpdateWobInstanceRequest extends ExtendableMessageNano
    {

        public NanoWalletWobForms.InputFormSubmission formSubmission;
        public com.google.wallet.proto.NanoWalletTransport.RequestRenderInfo renderInfo;
        public byte serverData[];

        private UpdateWobInstanceRequest clear()
        {
            serverData = null;
            formSubmission = null;
            renderInfo = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateWobInstanceRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public UpdateWobInstanceRequest()
        {
            clear();
        }
    }

    public static final class UpdateWobInstanceResponse extends ExtendableMessageNano
    {

        public com.google.wallet.proto.NanoWalletError.CallError callError;
        public com.google.wallet.proto.NanoWalletObjects.WobInstance wobInstance;

        private UpdateWobInstanceResponse clear()
        {
            wobInstance = null;
            callError = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private UpdateWobInstanceResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

        public UpdateWobInstanceResponse()
        {
            clear();
        }
    }

}
