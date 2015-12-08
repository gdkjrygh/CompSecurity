// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class clear extends MessageNano
{

    private static volatile serverLogsCookie _emptyArray[];
    public serverLogsCookie child[];
    public String id;
    public byte serverLogsCookie[];
    public int type;

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
        type = 0;
        child = emptyArray();
        id = "";
        serverLogsCookie = WireFormatNano.EMPTY_BYTES;
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (type != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
        }
        j = i;
        if (child != null)
        {
            j = i;
            if (child.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= child.length)
                    {
                        break;
                    }
                    cachedSize cachedsize = child[k];
                    j = i;
                    if (cachedsize != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, cachedsize);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (!id.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, id);
        }
        j = i;
        if (!Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
        {
            j = i + CodedOutputByteBufferNano.computeBytesSize(4, serverLogsCookie);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof serverLogsCookie))
            {
                return false;
            }
            obj = (serverLogsCookie)obj;
            if (type != ((type) (obj)).type)
            {
                return false;
            }
            if (!InternalNano.equals(child, ((child) (obj)).child))
            {
                return false;
            }
            if (id == null)
            {
                if (((id) (obj)).id != null)
                {
                    return false;
                }
            } else
            if (!id.equals(((id) (obj)).id))
            {
                return false;
            }
            if (!Arrays.equals(serverLogsCookie, ((serverLogsCookie) (obj)).serverLogsCookie))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = getClass().getName().hashCode();
        int k = type;
        int l = InternalNano.hashCode(child);
        int i;
        if (id == null)
        {
            i = 0;
        } else
        {
            i = id.hashCode();
        }
        return ((((j + 527) * 31 + k) * 31 + l) * 31 + i) * 31 + Arrays.hashCode(serverLogsCookie);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 64
    //                   8: 66
    //                   18: 1695
    //                   26: 1819
    //                   34: 1830;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
        case 250: 
        case 251: 
        case 252: 
        case 253: 
        case 254: 
        case 255: 
        case 300: 
        case 301: 
        case 302: 
        case 303: 
        case 304: 
        case 305: 
        case 306: 
        case 400: 
        case 500: 
        case 501: 
        case 502: 
        case 503: 
        case 504: 
        case 505: 
        case 506: 
        case 507: 
        case 508: 
        case 509: 
        case 510: 
        case 511: 
        case 512: 
        case 513: 
        case 514: 
        case 575: 
        case 576: 
        case 577: 
        case 600: 
        case 601: 
        case 602: 
        case 603: 
        case 604: 
        case 605: 
        case 606: 
        case 607: 
        case 608: 
        case 609: 
        case 610: 
        case 611: 
        case 612: 
        case 613: 
        case 614: 
        case 615: 
        case 616: 
        case 617: 
        case 700: 
        case 701: 
        case 702: 
        case 703: 
        case 704: 
        case 705: 
        case 706: 
        case 707: 
        case 708: 
        case 801: 
        case 802: 
        case 803: 
        case 804: 
        case 805: 
        case 806: 
        case 807: 
        case 900: 
        case 901: 
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
        case 1050: 
        case 1051: 
        case 1052: 
        case 1053: 
        case 1054: 
        case 1055: 
        case 1056: 
        case 1057: 
        case 1058: 
        case 1059: 
        case 1060: 
        case 1100: 
        case 1101: 
        case 1102: 
        case 1103: 
        case 1104: 
        case 1105: 
        case 1106: 
        case 1107: 
        case 1108: 
        case 1109: 
        case 1110: 
        case 1111: 
        case 1112: 
        case 1113: 
        case 1114: 
        case 1140: 
        case 1141: 
        case 1142: 
        case 1143: 
        case 1144: 
        case 1145: 
        case 1146: 
        case 1147: 
        case 1148: 
        case 1149: 
        case 1150: 
        case 1151: 
        case 1152: 
        case 1153: 
        case 1154: 
        case 1155: 
            type = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        serverLogsCookie aserverlogscookie[];
        int k;
        if (child == null)
        {
            k = 0;
        } else
        {
            k = child.length;
        }
        aserverlogscookie = new child[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(child, 0, aserverlogscookie, 0, k);
            l = k;
        }
        for (; l < aserverlogscookie.length - 1; l++)
        {
            aserverlogscookie[l] = new <init>();
            codedinputbytebuffernano.readMessage(aserverlogscookie[l]);
            codedinputbytebuffernano.readTag();
        }

        aserverlogscookie[l] = new <init>();
        codedinputbytebuffernano.readMessage(aserverlogscookie[l]);
        child = aserverlogscookie;
        continue; /* Loop/switch isn't completed */
_L5:
        id = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L6:
        serverLogsCookie = codedinputbytebuffernano.readBytes();
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (type != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, type);
        }
        if (child != null && child.length > 0)
        {
            for (int i = 0; i < child.length; i++)
            {
                serverLogsCookie serverlogscookie = child[i];
                if (serverlogscookie != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, serverlogscookie);
                }
            }

        }
        if (!id.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, id);
        }
        if (!Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(4, serverLogsCookie);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
