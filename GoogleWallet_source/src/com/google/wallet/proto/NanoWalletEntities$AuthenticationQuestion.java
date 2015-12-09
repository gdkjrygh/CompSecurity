// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletEntities

public static final class clear extends ExtendableMessageNano
{

    private static volatile questionType _emptyArray[];
    public String description;
    public String displayText;
    public String id;
    public Integer maxAnswerLength;
    public Integer minAnswerLength;
    public Integer questionType;

    private clear clear()
    {
        id = null;
        displayText = null;
        description = null;
        maxAnswerLength = null;
        minAnswerLength = null;
        questionType = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
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

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L9:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 94
    //                   26: 105
    //                   32: 116
    //                   40: 130
    //                   48: 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        id = codedinputbytebuffernano.readString();
          goto _L9
_L4:
        displayText = codedinputbytebuffernano.readString();
          goto _L9
_L5:
        description = codedinputbytebuffernano.readString();
          goto _L9
_L6:
        maxAnswerLength = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L9
_L7:
        minAnswerLength = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L9
_L8:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            questionType = Integer.valueOf(j);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (id != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, id);
        }
        j = i;
        if (displayText != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, displayText);
        }
        i = j;
        if (description != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, description);
        }
        j = i;
        if (maxAnswerLength != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, maxAnswerLength.intValue());
        }
        i = j;
        if (minAnswerLength != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, minAnswerLength.intValue());
        }
        j = i;
        if (questionType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, questionType.intValue());
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
        if (id != null)
        {
            codedoutputbytebuffernano.writeString(1, id);
        }
        if (displayText != null)
        {
            codedoutputbytebuffernano.writeString(2, displayText);
        }
        if (description != null)
        {
            codedoutputbytebuffernano.writeString(3, description);
        }
        if (maxAnswerLength != null)
        {
            codedoutputbytebuffernano.writeInt32(4, maxAnswerLength.intValue());
        }
        if (minAnswerLength != null)
        {
            codedoutputbytebuffernano.writeInt32(5, minAnswerLength.intValue());
        }
        if (questionType != null)
        {
            codedoutputbytebuffernano.writeInt32(6, questionType.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
