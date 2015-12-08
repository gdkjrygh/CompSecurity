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
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile g _emptyArray[];
    public String credit;
    public int creditType;
    public boolean hasCredit;
    public boolean hasCreditType;
    public String name[];

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
        int k;
label0:
        {
            int i = super.computeSerializedSize();
            if (creditType == 0)
            {
                k = i;
                if (!hasCreditType)
                {
                    break label0;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(1, creditType);
        }
        int j;
label1:
        {
            if (!hasCredit)
            {
                j = k;
                if (credit.equals(""))
                {
                    break label1;
                }
            }
            j = k + CodedOutputByteBufferNano.computeStringSize(2, credit);
        }
        k = j;
        if (name != null)
        {
            k = j;
            if (name.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (k = 0; k < name.length;)
                {
                    String s = name[k];
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

                k = j + l + j1 * 1;
            }
        }
        return k;
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
    //                   18: 112
    //                   26: 128;
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
        case 3: // '\003'
            creditType = j;
            hasCreditType = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        credit = codedinputbytebuffernano.readString();
        hasCredit = true;
        continue; /* Loop/switch isn't completed */
_L5:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        String as[];
        int k;
        if (name == null)
        {
            k = 0;
        } else
        {
            k = name.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(name, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l] = codedinputbytebuffernano.readString();
        name = as;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (creditType != 0 || hasCreditType)
        {
            codedoutputbytebuffernano.writeInt32(1, creditType);
        }
        if (hasCredit || !credit.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, credit);
        }
        if (name != null && name.length > 0)
        {
            for (int i = 0; i < name.length; i++)
            {
                String s = name[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        creditType = 0;
        hasCreditType = false;
        credit = "";
        hasCredit = false;
        name = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
