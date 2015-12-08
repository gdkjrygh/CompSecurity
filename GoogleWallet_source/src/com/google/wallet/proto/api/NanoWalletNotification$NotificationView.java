// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletNotification

public static final class clear extends ExtendableMessageNano
{

    public digestView digestView;
    public ators indicators;
    public String largeIconUri;
    public Long notificationTimeMillis;
    public n primaryAction;
    public n secondaryAction[];
    public Integer smallIcon;
    public String text;
    public String ticker;
    public String title;

    private clear clear()
    {
        notificationTimeMillis = null;
        title = null;
        text = null;
        ticker = null;
        indicators = null;
        smallIcon = null;
        largeIconUri = null;
        primaryAction = null;
        secondaryAction = n.emptyArray();
        digestView = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L13:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   8: 115
    //                   18: 129
    //                   26: 140
    //                   34: 151
    //                   42: 162
    //                   48: 191
    //                   58: 242
    //                   66: 253
    //                   74: 282
    //                   82: 406;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        notificationTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L13
_L4:
        title = codedinputbytebuffernano.readString();
          goto _L13
_L5:
        text = codedinputbytebuffernano.readString();
          goto _L13
_L6:
        ticker = codedinputbytebuffernano.readString();
          goto _L13
_L7:
        if (indicators == null)
        {
            indicators = new ators();
        }
        codedinputbytebuffernano.readMessage(indicators);
          goto _L13
_L8:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            smallIcon = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        largeIconUri = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        if (primaryAction == null)
        {
            primaryAction = new n();
        }
        codedinputbytebuffernano.readMessage(primaryAction);
        continue; /* Loop/switch isn't completed */
_L11:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 74);
        n an[];
        int k;
        if (secondaryAction == null)
        {
            k = 0;
        } else
        {
            k = secondaryAction.length;
        }
        an = new n[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(secondaryAction, 0, an, 0, k);
            l = k;
        }
        for (; l < an.length - 1; l++)
        {
            an[l] = new n();
            codedinputbytebuffernano.readMessage(an[l]);
            codedinputbytebuffernano.readTag();
        }

        an[l] = new n();
        codedinputbytebuffernano.readMessage(an[l]);
        secondaryAction = an;
        continue; /* Loop/switch isn't completed */
_L12:
        if (digestView == null)
        {
            digestView = new ();
        }
        codedinputbytebuffernano.readMessage(digestView);
        if (true) goto _L13; else goto _L14
_L14:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (notificationTimeMillis != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(1, notificationTimeMillis.longValue());
        }
        j = i;
        if (title != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
        i = j;
        if (text != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, text);
        }
        j = i;
        if (ticker != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, ticker);
        }
        i = j;
        if (indicators != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, indicators);
        }
        j = i;
        if (smallIcon != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(6, smallIcon.intValue());
        }
        int k = j;
        if (largeIconUri != null)
        {
            k = j + CodedOutputByteBufferNano.computeStringSize(7, largeIconUri);
        }
        i = k;
        if (primaryAction != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(8, primaryAction);
        }
        j = i;
        if (secondaryAction != null)
        {
            j = i;
            if (secondaryAction.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= secondaryAction.length)
                    {
                        break;
                    }
                    n n = secondaryAction[l];
                    j = i;
                    if (n != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(9, n);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (digestView != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(10, digestView);
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
        if (notificationTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(1, notificationTimeMillis.longValue());
        }
        if (title != null)
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (text != null)
        {
            codedoutputbytebuffernano.writeString(3, text);
        }
        if (ticker != null)
        {
            codedoutputbytebuffernano.writeString(4, ticker);
        }
        if (indicators != null)
        {
            codedoutputbytebuffernano.writeMessage(5, indicators);
        }
        if (smallIcon != null)
        {
            codedoutputbytebuffernano.writeInt32(6, smallIcon.intValue());
        }
        if (largeIconUri != null)
        {
            codedoutputbytebuffernano.writeString(7, largeIconUri);
        }
        if (primaryAction != null)
        {
            codedoutputbytebuffernano.writeMessage(8, primaryAction);
        }
        if (secondaryAction != null && secondaryAction.length > 0)
        {
            for (int i = 0; i < secondaryAction.length; i++)
            {
                n n = secondaryAction[i];
                if (n != null)
                {
                    codedoutputbytebuffernano.writeMessage(9, n);
                }
            }

        }
        if (digestView != null)
        {
            codedoutputbytebuffernano.writeMessage(10, digestView);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public n()
    {
        clear();
    }
}
