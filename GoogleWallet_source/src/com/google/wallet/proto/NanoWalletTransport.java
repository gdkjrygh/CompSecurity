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

public interface NanoWalletTransport
{
    public static final class ClientCapabilities extends ExtendableMessageNano
    {

        public Boolean allowTapTargetQueryParams;
        public NanoWalletEntities.Features clientSupportedFeatures;
        public FormConfiguration formConfiguration;
        public NanoWalletUris.URI supportedUri[];
        public Boolean supportsPinToken;

        private ClientCapabilities clear()
        {
            supportsPinToken = null;
            clientSupportedFeatures = null;
            formConfiguration = null;
            supportedUri = NanoWalletUris.URI.emptyArray();
            allowTapTargetQueryParams = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientCapabilities mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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

                case 16: // '\020'
                    supportsPinToken = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;

                case 34: // '"'
                    if (clientSupportedFeatures == null)
                    {
                        clientSupportedFeatures = new NanoWalletEntities.Features();
                    }
                    codedinputbytebuffernano.readMessage(clientSupportedFeatures);
                    break;

                case 42: // '*'
                    if (formConfiguration == null)
                    {
                        formConfiguration = new FormConfiguration();
                    }
                    codedinputbytebuffernano.readMessage(formConfiguration);
                    break;

                case 50: // '2'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
                    NanoWalletUris.URI auri[];
                    int j;
                    if (supportedUri == null)
                    {
                        j = 0;
                    } else
                    {
                        j = supportedUri.length;
                    }
                    auri = new NanoWalletUris.URI[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(supportedUri, 0, auri, 0, j);
                        k = j;
                    }
                    for (; k < auri.length - 1; k++)
                    {
                        auri[k] = new NanoWalletUris.URI();
                        codedinputbytebuffernano.readMessage(auri[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    auri[k] = new NanoWalletUris.URI();
                    codedinputbytebuffernano.readMessage(auri[k]);
                    supportedUri = auri;
                    break;

                case 56: // '8'
                    allowTapTargetQueryParams = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (supportsPinToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(2, supportsPinToken.booleanValue());
            }
            j = i;
            if (clientSupportedFeatures != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, clientSupportedFeatures);
            }
            i = j;
            if (formConfiguration != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, formConfiguration);
            }
            j = i;
            if (supportedUri != null)
            {
                j = i;
                if (supportedUri.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= supportedUri.length)
                        {
                            break;
                        }
                        NanoWalletUris.URI uri = supportedUri[k];
                        j = i;
                        if (uri != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(6, uri);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (allowTapTargetQueryParams != null)
            {
                i = j + CodedOutputByteBufferNano.computeBoolSize(7, allowTapTargetQueryParams.booleanValue());
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
            if (supportsPinToken != null)
            {
                codedoutputbytebuffernano.writeBool(2, supportsPinToken.booleanValue());
            }
            if (clientSupportedFeatures != null)
            {
                codedoutputbytebuffernano.writeMessage(4, clientSupportedFeatures);
            }
            if (formConfiguration != null)
            {
                codedoutputbytebuffernano.writeMessage(5, formConfiguration);
            }
            if (supportedUri != null && supportedUri.length > 0)
            {
                for (int i = 0; i < supportedUri.length; i++)
                {
                    NanoWalletUris.URI uri = supportedUri[i];
                    if (uri != null)
                    {
                        codedoutputbytebuffernano.writeMessage(6, uri);
                    }
                }

            }
            if (allowTapTargetQueryParams != null)
            {
                codedoutputbytebuffernano.writeBool(7, allowTapTargetQueryParams.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientCapabilities()
        {
            clear();
        }
    }

    public static final class ClientRetryStrategy extends ExtendableMessageNano
    {

        public ConstantRetryStrategy constantRetryStrategy;
        public ExponentialRetryStrategy exponentialRetryStrategy;

        private ClientRetryStrategy clear()
        {
            constantRetryStrategy = null;
            exponentialRetryStrategy = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientRetryStrategy mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (constantRetryStrategy == null)
                    {
                        constantRetryStrategy = new ConstantRetryStrategy();
                    }
                    codedinputbytebuffernano.readMessage(constantRetryStrategy);
                    break;

                case 18: // '\022'
                    if (exponentialRetryStrategy == null)
                    {
                        exponentialRetryStrategy = new ExponentialRetryStrategy();
                    }
                    codedinputbytebuffernano.readMessage(exponentialRetryStrategy);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (constantRetryStrategy != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, constantRetryStrategy);
            }
            j = i;
            if (exponentialRetryStrategy != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, exponentialRetryStrategy);
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
            if (constantRetryStrategy != null)
            {
                codedoutputbytebuffernano.writeMessage(1, constantRetryStrategy);
            }
            if (exponentialRetryStrategy != null)
            {
                codedoutputbytebuffernano.writeMessage(2, exponentialRetryStrategy);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientRetryStrategy()
        {
            clear();
        }
    }

    public static final class ClientRetryStrategy.ConstantRetryStrategy extends ExtendableMessageNano
    {

        public Long delayMillis;
        public Integer totalNumberOfAttempts;

        private ClientRetryStrategy.ConstantRetryStrategy clear()
        {
            totalNumberOfAttempts = null;
            delayMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientRetryStrategy.ConstantRetryStrategy mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    totalNumberOfAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    delayMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (totalNumberOfAttempts != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, totalNumberOfAttempts.intValue());
            }
            j = i;
            if (delayMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, delayMillis.longValue());
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
            if (totalNumberOfAttempts != null)
            {
                codedoutputbytebuffernano.writeInt32(1, totalNumberOfAttempts.intValue());
            }
            if (delayMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, delayMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientRetryStrategy.ConstantRetryStrategy()
        {
            clear();
        }
    }

    public static final class ClientRetryStrategy.ExponentialRetryStrategy extends ExtendableMessageNano
    {

        public Double backoffFactor;
        public Long initialDelayMillis;
        public Integer totalNumberOfAttempts;

        private ClientRetryStrategy.ExponentialRetryStrategy clear()
        {
            totalNumberOfAttempts = null;
            initialDelayMillis = null;
            backoffFactor = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ClientRetryStrategy.ExponentialRetryStrategy mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    totalNumberOfAttempts = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 16: // '\020'
                    initialDelayMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;

                case 25: // '\031'
                    backoffFactor = Double.valueOf(codedinputbytebuffernano.readDouble());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (totalNumberOfAttempts != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, totalNumberOfAttempts.intValue());
            }
            j = i;
            if (initialDelayMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, initialDelayMillis.longValue());
            }
            i = j;
            if (backoffFactor != null)
            {
                i = j + CodedOutputByteBufferNano.computeDoubleSize(3, backoffFactor.doubleValue());
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
            if (totalNumberOfAttempts != null)
            {
                codedoutputbytebuffernano.writeInt32(1, totalNumberOfAttempts.intValue());
            }
            if (initialDelayMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, initialDelayMillis.longValue());
            }
            if (backoffFactor != null)
            {
                codedoutputbytebuffernano.writeDouble(3, backoffFactor.doubleValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientRetryStrategy.ExponentialRetryStrategy()
        {
            clear();
        }
    }

    public static final class FormConfiguration extends ExtendableMessageNano
    {

        public Integer formVersion;
        public NanoWalletWobl.LayoutContextParameters layoutContextParameters;

        private FormConfiguration clear()
        {
            formVersion = null;
            layoutContextParameters = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private FormConfiguration mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    formVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
                    break;

                case 18: // '\022'
                    if (layoutContextParameters == null)
                    {
                        layoutContextParameters = new NanoWalletWobl.LayoutContextParameters();
                    }
                    codedinputbytebuffernano.readMessage(layoutContextParameters);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (formVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, formVersion.intValue());
            }
            j = i;
            if (layoutContextParameters != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, layoutContextParameters);
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
            if (formVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(1, formVersion.intValue());
            }
            if (layoutContextParameters != null)
            {
                codedoutputbytebuffernano.writeMessage(2, layoutContextParameters);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FormConfiguration()
        {
            clear();
        }
    }

    public static final class GiftCardSyncRequest extends ExtendableMessageNano
    {

        private GiftCardSyncRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public GiftCardSyncRequest()
        {
            clear();
        }
    }

    public static final class GiftCardSyncResponse extends ExtendableMessageNano
    {

        public Integer syncStatus;

        private GiftCardSyncResponse clear()
        {
            syncStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GiftCardSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       32: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                syncStatus = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
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
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GiftCardSyncResponse()
        {
            clear();
        }
    }

    public static final class GlobalResourceSyncRequest extends ExtendableMessageNano
    {

        public Long clientGlobalResourcesFingerprint;
        public Integer transportVersion;

        private GlobalResourceSyncRequest clear()
        {
            clientGlobalResourcesFingerprint = null;
            transportVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GlobalResourceSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
            clientGlobalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L5
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(j);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientGlobalResourcesFingerprint != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, clientGlobalResourcesFingerprint.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
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
            if (clientGlobalResourcesFingerprint != null)
            {
                codedoutputbytebuffernano.writeInt64(1, clientGlobalResourcesFingerprint.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GlobalResourceSyncRequest()
        {
            clear();
        }
    }

    public static final class GlobalResourceSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.GlobalResources globalResources;
        public Long globalResourcesFingerprint;
        public Integer syncStatus;
        public String syncStatusDetails;
        public Integer transportVersion;

        private GlobalResourceSyncResponse clear()
        {
            globalResources = null;
            globalResourcesFingerprint = null;
            transportVersion = null;
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private GlobalResourceSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 104
        //                       24: 174
        //                       32: 188
        //                       42: 242;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            if (globalResources == null)
            {
                globalResources = new NanoWalletEntities.GlobalResources();
            }
            codedinputbytebuffernano.readMessage(globalResources);
              goto _L8
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            globalResourcesFingerprint = Long.valueOf(codedinputbytebuffernano.readInt64());
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
                syncStatus = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (globalResources != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, globalResources);
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
            }
            i = j;
            if (globalResourcesFingerprint != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, globalResourcesFingerprint.longValue());
            }
            j = i;
            if (syncStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
            }
            i = j;
            if (syncStatusDetails != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
            if (globalResources != null)
            {
                codedoutputbytebuffernano.writeMessage(1, globalResources);
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
            }
            if (globalResourcesFingerprint != null)
            {
                codedoutputbytebuffernano.writeInt64(3, globalResourcesFingerprint.longValue());
            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GlobalResourceSyncResponse()
        {
            clear();
        }
    }

    public static final class InstrumentSyncRequest extends ExtendableMessageNano
    {

        public NanoWalletEntities.Credential entities[];
        public Integer transportVersion;

        private InstrumentSyncRequest clear()
        {
            entities = NanoWalletEntities.Credential.emptyArray();
            transportVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InstrumentSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       10: 51
        //                       16: 175;
               goto _L1 _L2 _L3 _L4
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.Credential acredential[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            acredential = new NanoWalletEntities.Credential[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, acredential, 0, j);
                l = j;
            }
            for (; l < acredential.length - 1; l++)
            {
                acredential[l] = new NanoWalletEntities.Credential();
                codedinputbytebuffernano.readMessage(acredential[l]);
                codedinputbytebuffernano.readTag();
            }

            acredential[l] = new NanoWalletEntities.Credential();
            codedinputbytebuffernano.readMessage(acredential[l]);
            entities = acredential;
              goto _L5
_L4:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            if (true) goto _L5; else goto _L6
_L6:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.Credential credential = entities[k];
                        j = i;
                        if (credential != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, credential);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (transportVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.Credential credential = entities[i];
                    if (credential != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, credential);
                    }
                }

            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InstrumentSyncRequest()
        {
            clear();
        }
    }

    public static final class InstrumentSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.Credential entities[];
        public Integer serverOverride;
        public Integer syncStatus;
        public String syncStatusDetails;
        public Integer transportVersion;

        private InstrumentSyncResponse clear()
        {
            entities = NanoWalletEntities.Credential.emptyArray();
            transportVersion = null;
            serverOverride = null;
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private InstrumentSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 199
        //                       24: 270
        //                       32: 310
        //                       42: 366;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.Credential acredential[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            acredential = new NanoWalletEntities.Credential[j + j1];
            j1 = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, acredential, 0, j);
                j1 = j;
            }
            for (; j1 < acredential.length - 1; j1++)
            {
                acredential[j1] = new NanoWalletEntities.Credential();
                codedinputbytebuffernano.readMessage(acredential[j1]);
                codedinputbytebuffernano.readTag();
            }

            acredential[j1] = new NanoWalletEntities.Credential();
            codedinputbytebuffernano.readMessage(acredential[j1]);
            entities = acredential;
              goto _L8
_L4:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 1: // '\001'
                serverOverride = Integer.valueOf(l);
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
                syncStatus = Integer.valueOf(i1);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.Credential credential = entities[k];
                        j = i;
                        if (credential != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, credential);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (transportVersion != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, transportVersion.intValue());
            }
            j = i;
            if (serverOverride != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, serverOverride.intValue());
            }
            i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
            }
            j = i;
            if (syncStatusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.Credential credential = entities[i];
                    if (credential != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, credential);
                    }
                }

            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(2, transportVersion.intValue());
            }
            if (serverOverride != null)
            {
                codedoutputbytebuffernano.writeInt32(3, serverOverride.intValue());
            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public InstrumentSyncResponse()
        {
            clear();
        }
    }

    public static final class LoyaltyCardSyncRequest extends ExtendableMessageNano
    {

        private LoyaltyCardSyncRequest clear()
        {
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoyaltyCardSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L3:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 33;
               goto _L1 _L2
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            return mergeFrom(codedinputbytebuffernano);
        }

        public LoyaltyCardSyncRequest()
        {
            clear();
        }
    }

    public static final class LoyaltyCardSyncResponse extends ExtendableMessageNano
    {

        public Integer syncStatus;

        private LoyaltyCardSyncResponse clear()
        {
            syncStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private LoyaltyCardSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 41
        //                       32: 43;
               goto _L1 _L2 _L3
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                syncStatus = Integer.valueOf(j);
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
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
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LoyaltyCardSyncResponse()
        {
            clear();
        }
    }

    public static final class MultiSyncRequest extends ExtendableMessageNano
    {

        public GiftCardSyncRequest giftCardSyncRequest;
        public GlobalResourceSyncRequest globalResourceSyncRequest;
        public InstrumentSyncRequest instrumentSyncRequest;
        public LoyaltyCardSyncRequest loyaltyCardSyncRequest;
        public NfcTapEventSyncRequest nfcTapEventSyncRequest;
        public OfferSyncRequest offerSyncRequest;
        public ProvisioningInfoSyncRequest provisioningInfoSyncRequest;
        public ProxyCardSyncRequest proxyCardSyncRequest;

        private MultiSyncRequest clear()
        {
            offerSyncRequest = null;
            nfcTapEventSyncRequest = null;
            globalResourceSyncRequest = null;
            instrumentSyncRequest = null;
            giftCardSyncRequest = null;
            loyaltyCardSyncRequest = null;
            provisioningInfoSyncRequest = null;
            proxyCardSyncRequest = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private MultiSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (offerSyncRequest == null)
                    {
                        offerSyncRequest = new OfferSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(offerSyncRequest);
                    break;

                case 18: // '\022'
                    if (nfcTapEventSyncRequest == null)
                    {
                        nfcTapEventSyncRequest = new NfcTapEventSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(nfcTapEventSyncRequest);
                    break;

                case 26: // '\032'
                    if (globalResourceSyncRequest == null)
                    {
                        globalResourceSyncRequest = new GlobalResourceSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(globalResourceSyncRequest);
                    break;

                case 34: // '"'
                    if (instrumentSyncRequest == null)
                    {
                        instrumentSyncRequest = new InstrumentSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(instrumentSyncRequest);
                    break;

                case 42: // '*'
                    if (giftCardSyncRequest == null)
                    {
                        giftCardSyncRequest = new GiftCardSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(giftCardSyncRequest);
                    break;

                case 50: // '2'
                    if (loyaltyCardSyncRequest == null)
                    {
                        loyaltyCardSyncRequest = new LoyaltyCardSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyCardSyncRequest);
                    break;

                case 66: // 'B'
                    if (provisioningInfoSyncRequest == null)
                    {
                        provisioningInfoSyncRequest = new ProvisioningInfoSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(provisioningInfoSyncRequest);
                    break;

                case 74: // 'J'
                    if (proxyCardSyncRequest == null)
                    {
                        proxyCardSyncRequest = new ProxyCardSyncRequest();
                    }
                    codedinputbytebuffernano.readMessage(proxyCardSyncRequest);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (offerSyncRequest != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, offerSyncRequest);
            }
            j = i;
            if (nfcTapEventSyncRequest != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, nfcTapEventSyncRequest);
            }
            i = j;
            if (globalResourceSyncRequest != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, globalResourceSyncRequest);
            }
            j = i;
            if (instrumentSyncRequest != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, instrumentSyncRequest);
            }
            i = j;
            if (giftCardSyncRequest != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, giftCardSyncRequest);
            }
            j = i;
            if (loyaltyCardSyncRequest != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, loyaltyCardSyncRequest);
            }
            i = j;
            if (provisioningInfoSyncRequest != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(8, provisioningInfoSyncRequest);
            }
            j = i;
            if (proxyCardSyncRequest != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(9, proxyCardSyncRequest);
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
            if (offerSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(1, offerSyncRequest);
            }
            if (nfcTapEventSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(2, nfcTapEventSyncRequest);
            }
            if (globalResourceSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(3, globalResourceSyncRequest);
            }
            if (instrumentSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(4, instrumentSyncRequest);
            }
            if (giftCardSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(5, giftCardSyncRequest);
            }
            if (loyaltyCardSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(6, loyaltyCardSyncRequest);
            }
            if (provisioningInfoSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(8, provisioningInfoSyncRequest);
            }
            if (proxyCardSyncRequest != null)
            {
                codedoutputbytebuffernano.writeMessage(9, proxyCardSyncRequest);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MultiSyncRequest()
        {
            clear();
        }
    }

    public static final class MultiSyncResponse extends ExtendableMessageNano
    {

        public GiftCardSyncResponse giftCardSyncResponse;
        public GlobalResourceSyncResponse globalResourceSyncResponse;
        public InstrumentSyncResponse instrumentSyncResponse;
        public LoyaltyCardSyncResponse loyaltyCardSyncResponse;
        public NfcTapEventSyncResponse nfcTapEventSyncResponse;
        public OfferSyncResponse offerSyncResponse;
        public ProvisioningInfoSyncResponse provisioningInfoSyncResponse;
        public ProxyCardSyncResponse proxyCardSyncResponse;

        private MultiSyncResponse clear()
        {
            offerSyncResponse = null;
            nfcTapEventSyncResponse = null;
            globalResourceSyncResponse = null;
            instrumentSyncResponse = null;
            giftCardSyncResponse = null;
            loyaltyCardSyncResponse = null;
            provisioningInfoSyncResponse = null;
            proxyCardSyncResponse = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private MultiSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (offerSyncResponse == null)
                    {
                        offerSyncResponse = new OfferSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(offerSyncResponse);
                    break;

                case 18: // '\022'
                    if (nfcTapEventSyncResponse == null)
                    {
                        nfcTapEventSyncResponse = new NfcTapEventSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(nfcTapEventSyncResponse);
                    break;

                case 26: // '\032'
                    if (globalResourceSyncResponse == null)
                    {
                        globalResourceSyncResponse = new GlobalResourceSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(globalResourceSyncResponse);
                    break;

                case 34: // '"'
                    if (instrumentSyncResponse == null)
                    {
                        instrumentSyncResponse = new InstrumentSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(instrumentSyncResponse);
                    break;

                case 42: // '*'
                    if (giftCardSyncResponse == null)
                    {
                        giftCardSyncResponse = new GiftCardSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(giftCardSyncResponse);
                    break;

                case 50: // '2'
                    if (loyaltyCardSyncResponse == null)
                    {
                        loyaltyCardSyncResponse = new LoyaltyCardSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(loyaltyCardSyncResponse);
                    break;

                case 66: // 'B'
                    if (provisioningInfoSyncResponse == null)
                    {
                        provisioningInfoSyncResponse = new ProvisioningInfoSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(provisioningInfoSyncResponse);
                    break;

                case 74: // 'J'
                    if (proxyCardSyncResponse == null)
                    {
                        proxyCardSyncResponse = new ProxyCardSyncResponse();
                    }
                    codedinputbytebuffernano.readMessage(proxyCardSyncResponse);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (offerSyncResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, offerSyncResponse);
            }
            j = i;
            if (nfcTapEventSyncResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, nfcTapEventSyncResponse);
            }
            i = j;
            if (globalResourceSyncResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, globalResourceSyncResponse);
            }
            j = i;
            if (instrumentSyncResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, instrumentSyncResponse);
            }
            i = j;
            if (giftCardSyncResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, giftCardSyncResponse);
            }
            j = i;
            if (loyaltyCardSyncResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, loyaltyCardSyncResponse);
            }
            i = j;
            if (provisioningInfoSyncResponse != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(8, provisioningInfoSyncResponse);
            }
            j = i;
            if (proxyCardSyncResponse != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(9, proxyCardSyncResponse);
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
            if (offerSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(1, offerSyncResponse);
            }
            if (nfcTapEventSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(2, nfcTapEventSyncResponse);
            }
            if (globalResourceSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(3, globalResourceSyncResponse);
            }
            if (instrumentSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(4, instrumentSyncResponse);
            }
            if (giftCardSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(5, giftCardSyncResponse);
            }
            if (loyaltyCardSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(6, loyaltyCardSyncResponse);
            }
            if (provisioningInfoSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(8, provisioningInfoSyncResponse);
            }
            if (proxyCardSyncResponse != null)
            {
                codedoutputbytebuffernano.writeMessage(9, proxyCardSyncResponse);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public MultiSyncResponse()
        {
            clear();
        }
    }

    public static final class NfcTapEventSyncRequest extends ExtendableMessageNano
    {

        public NanoWalletEntities.NfcTapEvent entities[];
        public Long lastSyncGenerationNumber;
        public Integer transportVersion;

        private NfcTapEventSyncRequest clear()
        {
            entities = NanoWalletEntities.NfcTapEvent.emptyArray();
            lastSyncGenerationNumber = null;
            transportVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private NfcTapEventSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 183
        //                       24: 197;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.NfcTapEvent anfctapevent[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            anfctapevent = new NanoWalletEntities.NfcTapEvent[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, anfctapevent, 0, j);
                l = j;
            }
            for (; l < anfctapevent.length - 1; l++)
            {
                anfctapevent[l] = new NanoWalletEntities.NfcTapEvent();
                codedinputbytebuffernano.readMessage(anfctapevent[l]);
                codedinputbytebuffernano.readTag();
            }

            anfctapevent[l] = new NanoWalletEntities.NfcTapEvent();
            codedinputbytebuffernano.readMessage(anfctapevent[l]);
            entities = anfctapevent;
              goto _L6
_L4:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L6
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.NfcTapEvent nfctapevent = entities[k];
                        j = i;
                        if (nfctapevent != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, nfctapevent);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.NfcTapEvent nfctapevent = entities[i];
                    if (nfctapevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, nfctapevent);
                    }
                }

            }
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NfcTapEventSyncRequest()
        {
            clear();
        }
    }

    public static final class NfcTapEventSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.NfcTapEvent entities[];
        public Long lastSyncGenerationNumber;
        public Integer syncStatus;
        public String syncStatusDetails;
        public Integer transportVersion;

        private NfcTapEventSyncResponse clear()
        {
            entities = NanoWalletEntities.NfcTapEvent.emptyArray();
            lastSyncGenerationNumber = null;
            transportVersion = null;
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private NfcTapEventSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 199
        //                       24: 213
        //                       32: 282
        //                       42: 338;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.NfcTapEvent anfctapevent[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            anfctapevent = new NanoWalletEntities.NfcTapEvent[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, anfctapevent, 0, j);
                i1 = j;
            }
            for (; i1 < anfctapevent.length - 1; i1++)
            {
                anfctapevent[i1] = new NanoWalletEntities.NfcTapEvent();
                codedinputbytebuffernano.readMessage(anfctapevent[i1]);
                codedinputbytebuffernano.readTag();
            }

            anfctapevent[i1] = new NanoWalletEntities.NfcTapEvent();
            codedinputbytebuffernano.readMessage(anfctapevent[i1]);
            entities = anfctapevent;
              goto _L8
_L4:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L8
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                syncStatus = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.NfcTapEvent nfctapevent = entities[k];
                        j = i;
                        if (nfctapevent != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, nfctapevent);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
            }
            i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
            }
            j = i;
            if (syncStatusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.NfcTapEvent nfctapevent = entities[i];
                    if (nfctapevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, nfctapevent);
                    }
                }

            }
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public NfcTapEventSyncResponse()
        {
            clear();
        }
    }

    public static final class OfferSyncRequest extends ExtendableMessageNano
    {

        public NanoWalletEntities.Offer entities[];
        public Long lastSyncGenerationNumber;
        public Integer transportVersion;

        private OfferSyncRequest clear()
        {
            entities = NanoWalletEntities.Offer.emptyArray();
            lastSyncGenerationNumber = null;
            transportVersion = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private OfferSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       16: 183
        //                       24: 197;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.Offer aoffer[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            aoffer = new NanoWalletEntities.Offer[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, aoffer, 0, j);
                l = j;
            }
            for (; l < aoffer.length - 1; l++)
            {
                aoffer[l] = new NanoWalletEntities.Offer();
                codedinputbytebuffernano.readMessage(aoffer[l]);
                codedinputbytebuffernano.readTag();
            }

            aoffer[l] = new NanoWalletEntities.Offer();
            codedinputbytebuffernano.readMessage(aoffer[l]);
            entities = aoffer;
              goto _L6
_L4:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L6
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.Offer offer = entities[k];
                        j = i;
                        if (offer != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, offer);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.Offer offer = entities[i];
                    if (offer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, offer);
                    }
                }

            }
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OfferSyncRequest()
        {
            clear();
        }
    }

    public static final class OfferSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.Offer entities[];
        public Long lastSyncGenerationNumber;
        public Integer syncStatus;
        public String syncStatusDetails;
        public Integer transportVersion;

        private OfferSyncResponse clear()
        {
            entities = NanoWalletEntities.Offer.emptyArray();
            lastSyncGenerationNumber = null;
            transportVersion = null;
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private OfferSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 199
        //                       24: 213
        //                       32: 282
        //                       42: 338;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.Offer aoffer[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            aoffer = new NanoWalletEntities.Offer[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, aoffer, 0, j);
                i1 = j;
            }
            for (; i1 < aoffer.length - 1; i1++)
            {
                aoffer[i1] = new NanoWalletEntities.Offer();
                codedinputbytebuffernano.readMessage(aoffer[i1]);
                codedinputbytebuffernano.readTag();
            }

            aoffer[i1] = new NanoWalletEntities.Offer();
            codedinputbytebuffernano.readMessage(aoffer[i1]);
            entities = aoffer;
              goto _L8
_L4:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L8
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                syncStatus = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.Offer offer = entities[k];
                        j = i;
                        if (offer != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, offer);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
            }
            i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
            }
            j = i;
            if (syncStatusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.Offer offer = entities[i];
                    if (offer != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, offer);
                    }
                }

            }
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public OfferSyncResponse()
        {
            clear();
        }
    }

