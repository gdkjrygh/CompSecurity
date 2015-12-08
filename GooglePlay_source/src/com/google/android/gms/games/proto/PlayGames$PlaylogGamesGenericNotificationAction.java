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

public static final class cachedSize extends MessageNano
{

    public int actionType;
    public iosAction androidAction;
    public iosAction iosAction;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (androidAction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, androidAction);
        }
        i = j;
        if (iosAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, iosAction);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof iosAction))
        {
            return false;
        }
        obj = (iosAction)obj;
        if (actionType != ((actionType) (obj)).actionType)
        {
            return false;
        }
        if (androidAction == null)
        {
            if (((androidAction) (obj)).androidAction != null)
            {
                return false;
            }
        } else
        if (!androidAction.equals(((equals) (obj)).androidAction))
        {
            return false;
        }
        if (iosAction != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((iosAction) (obj)).iosAction == null) goto _L1; else goto _L3
_L3:
        return false;
        if (iosAction.ls(((ls) (obj)).iosAction)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = getClass().getName().hashCode();
        int l = actionType;
        int i;
        if (androidAction == null)
        {
            i = 0;
        } else
        {
            i = androidAction.hashCode();
        }
        if (iosAction != null)
        {
            j = iosAction.Code();
        }
        return (((k + 527) * 31 + l) * 31 + i) * 31 + j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 56
    //                   8: 58
    //                   18: 103
    //                   26: 132;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            actionType = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (androidAction == null)
        {
            androidAction = new <init>();
        }
        codedinputbytebuffernano.readMessage(androidAction);
        continue; /* Loop/switch isn't completed */
_L5:
        if (iosAction == null)
        {
            iosAction = new t>();
        }
        codedinputbytebuffernano.readMessage(iosAction);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (actionType != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, actionType);
        }
        if (androidAction != null)
        {
            codedoutputbytebuffernano.writeMessage(2, androidAction);
        }
        if (iosAction != null)
        {
            codedoutputbytebuffernano.writeMessage(3, iosAction);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        actionType = 0;
        androidAction = null;
        iosAction = null;
        cachedSize = -1;
    }
}
