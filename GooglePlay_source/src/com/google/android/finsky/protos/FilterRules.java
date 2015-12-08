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

public interface FilterRules
{
    public static final class Availability extends MessageNano
    {

        public AvailabilityProblem availabilityProblem[];
        public boolean availableIfOwned;
        public FilterEvaluationInfo filterInfo;
        public boolean hasAvailableIfOwned;
        public boolean hasHidden;
        public boolean hasOfferType;
        public boolean hasRestriction;
        public boolean hidden;
        public Common.Install install[];
        public int offerType;
        public Ownership.OwnershipInfo ownershipInfo;
        public PerDeviceAvailabilityRestriction perDeviceAvailabilityRestriction[];
        public int restriction;
        public Rule rule;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (restriction == 1)
                {
                    i = j;
                    if (!hasRestriction)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, restriction);
            }
            int k;
label1:
            {
                if (offerType == 1)
                {
                    k = i;
                    if (!hasOfferType)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(6, offerType);
            }
label2:
            {
                i = k;
                if (rule != null)
                {
                    i = k + CodedOutputByteBufferNano.computeMessageSize(7, rule);
                }
                k = i;
                if (perDeviceAvailabilityRestriction != null)
                {
                    k = i;
                    if (perDeviceAvailabilityRestriction.length > 0)
                    {
                        int i1 = 0;
                        do
                        {
                            k = i;
                            if (i1 >= perDeviceAvailabilityRestriction.length)
                            {
                                break;
                            }
                            PerDeviceAvailabilityRestriction perdeviceavailabilityrestriction = perDeviceAvailabilityRestriction[i1];
                            k = i;
                            if (perdeviceavailabilityrestriction != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeGroupSize(9, perdeviceavailabilityrestriction);
                            }
                            i1++;
                            i = k;
                        } while (true);
                    }
                }
                if (!hasAvailableIfOwned)
                {
                    i = k;
                    if (!availableIfOwned)
                    {
                        break label2;
                    }
                }
                i = k + (CodedOutputByteBufferNano.computeTagSize(13) + 1);
            }
label3:
            {
                int l = i;
                if (install != null)
                {
                    l = i;
                    if (install.length > 0)
                    {
                        int j1 = 0;
                        do
                        {
                            l = i;
                            if (j1 >= install.length)
                            {
                                break;
                            }
                            Common.Install install1 = install[j1];
                            l = i;
                            if (install1 != null)
                            {
                                l = i + CodedOutputByteBufferNano.computeMessageSize(14, install1);
                            }
                            j1++;
                            i = l;
                        } while (true);
                    }
                }
                int k1 = l;
                if (filterInfo != null)
                {
                    k1 = l + CodedOutputByteBufferNano.computeMessageSize(16, filterInfo);
                }
                i = k1;
                if (ownershipInfo != null)
                {
                    i = k1 + CodedOutputByteBufferNano.computeMessageSize(17, ownershipInfo);
                }
                l = i;
                if (availabilityProblem != null)
                {
                    l = i;
                    if (availabilityProblem.length > 0)
                    {
                        int l1 = 0;
                        do
                        {
                            l = i;
                            if (l1 >= availabilityProblem.length)
                            {
                                break;
                            }
                            AvailabilityProblem availabilityproblem = availabilityProblem[l1];
                            l = i;
                            if (availabilityproblem != null)
                            {
                                l = i + CodedOutputByteBufferNano.computeMessageSize(18, availabilityproblem);
                            }
                            l1++;
                            i = l;
                        } while (true);
                    }
                }
                if (!hasHidden)
                {
                    i = l;
                    if (!hidden)
                    {
                        break label3;
                    }
                }
                i = l + (CodedOutputByteBufferNano.computeTagSize(21) + 1);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L13:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 11: default 104
        //                       0: 112
        //                       40: 114
        //                       48: 244
        //                       58: 328
        //                       75: 357
        //                       104: 485
        //                       114: 501
        //                       130: 625
        //                       138: 654
        //                       146: 683
        //                       168: 808;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
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
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
                restriction = j;
                hasRestriction = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
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
_L5:
            if (rule == null)
            {
                rule = new Rule();
            }
            codedinputbytebuffernano.readMessage(rule);
            continue; /* Loop/switch isn't completed */
_L6:
            int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 75);
            PerDeviceAvailabilityRestriction aperdeviceavailabilityrestriction[];
            int l;
            if (perDeviceAvailabilityRestriction == null)
            {
                l = 0;
            } else
            {
                l = perDeviceAvailabilityRestriction.length;
            }
            aperdeviceavailabilityrestriction = new PerDeviceAvailabilityRestriction[k1 + l];
            k1 = l;
            if (l != 0)
            {
                System.arraycopy(perDeviceAvailabilityRestriction, 0, aperdeviceavailabilityrestriction, 0, l);
                k1 = l;
            }
            for (; k1 < aperdeviceavailabilityrestriction.length - 1; k1++)
            {
                aperdeviceavailabilityrestriction[k1] = new PerDeviceAvailabilityRestriction();
                codedinputbytebuffernano.readGroup(aperdeviceavailabilityrestriction[k1], 9);
                codedinputbytebuffernano.readTag();
            }

            aperdeviceavailabilityrestriction[k1] = new PerDeviceAvailabilityRestriction();
            codedinputbytebuffernano.readGroup(aperdeviceavailabilityrestriction[k1], 9);
            perDeviceAvailabilityRestriction = aperdeviceavailabilityrestriction;
            continue; /* Loop/switch isn't completed */
_L7:
            availableIfOwned = codedinputbytebuffernano.readBool();
            hasAvailableIfOwned = true;
            continue; /* Loop/switch isn't completed */
_L8:
            int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 114);
            Common.Install ainstall[];
            int i1;
            if (install == null)
            {
                i1 = 0;
            } else
            {
                i1 = install.length;
            }
            ainstall = new Common.Install[l1 + i1];
            l1 = i1;
            if (i1 != 0)
            {
                System.arraycopy(install, 0, ainstall, 0, i1);
                l1 = i1;
            }
            for (; l1 < ainstall.length - 1; l1++)
            {
                ainstall[l1] = new Common.Install();
                codedinputbytebuffernano.readMessage(ainstall[l1]);
                codedinputbytebuffernano.readTag();
            }