    public static final class ProfileToken extends ExtendableMessageNano
    {

        public byte payload[];
        public byte signature[];

        private ProfileToken clear()
        {
            signature = null;
            payload = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProfileToken mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    signature = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    payload = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (signature != null)
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, signature);
            }
            j = i;
            if (payload != null)
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(2, payload);
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
            if (signature != null)
            {
                codedoutputbytebuffernano.writeBytes(1, signature);
            }
            if (payload != null)
            {
                codedoutputbytebuffernano.writeBytes(2, payload);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProfileToken()
        {
            clear();
        }
    }

    public static final class ProvisioningInfoSyncRequest extends ExtendableMessageNano
    {

        public String encodedCplc;
        public Long lastSyncGenerationNumber;
        public Integer transportVersion;

        private ProvisioningInfoSyncRequest clear()
        {
            lastSyncGenerationNumber = null;
            transportVersion = null;
            encodedCplc = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProvisioningInfoSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       16: 59
        //                       24: 73
        //                       34: 142;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L6
_L4:
            int j = codedinputbytebuffernano.readInt32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            encodedCplc = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
            }
            i = j;
            if (encodedCplc != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, encodedCplc);
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
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            if (encodedCplc != null)
            {
                codedoutputbytebuffernano.writeString(4, encodedCplc);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProvisioningInfoSyncRequest()
        {
            clear();
        }
    }

