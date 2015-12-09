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
    public r registerAction;
    public ter unregisterAction;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (actionType != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
        }
        j = i;
        if (registerAction != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, registerAction);
        }
        i = j;
        if (unregisterAction != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, unregisterAction);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof unregisterAction))
        {
            return false;
        }
        obj = (unregisterAction)obj;
        if (actionType != ((actionType) (obj)).actionType)
        {
            return false;
        }
        if (registerAction == null)
        {
            if (((registerAction) (obj)).registerAction != null)
            {
                return false;
            }
        } else
        if (!registerAction.equals(((r.equals) (obj)).registerAction))
        {
            return false;
        }
        if (unregisterAction != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((unregisterAction) (obj)).unregisterAction == null) goto _L1; else goto _L3
_L3:
        return false;
        if (unregisterAction.equals(((ter.equals) (obj)).unregisterAction)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int j = 0;
        int k = getClass().getName().hashCode();
        int l = actionType;
        int i;
        if (registerAction == null)
        {
            i = 0;
        } else
        {
            i = registerAction.hashCode();
        }
        if (unregisterAction != null)
        {
            j = unregisterAction.hashCode();
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
        if (registerAction == null)
        {
            registerAction = new r();
        }
        codedinputbytebuffernano.readMessage(registerAction);
        continue; /* Loop/switch isn't completed */
_L5:
        if (unregisterAction == null)
        {
            unregisterAction = new ter();
        }
        codedinputbytebuffernano.readMessage(unregisterAction);
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
        if (registerAction != null)
        {
            codedoutputbytebuffernano.writeMessage(2, registerAction);
        }
        if (unregisterAction != null)
        {
            codedoutputbytebuffernano.writeMessage(3, unregisterAction);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ter()
    {
        actionType = 0;
        registerAction = null;
        unregisterAction = null;
        cachedSize = -1;
    }
}
