// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletWobForms

public static final class clear extends ExtendableMessageNano
{

    private static volatile barcode _emptyArray[];
    public com.google.wallet.proto.lue barcode;
    public Boolean delete;
    public com.google.wallet.proto. moneyValue;
    public Integer programIcon;
    public Integer promptId;
    public String textValue;

    private clear clear()
    {
        promptId = null;
        textValue = null;
        moneyValue = null;
        programIcon = null;
        barcode = null;
        delete = null;
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
    //                   8: 83
    //                   18: 97
    //                   26: 108
    //                   32: 137
    //                   40: 218
    //                   50: 232;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L9
_L4:
        textValue = codedinputbytebuffernano.readString();
          goto _L9
_L5:
        if (moneyValue == null)
        {
            moneyValue = new com.google.wallet.proto.();
        }
        codedinputbytebuffernano.readMessage(moneyValue);
          goto _L9
_L6:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            programIcon = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        delete = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L8:
        if (barcode == null)
        {
            barcode = new com.google.wallet.proto.nit>();
        }
        codedinputbytebuffernano.readMessage(barcode);
        if (true) goto _L9; else goto _L10
_L10:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (promptId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, promptId.intValue());
        }
        j = i;
        if (textValue != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, textValue);
        }
        i = j;
        if (moneyValue != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, moneyValue);
        }
        j = i;
        if (programIcon != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(4, programIcon.intValue());
        }
        i = j;
        if (delete != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(5, delete.booleanValue());
        }
        j = i;
        if (barcode != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(6, barcode);
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
        if (promptId != null)
        {
            codedoutputbytebuffernano.writeInt32(1, promptId.intValue());
        }
        if (textValue != null)
        {
            codedoutputbytebuffernano.writeString(2, textValue);
        }
        if (moneyValue != null)
        {
            codedoutputbytebuffernano.writeMessage(3, moneyValue);
        }
        if (programIcon != null)
        {
            codedoutputbytebuffernano.writeInt32(4, programIcon.intValue());
        }
        if (delete != null)
        {
            codedoutputbytebuffernano.writeBool(5, delete.booleanValue());
        }
        if (barcode != null)
        {
            codedoutputbytebuffernano.writeMessage(6, barcode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
