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

    private static volatile prefilledBarcode _emptyArray[];
    public Integer fieldType;
    public Boolean isRequired;
    public String label;
    public Boolean modifiableByUser;
    public com.google.wallet.proto.mpt prefilledBarcode;
    public com.google.wallet.proto.Money prefilledMoney;
    public Integer prefilledProgramIcon;
    public String prefilledValue;
    public Integer promptId;

    private clear clear()
    {
        promptId = null;
        fieldType = null;
        label = null;
        prefilledValue = null;
        prefilledMoney = null;
        prefilledProgramIcon = null;
        prefilledBarcode = null;
        modifiableByUser = null;
        isRequired = null;
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
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 121
    //                   26: 178
    //                   34: 189
    //                   42: 200
    //                   48: 229
    //                   56: 243
    //                   64: 257
    //                   74: 338;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        promptId = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L12
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
            fieldType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        label = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L6:
        prefilledValue = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L7:
        if (prefilledMoney == null)
        {
            prefilledMoney = new com.google.wallet.proto.Money();
        }
        codedinputbytebuffernano.readMessage(prefilledMoney);
        continue; /* Loop/switch isn't completed */
_L8:
        modifiableByUser = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L9:
        isRequired = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L10:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 1: // '\001'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            prefilledProgramIcon = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (prefilledBarcode == null)
        {
            prefilledBarcode = new com.google.wallet.proto.it>();
        }
        codedinputbytebuffernano.readMessage(prefilledBarcode);
        if (true) goto _L12; else goto _L13
_L13:
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
        if (fieldType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, fieldType.intValue());
        }
        i = j;
        if (label != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, label);
        }
        j = i;
        if (prefilledValue != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, prefilledValue);
        }
        i = j;
        if (prefilledMoney != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, prefilledMoney);
        }
        j = i;
        if (modifiableByUser != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(6, modifiableByUser.booleanValue());
        }
        i = j;
        if (isRequired != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(7, isRequired.booleanValue());
        }
        j = i;
        if (prefilledProgramIcon != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, prefilledProgramIcon.intValue());
        }
        i = j;
        if (prefilledBarcode != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, prefilledBarcode);
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
        if (promptId != null)
        {
            codedoutputbytebuffernano.writeInt32(1, promptId.intValue());
        }
        if (fieldType != null)
        {
            codedoutputbytebuffernano.writeInt32(2, fieldType.intValue());
        }
        if (label != null)
        {
            codedoutputbytebuffernano.writeString(3, label);
        }
        if (prefilledValue != null)
        {
            codedoutputbytebuffernano.writeString(4, prefilledValue);
        }
        if (prefilledMoney != null)
        {
            codedoutputbytebuffernano.writeMessage(5, prefilledMoney);
        }
        if (modifiableByUser != null)
        {
            codedoutputbytebuffernano.writeBool(6, modifiableByUser.booleanValue());
        }
        if (isRequired != null)
        {
            codedoutputbytebuffernano.writeBool(7, isRequired.booleanValue());
        }
        if (prefilledProgramIcon != null)
        {
            codedoutputbytebuffernano.writeInt32(8, prefilledProgramIcon.intValue());
        }
        if (prefilledBarcode != null)
        {
            codedoutputbytebuffernano.writeMessage(9, prefilledBarcode);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public y()
    {
        clear();
    }
}
