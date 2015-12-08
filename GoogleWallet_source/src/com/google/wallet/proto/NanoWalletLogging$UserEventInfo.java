// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public xtExtraInfo contextExtraInfo;
    public Integer userEventContextType;
    public Integer userEventType;

    private clear clear()
    {
        userEventContextType = null;
        userEventType = null;
        contextExtraInfo = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 722
    //                   26: 5394;
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
            contextExtraInfo = new xtExtraInfo();
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

    public xtExtraInfo()
    {
        clear();
    }
}
