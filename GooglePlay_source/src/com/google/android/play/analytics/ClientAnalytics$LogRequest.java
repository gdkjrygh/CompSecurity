// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.play.analytics:
//            ClientAnalytics

public static final class cachedSize extends MessageNano
{

    public requestUptimeMs clientInfo;
    public requestUptimeMs logEvent[];
    public int logSource;
    public String logSourceName;
    public long requestTimeMs;
    public long requestUptimeMs;
    public byte serializedLogEvents[][];
    public String zwiebackCookie;

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (clientInfo != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(1, clientInfo);
        }
        i = j;
        if (logSource != -1)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(2, logSource);
        }
        j = i;
        if (logEvent != null)
        {
            j = i;
            if (logEvent.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= logEvent.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = logEvent[k];
                    j = i;
                    if (cachedsize != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(3, cachedsize);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (requestTimeMs != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(4, requestTimeMs);
        }
        j = i;
        if (serializedLogEvents != null)
        {
            j = i;
            if (serializedLogEvents.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (j = 0; j < serializedLogEvents.length;)
                {
                    byte abyte0[] = serializedLogEvents[j];
                    int k1 = j1;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        k1 = j1 + 1;
                        i1 = l + CodedOutputByteBufferNano.computeBytesSizeNoTag(abyte0);
                    }
                    j++;
                    j1 = k1;
                    l = i1;
                }

                j = i + l + j1 * 1;
            }
        }
        i = j;
        if (!logSourceName.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(6, logSourceName);
        }
        j = i;
        if (!zwiebackCookie.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(7, zwiebackCookie);
        }
        i = j;
        if (requestUptimeMs != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(8, requestUptimeMs);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 96
    //                   10: 98
    //                   16: 127
    //                   26: 515
    //                   32: 639
    //                   42: 650
    //                   50: 752
    //                   58: 763
    //                   64: 774;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        if (clientInfo == null)
        {
            clientInfo = new <init>();
        }
        codedinputbytebuffernano.readMessage(clientInfo);
          goto _L11
_L4:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case -1: 
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
            logSource = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        requestUptimeMs arequestuptimems[];
        int k;
        if (logEvent == null)
        {
            k = 0;
        } else
        {
            k = logEvent.length;
        }
        arequestuptimems = new logEvent[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(logEvent, 0, arequestuptimems, 0, k);
            i1 = k;
        }
        for (; i1 < arequestuptimems.length - 1; i1++)
        {
            arequestuptimems[i1] = new nit>();
            codedinputbytebuffernano.readMessage(arequestuptimems[i1]);
            codedinputbytebuffernano.readTag();
        }

        arequestuptimems[i1] = new nit>();
        codedinputbytebuffernano.readMessage(arequestuptimems[i1]);
        logEvent = arequestuptimems;
        continue; /* Loop/switch isn't completed */
_L6:
        requestTimeMs = codedinputbytebuffernano.readRawVarint64();
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
        byte abyte0[][];
        int l;
        if (serializedLogEvents == null)
        {
            l = 0;
        } else
        {
            l = serializedLogEvents.length;
        }
        abyte0 = new byte[j1 + l][];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(serializedLogEvents, 0, abyte0, 0, l);
            j1 = l;
        }
        for (; j1 < abyte0.length - 1; j1++)
        {
            abyte0[j1] = codedinputbytebuffernano.readBytes();
            codedinputbytebuffernano.readTag();
        }

        abyte0[j1] = codedinputbytebuffernano.readBytes();
        serializedLogEvents = abyte0;
        continue; /* Loop/switch isn't completed */
_L8:
        logSourceName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        zwiebackCookie = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        requestUptimeMs = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (clientInfo != null)
        {
            codedoutputbytebuffernano.writeMessage(1, clientInfo);
        }
        if (logSource != -1)
        {
            codedoutputbytebuffernano.writeInt32(2, logSource);
        }
        if (logEvent != null && logEvent.length > 0)
        {
            for (int i = 0; i < logEvent.length; i++)
            {
                nt64 nt64 = logEvent[i];
                if (nt64 != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, nt64);
                }
            }

        }
        if (requestTimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(4, requestTimeMs);
        }
        if (serializedLogEvents != null && serializedLogEvents.length > 0)
        {
            for (int j = 0; j < serializedLogEvents.length; j++)
            {
                byte abyte0[] = serializedLogEvents[j];
                if (abyte0 != null)
                {
                    codedoutputbytebuffernano.writeBytes(5, abyte0);
                }
            }

        }
        if (!logSourceName.equals(""))
        {
            codedoutputbytebuffernano.writeString(6, logSourceName);
        }
        if (!zwiebackCookie.equals(""))
        {
            codedoutputbytebuffernano.writeString(7, zwiebackCookie);
        }
        if (requestUptimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(8, requestUptimeMs);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        requestTimeMs = 0L;
        requestUptimeMs = 0L;
        clientInfo = null;
        logSource = -1;
        logSourceName = "";
        zwiebackCookie = "";
        logEvent = ptyArray();
        serializedLogEvents = WireFormatNano.EMPTY_BYTES_ARRAY;
        cachedSize = -1;
    }
}
