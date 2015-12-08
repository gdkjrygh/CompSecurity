// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{

    public Boolean light;
    public Boolean sound;
    public Integer soundType;
    public Boolean vibrate;

    private clear clear()
    {
        light = null;
        vibrate = null;
        sound = null;
        soundType = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 81
    //                   24: 95
    //                   32: 109;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        light = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L7
_L4:
        vibrate = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L7
_L5:
        sound = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L7
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            soundType = Integer.valueOf(j);
            break;
        }
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (light != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(1, light.booleanValue());
        }
        j = i;
        if (vibrate != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(2, vibrate.booleanValue());
        }
        i = j;
        if (sound != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, sound.booleanValue());
        }
        j = i;
        if (soundType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, soundType.intValue());
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
        if (light != null)
        {
            codedoutputbytebuffernano.writeBool(1, light.booleanValue());
        }
        if (vibrate != null)
        {
            codedoutputbytebuffernano.writeBool(2, vibrate.booleanValue());
        }
        if (sound != null)
        {
            codedoutputbytebuffernano.writeBool(3, sound.booleanValue());
        }
        if (soundType != null)
        {
            codedoutputbytebuffernano.writeInt32(4, soundType.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
