// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletLoyalty

public static final class clear extends ExtendableMessageNano
{

    private static volatile programs _emptyArray[];
    public Integer orientation;
    public programs programs[];
    public String title;

    private clear clear()
    {
        title = null;
        orientation = null;
        programs = programs();
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
_L6:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   16: 70
    //                   26: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        title = codedinputbytebuffernano.readString();
          goto _L6
_L4:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
            orientation = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        _emptyArray a_lemptyarray[];
        int k;
        if (programs == null)
        {
            k = 0;
        } else
        {
            k = programs.length;
        }
        a_lemptyarray = new programs[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(programs, 0, a_lemptyarray, 0, k);
            l = k;
        }
        for (; l < a_lemptyarray.length - 1; l++)
        {
            a_lemptyarray[l] = new programs();
            codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
            codedinputbytebuffernano.readTag();
        }

        a_lemptyarray[l] = new programs();
        codedinputbytebuffernano.readMessage(a_lemptyarray[l]);
        programs = a_lemptyarray;
        if (true) goto _L6; else goto _L7
_L7:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(1, title);
        }
        i = j;
        if (orientation != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(2, orientation.intValue());
        }
        int l = i;
        if (programs != null)
        {
            l = i;
            if (programs.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= programs.length)
                    {
                        break;
                    }
                    programs programs1 = programs[k];
                    l = i;
                    if (programs1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.computeMessageSize(3, programs1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(1, title);
        }
        if (orientation != null)
        {
            codedoutputbytebuffernano.writeInt32(2, orientation.intValue());
        }
        if (programs != null && programs.length > 0)
        {
            for (int i = 0; i < programs.length; i++)
            {
                mergeFrom mergefrom = programs[i];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, mergefrom);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