            ainstall[l1] = new Common.Install();
            codedinputbytebuffernano.readMessage(ainstall[l1]);
            install = ainstall;
            continue; /* Loop/switch isn't completed */
_L9:
            if (filterInfo == null)
            {
                filterInfo = new FilterEvaluationInfo();
            }
            codedinputbytebuffernano.readMessage(filterInfo);
            continue; /* Loop/switch isn't completed */
_L10:
            if (ownershipInfo == null)
            {
                ownershipInfo = new Ownership.OwnershipInfo();
            }
            codedinputbytebuffernano.readMessage(ownershipInfo);
            continue; /* Loop/switch isn't completed */
_L11:
            int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 146);
            AvailabilityProblem aavailabilityproblem[];
            int j1;
            if (availabilityProblem == null)
            {
                j1 = 0;
            } else
            {
                j1 = availabilityProblem.length;
            }
            aavailabilityproblem = new AvailabilityProblem[i2 + j1];
            i2 = j1;
            if (j1 != 0)
            {
                System.arraycopy(availabilityProblem, 0, aavailabilityproblem, 0, j1);
                i2 = j1;
            }
            for (; i2 < aavailabilityproblem.length - 1; i2++)
            {
                aavailabilityproblem[i2] = new AvailabilityProblem();
                codedinputbytebuffernano.readMessage(aavailabilityproblem[i2]);
                codedinputbytebuffernano.readTag();
            }

            aavailabilityproblem[i2] = new AvailabilityProblem();
            codedinputbytebuffernano.readMessage(aavailabilityproblem[i2]);
            availabilityProblem = aavailabilityproblem;
            continue; /* Loop/switch isn't completed */
_L12:
            hidden = codedinputbytebuffernano.readBool();
            hasHidden = true;
            if (true) goto _L13; else goto _L14
