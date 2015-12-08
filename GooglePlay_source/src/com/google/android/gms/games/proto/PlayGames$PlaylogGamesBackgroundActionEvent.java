// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class clear extends MessageNano
{

    public int actionType;
    public operationSuccess appData;
    public int errorCode;
    public String exceptionType;
    public int fromSetting;
    public boolean operationSuccess;
    public String reason;
    public int toSetting;

    public final clear clear()
    {
        actionType = 0;
        reason = "";
        errorCode = 0;
        exceptionType = "";
        fromSetting = 0;
        toSetting = 0;
        appData = null;
        operationSuccess = false;
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (!reason.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, reason);
        }
        i = j;
        if (errorCode != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, errorCode);
        }
        j = i;
        if (!exceptionType.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, exceptionType);
        }
        i = j;
        if (fromSetting != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, fromSetting);
        }
        j = i;
        if (toSetting != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, toSetting);
        }
        i = j;
        if (appData != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, appData);
        }
        j = i;
        if (operationSuccess)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(8) + 1);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof operationSuccess))
            {
                return false;
            }
            obj = (operationSuccess)obj;
            if (actionType != ((actionType) (obj)).actionType)
            {
                return false;
            }
            if (reason == null)
            {
                if (((reason) (obj)).reason != null)
                {
                    return false;
                }
            } else
            if (!reason.equals(((reason) (obj)).reason))
            {
                return false;
            }
            if (errorCode != ((errorCode) (obj)).errorCode)
            {
                return false;
            }
            if (exceptionType == null)
            {
                if (((exceptionType) (obj)).exceptionType != null)
                {
                    return false;
                }
            } else
            if (!exceptionType.equals(((exceptionType) (obj)).exceptionType))
            {
                return false;
            }
            if (fromSetting != ((fromSetting) (obj)).fromSetting)
            {
                return false;
            }
            if (toSetting != ((toSetting) (obj)).toSetting)
            {
                return false;
            }
            if (appData == null)
            {
                if (((appData) (obj)).appData != null)
                {
                    return false;
                }
            } else
            if (!appData.appData(((appData) (obj)).appData))
            {
                return false;
            }
            if (operationSuccess != ((operationSuccess) (obj)).operationSuccess)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = getClass().getName().hashCode();
        int i1 = actionType;
        int i;
        int j;
        char c;
        int j1;
        int k1;
        int l1;
        if (reason == null)
        {
            i = 0;
        } else
        {
            i = reason.hashCode();
        }
        j1 = errorCode;
        if (exceptionType == null)
        {
            j = 0;
        } else
        {
            j = exceptionType.hashCode();
        }
        k1 = fromSetting;
        l1 = toSetting;
        if (appData != null)
        {
            k = appData.appData();
        }
        if (operationSuccess)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return c + ((((((((l + 527) * 31 + i1) * 31 + i) * 31 + j1) * 31 + j) * 31 + k1) * 31 + l1) * 31 + k) * 31;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 96
    //                   8: 98
    //                   18: 183
    //                   24: 194
    //                   34: 205
    //                   40: 216
    //                   48: 227
    //                   58: 238
    //                   64: 267;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
            actionType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        reason = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        errorCode = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L6:
        exceptionType = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        fromSetting = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L8:
        toSetting = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L9:
        if (appData == null)
        {
            appData = new appData();
        }
        codedinputbytebuffernano.readMessage(appData);
        continue; /* Loop/switch isn't completed */
_L10:
        operationSuccess = codedinputbytebuffernano.readBool();
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, actionType);
        }
        if (!reason.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, reason);
        }
        if (errorCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, errorCode);
        }
        if (!exceptionType.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, exceptionType);
        }
        if (fromSetting != 0)
        {
            codedoutputbytebuffernano.writeInt32(5, fromSetting);
        }
        if (toSetting != 0)
        {
            codedoutputbytebuffernano.writeInt32(6, toSetting);
        }
        if (appData != null)
        {
            codedoutputbytebuffernano.writeMessage(7, appData);
        }
        if (operationSuccess)
        {
            codedoutputbytebuffernano.writeBool(8, operationSuccess);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
