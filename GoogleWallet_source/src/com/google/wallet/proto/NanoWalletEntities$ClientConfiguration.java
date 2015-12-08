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
    public static final class AppControlEntry extends ExtendableMessageNano
    {

        private static volatile AppControlEntry _emptyArray[];
        public String key;
        public String value;

        private AppControlEntry clear()
        {
            key = null;
            value = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static AppControlEntry[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new AppControlEntry[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private AppControlEntry mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    key = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    value = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (key != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, key);
            }
            j = i;
            if (value != null)
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
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
            if (key != null)
            {
                codedoutputbytebuffernano.writeString(1, key);
            }
            if (value != null)
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AppControlEntry()
        {
            clear();
        }
    }

    public static final class FeatureFlag extends ExtendableMessageNano
    {

        private static volatile FeatureFlag _emptyArray[];
        public String flagName;
        public Boolean flagValue;

        private FeatureFlag clear()
        {
            flagName = null;
            flagValue = null;
            unknownFieldData = null;
            cachedSize = -1;
            return this;
        }

        public static FeatureFlag[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new FeatureFlag[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private FeatureFlag mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
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
                    flagName = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    flagValue = Boolean.valueOf(codedinputbytebuffernano.readBool());
                    break;
                }
            } while (true);
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (flagName != null)
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, flagName);
            }
            j = i;
            if (flagValue != null)
            {
                j = i + CodedOutputByteBufferNano.computeBoolSize(2, flagValue.booleanValue());
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
            if (flagName != null)
            {
                codedoutputbytebuffernano.writeString(1, flagName);
            }
            if (flagValue != null)
            {
                codedoutputbytebuffernano.writeBool(2, flagValue.booleanValue());
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FeatureFlag()
        {
            clear();
        }
    }


    public analyticsInfo analyticsInfo;
    public AppControlEntry appControlEntries[];
    public Boolean enableApplyNow;
    public Boolean enableClientReceiptResolution;
    public Boolean enableCreateGiftCardOnCrossbar;
    public Boolean enableDeveloperBuildDetection;
    public Boolean enableP2P;
    public Boolean enableRootedPhoneDetection;
    public Boolean enableTapAndPayV2;
    public FeatureFlag featureFlags[];
    public FeatureFlag features;
    public Boolean isDogfood;

    private FeatureFlag clear()
    {
        featureFlags = FeatureFlag.emptyArray();
        appControlEntries = AppControlEntry.emptyArray();
        features = null;
        analyticsInfo = null;
        enableApplyNow = null;
        enableCreateGiftCardOnCrossbar = null;
        enableRootedPhoneDetection = null;
        enableP2P = null;
        enableClientReceiptResolution = null;
        enableDeveloperBuildDetection = null;
        isDogfood = null;
        enableTapAndPayV2 = null;
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

            case 16: // '\020'
                enableApplyNow = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 24: // '\030'
                enableCreateGiftCardOnCrossbar = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 32: // ' '
                enableRootedPhoneDetection = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 40: // '('
                enableP2P = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 48: // '0'
                enableClientReceiptResolution = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 56: // '8'
                enableDeveloperBuildDetection = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 64: // '@'
                isDogfood = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 72: // 'H'
                enableTapAndPayV2 = Boolean.valueOf(codedinputbytebuffernano.readBool());
                break;

            case 82: // 'R'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 82);
                FeatureFlag afeatureflag[];
                int j;
                if (featureFlags == null)
                {
                    j = 0;
                } else
                {
                    j = featureFlags.length;
                }
                afeatureflag = new FeatureFlag[j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(featureFlags, 0, afeatureflag, 0, j);
                    l = j;
                }
                for (; l < afeatureflag.length - 1; l++)
                {
                    afeatureflag[l] = new FeatureFlag();
                    codedinputbytebuffernano.readMessage(afeatureflag[l]);
                    codedinputbytebuffernano.readTag();
                }

                afeatureflag[l] = new FeatureFlag();
                codedinputbytebuffernano.readMessage(afeatureflag[l]);
                featureFlags = afeatureflag;
                break;

            case 90: // 'Z'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 90);
                AppControlEntry aappcontrolentry[];
                int k;
                if (appControlEntries == null)
                {
                    k = 0;
                } else
                {
                    k = appControlEntries.length;
                }
                aappcontrolentry = new AppControlEntry[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(appControlEntries, 0, aappcontrolentry, 0, k);
                    i1 = k;
                }
                for (; i1 < aappcontrolentry.length - 1; i1++)
                {
                    aappcontrolentry[i1] = new AppControlEntry();
                    codedinputbytebuffernano.readMessage(aappcontrolentry[i1]);
                    codedinputbytebuffernano.readTag();
                }

                aappcontrolentry[i1] = new AppControlEntry();
                codedinputbytebuffernano.readMessage(aappcontrolentry[i1]);
                appControlEntries = aappcontrolentry;
                break;

            case 98: // 'b'
                if (features == null)
                {
                    features = new features();
                }
                codedinputbytebuffernano.readMessage(features);
                break;

            case 106: // 'j'
                if (analyticsInfo == null)
                {
                    analyticsInfo = new >();
                }
                codedinputbytebuffernano.readMessage(analyticsInfo);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (enableApplyNow != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(2, enableApplyNow.booleanValue());
        }
        j = i;
        if (enableCreateGiftCardOnCrossbar != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(3, enableCreateGiftCardOnCrossbar.booleanValue());
        }
        i = j;
        if (enableRootedPhoneDetection != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(4, enableRootedPhoneDetection.booleanValue());
        }
        j = i;
        if (enableP2P != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(5, enableP2P.booleanValue());
        }
        i = j;
        if (enableClientReceiptResolution != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(6, enableClientReceiptResolution.booleanValue());
        }
        j = i;
        if (enableDeveloperBuildDetection != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(7, enableDeveloperBuildDetection.booleanValue());
        }
        i = j;
        if (isDogfood != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(8, isDogfood.booleanValue());
        }
        j = i;
        if (enableTapAndPayV2 != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(9, enableTapAndPayV2.booleanValue());
        }
        i = j;
        if (featureFlags != null)
        {
            i = j;
            if (featureFlags.length > 0)
            {
                int k = 0;
                do
                {
                    i = j;
                    if (k >= featureFlags.length)
                    {
                        break;
                    }
                    FeatureFlag featureflag = featureFlags[k];
                    i = j;
                    if (featureflag != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(10, featureflag);
                    }
                    k++;
                    j = i;
                } while (true);
            }
        }
        j = i;
        if (appControlEntries != null)
        {
            j = i;
            if (appControlEntries.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= appControlEntries.length)
                    {
                        break;
                    }
                    AppControlEntry appcontrolentry = appControlEntries[l];
                    j = i;
                    if (appcontrolentry != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(11, appcontrolentry);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (features != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(12, features);
        }
        j = i;
        if (analyticsInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(13, analyticsInfo);
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
        if (enableApplyNow != null)
        {
            codedoutputbytebuffernano.writeBool(2, enableApplyNow.booleanValue());
        }
        if (enableCreateGiftCardOnCrossbar != null)
        {
            codedoutputbytebuffernano.writeBool(3, enableCreateGiftCardOnCrossbar.booleanValue());
        }
        if (enableRootedPhoneDetection != null)
        {
            codedoutputbytebuffernano.writeBool(4, enableRootedPhoneDetection.booleanValue());
        }
        if (enableP2P != null)
        {
            codedoutputbytebuffernano.writeBool(5, enableP2P.booleanValue());
        }
        if (enableClientReceiptResolution != null)
        {
            codedoutputbytebuffernano.writeBool(6, enableClientReceiptResolution.booleanValue());
        }
        if (enableDeveloperBuildDetection != null)
        {
            codedoutputbytebuffernano.writeBool(7, enableDeveloperBuildDetection.booleanValue());
        }
        if (isDogfood != null)
        {
            codedoutputbytebuffernano.writeBool(8, isDogfood.booleanValue());
        }
        if (enableTapAndPayV2 != null)
        {
            codedoutputbytebuffernano.writeBool(9, enableTapAndPayV2.booleanValue());
        }
        if (featureFlags != null && featureFlags.length > 0)
        {
            for (int i = 0; i < featureFlags.length; i++)
            {
                FeatureFlag featureflag = featureFlags[i];
                if (featureflag != null)
                {
                    codedoutputbytebuffernano.writeMessage(10, featureflag);
                }
            }

        }
        if (appControlEntries != null && appControlEntries.length > 0)
        {
            for (int j = 0; j < appControlEntries.length; j++)
            {
                AppControlEntry appcontrolentry = appControlEntries[j];
                if (appcontrolentry != null)
                {
                    codedoutputbytebuffernano.writeMessage(11, appcontrolentry);
                }
            }

        }
        if (features != null)
        {
            codedoutputbytebuffernano.writeMessage(12, features);
        }
        if (analyticsInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(13, analyticsInfo);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public FeatureFlag.clear()
    {
        clear();
    }
}