_L14:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (restriction != 1 || hasRestriction)
            {
                codedoutputbytebuffernano.writeInt32(5, restriction);
            }
            if (offerType != 1 || hasOfferType)
            {
                codedoutputbytebuffernano.writeInt32(6, offerType);
            }
            if (rule != null)
            {
                codedoutputbytebuffernano.writeMessage(7, rule);
            }
            if (perDeviceAvailabilityRestriction != null && perDeviceAvailabilityRestriction.length > 0)
            {
                for (int i = 0; i < perDeviceAvailabilityRestriction.length; i++)
                {
                    PerDeviceAvailabilityRestriction perdeviceavailabilityrestriction = perDeviceAvailabilityRestriction[i];
                    if (perdeviceavailabilityrestriction != null)
                    {
                        codedoutputbytebuffernano.writeGroup(9, perdeviceavailabilityrestriction);
                    }
                }

            }
            if (hasAvailableIfOwned || availableIfOwned)
            {
                codedoutputbytebuffernano.writeBool(13, availableIfOwned);
            }
            if (install != null && install.length > 0)
            {
                for (int j = 0; j < install.length; j++)
                {
                    Common.Install install1 = install[j];
                    if (install1 != null)
                    {
                        codedoutputbytebuffernano.writeMessage(14, install1);
                    }
                }

            }
            if (filterInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(16, filterInfo);
            }
            if (ownershipInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(17, ownershipInfo);
            }
            if (availabilityProblem != null && availabilityProblem.length > 0)
            {
                for (int k = 0; k < availabilityProblem.length; k++)
                {
                    AvailabilityProblem availabilityproblem = availabilityProblem[k];
                    if (availabilityproblem != null)
                    {
                        codedoutputbytebuffernano.writeMessage(18, availabilityproblem);
                    }
                }

            }
            if (hasHidden || hidden)
            {
                codedoutputbytebuffernano.writeBool(21, hidden);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Availability()
        {
            restriction = 1;
            hasRestriction = false;
            availabilityProblem = AvailabilityProblem.emptyArray();
            availableIfOwned = false;
            hasAvailableIfOwned = false;
            offerType = 1;
            hasOfferType = false;
            ownershipInfo = null;
            hidden = false;
            hasHidden = false;
            install = Common.Install.emptyArray();
            rule = null;
            perDeviceAvailabilityRestriction = PerDeviceAvailabilityRestriction.emptyArray();
            filterInfo = null;
            cachedSize = -1;
        }
    }

    public static final class Availability.PerDeviceAvailabilityRestriction extends MessageNano
    {

        private static volatile Availability.PerDeviceAvailabilityRestriction _emptyArray[];
        public long androidId;
        public long channelId;
        public int deviceRestriction;
        public FilterEvaluationInfo filterInfo;
        public boolean hasAndroidId;
        public boolean hasChannelId;
        public boolean hasDeviceRestriction;

        public static Availability.PerDeviceAvailabilityRestriction[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Availability.PerDeviceAvailabilityRestriction[0];
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
                i = j + (CodedOutputByteBufferNano.computeTagSize(10) + 8);
            }
            int k;
label1:
            {
                if (deviceRestriction == 1)
                {
                    k = i;
                    if (!hasDeviceRestriction)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(11, deviceRestriction);
            }
label2:
            {
                if (!hasChannelId)
                {
                    i = k;
                    if (channelId == 0L)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt64Size(12, channelId);
            }
            k = i;
            if (filterInfo != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(15, filterInfo);
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       81: 66
        //                       88: 82
        //                       96: 212
        //                       122: 228;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            androidId = codedinputbytebuffernano.readRawLittleEndian64();
            hasAndroidId = true;
              goto _L7
_L4:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
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
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
                deviceRestriction = j;
                hasDeviceRestriction = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            channelId = codedinputbytebuffernano.readRawVarint64();
            hasChannelId = true;
            continue; /* Loop/switch isn't completed */
_L6:
            if (filterInfo == null)
            {
                filterInfo = new FilterEvaluationInfo();
            }
            codedinputbytebuffernano.readMessage(filterInfo);
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasAndroidId || androidId != 0L)
            {
                codedoutputbytebuffernano.writeFixed64(10, androidId);
            }
            if (deviceRestriction != 1 || hasDeviceRestriction)
            {
                codedoutputbytebuffernano.writeInt32(11, deviceRestriction);
            }
            if (hasChannelId || channelId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(12, channelId);
            }
            if (filterInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(15, filterInfo);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Availability.PerDeviceAvailabilityRestriction()
        {
            androidId = 0L;
            hasAndroidId = false;
            deviceRestriction = 1;
            hasDeviceRestriction = false;
            channelId = 0L;
            hasChannelId = false;
            filterInfo = null;
            cachedSize = -1;
        }
    }

    public static final class AvailabilityProblem extends MessageNano
    {

        private static volatile AvailabilityProblem _emptyArray[];
        public boolean hasProblemType;
        public String missingValue[];
        public int problemType;

        public static AvailabilityProblem[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new AvailabilityProblem[0];
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
                if (problemType == 1)
                {
                    i = j;
                    if (!hasProblemType)
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, problemType);
            }
            int k = i;
            if (missingValue != null)
            {
                k = i;
                if (missingValue.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (k = 0; k < missingValue.length;)
                    {
                        String s = missingValue[k];
                        int k1 = j1;
                        int i1 = l;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        k++;
                        j1 = k1;
                        l = i1;
                    }

                    k = i + l + j1 * 1;
                }
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
        //                       18: 120;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
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
                problemType = j;
                hasProblemType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            String as[];
            int k;
            if (missingValue == null)
            {
                k = 0;
            } else
            {
                k = missingValue.length;
            }
            as = new String[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(missingValue, 0, as, 0, k);
                l = k;
            }
            for (; l < as.length - 1; l++)
            {
                as[l] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[l] = codedinputbytebuffernano.readString();
            missingValue = as;
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (problemType != 1 || hasProblemType)
            {
                codedoutputbytebuffernano.writeInt32(1, problemType);
            }
            if (missingValue != null && missingValue.length > 0)
            {
                for (int i = 0; i < missingValue.length; i++)
                {
                    String s = missingValue[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AvailabilityProblem()
        {
            problemType = 1;
            hasProblemType = false;
            missingValue = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class FilterEvaluationInfo extends MessageNano
    {

        public RuleEvaluation ruleEvaluation[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int k = i;
            if (ruleEvaluation != null)
            {
                k = i;
                if (ruleEvaluation.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= ruleEvaluation.length)
                        {
                            break;
                        }
                        RuleEvaluation ruleevaluation = ruleEvaluation[j];
                        k = i;
                        if (ruleevaluation != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, ruleevaluation);
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
                    RuleEvaluation aruleevaluation[];
                    int j;
                    if (ruleEvaluation == null)
                    {
                        j = 0;
                    } else
                    {
                        j = ruleEvaluation.length;
                    }
                    aruleevaluation = new RuleEvaluation[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(ruleEvaluation, 0, aruleevaluation, 0, j);
                        k = j;
                    }
                    for (; k < aruleevaluation.length - 1; k++)
                    {
                        aruleevaluation[k] = new RuleEvaluation();
                        codedinputbytebuffernano.readMessage(aruleevaluation[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aruleevaluation[k] = new RuleEvaluation();
                    codedinputbytebuffernano.readMessage(aruleevaluation[k]);
                    ruleEvaluation = aruleevaluation;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (ruleEvaluation != null && ruleEvaluation.length > 0)
            {
                for (int i = 0; i < ruleEvaluation.length; i++)
                {
                    RuleEvaluation ruleevaluation = ruleEvaluation[i];
                    if (ruleevaluation != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, ruleevaluation);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public FilterEvaluationInfo()
        {
            ruleEvaluation = RuleEvaluation.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class Rule extends MessageNano
    {

        private static volatile Rule _emptyArray[];
        public int availabilityProblemType;
        public String comment;
        public int constArg[];
        public double doubleArg[];
        public boolean hasAvailabilityProblemType;
        public boolean hasComment;
        public boolean hasIncludeMissingValues;
        public boolean hasKey;
        public boolean hasNegate;
        public boolean hasOperator;
        public boolean hasResponseCode;
        public boolean includeMissingValues;
        public int key;
        public long longArg[];
        public boolean negate;
        public int operator;
        public int responseCode;
        public String stringArg[];
        public long stringArgHash[];
        public Rule subrule[];

        private static Rule[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new Rule[0];
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
                if (!hasNegate)
                {
                    i = j;
                    if (!negate)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            int k;
label1:
            {
                if (operator == 1)
                {
                    k = i;
                    if (!hasOperator)
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, operator);
            }
label2:
            {
                if (key == 1)
                {
                    i = k;
                    if (!hasKey)
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(3, key);
            }
label3:
            {
                k = i;
                if (stringArg != null)
                {
                    k = i;
                    if (stringArg.length > 0)
                    {
                        int i2 = 0;
                        int l = 0;
                        for (k = 0; k < stringArg.length;)
                        {
                            String s = stringArg[k];
                            int j2 = i2;
                            int l1 = l;
                            if (s != null)
                            {
                                j2 = i2 + 1;
                                l1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                            }
                            k++;
                            i2 = j2;
                            l = l1;
                        }

                        k = i + l + i2 * 1;
                    }
                }
                int i1 = k;
                if (longArg != null)
                {
                    i1 = k;
                    if (longArg.length > 0)
                    {
                        i1 = 0;
                        for (i = 0; i < longArg.length; i++)
                        {
                            i1 += CodedOutputByteBufferNano.computeRawVarint64Size(longArg[i]);
                        }

                        i1 = k + i1 + longArg.length * 1;
                    }
                }
                i = i1;
                if (doubleArg != null)
                {
                    i = i1;
                    if (doubleArg.length > 0)
                    {
                        i = i1 + doubleArg.length * 8 + doubleArg.length * 1;
                    }
                }
                k = i;
                if (subrule != null)
                {
                    k = i;
                    if (subrule.length > 0)
                    {
                        int j1 = 0;
                        do
                        {
                            k = i;
                            if (j1 >= subrule.length)
                            {
                                break;
                            }
                            Rule rule = subrule[j1];
                            k = i;
                            if (rule != null)
                            {
                                k = i + CodedOutputByteBufferNano.computeMessageSize(7, rule);
                            }
                            j1++;
                            i = k;
                        } while (true);
                    }
                }
                if (responseCode == 1)
                {
                    i = k;
                    if (!hasResponseCode)
                    {
                        break label3;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(8, responseCode);
            }
label4:
            {
                if (!hasComment)
                {
                    k = i;
                    if (comment.equals(""))
                    {
                        break label4;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(9, comment);
            }
label5:
            {
                i = k;
                if (stringArgHash != null)
                {
                    i = k;
                    if (stringArgHash.length > 0)
                    {
                        i = k + stringArgHash.length * 8 + stringArgHash.length * 1;
                    }
                }
                k = i;
                if (constArg != null)
                {
                    k = i;
                    if (constArg.length > 0)
                    {
                        int k1 = 0;
                        for (k = 0; k < constArg.length; k++)
                        {
                            k1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(constArg[k]);
                        }

                        k = i + k1 + constArg.length * 1;
                    }
                }
                if (availabilityProblemType == 1)
                {
                    i = k;
                    if (!hasAvailabilityProblemType)
                    {
                        break label5;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeInt32Size(12, availabilityProblemType);
            }
label6:
            {
                if (!hasIncludeMissingValues)
                {
                    k = i;
                    if (!includeMissingValues)
                    {
                        break label6;
                    }
                }
                k = i + (CodedOutputByteBufferNano.computeTagSize(13) + 1);
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L20:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 18: default 164
        //                       0: 173
        //                       8: 175
        //                       16: 191
        //                       24: 297
        //                       34: 481
        //                       40: 590
        //                       42: 698
        //                       49: 835
        //                       50: 949
        //                       58: 1064
        //                       64: 1195
        //                       74: 1325
        //                       81: 1341
        //                       82: 1449
        //                       88: 1561
        //                       90: 1752
        //                       96: 1966
        //                       104: 2037;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L20; else goto _L2
_L2:
            return this;
_L3:
            negate = codedinputbytebuffernano.readBool();
            hasNegate = true;
              goto _L20
_L4:
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
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
                operator = i;
                hasOperator = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
            {
            case 1: // '\001'
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
                key = i;
                hasKey = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
            String as[];
            if (stringArg == null)
            {
                i = 0;
            } else
            {
                i = stringArg.length;
            }
            as = new String[k + i];
            k = i;
            if (i != 0)
            {
                System.arraycopy(stringArg, 0, as, 0, i);
                k = i;
            }
            for (; k < as.length - 1; k++)
            {
                as[k] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[k] = codedinputbytebuffernano.readString();
            stringArg = as;
            continue; /* Loop/switch isn't completed */
_L7:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 40);
            long al[];
            if (longArg == null)
            {
                i = 0;
            } else
            {
                i = longArg.length;
            }
            al = new long[l + i];
            l = i;
            if (i != 0)
            {
                System.arraycopy(longArg, 0, al, 0, i);
                l = i;
            }
            for (; l < al.length - 1; l++)
            {
                al[l] = codedinputbytebuffernano.readRawVarint64();
                codedinputbytebuffernano.readTag();
            }

            al[l] = codedinputbytebuffernano.readRawVarint64();
            longArg = al;
            continue; /* Loop/switch isn't completed */
_L8:
            int l2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            i = codedinputbytebuffernano.getPosition();
            int i1;
            for (i1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i1++)
            {
                codedinputbytebuffernano.readRawVarint64();
            }

            codedinputbytebuffernano.rewindToPosition(i);
            long al1[];
            if (longArg == null)
            {
                i = 0;
            } else
            {
                i = longArg.length;
            }
            al1 = new long[i1 + i];
            i1 = i;
            if (i != 0)
            {
                System.arraycopy(longArg, 0, al1, 0, i);
                i1 = i;
            }
            for (; i1 < al1.length; i1++)
            {
                al1[i1] = codedinputbytebuffernano.readRawVarint64();
            }

            longArg = al1;
            codedinputbytebuffernano.popLimit(l2);
            continue; /* Loop/switch isn't completed */
_L9:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 49);
            double ad[];
            if (doubleArg == null)
            {
                i = 0;
            } else
            {
                i = doubleArg.length;
            }
            ad = new double[j1 + i];
            j1 = i;
            if (i != 0)
            {
                System.arraycopy(doubleArg, 0, ad, 0, i);
                j1 = i;
            }
            for (; j1 < ad.length - 1; j1++)
            {
                ad[j1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                codedinputbytebuffernano.readTag();
            }

            ad[j1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
            doubleArg = ad;
            continue; /* Loop/switch isn't completed */
_L10:
            i = codedinputbytebuffernano.readRawVarint32();
            int i3 = codedinputbytebuffernano.pushLimit(i);
            int k1 = i / 8;
            double ad1[];
            if (doubleArg == null)
            {
                i = 0;
            } else
            {
                i = doubleArg.length;
            }
            ad1 = new double[k1 + i];
            k1 = i;
            if (i != 0)
            {
                System.arraycopy(doubleArg, 0, ad1, 0, i);
                k1 = i;
            }
            for (; k1 < ad1.length; k1++)
            {
                ad1[k1] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
            }

            doubleArg = ad1;
            codedinputbytebuffernano.popLimit(i3);
            continue; /* Loop/switch isn't completed */
_L11:
            int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
            Rule arule[];
            if (subrule == null)
            {
                i = 0;
            } else
            {
                i = subrule.length;
            }
            arule = new Rule[l1 + i];
            l1 = i;
            if (i != 0)
            {
                System.arraycopy(subrule, 0, arule, 0, i);
                l1 = i;
            }
            for (; l1 < arule.length - 1; l1++)
            {
                arule[l1] = new Rule();
                codedinputbytebuffernano.readMessage(arule[l1]);
                codedinputbytebuffernano.readTag();
            }

            arule[l1] = new Rule();
            codedinputbytebuffernano.readMessage(arule[l1]);
            subrule = arule;
            continue; /* Loop/switch isn't completed */
_L12:
            i = codedinputbytebuffernano.readRawVarint32();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
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
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
                responseCode = i;
                hasResponseCode = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L13:
            comment = codedinputbytebuffernano.readString();
            hasComment = true;
            continue; /* Loop/switch isn't completed */
_L14:
            int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 81);
            long al2[];
            if (stringArgHash == null)
            {
                i = 0;
            } else
            {
                i = stringArgHash.length;
            }
            al2 = new long[i2 + i];
            i2 = i;
            if (i != 0)
            {
                System.arraycopy(stringArgHash, 0, al2, 0, i);
                i2 = i;
            }
            for (; i2 < al2.length - 1; i2++)
            {
                al2[i2] = codedinputbytebuffernano.readRawLittleEndian64();
                codedinputbytebuffernano.readTag();
            }

            al2[i2] = codedinputbytebuffernano.readRawLittleEndian64();
            stringArgHash = al2;
            continue; /* Loop/switch isn't completed */
_L15:
            i = codedinputbytebuffernano.readRawVarint32();
            int j3 = codedinputbytebuffernano.pushLimit(i);
            int j2 = i / 8;
            long al3[];
            if (stringArgHash == null)
            {
                i = 0;
            } else
            {
                i = stringArgHash.length;
            }
            al3 = new long[j2 + i];
            j2 = i;
            if (i != 0)
            {
                System.arraycopy(stringArgHash, 0, al3, 0, i);
                j2 = i;
            }
            for (; j2 < al3.length; j2++)
            {
                al3[j2] = codedinputbytebuffernano.readRawLittleEndian64();
            }

            stringArgHash = al3;
            codedinputbytebuffernano.popLimit(j3);
            continue; /* Loop/switch isn't completed */
_L16:
            int ai[];
            int k2;
            int i4;
            i4 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 88);
            ai = new int[i4];
            k2 = 0;
            i = 0;
_L26:
            if (k2 >= i4) goto _L22; else goto _L21
_L21:
            int j4;
            if (k2 != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j4 = codedinputbytebuffernano.readRawVarint32();
            j4;
            JVM INSTR tableswitch 1 4: default 1636
        //                       1 1645
        //                       2 1645
        //                       3 1645
        //                       4 1645;
               goto _L23 _L24 _L24 _L24 _L24
_L23:
            k2++;
            continue; /* Loop/switch isn't completed */
_L24:
            int k3 = i + 1;
            ai[i] = j4;
            i = k3;
            if (true) goto _L23; else goto _L22
_L22:
            if (i != 0)
            {
                if (constArg == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = constArg.length;
                }
                if (k2 == 0 && i == ai.length)
                {
                    constArg = ai;
                } else
                {
                    int ai1[] = new int[k2 + i];
                    if (k2 != 0)
                    {
                        System.arraycopy(constArg, 0, ai1, 0, k2);
                    }
                    System.arraycopy(ai, 0, ai1, k2, i);
                    constArg = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L26; else goto _L25
_L25:
_L17:
            int l3;
            l3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            i = codedinputbytebuffernano.getPosition();
            k2 = 0;
_L32:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readRawVarint32())
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    k2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (k2 == 0) goto _L28; else goto _L27
_L27:
            codedinputbytebuffernano.rewindToPosition(i);
            if (constArg == null)
            {
                i = 0;
            } else
            {
                i = constArg.length;
            }
            ai = new int[k2 + i];
            k2 = i;
            if (i != 0)
            {
                System.arraycopy(constArg, 0, ai, 0, i);
                k2 = i;
            }
_L30:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readRawVarint32();
                switch (i)
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                    ai[k2] = i;
                    k2++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            constArg = ai;
_L28:
            codedinputbytebuffernano.popLimit(l3);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L30; else goto _L29
_L29:
            if (true) goto _L32; else goto _L31
_L31:
_L18:
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
                availabilityProblemType = j;
                hasAvailabilityProblemType = true;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L19:
            includeMissingValues = codedinputbytebuffernano.readBool();
            hasIncludeMissingValues = true;
            if (true) goto _L20; else goto _L33
_L33:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasNegate || negate)
            {
                codedoutputbytebuffernano.writeBool(1, negate);
            }
            if (operator != 1 || hasOperator)
            {
                codedoutputbytebuffernano.writeInt32(2, operator);
            }
            if (key != 1 || hasKey)
            {
                codedoutputbytebuffernano.writeInt32(3, key);
            }
            if (stringArg != null && stringArg.length > 0)
            {
                for (int i = 0; i < stringArg.length; i++)
                {
                    String s = stringArg[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(4, s);
                    }
                }

            }
            if (longArg != null && longArg.length > 0)
            {
                for (int j = 0; j < longArg.length; j++)
                {
                    codedoutputbytebuffernano.writeInt64(5, longArg[j]);
                }

            }
            if (doubleArg != null && doubleArg.length > 0)
            {
                for (int k = 0; k < doubleArg.length; k++)
                {
                    codedoutputbytebuffernano.writeDouble(6, doubleArg[k]);
                }

            }
            if (subrule != null && subrule.length > 0)
            {
                for (int l = 0; l < subrule.length; l++)
                {
                    Rule rule = subrule[l];
                    if (rule != null)
                    {
                        codedoutputbytebuffernano.writeMessage(7, rule);
                    }
                }

            }
            if (responseCode != 1 || hasResponseCode)
            {
                codedoutputbytebuffernano.writeInt32(8, responseCode);
            }
            if (hasComment || !comment.equals(""))
            {
                codedoutputbytebuffernano.writeString(9, comment);
            }
            if (stringArgHash != null && stringArgHash.length > 0)
            {
                for (int i1 = 0; i1 < stringArgHash.length; i1++)
                {
                    codedoutputbytebuffernano.writeFixed64(10, stringArgHash[i1]);
                }

            }
            if (constArg != null && constArg.length > 0)
            {
                for (int j1 = 0; j1 < constArg.length; j1++)
                {
                    codedoutputbytebuffernano.writeInt32(11, constArg[j1]);
                }

            }
            if (availabilityProblemType != 1 || hasAvailabilityProblemType)
            {
                codedoutputbytebuffernano.writeInt32(12, availabilityProblemType);
            }
            if (hasIncludeMissingValues || includeMissingValues)
            {
                codedoutputbytebuffernano.writeBool(13, includeMissingValues);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public Rule()
        {
            negate = false;
            hasNegate = false;
            operator = 1;
            hasOperator = false;
            key = 1;
            hasKey = false;
            stringArg = WireFormatNano.EMPTY_STRING_ARRAY;
            stringArgHash = WireFormatNano.EMPTY_LONG_ARRAY;
            longArg = WireFormatNano.EMPTY_LONG_ARRAY;
            doubleArg = WireFormatNano.EMPTY_DOUBLE_ARRAY;
            constArg = WireFormatNano.EMPTY_INT_ARRAY;
            subrule = emptyArray();
            responseCode = 1;
            hasResponseCode = false;
            availabilityProblemType = 1;
            hasAvailabilityProblemType = false;
            includeMissingValues = false;
            hasIncludeMissingValues = false;
            comment = "";
            hasComment = false;
            cachedSize = -1;
        }
    }

    public static final class RuleEvaluation extends MessageNano
    {

        private static volatile RuleEvaluation _emptyArray[];
        public boolean actualBoolValue[];
        public double actualDoubleValue[];
        public long actualLongValue[];
        public String actualStringValue[];
        public Rule rule;

        public static RuleEvaluation[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new RuleEvaluation[0];
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
            int j = super.computeSerializedSize();
            int i = j;
            if (rule != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, rule);
            }
            j = i;
            if (actualStringValue != null)
            {
                j = i;
                if (actualStringValue.length > 0)
                {
                    int j1 = 0;
                    int k = 0;
                    for (j = 0; j < actualStringValue.length;)
                    {
                        String s = actualStringValue[j];
                        int k1 = j1;
                        int i1 = k;
                        if (s != null)
                        {
                            k1 = j1 + 1;
                            i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        j1 = k1;
                        k = i1;
                    }

                    j = i + k + j1 * 1;
                }
            }
            i = j;
            if (actualLongValue != null)
            {
                i = j;
                if (actualLongValue.length > 0)
                {
                    int l = 0;
                    for (i = 0; i < actualLongValue.length; i++)
                    {
                        l += CodedOutputByteBufferNano.computeRawVarint64Size(actualLongValue[i]);
                    }

                    i = j + l + actualLongValue.length * 1;
                }
            }
            j = i;
            if (actualBoolValue != null)
            {
                j = i;
                if (actualBoolValue.length > 0)
                {
                    j = i + actualBoolValue.length * 1 + actualBoolValue.length * 1;
                }
            }
            i = j;
            if (actualDoubleValue != null)
            {
                i = j;
                if (actualDoubleValue.length > 0)
                {
                    i = j + actualDoubleValue.length * 8 + actualDoubleValue.length * 1;
                }
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
                    if (rule == null)
                    {
                        rule = new Rule();
                    }
                    codedinputbytebuffernano.readMessage(rule);
                    break;

                case 18: // '\022'
                    int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as[];
                    int j;
                    if (actualStringValue == null)
                    {
                        j = 0;
                    } else
                    {
                        j = actualStringValue.length;
                    }
                    as = new String[i2 + j];
                    i2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(actualStringValue, 0, as, 0, j);
                        i2 = j;
                    }
                    for (; i2 < as.length - 1; i2++)
                    {
                        as[i2] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[i2] = codedinputbytebuffernano.readString();
                    actualStringValue = as;
                    break;

                case 24: // '\030'
                    int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                    long al[];
                    int k;
                    if (actualLongValue == null)
                    {
                        k = 0;
                    } else
                    {
                        k = actualLongValue.length;
                    }
                    al = new long[j2 + k];
                    j2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(actualLongValue, 0, al, 0, k);
                        j2 = k;
                    }
                    for (; j2 < al.length - 1; j2++)
                    {
                        al[j2] = codedinputbytebuffernano.readRawVarint64();
                        codedinputbytebuffernano.readTag();
                    }

                    al[j2] = codedinputbytebuffernano.readRawVarint64();
                    actualLongValue = al;
                    break;

                case 26: // '\032'
                    int l3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int l = codedinputbytebuffernano.getPosition();
                    int k2;
                    for (k2 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; k2++)
                    {
                        codedinputbytebuffernano.readRawVarint64();
                    }

                    codedinputbytebuffernano.rewindToPosition(l);
                    long al1[];
                    if (actualLongValue == null)
                    {
                        l = 0;
                    } else
                    {
                        l = actualLongValue.length;
                    }
                    al1 = new long[k2 + l];
                    k2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(actualLongValue, 0, al1, 0, l);
                        k2 = l;
                    }
                    for (; k2 < al1.length; k2++)
                    {
                        al1[k2] = codedinputbytebuffernano.readRawVarint64();
                    }

                    actualLongValue = al1;
                    codedinputbytebuffernano.popLimit(l3);
                    break;

                case 32: // ' '
                    int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                    boolean aflag[];
                    int i1;
                    if (actualBoolValue == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = actualBoolValue.length;
                    }
                    aflag = new boolean[l2 + i1];
                    l2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(actualBoolValue, 0, aflag, 0, i1);
                        l2 = i1;
                    }
                    for (; l2 < aflag.length - 1; l2++)
                    {
                        aflag[l2] = codedinputbytebuffernano.readBool();
                        codedinputbytebuffernano.readTag();
                    }

                    aflag[l2] = codedinputbytebuffernano.readBool();
                    actualBoolValue = aflag;
                    break;

                case 34: // '"'
                    int i4 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int j1 = codedinputbytebuffernano.getPosition();
                    int i3;
                    for (i3 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i3++)
                    {
                        codedinputbytebuffernano.readBool();
                    }

                    codedinputbytebuffernano.rewindToPosition(j1);
                    boolean aflag1[];
                    if (actualBoolValue == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = actualBoolValue.length;
                    }
                    aflag1 = new boolean[i3 + j1];
                    i3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(actualBoolValue, 0, aflag1, 0, j1);
                        i3 = j1;
                    }
                    for (; i3 < aflag1.length; i3++)
                    {
                        aflag1[i3] = codedinputbytebuffernano.readBool();
                    }

                    actualBoolValue = aflag1;
                    codedinputbytebuffernano.popLimit(i4);
                    break;

                case 41: // ')'
                    int j3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 41);
                    double ad[];
                    int k1;
                    if (actualDoubleValue == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = actualDoubleValue.length;
                    }
                    ad = new double[j3 + k1];
                    j3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(actualDoubleValue, 0, ad, 0, k1);
                        j3 = k1;
                    }
                    for (; j3 < ad.length - 1; j3++)
                    {
                        ad[j3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                        codedinputbytebuffernano.readTag();
                    }

                    ad[j3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                    actualDoubleValue = ad;
                    break;

                case 42: // '*'
                    int l1 = codedinputbytebuffernano.readRawVarint32();
                    int j4 = codedinputbytebuffernano.pushLimit(l1);
                    int k3 = l1 / 8;
                    double ad1[];
                    if (actualDoubleValue == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = actualDoubleValue.length;
                    }
                    ad1 = new double[k3 + l1];
                    k3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(actualDoubleValue, 0, ad1, 0, l1);
                        k3 = l1;
                    }
                    for (; k3 < ad1.length; k3++)
                    {
                        ad1[k3] = Double.longBitsToDouble(codedinputbytebuffernano.readRawLittleEndian64());
                    }

                    actualDoubleValue = ad1;
                    codedinputbytebuffernano.popLimit(j4);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (rule != null)
            {
                codedoutputbytebuffernano.writeMessage(1, rule);
            }
            if (actualStringValue != null && actualStringValue.length > 0)
            {
                for (int i = 0; i < actualStringValue.length; i++)
                {
                    String s = actualStringValue[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            if (actualLongValue != null && actualLongValue.length > 0)
            {
                for (int j = 0; j < actualLongValue.length; j++)
                {
                    codedoutputbytebuffernano.writeInt64(3, actualLongValue[j]);
                }

            }
            if (actualBoolValue != null && actualBoolValue.length > 0)
            {
                for (int k = 0; k < actualBoolValue.length; k++)
                {
                    codedoutputbytebuffernano.writeBool(4, actualBoolValue[k]);
                }

            }
            if (actualDoubleValue != null && actualDoubleValue.length > 0)
            {
                for (int l = 0; l < actualDoubleValue.length; l++)
                {
                    codedoutputbytebuffernano.writeDouble(5, actualDoubleValue[l]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public RuleEvaluation()
        {
            rule = null;
            actualStringValue = WireFormatNano.EMPTY_STRING_ARRAY;
            actualLongValue = WireFormatNano.EMPTY_LONG_ARRAY;
            actualBoolValue = WireFormatNano.EMPTY_BOOLEAN_ARRAY;
            actualDoubleValue = WireFormatNano.EMPTY_DOUBLE_ARRAY;
            cachedSize = -1;
        }
    }

}
