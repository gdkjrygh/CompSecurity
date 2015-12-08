// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            FilterRules

public static final class cachedSize extends MessageNano
{

    private static volatile missingValue _emptyArray[];
    public boolean hasProblemType;
    public String missingValue[];
    public int problemType;

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

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (problemType == 1)
            {
                i = j;
                if (!hasProblemType)
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, problemType);
        }
        int k = i;
        if (missingValue != null)
        {
            k = i;
            if (missingValue.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (k = 0; k < missingValue.length;)
                {
                    String s = missingValue[k];
                    int k1 = j1;
                    int i1 = l;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    k++;
                    j1 = k1;
                    l = i1;
                }

                k = i + l + j1 * 1;
            }
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L5:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 48
    //                   8: 50
    //                   18: 120;
           goto _L1 _L2 _L3 _L4
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            problemType = j;
            hasProblemType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        String as[];
        int k;
        if (missingValue == null)
        {
            k = 0;
        } else
        {
            k = missingValue.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(missingValue, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l] = codedinputbytebuffernano.readString();
        missingValue = as;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (problemType != 1 || hasProblemType)
        {
            codedoutputbytebuffernano.writeInt32(1, problemType);
        }
        if (missingValue != null && missingValue.length > 0)
        {
            for (int i = 0; i < missingValue.length; i++)
            {
                String s = missingValue[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(2, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        problemType = 1;
        hasProblemType = false;
        missingValue = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
