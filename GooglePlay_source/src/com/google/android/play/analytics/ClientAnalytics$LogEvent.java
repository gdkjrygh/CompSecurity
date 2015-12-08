// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class clear extends MessageNano
{

    private static volatile clientVe _emptyArray[];
    public pLogEvent appUsage1P;
    public byte clientVe[];
    public int eventCode;
    public int eventFlowId;
    public long eventTimeMs;
    public long eventUptimeMs;
    public eriments exp;
    public tIds experimentIds;
    public boolean isUserInitiated;
    public byte sourceExtension[];
    public byte sourceExtensionJs[];
    public byte sourceExtensionJson[];
    public String tag;
    public String testId;
    public long timezoneOffsetSeconds;
    public eyValues value[];

    public static clear[] emptyArray()
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

    public final _emptyArray clear()
    {
        eventTimeMs = 0L;
        eventUptimeMs = 0L;
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
        cachedSize = -1;
        return this;
    }

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
        i = j;
        if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
        {
            i = j + CodedOutputByteBufferNano.computeBytesSize(18, clientVe);
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
                eventTimeMs = codedinputbytebuffernano.readRawVarint64();
                break;

            case 18: // '\022'
                tag = codedinputbytebuffernano.readString();
                break;

            case 26: // '\032'
                int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                eyValues aeyvalues[];
                int j;
                if (value == null)
                {
                    j = 0;
                } else
                {
                    j = value.length;
                }
                aeyvalues = new eyValues[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(value, 0, aeyvalues, 0, j);
                    k = j;
                }
                for (; k < aeyvalues.length - 1; k++)
                {
                    aeyvalues[k] = new eyValues();
                    codedinputbytebuffernano.readMessage(aeyvalues[k]);
                    codedinputbytebuffernano.readTag();
                }

                aeyvalues[k] = new eyValues();
                codedinputbytebuffernano.readMessage(aeyvalues[k]);
                value = aeyvalues;
                break;

            case 50: // '2'
                sourceExtension = codedinputbytebuffernano.readBytes();
                break;

            case 58: // ':'
                if (exp == null)
                {
                    exp = new eriments();
                }
                codedinputbytebuffernano.readMessage(exp);
                break;

            case 66: // 'B'
                sourceExtensionJs = codedinputbytebuffernano.readBytes();
                break;

            case 74: // 'J'
                if (appUsage1P == null)
                {
                    appUsage1P = new pLogEvent();
                }
                codedinputbytebuffernano.readMessage(appUsage1P);
                break;

            case 80: // 'P'
                isUserInitiated = codedinputbytebuffernano.readBool();
                break;

            case 88: // 'X'
                eventCode = codedinputbytebuffernano.readRawVarint32();
                break;

            case 96: // '`'
                eventFlowId = codedinputbytebuffernano.readRawVarint32();
                break;

            case 106: // 'j'
                sourceExtensionJson = codedinputbytebuffernano.readBytes();
                break;

            case 114: // 'r'
                testId = codedinputbytebuffernano.readString();
                break;

            case 120: // 'x'
                timezoneOffsetSeconds = codedinputbytebuffernano.readSInt64();
                break;

            case 130: 
                if (experimentIds == null)
                {
                    experimentIds = new tIds();
                }
                codedinputbytebuffernano.readMessage(experimentIds);
                break;

            case 136: 
                eventUptimeMs = codedinputbytebuffernano.readRawVarint64();
                break;

            case 146: 
                clientVe = codedinputbytebuffernano.readBytes();
                break;
            }
        } while (true);
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
        super.writeTo(codedoutputbytebuffernano);
    }

    public eyValues()
    {
        clear();
    }
}
