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
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{

    private static volatile notificationTrackingLabel _emptyArray[];
    public String destinationUri[];
    public Integer icon;
    public String notificationTrackingLabel;
    public String title;

    private clear clear()
    {
        icon = null;
        title = null;
        destinationUri = WireFormatNano.EMPTY_STRING_ARRAY;
        notificationTrackingLabel = null;
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
_L7:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 118
    //                   26: 129
    //                   34: 231;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            icon = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        title = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
        String as[];
        int k;
        if (destinationUri == null)
        {
            k = 0;
        } else
        {
            k = destinationUri.length;
        }
        as = new String[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(destinationUri, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l] = codedinputbytebuffernano.readString();
        destinationUri = as;
        continue; /* Loop/switch isn't completed */
_L6:
        notificationTrackingLabel = codedinputbytebuffernano.readString();
        if (true) goto _L7; else goto _L8
_L8:
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (icon != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(1, icon.intValue());
        }
        i = j;
        if (title != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        j = i;
        if (destinationUri != null)
        {
            j = i;
            if (destinationUri.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < destinationUri.length;)
                {
                    String s = destinationUri[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (notificationTrackingLabel != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(4, notificationTrackingLabel);
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
        if (icon != null)
        {
            codedoutputbytebuffernano.writeInt32(1, icon.intValue());
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (destinationUri != null && destinationUri.length > 0)
        {
            for (int i = 0; i < destinationUri.length; i++)
            {
                String s = destinationUri[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(3, s);
                }
            }

        }
        if (notificationTrackingLabel != null)
        {
            codedoutputbytebuffernano.writeString(4, notificationTrackingLabel);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