    public static final class ProvisioningInfoSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.ProvisioningInfo entities[];
        public Long lastSyncGenerationNumber;
        public Integer syncStatus;
        public String syncStatusDetails;
        public Integer transportVersion;

        private ProvisioningInfoSyncResponse clear()
        {
            entities = NanoWalletEntities.ProvisioningInfo.emptyArray();
            lastSyncGenerationNumber = null;
            transportVersion = null;
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProvisioningInfoSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 73
        //                       10: 75
        //                       16: 199
        //                       24: 213
        //                       32: 282
        //                       42: 338;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
_L2:
            return this;
_L3:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.ProvisioningInfo aprovisioninginfo[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            aprovisioninginfo = new NanoWalletEntities.ProvisioningInfo[j + i1];
            i1 = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, aprovisioninginfo, 0, j);
                i1 = j;
            }
            for (; i1 < aprovisioninginfo.length - 1; i1++)
            {
                aprovisioninginfo[i1] = new NanoWalletEntities.ProvisioningInfo();
                codedinputbytebuffernano.readMessage(aprovisioninginfo[i1]);
                codedinputbytebuffernano.readTag();
            }

            aprovisioninginfo[i1] = new NanoWalletEntities.ProvisioningInfo();
            codedinputbytebuffernano.readMessage(aprovisioninginfo[i1]);
            entities = aprovisioninginfo;
              goto _L8
_L4:
            lastSyncGenerationNumber = Long.valueOf(codedinputbytebuffernano.readInt64());
              goto _L8
_L5:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 4: // '\004'
            case 101: // 'e'
                transportVersion = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int l = codedinputbytebuffernano.readInt32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                syncStatus = Integer.valueOf(l);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L8; else goto _L9
_L9:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.ProvisioningInfo provisioninginfo = entities[k];
                        j = i;
                        if (provisioninginfo != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, provisioninginfo);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (lastSyncGenerationNumber != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, lastSyncGenerationNumber.longValue());
            }
            j = i;
            if (transportVersion != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(3, transportVersion.intValue());
            }
            i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(4, syncStatus.intValue());
            }
            j = i;
            if (syncStatusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, syncStatusDetails);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.ProvisioningInfo provisioninginfo = entities[i];
                    if (provisioninginfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, provisioninginfo);
                    }
                }

            }
            if (lastSyncGenerationNumber != null)
            {
                codedoutputbytebuffernano.writeInt64(2, lastSyncGenerationNumber.longValue());
            }
            if (transportVersion != null)
            {
                codedoutputbytebuffernano.writeInt32(3, transportVersion.intValue());
            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(4, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(5, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProvisioningInfoSyncResponse()
        {
            clear();
        }
    }

    public static final class ProxyCardSyncRequest extends ExtendableMessageNano
    {

        public NanoWalletShared.DeviceContext deviceContext;

        private ProxyCardSyncRequest clear()
        {
            deviceContext = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProxyCardSyncRequest mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (deviceContext == null)
                    {
                        deviceContext = new NanoWalletShared.DeviceContext();
                    }
                    codedinputbytebuffernano.readMessage(deviceContext);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (deviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, deviceContext);
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
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(1, deviceContext);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyCardSyncRequest()
        {
            clear();
        }
    }

    public static final class ProxyCardSyncResponse extends ExtendableMessageNano
    {

        public NanoWalletEntities.ProxyCard entities[];
        public Integer syncStatus;
        public String syncStatusDetails;

        private ProxyCardSyncResponse clear()
        {
            entities = NanoWalletEntities.ProxyCard.emptyArray();
            syncStatus = null;
            syncStatusDetails = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ProxyCardSyncResponse mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       10: 59
        //                       24: 183
        //                       34: 238;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
            NanoWalletEntities.ProxyCard aproxycard[];
            int j;
            if (entities == null)
            {
                j = 0;
            } else
            {
                j = entities.length;
            }
            aproxycard = new NanoWalletEntities.ProxyCard[j + l];
            l = j;
            if (j != 0)
            {
                System.arraycopy(entities, 0, aproxycard, 0, j);
                l = j;
            }
            for (; l < aproxycard.length - 1; l++)
            {
                aproxycard[l] = new NanoWalletEntities.ProxyCard();
                codedinputbytebuffernano.readMessage(aproxycard[l]);
                codedinputbytebuffernano.readTag();
            }

            aproxycard[l] = new NanoWalletEntities.ProxyCard();
            codedinputbytebuffernano.readMessage(aproxycard[l]);
            entities = aproxycard;
              goto _L6
_L4:
            int k = codedinputbytebuffernano.readInt32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                syncStatus = Integer.valueOf(k);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            syncStatusDetails = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (entities != null)
            {
                j = i;
                if (entities.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= entities.length)
                        {
                            break;
                        }
                        NanoWalletEntities.ProxyCard proxycard = entities[k];
                        j = i;
                        if (proxycard != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, proxycard);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (syncStatus != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, syncStatus.intValue());
            }
            j = i;
            if (syncStatusDetails != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, syncStatusDetails);
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
            if (entities != null && entities.length > 0)
            {
                for (int i = 0; i < entities.length; i++)
                {
                    NanoWalletEntities.ProxyCard proxycard = entities[i];
                    if (proxycard != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, proxycard);
                    }
                }

            }
            if (syncStatus != null)
            {
                codedoutputbytebuffernano.writeInt32(3, syncStatus.intValue());
            }
            if (syncStatusDetails != null)
            {
                codedoutputbytebuffernano.writeString(4, syncStatusDetails);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ProxyCardSyncResponse()
        {
            clear();
        }
    }

    public static final class RequestMetadata extends ExtendableMessageNano
    {

        public String buildIdentifier;
        public ClientCapabilities capabilities;
        public NanoWalletShared.DeviceContext deviceContext;
        public NanoWalletEntities.PinToken pinToken;
        public ProfileToken profileToken;
        public NanoWalletShared.WalletContext walletContext;

        private RequestMetadata clear()
        {
            deviceContext = null;
            walletContext = null;
            capabilities = null;
            pinToken = null;
            profileToken = null;
            buildIdentifier = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RequestMetadata mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (deviceContext == null)
                    {
                        deviceContext = new NanoWalletShared.DeviceContext();
                    }
                    codedinputbytebuffernano.readMessage(deviceContext);
                    break;

                case 18: // '\022'
                    if (walletContext == null)
                    {
                        walletContext = new NanoWalletShared.WalletContext();
                    }
                    codedinputbytebuffernano.readMessage(walletContext);
                    break;

                case 26: // '\032'
                    if (capabilities == null)
                    {
                        capabilities = new ClientCapabilities();
                    }
                    codedinputbytebuffernano.readMessage(capabilities);
                    break;

                case 34: // '"'
                    if (pinToken == null)
                    {
                        pinToken = new NanoWalletEntities.PinToken();
                    }
                    codedinputbytebuffernano.readMessage(pinToken);
                    break;

                case 42: // '*'
                    if (profileToken == null)
                    {
                        profileToken = new ProfileToken();
                    }
                    codedinputbytebuffernano.readMessage(profileToken);
                    break;

                case 50: // '2'
                    buildIdentifier = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (deviceContext != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, deviceContext);
            }
            j = i;
            if (walletContext != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, walletContext);
            }
            i = j;
            if (capabilities != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, capabilities);
            }
            j = i;
            if (pinToken != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, pinToken);
            }
            i = j;
            if (profileToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, profileToken);
            }
            j = i;
            if (buildIdentifier != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, buildIdentifier);
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
            if (deviceContext != null)
            {
                codedoutputbytebuffernano.writeMessage(1, deviceContext);
            }
            if (walletContext != null)
            {
                codedoutputbytebuffernano.writeMessage(2, walletContext);
            }
            if (capabilities != null)
            {
                codedoutputbytebuffernano.writeMessage(3, capabilities);
            }
            if (pinToken != null)
            {
                codedoutputbytebuffernano.writeMessage(4, pinToken);
            }
            if (profileToken != null)
            {
                codedoutputbytebuffernano.writeMessage(5, profileToken);
            }
            if (buildIdentifier != null)
            {
                codedoutputbytebuffernano.writeString(6, buildIdentifier);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RequestMetadata()
        {
            clear();
        }
    }

    public static final class RequestRenderInfo extends ExtendableMessageNano
    {

        public NanoWalletWobl.LayoutContextParameters contextParameters;
        public String entrypointNames[];

        private RequestRenderInfo clear()
        {
            contextParameters = null;
            entrypointNames = WireFormatNano.EMPTY_STRING_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private RequestRenderInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    if (contextParameters == null)
                    {
                        contextParameters = new NanoWalletWobl.LayoutContextParameters();
                    }
                    codedinputbytebuffernano.readMessage(contextParameters);
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as[];
                    int j;
                    if (entrypointNames == null)
                    {
                        j = 0;
                    } else
                    {
                        j = entrypointNames.length;
                    }
                    as = new String[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(entrypointNames, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    entrypointNames = as;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (contextParameters != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, contextParameters);
            }
            j = i;
            if (entrypointNames != null)
            {
                j = i;
                if (entrypointNames.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < entrypointNames.length;)
                    {
                        String s = entrypointNames[j];
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
            if (contextParameters != null)
            {
                codedoutputbytebuffernano.writeMessage(1, contextParameters);
            }
            if (entrypointNames != null && entrypointNames.length > 0)
            {
                for (int i = 0; i < entrypointNames.length; i++)
                {
                    String s = entrypointNames[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RequestRenderInfo()
        {
            clear();
        }
    }

    public static final class ResponseMetadata extends ExtendableMessageNano
    {

        public ProfileToken profileToken;
        public RejectedRequestInfo rejections[];

        private ResponseMetadata clear()
        {
            rejections = RejectedRequestInfo.emptyArray();
            profileToken = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private ResponseMetadata mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    RejectedRequestInfo arejectedrequestinfo[];
                    int j;
                    if (rejections == null)
                    {
                        j = 0;
                    } else
                    {
                        j = rejections.length;
                    }
                    arejectedrequestinfo = new RejectedRequestInfo[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(rejections, 0, arejectedrequestinfo, 0, j);
                        k = j;
                    }
                    for (; k < arejectedrequestinfo.length - 1; k++)
                    {
                        arejectedrequestinfo[k] = new RejectedRequestInfo();
                        codedinputbytebuffernano.readMessage(arejectedrequestinfo[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    arejectedrequestinfo[k] = new RejectedRequestInfo();
                    codedinputbytebuffernano.readMessage(arejectedrequestinfo[k]);
                    rejections = arejectedrequestinfo;
                    break;

                case 26: // '\032'
                    if (profileToken == null)
                    {
                        profileToken = new ProfileToken();
                    }
                    codedinputbytebuffernano.readMessage(profileToken);
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (rejections != null)
            {
                j = i;
                if (rejections.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= rejections.length)
                        {
                            break;
                        }
                        RejectedRequestInfo rejectedrequestinfo = rejections[k];
                        j = i;
                        if (rejectedrequestinfo != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, rejectedrequestinfo);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (profileToken != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, profileToken);
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
            if (rejections != null && rejections.length > 0)
            {
                for (int i = 0; i < rejections.length; i++)
                {
                    RejectedRequestInfo rejectedrequestinfo = rejections[i];
                    if (rejectedrequestinfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, rejectedrequestinfo);
                    }
                }

            }
            if (profileToken != null)
            {
                codedoutputbytebuffernano.writeMessage(3, profileToken);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ResponseMetadata()
        {
            clear();
        }
    }

    public static final class ResponseMetadata.RejectedRequestInfo extends ExtendableMessageNano
    {

        private static volatile ResponseMetadata.RejectedRequestInfo _emptyArray[];
        public NanoWalletError.CallError callError;
        public NanoWalletEntities.KycStatus kycStatus;
        public NanoWalletEntities.LatestLegalDocument latestLegalDocument;
        public Integer reason;

        private ResponseMetadata.RejectedRequestInfo clear()
        {
            reason = null;
            callError = null;
            latestLegalDocument = null;
            kycStatus = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static ResponseMetadata.RejectedRequestInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new ResponseMetadata.RejectedRequestInfo[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private ResponseMetadata.RejectedRequestInfo mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 65
        //                       8: 67
        //                       18: 138
        //                       26: 167
        //                       34: 196;
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
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                reason = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (callError == null)
            {
                callError = new NanoWalletError.CallError();
            }
            codedinputbytebuffernano.readMessage(callError);
            continue; /* Loop/switch isn't completed */
_L5:
            if (latestLegalDocument == null)
            {
                latestLegalDocument = new NanoWalletEntities.LatestLegalDocument();
            }
            codedinputbytebuffernano.readMessage(latestLegalDocument);
            continue; /* Loop/switch isn't completed */
_L6:
            if (kycStatus == null)
            {
                kycStatus = new NanoWalletEntities.KycStatus();
            }
            codedinputbytebuffernano.readMessage(kycStatus);
            if (true) goto _L7; else goto _L8
_L8:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (reason != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, reason.intValue());
            }
            j = i;
            if (callError != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, callError);
            }
            i = j;
            if (latestLegalDocument != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, latestLegalDocument);
            }
            j = i;
            if (kycStatus != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, kycStatus);
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
            if (reason != null)
            {
                codedoutputbytebuffernano.writeInt32(1, reason.intValue());
            }
            if (callError != null)
            {
                codedoutputbytebuffernano.writeMessage(2, callError);
            }
            if (latestLegalDocument != null)
            {
                codedoutputbytebuffernano.writeMessage(3, latestLegalDocument);
            }
            if (kycStatus != null)
            {
                codedoutputbytebuffernano.writeMessage(4, kycStatus);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ResponseMetadata.RejectedRequestInfo()
        {
            clear();
        }
    }

    public static final class SystemNotificationBundle extends ExtendableMessageNano
    {

        public SystemNotification notification[];

        private SystemNotificationBundle clear()
        {
            notification = SystemNotification.emptyArray();
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SystemNotificationBundle mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    SystemNotification asystemnotification[];
                    int j;
                    if (notification == null)
                    {
                        j = 0;
                    } else
                    {
                        j = notification.length;
                    }
                    asystemnotification = new SystemNotification[j + k];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(notification, 0, asystemnotification, 0, j);
                        k = j;
                    }
                    for (; k < asystemnotification.length - 1; k++)
                    {
                        asystemnotification[k] = new SystemNotification();
                        codedinputbytebuffernano.readMessage(asystemnotification[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    asystemnotification[k] = new SystemNotification();
                    codedinputbytebuffernano.readMessage(asystemnotification[k]);
                    notification = asystemnotification;
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (notification != null)
            {
                k = i;
                if (notification.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= notification.length)
                        {
                            break;
                        }
                        SystemNotification systemnotification = notification[j];
                        k = i;
                        if (systemnotification != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, systemnotification);
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
            if (notification != null && notification.length > 0)
            {
                for (int i = 0; i < notification.length; i++)
                {
                    SystemNotification systemnotification = notification[i];
                    if (systemnotification != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, systemnotification);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SystemNotificationBundle()
        {
            clear();
        }
    }

    public static final class SystemNotificationBundle.SystemNotification extends ExtendableMessageNano
    {

        private static volatile SystemNotificationBundle.SystemNotification _emptyArray[];
        public AndroidSyncParams androidSyncParams;
        public FetchWobsDiffParams fetchWobsDiffParams;
        public Integer type;

        private SystemNotificationBundle.SystemNotification clear()
        {
            type = null;
            fetchWobsDiffParams = null;
            androidSyncParams = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static SystemNotificationBundle.SystemNotification[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new SystemNotificationBundle.SystemNotification[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private SystemNotificationBundle.SystemNotification mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       34: 130
        //                       42: 159;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
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
                type = Integer.valueOf(j);
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (fetchWobsDiffParams == null)
            {
                fetchWobsDiffParams = new FetchWobsDiffParams();
            }
            codedinputbytebuffernano.readMessage(fetchWobsDiffParams);
            continue; /* Loop/switch isn't completed */
_L5:
            if (androidSyncParams == null)
            {
                androidSyncParams = new AndroidSyncParams();
            }
            codedinputbytebuffernano.readMessage(androidSyncParams);
            if (true) goto _L6; else goto _L7
_L7:
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type.intValue());
            }
            j = i;
            if (fetchWobsDiffParams != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, fetchWobsDiffParams);
            }
            i = j;
            if (androidSyncParams != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, androidSyncParams);
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
            if (type != null)
            {
                codedoutputbytebuffernano.writeInt32(1, type.intValue());
            }
            if (fetchWobsDiffParams != null)
            {
                codedoutputbytebuffernano.writeMessage(4, fetchWobsDiffParams);
            }
            if (androidSyncParams != null)
            {
                codedoutputbytebuffernano.writeMessage(5, androidSyncParams);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SystemNotificationBundle.SystemNotification()
        {
            clear();
        }
    }

    public static final class SystemNotificationBundle.SystemNotification.AndroidSyncParams extends ExtendableMessageNano
    {

        public String entityName;
        public Long timestampMillis;

        private SystemNotificationBundle.SystemNotification.AndroidSyncParams clear()
        {
            entityName = null;
            timestampMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SystemNotificationBundle.SystemNotification.AndroidSyncParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    entityName = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    timestampMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (entityName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, entityName);
            }
            j = i;
            if (timestampMillis != null)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, timestampMillis.longValue());
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
            if (entityName != null)
            {
                codedoutputbytebuffernano.writeString(1, entityName);
            }
            if (timestampMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(2, timestampMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SystemNotificationBundle.SystemNotification.AndroidSyncParams()
        {
            clear();
        }
    }

    public static final class SystemNotificationBundle.SystemNotification.FetchWobsDiffParams extends ExtendableMessageNano
    {

        public Long updateTimeMillis;

        private SystemNotificationBundle.SystemNotification.FetchWobsDiffParams clear()
        {
            updateTimeMillis = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        private SystemNotificationBundle.SystemNotification.FetchWobsDiffParams mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    updateTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (updateTimeMillis != null)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, updateTimeMillis.longValue());
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
            if (updateTimeMillis != null)
            {
                codedoutputbytebuffernano.writeInt64(1, updateTimeMillis.longValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public SystemNotificationBundle.SystemNotification.FetchWobsDiffParams()
        {
            clear();
        }
    }

}
