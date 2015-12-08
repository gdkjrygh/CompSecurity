// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.android.play.playlog.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.wireless.android.play.playlog.proto:
//            ClientAnalytics

public static final class cachedSize extends ExtendableMessageNano
{

    public pLogEvent appUsage1P;
    public byte clientVe[];
    public int eventCode;
    public int eventFlowId;
    public long eventTimeMs;
    public long eventUptimeMs;
    public eriments exp;
    public tIds experimentIds;
    public int internalEvent;
    public boolean isUserInitiated;
    public long sequencePosition;
    public byte sourceExtension[];
    public byte sourceExtensionJs[];
    public byte sourceExtensionJson[];
    public String tag;
    public int testCode[];
    public String testId;
    public long timezoneOffsetSeconds;
    public eyValues value[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (eventTimeMs != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(1, eventTimeMs);
        }
        i = j;
        if (!tag.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, tag);
        }
        j = i;
        if (value != null)
        {
            j = i;
            if (value.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= value.length)
                    {
                        break;
                    }
                    eyValues eyvalues = value[k];
                    j = i;
                    if (eyvalues != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, eyvalues);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (!Arrays.equals(sourceExtension, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(6, sourceExtension);
        }
        j = i;
        if (exp != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(7, exp);
        }
        i = j;
        if (!Arrays.equals(sourceExtensionJs, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(8, sourceExtensionJs);
        }
        j = i;
        if (appUsage1P != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(9, appUsage1P);
        }
        i = j;
        if (isUserInitiated)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(10) + 1);
        }
        j = i;
        if (eventCode != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(11, eventCode);
        }
        i = j;
        if (eventFlowId != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(12, eventFlowId);
        }
        j = i;
        if (!Arrays.equals(sourceExtensionJson, WireFormatNano.EMPTY_BYTES))
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(13, sourceExtensionJson);
        }
        i = j;
        if (!testId.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(14, testId);
        }
        j = i;
        if (timezoneOffsetSeconds != 0x2bf20L)
        {
            j = i + CodedOutputByteBufferNano.computeSInt64Size(15, timezoneOffsetSeconds);
        }
        i = j;
        if (experimentIds != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(16, experimentIds);
        }
        j = i;
        if (eventUptimeMs != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(17, eventUptimeMs);
        }
        int l = j;
        if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
        {
            l = j + CodedOutputByteBufferNano.computeBytesSize(18, clientVe);
        }
        i = l;
        if (internalEvent != 0)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(19, internalEvent);
        }
        j = i;
        if (testCode != null)
        {
            j = i;
            if (testCode.length > 0)
            {
                int i1 = 0;
                for (j = 0; j < testCode.length; j++)
                {
                    i1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(testCode[j]);
                }

                j = i + i1 + testCode.length * 2;
            }
        }
        i = j;
        if (sequencePosition != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(21, sequencePosition);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof sequencePosition))
            {
                return false;
            }
            obj = (sequencePosition)obj;
            if (eventTimeMs != ((eventTimeMs) (obj)).eventTimeMs)
            {
                return false;
            }
            if (eventUptimeMs != ((eventUptimeMs) (obj)).eventUptimeMs)
            {
                return false;
            }
            if (sequencePosition != ((sequencePosition) (obj)).sequencePosition)
            {
                return false;
            }
            if (tag == null)
            {
                if (((tag) (obj)).tag != null)
                {
                    return false;
                }
            } else
            if (!tag.equals(((tag) (obj)).tag))
            {
                return false;
            }
            if (eventCode != ((eventCode) (obj)).eventCode)
            {
                return false;
            }
            if (eventFlowId != ((eventFlowId) (obj)).eventFlowId)
            {
                return false;
            }
            if (isUserInitiated != ((isUserInitiated) (obj)).isUserInitiated)
            {
                return false;
            }
            if (!InternalNano.equals(value, ((value) (obj)).value))
            {
                return false;
            }
            if (appUsage1P == null)
            {
                if (((appUsage1P) (obj)).appUsage1P != null)
                {
                    return false;
                }
            } else
            if (!appUsage1P.equals(((pLogEvent.equals) (obj)).appUsage1P))
            {
                return false;
            }
            if (!Arrays.equals(sourceExtension, ((sourceExtension) (obj)).sourceExtension))
            {
                return false;
            }
            if (!Arrays.equals(sourceExtensionJs, ((sourceExtensionJs) (obj)).sourceExtensionJs))
            {
                return false;
            }
            if (!Arrays.equals(sourceExtensionJson, ((sourceExtensionJson) (obj)).sourceExtensionJson))
            {
                return false;
            }
            if (exp == null)
            {
                if (((exp) (obj)).exp != null)
                {
                    return false;
                }
            } else
            if (!exp.equals(((eriments.equals) (obj)).exp))
            {
                return false;
            }
            if (testId == null)
            {
                if (((testId) (obj)).testId != null)
                {
                    return false;
                }
            } else
            if (!testId.equals(((testId) (obj)).testId))
            {
                return false;
            }
            if (timezoneOffsetSeconds != ((timezoneOffsetSeconds) (obj)).timezoneOffsetSeconds)
            {
                return false;
            }
            if (experimentIds == null)
            {
                if (((experimentIds) (obj)).experimentIds != null)
                {
                    return false;
                }
            } else
            if (!experimentIds.equals(((tIds.equals) (obj)).experimentIds))
            {
                return false;
            }
            if (!Arrays.equals(clientVe, ((clientVe) (obj)).clientVe))
            {
                return false;
            }
            if (internalEvent != ((internalEvent) (obj)).internalEvent)
            {
                return false;
            }
            if (!InternalNano.equals(testCode, ((testCode) (obj)).testCode))
            {
                return false;
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                if (((unknownFieldData) (obj)).unknownFieldData != null && !((unknownFieldData) (obj)).unknownFieldData.isEmpty())
                {
                    return false;
                }
            } else
            {
                return unknownFieldData.equals(((unknownFieldData) (obj)).unknownFieldData);
            }
        }
        return true;
    }

    public final int hashCode()
    {
        boolean flag = false;
        int k1 = getClass().getName().hashCode();
        int l1 = (int)(eventTimeMs ^ eventTimeMs >>> 32);
        int i2 = (int)(eventUptimeMs ^ eventUptimeMs >>> 32);
        int j2 = (int)(sequencePosition ^ sequencePosition >>> 32);
        int i;
        char c;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        if (tag == null)
        {
            i = 0;
        } else
        {
            i = tag.hashCode();
        }
        k2 = eventCode;
        l2 = eventFlowId;
        if (isUserInitiated)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i3 = InternalNano.hashCode(value);
        if (appUsage1P == null)
        {
            j = 0;
        } else
        {
            j = appUsage1P.hashCode();
        }
        j3 = Arrays.hashCode(sourceExtension);
        k3 = Arrays.hashCode(sourceExtensionJs);
        l3 = Arrays.hashCode(sourceExtensionJson);
        if (exp == null)
        {
            k = 0;
        } else
        {
            k = exp.hashCode();
        }
        if (testId == null)
        {
            l = 0;
        } else
        {
            l = testId.hashCode();
        }
        i4 = (int)(timezoneOffsetSeconds ^ timezoneOffsetSeconds >>> 32);
        if (experimentIds == null)
        {
            i1 = 0;
        } else
        {
            i1 = experimentIds.hashCode();
        }
        j4 = Arrays.hashCode(clientVe);
        k4 = internalEvent;
        l4 = InternalNano.hashCode(testCode);
        j1 = ((flag) ? 1 : 0);
        if (unknownFieldData != null)
        {
            if (unknownFieldData.isEmpty())
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = unknownFieldData.hashCode();
            }
        }
        return ((((((((((((((((((((k1 + 527) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + i) * 31 + k2) * 31 + l2) * 31 + c) * 31 + i3) * 31 + j) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + k) * 31 + l) * 31 + i4) * 31 + i1) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + j1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L23:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 21: default 184
    //                   0: 193
    //                   8: 195
    //                   18: 206
    //                   26: 217
    //                   50: 341
    //                   58: 352
    //                   66: 381
    //                   74: 392
    //                   80: 421
    //                   88: 432
    //                   96: 443
    //                   106: 454
    //                   114: 465
    //                   120: 476
    //                   130: 487
    //                   136: 516
    //                   146: 527
    //                   152: 538
    //                   160: 583
    //                   162: 685
    //                   168: 813;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        eventTimeMs = codedinputbytebuffernano.readRawVarint64();
          goto _L23
_L4:
        tag = codedinputbytebuffernano.readString();
          goto _L23
_L5:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        eyValues aeyvalues[];
        int j;
        if (value == null)
        {
            j = 0;
        } else
        {
            j = value.length;
        }
        aeyvalues = new eyValues[j1 + j];
        j1 = j;
        if (j != 0)
        {
            System.arraycopy(value, 0, aeyvalues, 0, j);
            j1 = j;
        }
        for (; j1 < aeyvalues.length - 1; j1++)
        {
            aeyvalues[j1] = new eyValues();
            codedinputbytebuffernano.readMessage(aeyvalues[j1]);
            codedinputbytebuffernano.readTag();
        }

        aeyvalues[j1] = new eyValues();
        codedinputbytebuffernano.readMessage(aeyvalues[j1]);
        value = aeyvalues;
          goto _L23
_L6:
        sourceExtension = codedinputbytebuffernano.readBytes();
          goto _L23
_L7:
        if (exp == null)
        {
            exp = new eriments();
        }
        codedinputbytebuffernano.readMessage(exp);
          goto _L23
_L8:
        sourceExtensionJs = codedinputbytebuffernano.readBytes();
          goto _L23
_L9:
        if (appUsage1P == null)
        {
            appUsage1P = new pLogEvent();
        }
        codedinputbytebuffernano.readMessage(appUsage1P);
          goto _L23
_L10:
        isUserInitiated = codedinputbytebuffernano.readBool();
          goto _L23
_L11:
        eventCode = codedinputbytebuffernano.readRawVarint32();
          goto _L23
_L12:
        eventFlowId = codedinputbytebuffernano.readRawVarint32();
          goto _L23
_L13:
        sourceExtensionJson = codedinputbytebuffernano.readBytes();
          goto _L23
_L14:
        testId = codedinputbytebuffernano.readString();
          goto _L23
_L15:
        timezoneOffsetSeconds = codedinputbytebuffernano.readSInt64();
          goto _L23
_L16:
        if (experimentIds == null)
        {
            experimentIds = new tIds();
        }
        codedinputbytebuffernano.readMessage(experimentIds);
          goto _L23
_L17:
        eventUptimeMs = codedinputbytebuffernano.readRawVarint64();
          goto _L23
_L18:
        clientVe = codedinputbytebuffernano.readBytes();
          goto _L23
_L19:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            internalEvent = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 160);
        int ai[];
        int l;
        if (testCode == null)
        {
            l = 0;
        } else
        {
            l = testCode.length;
        }
        ai = new int[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(testCode, 0, ai, 0, l);
            k1 = l;
        }
        for (; k1 < ai.length - 1; k1++)
        {
            ai[k1] = codedinputbytebuffernano.readRawVarint32();
            codedinputbytebuffernano.readTag();
        }

        ai[k1] = codedinputbytebuffernano.readRawVarint32();
        testCode = ai;
        continue; /* Loop/switch isn't completed */
_L21:
        int i2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        int i1 = codedinputbytebuffernano.getPosition();
        int l1;
        for (l1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; l1++)
        {
            codedinputbytebuffernano.readRawVarint32();
        }

        codedinputbytebuffernano.rewindToPosition(i1);
        int ai1[];
        if (testCode == null)
        {
            i1 = 0;
        } else
        {
            i1 = testCode.length;
        }
        ai1 = new int[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(testCode, 0, ai1, 0, i1);
            l1 = i1;
        }
        for (; l1 < ai1.length; l1++)
        {
            ai1[l1] = codedinputbytebuffernano.readRawVarint32();
        }

        testCode = ai1;
        codedinputbytebuffernano.popLimit(i2);
        continue; /* Loop/switch isn't completed */
_L22:
        sequencePosition = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L23; else goto _L24
_L24:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (eventTimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(1, eventTimeMs);
        }
        if (!tag.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, tag);
        }
        if (value != null && value.length > 0)
        {
            for (int i = 0; i < value.length; i++)
            {
                eyValues eyvalues = value[i];
                if (eyvalues != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, eyvalues);
                }
            }

        }
        if (!Arrays.equals(sourceExtension, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(6, sourceExtension);
        }
        if (exp != null)
        {
            codedoutputbytebuffernano.writeMessage(7, exp);
        }
        if (!Arrays.equals(sourceExtensionJs, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(8, sourceExtensionJs);
        }
        if (appUsage1P != null)
        {
            codedoutputbytebuffernano.writeMessage(9, appUsage1P);
        }
        if (isUserInitiated)
        {
            codedoutputbytebuffernano.writeBool(10, isUserInitiated);
        }
        if (eventCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(11, eventCode);
        }
        if (eventFlowId != 0)
        {
            codedoutputbytebuffernano.writeInt32(12, eventFlowId);
        }
        if (!Arrays.equals(sourceExtensionJson, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(13, sourceExtensionJson);
        }
        if (!testId.equals(""))
        {
            codedoutputbytebuffernano.writeString(14, testId);
        }
        if (timezoneOffsetSeconds != 0x2bf20L)
        {
            codedoutputbytebuffernano.writeSInt64(15, timezoneOffsetSeconds);
        }
        if (experimentIds != null)
        {
            codedoutputbytebuffernano.writeMessage(16, experimentIds);
        }
        if (eventUptimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(17, eventUptimeMs);
        }
        if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(18, clientVe);
        }
        if (internalEvent != 0)
        {
            codedoutputbytebuffernano.writeInt32(19, internalEvent);
        }
        if (testCode != null && testCode.length > 0)
        {
            for (int j = 0; j < testCode.length; j++)
            {
                codedoutputbytebuffernano.writeInt32(20, testCode[j]);
            }

        }
        if (sequencePosition != 0L)
        {
            codedoutputbytebuffernano.writeInt64(21, sequencePosition);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public eyValues()
    {
        eventTimeMs = 0L;
        eventUptimeMs = 0L;
        sequencePosition = 0L;
        tag = "";
        eventCode = 0;
        eventFlowId = 0;
        isUserInitiated = false;
        value = eyValues.emptyArray();
        appUsage1P = null;
        sourceExtension = WireFormatNano.EMPTY_BYTES;
        sourceExtensionJs = WireFormatNano.EMPTY_BYTES;
        sourceExtensionJson = WireFormatNano.EMPTY_BYTES;
        exp = null;
        testId = "";
        timezoneOffsetSeconds = 0x2bf20L;
        experimentIds = null;
        clientVe = WireFormatNano.EMPTY_BYTES;
        internalEvent = 0;
        testCode = WireFormatNano.EMPTY_INT_ARRAY;
        unknownFieldData = null;
        cachedSize = -1;
    }
}
